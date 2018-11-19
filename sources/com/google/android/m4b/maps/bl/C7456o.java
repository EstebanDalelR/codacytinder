package com.google.android.m4b.maps.bl;

import com.google.android.m4b.maps.bl.C4816i.C4815b;

/* renamed from: com.google.android.m4b.maps.bl.o */
public final class C7456o extends C6476r {
    public C7456o(C4815b c4815b) {
        super(c4815b);
        this.b = 0.05f;
        this.c = (float) Math.tan(0.3490658503988659d);
    }

    /* renamed from: a */
    protected final float mo7065a(C4812h c4812h, int i) {
        return c4812h.mo5046b(i);
    }

    /* renamed from: b */
    protected final float mo7066b(C4812h c4812h, int i) {
        return c4812h.mo5044a(i);
    }

    /* renamed from: a */
    protected final float mo7064a(float f) {
        return Math.min(Math.abs(f), (float) Math.abs(((double) Math.abs(f)) - 3.141592653589793d));
    }

    /* renamed from: b */
    protected final boolean mo5072b(C4816i c4816i) {
        return this.a.mo5069h(c4816i);
    }

    /* renamed from: d */
    protected final void mo5073d(C4816i c4816i) {
        this.a.mo5070i(c4816i);
    }

    /* renamed from: f */
    protected final boolean mo5074f(C4816i c4816i) {
        return this.a.mo5068g(c4816i);
    }
}
