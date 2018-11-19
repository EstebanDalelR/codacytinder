package com.google.android.gms.internal;

import java.io.IOException;

public abstract class adz<M extends adz<M>> extends aee {
    /* renamed from: X */
    protected aeb f22896X;

    /* renamed from: a */
    protected int mo4217a() {
        if (this.f22896X == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f22896X.m19037a(); i2++) {
            i += this.f22896X.m19040b(i2).m19044a();
        }
        return i;
    }

    /* renamed from: a */
    public void mo4218a(ady ady) throws IOException {
        if (this.f22896X != null) {
            for (int i = 0; i < this.f22896X.m19037a(); i++) {
                this.f22896X.m19040b(i).m19045a(ady);
            }
        }
    }

    /* renamed from: a */
    protected final boolean m27063a(adx adx, int i) throws IOException {
        int m = adx.m18998m();
        if (!adx.m18984b(i)) {
            return false;
        }
        int i2 = i >>> 3;
        aeg aeg = new aeg(i, adx.m18981a(m, adx.m18998m() - m));
        aec aec = null;
        if (this.f22896X == null) {
            this.f22896X = new aeb();
        } else {
            aec = this.f22896X.m19038a(i2);
        }
        if (aec == null) {
            aec = new aec();
            this.f22896X.m19039a(i2, aec);
        }
        aec.m19046a(aeg);
        return true;
    }

    /* renamed from: c */
    public M mo6840c() throws CloneNotSupportedException {
        adz adz = (adz) super.mo4220d();
        aed.m19051a(this, adz);
        return adz;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return mo6840c();
    }

    /* renamed from: d */
    public /* synthetic */ aee mo4220d() throws CloneNotSupportedException {
        return (adz) clone();
    }
}
