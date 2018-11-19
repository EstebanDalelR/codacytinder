package com.google.android.m4b.maps.bx;

import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.bm.C6487i;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bz.C5044d;
import com.google.android.m4b.maps.bz.C5046e;
import com.google.android.m4b.maps.bz.C5046e.C5045a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.bz.C6571c;
import com.google.android.m4b.maps.bz.C6572f;
import com.google.android.m4b.maps.bz.C7488a;
import com.tinder.api.ManagerWebServices;

public final class ap implements C5002b {
    /* renamed from: a */
    private static final float f24470a = ((float) (1.0d / Math.log(2.0d)));
    /* renamed from: b */
    private static final C6571c f24471b = null;
    /* renamed from: c */
    private static float f24472c = 21.0f;
    /* renamed from: d */
    private Resources f24473d;
    /* renamed from: e */
    private final C5046e f24474e;
    /* renamed from: f */
    private volatile C6571c f24475f;
    /* renamed from: g */
    private volatile C6571c f24476g;
    /* renamed from: h */
    private volatile float f24477h;
    /* renamed from: i */
    private volatile C5044d f24478i;
    /* renamed from: j */
    private volatile boolean f24479j;
    /* renamed from: k */
    private boolean f24480k;
    /* renamed from: l */
    private aj f24481l;
    /* renamed from: m */
    private ar f24482m;
    /* renamed from: n */
    private ad f24483n;
    /* renamed from: o */
    private C5007g f24484o;
    /* renamed from: p */
    private C4995e f24485p;
    /* renamed from: q */
    private boolean f24486q;
    /* renamed from: r */
    private int f24487r = 6;
    /* renamed from: s */
    private float f24488s = 1.0f;
    /* renamed from: t */
    private final C6487i f24489t;

    /* renamed from: com.google.android.m4b.maps.bx.ap$e */
    public interface C4995e {
        /* renamed from: b */
        void mo4924b();
    }

    /* renamed from: com.google.android.m4b.maps.bx.ap$a */
    public static class C8070a extends C7488a {
        /* renamed from: b */
        private final C6571c f28935b;
        /* renamed from: c */
        private C5044d f28936c;
        /* renamed from: d */
        private final int f28937d;
        /* renamed from: e */
        private final long f28938e;
        /* renamed from: f */
        private int f28939f = 0;
        /* renamed from: g */
        private final C4712d f28940g = C4712d.m20955a();
        /* renamed from: h */
        private float f28941h;

        protected C8070a(C6571c c6571c, C5044d c5044d, int i, boolean z, float f) {
            super(c6571c);
            this.f28935b = c6571c;
            this.f28936c = c5044d;
            this.f28938e = C4712d.m20957c();
            if (this.f28935b.equals(this.f28936c.mo5249b()) != null) {
                this.f28937d = 0;
            } else {
                this.f28937d = Math.max(0, i);
            }
            if (z) {
                this.f28941h = null;
            } else {
                this.f28941h = f;
            }
        }

        /* renamed from: a */
        public final C5044d mo7565a(C6570b c6570b) {
            float f;
            long c = C4712d.m20957c();
            if (this.f28937d == 0) {
                f = 1.0f;
            } else {
                f = ((float) (c - this.f28938e)) / ((float) this.f28937d);
            }
            if (this.f28936c instanceof C6572f) {
                C6572f c6572f = (C6572f) this.f28936c;
                this.f28936c = c6572f.mo7565a(c6570b);
                c6570b = c6572f.mo7564a();
            } else {
                c6570b = null;
            }
            if (f >= 1.0f) {
                this.f28939f = c6570b;
                return this.f28936c;
            }
            this.a = C6571c.m29268a(this.f28935b, this.f28936c.mo5249b().m29270a(this.f28935b), 1.0f - ((((float) Math.cos(((double) f) * 3.141592653589793d)) + 1.0f) * 0.5f), this.f28941h);
            this.f28939f = c6570b | 2;
            return this;
        }

