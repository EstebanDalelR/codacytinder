package com.google.android.m4b.maps.ap;

import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.google.android.m4b.maps.ap.g */
public final class C4660g {
    /* renamed from: a */
    public static byte[] m20788a(String str) {
        byte[] bArr = new byte[C4660g.m20786a(str, null, 0)];
        C4660g.m20786a(str, bArr, 0);
        return bArr;
    }

    /* renamed from: a */
    public static int m20786a(String str, byte[] bArr, int i) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int charAt = str.charAt(i2);
            if (charAt >= 55296 && charAt <= 57343) {
                int i3 = i2 + 1;
                if (i3 < length) {
                    int charAt2 = str.charAt(i3);
                    int i4 = charAt2 & 64512;
                    if (((64512 & charAt) ^ i4) == 1024) {
                        if (i4 == 55296) {
                            int i5 = charAt2;
                            charAt2 = charAt;
                            charAt = i5;
                        }
                        charAt = 65536 + (((charAt & 1023) << 10) | (charAt2 & 1023));
                        i2 = i3;
                    }
                }
            }
            if (charAt <= 127) {
                if (bArr != null) {
                    bArr[i] = (byte) charAt;
                }
                i++;
            } else if (charAt <= 2047) {
                if (bArr != null) {
                    bArr[i] = (byte) ((charAt >> 6) | 192);
                    bArr[i + 1] = (byte) ((charAt & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                }
                i += 2;
            } else if (charAt <= 65535) {
                if (bArr != null) {
                    bArr[i] = (byte) ((charAt >> 12) | 224);
                    bArr[i + 1] = (byte) (((charAt >> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                    bArr[i + 2] = (byte) ((charAt & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                }
                i += 3;
            } else {
                if (bArr != null) {
                    bArr[i] = (byte) ((charAt >> 18) | 240);
                    bArr[i + 1] = (byte) (((charAt >> 12) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                    bArr[i + 2] = (byte) (((charAt >> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                    bArr[i + 3] = (byte) ((charAt & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                }
                i += 4;
            }
            i2++;
        }
        return i;
    }

    /* renamed from: a */
    public static String m20787a(byte[] bArr, int i, int i2, boolean z) {
        i = new StringBuilder(i2 + 0);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            i3 = bArr[i3] & 255;
            if (i3 <= 127) {
                i.append((char) i3);
            } else if (i3 >= 245) {
                i.append((char) i3);
            } else {
                int i5 = 224;
                int i6 = 31;
                int i7 = 1;
                while (i3 >= i5) {
                    i5 = (i5 >> 1) | ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                    i7++;
                    i6 >>= 1;
                }
                i5 = i4;
                i4 = i3 & i6;
                for (i3 = 0; i3 < i7; i3++) {
                    i4 <<= 6;
                    if (i5 < i2) {
                        i4 |= bArr[i5] & 63;
                        i5++;
                    }
                }
                if (i4 < 55296 || i4 > 57343) {
                    if (i4 <= 65535) {
                        i.append((char) i4);
                    } else {
                        i4 -= 65536;
                        i.append((char) (55296 | (i4 >> 10)));
                        i.append((char) (56320 | (i4 & 1023)));
                    }
                    i3 = i5;
                } else {
                    throw new IllegalArgumentException("Invalid UTF8");
                }
            }
            i3 = i4;
        }
        return i.toString();
    }
}
