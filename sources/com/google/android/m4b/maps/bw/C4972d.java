package com.google.android.m4b.maps.bw;

import java.util.zip.Inflater;

/* renamed from: com.google.android.m4b.maps.bw.d */
public final class C4972d {
    /* renamed from: a */
    private static final byte[] f18349a = new byte[]{(byte) 0};

    /* renamed from: com.google.android.m4b.maps.bw.d$a */
    public static class C4971a {
        /* renamed from: a */
        private final byte[] f18347a;
        /* renamed from: b */
        private final int f18348b;

        public C4971a(byte[] bArr, int i) {
            this.f18347a = bArr;
            this.f18348b = i;
        }

        /* renamed from: a */
        public final byte[] m22240a() {
            return this.f18347a;
        }

        /* renamed from: b */
        public final int m22241b() {
            return this.f18348b;
        }
    }

    /* renamed from: a */
    public static C4971a m22242a(byte[] bArr, int i, int i2) {
        Inflater inflater = new Inflater(true);
        try {
            inflater.setInput(bArr, i, i2);
            i2 *= 4;
            bArr = C4978f.m22260a(i2);
            if (bArr == null) {
                bArr = new byte[i2];
            }
            i = inflater.inflate(bArr);
            Object obj = null;
            while (!inflater.finished()) {
                Object obj2 = new byte[(bArr.length * 2)];
                System.arraycopy(bArr, 0, obj2, 0, i);
                bArr = inflater.inflate(obj2, i, obj2.length - i);
                if (bArr == null) {
                    if (!inflater.needsInput() || r2 != null) {
                        bArr = obj2;
                        break;
                    }
                    inflater.setInput(f18349a);
                    obj = 1;
                }
                i += bArr;
                Object obj3 = obj2;
            }
            i2 = new C4971a(bArr, i);
            return i2;
        } finally {
            inflater.end();
        }
    }
}
