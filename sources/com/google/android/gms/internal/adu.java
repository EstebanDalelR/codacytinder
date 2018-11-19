package com.google.android.gms.internal;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.tinder.domain.config.model.ProfileEditingConfig;

final class adu extends ads {
    adu() {
    }

    /* renamed from: a */
    private static int m27057a(byte[] bArr, int i, long j, int i2) {
        switch (i2) {
            case 0:
                return adr.m18965b(i);
            case 1:
                return adr.m18966b(i, adp.m18935a(bArr, j));
            case 2:
                return adr.m18967b(i, adp.m18935a(bArr, j), adp.m18935a(bArr, j + 1));
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static int m27058a(byte[] r9, long r10, int r12) {
        /*
        r0 = 0;
        r1 = 1;
        r3 = 16;
        if (r12 >= r3) goto L_0x0009;
    L_0x0007:
        r3 = 0;
        goto L_0x001b;
    L_0x0009:
        r4 = r10;
        r3 = 0;
    L_0x000b:
        if (r3 >= r12) goto L_0x001a;
    L_0x000d:
        r6 = r4 + r1;
        r4 = com.google.android.gms.internal.adp.m18935a(r9, r4);
        if (r4 >= 0) goto L_0x0016;
    L_0x0015:
        goto L_0x001b;
    L_0x0016:
        r3 = r3 + 1;
        r4 = r6;
        goto L_0x000b;
    L_0x001a:
        r3 = r12;
    L_0x001b:
        r12 = r12 - r3;
        r3 = (long) r3;
        r5 = r10 + r3;
    L_0x001f:
        r10 = 0;
    L_0x0020:
        if (r12 <= 0) goto L_0x0031;
    L_0x0022:
        r10 = r5 + r1;
        r3 = com.google.android.gms.internal.adp.m18935a(r9, r5);
        if (r3 < 0) goto L_0x002f;
    L_0x002a:
        r12 = r12 + -1;
        r5 = r10;
        r10 = r3;
        goto L_0x0020;
    L_0x002f:
        r5 = r10;
        r10 = r3;
    L_0x0031:
        if (r12 != 0) goto L_0x0034;
    L_0x0033:
        return r0;
    L_0x0034:
        r12 = r12 + -1;
        r11 = -32;
        r3 = -65;
        r4 = -1;
        if (r10 >= r11) goto L_0x0052;
    L_0x003d:
        if (r12 != 0) goto L_0x0040;
    L_0x003f:
        return r10;
    L_0x0040:
        r12 = r12 + -1;
        r11 = -62;
        if (r10 < r11) goto L_0x0051;
    L_0x0046:
        r10 = r5 + r1;
        r5 = com.google.android.gms.internal.adp.m18935a(r9, r5);
        if (r5 <= r3) goto L_0x004f;
    L_0x004e:
        return r4;
    L_0x004f:
        r5 = r10;
        goto L_0x001f;
    L_0x0051:
        return r4;
    L_0x0052:
        r7 = -16;
        if (r10 >= r7) goto L_0x007e;
    L_0x0056:
        r7 = 2;
        if (r12 >= r7) goto L_0x005e;
    L_0x0059:
        r9 = m27057a(r9, r10, r5, r12);
        return r9;
    L_0x005e:
        r12 = r12 + -2;
        r7 = r5 + r1;
        r5 = com.google.android.gms.internal.adp.m18935a(r9, r5);
        if (r5 > r3) goto L_0x007d;
    L_0x0068:
        r6 = -96;
        if (r10 != r11) goto L_0x006e;
    L_0x006c:
        if (r5 < r6) goto L_0x007d;
    L_0x006e:
        r11 = -19;
        if (r10 != r11) goto L_0x0074;
    L_0x0072:
        if (r5 >= r6) goto L_0x007d;
    L_0x0074:
        r10 = 0;
        r5 = r7 + r1;
        r10 = com.google.android.gms.internal.adp.m18935a(r9, r7);
        if (r10 <= r3) goto L_0x001f;
    L_0x007d:
        return r4;
    L_0x007e:
        r11 = 3;
        if (r12 >= r11) goto L_0x0086;
    L_0x0081:
        r9 = m27057a(r9, r10, r5, r12);
        return r9;
    L_0x0086:
        r12 = r12 + -3;
        r7 = r5 + r1;
        r11 = com.google.android.gms.internal.adp.m18935a(r9, r5);
        if (r11 > r3) goto L_0x00a9;
    L_0x0090:
        r10 = r10 << 28;
        r11 = r11 + 112;
        r10 = r10 + r11;
        r10 = r10 >> 30;
        if (r10 != 0) goto L_0x00a9;
    L_0x0099:
        r10 = r7 + r1;
        r5 = com.google.android.gms.internal.adp.m18935a(r9, r7);
        if (r5 > r3) goto L_0x00a9;
    L_0x00a1:
        r5 = r10 + r1;
        r10 = com.google.android.gms.internal.adp.m18935a(r9, r10);
        if (r10 <= r3) goto L_0x001f;
    L_0x00a9:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.adu.a(byte[], long, int):int");
    }

    /* renamed from: a */
    final int mo4215a(int i, byte[] bArr, int i2, int i3) {
        if (((i2 | i3) | (bArr.length - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
        long j = (long) i2;
        return m27058a(bArr, j, (int) (((long) i3) - j));
    }

    /* renamed from: a */
    final int mo4216a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        CharSequence charSequence2 = charSequence;
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        long j = (long) i3;
        long j2 = j + ((long) i4);
        int length = charSequence.length();
        if (length <= i4) {
            if (bArr2.length - i4 >= i3) {
                long j3;
                i3 = 0;
                while (i3 < length) {
                    char charAt = charSequence2.charAt(i3);
                    if (charAt >= '') {
                        break;
                    }
                    j3 = j + 1;
                    adp.m18942a(bArr2, j, (byte) charAt);
                    i3++;
                    j = j3;
                }
                if (i3 == length) {
                    return (int) j;
                }
                while (i3 < length) {
                    int charAt2 = charSequence2.charAt(i3);
                    if (charAt2 < ProfileEditingConfig.DEFAULT_MAX_LENGTH && j < j2) {
                        j3 = j + 1;
                    } else if (charAt2 < ItemAnimator.FLAG_MOVED && j <= j2 - 2) {
                        j3 = j + 1;
                        adp.m18942a(bArr2, j, (byte) ((charAt2 >>> 6) | 960));
                        j = j3 + 1;
                        adp.m18942a(bArr2, j3, (byte) ((charAt2 & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                        i3++;
                    } else if ((charAt2 < 55296 || 57343 < charAt2) && j <= j2 - 3) {
                        j3 = j + 1;
                        adp.m18942a(bArr2, j, (byte) ((charAt2 >>> 12) | 480));
                        j = j3 + 1;
                        adp.m18942a(bArr2, j3, (byte) (((charAt2 >>> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                        j3 = j + 1;
                        charAt2 = (charAt2 & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                    } else if (j <= j2 - 4) {
                        int i5 = i3 + 1;
                        if (i5 != length) {
                            char charAt3 = charSequence2.charAt(i5);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                i3 = Character.toCodePoint(charAt2, charAt3);
                                long j4 = j + 1;
                                adp.m18942a(bArr2, j, (byte) ((i3 >>> 18) | 240));
                                j = j4 + 1;
                                adp.m18942a(bArr2, j4, (byte) (((i3 >>> 12) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                                j4 = j + 1;
                                adp.m18942a(bArr2, j, (byte) (((i3 >>> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                                j = j4 + 1;
                                adp.m18942a(bArr2, j4, (byte) ((i3 & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                                i3 = i5;
                                i3++;
                            }
                        } else {
                            i5 = i3;
                        }
                        throw new zzfiv(i5 - 1, length);
                    } else {
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            int i6 = i3 + 1;
                            if (i6 == length || !Character.isSurrogatePair(charAt2, charSequence2.charAt(i6))) {
                                throw new zzfiv(i3, length);
                            }
                        }
                        StringBuilder stringBuilder = new StringBuilder(46);
                        stringBuilder.append("Failed writing ");
                        stringBuilder.append(charAt2);
                        stringBuilder.append(" at index ");
                        stringBuilder.append(j);
                        throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                    }
                    adp.m18942a(bArr2, j, (byte) charAt2);
                    j = j3;
                    i3++;
                }
                return (int) j;
            }
        }
        char charAt4 = charSequence2.charAt(length - 1);
        i3 += i4;
        StringBuilder stringBuilder2 = new StringBuilder(37);
        stringBuilder2.append("Failed writing ");
        stringBuilder2.append(charAt4);
        stringBuilder2.append(" at index ");
        stringBuilder2.append(i3);
        throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
    }
}
