package de.greenrobot.event;

import android.util.Log;
import com.facebook.ads.AdError;

/* renamed from: de.greenrobot.event.b */
final class C15526b implements Runnable {
    /* renamed from: a */
    private final C15530h f47956a = new C15530h();
    /* renamed from: b */
    private final C2664c f47957b;
    /* renamed from: c */
    private volatile boolean f47958c;

    C15526b(C2664c c2664c) {
        this.f47957b = c2664c;
    }

    /* renamed from: a */
    public void m58011a(C15534l c15534l, Object obj) {
        C15529g a = C15529g.m58018a(c15534l, obj);
        synchronized (this) {
            this.f47956a.m58022a(a);
            if (this.f47958c == null) {
                this.f47958c = true;
                this.f47957b.c().execute(this);
            }
        }
    }

    public void run() {
        while (true) {
            try {
                C15529g a = this.f47956a.m58021a((int) AdError.NETWORK_ERROR_CODE);
                if (a == null) {
                    synchronized (this) {
                        a = this.f47956a.m58020a();
                        if (a == null) {
                            this.f47958c = false;
                            this.f47958c = false;
                            return;
                        }
                    }
                }
                this.f47957b.a(a);
            } catch (Throwable e) {
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(Thread.currentThread().getName());
                    stringBuilder.append(" was interruppted");
                    Log.w("Event", stringBuilder.toString(), e);
                    return;
                } finally {
                    this.f47958c = false;
                }
            }
        }
    }
}
