package com.google.android.gms.internal;

import java.io.IOException;

public abstract class aee {
    /* renamed from: Y */
    protected volatile int f15104Y = -1;

    /* renamed from: a */
    public static final <T extends aee> T m19056a(T t, byte[] bArr) throws zzfjr {
        return m19057a(t, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private static <T extends aee> T m19057a(T t, byte[] bArr, int i, int i2) throws zzfjr {
        try {
            adx a = adx.m18974a(bArr, 0, i2);
            t.mo6839a(a);
            a.m18979a(0);
            return t;
        } catch (zzfjr e) {
            throw e;
        } catch (Throwable e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    /* renamed from: a */
    public static final byte[] m19058a(aee aee) {
        byte[] bArr = new byte[aee.m19064f()];
        try {
            ady a = ady.m19005a(bArr, 0, bArr.length);
            aee.mo4218a(a);
            a.m19020a();
            return bArr;
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: a */
    protected int mo4217a() {
        return 0;
    }

    /* renamed from: a */
    public abstract aee mo6839a(adx adx) throws IOException;

    /* renamed from: a */
    public void mo4218a(ady ady) throws IOException {
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return mo4220d();
    }

    /* renamed from: d */
    public aee mo4220d() throws CloneNotSupportedException {
        return (aee) super.clone();
    }

    /* renamed from: e */
    public final int m19063e() {
        if (this.f15104Y < 0) {
            m19064f();
        }
        return this.f15104Y;
    }

    /* renamed from: f */
    public final int m19064f() {
        int a = mo4217a();
        this.f15104Y = a;
        return a;
    }

    public String toString() {
        return aef.m19065a(this);
    }
}
