package com.google.zxing.qrcode.p129a;

import com.google.zxing.WriterException;
import com.google.zxing.common.C5664a;
import com.google.zxing.qrcode.decoder.C5695a;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.google.zxing.qrcode.a.e */
final class C5691e {
    /* renamed from: a */
    private static final int[][] f21083a = new int[][]{new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    /* renamed from: b */
    private static final int[][] f21084b = new int[][]{new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    /* renamed from: c */
    private static final int[][] f21085c = new int[][]{new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, ProfileEditingConfig.DEFAULT_MAX_LENGTH, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    /* renamed from: d */
    private static final int[][] f21086d = new int[][]{new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: b */
    private static boolean m24949b(int i) {
        return i == -1;
    }

    /* renamed from: a */
    static void m24941a(C5687b c5687b) {
        c5687b.m24901a((byte) -1);
    }

    /* renamed from: a */
    static void m24940a(C5664a c5664a, ErrorCorrectionLevel errorCorrectionLevel, C5695a c5695a, int i, C5687b c5687b) throws WriterException {
        C5691e.m24941a(c5687b);
        C5691e.m24945a(c5695a, c5687b);
        C5691e.m24943a(errorCorrectionLevel, i, c5687b);
        C5691e.m24948b(c5695a, c5687b);
        C5691e.m24939a(c5664a, i, c5687b);
    }

    /* renamed from: a */
    static void m24945a(C5695a c5695a, C5687b c5687b) throws WriterException {
        C5691e.m24954d(c5687b);
        C5691e.m24951c(c5687b);
        C5691e.m24952c(c5695a, c5687b);
        C5691e.m24947b(c5687b);
    }

    /* renamed from: a */
    static void m24943a(ErrorCorrectionLevel errorCorrectionLevel, int i, C5687b c5687b) throws WriterException {
        C5664a c5664a = new C5664a();
        C5691e.m24942a(errorCorrectionLevel, i, c5664a);
        for (i = 0; i < c5664a.m24751a(); i++) {
            boolean a = c5664a.m24756a((c5664a.m24751a() - 1) - i);
            c5687b.m24903a(f21086d[i][null], f21086d[i][1], a);
            if (i < 8) {
                c5687b.m24903a((c5687b.m24904b() - i) - 1, 8, a);
            } else {
                c5687b.m24903a(8, (c5687b.m24900a() - 7) + (i - 8), a);
            }
        }
    }

    /* renamed from: b */
    static void m24948b(C5695a c5695a, C5687b c5687b) throws WriterException {
        if (c5695a.m24970a() >= 7) {
            C5664a c5664a = new C5664a();
            C5691e.m24944a(c5695a, c5664a);
            int i = null;
            int i2 = 17;
            while (i < 6) {
                int i3 = i2;
                for (i2 = 0; i2 < 3; i2++) {
                    boolean a = c5664a.m24756a(i3);
                    i3--;
                    c5687b.m24903a(i, (c5687b.m24900a() - 11) + i2, a);
                    c5687b.m24903a((c5687b.m24900a() - 11) + i2, i, a);
                }
                i++;
                i2 = i3;
            }
        }
    }

    /* renamed from: a */
    static void m24939a(C5664a c5664a, int i, C5687b c5687b) throws WriterException {
        int b = c5687b.m24904b() - 1;
        int a = c5687b.m24900a() - 1;
        int i2 = 0;
        int i3 = -1;
        while (b > 0) {
            if (b == 6) {
                b--;
            }
            while (a >= 0 && a < c5687b.m24900a()) {
                int i4 = i2;
                for (i2 = 0; i2 < 2; i2++) {
                    int i5 = b - i2;
                    if (C5691e.m24949b(c5687b.m24899a(i5, a))) {
                        boolean a2;
                        if (i4 < c5664a.m24751a()) {
                            a2 = c5664a.m24756a(i4);
                            i4++;
                        } else {
                            a2 = false;
                        }
                        if (i != -1 && C5690d.m24930a(i, i5, a)) {
                            a2 = !a2;
                        }
                        c5687b.m24903a(i5, a, a2);
                    }
                }
                a += i3;
                i2 = i4;
            }
            i3 = -i3;
            a += i3;
            b -= 2;
        }
        if (i2 != c5664a.m24751a()) {
            c5687b = new StringBuilder("Not all bits consumed: ");
            c5687b.append(i2);
            c5687b.append('/');
            c5687b.append(c5664a.m24751a());
            throw new WriterException(c5687b.toString());
        }
    }

    /* renamed from: a */
    static int m24936a(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: a */
    static int m24937a(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int a = C5691e.m24936a(i2);
        i <<= a - 1;
        while (C5691e.m24936a(i) >= a) {
            i ^= i2 << (C5691e.m24936a(i) - a);
        }
        return i;
    }

    /* renamed from: a */
    static void m24942a(ErrorCorrectionLevel errorCorrectionLevel, int i, C5664a c5664a) throws WriterException {
        if (C5692f.m24955b(i)) {
            int bits = (errorCorrectionLevel.getBits() << 3) | i;
            c5664a.m24752a(bits, 5);
            c5664a.m24752a(C5691e.m24937a(bits, 1335), 10);
            C5664a c5664a2 = new C5664a();
            c5664a2.m24752a(21522, 15);
            c5664a.m24760b(c5664a2);
            if (c5664a.m24751a() != 15) {
                i = new StringBuilder("should not happen but we got: ");
                i.append(c5664a.m24751a());
                throw new WriterException(i.toString());
            }
            return;
        }
        throw new WriterException("Invalid mask pattern");
    }

    /* renamed from: a */
    static void m24944a(C5695a c5695a, C5664a c5664a) throws WriterException {
        c5664a.m24752a(c5695a.m24970a(), 6);
        c5664a.m24752a(C5691e.m24937a(c5695a.m24970a(), 7973), 12);
        if (c5664a.m24751a() != 18) {
            StringBuilder stringBuilder = new StringBuilder("should not happen but we got: ");
            stringBuilder.append(c5664a.m24751a());
            throw new WriterException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private static void m24947b(C5687b c5687b) {
        int i = 8;
        while (i < c5687b.m24904b() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (C5691e.m24949b(c5687b.m24899a(i, 6))) {
                c5687b.m24902a(i, 6, i3);
            }
            if (C5691e.m24949b(c5687b.m24899a(6, i))) {
                c5687b.m24902a(6, i, i3);
            }
            i = i2;
        }
    }

    /* renamed from: c */
    private static void m24951c(C5687b c5687b) throws WriterException {
        if (c5687b.m24899a(8, c5687b.m24900a() - 8) == (byte) 0) {
            throw new WriterException();
        }
        c5687b.m24902a(8, c5687b.m24900a() - 8, 1);
    }

    /* renamed from: a */
    private static void m24938a(int i, int i2, C5687b c5687b) throws WriterException {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (C5691e.m24949b(c5687b.m24899a(i4, i2))) {
                c5687b.m24902a(i4, i2, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: b */
    private static void m24946b(int i, int i2, C5687b c5687b) throws WriterException {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (C5691e.m24949b(c5687b.m24899a(i, i4))) {
                c5687b.m24902a(i, i4, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: c */
    private static void m24950c(int i, int i2, C5687b c5687b) {
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 5; i4++) {
                c5687b.m24902a(i + i4, i2 + i3, f21084b[i3][i4]);
            }
        }
    }

    /* renamed from: d */
    private static void m24953d(int i, int i2, C5687b c5687b) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                c5687b.m24902a(i + i4, i2 + i3, f21083a[i3][i4]);
            }
        }
    }

    /* renamed from: d */
    private static void m24954d(C5687b c5687b) throws WriterException {
        int length = f21083a[0].length;
        C5691e.m24953d(0, 0, c5687b);
        C5691e.m24953d(c5687b.m24904b() - length, 0, c5687b);
        C5691e.m24953d(0, c5687b.m24904b() - length, c5687b);
        C5691e.m24938a(0, 7, c5687b);
        C5691e.m24938a(c5687b.m24904b() - 8, 7, c5687b);
        C5691e.m24938a(0, c5687b.m24904b() - 8, c5687b);
        C5691e.m24946b(7, 0, c5687b);
        C5691e.m24946b((c5687b.m24900a() - 7) - 1, 0, c5687b);
        C5691e.m24946b(7, c5687b.m24900a() - 7, c5687b);
    }

    /* renamed from: c */
    private static void m24952c(C5695a c5695a, C5687b c5687b) {
        if (c5695a.m24970a() >= 2) {
            c5695a = c5695a.m24970a() - 1;
            int[] iArr = f21085c[c5695a];
            c5695a = f21085c[c5695a].length;
            for (int i = 0; i < c5695a; i++) {
                for (int i2 = 0; i2 < c5695a; i2++) {
                    int i3 = iArr[i];
                    int i4 = iArr[i2];
                    if (!(i4 == -1 || i3 == -1 || !C5691e.m24949b(c5687b.m24899a(i4, i3)))) {
                        C5691e.m24950c(i4 - 2, i3 - 2, c5687b);
                    }
                }
            }
        }
    }
}
