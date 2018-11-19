package retrofit2.adapter.rxjava2;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.p079d.C2667a;
import retrofit2.Response;

final class BodyObservable<T> extends C3959e<T> {
    private final C3959e<Response<T>> upstream;

    private static class BodyObserver<R> implements Observer<Response<R>> {
        private final Observer<? super R> observer;
        private boolean terminated;

        BodyObserver(Observer<? super R> observer) {
            this.observer = observer;
        }

        public void onSubscribe(Disposable disposable) {
            this.observer.onSubscribe(disposable);
        }

        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.observer.onNext(response.body());
                return;
            }
            this.terminated = true;
            try {
                this.observer.onError(new HttpException(response));
            } catch (Response<R> response2) {
                C15678a.b(response2);
                C2667a.a(new CompositeException(new Throwable[]{r1, response2}));
            }
        }

        public void onComplete() {
            if (!this.terminated) {
                this.observer.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.terminated) {
                Throwable assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
                assertionError.initCause(th);
                C2667a.a(assertionError);
                return;
            }
            this.observer.onError(th);
        }
    }

    BodyObservable(C3959e<Response<T>> c3959e) {
        this.upstream = c3959e;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.upstream.subscribe(new BodyObserver(observer));
    }
}
