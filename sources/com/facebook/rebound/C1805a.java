package com.facebook.rebound;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

/* renamed from: com.facebook.rebound.a */
abstract class C1805a {

    @TargetApi(16)
    /* renamed from: com.facebook.rebound.a$a */
    private static class C3440a extends C1813h {
        /* renamed from: b */
        private final Choreographer f10446b;
        /* renamed from: c */
        private final FrameCallback f10447c = new C18031(this);
        /* renamed from: d */
        private boolean f10448d;
        /* renamed from: e */
        private long f10449e;

        /* renamed from: com.facebook.rebound.a$a$1 */
        class C18031 implements FrameCallback {
            /* renamed from: a */
            final /* synthetic */ C3440a f4933a;

            C18031(C3440a c3440a) {
                this.f4933a = c3440a;
            }

            public void doFrame(long j) {
                if (this.f4933a.f10448d != null) {
                    if (this.f4933a.a != null) {
                        j = SystemClock.uptimeMillis();
                        this.f4933a.a.m6220b((double) (j - this.f4933a.f10449e));
                        this.f4933a.f10449e = j;
                        this.f4933a.f10446b.postFrameCallback(this.f4933a.f10447c);
                    }
                }
            }
        }

        /* renamed from: a */
        public static C3440a m13147a() {
            return new C3440a(Choreographer.getInstance());
        }

        public C3440a(Choreographer choreographer) {
            this.f10446b = choreographer;
        }

        /* renamed from: b */
        public void mo1881b() {
            if (!this.f10448d) {
                this.f10448d = true;
                this.f10449e = SystemClock.uptimeMillis();
                this.f10446b.removeFrameCallback(this.f10447c);
                this.f10446b.postFrameCallback(this.f10447c);
            }
        }

        /* renamed from: c */
        public void mo1882c() {
            this.f10448d = false;
            this.f10446b.removeFrameCallback(this.f10447c);
        }
    }

    /* renamed from: com.facebook.rebound.a$b */
    private static class C3441b extends C1813h {
        /* renamed from: b */
        private final Handler f10450b;
        /* renamed from: c */
        private final Runnable f10451c = new C18041(this);
        /* renamed from: d */
        private boolean f10452d;
        /* renamed from: e */
        private long f10453e;

        /* renamed from: com.facebook.rebound.a$b$1 */
        class C18041 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C3441b f4934a;

            C18041(C3441b c3441b) {
                this.f4934a = c3441b;
            }

            public void run() {
                if (this.f4934a.f10452d) {
                    if (this.f4934a.a != null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f4934a.a.m6220b((double) (uptimeMillis - this.f4934a.f10453e));
                        this.f4934a.f10453e = uptimeMillis;
                        this.f4934a.f10450b.post(this.f4934a.f10451c);
                    }
                }
            }
        }

        /* renamed from: a */
        public static C1813h m13155a() {
            return new C3441b(new Handler());
        }

        public C3441b(Handler handler) {
            this.f10450b = handler;
        }

        /* renamed from: b */
        public void mo1881b() {
            if (!this.f10452d) {
                this.f10452d = true;
                this.f10453e = SystemClock.uptimeMillis();
                this.f10450b.removeCallbacks(this.f10451c);
                this.f10450b.post(this.f10451c);
            }
        }

        /* renamed from: c */
        public void mo1882c() {
            this.f10452d = false;
            this.f10450b.removeCallbacks(this.f10451c);
        }
    }

    /* renamed from: a */
    public static C1813h m6214a() {
        if (VERSION.SDK_INT >= 16) {
            return C3440a.m13147a();
        }
        return C3441b.m13155a();
    }
}
