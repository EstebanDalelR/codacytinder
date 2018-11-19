package com.google.android.m4b.maps.bv;

/* renamed from: com.google.android.m4b.maps.bv.r */
final class C4945r {
    /* renamed from: a */
    private final C4933j<String, C4944q> f18287a = new C4933j(50);

    C4945r(int i) {
    }

    /* renamed from: a */
    public final void m22181a(C4944q c4944q) {
        this.f18287a.m22108b(c4944q.f18269i, c4944q);
    }

    /* renamed from: a */
    public final C4944q m22180a(String str) {
        if (str == null) {
            return null;
        }
        C4944q c4944q = (C4944q) this.f18287a.m22104a((Object) str);
        if (c4944q == null || !c4944q.m22176a()) {
            return c4944q;
        }
        this.f18287a.m22106b((Object) str);
        return null;
    }
}
