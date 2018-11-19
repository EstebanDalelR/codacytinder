package com.google.android.m4b.maps.bo;

public abstract class br {
    /* renamed from: a */
    protected boolean f17803a;

    /* renamed from: a */
    public abstract af mo5128a(int i);

    /* renamed from: a */
    public abstract void mo5130a(int i, af[] afVarArr);

    /* renamed from: a */
    public abstract boolean mo5131a(af afVar);

    /* renamed from: c */
    public abstract am mo5133c();

    /* renamed from: h */
    public abstract int mo5134h();

    /* renamed from: a */
    public bq mo5129a() {
        return bq.m28669a(mo5133c().mo5089a());
    }

    /* renamed from: a */
    public boolean mo5132a(am amVar) {
        if (!mo5129a().mo5135b(amVar.mo5089a())) {
            return false;
        }
        for (int i = 0; i < amVar.mo7068b(); i++) {
            if (!mo5131a(amVar.mo7067a(i))) {
                return false;
            }
        }
        if (m21729c(amVar) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo5135b(am amVar) {
        if (mo5129a().mo5135b(amVar.mo5089a()) && (mo5131a(amVar.mo7067a(0)) || amVar.mo5090a(mo5128a(0)) || m21729c(amVar) != null)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m21729c(am amVar) {
        int h = mo5134h();
        int b = amVar.mo7068b();
        if (h != 0) {
            if (b != 0) {
                af[] afVarArr = new af[2];
                af h2 = amVar.mo7070h();
                for (int i = 0; i < h; i++) {
                    mo5130a(i, afVarArr);
                    af afVar = h2;
                    int i2 = 0;
                    while (i2 < b) {
                        af a = amVar.mo7067a(i2);
                        if (ah.m21503a(afVarArr[0], afVarArr[1], afVar, a)) {
                            return true;
                        }
                        i2++;
                        afVar = a;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
