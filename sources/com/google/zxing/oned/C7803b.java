package com.google.zxing.oned;

/* renamed from: com.google.zxing.oned.b */
public final class C7803b extends C7002o {
    /* renamed from: a */
    private static final char[] f28239a = new char[]{'A', 'B', 'C', 'D'};
    /* renamed from: b */
    private static final char[] f28240b = new char[]{'T', 'N', '*', 'E'};
    /* renamed from: c */
    private static final char[] f28241c = new char[]{'/', ':', '+', '.'};
    /* renamed from: d */
    private static final char f28242d = f28239a[0];

    /* renamed from: a */
    public boolean[] mo7370a(String str) {
        StringBuilder stringBuilder;
        if (str.length() < 2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(f28242d);
            stringBuilder.append(str);
            stringBuilder.append(f28242d);
            str = stringBuilder.toString();
        } else {
            char toUpperCase = Character.toUpperCase(str.charAt(0));
            char toUpperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            boolean a = C7802a.m33533a(f28239a, toUpperCase);
            boolean a2 = C7802a.m33533a(f28239a, toUpperCase2);
            boolean a3 = C7802a.m33533a(f28240b, toUpperCase);
            boolean a4 = C7802a.m33533a(f28240b, toUpperCase2);
            StringBuilder stringBuilder2;
            if (a) {
                if (!a2) {
                    stringBuilder2 = new StringBuilder("Invalid start/end guards: ");
                    stringBuilder2.append(str);
                    throw new IllegalArgumentException(stringBuilder2.toString());
                }
            } else if (!a3) {
                if (!a2) {
                    if (!a4) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(f28242d);
                        stringBuilder.append(str);
                        stringBuilder.append(f28242d);
                        str = stringBuilder.toString();
                    }
                }
                stringBuilder2 = new StringBuilder("Invalid start/end guards: ");
                stringBuilder2.append(str);
                throw new IllegalArgumentException(stringBuilder2.toString());
            } else if (!a4) {
                stringBuilder2 = new StringBuilder("Invalid start/end guards: ");
                stringBuilder2.append(str);
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
        }
        int i = 1;
        int i2 = 20;
        while (i < str.length() - 1) {
            if (!(Character.isDigit(str.charAt(i)) || str.charAt(i) == '-')) {
                if (str.charAt(i) != '$') {
                    if (C7802a.m33533a(f28241c, str.charAt(i))) {
                        i2 += 10;
                        i++;
                    } else {
                        StringBuilder stringBuilder3 = new StringBuilder("Cannot encode : '");
                        stringBuilder3.append(str.charAt(i));
                        stringBuilder3.append('\'');
                        throw new IllegalArgumentException(stringBuilder3.toString());
                    }
                }
            }
            i2 += 9;
            i++;
        }
        boolean[] zArr = new boolean[(i2 + (str.length() - 1))];
        i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            int i4;
            int i5;
            char toUpperCase3 = Character.toUpperCase(str.charAt(i2));
            if (i2 == 0 || i2 == str.length() - 1) {
                if (toUpperCase3 == '*') {
                    toUpperCase3 = 'C';
                } else if (toUpperCase3 == 'E') {
                    toUpperCase3 = 'D';
                } else if (toUpperCase3 == 'N') {
                    toUpperCase3 = 'B';
                } else if (toUpperCase3 == 'T') {
                    toUpperCase3 = 'A';
                }
            }
            for (i4 = 0; i4 < C7802a.f28233a.length; i4++) {
                if (toUpperCase3 == C7802a.f28233a[i4]) {
                    i5 = C7802a.f28234b[i4];
                    break;
                }
            }
            i5 = 0;
            i4 = i3;
            boolean z = true;
            while (true) {
                int i6 = 0;
                for (i3 = 0; i3 < 7; i3++) {
                    zArr[i4] = z;
                    i4++;
                    if (((i5 >> (6 - i3)) & 1) != 0) {
                        if (i6 != 1) {
                            i6++;
                        }
                    }
                    z ^= 1;
                }
                break;
            }
            if (i2 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
            i3 = i4;
            i2++;
        }
        return zArr;
    }
}
