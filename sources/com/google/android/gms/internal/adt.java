package com.google.android.gms.internal;

import com.tinder.domain.config.model.ProfileEditingConfig;

final class adt extends ads {
    adt() {
    }

    /* renamed from: a */
    final int mo4215a(int i, byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= (byte) 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b < (byte) 0) {
                if (b < (byte) -32) {
                    if (i4 >= i3) {
                        return b;
                    }
                    if (b >= (byte) -62) {
                        i2 = i4 + 1;
                        if (bArr[i4] > (byte) -65) {
                        }
                    }
                    return -1;
                } else if (b < (byte) -16) {
                    if (i4 >= i3 - 1) {
                        return adr.m18969c(bArr, i4, i3);
                    }
                    int i5 = i4 + 1;
                    r0 = bArr[i4];
                    if (r0 <= (byte) -65 && ((b != (byte) -32 || r0 >= (byte) -96) && (b != (byte) -19 || r0 < (byte) -96))) {
                        i2 = i5 + 1;
                        if (bArr[i5] > (byte) -65) {
                        }
                    }
                    return -1;
                } else if (i4 >= i3 - 2) {
                    return adr.m18969c(bArr, i4, i3);
                } else {
                    int i6 = i4 + 1;
                    r0 = bArr[i4];
                    if (r0 <= (byte) -65 && (((b << 28) + (r0 + 112)) >> 30) == 0) {
                        i2 = i6 + 1;
                        if (bArr[i6] <= (byte) -65) {
                            i4 = i2 + 1;
                            if (bArr[i2] > (byte) -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
            i2 = i4;
        }
        return 0;
    }

    /* renamed from: a */
    final int mo4216a(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                throw new zzfiv(i3 - 1, length);
            } else {
                if ('?' <= charAt2 && charAt2 <= '?') {
                    int i6 = i3 + 1;
                    if (i6 == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i6))) {
                        throw new zzfiv(i3, length);
                    }
                }
                StringBuilder stringBuilder = new StringBuilder(37);
                stringBuilder.append("Failed writing ");
                stringBuilder.append(charAt2);
                stringBuilder.append(" at index ");
                stringBuilder.append(i);
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
            i = i5;
            i3++;
        }
        return i;
    }
}
