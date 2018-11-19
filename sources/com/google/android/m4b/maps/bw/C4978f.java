package com.google.android.m4b.maps.bw;

import java.lang.ref.SoftReference;

/* renamed from: com.google.android.m4b.maps.bw.f */
public final class C4978f {
    /* renamed from: a */
    private static final Object f18361a = new Object();
    /* renamed from: b */
    private static final Object f18362b = new Object();
    /* renamed from: c */
    private static final ThreadLocal<Object> f18363c = new C49771();
    /* renamed from: d */
    private static final ThreadLocal<SoftReference<byte[]>> f18364d = new ThreadLocal();

    /* renamed from: com.google.android.m4b.maps.bw.f$1 */
    class C49771 extends ThreadLocal<Object> {
        C49771() {
        }

        protected final Object initialValue() {
            return C4978f.f18362b;
        }
    }

    /* renamed from: a */
    public static byte[] m22260a(int i) {
        if (f18363c.get() != f18361a) {
            return null;
        }
        SoftReference softReference = (SoftReference) f18364d.get();
        if (softReference != null) {
            byte[] bArr = (byte[]) softReference.get();
            if (bArr != null && bArr.length >= i) {
                f18364d.remove();
                return bArr;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m22259a(byte[] bArr) {
        if (f18363c.get() == f18361a) {
            f18364d.set(new SoftReference(bArr));
        }
    }

    /* renamed from: a */
    public static void m22258a() {
        f18363c.set(f18361a);
    }

    /* renamed from: b */
    public static void m22261b() {
        f18363c.remove();
        f18364d.remove();
    }
}
