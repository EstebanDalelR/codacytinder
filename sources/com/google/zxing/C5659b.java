package com.google.zxing;

import com.google.zxing.common.C5664a;
import com.google.zxing.common.C5665b;

/* renamed from: com.google.zxing.b */
public final class C5659b {
    /* renamed from: a */
    private final C5652a f20964a;
    /* renamed from: b */
    private C5665b f20965b;

    public C5659b(C5652a c5652a) {
        if (c5652a == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f20964a = c5652a;
    }

    /* renamed from: a */
    public int m24723a() {
        return this.f20964a.m24686c();
    }

    /* renamed from: b */
    public int m24725b() {
        return this.f20964a.m24687d();
    }

    /* renamed from: a */
    public C5664a m24724a(int i, C5664a c5664a) throws NotFoundException {
        return this.f20964a.m24683a(i, c5664a);
    }

    /* renamed from: c */
    public C5665b m24726c() throws NotFoundException {
        if (this.f20965b == null) {
            this.f20965b = this.f20964a.m24685b();
        }
        return this.f20965b;
    }

    /* renamed from: d */
    public boolean m24727d() {
        return this.f20964a.m24684a().m24777c();
    }

    /* renamed from: e */
    public C5659b m24728e() {
        return new C5659b(this.f20964a.m24682a(this.f20964a.m24684a().m24778d()));
    }

    public java.lang.String toString() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.m24726c();	 Catch:{ NotFoundException -> 0x0009 }
        r0 = r0.toString();	 Catch:{ NotFoundException -> 0x0009 }
        return r0;
    L_0x0009:
        r0 = "";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.b.toString():java.lang.String");
    }
}
