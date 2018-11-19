package com.google.zxing.qrcode.p129a;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C5664a;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.p128a.C5661a;
import com.google.zxing.common.p128a.C5663c;
import com.google.zxing.qrcode.decoder.C5695a;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.zxing.qrcode.a.c */
public final class C5689c {
    /* renamed from: a */
    private static final int[] f21082a = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: a */
    private static int m24908a(C5687b c5687b) {
        return ((C5690d.m24928a(c5687b) + C5690d.m24933b(c5687b)) + C5690d.m24934c(c5687b)) + C5690d.m24935d(c5687b);
    }

    /* renamed from: a */
    public static C5692f m24911a(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) throws WriterException {
        C5695a a;
        String str2 = "ISO-8859-1";
        if (map != null && map.containsKey(EncodeHintType.CHARACTER_SET)) {
            str2 = map.get(EncodeHintType.CHARACTER_SET).toString();
        }
        Mode a2 = C5689c.m24912a(str, str2);
        C5664a c5664a = new C5664a();
        if (a2 == Mode.BYTE && !"ISO-8859-1".equals(str2)) {
            CharacterSetECI characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(str2);
            if (characterSetECIByName != null) {
                C5689c.m24918a(characterSetECIByName, c5664a);
            }
        }
        C5689c.m24919a(a2, c5664a);
        C5664a c5664a2 = new C5664a();
        C5689c.m24923a(str, a2, c5664a2, str2);
        if (map == null || !map.containsKey(EncodeHintType.QR_VERSION)) {
            a = C5689c.m24914a(errorCorrectionLevel, a2, c5664a, c5664a2);
        } else {
            a = C5695a.m24968a(Integer.parseInt(map.get(EncodeHintType.QR_VERSION).toString()));
            if (!C5689c.m24924a(C5689c.m24909a(a2, c5664a, c5664a2, a), a, errorCorrectionLevel)) {
                throw new WriterException("Data too big for requested version");
            }
        }
        C5664a c5664a3 = new C5664a();
        c5664a3.m24754a(c5664a);
        C5689c.m24917a(a2 == Mode.BYTE ? c5664a2.m24758b() : str.length(), a, a2, c5664a3);
        c5664a3.m24754a(c5664a2);
        str = a.m24971a(errorCorrectionLevel);
        int b = a.m24972b() - str.m24966c();
        C5689c.m24916a(b, c5664a3);
        C5664a a3 = C5689c.m24910a(c5664a3, a.m24972b(), b, str.m24965b());
        C5692f c5692f = new C5692f();
        c5692f.m24959a(errorCorrectionLevel);
        c5692f.m24960a(a2);
        c5692f.m24961a(a);
        int c = a.m24973c();
        C5687b c5687b = new C5687b(c, c);
        c = C5689c.m24907a(a3, errorCorrectionLevel, a, c5687b);
        c5692f.m24957a(c);
        C5691e.m24940a(a3, errorCorrectionLevel, a, c, c5687b);
        c5692f.m24958a(c5687b);
        return c5692f;
    }

