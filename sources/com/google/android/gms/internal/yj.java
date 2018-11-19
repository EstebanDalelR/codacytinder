package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public abstract class yj implements zzdvf {
    /* renamed from: a */
    static final int[] f23510a = m27498a(ByteBuffer.wrap(new byte[]{(byte) 101, (byte) 120, (byte) 112, (byte) 97, (byte) 110, (byte) 100, (byte) 32, (byte) 51, (byte) 50, (byte) 45, (byte) 98, (byte) 121, (byte) 116, (byte) 101, (byte) 32, (byte) 107}));
    /* renamed from: c */
    private static final byte[] f23511c = new byte[16];
    /* renamed from: b */
    final zj f23512b;

    yj(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        this.f23512b = zj.m20281a(bArr);
    }

    /* renamed from: a */
    static int m27495a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* renamed from: a */
    static yj m27496a(byte[] bArr) {
        return new yl(bArr, null);
    }

    /* renamed from: a */
    private static void m27497a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, yn ynVar) {
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        while (byteBuffer2.hasRemaining()) {
            int remaining = byteBuffer2.remaining() < 64 ? byteBuffer2.remaining() : 64;
            order.asIntBuffer().put(ynVar.m20269a());
            for (int i = 0; i < remaining; i++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ order.get(i)));
            }
        }
    }

    /* renamed from: a */
    static int[] m27498a(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* renamed from: a */
    abstract int mo7500a();

    /* renamed from: a */
    final void m27500a(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > 2147483635) {
            throw new GeneralSecurityException("plaintext too long");
        } else if (byteBuffer.remaining() < bArr.length + 12) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        } else {
            byte[] a = zm.m20287a(12);
            byteBuffer.put(a);
            m27497a(byteBuffer, ByteBuffer.wrap(bArr), mo7502b(a));
        }
    }

    /* renamed from: a */
    abstract int[] mo7501a(byte[] bArr, int i);

    /* renamed from: a */
    final int[] m27502a(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        mo6909b(copyOf);
        for (int i = 0; i < iArr.length; i++) {
            copyOf[i] = copyOf[i] + iArr[i];
        }
        return copyOf;
    }

    /* renamed from: b */
    abstract yn mo7502b(byte[] bArr);

    /* renamed from: b */
    abstract void mo6909b(int[] iArr);

    /* renamed from: c */
    abstract void mo7503c(int[] iArr);

    public final byte[] zzag(byte[] bArr) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 12);
        m27500a(allocate, bArr);
        return allocate.array();
    }
}
