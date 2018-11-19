package com.google.android.m4b.maps.ai;

/* renamed from: com.google.android.m4b.maps.ai.a */
public final class C6391a implements C4628d {
    /* renamed from: a */
    private static final C4628d f23720a = new C6391a();

    private C6391a() {
    }

    /* renamed from: a */
    public static C4628d m27900a() {
        return f23720a;
    }

    /* renamed from: a */
    public final void mo4859a(C4627c c4627c, int i, int i2) {
        for (int i3 = i; i3 <= i2; i3++) {
            for (int i4 = i3; i4 > i; i4--) {
                int i5 = i4 - 1;
                if (!c4627c.mo5032a(i4, i5)) {
                    break;
                }
                c4627c.mo5034b(i4, i5);
            }
        }
    }
}
