package com.google.android.m4b.maps.bo;

public final class al extends am {
    /* renamed from: a */
    protected af f27357a;
    /* renamed from: b */
    protected af f27358b;
    /* renamed from: c */
    private volatile af f27359c;
    /* renamed from: d */
    private volatile af f27360d;

    /* renamed from: a */
    public final al mo5089a() {
        return this;
    }

    /* renamed from: b */
    public final int mo7068b() {
        return 4;
    }

    public al(af afVar, af afVar2) {
        this.f27357a = afVar;
        this.f27358b = afVar2;
    }

    /* renamed from: a */
    public static al m32204a(af[] afVarArr) {
        af afVar = afVarArr[0];
        int i = afVar.f17658a;
        int i2 = afVar.f17659b;
        int i3 = i2;
        int i4 = i;
        for (int i5 = 1; i5 < afVarArr.length; i5++) {
            af afVar2 = afVarArr[i5];
            if (afVar2.f17658a < i) {
                i = afVar2.f17658a;
            }
            if (afVar2.f17658a > i4) {
                i4 = afVar2.f17658a;
            }
            if (afVar2.f17659b < i2) {
                i2 = afVar2.f17659b;
            }
            if (afVar2.f17659b > i3) {
                i3 = afVar2.f17659b;
            }
        }
        return new al(new af(i, i2), new af(i4, i3));
    }

    /* renamed from: a */
    public static al m32203a(af afVar, af afVar2) {
        int i;
        int i2;
        if (afVar.f17658a < afVar2.f17658a) {
            i = afVar.f17658a;
            i2 = afVar2.f17658a;
        } else {
            i = afVar2.f17658a;
            i2 = afVar.f17658a;
        }
        if (afVar.f17659b < afVar2.f17659b) {
            afVar = afVar.f17659b;
            afVar2 = afVar2.f17659b;
        } else {
            af afVar3 = afVar2.f17659b;
            afVar2 = afVar.f17659b;
            afVar = afVar3;
        }
        return new al(new af(i, afVar), new af(i2, afVar2));
    }

    /* renamed from: a */
    public static al m32202a(af afVar, int i) {
        return new al(new af(afVar.f17658a - i, afVar.f17659b - i), new af(afVar.f17658a + i, afVar.f17659b + i));
    }

    /* renamed from: c */
    public final af m32212c() {
        return this.f27357a;
    }

    /* renamed from: d */
    public final af m32213d() {
        return this.f27358b;
    }

    /* renamed from: e */
    public final af m32214e() {
        return new af((this.f27357a.f17658a + this.f27358b.f17658a) / 2, (this.f27357a.f17659b + this.f27358b.f17659b) / 2);
    }

    /* renamed from: f */
    public final int m32215f() {
        return this.f27358b.f17658a - this.f27357a.f17658a;
    }

    /* renamed from: g */
    public final int m32216g() {
        return this.f27358b.f17659b - this.f27357a.f17659b;
    }

    /* renamed from: a */
    public final boolean mo5090a(af afVar) {
        return (afVar.f17658a < this.f27357a.f17658a || afVar.f17658a > this.f27358b.f17658a || afVar.f17659b < this.f27357a.f17659b || afVar.f17659b > this.f27358b.f17659b) ? null : true;
    }

    /* renamed from: b */
    public final boolean mo7069b(am amVar) {
        amVar = amVar.mo5089a();
        return (this.f27357a.f17658a > amVar.f27357a.f17658a || this.f27357a.f17659b > amVar.f27357a.f17659b || this.f27358b.f17658a < amVar.f27358b.f17658a || this.f27358b.f17659b < amVar.f27358b.f17659b) ? null : true;
    }

    /* renamed from: a */
    public final boolean mo5091a(am amVar) {
        if (!(amVar instanceof al)) {
            return super.mo5091a(amVar);
        }
        al alVar = (al) amVar;
        return (this.f27357a.f17658a > alVar.f27358b.f17658a || this.f27357a.f17659b > alVar.f27358b.f17659b || this.f27358b.f17658a < alVar.f27357a.f17658a || this.f27358b.f17659b < alVar.f27357a.f17659b) ? null : true;
    }

    /* renamed from: a */
    public final af mo7067a(int i) {
        switch (i) {
            case 0:
                if (this.f27359c == 0) {
                    this.f27359c = new af(this.f27358b.f17658a, this.f27357a.f17659b);
                }
                return this.f27359c;
            case 1:
                return this.f27358b;
            case 2:
                if (this.f27360d == 0) {
                    this.f27360d = new af(this.f27357a.f17658a, this.f27358b.f17659b);
                }
                return this.f27360d;
            case 3:
                return this.f27357a;
            default:
                throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: h */
    public final af mo7070h() {
        return this.f27357a;
    }

    /* renamed from: a */
    final void m32207a(al alVar) {
        this.f27357a.f17658a = Math.min(this.f27357a.f17658a, alVar.f27357a.f17658a);
        this.f27357a.f17659b = Math.min(this.f27357a.f17659b, alVar.f27357a.f17659b);
        this.f27358b.f17658a = Math.max(this.f27358b.f17658a, alVar.f27358b.f17658a);
        this.f27358b.f17659b = Math.max(this.f27358b.f17659b, alVar.f27358b.f17659b);
        this.f27359c = null;
        this.f27360d = null;
    }

    public final int hashCode() {
        return ((this.f27358b.hashCode() + 31) * 31) + this.f27357a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        return alVar.f27358b.equals(this.f27358b) && alVar.f27357a.equals(this.f27357a) != null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27357a);
        String valueOf2 = String.valueOf(this.f27358b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 4) + String.valueOf(valueOf2).length());
        stringBuilder.append("[");
        stringBuilder.append(valueOf);
        stringBuilder.append(", ");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
