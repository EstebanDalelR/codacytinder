package com.google.zxing.aztec.p127a;

import com.google.zxing.common.C5664a;

/* renamed from: com.google.zxing.aztec.a.b */
final class C6991b extends C5658g {
    /* renamed from: b */
    private final short f25455b;
    /* renamed from: c */
    private final short f25456c;

    C6991b(C5658g c5658g, int i, int i2) {
        super(c5658g);
        this.f25455b = (short) i;
        this.f25456c = (short) i2;
    }

    /* renamed from: a */
    public void mo6174a(C5664a c5664a, byte[] bArr) {
        short s = (short) 0;
        while (s < this.f25456c) {
            if (s == (short) 0 || (s == (short) 31 && this.f25456c <= (short) 62)) {
                c5664a.m24752a(31, 5);
                if (this.f25456c > (short) 62) {
                    c5664a.m24752a(this.f25456c - 31, 16);
                } else if (s == (short) 0) {
                    c5664a.m24752a(Math.min(this.f25456c, 31), 5);
                } else {
                    c5664a.m24752a(this.f25456c - 31, 5);
                }
            }
            c5664a.m24752a(bArr[this.f25455b + s], 8);
            s++;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append(this.f25455b);
        stringBuilder.append("::");
        stringBuilder.append((this.f25455b + this.f25456c) - 1);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}
