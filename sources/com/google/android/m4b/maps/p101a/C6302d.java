package com.google.android.m4b.maps.p101a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.m4b.maps.a.d */
public final class C6302d implements C4530n {
    /* renamed from: a */
    private final Executor f23622a;

    /* renamed from: com.google.android.m4b.maps.a.d$a */
    class C4519a implements Runnable {
        /* renamed from: a */
        private final C4525k f16787a;
        /* renamed from: b */
        private final C4529m f16788b;
        /* renamed from: c */
        private final Runnable f16789c;
        /* renamed from: d */
        private /* synthetic */ C6302d f16790d;

        public C4519a(C6302d c6302d, C4525k c4525k, C4529m c4529m, Runnable runnable) {
            this.f16790d = c6302d;
            this.f16787a = c4525k;
            this.f16788b = c4529m;
            this.f16789c = runnable;
        }

        public final void run() {
            if (this.f16787a.m20438g()) {
                this.f16787a.m20433b("canceled-at-delivery");
                return;
            }
            if (this.f16788b.m20456a()) {
                this.f16787a.mo4886a(this.f16788b.f16833a);
            } else {
                this.f16787a.m20432b(this.f16788b.f16835c);
            }
            if (this.f16788b.f16836d) {
                this.f16787a.m20430a("intermediate-response");
            } else {
                this.f16787a.m20433b("done");
            }
            if (this.f16789c != null) {
                this.f16789c.run();
            }
        }
    }

    public C6302d(final Handler handler) {
        this.f23622a = new Executor(this) {
            /* renamed from: b */
            private /* synthetic */ C6302d f16786b;

            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public C6302d(Executor executor) {
        this.f23622a = executor;
    }

    /* renamed from: a */
    public final void mo4769a(C4525k<?> c4525k, C4529m<?> c4529m) {
        mo4770a(c4525k, c4529m, null);
    }

    /* renamed from: a */
    public final void mo4770a(C4525k<?> c4525k, C4529m<?> c4529m, Runnable runnable) {
        c4525k.m20447p();
        c4525k.m20430a("post-response");
        this.f23622a.execute(new C4519a(this, c4525k, c4529m, runnable));
    }

    /* renamed from: a */
    public final void mo4771a(C4525k<?> c4525k, C4532r c4532r) {
        c4525k.m20430a("post-error");
        this.f23622a.execute(new C4519a(this, c4525k, C4529m.m20454a(c4532r), null));
    }
}
