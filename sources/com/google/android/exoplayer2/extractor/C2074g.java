package com.google.android.exoplayer2.extractor;

import com.facebook.ads.AdError;
import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.google.android.exoplayer2.extractor.g */
public final class C2074g {
    /* renamed from: h */
    private static final String[] f5712h = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    /* renamed from: i */
    private static final int[] f5713i = new int[]{44100, 48000, 32000};
    /* renamed from: j */
    private static final int[] f5714j = new int[]{32, 64, 96, ProfileEditingConfig.DEFAULT_MAX_LENGTH, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};
    /* renamed from: k */
    private static final int[] f5715k = new int[]{32, 48, 56, 64, 80, 96, 112, ProfileEditingConfig.DEFAULT_MAX_LENGTH, 144, 160, 176, 192, 224, 256};
    /* renamed from: l */
    private static final int[] f5716l = new int[]{32, 48, 56, 64, 80, 96, 112, ProfileEditingConfig.DEFAULT_MAX_LENGTH, 160, 192, 224, 256, 320, 384};
    /* renamed from: m */
    private static final int[] f5717m = new int[]{32, 40, 48, 56, 64, 80, 96, 112, ProfileEditingConfig.DEFAULT_MAX_LENGTH, 160, 192, 224, 256, 320};
    /* renamed from: n */
    private static final int[] f5718n = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, ProfileEditingConfig.DEFAULT_MAX_LENGTH, 144, 160};
    /* renamed from: a */
    public int f5719a;
    /* renamed from: b */
    public String f5720b;
    /* renamed from: c */
    public int f5721c;
    /* renamed from: d */
    public int f5722d;
    /* renamed from: e */
    public int f5723e;
    /* renamed from: f */
    public int f5724f;
    /* renamed from: g */
    public int f5725g;

    /* renamed from: a */
    public static int m7425a(int i) {
        if ((i & -2097152) != -2097152) {
            return -1;
        }
        int i2 = (i >>> 19) & 3;
        if (i2 == 1) {
            return -1;
        }
        int i3 = (i >>> 17) & 3;
        if (i3 == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        if (i4 != 0) {
            if (i4 != 15) {
                int i5 = (i >>> 10) & 3;
                if (i5 == 3) {
                    return -1;
                }
                int i6 = f5713i[i5];
                if (i2 == 2) {
                    i6 /= 2;
                } else if (i2 == 0) {
                    i6 /= 4;
                }
                i = (i >>> 9) & 1;
                if (i3 == 3) {
                    return ((((i2 == 3 ? f5714j[i4 - 1] : f5715k[i4 - 1]) * 12000) / i6) + i) * 4;
                }
                i4 = i2 == 3 ? i3 == 2 ? f5716l[i4 - 1] : f5717m[i4 - 1] : f5718n[i4 - 1];
                i5 = 144000;
                if (i2 == 3) {
                    return ((i4 * 144000) / i6) + i;
                }
                if (i3 == 1) {
                    i5 = 72000;
                }
                return ((i5 * i4) / i6) + i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m7427a(int i, C2074g c2074g) {
        if ((i & -2097152) != -2097152) {
            return false;
        }
        int i2 = (i >>> 19) & 3;
        if (i2 == 1) {
            return false;
        }
        int i3 = (i >>> 17) & 3;
        if (i3 == 0) {
            return false;
        }
        int i4 = (i >>> 12) & 15;
        if (i4 != 0) {
            if (i4 != 15) {
                int i5 = (i >>> 10) & 3;
                if (i5 == 3) {
                    return false;
                }
                int i6;
                int i7;
                int i8 = f5713i[i5];
                if (i2 == 2) {
                    i8 /= 2;
                } else if (i2 == 0) {
                    i8 /= 4;
                }
                int i9 = i8;
                i8 = (i >>> 9) & 1;
                int i10 = 1152;
                if (i3 == 3) {
                    i4 = i2 == 3 ? f5714j[i4 - 1] : f5715k[i4 - 1];
                    i6 = (((i4 * 12000) / i9) + i8) * 4;
                    i7 = 384;
                } else {
                    i6 = 144000;
                    if (i2 == 3) {
                        i4 = i3 == 2 ? f5716l[i4 - 1] : f5717m[i4 - 1];
                        i6 = ((144000 * i4) / i9) + i8;
                        i7 = 1152;
                    } else {
                        i4 = f5718n[i4 - 1];
                        if (i3 == 1) {
                            i10 = 576;
                        }
                        if (i3 == 1) {
                            i6 = 72000;
                        }
                        i6 = ((i6 * i4) / i9) + i8;
                        i7 = i10;
                    }
                }
                c2074g.m7426a(i2, f5712h[3 - i3], i6, i9, ((i >> 6) & 3) == 3 ? 1 : 2, i4 * AdError.NETWORK_ERROR_CODE, i7);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m7426a(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.f5719a = i;
        this.f5720b = str;
        this.f5721c = i2;
        this.f5722d = i3;
        this.f5723e = i4;
        this.f5724f = i5;
        this.f5725g = i6;
    }
}
