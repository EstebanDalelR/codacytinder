package retrofit2.adapter.rxjava2;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.p079d.C2667a;
import retrofit2.Response;

final class ResultObservable<T> extends C3959e<Result<T>> {
    private final C3959e<Response<T>> upstream;

    private static class ResultObserver<R> implements Observer<Response<R>> {
        private final Observer<? super Result<R>> observer;

        ResultObserver(Observer<? super Result<R>> observer) {
            this.observer = observer;
        }

        public void onSubscribe(Disposable disposable) {
            this.observer.onSubscribe(disposable);
        }

        public void onNext(Response<R> response) {
            this.observer.onNext(Result.response(response));
        }

        public void onError(Throwable th) {
            try {
                this.observer.onNext(Result.error(th));
                this.observer.onComplete();
            } catch (Throwable th2) {
                C15678a.b(th2);
                C2667a.a(new CompositeException(new Throwable[]{th, th2}));
            }
        }

        public void onComplete() {
            this.observer.onComplete();
        }
    }

    ResultObservable(C3959e<Response<T>> c3959e) {
        this.upstream = c3959e;
    }

    protected void subscribeActual(Observer<? super Result<T>> observer) {
        this.upstream.subscribe(new ResultObserver(observer));
    }
}
