package org.objectweb.asm;

/* renamed from: org.objectweb.asm.l */
final class C19342l {
    /* renamed from: a */
    static final int[] f60346a;
    /* renamed from: b */
    C19346p f60347b;
    /* renamed from: c */
    int[] f60348c;
    /* renamed from: d */
    int[] f60349d;
    /* renamed from: e */
    private int[] f60350e;
    /* renamed from: f */
    private int[] f60351f;
    /* renamed from: g */
    private int f60352g;
    /* renamed from: h */
    private int f60353h;
    /* renamed from: i */
    private int[] f60354i;

    static {
        C19342l.m69402a();
        int[] iArr = new int[202];
        String str = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE";
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = str.charAt(i) - 69;
        }
        f60346a = iArr;
    }

    C19342l() {
    }

    /* renamed from: a */
    private int m69400a(int i) {
        if (this.f60350e != null) {
            if (i < this.f60350e.length) {
                int i2 = this.f60350e[i];
                if (i2 == 0) {
                    int i3 = 33554432 | i;
                    this.f60350e[i] = i3;
                    i2 = i3;
                }
                return i2;
            }
        }
        return i | 33554432;
    }

    /* renamed from: a */
    private int m69401a(C19506g c19506g, int i) {
        String str;
        if (i == 16777222) {
            str = c19506g.f60941o;
        } else {
            if ((-1048576 & i) == 25165824) {
                str = c19506g.f60940n[1048575 & i].f60369e;
            }
            return i;
        }
        int e = c19506g.m70426e(str) | 24117248;
        for (int i2 = 0; i2 < this.f60353h; i2++) {
            int i3 = this.f60354i[i2];
            int i4 = -268435456 & i3;
            int i5 = 251658240 & i3;
            if (i5 == 33554432) {
                i3 = this.f60348c[i3 & 8388607];
            } else {
                if (i5 == 50331648) {
                    i3 = this.f60349d[this.f60349d.length - (i3 & 8388607)];
                }
                if (i == i3) {
                    return e;
                }
            }
            i3 += i4;
            if (i == i3) {
                return e;
            }
        }
        return i;
    }

    /* renamed from: a */
    static void m69402a() {
    }

    /* renamed from: a */
    private void m69403a(int i, int i2) {
        if (this.f60350e == null) {
            this.f60350e = new int[10];
        }
        int length = this.f60350e.length;
        if (i >= length) {
            Object obj = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.f60350e, 0, obj, 0, length);
            this.f60350e = obj;
        }
        this.f60350e[i] = i2;
    }

    /* renamed from: a */
    private void m69404a(String str) {
        char charAt = str.charAt(0);
        if (charAt == '(') {
            m69410c((C19348s.m69472e(str) >> 2) - 1);
            return;
        }
        if (charAt != 'J') {
            if (charAt != 'D') {
                m69410c(1);
                return;
            }
        }
        m69410c(2);
    }

    /* renamed from: a */
    private void m69405a(C19506g c19506g, String str) {
        int b = C19342l.m69408b(c19506g, str);
        if (b != 0) {
            m69409b(b);
            if (b == 16777220 || b == 16777219) {
                m69409b(16777216);
            }
        }
    }

    /* renamed from: a */
    private static boolean m69406a(C19506g c19506g, int i, int[] iArr, int i2) {
        int i3 = iArr[i2];
        if (i3 == i) {
            return false;
        }
        if ((268435455 & i) == 16777221) {
            if (i3 == 16777221) {
                return false;
            }
            i = 16777221;
        }
        if (i3 == 0) {
            iArr[i2] = i;
            return true;
        }
        int i4 = i3 & 267386880;
        int i5 = 16777216;
        int i6 = -268435456;
        if (i4 != 24117248) {
            if ((i3 & -268435456) == 0) {
                if (i3 == 16777221 && ((i & 267386880) == 24117248 || (i & -268435456) != 0)) {
                    i5 = i;
                }
                if (i3 == i5) {
                    return false;
                }
                iArr[i2] = i5;
                return true;
            }
        }
        if (i == 16777221) {
            return false;
        }
        if ((i & -1048576) != (-1048576 & i3)) {
            int i7 = i & 267386880;
            if (i7 == 24117248 || (i & -268435456) != 0) {
                i &= -268435456;
                if (i != 0) {
                    if (i7 != 24117248) {
                        i7 = -268435456;
                        i7 += i;
                        i = i3 & -268435456;
                        if (i == 0 || i4 == 24117248) {
                            i6 = 0;
                        }
                        i = Math.min(i7, i6 + i);
                    }
                }
                i7 = 0;
                i7 += i;
                i = i3 & -268435456;
                i6 = 0;
                i = Math.min(i7, i6 + i);
            }
            if (i3 == i5) {
                return false;
            }
            iArr[i2] = i5;
            return true;
        } else if (i4 == 24117248) {
            i5 = ((i & -268435456) | 24117248) | c19506g.m70393a(i & 1048575, 1048575 & i3);
            if (i3 == i5) {
                return false;
            }
            iArr[i2] = i5;
            return true;
        } else {
            i = (i3 & -268435456) - 268435456;
        }
        i5 = (i | 24117248) | c19506g.m70426e("java/lang/Object");
        if (i3 == i5) {
            return false;
        }
        iArr[i2] = i5;
        return true;
    }

    /* renamed from: b */
    private int m69407b() {
        if (this.f60352g > 0) {
            int[] iArr = this.f60351f;
            int i = this.f60352g - 1;
            this.f60352g = i;
            return iArr[i];
        }
        C19346p c19346p = this.f60347b;
        int i2 = c19346p.f60377d - 1;
        c19346p.f60377d = i2;
        return 50331648 | (-i2);
    }

    /* renamed from: b */
    private static int m69408b(C19506g c19506g, String str) {
        int indexOf = str.charAt(0) == '(' ? str.indexOf(41) + 1 : 0;
        char charAt = str.charAt(indexOf);
        int i = 16777218;
        if (charAt == 'F') {
            return 16777218;
        }
        if (charAt == 'L') {
            return c19506g.m70426e(str.substring(indexOf + 1, str.length() - 1)) | 24117248;
        }
        if (charAt != 'S') {
            if (charAt == 'V') {
                return 0;
            }
            if (charAt != 'Z') {
                switch (charAt) {
                    case 'B':
                    case 'C':
                        break;
                    case 'D':
                        return 16777219;
                    default:
                        switch (charAt) {
                            case 'I':
                                break;
                            case 'J':
                                return 16777220;
                            default:
                                int i2 = indexOf + 1;
                                while (str.charAt(i2) == '[') {
                                    i2++;
                                }
                                char charAt2 = str.charAt(i2);
                                if (charAt2 != 'F') {
                                    if (charAt2 == 'S') {
                                        i = 16777228;
                                    } else if (charAt2 != 'Z') {
                                        switch (charAt2) {
                                            case 'B':
                                                i = 16777226;
                                                break;
                                            case 'C':
                                                i = 16777227;
                                                break;
                                            case 'D':
                                                i = 16777219;
                                                break;
                                            default:
                                                switch (charAt2) {
                                                    case 'I':
                                                        i = 16777217;
                                                        break;
                                                    case 'J':
                                                        i = 16777220;
                                                        break;
                                                    default:
                                                        i = c19506g.m70426e(str.substring(i2 + 1, str.length() - 1)) | 24117248;
                                                        break;
                                                }
                                        }
                                    } else {
                                        i = 16777225;
                                    }
                                }
                                return ((i2 - indexOf) << 28) | i;
                        }
                }
            }
        }
        return 16777217;
    }

    /* renamed from: b */
    private void m69409b(int i) {
        if (this.f60351f == null) {
            this.f60351f = new int[10];
        }
        int length = this.f60351f.length;
        if (this.f60352g >= length) {
            Object obj = new int[Math.max(this.f60352g + 1, length * 2)];
            System.arraycopy(this.f60351f, 0, obj, 0, length);
            this.f60351f = obj;
        }
        int[] iArr = this.f60351f;
        int i2 = this.f60352g;
        this.f60352g = i2 + 1;
        iArr[i2] = i;
        i = this.f60347b.f60377d + this.f60352g;
        if (i > this.f60347b.f60378e) {
            this.f60347b.f60378e = i;
        }
    }

    /* renamed from: c */
    private void m69410c(int i) {
        if (this.f60352g >= i) {
            this.f60352g -= i;
            return;
        }
        C19346p c19346p = this.f60347b;
        c19346p.f60377d -= i - this.f60352g;
        this.f60352g = 0;
    }

    /* renamed from: d */
    private void m69411d(int i) {
        if (this.f60354i == null) {
            this.f60354i = new int[2];
        }
        int length = this.f60354i.length;
        if (this.f60353h >= length) {
            Object obj = new int[Math.max(this.f60353h + 1, length * 2)];
            System.arraycopy(this.f60354i, 0, obj, 0, length);
            this.f60354i = obj;
        }
        int[] iArr = this.f60354i;
        int i2 = this.f60353h;
        this.f60353h = i2 + 1;
        iArr[i2] = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    void m69412a(int r18, int r19, org.objectweb.asm.C19506g r20, org.objectweb.asm.C19345o r21) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r19;
        r3 = r20;
        r4 = r21;
        r5 = 16777218; // 0x1000002 float:2.3509893E-38 double:8.289047E-317;
        r6 = 24117248; // 0x1700000 float:4.4081038E-38 double:1.19155037E-316;
        r7 = 16777219; // 0x1000003 float:2.3509895E-38 double:8.2890475E-317;
        r8 = 16777217; // 0x1000001 float:2.350989E-38 double:8.2890466E-317;
        r9 = 16777220; // 0x1000004 float:2.3509898E-38 double:8.289048E-317;
        r10 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        switch(r1) {
            case 0: goto L_0x0236;
            case 1: goto L_0x0230;
            case 2: goto L_0x022c;
            case 3: goto L_0x022c;
            case 4: goto L_0x022c;
            case 5: goto L_0x022c;
            case 6: goto L_0x022c;
            case 7: goto L_0x022c;
            case 8: goto L_0x022c;
            case 9: goto L_0x0225;
            case 10: goto L_0x0225;
            case 11: goto L_0x0221;
            case 12: goto L_0x0221;
            case 13: goto L_0x0221;
            case 14: goto L_0x021d;
            case 15: goto L_0x021d;
            case 16: goto L_0x022c;
            case 17: goto L_0x022c;
            case 18: goto L_0x0203;
            default: goto L_0x001d;
        };
    L_0x001d:
        switch(r1) {
            case 21: goto L_0x022c;
            case 22: goto L_0x0225;
            case 23: goto L_0x0221;
            case 24: goto L_0x021d;
            case 25: goto L_0x01fe;
            default: goto L_0x0020;
        };
    L_0x0020:
        r11 = 8388608; // 0x800000 float:1.17549435E-38 double:4.144523E-317;
        r12 = 251658240; // 0xf000000 float:6.3108872E-30 double:1.24335691E-315;
        r14 = 1;
        switch(r1) {
            case 46: goto L_0x01f9;
            case 47: goto L_0x00f0;
            case 48: goto L_0x01f0;
            case 49: goto L_0x00f8;
            case 50: goto L_0x01e1;
            case 51: goto L_0x01f9;
            case 52: goto L_0x01f9;
            case 53: goto L_0x01f9;
            case 54: goto L_0x01c0;
            case 55: goto L_0x019f;
            case 56: goto L_0x01c0;
            case 57: goto L_0x019f;
            case 58: goto L_0x01c0;
            default: goto L_0x0028;
        };
    L_0x0028:
        r11 = 3;
        r12 = 91;
        r15 = 0;
        r13 = 4;
        switch(r1) {
            case 79: goto L_0x019b;
            case 80: goto L_0x0197;
            case 81: goto L_0x019b;
            case 82: goto L_0x0197;
            case 83: goto L_0x019b;
            case 84: goto L_0x019b;
            case 85: goto L_0x019b;
            case 86: goto L_0x019b;
            case 87: goto L_0x0193;
            case 88: goto L_0x018e;
            case 89: goto L_0x0185;
            case 90: goto L_0x0175;
            case 91: goto L_0x0162;
            case 92: goto L_0x0156;
            case 93: goto L_0x0146;
            case 94: goto L_0x012c;
            case 95: goto L_0x011d;
            case 96: goto L_0x01f9;
            case 97: goto L_0x0118;
            case 98: goto L_0x01f0;
            case 99: goto L_0x0113;
            case 100: goto L_0x01f9;
            case 101: goto L_0x0118;
            case 102: goto L_0x01f0;
            case 103: goto L_0x0113;
            case 104: goto L_0x01f9;
            case 105: goto L_0x0118;
            case 106: goto L_0x01f0;
            case 107: goto L_0x0113;
            case 108: goto L_0x01f9;
            case 109: goto L_0x0118;
            case 110: goto L_0x01f0;
            case 111: goto L_0x0113;
            case 112: goto L_0x01f9;
            case 113: goto L_0x0118;
            case 114: goto L_0x01f0;
            case 115: goto L_0x0113;
            case 116: goto L_0x0236;
            case 117: goto L_0x0236;
            case 118: goto L_0x0236;
            case 119: goto L_0x0236;
            case 120: goto L_0x01f9;
            case 121: goto L_0x010e;
            case 122: goto L_0x01f9;
            case 123: goto L_0x010e;
            case 124: goto L_0x01f9;
            case 125: goto L_0x010e;
            case 126: goto L_0x01f9;
            case 127: goto L_0x0118;
            case 128: goto L_0x01f9;
            case 129: goto L_0x0118;
            case 130: goto L_0x01f9;
            case 131: goto L_0x0118;
            case 132: goto L_0x010a;
            case 133: goto L_0x0105;
            case 134: goto L_0x0100;
            case 135: goto L_0x00fb;
            case 136: goto L_0x01f9;
            case 137: goto L_0x01f0;
            case 138: goto L_0x00f8;
            case 139: goto L_0x00f3;
            case 140: goto L_0x0105;
            case 141: goto L_0x00fb;
            case 142: goto L_0x01f9;
            case 143: goto L_0x00f0;
            case 144: goto L_0x01f0;
            case 145: goto L_0x0236;
            case 146: goto L_0x0236;
            case 147: goto L_0x0236;
            case 148: goto L_0x00eb;
            case 149: goto L_0x01f9;
            case 150: goto L_0x01f9;
            case 151: goto L_0x00eb;
            case 152: goto L_0x00eb;
            case 153: goto L_0x0193;
            case 154: goto L_0x0193;
            case 155: goto L_0x0193;
            case 156: goto L_0x0193;
            case 157: goto L_0x0193;
            case 158: goto L_0x0193;
            case 159: goto L_0x018e;
            case 160: goto L_0x018e;
            case 161: goto L_0x018e;
            case 162: goto L_0x018e;
            case 163: goto L_0x018e;
            case 164: goto L_0x018e;
            case 165: goto L_0x018e;
            case 166: goto L_0x018e;
            case 167: goto L_0x0236;
            case 168: goto L_0x00e3;
            case 169: goto L_0x00e3;
            case 170: goto L_0x0193;
            case 171: goto L_0x0193;
            case 172: goto L_0x0193;
            case 173: goto L_0x018e;
            case 174: goto L_0x0193;
            case 175: goto L_0x018e;
            case 176: goto L_0x0193;
            case 177: goto L_0x0236;
            case 178: goto L_0x00df;
            case 179: goto L_0x00d9;
            case 180: goto L_0x00d5;
            case 181: goto L_0x00cc;
            case 182: goto L_0x00ad;
            case 183: goto L_0x00ad;
            case 184: goto L_0x00ad;
            case 185: goto L_0x00ad;
            case 186: goto L_0x00a5;
            case 187: goto L_0x009a;
            case 188: goto L_0x006c;
            case 189: goto L_0x0048;
            case 190: goto L_0x00f3;
            case 191: goto L_0x0193;
            case 192: goto L_0x003c;
            case 193: goto L_0x00f3;
            case 194: goto L_0x0193;
            case 195: goto L_0x0193;
            default: goto L_0x0030;
        };
    L_0x0030:
        switch(r1) {
            case 198: goto L_0x0193;
            case 199: goto L_0x0193;
            default: goto L_0x0033;
        };
    L_0x0033:
        r0.m69410c(r2);
        r1 = r4.f60369e;
    L_0x0038:
        r0.m69405a(r3, r1);
        return;
    L_0x003c:
        r1 = r4.f60369e;
        r17.m69407b();
        r2 = r1.charAt(r15);
        if (r2 != r12) goto L_0x020e;
    L_0x0047:
        goto L_0x0038;
    L_0x0048:
        r1 = r4.f60369e;
        r17.m69407b();
        r2 = r1.charAt(r15);
        if (r2 != r12) goto L_0x0063;
    L_0x0053:
        r2 = new java.lang.StringBuffer;
        r2.<init>();
        r2.append(r12);
        r2.append(r1);
        r1 = r2.toString();
        goto L_0x0038;
    L_0x0063:
        r2 = 292552704; // 0x11700000 float:1.8932662E-28 double:1.445402406E-315;
        r1 = r3.m70426e(r1);
        r1 = r1 | r2;
        goto L_0x0233;
    L_0x006c:
        r17.m69407b();
        switch(r2) {
            case 4: goto L_0x0095;
            case 5: goto L_0x0090;
            case 6: goto L_0x008b;
            case 7: goto L_0x0086;
            case 8: goto L_0x0081;
            case 9: goto L_0x007c;
            case 10: goto L_0x0077;
            default: goto L_0x0072;
        };
    L_0x0072:
        r1 = 285212676; // 0x11000004 float:1.0097424E-28 double:1.40913785E-315;
        goto L_0x0233;
    L_0x0077:
        r1 = 285212673; // 0x11000001 float:1.0097421E-28 double:1.409137835E-315;
        goto L_0x0233;
    L_0x007c:
        r1 = 285212684; // 0x1100000c float:1.0097434E-28 double:1.40913789E-315;
        goto L_0x0233;
    L_0x0081:
        r1 = 285212682; // 0x1100000a float:1.0097432E-28 double:1.40913788E-315;
        goto L_0x0233;
    L_0x0086:
        r1 = 285212675; // 0x11000003 float:1.0097423E-28 double:1.409137845E-315;
        goto L_0x0233;
    L_0x008b:
        r1 = 285212674; // 0x11000002 float:1.0097422E-28 double:1.40913784E-315;
        goto L_0x0233;
    L_0x0090:
        r1 = 285212683; // 0x1100000b float:1.0097433E-28 double:1.409137884E-315;
        goto L_0x0233;
    L_0x0095:
        r1 = 285212681; // 0x11000009 float:1.009743E-28 double:1.409137874E-315;
        goto L_0x0233;
    L_0x009a:
        r1 = 25165824; // 0x1800000 float:4.7019774E-38 double:1.2433569E-316;
        r4 = r4.f60369e;
        r2 = r3.m70395a(r4, r2);
        r1 = r1 | r2;
        goto L_0x0233;
    L_0x00a5:
        r1 = r4.f60370f;
        r0.m69404a(r1);
        r1 = r4.f60370f;
        goto L_0x0038;
    L_0x00ad:
        r2 = r4.f60371g;
        r0.m69404a(r2);
        r2 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        if (r1 == r2) goto L_0x00df;
    L_0x00b6:
        r2 = r17.m69407b();
        r5 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        if (r1 != r5) goto L_0x00df;
    L_0x00be:
        r1 = r4.f60370f;
        r1 = r1.charAt(r15);
        r5 = 60;
        if (r1 != r5) goto L_0x00df;
    L_0x00c8:
        r0.m69411d(r2);
        goto L_0x00df;
    L_0x00cc:
        r1 = r4.f60371g;
        r0.m69404a(r1);
        r17.m69407b();
        return;
    L_0x00d5:
        r0.m69410c(r14);
        goto L_0x00df;
    L_0x00d9:
        r1 = r4.f60371g;
        r0.m69404a(r1);
        return;
    L_0x00df:
        r1 = r4.f60371g;
        goto L_0x0038;
    L_0x00e3:
        r1 = new java.lang.RuntimeException;
        r2 = "JSR/RET are not supported with computeFrames option";
        r1.<init>(r2);
        throw r1;
    L_0x00eb:
        r0.m69410c(r13);
        goto L_0x022c;
    L_0x00f0:
        r1 = 2;
        goto L_0x01f5;
    L_0x00f3:
        r0.m69410c(r14);
        goto L_0x022c;
    L_0x00f8:
        r1 = 2;
        goto L_0x01ec;
    L_0x00fb:
        r0.m69410c(r14);
        goto L_0x021d;
    L_0x0100:
        r0.m69410c(r14);
        goto L_0x0221;
    L_0x0105:
        r0.m69410c(r14);
        goto L_0x0225;
    L_0x010a:
        r0.m69403a(r2, r8);
        return;
    L_0x010e:
        r0.m69410c(r11);
        goto L_0x0225;
    L_0x0113:
        r0.m69410c(r13);
        goto L_0x021d;
    L_0x0118:
        r0.m69410c(r13);
        goto L_0x0225;
    L_0x011d:
        r1 = r17.m69407b();
        r2 = r17.m69407b();
        r0.m69409b(r1);
        r0.m69409b(r2);
        return;
    L_0x012c:
        r1 = r17.m69407b();
        r2 = r17.m69407b();
        r3 = r17.m69407b();
        r4 = r17.m69407b();
        r0.m69409b(r2);
        r0.m69409b(r1);
        r0.m69409b(r4);
        goto L_0x0171;
    L_0x0146:
        r1 = r17.m69407b();
        r2 = r17.m69407b();
        r3 = r17.m69407b();
        r0.m69409b(r2);
        goto L_0x016e;
    L_0x0156:
        r1 = r17.m69407b();
        r2 = r17.m69407b();
        r0.m69409b(r2);
        goto L_0x017d;
    L_0x0162:
        r1 = r17.m69407b();
        r2 = r17.m69407b();
        r3 = r17.m69407b();
    L_0x016e:
        r0.m69409b(r1);
    L_0x0171:
        r0.m69409b(r3);
        goto L_0x0180;
    L_0x0175:
        r1 = r17.m69407b();
        r2 = r17.m69407b();
    L_0x017d:
        r0.m69409b(r1);
    L_0x0180:
        r0.m69409b(r2);
        goto L_0x0233;
    L_0x0185:
        r1 = r17.m69407b();
        r0.m69409b(r1);
        goto L_0x0233;
    L_0x018e:
        r1 = 2;
        r0.m69410c(r1);
        return;
    L_0x0193:
        r0.m69410c(r14);
        return;
    L_0x0197:
        r0.m69410c(r13);
        return;
    L_0x019b:
        r0.m69410c(r11);
        return;
    L_0x019f:
        r0.m69410c(r14);
        r1 = r17.m69407b();
        r0.m69403a(r2, r1);
        r1 = r2 + 1;
        r0.m69403a(r1, r10);
        if (r2 <= 0) goto L_0x0236;
    L_0x01b0:
        r1 = r2 + -1;
        r2 = r0.m69400a(r1);
        if (r2 == r9) goto L_0x01dd;
    L_0x01b8:
        if (r2 != r7) goto L_0x01bb;
    L_0x01ba:
        goto L_0x01dd;
    L_0x01bb:
        r3 = r2 & r12;
        if (r3 == r10) goto L_0x0236;
    L_0x01bf:
        goto L_0x01d8;
    L_0x01c0:
        r1 = r17.m69407b();
        r0.m69403a(r2, r1);
        if (r2 <= 0) goto L_0x0236;
    L_0x01c9:
        r1 = r2 + -1;
        r2 = r0.m69400a(r1);
        if (r2 == r9) goto L_0x01dd;
    L_0x01d1:
        if (r2 != r7) goto L_0x01d4;
    L_0x01d3:
        goto L_0x01dd;
    L_0x01d4:
        r3 = r2 & r12;
        if (r3 == r10) goto L_0x0236;
    L_0x01d8:
        r2 = r2 | r11;
        r0.m69403a(r1, r2);
        return;
    L_0x01dd:
        r0.m69403a(r1, r10);
        return;
    L_0x01e1:
        r0.m69410c(r14);
        r1 = r17.m69407b();
        r2 = -268435456; // 0xfffffffff0000000 float:-1.58456325E29 double:NaN;
        r1 = r1 + r2;
        goto L_0x0233;
    L_0x01ec:
        r0.m69410c(r1);
        goto L_0x021d;
    L_0x01f0:
        r1 = 2;
        r0.m69410c(r1);
        goto L_0x0221;
    L_0x01f5:
        r0.m69410c(r1);
        goto L_0x0225;
    L_0x01f9:
        r1 = 2;
        r0.m69410c(r1);
        goto L_0x022c;
    L_0x01fe:
        r1 = r0.m69400a(r2);
        goto L_0x0233;
    L_0x0203:
        r1 = r4.f60366b;
        r2 = 16;
        if (r1 == r2) goto L_0x021a;
    L_0x0209:
        switch(r1) {
            case 3: goto L_0x022c;
            case 4: goto L_0x0221;
            case 5: goto L_0x0225;
            case 6: goto L_0x021d;
            case 7: goto L_0x0217;
            case 8: goto L_0x0214;
            default: goto L_0x020c;
        };
    L_0x020c:
        r1 = "java/lang/invoke/MethodHandle";
    L_0x020e:
        r1 = r3.m70426e(r1);
        r1 = r1 | r6;
        goto L_0x0233;
    L_0x0214:
        r1 = "java/lang/String";
        goto L_0x020e;
    L_0x0217:
        r1 = "java/lang/Class";
        goto L_0x020e;
    L_0x021a:
        r1 = "java/lang/invoke/MethodType";
        goto L_0x020e;
    L_0x021d:
        r0.m69409b(r7);
        goto L_0x0228;
    L_0x0221:
        r0.m69409b(r5);
        return;
    L_0x0225:
        r0.m69409b(r9);
    L_0x0228:
        r0.m69409b(r10);
        return;
    L_0x022c:
        r0.m69409b(r8);
        return;
    L_0x0230:
        r1 = 16777221; // 0x1000005 float:2.35099E-38 double:8.2890485E-317;
    L_0x0233:
        r0.m69409b(r1);
    L_0x0236:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.l.a(int, int, org.objectweb.asm.g, org.objectweb.asm.o):void");
    }

    /* renamed from: a */
    void m69413a(C19506g c19506g, int i, C19348s[] c19348sArr, int i2) {
        this.f60348c = new int[i2];
        int i3 = 0;
        this.f60349d = new int[0];
        int i4 = 1;
        if ((i & 8) != 0) {
            i4 = 0;
        } else if ((i & 524288) == 0) {
            this.f60348c[0] = 24117248 | c19506g.m70426e(c19506g.f60941o);
        } else {
            this.f60348c[0] = 16777222;
        }
        while (i3 < c19348sArr.length) {
            i = C19342l.m69408b(c19506g, c19348sArr[i3].m69479f());
            int i5 = i4 + 1;
            this.f60348c[i4] = i;
            if (i != 16777220) {
                if (i != 16777219) {
                    i4 = i5;
                    i3++;
                }
            }
            i4 = i5 + 1;
            this.f60348c[i5] = 16777216;
            i3++;
        }
        while (i4 < i2) {
            i = i4 + 1;
            this.f60348c[i4] = 16777216;
            i4 = i;
        }
    }

    /* renamed from: a */
    boolean m69414a(C19506g c19506g, C19342l c19342l, int i) {
        boolean z;
        C19506g c19506g2 = c19506g;
        C19342l c19342l2 = c19342l;
        int i2 = i;
        int length = this.f60348c.length;
        int length2 = this.f60349d.length;
        if (c19342l2.f60348c == null) {
            c19342l2.f60348c = new int[length];
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        int i3 = 0;
        while (true) {
            int i4 = -268435456;
            int i5 = 16777216;
            if (i3 >= length) {
                break;
            }
            int i6;
            if (r0.f60350e == null || i3 >= r0.f60350e.length) {
                i5 = r0.f60348c[i3];
            } else {
                i6 = r0.f60350e[i3];
                if (i6 == 0) {
                    i5 = r0.f60348c[i3];
                } else {
                    i4 = -268435456 & i6;
                    int i7 = 251658240 & i6;
                    if (i7 == 16777216) {
                        i5 = i6;
                    } else {
                        i4 += i7 == 33554432 ? r0.f60348c[i6 & 8388607] : r0.f60349d[length2 - (i6 & 8388607)];
                        if ((i6 & 8388608) != 0) {
                            if (i4 != 16777220) {
                                if (i4 == 16777219) {
                                }
                            }
                        }
                        i5 = i4;
                    }
                }
            }
            if (r0.f60354i != null) {
                i5 = m69401a(c19506g2, i5);
            }
            z2 |= C19342l.m69406a(c19506g2, i5, c19342l2.f60348c, i3);
            i3++;
        }
        if (i2 > 0) {
            i6 = z2;
            for (length2 = 0; length2 < length; length2++) {
                i6 |= C19342l.m69406a(c19506g2, r0.f60348c[length2], c19342l2.f60348c, length2);
            }
            if (c19342l2.f60349d == null) {
                length = 1;
                c19342l2.f60349d = new int[1];
            } else {
                length = i6;
            }
            return C19342l.m69406a(c19506g2, i2, c19342l2.f60349d, 0) | length;
        }
        boolean z3 = true;
        i2 = r0.f60349d.length + r0.f60347b.f60377d;
        if (c19342l2.f60349d == null) {
            c19342l2.f60349d = new int[(r0.f60352g + i2)];
        } else {
            z3 = z2;
        }
        boolean z4 = z3;
        for (length = 0; length < i2; length++) {
            int i8 = r0.f60349d[length];
            if (r0.f60354i != null) {
                i8 = m69401a(c19506g2, i8);
            }
            z4 |= C19342l.m69406a(c19506g2, i8, c19342l2.f60349d, length);
        }
        length = 0;
        while (length < r0.f60352g) {
            i3 = r0.f60351f[length];
            i8 = i3 & i4;
            i4 = i3 & 251658240;
            if (i4 != 16777216) {
                i8 += i4 == 33554432 ? r0.f60348c[i3 & 8388607] : r0.f60349d[length2 - (i3 & 8388607)];
                i3 = ((i3 & 8388608) == 0 || !(i8 == 16777220 || i8 == 16777219)) ? i8 : 16777216;
            }
            if (r0.f60354i != null) {
                i3 = m69401a(c19506g2, i3);
            }
            z4 |= C19342l.m69406a(c19506g2, i3, c19342l2.f60349d, i2 + length);
            length++;
            i4 = -268435456;
        }
        return z4;
    }
}
