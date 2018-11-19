package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public abstract class yo implements zzdpp {
    /* renamed from: a */
    private final yj f23513a;

    private yo(yj yjVar) {
        this.f23513a = yjVar;
    }

    /* renamed from: a */
    public static yo m27507a(byte[] bArr) {
        return new yq(yj.m27496a(bArr), null);
    }

    /* renamed from: b */
    private static int m27508b(int i) {
        return (((i + 16) - 1) / 16) << 4;
    }

    /* renamed from: a */
    abstract byte[] mo6910a(byte[] bArr, ByteBuffer byteBuffer);

    public final byte[] zzd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate((this.f23513a.mo7500a() + bArr.length) + 16);
        if (allocate.remaining() < (bArr.length + this.f23513a.mo7500a()) + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = allocate.position();
        this.f23513a.m27500a(allocate, bArr);
        allocate.position(position);
        bArr = new byte[this.f23513a.mo7500a()];
        allocate.get(bArr);
        allocate.limit(allocate.limit() - 16);
        bArr = zl.m20286a(new yn(this.f23513a, bArr, 0).m20268a(32), mo6910a(bArr2, allocate));
        allocate.limit(allocate.limit() + 16);
        allocate.put(bArr);
        return allocate.array();
    }
}
