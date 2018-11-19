package com.google.android.gms.internal;

import java.nio.ByteBuffer;

final class yl extends ym {
    private yl(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    final int mo7500a() {
        return 12;
    }

    /* renamed from: a */
    final int[] mo7501a(byte[] bArr, int i) {
        Object obj = new int[16];
        ym.m31669e(obj);
        ym.m31667b(obj, this.b.m20282a());
        obj[12] = i;
        System.arraycopy(yj.m27498a(ByteBuffer.wrap(bArr)), 0, obj, 13, 3);
        return obj;
    }

    /* renamed from: b */
    final yn mo7502b(byte[] bArr) {
        return new yn(this, bArr, 1);
    }

    /* renamed from: c */
    final void mo7503c(int[] iArr) {
        iArr[12] = iArr[12] + 1;
    }
}
