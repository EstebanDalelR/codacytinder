package com.facebook.network.connectionclass;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nonnull;

public class ConnectionClassManager {
    /* renamed from: a */
    private C1799c f4901a;
    /* renamed from: b */
    private volatile boolean f4902b;
    /* renamed from: c */
    private AtomicReference<ConnectionQuality> f4903c;
    /* renamed from: d */
    private AtomicReference<ConnectionQuality> f4904d;
    /* renamed from: e */
    private ArrayList<ConnectionClassStateChangeListener> f4905e;
    /* renamed from: f */
    private int f4906f;

    public interface ConnectionClassStateChangeListener {
        void onBandwidthStateChange(ConnectionQuality connectionQuality);
    }

    /* renamed from: com.facebook.network.connectionclass.ConnectionClassManager$a */
    private static class C1793a {
        /* renamed from: a */
        public static final ConnectionClassManager f4900a = new ConnectionClassManager();
    }

    @Nonnull
    /* renamed from: a */
    public static ConnectionClassManager m6181a() {
        return C1793a.f4900a;
    }

    private ConnectionClassManager() {
        this.f4901a = new C1799c(0.05d);
        this.f4902b = false;
        this.f4903c = new AtomicReference(ConnectionQuality.UNKNOWN);
        this.f4905e = new ArrayList();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized void m6185a(long r5, long r7) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = 0;
        r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
        if (r2 == 0) goto L_0x0074;
    L_0x0007:
        r5 = (double) r5;
        r0 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r5 = r5 * r0;
        r7 = (double) r7;
        r5 = r5 / r7;
        r7 = 4620693217682128896; // 0x4020000000000000 float:0.0 double:8.0;
        r5 = r5 * r7;
        r7 = 4621819117588971520; // 0x4024000000000000 float:0.0 double:10.0;
        r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r0 >= 0) goto L_0x0019;
    L_0x0018:
        goto L_0x0074;
    L_0x0019:
        r7 = r4.f4901a;	 Catch:{ all -> 0x0071 }
        r7.m6207a(r5);	 Catch:{ all -> 0x0071 }
        r5 = r4.f4902b;	 Catch:{ all -> 0x0071 }
        r6 = 1;
        if (r5 == 0) goto L_0x0056;
    L_0x0023:
        r5 = r4.f4906f;	 Catch:{ all -> 0x0071 }
        r5 = r5 + r6;
        r4.f4906f = r5;	 Catch:{ all -> 0x0071 }
        r5 = r4.m6186b();	 Catch:{ all -> 0x0071 }
        r7 = r4.f4904d;	 Catch:{ all -> 0x0071 }
        r7 = r7.get();	 Catch:{ all -> 0x0071 }
        r8 = 0;
        if (r5 == r7) goto L_0x0039;
    L_0x0035:
        r4.f4902b = r8;	 Catch:{ all -> 0x0071 }
        r4.f4906f = r6;	 Catch:{ all -> 0x0071 }
    L_0x0039:
        r5 = r4.f4906f;	 Catch:{ all -> 0x0071 }
        r0 = (double) r5;	 Catch:{ all -> 0x0071 }
        r2 = 4617315517961601024; // 0x4014000000000000 float:0.0 double:5.0;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 < 0) goto L_0x0054;
    L_0x0042:
        r4.f4902b = r8;	 Catch:{ all -> 0x0071 }
        r4.f4906f = r6;	 Catch:{ all -> 0x0071 }
        r5 = r4.f4903c;	 Catch:{ all -> 0x0071 }
        r6 = r4.f4904d;	 Catch:{ all -> 0x0071 }
        r6 = r6.get();	 Catch:{ all -> 0x0071 }
        r5.set(r6);	 Catch:{ all -> 0x0071 }
        r4.m6183c();	 Catch:{ all -> 0x0071 }
    L_0x0054:
        monitor-exit(r4);
        return;
    L_0x0056:
        r5 = r4.f4903c;	 Catch:{ all -> 0x0071 }
        r5 = r5.get();	 Catch:{ all -> 0x0071 }
        r7 = r4.m6186b();	 Catch:{ all -> 0x0071 }
        if (r5 == r7) goto L_0x006f;
    L_0x0062:
        r4.f4902b = r6;	 Catch:{ all -> 0x0071 }
        r5 = new java.util.concurrent.atomic.AtomicReference;	 Catch:{ all -> 0x0071 }
        r6 = r4.m6186b();	 Catch:{ all -> 0x0071 }
        r5.<init>(r6);	 Catch:{ all -> 0x0071 }
        r4.f4904d = r5;	 Catch:{ all -> 0x0071 }
    L_0x006f:
        monitor-exit(r4);
        return;
    L_0x0071:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
    L_0x0074:
        monitor-exit(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.network.connectionclass.ConnectionClassManager.a(long, long):void");
    }

    /* renamed from: b */
    public synchronized ConnectionQuality m6186b() {
        if (this.f4901a == null) {
            return ConnectionQuality.UNKNOWN;
        }
        return m6182a(this.f4901a.m6206a());
    }

    /* renamed from: a */
    private ConnectionQuality m6182a(double d) {
        if (d < 0.0d) {
            return ConnectionQuality.UNKNOWN;
        }
        if (d < 150.0d) {
            return ConnectionQuality.POOR;
        }
        if (d < 550.0d) {
            return ConnectionQuality.MODERATE;
        }
        if (d < 2000.0d) {
            return ConnectionQuality.GOOD;
        }
        return ConnectionQuality.EXCELLENT;
    }

    /* renamed from: a */
    public ConnectionQuality m6184a(ConnectionClassStateChangeListener connectionClassStateChangeListener) {
        if (connectionClassStateChangeListener != null) {
            this.f4905e.add(connectionClassStateChangeListener);
        }
        return (ConnectionQuality) this.f4903c.get();
    }

    /* renamed from: b */
    public void m6187b(ConnectionClassStateChangeListener connectionClassStateChangeListener) {
        if (connectionClassStateChangeListener != null) {
            this.f4905e.remove(connectionClassStateChangeListener);
        }
    }

    /* renamed from: c */
    private void m6183c() {
        int size = this.f4905e.size();
        for (int i = 0; i < size; i++) {
            ((ConnectionClassStateChangeListener) this.f4905e.get(i)).onBandwidthStateChange((ConnectionQuality) this.f4903c.get());
        }
    }
}