    /* renamed from: a */
    private static C5695a m24914a(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, C5664a c5664a, C5664a c5664a2) throws WriterException {
        return C5689c.m24913a(C5689c.m24909a(mode, c5664a, c5664a2, C5689c.m24913a(C5689c.m24909a(mode, c5664a, c5664a2, C5695a.m24968a(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    /* renamed from: a */
    private static int m24909a(Mode mode, C5664a c5664a, C5664a c5664a2, C5695a c5695a) {
        return (c5664a.m24751a() + mode.getCharacterCountBits(c5695a)) + c5664a2.m24751a();
    }

    /* renamed from: a */
    static int m24906a(int i) {
        return i < f21082a.length ? f21082a[i] : -1;
    }

    /* renamed from: a */
    private static Mode m24912a(String str, String str2) {
        if ("Shift_JIS".equals(str2) != null && C5689c.m24925a(str) != null) {
            return Mode.KANJI;
        }
        Object obj = null;
        Object obj2 = null;
        for (str2 = null; str2 < str.length(); str2++) {
            int charAt = str.charAt(str2);
            if (charAt >= '0' && charAt <= '9') {
                obj2 = 1;
            } else if (C5689c.m24906a(charAt) == -1) {
                return Mode.BYTE;
            } else {
                obj = 1;
            }
        }
        if (obj != null) {
            return Mode.ALPHANUMERIC;
        }
        if (obj2 != null) {
            return Mode.NUMERIC;
        }
        return Mode.BYTE;
    }

    /* renamed from: a */
    private static boolean m24925a(java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = "Shift_JIS";	 Catch:{ UnsupportedEncodingException -> 0x002b }
        r5 = r5.getBytes(r1);	 Catch:{ UnsupportedEncodingException -> 0x002b }
        r1 = r5.length;
        r2 = r1 % 2;
        if (r2 == 0) goto L_0x000d;
    L_0x000c:
        return r0;
    L_0x000d:
        r2 = 0;
    L_0x000e:
        if (r2 >= r1) goto L_0x0029;
    L_0x0010:
        r3 = r5[r2];
        r3 = r3 & 255;
        r4 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        if (r3 < r4) goto L_0x001c;
    L_0x0018:
        r4 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        if (r3 <= r4) goto L_0x0025;
    L_0x001c:
        r4 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        if (r3 < r4) goto L_0x0028;
    L_0x0020:
        r4 = 235; // 0xeb float:3.3E-43 double:1.16E-321;
        if (r3 <= r4) goto L_0x0025;
    L_0x0024:
        goto L_0x0028;
    L_0x0025:
        r2 = r2 + 2;
        goto L_0x000e;
    L_0x0028:
        return r0;
    L_0x0029:
        r5 = 1;
        return r5;
    L_0x002b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.a.c.a(java.lang.String):boolean");
    }

    /* renamed from: a */
    private static int m24907a(C5664a c5664a, ErrorCorrectionLevel errorCorrectionLevel, C5695a c5695a, C5687b c5687b) throws WriterException {
        int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            C5691e.m24940a(c5664a, errorCorrectionLevel, c5695a, i3, c5687b);
            int a = C5689c.m24908a(c5687b);
            if (a < i) {
                i2 = i3;
                i = a;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static C5695a m24913a(int i, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            C5695a a = C5695a.m24968a(i2);
            if (C5689c.m24924a(i, a, errorCorrectionLevel)) {
                return a;
            }
        }
        throw new WriterException("Data too big");
    }

    /* renamed from: a */
    private static boolean m24924a(int i, C5695a c5695a, ErrorCorrectionLevel errorCorrectionLevel) {
        return c5695a.m24972b() - c5695a.m24971a(errorCorrectionLevel).m24966c() >= (i + 7) / 8;
    }

    /* renamed from: a */
    static void m24916a(int i, C5664a c5664a) throws WriterException {
        int i2 = i << 3;
        if (c5664a.m24751a() > i2) {
            StringBuilder stringBuilder = new StringBuilder("data bits cannot fit in the QR Code");
            stringBuilder.append(c5664a.m24751a());
            stringBuilder.append(" > ");
            stringBuilder.append(i2);
            throw new WriterException(stringBuilder.toString());
        }
        int i3;
        int i4 = 0;
        for (i3 = 0; i3 < 4 && c5664a.m24751a() < i2; i3++) {
            c5664a.m24755a(false);
        }
        i3 = c5664a.m24751a() & 7;
        if (i3 > 0) {
            while (i3 < 8) {
                c5664a.m24755a(false);
                i3++;
            }
        }
        i -= c5664a.m24758b();
        while (i4 < i) {
            c5664a.m24752a((i4 & 1) == 0 ? 236 : 17, 8);
            i4++;
        }
        if (c5664a.m24751a() != i2) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    /* renamed from: a */
    static void m24915a(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        if (i4 >= i3) {
            throw new WriterException("Block ID too large");
        }
        int i5 = i % i3;
        int i6 = i3 - i5;
        int i7 = i / i3;
        int i8 = i7 + 1;
        i2 /= i3;
        int i9 = i2 + 1;
        i7 -= i2;
        i8 -= i9;
        if (i7 != i8) {
            throw new WriterException("EC bytes mismatch");
        } else if (i3 != i6 + i5) {
            throw new WriterException("RS blocks mismatch");
        } else if (i != ((i2 + i7) * i6) + ((i9 + i8) * i5)) {
            throw new WriterException("Total bytes mismatch");
        } else if (i4 < i6) {
            iArr[0] = i2;
            iArr2[0] = i7;
        } else {
            iArr[0] = i9;
            iArr2[0] = i8;
        }
    }

    /* renamed from: a */
    static C5664a m24910a(C5664a c5664a, int i, int i2, int i3) throws WriterException {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (c5664a.m24758b() != i5) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        Collection<C5686a> arrayList = new ArrayList(i6);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i6; i11++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int[] iArr3 = iArr2;
            C5689c.m24915a(i4, i5, i6, i11, iArr, iArr2);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            c5664a.m24753a(i8 << 3, bArr, 0, i12);
            byte[] a = C5689c.m24926a(bArr, iArr3[0]);
            arrayList.add(new C5686a(bArr, a));
            i9 = Math.max(i9, i12);
            i10 = Math.max(i10, a.length);
            i8 += iArr[0];
        }
        if (i5 != i8) {
            throw new WriterException("Data bytes does not match offset");
        }
        C5664a c5664a2 = new C5664a();
        for (int i13 = 0; i13 < i9; i13++) {
            for (C5686a a2 : arrayList) {
                byte[] a3 = a2.m24897a();
                if (i13 < a3.length) {
                    c5664a2.m24752a(a3[i13], 8);
                }
            }
        }
        while (i7 < i10) {
            for (C5686a b : arrayList) {
                byte[] b2 = b.m24898b();
                if (i7 < b2.length) {
                    c5664a2.m24752a(b2[i7], 8);
                }
            }
            i7++;
        }
        if (i4 == c5664a2.m24758b()) {
            return c5664a2;
        }
        StringBuilder stringBuilder = new StringBuilder("Interleaving error: ");
        stringBuilder.append(i4);
        stringBuilder.append(" and ");
        stringBuilder.append(c5664a2.m24758b());
        stringBuilder.append(" differ.");
        throw new WriterException(stringBuilder.toString());
    }

    /* renamed from: a */
    static byte[] m24926a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new C5663c(C5661a.f20972e).m24748a(iArr, i);
        bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) iArr[length + i3];
        }
        return bArr;
    }

    /* renamed from: a */
    static void m24919a(Mode mode, C5664a c5664a) {
        c5664a.m24752a(mode.getBits(), 4);
    }

    /* renamed from: a */
    static void m24917a(int i, C5695a c5695a, Mode mode, C5664a c5664a) throws WriterException {
        c5695a = mode.getCharacterCountBits(c5695a);
        int i2 = 1 << c5695a;
        if (i >= i2) {
            c5664a = new StringBuilder();
            c5664a.append(i);
            c5664a.append(" is bigger than ");
            c5664a.append(i2 - 1);
            throw new WriterException(c5664a.toString());
        }
        c5664a.m24752a(i, c5695a);
    }

    /* renamed from: a */
    static void m24923a(String str, Mode mode, C5664a c5664a, String str2) throws WriterException {
        switch (mode) {
            case NUMERIC:
                C5689c.m24920a((CharSequence) str, c5664a);
                return;
            case ALPHANUMERIC:
                C5689c.m24927b(str, c5664a);
                return;
            case BYTE:
                C5689c.m24922a(str, c5664a, str2);
                return;
            case KANJI:
                C5689c.m24921a(str, c5664a);
                return;
            default:
                c5664a = new StringBuilder("Invalid mode: ");
                c5664a.append(mode);
                throw new WriterException(c5664a.toString());
        }
    }

    /* renamed from: a */
    static void m24920a(CharSequence charSequence, C5664a c5664a) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - 48;
            int i2 = i + 2;
            if (i2 < length) {
                c5664a.m24752a(((charAt * 100) + ((charSequence.charAt(i + 1) - 48) * 10)) + (charSequence.charAt(i2) - 48), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    c5664a.m24752a((charAt * 10) + (charSequence.charAt(i) - 48), 7);
                    i = i2;
                } else {
                    c5664a.m24752a(charAt, 4);
                }
            }
        }
    }

    /* renamed from: b */
    static void m24927b(CharSequence charSequence, C5664a c5664a) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int a = C5689c.m24906a(charSequence.charAt(i));
            if (a == -1) {
                throw new WriterException();
            }
            int i2 = i + 1;
            if (i2 < length) {
                i2 = C5689c.m24906a(charSequence.charAt(i2));
                if (i2 == -1) {
                    throw new WriterException();
                }
                c5664a.m24752a((a * 45) + i2, 11);
                i += 2;
            } else {
                c5664a.m24752a(a, 6);
                i = i2;
            }
        }
    }

