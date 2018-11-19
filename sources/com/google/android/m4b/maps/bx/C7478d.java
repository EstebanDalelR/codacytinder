package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bz.C6570b;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bx.d */
public abstract class C7478d extends C6561r {
    /* renamed from: a */
    protected final C7481o f27551a;
    /* renamed from: b */
    private C5004a f27552b;

    /* renamed from: com.google.android.m4b.maps.bx.d$a */
    public interface C5004a {
        /* renamed from: a */
        void mo4934a(C5003c c5003c);
    }

    /* renamed from: a */
    public abstract void mo7563a(List<C5011l> list, float f, float f2, af afVar, C6570b c6570b, int i);

    public final boolean b_() {
        return true;
    }

    /* renamed from: j */
    public final int m32465j() {
        return 1;
    }

    public C7478d(C7481o c7481o) {
        this.f27551a = c7481o;
    }

    /* renamed from: a */
    public final void m32462a(C5004a c5004a) {
        this.f27552b = c5004a;
    }

    /* renamed from: a */
    protected final boolean m32464a(C5003c c5003c) {
        boolean i_ = i_();
        if (this.f27552b == null) {
            return i_;
        }
        this.f27552b.mo4934a(c5003c);
        return true;
    }
}
