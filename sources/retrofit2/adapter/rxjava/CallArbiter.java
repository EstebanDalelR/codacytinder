package retrofit2.adapter.rxjava;

import java.util.concurrent.atomic.AtomicInteger;
import retrofit2.Call;
import retrofit2.Response;
import rx.C19571c;
import rx.Producer;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.exceptions.CompositeException;
import rx.p498c.C19403f;

final class CallArbiter<T> extends AtomicInteger implements Producer, Subscription {
    private static final int STATE_HAS_RESPONSE = 2;
    private static final int STATE_REQUESTED = 1;
    private static final int STATE_TERMINATED = 3;
    private static final int STATE_WAITING = 0;
    private final Call<T> call;
    private volatile Response<T> response;
    private final C19571c<? super Response<T>> subscriber;

    CallArbiter(Call<T> call, C19571c<? super Response<T>> c19571c) {
        super(0);
        this.call = call;
        this.subscriber = c19571c;
    }

    public void unsubscribe() {
        this.call.cancel();
    }

    public boolean isUnsubscribed() {
        return this.call.isCanceled();
    }

    public void request(long j) {
        if (j != 0) {
            while (true) {
                j = get();
                switch (j) {
                    case 0:
                        if (compareAndSet(0, 1) == null) {
                            break;
                        }
                        return;
                    case 1:
                    case 3:
                        return;
                    case 2:
                        if (compareAndSet(2, 3) == null) {
                            break;
                        }
                        deliverResponse(this.response);
                        return;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown state: ");
                        stringBuilder.append(j);
                        throw new IllegalStateException(stringBuilder.toString());
                }
            }
        }
    }

    void emitResponse(Response<T> response) {
        while (true) {
            int i = get();
            switch (i) {
                case 0:
                    this.response = response;
                    if (!compareAndSet(0, 2)) {
                        break;
                    }
                    return;
                case 1:
                    if (!compareAndSet(1, 3)) {
                        break;
                    }
                    deliverResponse(response);
                    return;
                case 2:
                case 3:
                    throw new AssertionError();
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown state: ");
                    stringBuilder.append(i);
                    throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private void deliverResponse(Response<T> response) {
        try {
            if (!isUnsubscribed()) {
                this.subscriber.onNext(response);
            }
            try {
                if (isUnsubscribed() == null) {
                    this.subscriber.onCompleted();
                }
            } catch (Throwable e) {
                C19403f.m69828a().m69829b().m69798a(e);
            } catch (Throwable e2) {
                C19410a.m69874b(e2);
                C19403f.m69828a().m69829b().m69798a(e2);
            }
        } catch (Throwable e22) {
            C19403f.m69828a().m69829b().m69798a(e22);
        } catch (Response<T> response2) {
            C19410a.m69874b(response2);
            try {
                this.subscriber.onError(response2);
            } catch (Throwable e222) {
                C19403f.m69828a().m69829b().m69798a(e222);
            } catch (Throwable th) {
                C19410a.m69874b(th);
                C19403f.m69828a().m69829b().m69798a(new CompositeException(response2, th));
            }
        }
    }

    void emitError(Throwable th) {
        set(3);
        if (!isUnsubscribed()) {
            try {
                this.subscriber.onError(th);
            } catch (Throwable th2) {
                C19403f.m69828a().m69829b().m69798a(th2);
            } catch (Throwable th3) {
                C19410a.m69874b(th3);
                C19403f.m69828a().m69829b().m69798a(new CompositeException(th2, th3));
            }
        }
    }
}
