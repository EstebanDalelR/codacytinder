package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class yn {
    /* renamed from: a */
    private yj f16642a;
    /* renamed from: b */
    private int[] f16643b;
    /* renamed from: c */
    private int[] f16644c;
    /* renamed from: d */
    private int[] f16645d = new int[16];
    /* renamed from: e */
    private int f16646e = 0;
    /* renamed from: f */
    private boolean f16647f;

    yn(yj yjVar, byte[] bArr, int i) {
        this.f16642a = yjVar;
        this.f16643b = yjVar.mo7501a(bArr, i);
        this.f16644c = yjVar.m27502a(this.f16643b);
        this.f16647f = false;
    }

    /* renamed from: a */
    final byte[] m20268a(int i) {
        if (this.f16647f) {
            throw new IllegalStateException("first can only be called once and before next().");
        }
        this.f16647f = true;
        this.f16646e = 8;
        ByteBuffer order = ByteBuffer.allocate(32).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(this.f16644c, 0, 8);
        return order.array();
    }

    /* renamed from: a */
    final int[] m20269a() {
        this.f16647f = true;
        System.arraycopy(this.f16644c, this.f16646e, this.f16645d, 0, 16 - this.f16646e);
        this.f16642a.mo7503c(this.f16643b);
        this.f16644c = this.f16642a.m27502a(this.f16643b);
        System.arraycopy(this.f16644c, 0, this.f16645d, 16 - this.f16646e, this.f16646e);
        return this.f16645d;
    }
}
