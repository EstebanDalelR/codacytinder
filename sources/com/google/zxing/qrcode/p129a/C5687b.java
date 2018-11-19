package com.google.zxing.qrcode.p129a;

import java.lang.reflect.Array;

/* renamed from: com.google.zxing.qrcode.a.b */
public final class C5687b {
    /* renamed from: a */
    private final byte[][] f21078a;
    /* renamed from: b */
    private final int f21079b;
    /* renamed from: c */
    private final int f21080c;

    public C5687b(int i, int i2) {
        this.f21078a = (byte[][]) Array.newInstance(byte.class, new int[]{i2, i});
        this.f21079b = i;
        this.f21080c = i2;
    }

    /* renamed from: a */
    public int m24900a() {
        return this.f21080c;
    }

    /* renamed from: b */
    public int m24904b() {
        return this.f21079b;
    }

    /* renamed from: a */
    public byte m24899a(int i, int i2) {
        return this.f21078a[i2][i];
    }

    /* renamed from: c */
    public byte[][] m24905c() {
        return this.f21078a;
    }

    /* renamed from: a */
    public void m24902a(int i, int i2, int i3) {
        this.f21078a[i2][i] = (byte) i3;
    }

    /* renamed from: a */
    public void m24903a(int i, int i2, boolean z) {
        this.f21078a[i2][i] = (byte) z;
    }

    /* renamed from: a */
    public void m24901a(byte b) {
        for (int i = 0; i < this.f21080c; i++) {
            for (int i2 = 0; i2 < this.f21079b; i2++) {
                this.f21078a[i][i2] = b;
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(((this.f21079b * 2) * this.f21080c) + 2);
        for (int i = 0; i < this.f21080c; i++) {
            for (int i2 = 0; i2 < this.f21079b; i2++) {
                switch (this.f21078a[i][i2]) {
                    case (byte) 0:
                        stringBuilder.append(" 0");
                        break;
                    case (byte) 1:
                        stringBuilder.append(" 1");
                        break;
                    default:
                        stringBuilder.append("  ");
                        break;
                }
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}
