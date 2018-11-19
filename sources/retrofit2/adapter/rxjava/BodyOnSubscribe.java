package retrofit2.adapter.rxjava;

import retrofit2.Response;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.exceptions.C19410a;
import rx.exceptions.CompositeException;
import rx.p498c.C19403f;

final class BodyOnSubscribe<T> implements OnSubscribe<T> {
    private final OnSubscribe<Response<T>> upstream;

    private static class BodySubscriber<R> extends C19571c<Response<R>> {
        private final C19571c<? super R> subscriber;
        private boolean subscriberTerminated;

        BodySubscriber(C19571c<? super R> c19571c) {
            super(c19571c);
            this.subscriber = c19571c;
        }

        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.subscriber.onNext(response.body());
                return;
            }
            this.subscriberTerminated = true;
            try {
                this.subscriber.onError(new HttpException(response));
            } catch (Throwable e) {
                C19403f.m69828a().m69829b().m69798a(e);
            } catch (Response<R> response2) {
                C19410a.m69874b(response2);
                C19403f.m69828a().m69829b().m69798a(new CompositeException(r1, response2));
            }
        }

        public void onError(Throwable th) {
            if (this.subscriberTerminated) {
                Throwable assertionError = new AssertionError("This should never happen! Report as a Retrofit bug with the full stacktrace.");
                assertionError.initCause(th);
                C19403f.m69828a().m69829b().m69798a(assertionError);
                return;
            }
            this.subscriber.onError(th);
        }

        public void onCompleted() {
            if (!this.subscriberTerminated) {
                this.subscriber.onCompleted();
            }
        }
    }

    BodyOnSubscribe(OnSubscribe<Response<T>> onSubscribe) {
        this.upstream = onSubscribe;
    }

    public void call(C19571c<? super T> c19571c) {
        this.upstream.call(new BodySubscriber(c19571c));
    }
}
