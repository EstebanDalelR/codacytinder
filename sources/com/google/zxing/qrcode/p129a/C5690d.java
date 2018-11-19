package com.google.zxing.qrcode.p129a;

/* renamed from: com.google.zxing.qrcode.a.d */
final class C5690d {
    /* renamed from: a */
    static int m24928a(C5687b c5687b) {
        return C5690d.m24929a(c5687b, true) + C5690d.m24929a(c5687b, false);
    }

    /* renamed from: b */
    static int m24933b(C5687b c5687b) {
        byte[][] c = c5687b.m24905c();
        int b = c5687b.m24904b();
        c5687b = c5687b.m24900a();
        int i = 0;
        int i2 = 0;
        while (i < c5687b - 1) {
            int i3 = i2;
            i2 = 0;
            while (i2 < b - 1) {
                byte b2 = c[i][i2];
                int i4 = i2 + 1;
                if (b2 == c[i][i4]) {
                    int i5 = i + 1;
                    if (b2 == c[i5][i2] && b2 == c[i5][i4]) {
                        i3++;
                    }
                }
                i2 = i4;
            }
            i++;
            i2 = i3;
        }
        return i2 * 3;
    }

    /* renamed from: c */
    static int m24934c(C5687b c5687b) {
        byte[][] c = c5687b.m24905c();
        int b = c5687b.m24904b();
        c5687b = c5687b.m24900a();
        int i = 0;
        int i2 = 0;
        while (i < c5687b) {
            int i3 = i2;
            i2 = 0;
            while (i2 < b) {
                byte[] bArr = c[i];
                int i4 = i2 + 6;
                if (i4 < b && bArr[i2] == (byte) 1 && bArr[i2 + 1] == (byte) 0 && bArr[i2 + 2] == (byte) 1 && bArr[i2 + 3] == (byte) 1 && bArr[i2 + 4] == (byte) 1 && bArr[i2 + 5] == (byte) 0 && bArr[i4] == (byte) 1 && (C5690d.m24931a(bArr, i2 - 4, i2) || C5690d.m24931a(bArr, i2 + 7, i2 + 11))) {
                    i3++;
                }
                int i5 = i + 6;
                if (i5 < c5687b && c[i][i2] == (byte) 1 && c[i + 1][i2] == (byte) 0 && c[i + 2][i2] == (byte) 1 && c[i + 3][i2] == (byte) 1 && c[i + 4][i2] == (byte) 1 && c[i + 5][i2] == (byte) 0 && c[i5][i2] == (byte) 1 && (C5690d.m24932a(c, i2, i - 4, i) || C5690d.m24932a(c, i2, i + 7, i + 11))) {
                    i3++;
                }
                i2++;
            }
            i++;
            i2 = i3;
        }
        return i2 * 40;
    }

    /* renamed from: a */
    private static boolean m24931a(byte[] bArr, int i, int i2) {
        i2 = Math.min(i2, bArr.length);
        for (i = Math.max(i, 0); i < i2; i++) {
            if (bArr[i] == (byte) 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m24932a(byte[][] bArr, int i, int i2, int i3) {
        i3 = Math.min(i3, bArr.length);
        for (i2 = Math.max(i2, 0); i2 < i3; i2++) {
            if (bArr[i2][i] == (byte) 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    static int m24935d(C5687b c5687b) {
        byte[][] c = c5687b.m24905c();
        int b = c5687b.m24904b();
        int a = c5687b.m24900a();
        int i = 0;
        int i2 = 0;
        while (i < a) {
            byte[] bArr = c[i];
            int i3 = i2;
            for (i2 = 0; i2 < b; i2++) {
                if (bArr[i2] == (byte) 1) {
                    i3++;
                }
            }
            i++;
            i2 = i3;
        }
        int a2 = c5687b.m24900a() * c5687b.m24904b();
        return ((Math.abs((i2 << 1) - a2) * 10) / a2) * 10;
    }

    /* renamed from: a */
    static boolean m24930a(int i, int i2, int i3) {
        switch (i) {
            case 0:
                i = (i3 + i2) & 1;
                break;
            case 1:
                i = i3 & 1;
                break;
            case 2:
                i = i2 % 3;
                break;
            case 3:
                i = (i3 + i2) % 3;
                break;
            case 4:
                i = ((i3 / 2) + (i2 / 3)) & 1;
                break;
            case 5:
                i3 *= i2;
                i = (i3 & 1) + (i3 % 3);
                break;
            case 6:
                i3 *= i2;
                i = ((i3 & 1) + (i3 % 3)) & 1;
                break;
            case 7:
                i = (((i3 * i2) % 3) + ((i3 + i2) & 1)) & 1;
                break;
            default:
                i3 = new StringBuilder("Invalid mask pattern: ");
                i3.append(i);
                throw new IllegalArgumentException(i3.toString());
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m24929a(C5687b c5687b, boolean z) {
        int a = z ? c5687b.m24900a() : c5687b.m24904b();
        int b = z ? c5687b.m24904b() : c5687b.m24900a();
        c5687b = c5687b.m24905c();
        int i = 0;
        int i2 = 0;
        while (i < a) {
            int i3 = i2;
            i2 = 0;
            int i4 = 0;
            byte b2 = (byte) -1;
            while (i2 < b) {
                byte b3 = z ? c5687b[i][i2] : c5687b[i2][i];
                if (b3 == b2) {
                    i4++;
                } else {
                    if (i4 >= 5) {
                        i3 += (i4 - 5) + 3;
                    }
                    i4 = 1;
                    b2 = b3;
                }
                i2++;
            }
            if (i4 >= 5) {
                i3 += (i4 - 5) + 3;
            }
            i2 = i3;
            i++;
        }
        return i2;
    }
}
