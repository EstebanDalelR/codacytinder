package com.google.zxing.datamatrix.encoder;

import com.google.zxing.C5660c;
import java.util.Arrays;

/* renamed from: com.google.zxing.datamatrix.encoder.j */
public final class C5671j {
    /* renamed from: a */
    static boolean m24818a(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: b */
    static boolean m24819b(char c) {
        return c >= '' && c <= 'ÿ';
    }

    /* renamed from: d */
    private static boolean m24821d(char c) {
        if (c != ' ' && (c < '0' || c > '9')) {
            if (c < 'A' || c > 'Z') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m24822e(char c) {
        if (c != ' ' && (c < '0' || c > '9')) {
            if (c < 'a' || c > 'z') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m24824g(char c) {
        if (!(c == '\r' || c == '*')) {
            if (c != '>') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m24825h(char c) {
        return c >= ' ' && c <= '^';
    }

    /* renamed from: i */
    private static boolean m24826i(char c) {
        return false;
    }

    /* renamed from: a */
    private static char m24812a(char c, int i) {
        c += ((i * 149) % 253) + 1;
        if (c > 'þ') {
            c -= 254;
        }
        return (char) c;
    }

    /* renamed from: a */
    public static String m24817a(String str, SymbolShapeHint symbolShapeHint, C5660c c5660c, C5660c c5660c2) {
        r0 = new C5668g[6];
        int i = 0;
        r0[0] = new C6995a();
        r0[1] = new C6997c();
        r0[2] = new C7800l();
        r0[3] = new C7801m();
        r0[4] = new C6999f();
        r0[5] = new C6996b();
        C5669h c5669h = new C5669h(str);
        c5669h.m24795a(symbolShapeHint);
        c5669h.m24794a(c5660c, c5660c2);
        if (str.startsWith("[)>\u001e05\u001d") != null && str.endsWith("\u001e\u0004") != null) {
            c5669h.m24792a('ì');
            c5669h.m24793a(2);
            c5669h.f21004a += 7;
        } else if (!(str.startsWith("[)>\u001e06\u001d") == null || str.endsWith("\u001e\u0004") == null)) {
            c5669h.m24792a('í');
            c5669h.m24793a(2);
            c5669h.f21004a += 7;
        }
        while (c5669h.m24804g() != null) {
            r0[i].mo6177a(c5669h);
            if (c5669h.m24802e() >= null) {
                i = c5669h.m24802e();
                c5669h.m24803f();
            }
        }
        str = c5669h.m24801d();
        c5669h.m24807j();
        C5660c f = c5669h.m24806i().m24837f();
        if (!(str >= f || i == 0 || i == 5)) {
            c5669h.m24792a('þ');
        }
        str = c5669h.m24799c();
        if (str.length() < f) {
            str.append('');
        }
        while (str.length() < f) {
            str.append(C5671j.m24812a('', str.length() + 1));
        }
        return c5669h.m24799c().toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    static int m24814a(java.lang.CharSequence r17, int r18, int r19) {
        /*
        r0 = r17;
        r1 = r18;
        r3 = r17.length();
        if (r1 < r3) goto L_0x000b;
    L_0x000a:
        return r19;
    L_0x000b:
        r3 = 6;
        if (r19 != 0) goto L_0x0014;
    L_0x000e:
        r2 = new float[r3];
        r2 = {0, 1065353216, 1065353216, 1065353216, 1065353216, 1067450368};
        goto L_0x001d;
    L_0x0014:
        r4 = new float[r3];
        r4 = {1065353216, 1073741824, 1073741824, 1073741824, 1073741824, 1074790400};
        r5 = 0;
        r4[r19] = r5;
        r2 = r4;
    L_0x001d:
        r4 = 0;
        r5 = 0;
    L_0x001f:
        r6 = r1 + r5;
        r7 = r17.length();
        r8 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r9 = 5;
        r10 = 2;
        r11 = 4;
        r12 = 3;
        r13 = 1;
        if (r6 != r7) goto L_0x005d;
    L_0x002f:
        r0 = new byte[r3];
        r1 = new int[r3];
        r2 = com.google.zxing.datamatrix.encoder.C5671j.m24816a(r2, r1, r8, r0);
        r3 = com.google.zxing.datamatrix.encoder.C5671j.m24815a(r0);
        r1 = r1[r4];
        if (r1 != r2) goto L_0x0040;
    L_0x003f:
        return r4;
    L_0x0040:
        if (r3 != r13) goto L_0x0047;
    L_0x0042:
        r1 = r0[r9];
        if (r1 <= 0) goto L_0x0047;
    L_0x0046:
        return r9;
    L_0x0047:
        if (r3 != r13) goto L_0x004e;
    L_0x0049:
        r1 = r0[r11];
        if (r1 <= 0) goto L_0x004e;
    L_0x004d:
        return r11;
    L_0x004e:
        if (r3 != r13) goto L_0x0055;
    L_0x0050:
        r1 = r0[r10];
        if (r1 <= 0) goto L_0x0055;
    L_0x0054:
        return r10;
    L_0x0055:
        if (r3 != r13) goto L_0x005c;
    L_0x0057:
        r0 = r0[r12];
        if (r0 <= 0) goto L_0x005c;
    L_0x005b:
        return r12;
    L_0x005c:
        return r13;
    L_0x005d:
        r6 = r0.charAt(r6);
        r5 = r5 + 1;
        r7 = com.google.zxing.datamatrix.encoder.C5671j.m24818a(r6);
        r14 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r7 == 0) goto L_0x0073;
    L_0x006b:
        r7 = r2[r4];
        r15 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r7 = r7 + r15;
        r2[r4] = r7;
        goto L_0x009a;
    L_0x0073:
        r7 = com.google.zxing.datamatrix.encoder.C5671j.m24819b(r6);
        if (r7 == 0) goto L_0x008b;
    L_0x0079:
        r7 = r2[r4];
        r8 = (double) r7;
        r7 = java.lang.Math.ceil(r8);
        r7 = (float) r7;
        r2[r4] = r7;
        r7 = r2[r4];
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = r7 + r8;
        r2[r4] = r7;
        goto L_0x009a;
    L_0x008b:
        r7 = r2[r4];
        r7 = (double) r7;
        r7 = java.lang.Math.ceil(r7);
        r7 = (float) r7;
        r2[r4] = r7;
        r7 = r2[r4];
        r7 = r7 + r14;
        r2[r4] = r7;
    L_0x009a:
        r7 = com.google.zxing.datamatrix.encoder.C5671j.m24821d(r6);
        r8 = 1068149419; // 0x3faaaaab float:1.3333334 double:5.277359326E-315;
        r9 = 1076538027; // 0x402aaaab float:2.6666667 double:5.318804556E-315;
        r15 = 1059760811; // 0x3f2aaaab float:0.6666667 double:5.235914095E-315;
        if (r7 == 0) goto L_0x00af;
    L_0x00a9:
        r7 = r2[r13];
        r7 = r7 + r15;
        r2[r13] = r7;
        goto L_0x00c0;
    L_0x00af:
        r7 = com.google.zxing.datamatrix.encoder.C5671j.m24819b(r6);
        if (r7 == 0) goto L_0x00bb;
    L_0x00b5:
        r7 = r2[r13];
        r7 = r7 + r9;
        r2[r13] = r7;
        goto L_0x00c0;
    L_0x00bb:
        r7 = r2[r13];
        r7 = r7 + r8;
        r2[r13] = r7;
    L_0x00c0:
        r7 = com.google.zxing.datamatrix.encoder.C5671j.m24822e(r6);
        if (r7 == 0) goto L_0x00cc;
    L_0x00c6:
        r7 = r2[r10];
        r7 = r7 + r15;
        r2[r10] = r7;
        goto L_0x00dd;
    L_0x00cc:
        r7 = com.google.zxing.datamatrix.encoder.C5671j.m24819b(r6);
        if (r7 == 0) goto L_0x00d8;
    L_0x00d2:
        r7 = r2[r10];
        r7 = r7 + r9;
        r2[r10] = r7;
        goto L_0x00dd;
    L_0x00d8:
        r7 = r2[r10];
        r7 = r7 + r8;
        r2[r10] = r7;
    L_0x00dd:
        r7 = com.google.zxing.datamatrix.encoder.C5671j.m24823f(r6);
        if (r7 == 0) goto L_0x00e9;
    L_0x00e3:
        r7 = r2[r12];
        r7 = r7 + r15;
        r2[r12] = r7;
        goto L_0x0100;
    L_0x00e9:
        r7 = com.google.zxing.datamatrix.encoder.C5671j.m24819b(r6);
        if (r7 == 0) goto L_0x00f8;
    L_0x00ef:
        r7 = r2[r12];
        r8 = 1082829483; // 0x408aaaab float:4.3333335 double:5.34988848E-315;
        r7 = r7 + r8;
        r2[r12] = r7;
        goto L_0x0100;
    L_0x00f8:
        r7 = r2[r12];
        r8 = 1079334229; // 0x40555555 float:3.3333333 double:5.33261963E-315;
        r7 = r7 + r8;
        r2[r12] = r7;
    L_0x0100:
        r7 = com.google.zxing.datamatrix.encoder.C5671j.m24825h(r6);
        if (r7 == 0) goto L_0x010e;
    L_0x0106:
        r7 = r2[r11];
        r8 = 1061158912; // 0x3f400000 float:0.75 double:5.24282163E-315;
        r7 = r7 + r8;
        r2[r11] = r7;
        goto L_0x0123;
    L_0x010e:
        r7 = com.google.zxing.datamatrix.encoder.C5671j.m24819b(r6);
        if (r7 == 0) goto L_0x011c;
    L_0x0114:
        r7 = r2[r11];
        r8 = 1082654720; // 0x40880000 float:4.25 double:5.349025035E-315;
        r7 = r7 + r8;
        r2[r11] = r7;
        goto L_0x0123;
    L_0x011c:
        r7 = r2[r11];
        r8 = 1078984704; // 0x40500000 float:3.25 double:5.330892746E-315;
        r7 = r7 + r8;
        r2[r11] = r7;
    L_0x0123:
        r6 = com.google.zxing.datamatrix.encoder.C5671j.m24826i(r6);
        if (r6 == 0) goto L_0x0132;
    L_0x0129:
        r6 = 5;
        r7 = r2[r6];
        r8 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
        r7 = r7 + r8;
        r2[r6] = r7;
        goto L_0x0138;
    L_0x0132:
        r6 = 5;
        r7 = r2[r6];
        r7 = r7 + r14;
        r2[r6] = r7;
    L_0x0138:
        if (r5 < r11) goto L_0x001f;
    L_0x013a:
        r7 = new int[r3];
        r8 = new byte[r3];
        r9 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        com.google.zxing.datamatrix.encoder.C5671j.m24816a(r2, r7, r9, r8);
        r9 = com.google.zxing.datamatrix.encoder.C5671j.m24815a(r8);
        r14 = r7[r4];
        r15 = r7[r6];
        if (r14 >= r15) goto L_0x0167;
    L_0x014e:
        r6 = r7[r4];
        r14 = r7[r13];
        if (r6 >= r14) goto L_0x0167;
    L_0x0154:
        r6 = r7[r4];
        r14 = r7[r10];
        if (r6 >= r14) goto L_0x0167;
    L_0x015a:
        r6 = r7[r4];
        r14 = r7[r12];
        if (r6 >= r14) goto L_0x0167;
    L_0x0160:
        r6 = r7[r4];
        r14 = r7[r11];
        if (r6 >= r14) goto L_0x0167;
    L_0x0166:
        return r4;
    L_0x0167:
        r6 = 5;
        r14 = r7[r6];
        r6 = r7[r4];
        if (r14 < r6) goto L_0x01d8;
    L_0x016e:
        r6 = r8[r13];
        r14 = r8[r10];
        r6 = r6 + r14;
        r14 = r8[r12];
        r6 = r6 + r14;
        r14 = r8[r11];
        r6 = r6 + r14;
        if (r6 != 0) goto L_0x017c;
    L_0x017b:
        goto L_0x01d8;
    L_0x017c:
        if (r9 != r13) goto L_0x0183;
    L_0x017e:
        r6 = r8[r11];
        if (r6 <= 0) goto L_0x0183;
    L_0x0182:
        return r11;
    L_0x0183:
        if (r9 != r13) goto L_0x018a;
    L_0x0185:
        r6 = r8[r10];
        if (r6 <= 0) goto L_0x018a;
    L_0x0189:
        return r10;
    L_0x018a:
        if (r9 != r13) goto L_0x0191;
    L_0x018c:
        r6 = r8[r12];
        if (r6 <= 0) goto L_0x0191;
    L_0x0190:
        return r12;
    L_0x0191:
        r6 = r7[r13];
        r6 = r6 + r13;
        r8 = r7[r4];
        if (r6 >= r8) goto L_0x001f;
    L_0x0198:
        r6 = r7[r13];
        r6 = r6 + r13;
        r8 = 5;
        r8 = r7[r8];
        if (r6 >= r8) goto L_0x001f;
    L_0x01a0:
        r6 = r7[r13];
        r6 = r6 + r13;
        r8 = r7[r11];
        if (r6 >= r8) goto L_0x001f;
    L_0x01a7:
        r6 = r7[r13];
        r6 = r6 + r13;
        r8 = r7[r10];
        if (r6 >= r8) goto L_0x001f;
    L_0x01ae:
        r6 = r7[r13];
        r8 = r7[r12];
        if (r6 >= r8) goto L_0x01b5;
    L_0x01b4:
        return r13;
    L_0x01b5:
        r6 = r7[r13];
        r7 = r7[r12];
        if (r6 != r7) goto L_0x001f;
    L_0x01bb:
        r1 = r1 + r5;
        r1 = r1 + r13;
    L_0x01bd:
        r2 = r17.length();
        if (r1 >= r2) goto L_0x01d7;
    L_0x01c3:
        r2 = r0.charAt(r1);
        r3 = com.google.zxing.datamatrix.encoder.C5671j.m24824g(r2);
        if (r3 == 0) goto L_0x01ce;
    L_0x01cd:
        return r12;
    L_0x01ce:
        r2 = com.google.zxing.datamatrix.encoder.C5671j.m24823f(r2);
        if (r2 == 0) goto L_0x01d7;
    L_0x01d4:
        r1 = r1 + 1;
        goto L_0x01bd;
    L_0x01d7:
        return r13;
    L_0x01d8:
        r0 = 5;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.datamatrix.encoder.j.a(java.lang.CharSequence, int, int):int");
    }

    /* renamed from: a */
    private static int m24816a(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i2 = i;
        for (i = 0; i < 6; i++) {
            iArr[i] = (int) Math.ceil((double) fArr[i]);
            int i3 = iArr[i];
            if (i2 > i3) {
                Arrays.fill(bArr, (byte) 0);
                i2 = i3;
            }
            if (i2 == i3) {
                bArr[i] = (byte) (bArr[i] + 1);
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static int m24815a(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* renamed from: f */
    private static boolean m24823f(char c) {
        if (!(C5671j.m24824g(c) || c == ' ' || (c >= '0' && c <= '9'))) {
            if (c < 'A' || c > 'Z') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static int m24813a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (C5671j.m24818a(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* renamed from: c */
    static void m24820c(char c) {
        String toHexString = Integer.toHexString(c);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0000".substring(0, 4 - toHexString.length()));
        stringBuilder.append(toHexString);
        toHexString = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder("Illegal character: ");
        stringBuilder2.append(c);
        stringBuilder2.append(" (0x");
        stringBuilder2.append(toHexString);
        stringBuilder2.append(')');
        throw new IllegalArgumentException(stringBuilder2.toString());
    }
}
