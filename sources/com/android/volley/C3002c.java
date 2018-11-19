package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.android.volley.c */
public class C3002c implements ResponseDelivery {
    /* renamed from: a */
    private final Executor f9333a;

    /* renamed from: com.android.volley.c$a */
    private class C0906a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3002c f2370a;
        /* renamed from: b */
        private final Request f2371b;
        /* renamed from: c */
        private final Response f2372c;
        /* renamed from: d */
        private final Runnable f2373d;

        public C0906a(C3002c c3002c, Request request, Response response, Runnable runnable) {
            this.f2370a = c3002c;
            this.f2371b = request;
            this.f2372c = response;
            this.f2373d = runnable;
        }

        public void run() {
            if (this.f2371b.isCanceled()) {
                this.f2371b.finish("canceled-at-delivery");
                return;
            }
            if (this.f2372c.m3043a()) {
                this.f2371b.deliverResponse(this.f2372c.f2354a);
            } else {
                this.f2371b.deliverError(this.f2372c.f2356c);
            }
            if (this.f2372c.f2357d) {
                this.f2371b.addMarker("intermediate-response");
            } else {
                this.f2371b.finish("done");
            }
            if (this.f2373d != null) {
                this.f2373d.run();
            }
        }
    }

    public C3002c(final Handler handler) {
        this.f9333a = new Executor(this) {
            /* renamed from: b */
            final /* synthetic */ C3002c f2369b;

            public void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public void postResponse(Request<?> request, Response<?> response) {
        postResponse(request, response, null);
    }

    public void postResponse(Request<?> request, Response<?> response, Runnable runnable) {
        request.markDelivered();
        request.addMarker("post-response");
        this.f9333a.execute(new C0906a(this, request, response, runnable));
    }

    public void postError(Request<?> request, VolleyError volleyError) {
        request.addMarker("post-error");
        this.f9333a.execute(new C0906a(this, request, Response.m3041a(volleyError), null));
    }
}
