package com.google.android.m4b.maps.ct;

import com.google.android.m4b.maps.ct.C5255d.C5254b;
import com.google.android.m4b.maps.ct.C6656q.C6655a;

/* renamed from: com.google.android.m4b.maps.ct.a */
public abstract class C7527a implements C6656q {
    /* renamed from: a */
    private int f28125a = 0;

    /* renamed from: com.google.android.m4b.maps.ct.a$a */
    public static abstract class C7526a<BuilderType extends C7526a> implements C6655a {
        /* renamed from: a */
        public abstract BuilderType mo7573a();

        /* renamed from: a */
        public abstract BuilderType mo7574a(C5257e c5257e, C5262h c5262h);

        /* renamed from: a */
        public final /* synthetic */ C6655a mo7221a(C5255d c5255d, C5262h c5262h) {
            return m33193b(c5255d, c5262h);
        }

        /* renamed from: b */
        public /* synthetic */ C6655a mo7223b(C5257e c5257e, C5262h c5262h) {
            return mo7574a(c5257e, c5262h);
        }

        public /* synthetic */ Object clone() {
            return mo7573a();
        }

        /* renamed from: b */
        private BuilderType m33193b(C5255d c5255d, C5262h c5262h) {
            try {
                C5257e d = c5255d.mo5383d();
                mo7574a(d, c5262h);
                d.m23292a((int) null);
                return this;
            } catch (C5255d c5255d2) {
                throw c5255d2;
            } catch (C5255d c5255d22) {
                throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", c5255d22);
            }
        }

        /* renamed from: a */
        private BuilderType m33192a(byte[] bArr, int i, int i2) {
            try {
                C5257e a = C5257e.m23281a(bArr, 0, i2);
                mo7574a(a, C5262h.m23371a());
                a.m23292a(0);
                return this;
            } catch (byte[] bArr2) {
                throw bArr2;
            } catch (byte[] bArr22) {
                throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", bArr22);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ C6655a mo7222a(byte[] bArr) {
            return m33192a(bArr, 0, bArr.length);
        }
    }

    /* renamed from: e */
    public final C5255d mo7224e() {
        try {
            C5254b a = C5255d.m23267a(mo7634a());
            mo7636a(a.m23266b());
            return a.m23265a();
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: f */
    public final byte[] mo7225f() {
        try {
            byte[] bArr = new byte[mo7634a()];
            C5259f a = C5259f.m23321a(bArr);
            mo7636a(a);
            a.m23367h();
            return bArr;
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }
}
