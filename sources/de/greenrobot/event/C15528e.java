package de.greenrobot.event;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: de.greenrobot.event.e */
final class C15528e extends Handler {
    /* renamed from: a */
    private final C15530h f47976a = new C15530h();
    /* renamed from: b */
    private final int f47977b;
    /* renamed from: c */
    private final C2664c f47978c;
    /* renamed from: d */
    private boolean f47979d;

    C15528e(C2664c c2664c, Looper looper, int i) {
        super(looper);
        this.f47978c = c2664c;
        this.f47977b = i;
    }

    /* renamed from: a */
    void m58017a(C15534l c15534l, Object obj) {
        C15529g a = C15529g.m58018a(c15534l, obj);
        synchronized (this) {
            this.f47976a.m58022a(a);
            if (this.f47979d == null) {
                this.f47979d = true;
                if (sendMessage(obtainMessage()) == null) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                C15529g a = this.f47976a.m58020a();
                if (a == null) {
                    synchronized (this) {
                        a = this.f47976a.m58020a();
                        if (a == null) {
                            this.f47979d = false;
                            this.f47979d = false;
                            return;
                        }
                    }
                }
                this.f47978c.a(a);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f47977b));
            if (sendMessage(obtainMessage())) {
                this.f47979d = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } catch (Throwable th) {
            this.f47979d = false;
        }
    }
}
