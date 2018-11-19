package com.google.android.m4b.maps.bo;

public final class bq extends br {
    /* renamed from: b */
    private al f24144b;
    /* renamed from: c */
    private af f24145c;
    /* renamed from: d */
    private af f24146d;
    /* renamed from: e */
    private int f24147e;
    /* renamed from: f */
    private int f24148f;
    /* renamed from: g */
    private int f24149g;
    /* renamed from: h */
    private volatile af f24150h;
    /* renamed from: i */
    private volatile af f24151i;
    /* renamed from: j */
    private volatile af f24152j;
    /* renamed from: k */
    private volatile af f24153k;
    /* renamed from: l */
    private volatile af f24154l;
    /* renamed from: m */
    private volatile af f24155m;

    /* renamed from: a */
    public final bq mo5129a() {
        return this;
    }

    private bq(al alVar) {
        this.f24144b = alVar;
        af c = alVar.m32212c();
        alVar = alVar.m32213d();
        if (c.f17658a < 0) {
            this.f24147e = -c.f17658a;
        } else if (alVar.f17658a > 1073741824) {
            this.f24147e = 1073741824 - alVar.f17658a;
        }
        this.f24145c = new af();
        c.m21497i(this.f24145c);
        this.f24146d = new af();
        alVar.m21497i(this.f24146d);
        this.a = this.f24145c.f17658a > this.f24146d.f17658a;
        this.f24148f = c.f17658a + this.f24147e;
        this.f24149g = alVar.f17658a + this.f24147e;
    }

    /* renamed from: a */
    public static bq m28669a(al alVar) {
        return new bq(alVar);
    }

    /* renamed from: b */
    public final al m28675b() {
        return this.f24144b;
    }

    /* renamed from: d */
    public final int m28678d() {
        return this.f24144b.m32215f();
    }

    /* renamed from: e */
    public final int m28679e() {
        return this.f24146d.f17659b - this.f24145c.f17659b;
    }

    /* renamed from: f */
    public final af m28680f() {
        return this.f24145c;
    }

    /* renamed from: g */
    public final af m28681g() {
        return this.f24146d;
    }

    /* renamed from: a */
    public final boolean mo5131a(af afVar) {
        int i = (afVar.f17658a + this.f24147e) & 1073741823;
        return (i < this.f24148f || i > this.f24149g || afVar.f17659b < this.f24145c.f17659b || afVar.f17659b > this.f24146d.f17659b) ? null : true;
    }

