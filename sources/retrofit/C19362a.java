package retrofit;

import java.util.concurrent.Executor;

/* renamed from: retrofit.a */
abstract class C19362a<T> implements Runnable {
    /* renamed from: a */
    private final Callback<T> f60482a;
    /* renamed from: b */
    private final Executor f60483b;
    /* renamed from: c */
    private final ErrorHandler f60484c;

    /* renamed from: a */
    public abstract C19380f mo14643a();

    C19362a(Callback<T> callback, Executor executor, ErrorHandler errorHandler) {
        this.f60482a = callback;
        this.f60483b = executor;
        this.f60484c = errorHandler;
    }

    public final void run() {
        try {
            final C19380f a = mo14643a();
            this.f60483b.execute(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C19362a f60478b;

                public void run() {
                    this.f60478b.f60482a.success(a.f60511b, a.f60510a);
                }
            });
        } catch (RetrofitError e) {
            RetrofitError e2 = e;
            Throwable handleError = this.f60484c.handleError(e2);
            if (handleError != e2) {
                e2 = RetrofitError.m69534a(e2.m69537a(), handleError);
            }
            this.f60483b.execute(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C19362a f60480b;

                public void run() {
                    this.f60480b.f60482a.failure(e2);
                }
            });
        }
    }
}
