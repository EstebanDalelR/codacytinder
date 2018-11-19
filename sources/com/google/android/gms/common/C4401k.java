package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.k */
abstract class C4401k extends C4293i {
    /* renamed from: b */
    private static final WeakReference<byte[]> f14584b = new WeakReference(null);
    /* renamed from: a */
    private WeakReference<byte[]> f14585a = f14584b;

    C4401k(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    final byte[] mo3776a() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f14585a.get();
            if (bArr == null) {
                bArr = mo4017b();
                this.f14585a = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: b */
    protected abstract byte[] mo4017b();
}
