package retrofit2.adapter.rxjava2;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.p079d.C2667a;
import retrofit2.Call;
import retrofit2.Response;

final class CallExecuteObservable<T> extends C3959e<Response<T>> {
    private final Call<T> originalCall;

    private static final class CallDisposable implements Disposable {
        private final Call<?> call;

        CallDisposable(Call<?> call) {
            this.call = call;
        }

        public void dispose() {
            this.call.cancel();
        }

        public boolean isDisposed() {
            return this.call.isCanceled();
        }
    }

    CallExecuteObservable(Call<T> call) {
        this.originalCall = call;
    }

    protected void subscribeActual(Observer<? super Response<T>> observer) {
        Throwable th;
        Object obj;
        Call clone = this.originalCall.clone();
        observer.onSubscribe(new CallDisposable(clone));
        try {
            Response execute = clone.execute();
            if (!clone.isCanceled()) {
                observer.onNext(execute);
            }
            if (!clone.isCanceled()) {
                try {
                    observer.onComplete();
                } catch (Throwable th2) {
                    th = th2;
                    obj = 1;
                    C15678a.b(th);
                    if (obj != null) {
                        C2667a.a(th);
                    } else if (!clone.isCanceled()) {
                        try {
                            observer.onError(th);
                        } catch (Observer<? super Response<T>> observer2) {
                            C15678a.b(observer2);
                            C2667a.a(new CompositeException(new Throwable[]{th, observer2}));
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            obj = null;
            C15678a.b(th);
            if (obj != null) {
                C2667a.a(th);
            } else if (!clone.isCanceled()) {
                observer2.onError(th);
            }
        }
    }
}
