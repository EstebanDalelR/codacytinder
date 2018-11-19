package com.google.android.m4b.maps.ct;

import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.google.android.m4b.maps.ct.y */
final class C5294y {

    /* renamed from: com.google.android.m4b.maps.ct.y$a */
    static class C5293a extends IllegalArgumentException {
        private C5293a(int i) {
            StringBuilder stringBuilder = new StringBuilder(39);
            stringBuilder.append("Unpaired surrogate at index ");
            stringBuilder.append(i);
            super(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static int m23476a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= (byte) 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            i = bArr[i];
            if (i < 0) {
                if (i < -32) {
                    if (i3 >= i2) {
                        return i;
                    }
                    if (i >= -62) {
                        i = i3 + 1;
                        if (bArr[i3] > (byte) -65) {
                        }
                    }
                    return -1;
                } else if (i < -16) {
                    if (i3 >= i2 - 1) {
                        return C5294y.m23477b(bArr, i3, i2);
                    }
                    int i4 = i3 + 1;
                    r1 = bArr[i3];
                    if (r1 <= (byte) -65 && ((i != -32 || r1 >= (byte) -96) && (i != -19 || r1 < (byte) -96))) {
                        i = i4 + 1;
                        if (bArr[i4] > (byte) -65) {
                        }
                    }
                    return -1;
                } else if (i3 >= i2 - 2) {
                    return C5294y.m23477b(bArr, i3, i2);
                } else {
                    int i5 = i3 + 1;
                    r1 = bArr[i3];
                    if (r1 <= (byte) -65 && (((i << 28) + (r1 + 112)) >> 30) == 0) {
                        i = i5 + 1;
                        if (bArr[i5] <= (byte) -65) {
                            i3 = i + 1;
                            if (bArr[i] > -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
            i = i3;
        }
        return 0;
    }

    /* renamed from: b */
    private static int m23477b(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                if (b > (byte) -12) {
                    return -1;
                }
                return b;
            case 1:
                bArr = bArr[i];
                if (b <= (byte) -12) {
                    if (bArr <= -65) {
                        return (bArr << 8) ^ b;
                    }
                }
                return -1;
            case 2:
                i2 = bArr[i];
                bArr = bArr[i + 1];
                if (b <= (byte) -12 && i2 <= -65) {
                    if (bArr <= -65) {
                        return (bArr << 16) ^ ((i2 << 8) ^ b);
                    }
                }
                return -1;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: a */
    static int m23474a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < '') {
            i++;
        }
        int i2 = length;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 'ࠀ') {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                int length2 = charSequence.length();
                int i3 = 0;
                while (i < length2) {
                    char charAt2 = charSequence.charAt(i);
                    if (charAt2 < 'ࠀ') {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if ('?' <= charAt2 && charAt2 <= '?') {
                            if (Character.codePointAt(charSequence, i) < 65536) {
                                throw new C5293a(i);
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
                if (i2 < length) {
                    return i2;
                }
                long j = ((long) i2) + 4294967296L;
                StringBuilder stringBuilder = new StringBuilder(54);
                stringBuilder.append("UTF-8 length does not fit in int: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (i2 < length) {
            return i2;
        }
        long j2 = ((long) i2) + 4294967296L;
        StringBuilder stringBuilder2 = new StringBuilder(54);
        stringBuilder2.append("UTF-8 length does not fit in int: ");
        stringBuilder2.append(j2);
        throw new IllegalArgumentException(stringBuilder2.toString());
    }

    /* renamed from: a */
    static int m23475a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int length = charSequence.length();
        i2 += i;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + i;
            if (i4 >= i2) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt >= '') {
                break;
            }
            bArr[i4] = (byte) charAt;
            i3++;
        }
        if (i3 == length) {
            return i + length;
        }
        i += i3;
        while (i3 < length) {
            int i5;
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 < '' && i < i2) {
                i5 = i + 1;
                bArr[i] = (byte) charAt2;
            } else if (charAt2 < 'ࠀ' && i <= i2 - 2) {
                i5 = i + 1;
                bArr[i] = (byte) ((charAt2 >>> 6) | 960);
                i = i5 + 1;
                bArr[i5] = (byte) ((charAt2 & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                i3++;
            } else if ((charAt2 < '?' || '?' < charAt2) && i <= i2 - 3) {
                i5 = i + 1;
                bArr[i] = (byte) ((charAt2 >>> 12) | 480);
                i = i5 + 1;
                bArr[i5] = (byte) (((charAt2 >>> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                i5 = i + 1;
                bArr[i] = (byte) ((charAt2 & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            } else if (i <= i2 - 4) {
                i5 = i3 + 1;
                if (i5 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i5);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        i3 = Character.toCodePoint(charAt2, charAt3);
                        i4 = i + 1;
                        bArr[i] = (byte) ((i3 >>> 18) | 240);
                        i = i4 + 1;
                        bArr[i4] = (byte) (((i3 >>> 12) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                        i4 = i + 1;
                        bArr[i] = (byte) (((i3 >>> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                        i = i4 + 1;
                        bArr[i4] = (byte) ((i3 & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                        i3 = i5;
                        i3++;
                    } else {
                        i3 = i5;
                    }
                }
                throw new C5293a(i3 - 1);
            } else {
                if ('?' <= charAt2 && charAt2 <= '?') {
                    bArr = i3 + 1;
                    if (bArr == charSequence.length() || Character.isSurrogatePair(charAt2, charSequence.charAt(bArr)) == null) {
                        throw new C5293a(i3);
                    }
                }
                bArr = new StringBuilder(37);
                bArr.append("Failed writing ");
                bArr.append(charAt2);
                bArr.append(" at index ");
                bArr.append(i);
                throw new ArrayIndexOutOfBoundsException(bArr.toString());
            }
            i = i5;
            i3++;
        }
        return i;
    }
}
