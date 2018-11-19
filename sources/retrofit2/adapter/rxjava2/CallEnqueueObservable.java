package retrofit2.adapter.rxjava2;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.p079d.C2667a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

final class CallEnqueueObservable<T> extends C3959e<Response<T>> {
    private final Call<T> originalCall;

    private static final class CallCallback<T> implements Disposable, Callback<T> {
        private final Call<?> call;
        private final Observer<? super Response<T>> observer;
        boolean terminated = false;

        CallCallback(Call<?> call, Observer<? super Response<T>> observer) {
            this.call = call;
            this.observer = observer;
        }

        public void onResponse(Call<T> call, Response<T> response) {
            if (!call.isCanceled()) {
                try {
                    this.observer.onNext(response);
                    if (call.isCanceled() == null) {
                        this.terminated = true;
                        this.observer.onComplete();
                    }
                } catch (Call<T> call2) {
                    C15678a.b(call2);
                    C2667a.a(new CompositeException(new Throwable[]{response, call2}));
                }
            }
        }

        public void onFailure(Call<T> call, Throwable th) {
            if (call.isCanceled() == null) {
                try {
                    this.observer.onError(th);
                } catch (Call<T> call2) {
                    C15678a.b(call2);
                    C2667a.a(new CompositeException(new Throwable[]{th, call2}));
                }
            }
        }

        public void dispose() {
            this.call.cancel();
        }

        public boolean isDisposed() {
            return this.call.isCanceled();
        }
    }

    CallEnqueueObservable(Call<T> call) {
        this.originalCall = call;
    }

    protected void subscribeActual(Observer<? super Response<T>> observer) {
        Call clone = this.originalCall.clone();
        Object callCallback = new CallCallback(clone, observer);
        observer.onSubscribe(callCallback);
        clone.enqueue(callCallback);
    }
}
