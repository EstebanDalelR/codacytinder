package com.google.zxing.qrcode.decoder;

import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.google.zxing.qrcode.decoder.a */
public final class C5695a {
    /* renamed from: a */
    private static final int[] f21100a = new int[]{31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    /* renamed from: b */
    private static final C5695a[] f21101b = C5695a.m24969d();
    /* renamed from: c */
    private final int f21102c;
    /* renamed from: d */
    private final int[] f21103d;
    /* renamed from: e */
    private final C5694b[] f21104e;
    /* renamed from: f */
    private final int f21105f;

    /* renamed from: com.google.zxing.qrcode.decoder.a$a */
    public static final class C5693a {
        /* renamed from: a */
        private final int f21096a;
        /* renamed from: b */
        private final int f21097b;

        C5693a(int i, int i2) {
            this.f21096a = i;
            this.f21097b = i2;
        }

        /* renamed from: a */
        public int m24962a() {
            return this.f21096a;
        }

        /* renamed from: b */
        public int m24963b() {
            return this.f21097b;
        }
    }

    /* renamed from: com.google.zxing.qrcode.decoder.a$b */
    public static final class C5694b {
        /* renamed from: a */
        private final int f21098a;
        /* renamed from: b */
        private final C5693a[] f21099b;

        C5694b(int i, C5693a... c5693aArr) {
            this.f21098a = i;
            this.f21099b = c5693aArr;
        }

        /* renamed from: a */
        public int m24964a() {
            return this.f21098a;
        }

        /* renamed from: b */
        public int m24965b() {
            int i = 0;
            for (C5693a a : this.f21099b) {
                i += a.m24962a();
            }
            return i;
        }

        /* renamed from: c */
        public int m24966c() {
            return this.f21098a * m24965b();
        }

        /* renamed from: d */
        public C5693a[] m24967d() {
            return this.f21099b;
        }
    }

    private C5695a(int i, int[] iArr, C5694b... c5694bArr) {
        this.f21102c = i;
        this.f21103d = iArr;
        this.f21104e = c5694bArr;
        i = 0;
        iArr = c5694bArr[0].m24964a();
        c5694bArr = c5694bArr[0].m24967d();
        int length = c5694bArr.length;
        int i2 = 0;
        while (i < length) {
            C5693a c5693a = c5694bArr[i];
            i2 += c5693a.m24962a() * (c5693a.m24963b() + iArr);
            i++;
        }
        this.f21105f = i2;
    }

    /* renamed from: a */
    public int m24970a() {
        return this.f21102c;
    }

    /* renamed from: b */
    public int m24972b() {
        return this.f21105f;
    }

    /* renamed from: c */
    public int m24973c() {
        return (this.f21102c * 4) + 17;
    }

    /* renamed from: a */
    public C5694b m24971a(ErrorCorrectionLevel errorCorrectionLevel) {
        return this.f21104e[errorCorrectionLevel.ordinal()];
    }

    /* renamed from: a */
    public static C5695a m24968a(int i) {
        if (i > 0) {
            if (i <= 40) {
                return f21101b[i - 1];
            }
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        return String.valueOf(this.f21102c);
    }

    /* renamed from: d */
    private static C5695a[] m24969d() {
        r0 = new C5695a[40];
        int[] iArr = new int[0];
        C5694b[] c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(7, new C5693a(1, 19));
        c5694bArr[1] = new C5694b(10, new C5693a(1, 16));
        c5694bArr[2] = new C5694b(13, new C5693a(1, 13));
        c5694bArr[3] = new C5694b(17, new C5693a(1, 9));
        r0[0] = new C5695a(1, iArr, c5694bArr);
        iArr = new int[]{6, 18};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(10, new C5693a(1, 34));
        c5694bArr[1] = new C5694b(16, new C5693a(1, 28));
        c5694bArr[2] = new C5694b(22, new C5693a(1, 22));
        c5694bArr[3] = new C5694b(28, new C5693a(1, 16));
        r0[1] = new C5695a(2, iArr, c5694bArr);
        iArr = new int[]{6, 22};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(15, new C5693a(1, 55));
        c5694bArr[1] = new C5694b(26, new C5693a(1, 44));
        c5694bArr[2] = new C5694b(18, new C5693a(2, 17));
        c5694bArr[3] = new C5694b(22, new C5693a(2, 13));
        r0[2] = new C5695a(3, iArr, c5694bArr);
        iArr = new int[]{6, 26};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(20, new C5693a(1, 80));
        c5694bArr[1] = new C5694b(18, new C5693a(2, 32));
        c5694bArr[2] = new C5694b(26, new C5693a(2, 24));
        c5694bArr[3] = new C5694b(16, new C5693a(4, 9));
        r0[3] = new C5695a(4, iArr, c5694bArr);
        iArr = new int[]{6, 30};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(26, new C5693a(1, 108));
        c5694bArr[1] = new C5694b(24, new C5693a(2, 43));
        c5694bArr[2] = new C5694b(18, new C5693a(2, 15), new C5693a(2, 16));
        c5694bArr[3] = new C5694b(22, new C5693a(2, 11), new C5693a(2, 12));
        r0[4] = new C5695a(5, iArr, c5694bArr);
        iArr = new int[]{6, 34};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(18, new C5693a(2, 68));
        c5694bArr[1] = new C5694b(16, new C5693a(4, 27));
        c5694bArr[2] = new C5694b(24, new C5693a(4, 19));
        c5694bArr[3] = new C5694b(28, new C5693a(4, 15));
        r0[5] = new C5695a(6, iArr, c5694bArr);
        iArr = new int[]{6, 22, 38};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(20, new C5693a(2, 78));
        c5694bArr[1] = new C5694b(18, new C5693a(4, 31));
        c5694bArr[2] = new C5694b(18, new C5693a(2, 14), new C5693a(4, 15));
        c5694bArr[3] = new C5694b(26, new C5693a(4, 13), new C5693a(1, 14));
        r0[6] = new C5695a(7, iArr, c5694bArr);
        iArr = new int[]{6, 24, 42};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(24, new C5693a(2, 97));
        c5694bArr[1] = new C5694b(22, new C5693a(2, 38), new C5693a(2, 39));
        c5694bArr[2] = new C5694b(22, new C5693a(4, 18), new C5693a(2, 19));
        c5694bArr[3] = new C5694b(26, new C5693a(4, 14), new C5693a(2, 15));
        r0[7] = new C5695a(8, iArr, c5694bArr);
        iArr = new int[]{6, 26, 46};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(30, new C5693a(2, 116));
        c5694bArr[1] = new C5694b(22, new C5693a(3, 36), new C5693a(2, 37));
        c5694bArr[2] = new C5694b(20, new C5693a(4, 16), new C5693a(4, 17));
        c5694bArr[3] = new C5694b(24, new C5693a(4, 12), new C5693a(4, 13));
        r0[8] = new C5695a(9, iArr, c5694bArr);
        iArr = new int[]{6, 28, 50};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(18, new C5693a(2, 68), new C5693a(2, 69));
        c5694bArr[1] = new C5694b(26, new C5693a(4, 43), new C5693a(1, 44));
        c5694bArr[2] = new C5694b(24, new C5693a(6, 19), new C5693a(2, 20));
        c5694bArr[3] = new C5694b(28, new C5693a(6, 15), new C5693a(2, 16));
        r0[9] = new C5695a(10, iArr, c5694bArr);
        iArr = new int[]{6, 30, 54};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(20, new C5693a(4, 81));
        c5694bArr[1] = new C5694b(30, new C5693a(1, 50), new C5693a(4, 51));
        c5694bArr[2] = new C5694b(28, new C5693a(4, 22), new C5693a(4, 23));
        c5694bArr[3] = new C5694b(24, new C5693a(3, 12), new C5693a(8, 13));
        r0[10] = new C5695a(11, iArr, c5694bArr);
        iArr = new int[]{6, 32, 58};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(24, new C5693a(2, 92), new C5693a(2, 93));
        c5694bArr[1] = new C5694b(22, new C5693a(6, 36), new C5693a(2, 37));
        c5694bArr[2] = new C5694b(26, new C5693a(4, 20), new C5693a(6, 21));
        c5694bArr[3] = new C5694b(28, new C5693a(7, 14), new C5693a(4, 15));
        r0[11] = new C5695a(12, iArr, c5694bArr);
        iArr = new int[]{6, 34, 62};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(26, new C5693a(4, 107));
        c5694bArr[1] = new C5694b(22, new C5693a(8, 37), new C5693a(1, 38));
        c5694bArr[2] = new C5694b(24, new C5693a(8, 20), new C5693a(4, 21));
        c5694bArr[3] = new C5694b(22, new C5693a(12, 11), new C5693a(4, 12));
        r0[12] = new C5695a(13, iArr, c5694bArr);
        iArr = new int[]{6, 26, 46, 66};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(30, new C5693a(3, 115), new C5693a(1, 116));
        c5694bArr[1] = new C5694b(24, new C5693a(4, 40), new C5693a(5, 41));
        c5694bArr[2] = new C5694b(20, new C5693a(11, 16), new C5693a(5, 17));
        c5694bArr[3] = new C5694b(24, new C5693a(11, 12), new C5693a(5, 13));
        r0[13] = new C5695a(14, iArr, c5694bArr);
        iArr = new int[]{6, 26, 48, 70};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(22, new C5693a(5, 87), new C5693a(1, 88));
        c5694bArr[1] = new C5694b(24, new C5693a(5, 41), new C5693a(5, 42));
        c5694bArr[2] = new C5694b(30, new C5693a(5, 24), new C5693a(7, 25));
        c5694bArr[3] = new C5694b(24, new C5693a(11, 12), new C5693a(7, 13));
        r0[14] = new C5695a(15, iArr, c5694bArr);
        iArr = new int[]{6, 26, 50, 74};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(24, new C5693a(5, 98), new C5693a(1, 99));
        c5694bArr[1] = new C5694b(28, new C5693a(7, 45), new C5693a(3, 46));
        c5694bArr[2] = new C5694b(24, new C5693a(15, 19), new C5693a(2, 20));
        c5694bArr[3] = new C5694b(30, new C5693a(3, 15), new C5693a(13, 16));
        r0[15] = new C5695a(16, iArr, c5694bArr);
        iArr = new int[]{6, 30, 54, 78};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(28, new C5693a(1, 107), new C5693a(5, 108));
        c5694bArr[1] = new C5694b(28, new C5693a(10, 46), new C5693a(1, 47));
        c5694bArr[2] = new C5694b(28, new C5693a(1, 22), new C5693a(15, 23));
        c5694bArr[3] = new C5694b(28, new C5693a(2, 14), new C5693a(17, 15));
        r0[16] = new C5695a(17, iArr, c5694bArr);
        iArr = new int[]{6, 30, 56, 82};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(30, new C5693a(5, 120), new C5693a(1, 121));
        c5694bArr[1] = new C5694b(26, new C5693a(9, 43), new C5693a(4, 44));
        c5694bArr[2] = new C5694b(28, new C5693a(17, 22), new C5693a(1, 23));
        c5694bArr[3] = new C5694b(28, new C5693a(2, 14), new C5693a(19, 15));
        r0[17] = new C5695a(18, iArr, c5694bArr);
        iArr = new int[]{6, 30, 58, 86};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(28, new C5693a(3, 113), new C5693a(4, 114));
        c5694bArr[1] = new C5694b(26, new C5693a(3, 44), new C5693a(11, 45));
        c5694bArr[2] = new C5694b(26, new C5693a(17, 21), new C5693a(4, 22));
        c5694bArr[3] = new C5694b(26, new C5693a(9, 13), new C5693a(16, 14));
        r0[18] = new C5695a(19, iArr, c5694bArr);
        iArr = new int[]{6, 34, 62, 90};
        c5694bArr = new C5694b[4];
        c5694bArr[0] = new C5694b(28, new C5693a(3, 107), new C5693a(5, 108));
        c5694bArr[1] = new C5694b(26, new C5693a(3, 41), new C5693a(13, 42));
        c5694bArr[2] = new C5694b(30, new C5693a(15, 24), new C5693a(5, 25));
        c5694bArr[3] = new C5694b(28, new C5693a(15, 15), new C5693a(10, 16));
        r0[19] = new C5695a(20, iArr, c5694bArr);
        int[] iArr2 = new int[]{6, 28, 50, 72, 94};
        r3 = new C5694b[4];
        r3[0] = new C5694b(28, new C5693a(4, 116), new C5693a(4, 117));
        r3[1] = new C5694b(26, new C5693a(17, 42));
        r3[2] = new C5694b(28, new C5693a(17, 22), new C5693a(6, 23));
        r3[3] = new C5694b(30, new C5693a(19, 16), new C5693a(6, 17));
        r0[20] = new C5695a(21, iArr2, r3);
        iArr2 = new int[]{6, 26, 50, 74, 98};
        r3 = new C5694b[4];
        r3[0] = new C5694b(28, new C5693a(2, 111), new C5693a(7, 112));
        r3[1] = new C5694b(28, new C5693a(17, 46));
        r3[2] = new C5694b(30, new C5693a(7, 24), new C5693a(16, 25));
        r3[3] = new C5694b(24, new C5693a(34, 13));
        r0[21] = new C5695a(22, iArr2, r3);
        iArr2 = new int[]{6, 30, 54, 78, 102};
        r6 = new C5694b[4];
        r6[0] = new C5694b(30, new C5693a(4, 121), new C5693a(5, 122));
        r6[1] = new C5694b(28, new C5693a(4, 47), new C5693a(14, 48));
        r6[2] = new C5694b(30, new C5693a(11, 24), new C5693a(14, 25));
        r6[3] = new C5694b(30, new C5693a(16, 15), new C5693a(14, 16));
        r0[22] = new C5695a(23, iArr2, r6);
        iArr2 = new int[]{6, 28, 54, 80, 106};
        r3 = new C5694b[4];
        r3[0] = new C5694b(30, new C5693a(6, 117), new C5693a(4, 118));
        r3[1] = new C5694b(28, new C5693a(6, 45), new C5693a(14, 46));
        r3[2] = new C5694b(30, new C5693a(11, 24), new C5693a(16, 25));
        r3[3] = new C5694b(30, new C5693a(30, 16), new C5693a(2, 17));
        r0[23] = new C5695a(24, iArr2, r3);
        iArr2 = new int[]{6, 32, 58, 84, 110};
        r3 = new C5694b[4];
        r3[0] = new C5694b(26, new C5693a(8, 106), new C5693a(4, 107));
        r3[1] = new C5694b(28, new C5693a(8, 47), new C5693a(13, 48));
        r3[2] = new C5694b(30, new C5693a(7, 24), new C5693a(22, 25));
        r3[3] = new C5694b(30, new C5693a(22, 15), new C5693a(13, 16));
        r0[24] = new C5695a(25, iArr2, r3);
        iArr2 = new int[]{6, 30, 58, 86, 114};
        r3 = new C5694b[4];
        r3[0] = new C5694b(28, new C5693a(10, 114), new C5693a(2, 115));
        r3[1] = new C5694b(28, new C5693a(19, 46), new C5693a(4, 47));
        r3[2] = new C5694b(28, new C5693a(28, 22), new C5693a(6, 23));
        r3[3] = new C5694b(30, new C5693a(33, 16), new C5693a(4, 17));
        r0[25] = new C5695a(26, iArr2, r3);
        iArr2 = new int[]{6, 34, 62, 90, 118};
        r3 = new C5694b[4];
        r3[0] = new C5694b(30, new C5693a(8, 122), new C5693a(4, 123));
        r3[1] = new C5694b(28, new C5693a(22, 45), new C5693a(3, 46));
        r3[2] = new C5694b(30, new C5693a(8, 23), new C5693a(26, 24));
        r3[3] = new C5694b(30, new C5693a(12, 15), new C5693a(28, 16));
        r0[26] = new C5695a(27, iArr2, r3);
        iArr2 = new int[]{6, 26, 50, 74, 98, 122};
        r3 = new C5694b[4];
        r3[0] = new C5694b(30, new C5693a(3, 117), new C5693a(10, 118));
        r3[1] = new C5694b(28, new C5693a(3, 45), new C5693a(23, 46));
        r3[2] = new C5694b(30, new C5693a(4, 24), new C5693a(31, 25));
        r3[3] = new C5694b(30, new C5693a(11, 15), new C5693a(31, 16));
        r0[27] = new C5695a(28, iArr2, r3);
        iArr2 = new int[]{6, 30, 54, 78, 102, 126};
        r3 = new C5694b[4];
        r3[0] = new C5694b(30, new C5693a(7, 116), new C5693a(7, 117));
        r3[1] = new C5694b(28, new C5693a(21, 45), new C5693a(7, 46));
        r3[2] = new C5694b(30, new C5693a(1, 23), new C5693a(37, 24));
        r3[3] = new C5694b(30, new C5693a(19, 15), new C5693a(26, 16));
        r0[28] = new C5695a(29, iArr2, r3);
        iArr2 = new int[]{6, 26, 52, 78, 104, 130};
        r3 = new C5694b[4];
        r3[0] = new C5694b(30, new C5693a(5, 115), new C5693a(10, 116));
        r3[1] = new C5694b(28, new C5693a(19, 47), new C5693a(10, 48));
        r3[2] = new C5694b(30, new C5693a(15, 24), new C5693a(25, 25));
        r3[3] = new C5694b(30, new C5693a(23, 15), new C5693a(25, 16));
        r0[29] = new C5695a(30, iArr2, r3);
        iArr2 = new int[]{6, 30, 56, 82, 108, 134};
        r3 = new C5694b[4];
        r3[0] = new C5694b(30, new C5693a(13, 115), new C5693a(3, 116));
        r3[1] = new C5694b(28, new C5693a(2, 46), new C5693a(29, 47));
        r3[2] = new C5694b(30, new C5693a(42, 24), new C5693a(1, 25));
        r3[3] = new C5694b(30, new C5693a(23, 15), new C5693a(28, 16));
        r0[30] = new C5695a(31, iArr2, r3);
        iArr2 = new int[]{6, 34, 60, 86, 112, 138};
        r3 = new C5694b[4];
        r3[0] = new C5694b(30, new C5693a(17, 115));
        r3[1] = new C5694b(28, new C5693a(10, 46), new C5693a(23, 47));
        r3[2] = new C5694b(30, new C5693a(10, 24), new C5693a(35, 25));
        r3[3] = new C5694b(30, new C5693a(19, 15), new C5693a(35, 16));
        r0[31] = new C5695a(32, iArr2, r3);
        iArr2 = new int[]{6, 30, 58, 86, 114, 142};
        r3 = new C5694b[4];
        r3[0] = new C5694b(30, new C5693a(17, 115), new C5693a(1, 116));
        r3[1] = new C5694b(28, new C5693a(14, 46), new C5693a(21, 47));
        r3[2] = new C5694b(30, new C5693a(29, 24), new C5693a(19, 25));
        r3[3] = new C5694b(30, new C5693a(11, 15), new C5693a(46, 16));
        r0[32] = new C5695a(33, iArr2, r3);
        iArr2 = new int[]{6, 34, 62, 90, 118, 146};
        r3 = new C5694b[4];
        r3[0] = new C5694b(30, new C5693a(13, 115), new C5693a(6, 116));
        r3[1] = new C5694b(28, new C5693a(14, 46), new C5693a(23, 47));
        r3[2] = new C5694b(30, new C5693a(44, 24), new C5693a(7, 25));
        r3[3] = new C5694b(30, new C5693a(59, 16), new C5693a(1, 17));
        r0[33] = new C5695a(34, iArr2, r3);
        iArr2 = new int[]{6, 30, 54, 78, 102, 126, 150};
        r3 = new C5694b[4];
        r3[0] = new C5694b(30, new C5693a(12, 121), new C5693a(7, 122));
        r3[1] = new C5694b(28, new C5693a(12, 47), new C5693a(26, 48));
        r3[2] = new C5694b(30, new C5693a(39, 24), new C5693a(14, 25));
        r3[3] = new C5694b(30, new C5693a(22, 15), new C5693a(41, 16));
        r0[34] = new C5695a(35, iArr2, r3);
        iArr2 = new int[]{6, 24, 50, 76, 102, ProfileEditingConfig.DEFAULT_MAX_LENGTH, 154};
        r3 = new C5694b[4];
        r3[0] = new C5694b(30, new C5693a(6, 121), new C5693a(14, 122));
        r3[1] = new C5694b(28, new C5693a(6, 47), new C5693a(34, 48));
        r3[2] = new C5694b(30, new C5693a(46, 24), new C5693a(10, 25));
        r3[3] = new C5694b(30, new C5693a(2, 15), new C5693a(64, 16));
        r0[35] = new C5695a(36, iArr2, r3);
        iArr2 = new int[]{6, 28, 54, 80, 106, 132, 158};
        r3 = new C5694b[4];
        r3[0] = new C5694b(30, new C5693a(17, 122), new C5693a(4, 123));
        r3[1] = new C5694b(28, new C5693a(29, 46), new C5693a(14, 47));
        r3[2] = new C5694b(30, new C5693a(49, 24), new C5693a(10, 25));
        r3[3] = new C5694b(30, new C5693a(24, 15), new C5693a(46, 16));
        r0[36] = new C5695a(37, iArr2, r3);
        iArr2 = new int[]{6, 32, 58, 84, 110, 136, 162};
        r3 = new C5694b[4];
        r3[0] = new C5694b(30, new C5693a(4, 122), new C5693a(18, 123));
        r3[1] = new C5694b(28, new C5693a(13, 46), new C5693a(32, 47));
        r3[2] = new C5694b(30, new C5693a(48, 24), new C5693a(14, 25));
        r3[3] = new C5694b(30, new C5693a(42, 15), new C5693a(32, 16));
        r0[37] = new C5695a(38, iArr2, r3);
        iArr2 = new int[]{6, 26, 54, 82, 110, 138, 166};
        r3 = new C5694b[4];
        r3[0] = new C5694b(30, new C5693a(20, 117), new C5693a(4, 118));
        r3[1] = new C5694b(28, new C5693a(40, 47), new C5693a(7, 48));
        r3[2] = new C5694b(30, new C5693a(43, 24), new C5693a(22, 25));
        r3[3] = new C5694b(30, new C5693a(10, 15), new C5693a(67, 16));
        r0[38] = new C5695a(39, iArr2, r3);
        iArr = new int[]{6, 30, 58, 86, 114, 142, 170};
        r4 = new C5694b[4];
        r4[0] = new C5694b(30, new C5693a(19, 118), new C5693a(6, 119));
        r4[1] = new C5694b(28, new C5693a(18, 47), new C5693a(31, 48));
        r4[2] = new C5694b(30, new C5693a(34, 24), new C5693a(34, 25));
        r4[3] = new C5694b(30, new C5693a(20, 15), new C5693a(61, 16));
        r0[39] = new C5695a(40, iArr, r4);
        return r0;
    }
}
