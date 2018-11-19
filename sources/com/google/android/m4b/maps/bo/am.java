package com.google.android.m4b.maps.bo;

public abstract class am implements C4847g {
    /* renamed from: a */
    public abstract af mo7067a(int i);

    /* renamed from: a */
    public abstract boolean mo5090a(af afVar);

    /* renamed from: b */
    public abstract int mo7068b();

    /* renamed from: h */
    public af mo7070h() {
        return mo7067a(mo7068b() - 1);
    }

    /* renamed from: a */
    public al mo5089a() {
        int i = mo7067a(0).f17658a;
        int i2 = mo7067a(0).f17659b;
        int i3 = i2;
        int i4 = i;
        for (int i5 = 1; i5 < mo7068b(); i5++) {
            i = Math.min(i, mo7067a(i5).f17658a);
            i4 = Math.max(i4, mo7067a(i5).f17658a);
            i2 = Math.min(i2, mo7067a(i5).f17659b);
            i3 = Math.max(i3, mo7067a(i5).f17659b);
        }
        return new al(new af(i, i2), new af(i4, i3));
    }

    /* renamed from: b */
    public boolean mo7069b(am amVar) {
        if (!mo5089a().mo5091a(amVar.mo5089a())) {
            return false;
        }
        for (int i = 0; i < amVar.mo7068b(); i++) {
            if (!mo5090a(amVar.mo7067a(i))) {
                return false;
            }
        }
        if (m28569c(amVar) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5091a(am amVar) {
        if (mo5089a().mo5091a(amVar.mo5089a()) && (mo5090a(amVar.mo7067a(0)) || amVar.mo5090a(mo7067a(0)) || m28569c(amVar) != null)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m28569c(am amVar) {
        int b = mo7068b();
        int b2 = amVar.mo7068b();
        if (b != 0) {
            if (b2 != 0) {
                af h = mo7070h();
                af h2 = amVar.mo7070h();
                af afVar = h;
                int i = 0;
                while (i < b) {
                    af a = mo7067a(i);
                    af afVar2 = h2;
                    int i2 = 0;
                    while (i2 < b2) {
                        af a2 = amVar.mo7067a(i2);
                        if (ah.m21503a(afVar, a, afVar2, a2)) {
                            return true;
                        }
                        i2++;
                        afVar2 = a2;
                    }
                    i++;
                    afVar = a;
                }
                return false;
            }
        }
        return false;
    }
}
