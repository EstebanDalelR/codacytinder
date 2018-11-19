package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class yq extends yo {
    private yq(yj yjVar) {
        super(yjVar);
    }

    /* renamed from: a */
    final byte[] mo6910a(byte[] bArr, ByteBuffer byteBuffer) {
        int a = yo.m27508b(bArr.length);
        int remaining = byteBuffer.remaining();
        int a2 = yo.m27508b(remaining) + a;
        ByteBuffer order = ByteBuffer.allocate(a2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(a);
        order.put(byteBuffer);
        order.position(a2);
        order.putLong((long) bArr.length);
        order.putLong((long) remaining);
        return order.array();
    }
}