    /* renamed from: a */
    public final boolean mo5132a(am amVar) {
        if (!this.a) {
            return this.f24144b.mo7069b(amVar);
        }
        amVar = amVar.mo5089a();
        if (this.f24145c.f17659b <= amVar.f27357a.f17659b) {
            if (this.f24146d.f17659b >= amVar.f27358b.f17659b) {
                int i = amVar.f27357a.f17658a;
                amVar = amVar.f27358b.f17658a;
                if ((this.f24145c.f17658a <= i && 536870912 > amVar) || (-536870912 <= i && this.f24146d.f17658a >= amVar)) {
                    return true;
                }
                if (i < -536870912) {
                    i += 1073741824;
                } else if (i >= 536870912) {
                    i -= 1073741824;
                }
                if (amVar < -536870912) {
                    amVar += 1073741824;
                } else if (amVar >= 536870912) {
                    amVar -= 1073741824;
                }
                if (this.f24145c.f17658a > i || this.f24146d.f17658a < r7) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo5135b(am amVar) {
        if (!this.a) {
            return this.f24144b.mo5091a(amVar);
        }
        if (!(amVar instanceof al)) {
            return super.mo5135b(amVar);
        }
        al alVar = (al) amVar;
        if (this.f24145c.f17659b <= alVar.f27358b.f17659b) {
            if (this.f24146d.f17659b >= alVar.f27357a.f17659b) {
                if ((this.f24145c.f17658a > alVar.f27358b.f17658a || 536870912 <= alVar.f27357a.f17658a) && (-536870912 > alVar.f27358b.f17658a || this.f24146d.f17658a < alVar.f27357a.f17658a)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final af mo5128a(int i) {
        switch (i) {
            case 0:
                if (this.f24150h == 0) {
                    this.f24150h = new af(this.f24146d.f17658a, this.f24145c.f17659b);
                }
                return this.f24150h;
            case 1:
                return this.f24146d;
            case 2:
                if (this.f24151i == 0) {
                    this.f24151i = new af(this.f24145c.f17658a, this.f24146d.f17659b);
                }
                return this.f24151i;
            case 3:
                return this.f24145c;
            default:
                throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: h */
    public final int mo5134h() {
        return this.a ? 6 : 4;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo5130a(int r7, com.google.android.m4b.maps.bo.af[] r8) {
        /*
        r6 = this;
        r0 = r6.a;
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x0095;
    L_0x0006:
        r0 = 2;
        r3 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r4 = 3;
        r5 = -536870913; // 0xffffffffdfffffff float:-3.6893486E19 double:NaN;
        switch(r7) {
            case 0: goto L_0x0087;
            case 1: goto L_0x006d;
            case 2: goto L_0x0053;
            case 3: goto L_0x0046;
            case 4: goto L_0x002c;
            case 5: goto L_0x0012;
            default: goto L_0x0010;
        };
    L_0x0010:
        goto L_0x0094;
    L_0x0012:
        r7 = r6.f24155m;
        if (r7 != 0) goto L_0x0021;
    L_0x0016:
        r7 = new com.google.android.m4b.maps.bo.af;
        r0 = r6.f24145c;
        r0 = r0.f17659b;
        r7.<init>(r5, r0);
        r6.f24155m = r7;
    L_0x0021:
        r7 = r6.f24155m;
        r8[r1] = r7;
        r7 = r6.mo5128a(r1);
        r8[r2] = r7;
        goto L_0x0094;
    L_0x002c:
        r7 = r6.mo5128a(r4);
        r8[r1] = r7;
        r7 = r6.f24154l;
        if (r7 != 0) goto L_0x0041;
    L_0x0036:
        r7 = new com.google.android.m4b.maps.bo.af;
        r0 = r6.f24145c;
        r0 = r0.f17659b;
        r7.<init>(r3, r0);
        r6.f24154l = r7;
    L_0x0041:
        r7 = r6.f24154l;
        r8[r2] = r7;
        goto L_0x00a4;
    L_0x0046:
        r7 = r6.mo5128a(r0);
        r8[r1] = r7;
        r7 = r6.mo5128a(r4);
        r8[r2] = r7;
        goto L_0x00a4;
    L_0x0053:
        r7 = r6.f24153k;
        if (r7 != 0) goto L_0x0062;
    L_0x0057:
        r7 = new com.google.android.m4b.maps.bo.af;
        r4 = r6.f24146d;
        r4 = r4.f17659b;
        r7.<init>(r3, r4);
        r6.f24153k = r7;
    L_0x0062:
        r7 = r6.f24153k;
        r8[r1] = r7;
        r7 = r6.mo5128a(r0);
        r8[r2] = r7;
        goto L_0x00a4;
    L_0x006d:
        r7 = r6.mo5128a(r2);
        r8[r1] = r7;
        r7 = r6.f24152j;
        if (r7 != 0) goto L_0x0082;
    L_0x0077:
        r7 = new com.google.android.m4b.maps.bo.af;
        r0 = r6.f24146d;
        r0 = r0.f17659b;
        r7.<init>(r5, r0);
        r6.f24152j = r7;
    L_0x0082:
        r7 = r6.f24152j;
        r8[r2] = r7;
        goto L_0x00a4;
    L_0x0087:
        r7 = r6.mo5128a(r1);
        r8[r1] = r7;
        r7 = r6.mo5128a(r2);
        r8[r2] = r7;
        goto L_0x00a4;
    L_0x0094:
        return;
    L_0x0095:
        r0 = r6.mo5128a(r7);
        r8[r1] = r0;
        r7 = r7 + r2;
        r7 = r7 % 4;
        r7 = r6.mo5128a(r7);
        r8[r2] = r7;
    L_0x00a4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bo.bq.a(int, com.google.android.m4b.maps.bo.af[]):void");
    }

    /* renamed from: c */
    public final /* synthetic */ am mo5133c() {
        return this.f24144b;
    }
}
