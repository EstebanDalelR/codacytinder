package org.objectweb.asm;

import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: org.objectweb.asm.e */
public class C19337e {
    /* renamed from: a */
    public final byte[] f60314a;
    /* renamed from: b */
    public final int f60315b;
    /* renamed from: c */
    private final int[] f60316c;
    /* renamed from: d */
    private final String[] f60317d;
    /* renamed from: e */
    private final int f60318e;

    public C19337e(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public C19337e(byte[] bArr, int i, int i2) {
        this.f60314a = bArr;
        if (m69383c(i + 6) > (short) 52) {
            throw new IllegalArgumentException();
        }
        this.f60316c = new int[m69380b(i + 8)];
        i2 = this.f60316c.length;
        this.f60317d = new String[i2];
        int i3 = i + 10;
        i = 1;
        int i4 = 0;
        while (i < i2) {
            int i5 = i3 + 1;
            this.f60316c[i] = i5;
            byte b = bArr[i3];
            int i6 = 3;
            if (b == (byte) 1) {
                i6 = 3 + m69380b(i5);
                if (i6 > i4) {
                    i4 = i6;
                }
            } else if (b != (byte) 15) {
                if (b != (byte) 18) {
                    switch (b) {
                        case (byte) 3:
                        case (byte) 4:
                            break;
                        case (byte) 5:
                        case (byte) 6:
                            i6 = 9;
                            i++;
                            continue;
                        default:
                            switch (b) {
                                case (byte) 9:
                                case (byte) 10:
                                case (byte) 11:
                                case (byte) 12:
                                    break;
                                default:
                                    continue;
                                    continue;
                            }
                    }
                }
                i6 = 5;
            } else {
                i6 = 4;
            }
            i3 += i6;
            i++;
        }
        this.f60318e = i4;
        this.f60315b = i3;
    }

    /* renamed from: a */
    private int m69361a() {
        int b;
        int b2;
        int b3 = (this.f60315b + 8) + (m69380b(this.f60315b + 6) * 2);
        for (b = m69380b(b3); b > 0; b--) {
            for (b2 = m69380b(b3 + 8); b2 > 0; b2--) {
                b3 += m69384d(b3 + 12) + 6;
            }
            b3 += 8;
        }
        b3 += 2;
        for (b = m69380b(b3); b > 0; b--) {
            for (b2 = m69380b(b3 + 8); b2 > 0; b2--) {
                b3 += m69384d(b3 + 12) + 6;
            }
            b3 += 8;
        }
        return b3 + 2;
    }

    /* renamed from: a */
    private int m69362a(int i, boolean z, boolean z2, C19339h c19339h) {
        int i2;
        int b;
        char[] cArr = c19339h.f60323c;
        C19346p[] c19346pArr = c19339h.f60328h;
        if (z) {
            int i3 = i + 1;
            i = this.f60314a[i] & 255;
            i2 = i3;
        } else {
            c19339h.f60331k = -1;
            i2 = i;
            i = 255;
        }
        c19339h.f60337q = 0;
        if (i < 64) {
            c19339h.f60335o = 3;
            c19339h.f60339s = 0;
        } else if (i < ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
            i -= 64;
            i2 = m69367a(c19339h.f60340t, 0, i2, cArr, c19346pArr);
            c19339h.f60335o = 4;
            c19339h.f60339s = 1;
        } else {
            b = m69380b(i2);
            i2 += 2;
            if (i == 247) {
                i2 = m69367a(c19339h.f60340t, 0, i2, cArr, c19346pArr);
                c19339h.f60335o = 4;
                c19339h.f60339s = 1;
            } else {
                if (i >= 248 && i < 251) {
                    c19339h.f60335o = 2;
                    c19339h.f60337q = 251 - i;
                    i = c19339h.f60336p - c19339h.f60337q;
                } else if (i == 251) {
                    c19339h.f60335o = 3;
                    c19339h.f60339s = 0;
                } else if (i < 255) {
                    i -= 251;
                    r2 = z2 ? c19339h.f60336p : 0;
                    r14 = i;
                    while (r14 > 0) {
                        int i4 = r2 + 1;
                        i2 = m69367a(c19339h.f60338r, r2, i2, cArr, c19346pArr);
                        r14--;
                        r2 = i4;
                    }
                    c19339h.f60335o = 1;
                    c19339h.f60337q = i;
                    i = c19339h.f60336p + c19339h.f60337q;
                } else {
                    c19339h.f60335o = 0;
                    i = m69380b(i2);
                    i2 += 2;
                    c19339h.f60337q = i;
                    c19339h.f60336p = i;
                    r2 = 0;
                    while (i > 0) {
                        r14 = r2 + 1;
                        i2 = m69367a(c19339h.f60338r, r2, i2, cArr, c19346pArr);
                        i--;
                        r2 = r14;
                    }
                    i = m69380b(i2);
                    i2 += 2;
                    c19339h.f60339s = i;
                    r2 = 0;
                    while (i > 0) {
                        int i5 = r2 + 1;
                        i2 = m69367a(c19339h.f60340t, r2, i2, cArr, c19346pArr);
                        i--;
                        r2 = i5;
                    }
                }
                c19339h.f60336p = i;
                c19339h.f60339s = 0;
            }
            c19339h.f60331k += b + 1;
            m69377a(c19339h.f60331k, c19346pArr);
            return i2;
        }
        b = i;
        c19339h.f60331k += b + 1;
        m69377a(c19339h.f60331k, c19346pArr);
        return i2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private int m69363a(int r7, char[] r8, java.lang.String r9, org.objectweb.asm.C19334a r10) {
        /*
        r6 = this;
        r0 = 0;
        r1 = 1;
        if (r10 != 0) goto L_0x002a;
    L_0x0004:
        r9 = r6.f60314a;
        r9 = r9[r7];
        r9 = r9 & 255;
        r10 = 64;
        r2 = 0;
        if (r9 == r10) goto L_0x0023;
    L_0x000f:
        r10 = 91;
        if (r9 == r10) goto L_0x001d;
    L_0x0013:
        r8 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r9 == r8) goto L_0x001a;
    L_0x0017:
        r7 = r7 + 3;
        return r7;
    L_0x001a:
        r7 = r7 + 5;
        return r7;
    L_0x001d:
        r7 = r7 + r1;
        r7 = r6.m69364a(r7, r8, r0, r2);
        return r7;
    L_0x0023:
        r7 = r7 + 3;
        r7 = r6.m69364a(r7, r8, r1, r2);
        return r7;
    L_0x002a:
        r2 = r6.f60314a;
        r3 = r7 + 1;
        r7 = r2[r7];
        r7 = r7 & 255;
        switch(r7) {
            case 64: goto L_0x01bb;
            case 66: goto L_0x01a3;
            case 67: goto L_0x0190;
            case 68: goto L_0x0184;
            case 70: goto L_0x0184;
            case 73: goto L_0x0184;
            case 74: goto L_0x0184;
            case 83: goto L_0x0171;
            case 90: goto L_0x015d;
            case 91: goto L_0x0056;
            case 99: goto L_0x004c;
            case 101: goto L_0x003c;
            case 115: goto L_0x0036;
            default: goto L_0x0035;
        };
    L_0x0035:
        return r3;
    L_0x0036:
        r7 = r6.m69376a(r3, r8);
        goto L_0x018c;
    L_0x003c:
        r7 = r6.m69376a(r3, r8);
        r0 = r3 + 2;
        r8 = r6.m69376a(r0, r8);
        r10.mo14587a(r9, r7, r8);
        r3 = r3 + 4;
        return r3;
    L_0x004c:
        r7 = r6.m69376a(r3, r8);
        r7 = org.objectweb.asm.C19348s.m69464a(r7);
        goto L_0x018c;
    L_0x0056:
        r7 = r6.m69380b(r3);
        r3 = r3 + 2;
        if (r7 != 0) goto L_0x0069;
    L_0x005e:
        r3 = r3 + -2;
        r7 = r10.mo14583a(r9);
        r7 = r6.m69364a(r3, r8, r0, r7);
        return r7;
    L_0x0069:
        r2 = r6.f60314a;
        r4 = r3 + 1;
        r2 = r2[r3];
        r2 = r2 & 255;
        r3 = 70;
        if (r2 == r3) goto L_0x0142;
    L_0x0075:
        r3 = 83;
        if (r2 == r3) goto L_0x012a;
    L_0x0079:
        r3 = 90;
        if (r2 == r3) goto L_0x010d;
    L_0x007d:
        switch(r2) {
            case 66: goto L_0x00ef;
            case 67: goto L_0x00d7;
            case 68: goto L_0x00bc;
            default: goto L_0x0080;
        };
    L_0x0080:
        switch(r2) {
            case 73: goto L_0x00a5;
            case 74: goto L_0x008e;
            default: goto L_0x0083;
        };
    L_0x0083:
        r4 = r4 + -3;
        r7 = r10.mo14583a(r9);
        r3 = r6.m69364a(r4, r8, r0, r7);
        return r3;
    L_0x008e:
        r8 = new long[r7];
    L_0x0090:
        if (r0 >= r7) goto L_0x0107;
    L_0x0092:
        r1 = r6.f60316c;
        r2 = r6.m69380b(r4);
        r1 = r1[r2];
        r1 = r6.m69385e(r1);
        r8[r0] = r1;
        r4 = r4 + 3;
        r0 = r0 + 1;
        goto L_0x0090;
    L_0x00a5:
        r8 = new int[r7];
    L_0x00a7:
        if (r0 >= r7) goto L_0x0107;
    L_0x00a9:
        r1 = r6.f60316c;
        r2 = r6.m69380b(r4);
        r1 = r1[r2];
        r1 = r6.m69384d(r1);
        r8[r0] = r1;
        r4 = r4 + 3;
        r0 = r0 + 1;
        goto L_0x00a7;
    L_0x00bc:
        r8 = new double[r7];
    L_0x00be:
        if (r0 >= r7) goto L_0x0107;
    L_0x00c0:
        r1 = r6.f60316c;
        r2 = r6.m69380b(r4);
        r1 = r1[r2];
        r1 = r6.m69385e(r1);
        r1 = java.lang.Double.longBitsToDouble(r1);
        r8[r0] = r1;
        r4 = r4 + 3;
        r0 = r0 + 1;
        goto L_0x00be;
    L_0x00d7:
        r8 = new char[r7];
    L_0x00d9:
        if (r0 >= r7) goto L_0x0107;
    L_0x00db:
        r1 = r6.f60316c;
        r2 = r6.m69380b(r4);
        r1 = r1[r2];
        r1 = r6.m69384d(r1);
        r1 = (char) r1;
        r8[r0] = r1;
        r4 = r4 + 3;
        r0 = r0 + 1;
        goto L_0x00d9;
    L_0x00ef:
        r8 = new byte[r7];
    L_0x00f1:
        if (r0 >= r7) goto L_0x0107;
    L_0x00f3:
        r1 = r6.f60316c;
        r2 = r6.m69380b(r4);
        r1 = r1[r2];
        r1 = r6.m69384d(r1);
        r1 = (byte) r1;
        r8[r0] = r1;
        r4 = r4 + 3;
        r0 = r0 + 1;
        goto L_0x00f1;
    L_0x0107:
        r10.mo14586a(r9, r8);
        r3 = r4 + -1;
        return r3;
    L_0x010d:
        r8 = new boolean[r7];
        r2 = 0;
    L_0x0110:
        if (r2 >= r7) goto L_0x0107;
    L_0x0112:
        r3 = r6.f60316c;
        r5 = r6.m69380b(r4);
        r3 = r3[r5];
        r3 = r6.m69384d(r3);
        if (r3 == 0) goto L_0x0122;
    L_0x0120:
        r3 = 1;
        goto L_0x0123;
    L_0x0122:
        r3 = 0;
    L_0x0123:
        r8[r2] = r3;
        r4 = r4 + 3;
        r2 = r2 + 1;
        goto L_0x0110;
    L_0x012a:
        r8 = new short[r7];
    L_0x012c:
        if (r0 >= r7) goto L_0x0107;
    L_0x012e:
        r1 = r6.f60316c;
        r2 = r6.m69380b(r4);
        r1 = r1[r2];
        r1 = r6.m69384d(r1);
        r1 = (short) r1;
        r8[r0] = r1;
        r4 = r4 + 3;
        r0 = r0 + 1;
        goto L_0x012c;
    L_0x0142:
        r8 = new float[r7];
    L_0x0144:
        if (r0 >= r7) goto L_0x0107;
    L_0x0146:
        r1 = r6.f60316c;
        r2 = r6.m69380b(r4);
        r1 = r1[r2];
        r1 = r6.m69384d(r1);
        r1 = java.lang.Float.intBitsToFloat(r1);
        r8[r0] = r1;
        r4 = r4 + 3;
        r0 = r0 + 1;
        goto L_0x0144;
    L_0x015d:
        r7 = r6.f60316c;
        r8 = r6.m69380b(r3);
        r7 = r7[r8];
        r7 = r6.m69384d(r7);
        if (r7 != 0) goto L_0x016e;
    L_0x016b:
        r7 = java.lang.Boolean.FALSE;
        goto L_0x018c;
    L_0x016e:
        r7 = java.lang.Boolean.TRUE;
        goto L_0x018c;
    L_0x0171:
        r7 = r6.f60316c;
        r8 = r6.m69380b(r3);
        r7 = r7[r8];
        r7 = r6.m69384d(r7);
        r7 = (short) r7;
        r8 = new java.lang.Short;
        r8.<init>(r7);
        goto L_0x01b5;
    L_0x0184:
        r7 = r6.m69380b(r3);
        r7 = r6.m69382c(r7, r8);
    L_0x018c:
        r10.mo14586a(r9, r7);
        goto L_0x01b8;
    L_0x0190:
        r7 = r6.f60316c;
        r8 = r6.m69380b(r3);
        r7 = r7[r8];
        r7 = r6.m69384d(r7);
        r7 = (char) r7;
        r8 = new java.lang.Character;
        r8.<init>(r7);
        goto L_0x01b5;
    L_0x01a3:
        r7 = r6.f60316c;
        r8 = r6.m69380b(r3);
        r7 = r7[r8];
        r7 = r6.m69384d(r7);
        r7 = (byte) r7;
        r8 = new java.lang.Byte;
        r8.<init>(r7);
    L_0x01b5:
        r10.mo14586a(r9, r8);
    L_0x01b8:
        r3 = r3 + 2;
        return r3;
    L_0x01bb:
        r7 = r3 + 2;
        r0 = r6.m69376a(r3, r8);
        r9 = r10.mo14584a(r9, r0);
        r3 = r6.m69364a(r7, r8, r1, r9);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.e.a(int, char[], java.lang.String, org.objectweb.asm.a):int");
    }

    /* renamed from: a */
    private int m69364a(int i, char[] cArr, boolean z, C19334a c19334a) {
        int b = m69380b(i);
        i += 2;
        if (z) {
            while (b > 0) {
                i = m69363a(i + 2, cArr, m69376a(i, cArr), c19334a);
                b--;
            }
        } else {
            while (b > 0) {
                i = m69363a(i, cArr, null, c19334a);
                b--;
            }
        }
        if (c19334a != null) {
            c19334a.mo14585a();
        }
        return i;
    }

    /* renamed from: a */
    private int m69365a(C19338f c19338f, C19339h c19339h, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C19339h c19339h2 = c19339h;
        int i6 = i;
        char[] cArr = c19339h2.f60323c;
        int b = m69380b(i6);
        String a = m69376a(i6 + 2, cArr);
        String a2 = m69376a(i6 + 4, cArr);
        i6 += 6;
        int i7 = i6;
        int i8 = b;
        int b2 = m69380b(i6);
        String str = null;
        String str2 = str;
        String str3 = str2;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (b2 > 0) {
            String a3 = m69376a(i7 + 2, cArr);
            if ("ConstantValue".equals(a3)) {
                i6 = m69380b(i7 + 8);
                str3 = i6 == 0 ? null : m69382c(i6, cArr);
            } else if ("Signature".equals(a3)) {
                str2 = m69376a(i7 + 8, cArr);
            } else {
                if ("Deprecated".equals(a3)) {
                    i6 = 131072;
                } else if ("Synthetic".equals(a3)) {
                    i6 = 266240;
                } else if ("RuntimeVisibleAnnotations".equals(a3)) {
                    i12 = i7 + 8;
                } else if ("RuntimeVisibleTypeAnnotations".equals(a3)) {
                    i10 = i7 + 8;
                } else if ("RuntimeInvisibleAnnotations".equals(a3)) {
                    i11 = i7 + 8;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(a3)) {
                    i9 = i7 + 8;
                } else {
                    String str4 = str;
                    i2 = i9;
                    i3 = i10;
                    i4 = i11;
                    i5 = i12;
                    C19335c a4 = m69369a(c19339h2.f60321a, a3, i7 + 8, m69384d(i7 + 4), cArr, -1, null);
                    if (a4 != null) {
                        a4.f60311c = str4;
                        str = a4;
                    } else {
                        str = str4;
                    }
                    i12 = i5;
                    i9 = i2;
                    i10 = i3;
                    i11 = i4;
                }
                i8 |= i6;
            }
            i7 += m69384d(i7 + 4) + 6;
            b2--;
            c19339h2 = c19339h;
        }
        C19335c c19335c = str;
        i2 = i9;
        i3 = i10;
        i4 = i11;
        i5 = i12;
        i6 = i7 + 2;
        C19335c c19335c2 = null;
        C19341j a5 = c19338f.mo14590a(i8, a, a2, str2, (Object) str3);
        if (a5 == null) {
            return i6;
        }
        int i13;
        if (i5 != 0) {
            i12 = i5 + 2;
            for (i11 = m69380b(i5); i11 > 0; i11--) {
                i12 = m69364a(i12 + 2, cArr, true, a5.mo14599a(m69376a(i12, cArr), true));
            }
        }
        if (i4 != 0) {
            i13 = i4;
            i12 = i13 + 2;
            for (i11 = m69380b(i13); i11 > 0; i11--) {
                i12 = m69364a(i12 + 2, cArr, true, a5.mo14599a(m69376a(i12, cArr), false));
            }
        }
        i13 = i3;
        if (i13 != 0) {
            i12 = i13 + 2;
            for (i11 = m69380b(i13); i11 > 0; i11--) {
                c19339h2 = c19339h;
                i12 = m69366a(c19339h2, i12);
                i12 = m69364a(i12 + 2, cArr, true, a5.mo14598a(c19339h2.f60329i, c19339h2.f60330j, m69376a(i12, cArr), true));
            }
        }
        c19339h2 = c19339h;
        i13 = i2;
        if (i13 != 0) {
            i12 = i13 + 2;
            for (i11 = m69380b(i13); i11 > 0; i11--) {
                i12 = m69366a(c19339h2, i12);
                i12 = m69364a(i12 + 2, cArr, true, a5.mo14598a(c19339h2.f60329i, c19339h2.f60330j, m69376a(i12, cArr), false));
            }
        }
        while (c19335c != null) {
            C19335c c19335c3 = c19335c.f60311c;
            c19335c.f60311c = c19335c2;
            a5.mo14601a(c19335c);
            c19335c = c19335c3;
        }
        a5.mo14600a();
        return i6;
    }

    /* renamed from: a */
    private int m69366a(C19339h c19339h, int i) {
        int d = m69384d(i);
        int i2 = d >>> 24;
        switch (i2) {
            case 0:
            case 1:
                d &= -65536;
                i += 2;
                break;
            default:
                int i3 = -16777216;
                switch (i2) {
                    case 19:
                    case 20:
                    case 21:
                        d &= -16777216;
                        i++;
                        break;
                    case 22:
                        break;
                    default:
                        switch (i2) {
                            case 64:
                            case 65:
                                d &= -16777216;
                                i2 = m69380b(i + 1);
                                c19339h.f60332l = new C19346p[i2];
                                c19339h.f60333m = new C19346p[i2];
                                c19339h.f60334n = new int[i2];
                                i += 3;
                                for (i3 = 0; i3 < i2; i3++) {
                                    int b = m69380b(i);
                                    int b2 = m69380b(i + 2);
                                    c19339h.f60332l[i3] = m69377a(b, c19339h.f60328h);
                                    c19339h.f60333m[i3] = m69377a(b + b2, c19339h.f60328h);
                                    c19339h.f60334n[i3] = m69380b(i + 4);
                                    i += 6;
                                }
                                break;
                            default:
                                switch (i2) {
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                        d &= -16776961;
                                        i += 4;
                                        break;
                                    default:
                                        if (i2 < 67) {
                                            i3 = -256;
                                        }
                                        d &= i3;
                                        i += 3;
                                        break;
                                }
                        }
                }
                d &= -65536;
                i += 2;
                break;
        }
        i2 = m69375a(i);
        c19339h.f60329i = d;
        c19339h.f60330j = i2 == 0 ? null : new C19349t(this.f60314a, i);
        return (i + 1) + (i2 * 2);
    }

    /* renamed from: a */
    private int m69367a(Object[] objArr, int i, int i2, char[] cArr, C19346p[] c19346pArr) {
        int i3 = i2 + 1;
        switch (this.f60314a[i2] & 255) {
            case 0:
                objArr[i] = Opcodes.f60300a;
                return i3;
            case 1:
                objArr[i] = Opcodes.f60301b;
                return i3;
            case 2:
                objArr[i] = Opcodes.f60302c;
                return i3;
            case 3:
                objArr[i] = Opcodes.f60303d;
                return i3;
            case 4:
                objArr[i] = Opcodes.f60304e;
                return i3;
            case 5:
                objArr[i] = Opcodes.f60305f;
                return i3;
            case 6:
                objArr[i] = Opcodes.f60306g;
                return i3;
            case 7:
                objArr[i] = m69381b(i3, cArr);
                break;
            default:
                objArr[i] = m69377a(m69380b(i3), c19346pArr);
                break;
        }
        return i3 + 2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private java.lang.String m69368a(int r9, int r10, char[] r11) {
        /*
        r8 = this;
        r10 = r10 + r9;
        r0 = r8.f60314a;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 0;
    L_0x0007:
        if (r9 >= r10) goto L_0x0047;
    L_0x0009:
        r5 = r9 + 1;
        r9 = r0[r9];
        r6 = 1;
        switch(r2) {
            case 0: goto L_0x0028;
            case 1: goto L_0x001b;
            case 2: goto L_0x0012;
            default: goto L_0x0011;
        };
    L_0x0011:
        goto L_0x0045;
    L_0x0012:
        r2 = r4 << 6;
        r9 = r9 & 63;
        r9 = r9 | r2;
    L_0x0017:
        r9 = (char) r9;
        r4 = r9;
        r2 = 1;
        goto L_0x0045;
    L_0x001b:
        r2 = r3 + 1;
        r6 = r4 << 6;
        r9 = r9 & 63;
        r9 = r9 | r6;
        r9 = (char) r9;
        r11[r3] = r9;
        r3 = r2;
        r2 = 0;
        goto L_0x0045;
    L_0x0028:
        r9 = r9 & 255;
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r9 >= r7) goto L_0x0035;
    L_0x002e:
        r6 = r3 + 1;
        r9 = (char) r9;
        r11[r3] = r9;
        r3 = r6;
        goto L_0x0045;
    L_0x0035:
        r2 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        if (r9 >= r2) goto L_0x0040;
    L_0x0039:
        r2 = 191; // 0xbf float:2.68E-43 double:9.44E-322;
        if (r9 <= r2) goto L_0x0040;
    L_0x003d:
        r9 = r9 & 31;
        goto L_0x0017;
    L_0x0040:
        r9 = r9 & 15;
        r9 = (char) r9;
        r2 = 2;
        r4 = r9;
    L_0x0045:
        r9 = r5;
        goto L_0x0007;
    L_0x0047:
        r9 = new java.lang.String;
        r9.<init>(r11, r1, r3);
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.e.a(int, int, char[]):java.lang.String");
    }

    /* renamed from: a */
    private C19335c m69369a(C19335c[] c19335cArr, String str, int i, int i2, char[] cArr, int i3, C19346p[] c19346pArr) {
        C19335c[] c19335cArr2 = c19335cArr;
        String str2 = str;
        for (int i4 = 0; i4 < c19335cArr2.length; i4++) {
            if (c19335cArr2[i4].f60309a.equals(str2)) {
                return c19335cArr2[i4].m69344a(this, i, i2, cArr, i3, c19346pArr);
            }
        }
        return new C19335c(str2).m69344a(this, i, i2, null, -1, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m69370a(org.objectweb.asm.C19339h r10) {
        /*
        r9 = this;
        r0 = r10.f60327g;
        r1 = r10.f60338r;
        r2 = r10.f60325e;
        r2 = r2 & 8;
        r3 = 1;
        r4 = 0;
        if (r2 != 0) goto L_0x0029;
    L_0x000c:
        r2 = "<init>";
        r5 = r10.f60326f;
        r2 = r2.equals(r5);
        if (r2 == 0) goto L_0x001c;
    L_0x0016:
        r2 = org.objectweb.asm.Opcodes.f60306g;
        r1[r4] = r2;
    L_0x001a:
        r4 = 1;
        goto L_0x0029;
    L_0x001c:
        r2 = r9.f60315b;
        r2 = r2 + 2;
        r5 = r10.f60323c;
        r2 = r9.m69381b(r2, r5);
        r1[r4] = r2;
        goto L_0x001a;
    L_0x0029:
        r2 = 1;
    L_0x002a:
        r5 = r2 + 1;
        r6 = r0.charAt(r2);
        r7 = 59;
        switch(r6) {
            case 66: goto L_0x008b;
            case 67: goto L_0x008b;
            case 68: goto L_0x0084;
            case 70: goto L_0x007d;
            case 73: goto L_0x008b;
            case 74: goto L_0x0076;
            case 76: goto L_0x005f;
            case 83: goto L_0x008b;
            case 90: goto L_0x008b;
            case 91: goto L_0x0037;
            default: goto L_0x0035;
        };
    L_0x0035:
        goto L_0x0094;
    L_0x0037:
        r6 = r0.charAt(r5);
        r8 = 91;
        if (r6 != r8) goto L_0x0042;
    L_0x003f:
        r5 = r5 + 1;
        goto L_0x0037;
    L_0x0042:
        r6 = r0.charAt(r5);
        r8 = 76;
        if (r6 != r8) goto L_0x0053;
    L_0x004a:
        r5 = r5 + 1;
        r6 = r0.charAt(r5);
        if (r6 == r7) goto L_0x0053;
    L_0x0052:
        goto L_0x004a;
    L_0x0053:
        r6 = r4 + 1;
        r5 = r5 + r3;
        r2 = r0.substring(r2, r5);
        r1[r4] = r2;
        r2 = r5;
        r4 = r6;
        goto L_0x002a;
    L_0x005f:
        r2 = r5;
    L_0x0060:
        r6 = r0.charAt(r2);
        if (r6 == r7) goto L_0x0069;
    L_0x0066:
        r2 = r2 + 1;
        goto L_0x0060;
    L_0x0069:
        r6 = r4 + 1;
        r7 = r2 + 1;
        r2 = r0.substring(r5, r2);
        r1[r4] = r2;
        r4 = r6;
        r2 = r7;
        goto L_0x002a;
    L_0x0076:
        r2 = r4 + 1;
        r6 = org.objectweb.asm.Opcodes.f60304e;
        r1[r4] = r6;
        goto L_0x0091;
    L_0x007d:
        r2 = r4 + 1;
        r6 = org.objectweb.asm.Opcodes.f60302c;
        r1[r4] = r6;
        goto L_0x0091;
    L_0x0084:
        r2 = r4 + 1;
        r6 = org.objectweb.asm.Opcodes.f60303d;
        r1[r4] = r6;
        goto L_0x0091;
    L_0x008b:
        r2 = r4 + 1;
        r6 = org.objectweb.asm.Opcodes.f60301b;
        r1[r4] = r6;
    L_0x0091:
        r4 = r2;
        r2 = r5;
        goto L_0x002a;
    L_0x0094:
        r10.f60336p = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.e.a(org.objectweb.asm.h):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m69371a(org.objectweb.asm.C19347q r59, org.objectweb.asm.C19339h r60, int r61) {
        /*
        r58 = this;
        r7 = r58;
        r15 = r59;
        r14 = r60;
        r0 = r61;
        r8 = r7.f60314a;
        r13 = r14.f60323c;
        r12 = r7.m69380b(r0);
        r1 = r0 + 2;
        r11 = r7.m69380b(r1);
        r1 = r0 + 4;
        r9 = r7.m69384d(r1);
        r10 = 8;
        r16 = r0 + 8;
        r6 = r16 + r9;
        r0 = r9 + 2;
        r5 = new org.objectweb.asm.C19346p[r0];
        r14.f60328h = r5;
        r0 = r9 + 1;
        r7.m69377a(r0, r5);
        r0 = r16;
    L_0x002f:
        r4 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r3 = 1;
        if (r0 >= r6) goto L_0x00cb;
    L_0x0034:
        r1 = r0 - r16;
        r2 = r8[r0];
        r2 = r2 & 255;
        r17 = org.objectweb.asm.C19506g.f60913c;
        r2 = r17[r2];
        switch(r2) {
            case 0: goto L_0x00c7;
            case 1: goto L_0x00c3;
            case 2: goto L_0x00bf;
            case 3: goto L_0x00c3;
            case 4: goto L_0x00c7;
            case 5: goto L_0x00bf;
            case 6: goto L_0x00bf;
            case 7: goto L_0x00bb;
            case 8: goto L_0x00bb;
            case 9: goto L_0x00b0;
            case 10: goto L_0x00a5;
            case 11: goto L_0x00c3;
            case 12: goto L_0x00bf;
            case 13: goto L_0x00bf;
            case 14: goto L_0x0076;
            case 15: goto L_0x004f;
            case 16: goto L_0x0041;
            case 17: goto L_0x0044;
            default: goto L_0x0041;
        };
    L_0x0041:
        r0 = r0 + 4;
        goto L_0x002f;
    L_0x0044:
        r1 = r0 + 1;
        r1 = r8[r1];
        r1 = r1 & 255;
        if (r1 != r4) goto L_0x0041;
    L_0x004c:
        r0 = r0 + 6;
        goto L_0x002f;
    L_0x004f:
        r0 = r0 + 4;
        r2 = r1 & 3;
        r0 = r0 - r2;
        r2 = r7.m69384d(r0);
        r2 = r2 + r1;
        r7.m69377a(r2, r5);
        r2 = r0 + 4;
        r2 = r7.m69384d(r2);
    L_0x0062:
        if (r2 <= 0) goto L_0x0073;
    L_0x0064:
        r3 = r0 + 12;
        r3 = r7.m69384d(r3);
        r3 = r3 + r1;
        r7.m69377a(r3, r5);
        r0 = r0 + 8;
        r2 = r2 + -1;
        goto L_0x0062;
    L_0x0073:
        r0 = r0 + 8;
        goto L_0x002f;
    L_0x0076:
        r0 = r0 + 4;
        r2 = r1 & 3;
        r0 = r0 - r2;
        r2 = r7.m69384d(r0);
        r2 = r2 + r1;
        r7.m69377a(r2, r5);
        r2 = r0 + 8;
        r2 = r7.m69384d(r2);
        r4 = r0 + 4;
        r4 = r7.m69384d(r4);
        r2 = r2 - r4;
        r2 = r2 + r3;
    L_0x0091:
        if (r2 <= 0) goto L_0x00a2;
    L_0x0093:
        r3 = r0 + 12;
        r3 = r7.m69384d(r3);
        r3 = r3 + r1;
        r7.m69377a(r3, r5);
        r0 = r0 + 4;
        r2 = r2 + -1;
        goto L_0x0091;
    L_0x00a2:
        r0 = r0 + 12;
        goto L_0x002f;
    L_0x00a5:
        r2 = r0 + 1;
        r2 = r7.m69384d(r2);
        r1 = r1 + r2;
        r7.m69377a(r1, r5);
        goto L_0x00bb;
    L_0x00b0:
        r2 = r0 + 1;
        r2 = r7.m69383c(r2);
        r1 = r1 + r2;
        r7.m69377a(r1, r5);
        goto L_0x00bf;
    L_0x00bb:
        r0 = r0 + 5;
        goto L_0x002f;
    L_0x00bf:
        r0 = r0 + 3;
        goto L_0x002f;
    L_0x00c3:
        r0 = r0 + 2;
        goto L_0x002f;
    L_0x00c7:
        r0 = r0 + 1;
        goto L_0x002f;
    L_0x00cb:
        r1 = r7.m69380b(r0);
    L_0x00cf:
        if (r1 <= 0) goto L_0x0108;
    L_0x00d1:
        r2 = r0 + 2;
        r2 = r7.m69380b(r2);
        r2 = r7.m69377a(r2, r5);
        r4 = r0 + 4;
        r4 = r7.m69380b(r4);
        r4 = r7.m69377a(r4, r5);
        r3 = r0 + 6;
        r3 = r7.m69380b(r3);
        r3 = r7.m69377a(r3, r5);
        r10 = r7.f60316c;
        r0 = r0 + 8;
        r17 = r7.m69380b(r0);
        r10 = r10[r17];
        r10 = r7.m69376a(r10, r13);
        r15.mo14621a(r2, r4, r3, r10);
        r1 = r1 + -1;
        r3 = 1;
        r4 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r10 = 8;
        goto L_0x00cf;
    L_0x0108:
        r0 = r0 + 2;
        r1 = r14.f60322b;
        r2 = 8;
        r1 = r1 & r2;
        if (r1 == 0) goto L_0x0113;
    L_0x0111:
        r4 = 1;
        goto L_0x0114;
    L_0x0113:
        r4 = 0;
    L_0x0114:
        r1 = r7.m69380b(r0);
        r21 = r0;
        r17 = r1;
        r0 = 0;
        r1 = 0;
        r22 = 0;
        r23 = 0;
        r24 = 0;
        r25 = 0;
        r26 = 1;
        r27 = 0;
        r28 = 0;
        r29 = -1;
        r30 = -1;
    L_0x0130:
        r10 = 67;
        if (r17 <= 0) goto L_0x036f;
    L_0x0134:
        r2 = r21 + 2;
        r2 = r7.m69376a(r2, r13);
        r3 = "LocalVariableTable";
        r3 = r3.equals(r2);
        if (r3 == 0) goto L_0x01ae;
    L_0x0142:
        r2 = r14.f60322b;
        r2 = r2 & 2;
        if (r2 != 0) goto L_0x01a7;
    L_0x0148:
        r2 = r21 + 8;
        r3 = r7.m69380b(r2);
        r10 = r21;
    L_0x0150:
        if (r3 <= 0) goto L_0x0195;
    L_0x0152:
        r32 = r0;
        r0 = r10 + 10;
        r33 = r1;
        r1 = r7.m69380b(r0);
        r24 = r5[r1];
        if (r24 != 0) goto L_0x0171;
    L_0x0160:
        r34 = r0;
        r0 = r7.m69377a(r1, r5);
        r35 = r2;
        r2 = r0.f60374a;
        r19 = 1;
        r2 = r2 | 1;
        r0.f60374a = r2;
        goto L_0x0175;
    L_0x0171:
        r34 = r0;
        r35 = r2;
    L_0x0175:
        r10 = r10 + 12;
        r0 = r7.m69380b(r10);
        r1 = r1 + r0;
        r0 = r5[r1];
        if (r0 != 0) goto L_0x018a;
    L_0x0180:
        r0 = r7.m69377a(r1, r5);
        r1 = r0.f60374a;
        r2 = 1;
        r1 = r1 | r2;
        r0.f60374a = r1;
    L_0x018a:
        r3 = r3 + -1;
        r0 = r32;
        r1 = r33;
        r10 = r34;
        r2 = r35;
        goto L_0x0150;
    L_0x0195:
        r32 = r0;
        r33 = r1;
        r35 = r2;
        r39 = r4;
        r40 = r5;
        r41 = r6;
        r38 = r9;
        r24 = r35;
        goto L_0x02d7;
    L_0x01a7:
        r32 = r0;
        r33 = r1;
    L_0x01ab:
        r3 = 1;
        goto L_0x02cb;
    L_0x01ae:
        r32 = r0;
        r33 = r1;
        r0 = "LocalVariableTypeTable";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x01c0;
    L_0x01ba:
        r0 = r21 + 8;
        r25 = r0;
        goto L_0x02cb;
    L_0x01c0:
        r0 = "LineNumberTable";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x020f;
    L_0x01c8:
        r0 = r14.f60322b;
        r0 = r0 & 2;
        if (r0 != 0) goto L_0x01ab;
    L_0x01ce:
        r0 = r21 + 8;
        r0 = r7.m69380b(r0);
        r1 = r21;
    L_0x01d6:
        if (r0 <= 0) goto L_0x01ab;
    L_0x01d8:
        r2 = r1 + 10;
        r2 = r7.m69380b(r2);
        r3 = r5[r2];
        if (r3 != 0) goto L_0x01ee;
    L_0x01e2:
        r3 = r7.m69377a(r2, r5);
        r10 = r3.f60374a;
        r19 = 1;
        r10 = r10 | 1;
        r3.f60374a = r10;
    L_0x01ee:
        r2 = r5[r2];
    L_0x01f0:
        r3 = r2.f60375b;
        if (r3 <= 0) goto L_0x0202;
    L_0x01f4:
        r3 = r2.f60382i;
        if (r3 != 0) goto L_0x01ff;
    L_0x01f8:
        r3 = new org.objectweb.asm.p;
        r3.<init>();
        r2.f60382i = r3;
    L_0x01ff:
        r2 = r2.f60382i;
        goto L_0x01f0;
    L_0x0202:
        r3 = r1 + 12;
        r3 = r7.m69380b(r3);
        r2.f60375b = r3;
        r1 = r1 + 4;
        r0 = r0 + -1;
        goto L_0x01d6;
    L_0x020f:
        r0 = "RuntimeVisibleTypeAnnotations";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0243;
    L_0x0217:
        r0 = r21 + 8;
        r1 = 1;
        r0 = r7.m69372a(r15, r14, r0, r1);
        r2 = r0.length;
        if (r2 == 0) goto L_0x0233;
    L_0x0221:
        r2 = 0;
        r3 = r0[r2];
        r3 = r7.m69375a(r3);
        if (r3 >= r10) goto L_0x022b;
    L_0x022a:
        goto L_0x0233;
    L_0x022b:
        r3 = r0[r2];
        r3 = r3 + r1;
        r2 = r7.m69380b(r3);
        goto L_0x0234;
    L_0x0233:
        r2 = -1;
    L_0x0234:
        r1 = r0;
        r29 = r2;
        r39 = r4;
        r40 = r5;
        r41 = r6;
        r38 = r9;
        r0 = r32;
        goto L_0x02d7;
    L_0x0243:
        r0 = "RuntimeInvisibleTypeAnnotations";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0274;
    L_0x024b:
        r0 = r21 + 8;
        r1 = 0;
        r0 = r7.m69372a(r15, r14, r0, r1);
        r2 = r0.length;
        if (r2 == 0) goto L_0x0267;
    L_0x0255:
        r2 = r0[r1];
        r2 = r7.m69375a(r2);
        if (r2 >= r10) goto L_0x025e;
    L_0x025d:
        goto L_0x0267;
    L_0x025e:
        r2 = r0[r1];
        r3 = 1;
        r2 = r2 + r3;
        r2 = r7.m69380b(r2);
        goto L_0x0269;
    L_0x0267:
        r3 = 1;
        r2 = -1;
    L_0x0269:
        r30 = r2;
        r39 = r4;
        r40 = r5;
        r41 = r6;
        r38 = r9;
        goto L_0x02d5;
    L_0x0274:
        r3 = 1;
        r0 = "StackMapTable";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0298;
    L_0x027d:
        r0 = r14.f60322b;
        r0 = r0 & 4;
        if (r0 != 0) goto L_0x02cb;
    L_0x0283:
        r0 = r21 + 10;
        r1 = r21 + 4;
        r1 = r7.m69384d(r1);
        r2 = r21 + 8;
        r2 = r7.m69380b(r2);
        r22 = r0;
        r23 = r1;
        r28 = r2;
        goto L_0x02cb;
    L_0x0298:
        r0 = "StackMap";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x02da;
    L_0x02a0:
        r0 = r14.f60322b;
        r0 = r0 & 4;
        if (r0 != 0) goto L_0x02cb;
    L_0x02a6:
        r0 = r21 + 10;
        r1 = r21 + 4;
        r1 = r7.m69384d(r1);
        r2 = r21 + 8;
        r2 = r7.m69380b(r2);
        r22 = r0;
        r23 = r1;
        r28 = r2;
        r39 = r4;
        r40 = r5;
        r41 = r6;
        r38 = r9;
        r0 = r32;
        r1 = r33;
        r9 = -1;
        r26 = 0;
        goto L_0x0357;
    L_0x02cb:
        r39 = r4;
        r40 = r5;
        r41 = r6;
        r38 = r9;
        r0 = r32;
    L_0x02d5:
        r1 = r33;
    L_0x02d7:
        r9 = -1;
        goto L_0x0357;
    L_0x02da:
        r1 = r27;
        r10 = 0;
    L_0x02dd:
        r0 = r14.f60321a;
        r0 = r0.length;
        if (r10 >= r0) goto L_0x0343;
    L_0x02e2:
        r0 = r14.f60321a;
        r0 = r0[r10];
        r0 = r0.f60309a;
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x031e;
    L_0x02ee:
        r0 = r14.f60321a;
        r0 = r0[r10];
        r19 = r21 + 8;
        r3 = r21 + 4;
        r3 = r7.m69384d(r3);
        r27 = r16 + -8;
        r36 = r32;
        r15 = r1;
        r37 = r33;
        r1 = r7;
        r31 = r2;
        r38 = r9;
        r9 = -1;
        r2 = r19;
        r39 = r4;
        r4 = r13;
        r40 = r5;
        r5 = r27;
        r41 = r6;
        r6 = r40;
        r0 = r0.m69344a(r1, r2, r3, r4, r5, r6);
        if (r0 == 0) goto L_0x032e;
    L_0x031a:
        r0.f60311c = r15;
        r1 = r0;
        goto L_0x032f;
    L_0x031e:
        r15 = r1;
        r31 = r2;
        r39 = r4;
        r40 = r5;
        r41 = r6;
        r38 = r9;
        r36 = r32;
        r37 = r33;
        r9 = -1;
    L_0x032e:
        r1 = r15;
    L_0x032f:
        r10 = r10 + 1;
        r2 = r31;
        r32 = r36;
        r33 = r37;
        r9 = r38;
        r4 = r39;
        r5 = r40;
        r6 = r41;
        r3 = 1;
        r15 = r59;
        goto L_0x02dd;
    L_0x0343:
        r15 = r1;
        r39 = r4;
        r40 = r5;
        r41 = r6;
        r38 = r9;
        r36 = r32;
        r37 = r33;
        r9 = -1;
        r27 = r15;
        r0 = r36;
        r1 = r37;
    L_0x0357:
        r2 = r21 + 4;
        r2 = r7.m69384d(r2);
        r2 = r2 + 6;
        r21 = r21 + r2;
        r17 = r17 + -1;
        r9 = r38;
        r4 = r39;
        r5 = r40;
        r6 = r41;
        r15 = r59;
        goto L_0x0130;
    L_0x036f:
        r36 = r0;
        r37 = r1;
        r39 = r4;
        r40 = r5;
        r41 = r6;
        r38 = r9;
        r9 = -1;
        if (r22 == 0) goto L_0x03d3;
    L_0x037e:
        r14.f60331k = r9;
        r0 = 0;
        r14.f60335o = r0;
        r14.f60336p = r0;
        r14.f60337q = r0;
        r14.f60339s = r0;
        r0 = new java.lang.Object[r11];
        r14.f60338r = r0;
        r0 = new java.lang.Object[r12];
        r14.f60340t = r0;
        r6 = r39;
        if (r6 == 0) goto L_0x0398;
    L_0x0395:
        r7.m69370a(r14);
    L_0x0398:
        r0 = r22;
    L_0x039a:
        r1 = r22 + r23;
        r1 = r1 + -2;
        if (r0 >= r1) goto L_0x03cd;
    L_0x03a0:
        r1 = r8[r0];
        r2 = 8;
        if (r1 != r2) goto L_0x03c2;
    L_0x03a6:
        r1 = r0 + 1;
        r1 = r7.m69380b(r1);
        if (r1 < 0) goto L_0x03c2;
    L_0x03ae:
        r15 = r38;
        if (r1 >= r15) goto L_0x03c4;
    L_0x03b2:
        r2 = r16 + r1;
        r2 = r8[r2];
        r2 = r2 & 255;
        r3 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        if (r2 != r3) goto L_0x03c4;
    L_0x03bc:
        r5 = r40;
        r7.m69377a(r1, r5);
        goto L_0x03c6;
    L_0x03c2:
        r15 = r38;
    L_0x03c4:
        r5 = r40;
    L_0x03c6:
        r0 = r0 + 1;
        r40 = r5;
        r38 = r15;
        goto L_0x039a;
    L_0x03cd:
        r15 = r38;
        r5 = r40;
        r0 = r14;
        goto L_0x03da;
    L_0x03d3:
        r15 = r38;
        r6 = r39;
        r5 = r40;
        r0 = 0;
    L_0x03da:
        r3 = r0;
        r4 = r16;
        r17 = 0;
        r18 = 0;
    L_0x03e1:
        r2 = r41;
        if (r4 >= r2) goto L_0x07ee;
    L_0x03e5:
        r1 = r4 - r16;
        r0 = r5[r1];
        if (r0 == 0) goto L_0x0410;
    L_0x03eb:
        r10 = r0.f60382i;
        r9 = 0;
        r0.f60382i = r9;
        r42 = r12;
        r12 = r59;
        r12.mo14620a(r0);
        r9 = r14.f60322b;
        r9 = r9 & 2;
        if (r9 != 0) goto L_0x0414;
    L_0x03fd:
        r9 = r0.f60375b;
        if (r9 <= 0) goto L_0x0414;
    L_0x0401:
        r9 = r0.f60375b;
        r12.mo14626b(r9, r0);
    L_0x0406:
        if (r10 == 0) goto L_0x0414;
    L_0x0408:
        r9 = r10.f60375b;
        r12.mo14626b(r9, r0);
        r10 = r10.f60382i;
        goto L_0x0406;
    L_0x0410:
        r42 = r12;
        r12 = r59;
    L_0x0414:
        r9 = r3;
        r10 = r22;
    L_0x0417:
        if (r9 == 0) goto L_0x04a1;
    L_0x0419:
        r0 = r9.f60331k;
        if (r0 == r1) goto L_0x0423;
    L_0x041d:
        r0 = r9.f60331k;
        r3 = -1;
        if (r0 != r3) goto L_0x04a1;
    L_0x0422:
        goto L_0x0424;
    L_0x0423:
        r3 = -1;
    L_0x0424:
        r0 = r9.f60331k;
        if (r0 == r3) goto L_0x046e;
    L_0x0428:
        r3 = r26;
        if (r3 == 0) goto L_0x0454;
    L_0x042c:
        if (r6 == 0) goto L_0x042f;
    L_0x042e:
        goto L_0x0454;
    L_0x042f:
        r0 = r9.f60335o;
        r43 = r2;
        r2 = r9.f60337q;
        r44 = r3;
        r3 = r9.f60338r;
        r45 = r4;
        r4 = r9.f60339s;
        r46 = r5;
        r5 = r9.f60340t;
        r19 = r0;
        r0 = r12;
        r47 = r11;
        r11 = r1;
        r1 = r19;
        r19 = r43;
        r48 = r15;
        r15 = r44;
        r21 = r45;
        r22 = r46;
        goto L_0x046a;
    L_0x0454:
        r19 = r2;
        r21 = r4;
        r22 = r5;
        r47 = r11;
        r48 = r15;
        r11 = r1;
        r15 = r3;
        r1 = -1;
        r2 = r9.f60336p;
        r3 = r9.f60338r;
        r4 = r9.f60339s;
        r5 = r9.f60340t;
        r0 = r12;
    L_0x046a:
        r0.mo14610a(r1, r2, r3, r4, r5);
        goto L_0x047b;
    L_0x046e:
        r19 = r2;
        r21 = r4;
        r22 = r5;
        r47 = r11;
        r48 = r15;
        r15 = r26;
        r11 = r1;
    L_0x047b:
        if (r28 <= 0) goto L_0x0491;
    L_0x047d:
        r10 = r7.m69362a(r10, r15, r6, r9);
        r28 = r28 + -1;
        r1 = r11;
        r26 = r15;
        r2 = r19;
        r4 = r21;
        r5 = r22;
        r11 = r47;
        r15 = r48;
        goto L_0x0417;
    L_0x0491:
        r1 = r11;
        r26 = r15;
        r2 = r19;
        r4 = r21;
        r5 = r22;
        r11 = r47;
        r15 = r48;
        r9 = 0;
        goto L_0x0417;
    L_0x04a1:
        r19 = r2;
        r21 = r4;
        r22 = r5;
        r47 = r11;
        r48 = r15;
        r15 = r26;
        r11 = r1;
        r0 = r8[r21];
        r5 = r0 & 255;
        r0 = org.objectweb.asm.C19506g.f60913c;
        r0 = r0[r5];
        switch(r0) {
            case 0: goto L_0x0715;
            case 1: goto L_0x0701;
            case 2: goto L_0x06eb;
            case 3: goto L_0x06d8;
            case 4: goto L_0x06b8;
            case 5: goto L_0x06a5;
            case 6: goto L_0x0654;
            case 7: goto L_0x0654;
            case 8: goto L_0x05fd;
            case 9: goto L_0x05dd;
            case 10: goto L_0x05c6;
            case 11: goto L_0x05b2;
            case 12: goto L_0x05a0;
            case 13: goto L_0x058e;
            case 14: goto L_0x0551;
            case 15: goto L_0x0510;
            case 16: goto L_0x04b9;
            case 17: goto L_0x04da;
            default: goto L_0x04b9;
        };
    L_0x04b9:
        r50 = r6;
        r51 = r9;
        r20 = 8;
        r23 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r4 = r21 + 1;
        r0 = r7.m69381b(r4, r13);
        r4 = r21 + 3;
        r1 = r8[r4];
        r1 = r1 & 255;
        r12.mo14627b(r0, r1);
        r4 = r21 + 4;
    L_0x04d2:
        r0 = r17;
        r1 = r29;
        r9 = r37;
        goto L_0x0725;
    L_0x04da:
        r4 = r21 + 1;
        r0 = r8[r4];
        r0 = r0 & 255;
        r4 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        if (r0 != r4) goto L_0x0504;
    L_0x04e4:
        r0 = r21 + 2;
        r0 = r7.m69380b(r0);
        r1 = r21 + 4;
        r1 = r7.m69383c(r1);
        r12.mo14630c(r0, r1);
        r0 = r21 + 6;
    L_0x04f5:
        r4 = r0;
        r50 = r6;
        r51 = r9;
        r0 = r17;
        r1 = r29;
        r9 = r37;
        r20 = 8;
        goto L_0x05f9;
    L_0x0504:
        r1 = r21 + 2;
        r1 = r7.m69380b(r1);
        r12.mo14625b(r0, r1);
        r0 = r21 + 4;
        goto L_0x04f5;
    L_0x0510:
        r4 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r0 = r21 + 4;
        r1 = r11 & 3;
        r0 = r0 - r1;
        r1 = r7.m69384d(r0);
        r1 = r1 + r11;
        r2 = r0 + 4;
        r2 = r7.m69384d(r2);
        r3 = new int[r2];
        r5 = new org.objectweb.asm.C19346p[r2];
        r20 = 8;
        r0 = r0 + 8;
        r4 = r0;
        r0 = 0;
    L_0x052c:
        if (r0 >= r2) goto L_0x0548;
    L_0x052e:
        r21 = r7.m69384d(r4);
        r3[r0] = r21;
        r49 = r2;
        r2 = r4 + 4;
        r2 = r7.m69384d(r2);
        r2 = r2 + r11;
        r2 = r22[r2];
        r5[r0] = r2;
        r4 = r4 + 8;
        r0 = r0 + 1;
        r2 = r49;
        goto L_0x052c;
    L_0x0548:
        r0 = r22[r1];
        r12.mo14622a(r0, r3, r5);
        r50 = r6;
        goto L_0x05f1;
    L_0x0551:
        r20 = 8;
        r4 = r21 + 4;
        r0 = r11 & 3;
        r4 = r4 - r0;
        r0 = r7.m69384d(r4);
        r1 = r11 + r0;
        r0 = r4 + 4;
        r0 = r7.m69384d(r0);
        r2 = r4 + 8;
        r2 = r7.m69384d(r2);
        r3 = r2 - r0;
        r5 = 1;
        r3 = r3 + r5;
        r3 = new org.objectweb.asm.C19346p[r3];
        r4 = r4 + 12;
        r5 = r4;
        r50 = r6;
        r4 = 0;
    L_0x0576:
        r6 = r3.length;
        if (r4 >= r6) goto L_0x0587;
    L_0x0579:
        r6 = r7.m69384d(r5);
        r6 = r6 + r11;
        r6 = r22[r6];
        r3[r4] = r6;
        r5 = r5 + 4;
        r4 = r4 + 1;
        goto L_0x0576;
    L_0x0587:
        r1 = r22[r1];
        r12.mo14609a(r0, r2, r1, r3);
        r4 = r5;
        goto L_0x05f1;
    L_0x058e:
        r50 = r6;
        r20 = 8;
        r4 = r21 + 1;
        r0 = r8[r4];
        r0 = r0 & 255;
        r4 = r21 + 2;
        r1 = r8[r4];
        r12.mo14630c(r0, r1);
        goto L_0x05ef;
    L_0x05a0:
        r50 = r6;
        r20 = 8;
        r4 = r21 + 1;
        r0 = r7.m69380b(r4);
        r0 = r7.m69382c(r0, r13);
        r12.mo14615a(r0);
        goto L_0x05ef;
    L_0x05b2:
        r50 = r6;
        r20 = 8;
        r4 = r21 + 1;
        r0 = r8[r4];
        r0 = r0 & 255;
        r0 = r7.m69382c(r0, r13);
        r12.mo14615a(r0);
        r4 = r21 + 2;
        goto L_0x05f1;
    L_0x05c6:
        r50 = r6;
        r6 = 1;
        r20 = 8;
        r5 = r5 + -33;
        r4 = r21 + 1;
        r0 = r7.m69384d(r4);
        r1 = r11 + r0;
        r0 = r22[r1];
        r12.mo14614a(r5, r0);
    L_0x05da:
        r4 = r21 + 5;
        goto L_0x05f1;
    L_0x05dd:
        r50 = r6;
        r6 = 1;
        r20 = 8;
        r4 = r21 + 1;
        r0 = r7.m69383c(r4);
        r1 = r11 + r0;
        r0 = r22[r1];
        r12.mo14614a(r5, r0);
    L_0x05ef:
        r4 = r21 + 3;
    L_0x05f1:
        r51 = r9;
        r0 = r17;
        r1 = r29;
        r9 = r37;
    L_0x05f9:
        r23 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        goto L_0x0725;
    L_0x05fd:
        r50 = r6;
        r6 = 1;
        r20 = 8;
        r0 = r7.f60316c;
        r4 = r21 + 1;
        r1 = r7.m69380b(r4);
        r0 = r0[r1];
        r1 = r14.f60324d;
        r2 = r7.m69380b(r0);
        r1 = r1[r2];
        r2 = r7.m69380b(r1);
        r2 = r7.m69382c(r2, r13);
        r2 = (org.objectweb.asm.C19343m) r2;
        r3 = r1 + 2;
        r3 = r7.m69380b(r3);
        r4 = new java.lang.Object[r3];
        r1 = r1 + 4;
        r5 = r1;
        r1 = 0;
    L_0x062a:
        if (r1 >= r3) goto L_0x063c;
    L_0x062c:
        r6 = r7.m69380b(r5);
        r6 = r7.m69382c(r6, r13);
        r4[r1] = r6;
        r5 = r5 + 2;
        r1 = r1 + 1;
        r6 = 1;
        goto L_0x062a;
    L_0x063c:
        r1 = r7.f60316c;
        r0 = r0 + 2;
        r0 = r7.m69380b(r0);
        r0 = r1[r0];
        r1 = r7.m69376a(r0, r13);
        r0 = r0 + 2;
        r0 = r7.m69376a(r0, r13);
        r12.mo14618a(r1, r0, r2, r4);
        goto L_0x05da;
    L_0x0654:
        r50 = r6;
        r20 = 8;
        r0 = r7.f60316c;
        r4 = r21 + 1;
        r1 = r7.m69380b(r4);
        r0 = r0[r1];
        r1 = r0 + -1;
        r1 = r8[r1];
        r2 = 11;
        if (r1 != r2) goto L_0x066c;
    L_0x066a:
        r6 = 1;
        goto L_0x066d;
    L_0x066c:
        r6 = 0;
    L_0x066d:
        r2 = r7.m69381b(r0, r13);
        r1 = r7.f60316c;
        r0 = r0 + 2;
        r0 = r7.m69380b(r0);
        r0 = r1[r0];
        r3 = r7.m69376a(r0, r13);
        r0 = r0 + 2;
        r4 = r7.m69376a(r0, r13);
        r0 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;
        if (r5 >= r0) goto L_0x0692;
    L_0x0689:
        r12.mo14612a(r5, r2, r3, r4);
        r51 = r9;
        r23 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r9 = r5;
        goto L_0x069d;
    L_0x0692:
        r0 = r12;
        r1 = r5;
        r23 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r51 = r9;
        r9 = r5;
        r5 = r6;
        r0.mo14613a(r1, r2, r3, r4, r5);
    L_0x069d:
        r0 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;
        if (r9 != r0) goto L_0x06fd;
    L_0x06a1:
        r4 = r21 + 5;
        goto L_0x04d2;
    L_0x06a5:
        r50 = r6;
        r51 = r9;
        r20 = 8;
        r23 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r9 = r5;
        r4 = r21 + 1;
        r0 = r7.m69381b(r4, r13);
        r12.mo14611a(r9, r0);
        goto L_0x06fd;
    L_0x06b8:
        r50 = r6;
        r51 = r9;
        r20 = 8;
        r23 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r9 = r5;
        r0 = 54;
        if (r9 <= r0) goto L_0x06d1;
    L_0x06c5:
        r5 = r9 + -59;
        r0 = r5 >> 2;
        r0 = r0 + 54;
    L_0x06cb:
        r1 = r5 & 3;
        r12.mo14625b(r0, r1);
        goto L_0x0721;
    L_0x06d1:
        r5 = r9 + -26;
        r0 = r5 >> 2;
        r0 = r0 + 21;
        goto L_0x06cb;
    L_0x06d8:
        r50 = r6;
        r51 = r9;
        r20 = 8;
        r23 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r9 = r5;
        r4 = r21 + 1;
        r0 = r8[r4];
        r0 = r0 & 255;
        r12.mo14625b(r9, r0);
        goto L_0x0711;
    L_0x06eb:
        r50 = r6;
        r51 = r9;
        r20 = 8;
        r23 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r9 = r5;
        r4 = r21 + 1;
        r0 = r7.m69383c(r4);
        r12.mo14608a(r9, r0);
    L_0x06fd:
        r4 = r21 + 3;
        goto L_0x04d2;
    L_0x0701:
        r50 = r6;
        r51 = r9;
        r20 = 8;
        r23 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r9 = r5;
        r4 = r21 + 1;
        r0 = r8[r4];
        r12.mo14608a(r9, r0);
    L_0x0711:
        r4 = r21 + 2;
        goto L_0x04d2;
    L_0x0715:
        r50 = r6;
        r51 = r9;
        r20 = 8;
        r23 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r9 = r5;
        r12.mo14607a(r9);
    L_0x0721:
        r4 = r21 + 1;
        goto L_0x04d2;
    L_0x0725:
        if (r9 == 0) goto L_0x0762;
    L_0x0727:
        r2 = r9.length;
        if (r0 >= r2) goto L_0x0762;
    L_0x072a:
        if (r1 > r11) goto L_0x0762;
    L_0x072c:
        if (r1 != r11) goto L_0x0746;
    L_0x072e:
        r1 = r9[r0];
        r1 = r7.m69366a(r14, r1);
        r2 = r1 + 2;
        r3 = r14.f60329i;
        r5 = r14.f60330j;
        r1 = r7.m69376a(r1, r13);
        r6 = 1;
        r1 = r12.mo14623b(r3, r5, r1, r6);
        r7.m69364a(r2, r13, r6, r1);
    L_0x0746:
        r0 = r0 + 1;
        r1 = r9.length;
        if (r0 >= r1) goto L_0x0760;
    L_0x074b:
        r1 = r9[r0];
        r1 = r7.m69375a(r1);
        r2 = 67;
        if (r1 >= r2) goto L_0x0756;
    L_0x0755:
        goto L_0x0760;
    L_0x0756:
        r1 = r9[r0];
        r2 = 1;
        r1 = r1 + r2;
        r2 = r7.m69380b(r1);
        r1 = r2;
        goto L_0x0725;
    L_0x0760:
        r1 = -1;
        goto L_0x0725;
    L_0x0762:
        r2 = r18;
        r3 = r30;
        r6 = r36;
    L_0x0768:
        if (r6 == 0) goto L_0x07c0;
    L_0x076a:
        r5 = r6.length;
        if (r2 >= r5) goto L_0x07c0;
    L_0x076d:
        if (r3 > r11) goto L_0x07c0;
    L_0x076f:
        if (r3 != r11) goto L_0x0791;
    L_0x0771:
        r3 = r6[r2];
        r3 = r7.m69366a(r14, r3);
        r5 = r3 + 2;
        r52 = r0;
        r0 = r14.f60329i;
        r53 = r1;
        r1 = r14.f60330j;
        r3 = r7.m69376a(r3, r13);
        r54 = r10;
        r10 = 0;
        r0 = r12.mo14623b(r0, r1, r3, r10);
        r1 = 1;
        r7.m69364a(r5, r13, r1, r0);
        goto L_0x0798;
    L_0x0791:
        r52 = r0;
        r53 = r1;
        r54 = r10;
        r10 = 0;
    L_0x0798:
        r2 = r2 + 1;
        r0 = r6.length;
        if (r2 >= r0) goto L_0x07b4;
    L_0x079d:
        r0 = r6[r2];
        r0 = r7.m69375a(r0);
        r1 = 67;
        if (r0 >= r1) goto L_0x07a8;
    L_0x07a7:
        goto L_0x07b6;
    L_0x07a8:
        r0 = r6[r2];
        r17 = 1;
        r0 = r0 + 1;
        r0 = r7.m69380b(r0);
        r3 = r0;
        goto L_0x07b9;
    L_0x07b4:
        r1 = 67;
    L_0x07b6:
        r17 = 1;
        r3 = -1;
    L_0x07b9:
        r0 = r52;
        r1 = r53;
        r10 = r54;
        goto L_0x0768;
    L_0x07c0:
        r52 = r0;
        r53 = r1;
        r54 = r10;
        r1 = 67;
        r10 = 0;
        r17 = 1;
        r18 = r2;
        r30 = r3;
        r36 = r6;
        r37 = r9;
        r26 = r15;
        r41 = r19;
        r5 = r22;
        r12 = r42;
        r11 = r47;
        r15 = r48;
        r6 = r50;
        r3 = r51;
        r17 = r52;
        r29 = r53;
        r22 = r54;
        r9 = -1;
        r10 = 67;
        goto L_0x03e1;
    L_0x07ee:
        r22 = r5;
        r47 = r11;
        r42 = r12;
        r48 = r15;
        r6 = r36;
        r9 = r37;
        r10 = 0;
        r12 = r59;
        r17 = 1;
        r0 = r22[r48];
        if (r0 == 0) goto L_0x0808;
    L_0x0803:
        r0 = r22[r48];
        r12.mo14620a(r0);
    L_0x0808:
        r0 = r14.f60322b;
        r0 = r0 & 2;
        if (r0 != 0) goto L_0x08a7;
    L_0x080e:
        r0 = r24;
        if (r0 == 0) goto L_0x08a7;
    L_0x0812:
        r1 = r25;
        if (r1 == 0) goto L_0x0841;
    L_0x0816:
        r25 = r1 + 2;
        r1 = r7.m69380b(r1);
        r1 = r1 * 3;
        r3 = new int[r1];
        r1 = r3.length;
        r2 = r25;
    L_0x0823:
        if (r1 <= 0) goto L_0x083f;
    L_0x0825:
        r1 = r1 + -1;
        r4 = r2 + 6;
        r3[r1] = r4;
        r4 = -1;
        r1 = r1 + r4;
        r5 = r2 + 8;
        r5 = r7.m69380b(r5);
        r3[r1] = r5;
        r1 = r1 + r4;
        r5 = r7.m69380b(r2);
        r3[r1] = r5;
        r2 = r2 + 10;
        goto L_0x0823;
    L_0x083f:
        r8 = r3;
        goto L_0x0842;
    L_0x0841:
        r8 = 0;
    L_0x0842:
        r24 = r0 + 2;
        r0 = r7.m69380b(r0);
        r11 = r0;
        r15 = r24;
    L_0x084b:
        if (r11 <= 0) goto L_0x08a7;
    L_0x084d:
        r0 = r7.m69380b(r15);
        r1 = r15 + 2;
        r1 = r7.m69380b(r1);
        r2 = r15 + 8;
        r5 = r7.m69380b(r2);
        if (r8 == 0) goto L_0x087a;
    L_0x085f:
        r2 = 0;
    L_0x0860:
        r3 = r8.length;
        if (r2 >= r3) goto L_0x087a;
    L_0x0863:
        r3 = r8[r2];
        if (r3 != r0) goto L_0x0877;
    L_0x0867:
        r3 = r2 + 1;
        r3 = r8[r3];
        if (r3 != r5) goto L_0x0877;
    L_0x086d:
        r2 = r2 + 2;
        r2 = r8[r2];
        r2 = r7.m69376a(r2, r13);
        r3 = r2;
        goto L_0x087b;
    L_0x0877:
        r2 = r2 + 3;
        goto L_0x0860;
    L_0x087a:
        r3 = 0;
    L_0x087b:
        r2 = r15 + 4;
        r2 = r7.m69376a(r2, r13);
        r4 = r15 + 6;
        r4 = r7.m69376a(r4, r13);
        r16 = r22[r0];
        r0 = r0 + r1;
        r18 = r22[r0];
        r0 = r12;
        r1 = r2;
        r2 = r4;
        r4 = r16;
        r16 = r5;
        r5 = r18;
        r55 = r6;
        r10 = 1;
        r6 = r16;
        r0.mo14617a(r1, r2, r3, r4, r5, r6);
        r15 = r15 + 10;
        r11 = r11 + -1;
        r6 = r55;
        r10 = 0;
        r17 = 1;
        goto L_0x084b;
    L_0x08a7:
        r55 = r6;
        r10 = 1;
        if (r9 == 0) goto L_0x0906;
    L_0x08ac:
        r0 = 0;
    L_0x08ad:
        r1 = r9.length;
        if (r0 >= r1) goto L_0x0906;
    L_0x08b0:
        r1 = r9[r0];
        r1 = r7.m69375a(r1);
        r1 = r1 >> r10;
        r2 = 32;
        if (r1 != r2) goto L_0x08ed;
    L_0x08bb:
        r1 = r9[r0];
        r1 = r7.m69366a(r14, r1);
        r2 = r1 + 2;
        r3 = r14.f60329i;
        r4 = r14.f60330j;
        r11 = r14.f60332l;
        r5 = r14.f60333m;
        r6 = r14.f60334n;
        r1 = r7.m69376a(r1, r13);
        r15 = 1;
        r8 = r12;
        r16 = r9;
        r9 = r3;
        r3 = 1;
        r17 = 0;
        r10 = r4;
        r4 = r47;
        r56 = r42;
        r12 = r5;
        r5 = r13;
        r13 = r6;
        r6 = r14;
        r14 = r1;
        r1 = r59;
        r8 = r8.mo14605a(r9, r10, r11, r12, r13, r14, r15);
        r7.m69364a(r2, r5, r3, r8);
        goto L_0x08f9;
    L_0x08ed:
        r16 = r9;
        r1 = r12;
        r5 = r13;
        r6 = r14;
        r56 = r42;
        r4 = r47;
        r3 = 1;
        r17 = 0;
    L_0x08f9:
        r0 = r0 + 1;
        r12 = r1;
        r47 = r4;
        r13 = r5;
        r14 = r6;
        r9 = r16;
        r42 = r56;
        r10 = 1;
        goto L_0x08ad;
    L_0x0906:
        r1 = r12;
        r5 = r13;
        r6 = r14;
        r56 = r42;
        r4 = r47;
        r3 = 1;
        r17 = 0;
        r0 = r55;
        if (r0 == 0) goto L_0x094d;
    L_0x0914:
        r2 = 0;
    L_0x0915:
        r8 = r0.length;
        if (r2 >= r8) goto L_0x094d;
    L_0x0918:
        r8 = r0[r2];
        r8 = r7.m69375a(r8);
        r8 = r8 >> r3;
        r9 = 32;
        if (r8 != r9) goto L_0x0948;
    L_0x0923:
        r8 = r0[r2];
        r8 = r7.m69366a(r6, r8);
        r15 = r8 + 2;
        r9 = r6.f60329i;
        r10 = r6.f60330j;
        r11 = r6.f60332l;
        r12 = r6.f60333m;
        r13 = r6.f60334n;
        r14 = r7.m69376a(r8, r5);
        r16 = 0;
        r8 = r1;
        r3 = r15;
        r15 = r16;
        r8 = r8.mo14605a(r9, r10, r11, r12, r13, r14, r15);
        r9 = 1;
        r7.m69364a(r3, r5, r9, r8);
        goto L_0x0949;
    L_0x0948:
        r9 = 1;
    L_0x0949:
        r2 = r2 + 1;
        r3 = 1;
        goto L_0x0915;
    L_0x094d:
        r0 = r27;
    L_0x094f:
        if (r0 == 0) goto L_0x095b;
    L_0x0951:
        r2 = r0.f60311c;
        r3 = 0;
        r0.f60311c = r3;
        r1.mo14619a(r0);
        r0 = r2;
        goto L_0x094f;
    L_0x095b:
        r0 = r56;
        r1.mo14631d(r0, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.e.a(org.objectweb.asm.q, org.objectweb.asm.h, int):void");
    }

    /* renamed from: a */
    private int[] m69372a(C19347q c19347q, C19339h c19339h, int i, boolean z) {
        char[] cArr = c19339h.f60323c;
        int[] iArr = new int[m69380b(i)];
        i += 2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int b;
            iArr[i2] = i;
            int d = m69384d(i);
            int i3 = d >>> 24;
            switch (i3) {
                case 0:
                case 1:
                    i += 2;
                    break;
                default:
                    switch (i3) {
                        case 19:
                        case 20:
                        case 21:
                            i++;
                            break;
                        case 22:
                            break;
                        default:
                            switch (i3) {
                                case 64:
                                case 65:
                                    for (b = m69380b(i + 1); b > 0; b--) {
                                        int b2 = m69380b(i + 3);
                                        int b3 = m69380b(i + 5);
                                        m69377a(b2, c19339h.f60328h);
                                        m69377a(b2 + b3, c19339h.f60328h);
                                        i += 6;
                                    }
                                    break;
                                default:
                                    switch (i3) {
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                            i += 4;
                                            break;
                                    }
                                    break;
                            }
                            i += 3;
                            break;
                    }
                    i += 2;
                    break;
            }
            b = m69375a(i);
            C19349t c19349t = null;
            if (i3 == 66) {
                if (b != 0) {
                    c19349t = new C19349t(this.f60314a, i);
                }
                i += (b * 2) + 1;
                i = m69364a(i + 2, cArr, true, c19347q.mo14628c(d, c19349t, m69376a(i, cArr), z));
            } else {
                i = m69364a((i + 3) + (b * 2), cArr, true, null);
            }
        }
        return iArr;
    }

    /* renamed from: b */
    private int m69373b(C19338f c19338f, C19339h c19339h, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String[] strArr;
        String str;
        C19339h c19339h2 = c19339h;
        int i8 = i;
        char[] cArr = c19339h2.f60323c;
        c19339h2.f60325e = m69380b(i8);
        c19339h2.f60326f = m69376a(i8 + 2, cArr);
        c19339h2.f60327g = m69376a(i8 + 4, cArr);
        int i9 = i8 + 6;
        int i10 = i9;
        i8 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        String[] strArr2 = null;
        String str2 = null;
        C19335c c19335c = null;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        for (int b = m69380b(i9); b > 0; b--) {
            String a = m69376a(i10 + 2, cArr);
            int i20 = i8;
            if (!"Code".equals(a)) {
                int i21;
                if ("Exceptions".equals(a)) {
                    String[] strArr3 = new String[m69380b(i10 + 8)];
                    i21 = i11;
                    i2 = i10 + 10;
                    for (int i22 = 0; i22 < strArr3.length; i22++) {
                        strArr3[i22] = m69381b(i2, cArr);
                        i2 += 2;
                    }
                    strArr2 = strArr3;
                    i17 = i2;
                } else {
                    i21 = i11;
                    if ("Signature".equals(a)) {
                        str2 = m69376a(i10 + 8, cArr);
                    } else {
                        if ("Deprecated".equals(a)) {
                            i8 = c19339h2.f60325e;
                            i11 = 131072;
                        } else if ("RuntimeVisibleAnnotations".equals(a)) {
                            i15 = i10 + 8;
                        } else if ("RuntimeVisibleTypeAnnotations".equals(a)) {
                            i12 = i10 + 8;
                        } else if ("AnnotationDefault".equals(a)) {
                            i14 = i10 + 8;
                        } else if ("Synthetic".equals(a)) {
                            i8 = c19339h2.f60325e;
                            i11 = 266240;
                        } else if ("RuntimeInvisibleAnnotations".equals(a)) {
                            i13 = i10 + 8;
                        } else if ("RuntimeInvisibleTypeAnnotations".equals(a)) {
                            i11 = i10 + 8;
                        } else if ("RuntimeVisibleParameterAnnotations".equals(a)) {
                            i8 = i10 + 8;
                            i11 = i21;
                            i10 += m69384d(i10 + 4) + 6;
                        } else if ("RuntimeInvisibleParameterAnnotations".equals(a)) {
                            i18 = i10 + 8;
                        } else if ("MethodParameters".equals(a)) {
                            i16 = i10 + 8;
                        } else {
                            i3 = i20;
                            i4 = i21;
                            i5 = i12;
                            String str3 = a;
                            i2 = i13;
                            i6 = i14;
                            i7 = i15;
                            strArr = strArr2;
                            str = str2;
                            C19335c a2 = m69369a(c19339h2.f60321a, str3, i10 + 8, m69384d(i10 + 4), cArr, -1, null);
                            if (a2 != null) {
                                a2.f60311c = c19335c;
                                c19335c = a2;
                            }
                            i13 = i2;
                            i8 = i3;
                            i11 = i4;
                            i12 = i5;
                            i14 = i6;
                            i15 = i7;
                            strArr2 = strArr;
                            str2 = str;
                            i10 += m69384d(i10 + 4) + 6;
                        }
                        c19339h2.f60325e = i8 | i11;
                        i5 = i12;
                        i2 = i13;
                        i6 = i14;
                        i7 = i15;
                        strArr = strArr2;
                        str = str2;
                        i3 = i20;
                        i4 = i21;
                        i13 = i2;
                        i8 = i3;
                        i11 = i4;
                        i12 = i5;
                        i14 = i6;
                        i15 = i7;
                        strArr2 = strArr;
                        str2 = str;
                        i10 += m69384d(i10 + 4) + 6;
                    }
                }
                i8 = i20;
                i11 = i21;
                i10 += m69384d(i10 + 4) + 6;
            } else if ((c19339h2.f60322b & 1) == 0) {
                i19 = i10 + 8;
            } else {
                i4 = i11;
                i5 = i12;
                i2 = i13;
                i6 = i14;
                i7 = i15;
                strArr = strArr2;
                str = str2;
                i3 = i20;
                i13 = i2;
                i8 = i3;
                i11 = i4;
                i12 = i5;
                i14 = i6;
                i15 = i7;
                strArr2 = strArr;
                str2 = str;
                i10 += m69384d(i10 + 4) + 6;
            }
            i8 = i20;
            i10 += m69384d(i10 + 4) + 6;
        }
        i3 = i8;
        i4 = i11;
        i5 = i12;
        i2 = i13;
        i6 = i14;
        i7 = i15;
        strArr = strArr2;
        str = str2;
        i10 += 2;
        C19347q a3 = c19338f.mo14591a(c19339h2.f60325e, c19339h2.f60326f, c19339h2.f60327g, str, strArr);
        if (a3 == null) {
            return i10;
        }
        if (a3 instanceof C19508r) {
            C19508r c19508r = (C19508r) a3;
            if (c19508r.f60990c.f60930d == r8 && str == c19508r.f60991d) {
                Object obj;
                strArr2 = strArr;
                if (strArr2 == null) {
                    if (c19508r.f60994g == 0) {
                    }
                    obj = null;
                    if (obj != null) {
                        c19508r.f60992e = i9;
                        c19508r.f60993f = i10 - i9;
                        return i10;
                    }
                }
                if (strArr2.length == c19508r.f60994g) {
                    i12 = strArr2.length - 1;
                    while (i12 >= 0) {
                        i13 = i17 - 2;
                        if (c19508r.f60995h[i12] == m69380b(i13)) {
                            i12--;
                            i17 = i13;
                        }
                    }
                }
                obj = null;
                if (obj != null) {
                    c19508r.f60992e = i9;
                    c19508r.f60993f = i10 - i9;
                    return i10;
                }
                obj = 1;
                if (obj != null) {
                    c19508r.f60992e = i9;
                    c19508r.f60993f = i10 - i9;
                    return i10;
                }
            }
        }
        if (i16 != 0) {
            i11 = r8.f60314a[i16] & 255;
            i12 = i16 + 1;
            while (i11 > 0) {
                a3.mo14616a(m69376a(i12, cArr), m69380b(i12 + 2));
                i11--;
                i12 += 4;
            }
        }
        i14 = i6;
        if (i14 != 0) {
            C19334a a4 = a3.mo14602a();
            m69363a(i14, cArr, null, a4);
            if (a4 != null) {
                a4.mo14585a();
            }
        }
        i15 = i7;
        if (i15 != 0) {
            i15 += 2;
            for (i11 = m69380b(i15); i11 > 0; i11--) {
                i15 = m69364a(i15 + 2, cArr, true, a3.mo14606a(m69376a(i15, cArr), true));
            }
        }
        if (i2 != 0) {
            i13 = i2 + 2;
            for (i11 = m69380b(i2); i11 > 0; i11--) {
                i13 = m69364a(i13 + 2, cArr, true, a3.mo14606a(m69376a(i13, cArr), false));
            }
        }
        i12 = i5;
        if (i12 != 0) {
            i12 += 2;
            for (i11 = m69380b(i12); i11 > 0; i11--) {
                i12 = m69366a(c19339h2, i12);
                i12 = m69364a(i12 + 2, cArr, true, a3.mo14604a(c19339h2.f60329i, c19339h2.f60330j, m69376a(i12, cArr), true));
            }
        }
        i11 = i4;
        if (i11 != 0) {
            i11 += 2;
            for (i12 = m69380b(i11); i12 > 0; i12--) {
                i11 = m69366a(c19339h2, i11);
                i11 = m69364a(i11 + 2, cArr, true, a3.mo14604a(c19339h2.f60329i, c19339h2.f60330j, m69376a(i11, cArr), false));
            }
        }
        i11 = i3;
        if (i11 != 0) {
            m69374b(a3, c19339h2, i11, true);
        }
        i11 = i18;
        if (i11 != 0) {
            m69374b(a3, c19339h2, i11, false);
        }
        while (c19335c != null) {
            C19335c c19335c2 = c19335c.f60311c;
            c19335c.f60311c = null;
            a3.mo14619a(c19335c);
            c19335c = c19335c2;
        }
        int i23 = i19;
        if (i23 != 0) {
            a3.mo14624b();
            m69371a(a3, c19339h2, i23);
        }
        a3.mo14629c();
        return i10;
    }

    /* renamed from: b */
    private void m69374b(C19347q c19347q, C19339h c19339h, int i, boolean z) {
        int i2 = i + 1;
        i = this.f60314a[i] & 255;
        int length = C19348s.m69471d(c19339h.f60327g).length - i;
        int i3 = 0;
        while (i3 < length) {
            C19334a a = c19347q.mo14603a(i3, "Ljava/lang/Synthetic;", false);
            if (a != null) {
                a.mo14585a();
            }
            i3++;
        }
        char[] cArr = c19339h.f60323c;
        while (i3 < i + length) {
            i2 += 2;
            for (int b = m69380b(i2); b > 0; b--) {
                i2 = m69364a(i2 + 2, cArr, true, c19347q.mo14603a(i3, m69376a(i2, cArr), z));
            }
            i3++;
        }
    }

    /* renamed from: a */
    public int m69375a(int i) {
        return this.f60314a[i] & 255;
    }

    /* renamed from: a */
    public String m69376a(int i, char[] cArr) {
        int b = m69380b(i);
        if (i != 0) {
            if (b != 0) {
                String str = this.f60317d[b];
                if (str != null) {
                    return str;
                }
                i = this.f60316c[b];
                String[] strArr = this.f60317d;
                str = m69368a(i + 2, m69380b(i), cArr);
                strArr[b] = str;
                return str;
            }
        }
        return null;
    }

    /* renamed from: a */
    protected C19346p m69377a(int i, C19346p[] c19346pArr) {
        if (c19346pArr[i] == null) {
            c19346pArr[i] = new C19346p();
        }
        return c19346pArr[i];
    }

    /* renamed from: a */
    public void m69378a(C19338f c19338f, int i) {
        m69379a(c19338f, new C19335c[0], i);
    }

    /* renamed from: a */
    public void m69379a(C19338f c19338f, C19335c[] c19335cArr, int i) {
        int i2;
        String str;
        String str2;
        String str3;
        char[] cArr;
        C19339h c19339h;
        C19335c c19335c;
        String[] strArr;
        String str4;
        String str5;
        char[] cArr2;
        C19339h c19339h2;
        C19338f c19338f2 = c19338f;
        int i3 = i;
        int i4 = this.f60315b;
        char[] cArr3 = new char[this.f60318e];
        C19339h c19339h3 = new C19339h();
        C19335c[] c19335cArr2 = c19335cArr;
        c19339h3.f60321a = c19335cArr2;
        c19339h3.f60322b = i3;
        c19339h3.f60323c = cArr3;
        int b = m69380b(i4);
        String b2 = m69381b(i4 + 2, cArr3);
        String b3 = m69381b(i4 + 4, cArr3);
        String[] strArr2 = new String[m69380b(i4 + 6)];
        int i5 = i4 + 8;
        for (i4 = 0; i4 < strArr2.length; i4++) {
            strArr2[i4] = m69381b(i5, cArr3);
            i5 += 2;
        }
        i4 = m69361a();
        int i6 = i4;
        int i7 = b;
        int b4 = m69380b(i4);
        String[] strArr3 = strArr2;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        C19335c c19335c2 = null;
        int i12 = 0;
        while (b4 > 0) {
            C19335c a;
            String a2 = m69376a(i6 + 2, cArr3);
            if ("SourceFile".equals(a2)) {
                str10 = m69376a(i6 + 8, cArr3);
            } else if ("InnerClasses".equals(a2)) {
                i12 = i6 + 8;
            } else if ("EnclosingMethod".equals(a2)) {
                str8 = m69381b(i6 + 8, cArr3);
                r5 = m69380b(i6 + 10);
                if (r5 != 0) {
                    str7 = m69376a(r8.f60316c[r5], cArr3);
                    str6 = m69376a(r8.f60316c[r5] + 2, cArr3);
                }
            } else if ("Signature".equals(a2)) {
                str11 = m69376a(i6 + 8, cArr3);
            } else if ("RuntimeVisibleAnnotations".equals(a2)) {
                i8 = i6 + 8;
            } else if ("RuntimeVisibleTypeAnnotations".equals(a2)) {
                i10 = i6 + 8;
            } else {
                if ("Deprecated".equals(a2)) {
                    r5 = 131072;
                } else if ("Synthetic".equals(a2)) {
                    r5 = 266240;
                } else if ("SourceDebugExtension".equals(a2)) {
                    r3 = m69384d(i6 + 4);
                    str9 = m69368a(i6 + 8, r3, new char[r3]);
                } else if ("RuntimeInvisibleAnnotations".equals(a2)) {
                    i9 = i6 + 8;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(a2)) {
                    i11 = i6 + 8;
                } else {
                    if ("BootstrapMethods".equals(a2)) {
                        int[] iArr = new int[m69380b(i6 + 8)];
                        int i13 = i6 + 10;
                        for (i2 = 0; i2 < iArr.length; i2++) {
                            iArr[i2] = i13;
                            i13 += (m69380b(i13 + 2) + 2) << 1;
                        }
                        c19339h3.f60324d = iArr;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        cArr = cArr3;
                        c19339h = c19339h3;
                        c19335c = c19335c2;
                        strArr = strArr3;
                        str4 = str9;
                        str5 = str10;
                    } else {
                        c19339h = c19339h3;
                        str = str6;
                        str4 = str7;
                        C19335c[] c19335cArr3 = c19335cArr2;
                        str3 = str8;
                        str8 = a2;
                        a2 = str9;
                        r3 = i6 + 8;
                        String str12 = str10;
                        String str13 = a2;
                        char[] cArr4 = cArr3;
                        cArr = cArr3;
                        str5 = str12;
                        str2 = str4;
                        strArr = strArr3;
                        str4 = str13;
                        a = m69369a(c19335cArr3, str8, r3, m69384d(i6 + 4), cArr4, -1, null);
                        if (a != null) {
                            a.f60311c = c19335c2;
                            c19335c2 = a;
                            str10 = str5;
                            str9 = str4;
                            str8 = str3;
                            str6 = str;
                            str7 = str2;
                            i6 += m69384d(i6 + 4) + 6;
                            b4--;
                            c19339h3 = c19339h;
                            cArr3 = cArr;
                            strArr3 = strArr;
                            c19335cArr2 = c19335cArr;
                        } else {
                            c19335c = c19335c2;
                        }
                    }
                    c19335c2 = c19335c;
                    str10 = str5;
                    str9 = str4;
                    str8 = str3;
                    str6 = str;
                    str7 = str2;
                    i6 += m69384d(i6 + 4) + 6;
                    b4--;
                    c19339h3 = c19339h;
                    cArr3 = cArr;
                    strArr3 = strArr;
                    c19335cArr2 = c19335cArr;
                }
                i7 |= r5;
            }
            cArr = cArr3;
            c19339h = c19339h3;
            strArr = strArr3;
            i6 += m69384d(i6 + 4) + 6;
            b4--;
            c19339h3 = c19339h;
            cArr3 = cArr;
            strArr3 = strArr;
            c19335cArr2 = c19335cArr;
        }
        str = str6;
        str2 = str7;
        str3 = str8;
        cArr = cArr3;
        c19339h = c19339h3;
        c19335c = c19335c2;
        strArr = strArr3;
        str4 = str9;
        str5 = str10;
        c19338f2.mo14593a(m69384d(r8.f60316c[1] - 7), i7, b2, str11, b3, strArr);
        if ((i3 & 2) == 0 && !(str5 == null && str4 == null)) {
            c19338f2.mo14594a(str5, str4);
        }
        if (str3 != null) {
            c19338f2.mo14595a(str3, str2, str);
        }
        i2 = i8;
        if (i2 != 0) {
            b = i2 + 2;
            for (i4 = m69380b(i2); i4 > 0; i4--) {
                cArr2 = cArr;
                b = m69364a(b + 2, cArr2, true, c19338f2.mo14589a(m69376a(b, cArr2), true));
            }
        }
        cArr2 = cArr;
        i2 = i9;
        if (i2 != 0) {
            b = i2 + 2;
            for (i4 = m69380b(i2); i4 > 0; i4--) {
                b = m69364a(b + 2, cArr2, true, c19338f2.mo14589a(m69376a(b, cArr2), false));
            }
        }
        i2 = i10;
        if (i2 != 0) {
            b = i2 + 2;
            for (i4 = m69380b(i2); i4 > 0; i4--) {
                c19339h2 = c19339h;
                b = m69366a(c19339h2, b);
                b = m69364a(b + 2, cArr2, true, c19338f2.mo14588a(c19339h2.f60329i, c19339h2.f60330j, m69376a(b, cArr2), true));
            }
        }
        c19339h2 = c19339h;
        i2 = i11;
        if (i2 != 0) {
            b = i2 + 2;
            for (i4 = m69380b(i2); i4 > 0; i4--) {
                b = m69366a(c19339h2, b);
                b = m69364a(b + 2, cArr2, true, c19338f2.mo14588a(c19339h2.f60329i, c19339h2.f60330j, m69376a(b, cArr2), false));
            }
        }
        while (c19335c != null) {
            a = c19335c.f60311c;
            c19335c.f60311c = null;
            c19338f2.mo14597a(c19335c);
            c19335c = a;
        }
        i2 = i12;
        if (i2 != 0) {
            i12 = i2 + 2;
            b = i12;
            for (i4 = m69380b(i2); i4 > 0; i4--) {
                c19338f2.mo14596a(m69381b(b, cArr2), m69381b(b + 2, cArr2), m69376a(b + 4, cArr2), m69380b(b + 6));
                b += 8;
            }
        }
        i4 = (r8.f60315b + 10) + (strArr.length * 2);
        for (b = m69380b(i4 - 2); b > 0; b--) {
            i4 = m69365a(c19338f2, c19339h2, i4);
        }
        i4 += 2;
        for (b = m69380b(i4 - 2); b > 0; b--) {
            i4 = m69373b(c19338f2, c19339h2, i4);
        }
        c19338f.mo14592a();
    }

    /* renamed from: b */
    public int m69380b(int i) {
        byte[] bArr = this.f60314a;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: b */
    public String m69381b(int i, char[] cArr) {
        return m69376a(this.f60316c[m69380b(i)], cArr);
    }

    /* renamed from: c */
    public Object m69382c(int i, char[] cArr) {
        i = this.f60316c[i];
        byte b = this.f60314a[i - 1];
        if (b == (byte) 16) {
            return C19348s.m69470c(m69376a(i, cArr));
        }
        switch (b) {
            case (byte) 3:
                return new Integer(m69384d(i));
            case (byte) 4:
                return new Float(Float.intBitsToFloat(m69384d(i)));
            case (byte) 5:
                return new Long(m69385e(i));
            case (byte) 6:
                return new Double(Double.longBitsToDouble(m69385e(i)));
            case (byte) 7:
                return C19348s.m69469b(m69376a(i, cArr));
            case (byte) 8:
                return m69376a(i, cArr);
            default:
                int a = m69375a(i);
                int[] iArr = this.f60316c;
                i = iArr[m69380b(i + 1)];
                String b2 = m69381b(i, cArr);
                i = iArr[m69380b(i + 2)];
                return new C19343m(a, b2, m69376a(i, cArr), m69376a(i + 2, cArr));
        }
    }

    /* renamed from: c */
    public short m69383c(int i) {
        byte[] bArr = this.f60314a;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: d */
    public int m69384d(int i) {
        byte[] bArr = this.f60314a;
        return (bArr[i + 3] & 255) | ((((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16)) | ((bArr[i + 2] & 255) << 8));
    }

    /* renamed from: e */
    public long m69385e(int i) {
        return (((long) m69384d(i)) << 32) | (((long) m69384d(i + 4)) & 4294967295L);
    }
}
