package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C5665b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class Code128Writer extends C7002o {

    private enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.encode(str, barcodeFormat, i, i2, map);
        }
        i = new StringBuilder("Can only encode CODE_128, but got ");
        i.append(barcodeFormat);
        throw new IllegalArgumentException(i.toString());
    }

    /* renamed from: a */
    public boolean[] mo7370a(String str) {
        int length = str.length();
        if (length > 0) {
            if (length <= 80) {
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if (charAt < ' ' || charAt > '~') {
                        switch (charAt) {
                            case 'ñ':
                            case 'ò':
                            case 'ó':
                            case 'ô':
                                break;
                            default:
                                StringBuilder stringBuilder = new StringBuilder("Bad character in input: ");
                                stringBuilder.append(charAt);
                                throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                }
                Collection<int[]> arrayList = new ArrayList();
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 1;
                while (i3 < length) {
                    int a = m33527a(str, i3, i4);
                    int i7 = 100;
                    if (a == i4) {
                        switch (str.charAt(i3)) {
                            case 'ñ':
                                i7 = 102;
                                break;
                            case 'ò':
                                i7 = 97;
                                break;
                            case 'ó':
                                i7 = 96;
                                break;
                            case 'ô':
                                break;
                            default:
                                if (i4 != 100) {
                                    i7 = Integer.parseInt(str.substring(i3, i3 + 2));
                                    i3++;
                                    break;
                                }
                                i7 = str.charAt(i3) - 32;
                                break;
                        }
                        i3++;
                    } else {
                        i7 = i4 == 0 ? a == 100 ? 104 : 105 : a;
                        i4 = a;
                    }
                    arrayList.add(C7804c.f28243a[i7]);
                    i5 += i7 * i6;
                    if (i3 != 0) {
                        i6++;
                    }
                }
                arrayList.add(C7804c.f28243a[i5 % 103]);
                arrayList.add(C7804c.f28243a[106]);
                length = 0;
                for (int[] iArr : arrayList) {
                    i4 = length;
                    for (int i52 : (int[]) str.next()) {
                        i4 += i52;
                    }
                    length = i4;
                }
                str = new boolean[length];
                for (int[] b : arrayList) {
                    i += C7002o.m30505b(str, i, b, true);
                }
                return str;
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder("Contents length should be between 1 and 80 characters, but got ");
        stringBuilder2.append(length);
        throw new IllegalArgumentException(stringBuilder2.toString());
    }

    /* renamed from: a */
    private static CType m33528a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 'ñ') {
            return CType.FNC_1;
        }
        if (charAt >= '0') {
            if (charAt <= '9') {
                i++;
                if (i >= length) {
                    return CType.ONE_DIGIT;
                }
                charSequence = charSequence.charAt(i);
                if (charSequence >= 48) {
                    if (charSequence <= 57) {
                        return CType.TWO_DIGITS;
                    }
                }
                return CType.ONE_DIGIT;
            }
        }
        return CType.UNCODABLE;
    }

    /* renamed from: a */
    private static int m33527a(CharSequence charSequence, int i, int i2) {
        CType a = m33528a(charSequence, i);
        if (a != CType.UNCODABLE) {
            if (a != CType.ONE_DIGIT) {
                if (i2 == 99) {
                    return i2;
                }
                if (i2 != 100) {
                    if (a == CType.FNC_1) {
                        a = m33528a(charSequence, i + 1);
                    }
                    return a == CType.TWO_DIGITS ? 99 : 100;
                } else if (a == CType.FNC_1) {
                    return i2;
                } else {
                    a = m33528a(charSequence, i + 2);
                    if (a != CType.UNCODABLE) {
                        if (a != CType.ONE_DIGIT) {
                            if (a == CType.FNC_1) {
                                return m33528a(charSequence, i + 3) == CType.TWO_DIGITS ? 99 : 100;
                            } else {
                                i += 4;
                                while (true) {
                                    i2 = m33528a(charSequence, i);
                                    if (i2 != CType.TWO_DIGITS) {
                                        break;
                                    }
                                    i += 2;
                                }
                                return i2 == CType.ONE_DIGIT ? 100 : 99;
                            }
                        }
                    }
                    return i2;
                }
            }
        }
        return 100;
    }
}