        /* renamed from: a */
        public final int mo7564a() {
            return this.f28939f;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.ap$b */
    static class C8071b extends C7488a {
        /* renamed from: b */
        private final C5046e f28942b;
        /* renamed from: c */
        private float f28943c;
        /* renamed from: d */
        private float f28944d;
        /* renamed from: e */
        private long f28945e;

        public C8071b(C6571c c6571c, C5046e c5046e) {
            super(c6571c);
            this.f28942b = c5046e;
        }

        /* renamed from: a */
        final synchronized void m34316a(float f, float f2) {
            this.f28943c = f * -0.001f;
            this.f28944d = f2 * -0.001f;
            this.f28945e = SystemClock.uptimeMillis();
        }

        /* renamed from: a */
        public final C5044d mo7565a(C6570b c6570b) {
            float f;
            float f2;
            long uptimeMillis = SystemClock.uptimeMillis();
            synchronized (this) {
                long j = uptimeMillis - this.f28945e;
                this.f28945e = uptimeMillis;
                float exp = (float) Math.exp((double) (((float) (-j)) * 0.006f));
                float f3 = (1.0f - exp) / 0.006f;
                f = this.f28943c * f3;
                f2 = this.f28944d * f3;
                this.f28943c *= exp;
                this.f28944d *= exp;
                if (Math.abs(this.f28943c) < 0.15f && Math.abs(this.f28944d) < 0.15f) {
                    this.f28943c = 0.0f;
                    this.f28944d = 0.0f;
                }
            }
            this.a = this.f28942b.m22571a(ap.m29041a(this.a, c6570b, f, f2));
            return (this.f28943c == null && this.f28944d == null) ? this.a : this;
        }

        /* renamed from: a */
        public final int mo7564a() {
            return (this.f28943c == 0.0f && this.f28944d == 0.0f) ? 0 : 2;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.ap$c */
    static class C8072c extends C7488a {
        /* renamed from: b */
        private final float f28946b;
        /* renamed from: c */
        private final float f28947c;
        /* renamed from: d */
        private final float f28948d;
        /* renamed from: e */
        private final int f28949e;
        /* renamed from: f */
        private final long f28950f = SystemClock.uptimeMillis();
        /* renamed from: g */
        private final C5046e f28951g;
        /* renamed from: h */
        private C6572f f28952h;

        protected C8072c(C6571c c6571c, C5046e c5046e, float f, float f2, float f3, int i) {
            super(c6571c);
            this.f28951g = c5046e;
            this.f28946b = f;
            this.f28947c = f2;
            this.f28948d = f3;
            this.f28949e = i;
        }

        /* renamed from: a */
        public final C5044d mo7565a(C6570b c6570b) {
            this.f28952h = new C8070a(this.a, ap.m29042a(this.a, c6570b, this.f28951g, this.f28946b, this.f28947c, this.f28948d), this.f28949e - ((int) (SystemClock.uptimeMillis() - this.f28950f)), true, 0.0f);
            return this.f28952h.mo7565a(c6570b);
        }

        /* renamed from: a */
        public final int mo7564a() {
            if (this.f28952h == null) {
                return 0;
            }
            return this.f28952h.mo7564a();
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.ap$d */
    static class C8073d extends C7488a {
        /* renamed from: b */
        private float f28953b;
        /* renamed from: c */
        private float f28954c;
        /* renamed from: d */
        private float f28955d;
        /* renamed from: e */
        private float f28956e;
        /* renamed from: f */
        private float f28957f;
        /* renamed from: g */
        private float f28958g;
        /* renamed from: h */
        private volatile boolean f28959h;
        /* renamed from: i */
        private final C5046e f28960i;
        /* renamed from: j */
        private final float[] f28961j = new float[2];

        public C8073d(C6571c c6571c, C5046e c5046e) {
            super(c6571c);
            this.f28960i = c5046e;
        }

        /* renamed from: a */
        final synchronized float[] m34321a(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f28953b += f;
            this.f28954c += f2;
            this.f28955d += f5;
            this.f28956e += f6;
            if (!(f == 0.0f && f2 == 0.0f)) {
                this.f28957f = f3;
                this.f28958g = f4;
            }
            this.f28959h = true;
            this.f28961j[0] = Math.max(Math.min(this.a.m29269a() + this.f28953b, ap.f24472c), 2.0f);
            this.f28961j[1] = ap.m29046c(this.a.m29274e() + this.f28954c);
            return this.f28961j;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public final com.google.android.m4b.maps.bz.C5044d mo7565a(com.google.android.m4b.maps.bz.C6570b r14) {
            /*
            r13 = this;
            monitor-enter(r13);
            r4 = r13.f28957f;	 Catch:{ all -> 0x00e7 }
            r5 = r13.f28958g;	 Catch:{ all -> 0x00e7 }
            r0 = r13.f28955d;	 Catch:{ all -> 0x00e7 }
            r1 = r13.f28956e;	 Catch:{ all -> 0x00e7 }
            r2 = r13.f28953b;	 Catch:{ all -> 0x00e7 }
            r3 = 0;
            r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
            r6 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
            if (r2 >= 0) goto L_0x0026;
        L_0x0012:
            r2 = r13.f28953b;	 Catch:{ all -> 0x00e7 }
            r7 = r13.f28953b;	 Catch:{ all -> 0x00e7 }
            r8 = r13.f28953b;	 Catch:{ all -> 0x00e7 }
            r7 = r7 * r8;
            r8 = r13.f28953b;	 Catch:{ all -> 0x00e7 }
            r7 = r7 * r8;
            r7 = r7 * r6;
            r2 = java.lang.Math.max(r2, r7);	 Catch:{ all -> 0x00e7 }
        L_0x0024:
            r6 = r2;
            goto L_0x0039;
        L_0x0026:
            r2 = r13.f28953b;	 Catch:{ all -> 0x00e7 }
            r7 = r13.f28953b;	 Catch:{ all -> 0x00e7 }
            r8 = r13.f28953b;	 Catch:{ all -> 0x00e7 }
            r7 = r7 * r8;
            r8 = r13.f28953b;	 Catch:{ all -> 0x00e7 }
            r7 = r7 * r8;
            r7 = r7 * r6;
            r2 = java.lang.Math.min(r2, r7);	 Catch:{ all -> 0x00e7 }
            goto L_0x0024;
        L_0x0039:
            r2 = r13.f28954c;	 Catch:{ all -> 0x00e7 }
            r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
            if (r2 >= 0) goto L_0x0051;
        L_0x003f:
            r2 = r13.f28954c;	 Catch:{ all -> 0x00e7 }
            r7 = r13.f28954c;	 Catch:{ all -> 0x00e7 }
            r8 = r13.f28954c;	 Catch:{ all -> 0x00e7 }
            r7 = r7 * r8;
            r8 = -1110651699; // 0xffffffffbdcccccd float:-0.1 double:NaN;
            r7 = r7 * r8;
            r2 = java.lang.Math.max(r2, r7);	 Catch:{ all -> 0x00e7 }
            goto L_0x0062;
        L_0x0051:
            r2 = r13.f28954c;	 Catch:{ all -> 0x00e7 }
            r7 = r13.f28954c;	 Catch:{ all -> 0x00e7 }
            r8 = r13.f28954c;	 Catch:{ all -> 0x00e7 }
            r7 = r7 * r8;
            r8 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
            r7 = r7 * r8;
            r2 = java.lang.Math.min(r2, r7);	 Catch:{ all -> 0x00e7 }
        L_0x0062:
            r7 = r13.f28953b;	 Catch:{ all -> 0x00e7 }
            r7 = r7 - r6;
            r13.f28953b = r7;	 Catch:{ all -> 0x00e7 }
            r7 = r13.f28954c;	 Catch:{ all -> 0x00e7 }
            r7 = r7 - r2;
            r13.f28954c = r7;	 Catch:{ all -> 0x00e7 }
            r13.f28955d = r3;	 Catch:{ all -> 0x00e7 }
            r13.f28956e = r3;	 Catch:{ all -> 0x00e7 }
            r7 = java.lang.Math.abs(r6);	 Catch:{ all -> 0x00e7 }
            r7 = (double) r7;	 Catch:{ all -> 0x00e7 }
            r9 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
            r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
            r7 = 0;
            if (r11 >= 0) goto L_0x0096;
        L_0x007f:
            r8 = java.lang.Math.abs(r2);	 Catch:{ all -> 0x00e7 }
            r11 = (double) r8;	 Catch:{ all -> 0x00e7 }
            r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1));
            if (r8 >= 0) goto L_0x0096;
        L_0x0088:
            r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
            if (r8 != 0) goto L_0x0096;
        L_0x008c:
            r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
            if (r8 != 0) goto L_0x0096;
        L_0x0090:
            r13.f28959h = r7;	 Catch:{ all -> 0x00e7 }
            r14 = r13.a;	 Catch:{ all -> 0x00e7 }
            monitor-exit(r13);	 Catch:{ all -> 0x00e7 }
            return r14;
        L_0x0096:
            monitor-exit(r13);	 Catch:{ all -> 0x00e7 }
            r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
            r9 = 1;
            if (r8 != 0) goto L_0x00a3;
        L_0x009c:
            r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
            if (r8 == 0) goto L_0x00a1;
        L_0x00a0:
            goto L_0x00a3;
        L_0x00a1:
            r8 = 0;
            goto L_0x00a4;
        L_0x00a3:
            r8 = 1;
        L_0x00a4:
            r10 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
            if (r10 == 0) goto L_0x00aa;
        L_0x00a8:
            r10 = 1;
            goto L_0x00ab;
        L_0x00aa:
            r10 = 0;
        L_0x00ab:
            r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));
            if (r3 == 0) goto L_0x00b0;
        L_0x00af:
            r7 = 1;
        L_0x00b0:
            if (r8 == 0) goto L_0x00c3;
        L_0x00b2:
            r3 = r13.a;
            r0 = com.google.android.m4b.maps.bx.ap.m29041a(r3, r14, r0, r1);
            r13.a = r0;
            if (r10 != 0) goto L_0x00be;
        L_0x00bc:
            if (r7 == 0) goto L_0x00c3;
        L_0x00be:
            r0 = r13.a;
            r14.m29239a(r0);
        L_0x00c3:
            if (r10 == 0) goto L_0x00d8;
        L_0x00c5:
            r0 = r14.m29247d(r4, r5);
            r1 = r13.f28960i;
            r0 = com.google.android.m4b.maps.bx.ap.m29040a(r14, r1, r0, r2);
            r13.a = r0;
            if (r7 == 0) goto L_0x00d8;
        L_0x00d3:
            r0 = r13.a;
            r14.m29239a(r0);
        L_0x00d8:
            if (r7 == 0) goto L_0x00e6;
        L_0x00da:
            r0 = r13.a;
            r2 = r13.f28960i;
            r1 = r14;
            r3 = r6;
            r14 = com.google.android.m4b.maps.bx.ap.m29042a(r0, r1, r2, r3, r4, r5);
            r13.a = r14;
        L_0x00e6:
            return r13;
        L_0x00e7:
            r14 = move-exception;
            monitor-exit(r13);	 Catch:{ all -> 0x00e7 }
            throw r14;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.ap.d.a(com.google.android.m4b.maps.bz.b):com.google.android.m4b.maps.bz.d");
        }

        /* renamed from: a */
        public final int mo7564a() {
            return this.f28959h ? 2 : 0;
        }
    }

    /* renamed from: c */
    private static float m29046c(float f) {
        while (true) {
            double d = (double) f;
            if (d < 360.0d) {
                break;
            }
            f = (float) (d - 360.0d);
        }
        while (true) {
            d = (double) f;
            if (d >= 0.0d) {
                return f;
            }
            f = (float) (d + 360.0d);
        }
    }

    public ap(Resources resources) {
        this.f24473d = resources;
        this.f24475f = C6570b.f24562a;
        this.f24478i = C6570b.f24562a;
        this.f24474e = new C5046e(resources);
        this.f24489t = C6487i.m28476a();
    }

    /* renamed from: a */
    public final void m29057a(aj ajVar) {
        this.f24481l = ajVar;
        this.f24486q = true;
    }

    /* renamed from: a */
    public final void m29062a(C5045a c5045a) {
        this.f24474e.m22574a(c5045a);
    }

    /* renamed from: a */
    public final synchronized void m29056a(ad adVar) {
        this.f24483n = adVar;
    }

    /* renamed from: a */
    public final synchronized void m29060a(C5007g c5007g) {
        this.f24484o = c5007g;
    }

    /* renamed from: a */
    public final synchronized void m29058a(C4995e c4995e) {
        this.f24485p = c4995e;
    }

    /* renamed from: a */
    public final void m29059a(ar arVar) {
        this.f24482m = arVar;
    }

    /* renamed from: a */
    public final float m29052a(af afVar) {
        C5045a a = this.f24474e.m22572a();
        return a == null ? f24472c : a.mo5209a(afVar);
    }

    /* renamed from: a */
    public final float m29048a() {
        C5045a a = this.f24474e.m22572a();
        if (a == null) {
            return 2.0f;
        }
        return a.mo5214d();
    }

    /* renamed from: a */
    public final void m29054a(float f) {
        this.f24474e.m22573a(67.5f);
    }

    /* renamed from: b */
    public final C6571c m29064b() {
        return this.f24475f;
    }

    /* renamed from: c */
    public final float m29067c() {
        return this.f24477h;
    }

    /* renamed from: a */
    private void m29044a(C5044d c5044d, C6571c c6571c) {
        synchronized (this) {
            if (this.f24485p != null) {
                this.f24485p.mo4924b();
            }
            if (c5044d instanceof C6572f) {
                this.f24479j = true;
            }
            this.f24478i = c5044d;
            this.f24480k = true;
            this.f24475f = this.f24474e.m22571a(this.f24478i.mo5249b());
            if (c6571c != null) {
                c6571c = this.f24474e.m22571a(c6571c);
            }
            this.f24476g = c6571c;
            notifyAll();
        }
        if (this.f24481l != null) {
            this.f24481l.mo5221a(null, true);
        }
    }

    /* renamed from: a */
    private void m29043a(C5044d c5044d, int i) {
        m29061a(c5044d, i, i == 0 ? 0 : -1);
    }

    /* renamed from: a */
    public final void m29061a(C5044d c5044d, int i, int i2) {
        if (this.f24486q || !this.f24478i.equals(c5044d)) {
            boolean z = false;
            if (this.f24486q) {
                i = 0;
                i2 = 0;
            }
            this.f24486q = false;
            C6571c c6571c = this.f24475f;
            C6571c a = c5044d.mo5249b().m29270a(c6571c);
            this.f24477h = a.m29269a();
            float abs = Math.abs(a.m29269a() - c6571c.m29269a());
            int min = 1073741824 >> Math.min(Math.round((a.m29269a() + c6571c.m29269a()) * 0.5f), 30);
            float c = a.m29272c().m21483c(c6571c.m29272c());
            float f = (float) min;
            float f2 = c / f;
            if (f2 <= ((float) this.f24487r)) {
                z = true;
            }
            if (z) {
                if (i == 0) {
                    m29044a(c5044d, null);
                    return;
                }
                if (i == -1) {
                    i = (int) ((((Math.min(abs, 8.0f) / 1090519040) * 1061158912) + 1069547520) * 1143930880);
                }
                m29044a(new C8070a(c6571c, c5044d, i, true, 0.0f), null);
                return;
            } else if (i2 == 0) {
                m29044a(c5044d, null);
                return;
            } else {
                if (i2 == -1) {
                    i2 = (int) (((float) Math.min((int) (((((f2 - ((float) this.f24487r)) / ((1317011456 / f) - ((float) this.f24487r))) * 1082340147) + 1068708659) * 700.0f), ManagerWebServices.FB_WEAR_TIMEOUT)) * this.f24488s);
                }
                m29044a(new C8070a(c6571c, c5044d, i2, false, (float) Math.pow(2.0d, ((Math.log((double) c) * ((double) f24470a)) * 2.39d) - 58.71d)), a);
                return;
            }
        }
        this.f24483n.mo4916a(this.f24475f);
    }

    /* renamed from: a */
    public final int mo5216a(C6570b c6570b) {
        int a;
        synchronized (this) {
            if (this.f24478i instanceof C6572f) {
                C6572f c6572f = (C6572f) this.f24478i;
                int a2 = c6572f.mo7564a();
                this.f24478i = c6572f.mo7565a(c6570b);
                this.f24475f = this.f24474e.m22571a(this.f24478i.mo5249b());
                notifyAll();
                a = c6572f.mo7564a() | a2;
            } else {
                this.f24478i = this.f24474e.m22571a(this.f24478i.mo5249b());
                this.f24475f = this.f24478i.mo5249b();
                this.f24479j = false;
                notifyAll();
                a = 0;
            }
            c6570b.m29239a(this.f24475f);
            if (this.f24480k && a == 0) {
                if (this.f24483n != null) {
                    this.f24483n.mo4916a(this.f24475f);
                }
                this.f24480k = false;
            }
            if (this.f24484o != null) {
                this.f24484o.mo4926b(this.f24475f);
            }
        }
        if ((a & 2) == 0 && this.f24482m != null) {
            this.f24482m.m22352a(c6570b);
        }
        return a;
    }

    /* renamed from: e */
    public final C6571c mo5217e() {
        return this.f24476g;
    }

    /* renamed from: a */
    public final synchronized void m29055a(float f, float f2) {
        if (this.f24478i instanceof C8073d) {
            ((C8073d) this.f24478i).m34321a(0.0f, 0.0f, 0.0f, 0.0f, f, f2);
            return;
        }
        C5044d c8073d = new C8073d(this.f24478i.mo5249b(), this.f24474e);
        c8073d.m34321a(0.0f, 0.0f, 0.0f, 0.0f, f, f2);
        m29044a(c8073d, (C6571c) 0.0f);
    }

    /* renamed from: b */
    public final synchronized void m29065b(float f, float f2) {
        if (!(this.f24478i instanceof C8071b)) {
            m29044a(new C8071b(this.f24478i.mo5249b(), this.f24474e), null);
        }
        ((C8071b) this.f24478i).m34316a(f, f2);
    }

    /* renamed from: a */
    public final synchronized float m29049a(float f, float f2, float f3) {
        C6571c c6571c = this.f24475f;
        if (c6571c.m29269a() == this.f24474e.m22571a(new C6571c(c6571c.m29272c(), c6571c.m29269a() + f, c6571c.m29273d(), c6571c.m29274e(), c6571c.m29275f())).m29269a()) {
            return c6571c.m29269a();
        }
        if (this.f24478i instanceof C8073d) {
            f = ((C8073d) this.f24478i).m34321a(f, 0.0f, f2, f3, 0.0f, 0.0f)[0];
        } else {
            C5044d c8073d = new C8073d(this.f24478i.mo5249b(), this.f24474e);
            f = c8073d.m34321a(f, 0.0f, f2, f3, 0.0f, 0.0f)[0];
            m29044a(c8073d, (C6571c) 0.0f);
        }
        this.f24477h = f;
        return f;
    }

    /* renamed from: a */
    public final float m29051a(float f, int i) {
        C6571c c6571c = this.f24475f;
        C5044d a = this.f24474e.m22571a(new C6571c(c6571c.m29272c(), c6571c.m29269a() + f, c6571c.m29273d(), c6571c.m29274e(), c6571c.m29275f()));
        m29043a(a, i);
        return a.m29269a();
    }

    /* renamed from: a */
    public final float m29050a(float f, float f2, float f3, int i) {
        C6571c c6571c = this.f24475f;
        this.f24477h = c6571c.m29269a() + f;
        m29044a(new C8072c(c6571c, this.f24474e, f, f2, f3, i), (C6571c) 0.0f);
        return Math.max(Math.min(c6571c.m29269a() + f, f24472c), 2.0f);
    }

    /* renamed from: b */
    public final synchronized float m29063b(float f, float f2, float f3) {
        if (this.f24478i instanceof C8073d) {
            return ((C8073d) this.f24478i).m34321a(0.0f, f3, f, f2, 0.0f, 0.0f)[1];
        }
        C5044d c8073d = new C8073d(this.f24475f, this.f24474e);
        m29044a(c8073d, null);
        return c8073d.m34321a(0.0f, f3, f, f2, 0.0f, 0.0f)[1];
    }

    /* renamed from: b */
    public final synchronized void m29066b(float f, int i) {
        i = this.f24475f;
        m29043a(this.f24474e.m22571a(new C6571c(i.m29272c(), i.m29269a(), i.m29273d() + f, i.m29274e(), i.m29275f())), 0);
    }

    /* renamed from: a */
    public static C6571c m29041a(C6571c c6571c, C6570b c6570b, float f, float f2) {
        f *= c6570b.m29262r();
        f2 = ((-f2) * c6570b.m29262r()) / ((float) Math.cos((double) (c6570b.m29255k() * 0.017453292f)));
        af o = c6570b.m29259o();
        af p = c6570b.m29260p();
        af afVar = new af(o.m21490f(), o.m21492g());
        o = new af(p.m21490f(), p.m21492g());
        af.m21467b(afVar, f, afVar);
        af.m21467b(o, f2, o);
        c6570b = c6570b.m29242b();
        float a = c6571c.m29269a();
        int h = c6570b.m21494h();
        af e = c6570b.m21489e(afVar);
        af.m21463a(e, o, e);
        e.m21476a(h);
        return new C6571c(e, a, c6571c.m29273d(), c6571c.m29274e(), 0.0f);
    }

    /* renamed from: a */
    public static C6571c m29040a(C6570b c6570b, C5046e c5046e, af afVar, float f) {
        af b = c6570b.m29242b();
        int f2 = b.m21490f() - afVar.m21490f();
        double d = (double) (-((float) ((((double) f) * 3.141592653589793d) / 180.0d)));
        float sin = (float) Math.sin(d);
        float cos = (float) Math.cos(d);
        float f3 = (float) f2;
        float g = (float) (b.m21492g() - afVar.m21492g());
        return c5046e.m22571a(new C6571c(new af((int) (((f3 * cos) - (g * sin)) + ((float) afVar.m21490f())), (int) (((f3 * sin) + (g * cos)) + ((float) afVar.m21492g()))), c6570b.m29256l(), c6570b.m29255k(), m29046c(c6570b.m29254j() + f), 0.0f));
    }

    /* renamed from: a */
    public static C6571c m29042a(C6571c c6571c, C6570b c6570b, C5046e c5046e, float f, float f2, float f3) {
        f2 -= ((float) c6570b.m29249e()) / 2.0f;
        f3 -= ((float) c6570b.m29250f()) / 2.0f;
        c6571c = c5046e.m22571a(m29041a(c6571c, c6570b, f2, f3));
        C6571c c6571c2 = new C6571c(c6571c.m29272c(), Math.min(f24472c, c6571c.m29269a() + f), c6571c.m29273d(), c6571c.m29274e(), 0.0f);
        c6570b.m29239a(c6571c2);
        return m29041a(c6571c2, c6570b, -f2, -f3);
    }
}
