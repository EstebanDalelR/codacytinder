package com.google.zxing.pdf417.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.google.zxing.pdf417.encoder.f */
final class C5685f {
    /* renamed from: a */
    private static final byte[] f21071a = new byte[]{(byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 38, (byte) 13, (byte) 9, (byte) 44, (byte) 58, (byte) 35, (byte) 45, (byte) 46, (byte) 36, (byte) 47, (byte) 43, (byte) 37, (byte) 42, (byte) 61, (byte) 94, (byte) 0, (byte) 32, (byte) 0, (byte) 0, (byte) 0};
    /* renamed from: b */
    private static final byte[] f21072b = new byte[]{(byte) 59, (byte) 60, (byte) 62, (byte) 64, (byte) 91, (byte) 92, (byte) 93, (byte) 95, (byte) 96, (byte) 126, (byte) 33, (byte) 13, (byte) 9, (byte) 44, (byte) 58, (byte) 10, (byte) 45, (byte) 46, (byte) 36, (byte) 47, (byte) 34, (byte) 124, (byte) 42, (byte) 40, (byte) 41, (byte) 63, (byte) 123, (byte) 125, (byte) 39, (byte) 0};
    /* renamed from: c */
    private static final byte[] f21073c = new byte[ProfileEditingConfig.DEFAULT_MAX_LENGTH];
    /* renamed from: d */
    private static final byte[] f21074d = new byte[ProfileEditingConfig.DEFAULT_MAX_LENGTH];
    /* renamed from: e */
    private static final Charset f21075e = Charset.forName("ISO-8859-1");

    /* renamed from: a */
    private static boolean m24890a(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: b */
    private static boolean m24892b(char c) {
        if (c != ' ') {
            if (c < 'A' || c > 'Z') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m24893c(char c) {
        if (c != ' ') {
            if (c < 'a' || c > 'z') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m24896f(char c) {
        if (!(c == '\t' || c == '\n' || c == '\r')) {
            if (c < ' ' || c > '~') {
                return false;
            }
        }
        return true;
    }

    static {
        Arrays.fill(f21073c, (byte) -1);
        for (int i = 0; i < f21071a.length; i++) {
            byte b = f21071a[i];
            if (b > (byte) 0) {
                f21073c[b] = (byte) i;
            }
        }
        Arrays.fill(f21074d, (byte) -1);
        for (int i2 = 0; i2 < f21072b.length; i2++) {
            byte b2 = f21072b[i2];
            if (b2 > (byte) 0) {
                f21074d[b2] = (byte) i2;
            }
        }
    }

    /* renamed from: a */
    static String m24886a(String str, Compaction compaction, Charset charset) throws WriterException {
        StringBuilder stringBuilder = new StringBuilder(str.length());
        if (charset == null) {
            charset = f21075e;
        } else if (!f21075e.equals(charset)) {
            CharacterSetECI characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(charset.name());
            if (characterSetECIByName != null) {
                C5685f.m24887a(characterSetECIByName.getValue(), stringBuilder);
            }
        }
        int length = str.length();
        if (compaction != Compaction.TEXT) {
            if (compaction != Compaction.BYTE) {
                if (compaction != Compaction.NUMERIC) {
                    int i = null;
                    int i2 = 0;
                    loop0:
                    while (true) {
                        int i3 = 0;
                        while (i < length) {
                            int a = C5685f.m24883a((CharSequence) str, i);
                            if (a >= 13) {
                                stringBuilder.append('Ά');
                                i2 = 2;
                                C5685f.m24888a(str, i, a, stringBuilder);
                                i += a;
                            } else {
                                int b = C5685f.m24891b(str, i);
                                if (b < 5) {
                                    if (a != length) {
                                        a = C5685f.m24885a(str, i, charset);
                                        if (a == 0) {
                                            a = 1;
                                        }
                                        a += i;
                                        byte[] bytes = str.substring(i, a).getBytes(charset);
                                        if (bytes.length == 1 && i2 == 0) {
                                            C5685f.m24889a(bytes, 0, 1, 0, stringBuilder);
                                        } else {
                                            C5685f.m24889a(bytes, 0, bytes.length, i2, stringBuilder);
                                            i2 = 1;
                                            i3 = 0;
                                        }
                                        i = a;
                                    }
                                }
                                if (i2 != 0) {
                                    stringBuilder.append('΄');
                                    i2 = 0;
                                    i3 = 0;
                                }
                                i3 = C5685f.m24884a((CharSequence) str, i, b, stringBuilder, i3);
                                i += b;
                            }
                        }
                        break loop0;
                    }
                }
                stringBuilder.append('Ά');
                C5685f.m24888a(str, 0, length, stringBuilder);
            } else {
                byte[] bytes2 = str.getBytes(charset);
                C5685f.m24889a(bytes2, 0, bytes2.length, 1, stringBuilder);
            }
        } else {
            C5685f.m24884a((CharSequence) str, 0, length, stringBuilder, 0);
        }
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static int m24884a(java.lang.CharSequence r17, int r18, int r19, java.lang.StringBuilder r20, int r21) {
        /*
        r0 = r17;
        r1 = r19;
        r2 = r20;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r1);
        r4 = 2;
        r6 = 0;
        r9 = r21;
        r8 = 0;
    L_0x0010:
        r10 = r18 + r8;
        r11 = r0.charAt(r10);
        r12 = 26;
        r13 = 32;
        r14 = 27;
        r15 = 28;
        r5 = 29;
        switch(r9) {
            case 0: goto L_0x00b4;
            case 1: goto L_0x007b;
            case 2: goto L_0x0033;
            default: goto L_0x0023;
        };
    L_0x0023:
        r10 = com.google.zxing.pdf417.encoder.C5685f.m24895e(r11);
        if (r10 == 0) goto L_0x011d;
    L_0x0029:
        r10 = f21074d;
        r10 = r10[r11];
        r10 = (char) r10;
        r3.append(r10);
        goto L_0x00ea;
    L_0x0033:
        r12 = com.google.zxing.pdf417.encoder.C5685f.m24894d(r11);
        if (r12 == 0) goto L_0x0043;
    L_0x0039:
        r10 = f21073c;
        r10 = r10[r11];
        r10 = (char) r10;
        r3.append(r10);
        goto L_0x00ea;
    L_0x0043:
        r12 = com.google.zxing.pdf417.encoder.C5685f.m24892b(r11);
        if (r12 == 0) goto L_0x004e;
    L_0x0049:
        r3.append(r15);
        goto L_0x0120;
    L_0x004e:
        r12 = com.google.zxing.pdf417.encoder.C5685f.m24893c(r11);
        if (r12 == 0) goto L_0x0059;
    L_0x0054:
        r3.append(r14);
        goto L_0x00d0;
    L_0x0059:
        r10 = r10 + 1;
        if (r10 >= r1) goto L_0x006e;
    L_0x005d:
        r10 = r0.charAt(r10);
        r10 = com.google.zxing.pdf417.encoder.C5685f.m24895e(r10);
        if (r10 == 0) goto L_0x006e;
    L_0x0067:
        r9 = 3;
        r5 = 25;
        r3.append(r5);
        goto L_0x0010;
    L_0x006e:
        r3.append(r5);
        r10 = f21074d;
        r10 = r10[r11];
        r10 = (char) r10;
        r3.append(r10);
        goto L_0x00ea;
    L_0x007b:
        r10 = com.google.zxing.pdf417.encoder.C5685f.m24893c(r11);
        if (r10 == 0) goto L_0x008e;
    L_0x0081:
        if (r11 != r13) goto L_0x0087;
    L_0x0083:
        r3.append(r12);
        goto L_0x00ea;
    L_0x0087:
        r11 = r11 + -97;
        r10 = (char) r11;
        r3.append(r10);
        goto L_0x00ea;
    L_0x008e:
        r10 = com.google.zxing.pdf417.encoder.C5685f.m24892b(r11);
        if (r10 == 0) goto L_0x009e;
    L_0x0094:
        r3.append(r14);
        r11 = r11 + -65;
        r10 = (char) r11;
        r3.append(r10);
        goto L_0x00ea;
    L_0x009e:
        r10 = com.google.zxing.pdf417.encoder.C5685f.m24894d(r11);
        if (r10 == 0) goto L_0x00a8;
    L_0x00a4:
        r3.append(r15);
        goto L_0x00dc;
    L_0x00a8:
        r3.append(r5);
        r10 = f21074d;
        r10 = r10[r11];
        r10 = (char) r10;
        r3.append(r10);
        goto L_0x00ea;
    L_0x00b4:
        r10 = com.google.zxing.pdf417.encoder.C5685f.m24892b(r11);
        if (r10 == 0) goto L_0x00c7;
    L_0x00ba:
        if (r11 != r13) goto L_0x00c0;
    L_0x00bc:
        r3.append(r12);
        goto L_0x00ea;
    L_0x00c0:
        r11 = r11 + -65;
        r10 = (char) r11;
        r3.append(r10);
        goto L_0x00ea;
    L_0x00c7:
        r10 = com.google.zxing.pdf417.encoder.C5685f.m24893c(r11);
        if (r10 == 0) goto L_0x00d3;
    L_0x00cd:
        r3.append(r14);
    L_0x00d0:
        r9 = 1;
        goto L_0x0010;
    L_0x00d3:
        r10 = com.google.zxing.pdf417.encoder.C5685f.m24894d(r11);
        if (r10 == 0) goto L_0x00df;
    L_0x00d9:
        r3.append(r15);
    L_0x00dc:
        r9 = 2;
        goto L_0x0010;
    L_0x00df:
        r3.append(r5);
        r10 = f21074d;
        r10 = r10[r11];
        r10 = (char) r10;
        r3.append(r10);
    L_0x00ea:
        r8 = r8 + 1;
        if (r8 < r1) goto L_0x0010;
    L_0x00ee:
        r0 = r3.length();
        r1 = 0;
        r7 = 0;
    L_0x00f4:
        if (r1 >= r0) goto L_0x0112;
    L_0x00f6:
        r8 = r1 % 2;
        if (r8 == 0) goto L_0x00fc;
    L_0x00fa:
        r8 = 1;
        goto L_0x00fd;
    L_0x00fc:
        r8 = 0;
    L_0x00fd:
        if (r8 == 0) goto L_0x010b;
    L_0x00ff:
        r7 = r7 * 30;
        r8 = r3.charAt(r1);
        r7 = r7 + r8;
        r7 = (char) r7;
        r2.append(r7);
        goto L_0x010f;
    L_0x010b:
        r7 = r3.charAt(r1);
    L_0x010f:
        r1 = r1 + 1;
        goto L_0x00f4;
    L_0x0112:
        r0 = r0 % r4;
        if (r0 == 0) goto L_0x011c;
    L_0x0115:
        r7 = r7 * 30;
        r7 = r7 + r5;
        r0 = (char) r7;
        r2.append(r0);
    L_0x011c:
        return r9;
    L_0x011d:
        r3.append(r5);
    L_0x0120:
        r9 = 0;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.f.a(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    /* renamed from: a */
    private static void m24889a(byte[] bArr, int i, int i2, int i3, StringBuilder stringBuilder) {
        int i4;
        int i5 = i2;
        StringBuilder stringBuilder2 = stringBuilder;
        if (i5 == 1 && i3 == 0) {
            stringBuilder2.append('Α');
        } else if (i5 % 6 == 0) {
            stringBuilder2.append('Μ');
        } else {
            stringBuilder2.append('΅');
        }
        if (i5 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i5) - i4 >= 6) {
                long j = 0;
                int i6 = 0;
                while (i6 < 6) {
                    i6++;
                    j = (j << 8) + ((long) (bArr[i4 + i6] & 255));
                }
                for (int i7 = 0; i7 < 5; i7++) {
                    cArr[i7] = (char) ((int) (j % 900));
                    j /= 900;
                }
                for (i6 = 4; i6 >= 0; i6--) {
                    stringBuilder2.append(cArr[i6]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i5) {
            stringBuilder2.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    /* renamed from: a */
    private static void m24888a(String str, int i, int i2, StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i3 = 0;
        while (i3 < i2) {
            stringBuilder2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder stringBuilder3 = new StringBuilder("1");
            int i4 = i + i3;
            stringBuilder3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(stringBuilder3.toString());
            do {
                stringBuilder2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = stringBuilder2.length() - 1; length >= 0; length--) {
                stringBuilder.append(stringBuilder2.charAt(length));
            }
            i3 += min;
        }
    }

    /* renamed from: d */
    private static boolean m24894d(char c) {
        return f21073c[c] != '￿';
    }

    /* renamed from: e */
    private static boolean m24895e(char c) {
        return f21074d[c] != '￿';
    }

    /* renamed from: a */
    private static int m24883a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (C5685f.m24890a(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    private static int m24891b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && C5685f.m24890a(r2) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    charAt = charSequence.charAt(i2);
                }
            }
            if (i3 < 13) {
                if (i3 <= 0) {
                    if (!C5685f.m24896f(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
            } else {
                return (i2 - i) - i3;
            }
        }
        return i2 - i;
    }

    /* renamed from: a */
    private static int m24885a(String str, int i, Charset charset) throws WriterException {
        charset = charset.newEncoder();
        int length = str.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && C5685f.m24890a(r2)) {
                i3++;
                int i4 = i2 + i3;
                if (i4 >= length) {
                    break;
                }
                charAt = str.charAt(i4);
            }
            if (i3 >= 13) {
                return i2 - i;
            }
            charAt = str.charAt(i2);
            if (charset.canEncode(charAt)) {
                i2++;
            } else {
                i = new StringBuilder("Non-encodable character detected: ");
                i.append(charAt);
                i.append(" (Unicode: ");
                i.append(charAt);
                i.append(')');
                throw new WriterException(i.toString());
            }
        }
        return i2 - i;
    }

    /* renamed from: a */
    private static void m24887a(int i, StringBuilder stringBuilder) throws WriterException {
        if (i >= 0 && i < 900) {
            stringBuilder.append('Ο');
            stringBuilder.append((char) i);
        } else if (i < 810900) {
            stringBuilder.append('Ξ');
            stringBuilder.append((char) ((i / 900) - 1));
            stringBuilder.append((char) (i % 900));
        } else if (i < 811800) {
            stringBuilder.append('Ν');
            stringBuilder.append((char) (810900 - i));
        } else {
            StringBuilder stringBuilder2 = new StringBuilder("ECI number not in valid range from 0..811799, but was ");
            stringBuilder2.append(i);
            throw new WriterException(stringBuilder2.toString());
        }
    }
}
