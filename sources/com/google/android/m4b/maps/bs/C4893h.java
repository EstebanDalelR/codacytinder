package com.google.android.m4b.maps.bs;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.bo.C6524p;
import com.google.android.m4b.maps.bo.C6525q;
import com.google.android.m4b.maps.bw.C4976e;
import com.google.android.m4b.maps.ch.C5203e;
import com.google.android.m4b.maps.cv.C5310a;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.m4b.maps.bs.h */
public final class C4893h {
    /* renamed from: a */
    private static long f17979a = TimeUnit.DAYS.toMillis(1);
    /* renamed from: b */
    private final C4976e<C7436c, C6524p> f17980b = new C4976e(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    /* renamed from: c */
    private final C4976e<C7436c, C7436c> f17981c = new C4976e(1024);
    /* renamed from: d */
    private C4879a f17982d;
    /* renamed from: e */
    private final C4712d f17983e;
    /* renamed from: f */
    private Locale f17984f;

    /* renamed from: com.google.android.m4b.maps.bs.h$a */
    static class C7469a extends C6524p {
        private C7469a(C7436c c7436c) {
            super(c7436c, ae.m27685e(), -1, false, null, -1);
        }

        public final String toString() {
            String valueOf = String.valueOf(mo5136a());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
            stringBuilder.append("[NotFoundBuilding: ");
            stringBuilder.append(valueOf);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public C4893h(Locale locale, C4712d c4712d) {
        this.f17983e = c4712d;
        this.f17984f = locale;
    }

    /* renamed from: a */
    public final void m21950a(File file, C5203e c5203e) {
        C4879a c4879a = new C4879a(this.f17983e, "bd", C5310a.f19707a, 3000, f17979a);
        if (c4879a.m21840a(file, c5203e) != null) {
            c4879a.m21841a(this.f17984f);
            this.f17982d = c4879a;
        }
    }

    /* renamed from: a */
    public final C6524p m21947a(C7436c c7436c) {
        return m21944a(c7436c, true);
    }

    /* renamed from: b */
    public final C6524p m21951b(C7436c c7436c) {
        return m21944a(c7436c, false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private com.google.android.m4b.maps.bo.C6524p m21944a(com.google.android.m4b.maps.ax.C4699a.C7436c r4, boolean r5) {
        /*
        r3 = this;
        r0 = r3.f17981c;
        monitor-enter(r0);
        r1 = r3.f17981c;	 Catch:{ all -> 0x00a4 }
        r1 = r1.m22246a(r4);	 Catch:{ all -> 0x00a4 }
        if (r1 == 0) goto L_0x0013;
    L_0x000b:
        r1 = r3.f17981c;	 Catch:{ all -> 0x00a4 }
        r4 = r1.m22251b(r4);	 Catch:{ all -> 0x00a4 }
        r4 = (com.google.android.m4b.maps.ax.C4699a.C7436c) r4;	 Catch:{ all -> 0x00a4 }
    L_0x0013:
        monitor-exit(r0);	 Catch:{ all -> 0x00a4 }
        r1 = r3.f17980b;
        monitor-enter(r1);
        r0 = r3.f17980b;	 Catch:{ all -> 0x00a1 }
        r0 = r0.m22251b(r4);	 Catch:{ all -> 0x00a1 }
        r0 = (com.google.android.m4b.maps.bo.C6524p) r0;	 Catch:{ all -> 0x00a1 }
        if (r0 == 0) goto L_0x0023;
    L_0x0021:
        monitor-exit(r1);	 Catch:{ all -> 0x00a1 }
        return r0;
    L_0x0023:
        monitor-exit(r1);	 Catch:{ all -> 0x00a1 }
        r0 = 0;
        if (r5 == 0) goto L_0x00a0;
    L_0x0027:
        r5 = r3.f17982d;
        if (r5 != 0) goto L_0x002d;
    L_0x002b:
        goto L_0x00a0;
    L_0x002d:
        r5 = r3.f17982d;
        r1 = r4.m32018d();
        r5 = r5.m21837a(r1);
        if (r5 != 0) goto L_0x003a;
    L_0x0039:
        return r0;
    L_0x003a:
        r1 = r5.f17894a;
        r2 = 1;
        r1 = r1.m20843h(r2);
        r1 = com.google.android.m4b.maps.ax.C4699a.C7436c.m32017b(r1);
        if (r1 != 0) goto L_0x0072;
    L_0x0047:
        r4 = "BuildingCache";
        r1 = 3;
        r4 = com.google.android.m4b.maps.ay.C4728u.m21050a(r4, r1);
        if (r4 == 0) goto L_0x0071;
    L_0x0050:
        r4 = "BuildingCache";
        r1 = "malformed building id from cache: ";
        r5 = r5.f17894a;
        r5 = r5.m20843h(r2);
        r5 = java.lang.String.valueOf(r5);
        r2 = r5.length();
        if (r2 == 0) goto L_0x0069;
    L_0x0064:
        r5 = r1.concat(r5);
        goto L_0x006e;
    L_0x0069:
        r5 = new java.lang.String;
        r5.<init>(r1);
    L_0x006e:
        android.util.Log.d(r4, r5);
    L_0x0071:
        return r0;
    L_0x0072:
        r2 = r4.equals(r1);
        if (r2 != 0) goto L_0x0092;
    L_0x0078:
        r5 = r3.f17982d;
        r2 = r1.m32018d();
        r5 = r5.m21837a(r2);
        if (r5 == 0) goto L_0x0091;
    L_0x0084:
        r2 = r3.f17981c;
        monitor-enter(r2);
        r0 = r3.f17981c;	 Catch:{ all -> 0x008e }
        r0.m22255c(r4, r1);	 Catch:{ all -> 0x008e }
        monitor-exit(r2);	 Catch:{ all -> 0x008e }
        goto L_0x0092;
    L_0x008e:
        r4 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x008e }
        throw r4;
    L_0x0091:
        return r0;
    L_0x0092:
        r4 = r5.f17894a;
        r0 = r5.f17895b;
        r4 = com.google.android.m4b.maps.bo.C6524p.m28742a(r4, r0);
        if (r4 == 0) goto L_0x009f;
    L_0x009c:
        r3.m21946b(r4);
    L_0x009f:
        return r4;
    L_0x00a0:
        return r0;
    L_0x00a1:
        r4 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00a1 }
        throw r4;
    L_0x00a4:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00a4 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bs.h.a(com.google.android.m4b.maps.ax.a$c, boolean):com.google.android.m4b.maps.bo.p");
    }

    /* renamed from: a */
    public final C6524p m21948a(C7436c c7436c, C4662a c4662a) {
        C7436c b = C7436c.m32017b(c4662a.m20843h(1));
        if (c7436c != null) {
            if (b != null) {
                long b2 = C4712d.m20956b() + f17979a;
                if (this.f17982d != null) {
                    this.f17982d.m21838a(b.m32018d(), c4662a);
                    int k = c4662a.m20846k(2);
                    if (k != 0) {
                        C4662a c4662a2 = new C4662a(C5310a.f19707a);
                        c4662a2.m20828b(1, b.toString());
                        for (int i = 0; i < k; i++) {
                            C7436c b3 = C7436c.m32017b(c4662a.m20833c(2, i).m20843h(1));
                            if (b3 != null) {
                                this.f17982d.m21838a(b3.m32018d(), c4662a2);
                            }
                        }
                    }
                }
                C6524p a = C6524p.m28742a(c4662a, b2);
                if (a == null) {
                    return null;
                }
                m21946b(a);
                return a;
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m21946b(C6524p c6524p) {
        C7436c a = c6524p.mo5136a();
        synchronized (this.f17980b) {
            this.f17980b.m22255c(a, c6524p);
        }
        synchronized (this.f17981c) {
            for (C6525q b : c6524p.mo5138b()) {
                this.f17981c.m22255c(b.mo5143b(), a);
            }
        }
    }

    /* renamed from: c */
    public final void m21953c(C7436c c7436c) {
        C7469a c7469a = new C7469a(c7436c);
        synchronized (this.f17980b) {
            this.f17980b.m22255c(c7436c, c7469a);
        }
    }

    /* renamed from: a */
    public static boolean m21945a(C6524p c6524p) {
        return c6524p instanceof C7469a;
    }

    /* renamed from: a */
    public final void m21949a() {
        synchronized (this.f17980b) {
            this.f17980b.m22247a();
        }
        synchronized (this.f17981c) {
            this.f17981c.m22247a();
        }
    }

    /* renamed from: b */
    public final void m21952b() {
        synchronized (this.f17980b) {
            this.f17980b.m22247a();
        }
        synchronized (this.f17981c) {
            this.f17981c.m22247a();
        }
        if (this.f17982d != null) {
            this.f17982d.m21839a();
        }
    }
}