    /* renamed from: a */
    static void m24922a(String str, C5664a c5664a, String str2) throws WriterException {
        try {
            for (byte a : str.getBytes(str2)) {
                c5664a.m24752a(a, 8);
            }
        } catch (Throwable e) {
            throw new WriterException(e);
        }
    }

    /* renamed from: a */
    static void m24921a(String str, C5664a c5664a) throws WriterException {
        try {
            str = str.getBytes("Shift_JIS");
            int length = str.length;
            for (int i = 0; i < length; i += 2) {
                int i2 = ((str[i] & 255) << 8) | (str[i + 1] & 255);
                i2 = (i2 < 33088 || i2 > 40956) ? (i2 < 57408 || i2 > 60351) ? -1 : i2 - 49472 : i2 - 33088;
                if (i2 == -1) {
                    throw new WriterException("Invalid byte sequence");
                }
                c5664a.m24752a(((i2 >> 8) * 192) + (i2 & 255), 13);
            }
        } catch (Throwable e) {
            throw new WriterException(e);
        }
    }

    /* renamed from: a */
    private static void m24918a(CharacterSetECI characterSetECI, C5664a c5664a) {
        c5664a.m24752a(Mode.ECI.getBits(), 4);
        c5664a.m24752a(characterSetECI.getValue(), 8);
    }
}
