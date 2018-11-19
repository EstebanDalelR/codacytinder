package com.google.android.m4b.maps.ay;

import com.google.android.m4b.maps.p125y.C5571j;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class ac {
    /* renamed from: a */
    private final ScheduledExecutorService f17290a;
    /* renamed from: b */
    private final Runnable f17291b;
    /* renamed from: c */
    private final C4712d f17292c;
    /* renamed from: d */
    private final long f17293d;
    /* renamed from: e */
    private boolean f17294e = false;
    /* renamed from: f */
    private long f17295f;
    /* renamed from: g */
    private Runnable f17296g = new C47031(this);

    /* renamed from: com.google.android.m4b.maps.ay.ac$1 */
    class C47031 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ ac f17289a;

        C47031(ac acVar) {
            this.f17289a = acVar;
        }

        public final void run() {
            synchronized (this.f17289a) {
                long a = this.f17289a.f17295f - C4712d.m20956b();
                Object obj = a <= 0 ? 1 : null;
                if (obj != null) {
                    this.f17289a.f17294e = false;
                } else {
                    this.f17289a.f17290a.schedule(this, a, TimeUnit.MILLISECONDS);
                }
            }
            if (obj != null) {
                this.f17289a.f17291b.run();
            }
        }
    }

    public ac(ScheduledExecutorService scheduledExecutorService, Runnable runnable, C4712d c4712d, long j) {
        boolean z = false;
        if (j >= 0) {
            z = true;
        }
        C5571j.m24297a(z);
        this.f17290a = scheduledExecutorService;
        this.f17291b = runnable;
        this.f17293d = j;
        this.f17292c = c4712d;
    }

    /* renamed from: a */
    public final synchronized void m20914a() {
        this.f17295f = C4712d.m20956b() + this.f17293d;
        if (!this.f17294e) {
            this.f17290a.schedule(this.f17296g, this.f17293d, TimeUnit.MILLISECONDS);
            this.f17294e = true;
        }
    }
}
