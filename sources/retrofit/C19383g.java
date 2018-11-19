package retrofit;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.p500e.C19407e;

/* renamed from: retrofit.g */
final class C19383g {
    /* renamed from: a */
    private final Executor f60516a;
    /* renamed from: b */
    private final ErrorHandler f60517b;
    /* renamed from: c */
    private final RequestInterceptor f60518c;

    /* renamed from: retrofit.g$a */
    interface C19382a {
        /* renamed from: a */
        C19380f mo14642a(RequestInterceptor requestInterceptor);
    }

    C19383g(Executor executor, ErrorHandler errorHandler, RequestInterceptor requestInterceptor) {
        this.f60516a = executor;
        this.f60517b = errorHandler;
        this.f60518c = requestInterceptor;
    }

    /* renamed from: a */
    Observable m69572a(final C19382a c19382a) {
        return Observable.m69620a(new OnSubscribe<Object>(this) {
            /* renamed from: b */
            final /* synthetic */ C19383g f62162b;

            public /* synthetic */ void call(Object obj) {
                m71542a((C19571c) obj);
            }

            /* renamed from: a */
            public void m71542a(C19571c<? super Object> c19571c) {
                Object requestInterceptorTape = new RequestInterceptorTape();
                this.f62162b.f60518c.intercept(requestInterceptorTape);
                Future futureTask = new FutureTask(this.f62162b.m69568a(c19571c, c19382a, requestInterceptorTape), null);
                c19571c.add(C19407e.m69853a(futureTask));
                this.f62162b.f60516a.execute(futureTask);
            }
        });
    }

    /* renamed from: a */
    private Runnable m69568a(final C19571c<? super Object> c19571c, final C19382a c19382a, final RequestInterceptorTape requestInterceptorTape) {
        return new Runnable(this) {
            /* renamed from: d */
            final /* synthetic */ C19383g f60515d;

            public void run() {
                try {
                    if (!c19571c.isUnsubscribed()) {
                        c19571c.onNext(c19382a.mo14642a(requestInterceptorTape).f60511b);
                        c19571c.onCompleted();
                    }
                } catch (RetrofitError e) {
                    c19571c.onError(this.f60515d.f60517b.handleError(e));
                }
            }
        };
    }
}
