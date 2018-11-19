package com.facebook.network.connectionclass;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nonnull;

/* renamed from: com.facebook.network.connectionclass.b */
public class C1798b {
    /* renamed from: a */
    private final ConnectionClassManager f4914a;
    /* renamed from: b */
    private AtomicInteger f4915b;
    /* renamed from: c */
    private Handler f4916c;
    /* renamed from: d */
    private HandlerThread f4917d;
    /* renamed from: e */
    private long f4918e;

    /* renamed from: com.facebook.network.connectionclass.b$a */
    private static class C1796a {
        /* renamed from: a */
        public static final C1798b f4912a = new C1798b(ConnectionClassManager.m6181a());
    }

    /* renamed from: com.facebook.network.connectionclass.b$b */
    private class C1797b extends Handler {
        /* renamed from: a */
        final /* synthetic */ C1798b f4913a;

        public C1797b(C1798b c1798b, Looper looper) {
            this.f4913a = c1798b;
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    m6198a();
                    sendEmptyMessageDelayed(1, 1000);
                    return;
                case 2:
                    m6198a();
                    removeMessages(1);
                    return;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown what=");
                    stringBuilder.append(message.what);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        /* renamed from: a */
        private void m6198a() {
            long a = C1802e.m6212a().m6213a(Process.myUid());
            synchronized (this) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (a != -1) {
                    this.f4913a.f4914a.m6185a(a, elapsedRealtime - this.f4913a.f4918e);
                }
                this.f4913a.f4918e = elapsedRealtime;
            }
        }
    }

    @Nonnull
    /* renamed from: a */
    public static C1798b m6201a() {
        return C1796a.f4912a;
    }

    private C1798b(ConnectionClassManager connectionClassManager) {
        this.f4914a = connectionClassManager;
        this.f4915b = new AtomicInteger();
        this.f4917d = new HandlerThread("ParseThread");
        this.f4917d.start();
        this.f4916c = new C1797b(this, this.f4917d.getLooper());
    }

    /* renamed from: b */
    public void m6203b() {
        if (this.f4915b.getAndIncrement() == 0) {
            this.f4916c.sendEmptyMessage(1);
            this.f4918e = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: c */
    public void m6204c() {
        if (this.f4915b.decrementAndGet() == 0) {
            this.f4916c.sendEmptyMessage(2);
        }
    }

    /* renamed from: d */
    public boolean m6205d() {
        return this.f4915b.get() != 0;
    }
}
