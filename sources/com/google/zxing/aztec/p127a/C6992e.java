package com.google.zxing.aztec.p127a;

import com.google.zxing.common.C5664a;

/* renamed from: com.google.zxing.aztec.a.e */
final class C6992e extends C5658g {
    /* renamed from: b */
    private final short f25457b;
    /* renamed from: c */
    private final short f25458c;

    C6992e(C5658g c5658g, int i, int i2) {
        super(c5658g);
        this.f25457b = (short) i;
        this.f25458c = (short) i2;
    }

    /* renamed from: a */
    void mo6174a(C5664a c5664a, byte[] bArr) {
        c5664a.m24752a(this.f25457b, this.f25458c);
    }

    public String toString() {
        int i = (this.f25457b & ((1 << this.f25458c) - 1)) | (1 << this.f25458c);
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append(Integer.toBinaryString(i | (1 << this.f25458c)).substring(1));
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}
