package retrofit2.adapter.rxjava;

import retrofit2.Response;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.exceptions.C19410a;
import rx.exceptions.CompositeException;
import rx.p498c.C19403f;

final class ResultOnSubscribe<T> implements OnSubscribe<Result<T>> {
    private final OnSubscribe<Response<T>> upstream;

    private static class ResultSubscriber<R> extends C19571c<Response<R>> {
        private final C19571c<? super Result<R>> subscriber;

        ResultSubscriber(C19571c<? super Result<R>> c19571c) {
            super(c19571c);
            this.subscriber = c19571c;
        }

        public void onNext(Response<R> response) {
            this.subscriber.onNext(Result.response(response));
        }

        public void onError(Throwable th) {
            try {
                this.subscriber.onNext(Result.error(th));
                this.subscriber.onCompleted();
            } catch (Throwable th2) {
                try {
                    this.subscriber.onError(th2);
                } catch (Throwable th22) {
                    C19403f.m69828a().m69829b().m69798a(th22);
                } catch (Throwable th3) {
                    C19410a.m69874b(th3);
                    C19403f.m69828a().m69829b().m69798a(new CompositeException(th22, th3));
                }
            }
        }

        public void onCompleted() {
            this.subscriber.onCompleted();
        }
    }

    ResultOnSubscribe(OnSubscribe<Response<T>> onSubscribe) {
        this.upstream = onSubscribe;
    }

    public void call(C19571c<? super Result<T>> c19571c) {
        this.upstream.call(new ResultSubscriber(c19571c));
    }
}
