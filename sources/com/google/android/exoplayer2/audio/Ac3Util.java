package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.C2301j;
import com.google.android.exoplayer2.util.C2302k;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

public final class Ac3Util {
    /* renamed from: a */
    private static final int[] f5491a = new int[]{1, 2, 3, 6};
    /* renamed from: b */
    private static final int[] f5492b = new int[]{48000, 44100, 32000};
    /* renamed from: c */
    private static final int[] f5493c = new int[]{24000, 22050, 16000};
    /* renamed from: d */
    private static final int[] f5494d = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
    /* renamed from: e */
    private static final int[] f5495e = new int[]{32, 40, 48, 56, 64, 80, 96, 112, ProfileEditingConfig.DEFAULT_MAX_LENGTH, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    /* renamed from: f */
    private static final int[] f5496f = new int[]{69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class SyncFrameInfo {
        /* renamed from: a */
        public final String f5485a;
        /* renamed from: b */
        public final int f5486b;
        /* renamed from: c */
        public final int f5487c;
        /* renamed from: d */
        public final int f5488d;
        /* renamed from: e */
        public final int f5489e;
        /* renamed from: f */
        public final int f5490f;

        @Retention(RetentionPolicy.SOURCE)
        public @interface StreamType {
        }

        private SyncFrameInfo(String str, int i, int i2, int i3, int i4, int i5) {
            this.f5485a = str;
            this.f5486b = i;
            this.f5488d = i2;
            this.f5487c = i3;
            this.f5489e = i4;
            this.f5490f = i5;
        }
    }

    /* renamed from: a */
    public static int m7253a() {
        return 1536;
    }

    /* renamed from: a */
    public static Format m7258a(C2302k c2302k, String str, String str2, DrmInitData drmInitData) {
        int i = f5492b[(c2302k.m8395g() & 192) >> 6];
        int g = c2302k.m8395g();
        int i2 = f5494d[(g & 56) >> 3];
        if ((g & 4) != 0) {
            i2++;
        }
        return Format.createAudioSampleFormat(str, "audio/ac3", null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    /* renamed from: b */
    public static Format m7262b(C2302k c2302k, String str, String str2, DrmInitData drmInitData) {
        C2302k c2302k2 = c2302k;
        c2302k2.m8390d(2);
        int i = f5492b[(c2302k2.m8395g() & 192) >> 6];
        int g = c2302k2.m8395g();
        int i2 = f5494d[(g & 14) >> 1];
        if ((g & 1) != 0) {
            i2++;
        }
        if (((c2302k2.m8395g() & 30) >> 1) > 0 && (2 & c2302k2.m8395g()) != 0) {
            i2 += 2;
        }
        int i3 = i2;
        String str3 = "audio/eac3";
        if (c2302k2.m8385b() > 0 && (c2302k2.m8395g() & 1) != 0) {
            str3 = "audio/eac3-joc";
        }
        return Format.createAudioSampleFormat(str, str3, null, -1, -1, i3, i, null, drmInitData, 0, str2);
    }

    /* renamed from: a */
    public static SyncFrameInfo m7259a(C2301j c2301j) {
        int c;
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        C2301j c2301j2 = c2301j;
        int b = c2301j.m8369b();
        c2301j2.m8370b(40);
        Object obj = c2301j2.m8373c(5) == 16 ? 1 : null;
        c2301j2.m8364a(b);
        b = -1;
        int c2;
        int c3;
        int c4;
        String str2;
        if (obj != null) {
            int i5;
            int i6;
            int i7;
            c2301j2.m8370b(16);
            switch (c2301j2.m8373c(2)) {
                case 0:
                    b = 0;
                    break;
                case 1:
                    b = 1;
                    break;
                case 2:
                    b = 2;
                    break;
                default:
                    break;
            }
            c2301j2.m8370b(3);
            c2 = (c2301j2.m8373c(11) + 1) * 2;
            c = c2301j2.m8373c(2);
            if (c == 3) {
                i5 = f5493c[c2301j2.m8373c(2)];
                i6 = 3;
                i7 = 6;
            } else {
                i6 = c2301j2.m8373c(2);
                i7 = f5491a[i6];
                i5 = f5492b[c];
            }
            int i8 = i7 * 256;
            c3 = c2301j2.m8373c(3);
            boolean e = c2301j.m8376e();
            int i9 = f5494d[c3] + e;
            c2301j2.m8370b(10);
            if (c2301j.m8376e()) {
                c2301j2.m8370b(8);
            }
            if (c3 == 0) {
                c2301j2.m8370b(5);
                if (c2301j.m8376e()) {
                    c2301j2.m8370b(8);
                }
            }
            if (b == 1 && c2301j.m8376e()) {
                c2301j2.m8370b(16);
            }
            if (c2301j.m8376e()) {
                if (c3 > 2) {
                    c2301j2.m8370b(2);
                }
                if ((c3 & 1) != 0 && c3 > 2) {
                    c2301j2.m8370b(6);
                }
                if ((c3 & 4) != 0) {
                    c2301j2.m8370b(6);
                }
                if (e && c2301j.m8376e()) {
                    c2301j2.m8370b(5);
                }
                if (b == 0) {
                    if (c2301j.m8376e()) {
                        c2301j2.m8370b(6);
                    }
                    if (c3 == 0 && c2301j.m8376e()) {
                        c2301j2.m8370b(6);
                    }
                    if (c2301j.m8376e()) {
                        c2301j2.m8370b(6);
                    }
                    c4 = c2301j2.m8373c(2);
                    if (c4 == 1) {
                        c2301j2.m8370b(5);
                    } else if (c4 == 2) {
                        c2301j2.m8370b(12);
                    } else if (c4 == 3) {
                        c4 = c2301j2.m8373c(5);
                        if (c2301j.m8376e()) {
                            c2301j2.m8370b(5);
                            if (c2301j.m8376e()) {
                                c2301j2.m8370b(4);
                            }
                            if (c2301j.m8376e()) {
                                c2301j2.m8370b(4);
                            }
                            if (c2301j.m8376e()) {
                                c2301j2.m8370b(4);
                            }
                            if (c2301j.m8376e()) {
                                c2301j2.m8370b(4);
                            }
                            if (c2301j.m8376e()) {
                                c2301j2.m8370b(4);
                            }
                            if (c2301j.m8376e()) {
                                c2301j2.m8370b(4);
                            }
                            if (c2301j.m8376e()) {
                                c2301j2.m8370b(4);
                            }
                            if (c2301j.m8376e()) {
                                if (c2301j.m8376e()) {
                                    c2301j2.m8370b(4);
                                }
                                if (c2301j.m8376e()) {
                                    c2301j2.m8370b(4);
                                }
                            }
                        }
                        if (c2301j.m8376e()) {
                            c2301j2.m8370b(5);
                            if (c2301j.m8376e()) {
                                c2301j2.m8370b(7);
                                if (c2301j.m8376e()) {
                                    c2301j2.m8370b(8);
                                }
                            }
                        }
                        c2301j2.m8370b((c4 + 2) * 8);
                        c2301j.m8377f();
                    }
                    if (c3 < 2) {
                        if (c2301j.m8376e()) {
                            c2301j2.m8370b(14);
                        }
                        if (c3 == 0 && c2301j.m8376e()) {
                            c2301j2.m8370b(14);
                        }
                    }
                    if (c2301j.m8376e()) {
                        if (i6 == 0) {
                            c2301j2.m8370b(5);
                        } else {
                            for (c4 = 0; c4 < i7; c4++) {
                                if (c2301j.m8376e()) {
                                    c2301j2.m8370b(5);
                                }
                            }
                        }
                    }
                }
            }
            int i10;
            if (c2301j.m8376e()) {
                c2301j2.m8370b(5);
                if (c3 == 2) {
                    c2301j2.m8370b(4);
                }
                if (c3 >= 6) {
                    c2301j2.m8370b(2);
                }
                if (c2301j.m8376e()) {
                    c2301j2.m8370b(8);
                }
                if (c3 == 0 && c2301j.m8376e()) {
                    c2301j2.m8370b(8);
                }
                i10 = 3;
                if (c < 3) {
                    c2301j.m8374d();
                }
            } else {
                i10 = 3;
            }
            if (b == 0 && i6 != r2) {
                c2301j.m8374d();
            }
            if (b == 2 && (i6 == r2 || c2301j.m8376e())) {
                c2301j2.m8370b(6);
            }
            str2 = "audio/eac3";
            if (c2301j.m8376e() && c2301j2.m8373c(6) == 1 && c2301j2.m8373c(8) == 1) {
                str2 = "audio/eac3-joc";
            }
            i = b;
            str = str2;
            i2 = c2;
            i3 = i5;
            c = i8;
            i4 = i9;
        } else {
            str2 = "audio/ac3";
            c2301j2.m8370b(32);
            c2 = c2301j2.m8373c(2);
            c3 = m7254a(c2, c2301j2.m8373c(6));
            c2301j2.m8370b(8);
            c4 = c2301j2.m8373c(3);
            if (!((c4 & 1) == 0 || c4 == 1)) {
                c2301j2.m8370b(2);
            }
            if ((c4 & 4) != 0) {
                c2301j2.m8370b(2);
            }
            if (c4 == 2) {
                c2301j2.m8370b(2);
            }
            str = str2;
            i2 = c3;
            i3 = f5492b[c2];
            i4 = f5494d[c4] + c2301j.m8376e();
            i = -1;
            c = 1536;
        }
        return new SyncFrameInfo(str, i, i4, i3, i2, c);
    }

    /* renamed from: a */
    public static int m7257a(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        return m7254a((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    /* renamed from: a */
    public static int m7255a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f5491a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    /* renamed from: b */
    public static int m7260b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((byteBuffer.getInt(i + 4) & -16777217) == -1167101192) {
                return i - position;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m7261b(byte[] bArr) {
        int i = 0;
        if (bArr[4] == (byte) -8 && bArr[5] == (byte) 114 && bArr[6] == (byte) 111) {
            if ((bArr[7] & 254) == 186) {
                if ((bArr[7] & 255) == 187) {
                    i = 1;
                }
                return 40 << ((bArr[i != 0 ? 9 : 8] >> 4) & 7);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m7256a(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + (((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 1 : null) != null ? 9 : 8)) >> 4) & 7);
    }

    /* renamed from: a */
    private static int m7254a(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0 && i < f5492b.length && i2 >= 0) {
            if (i3 < f5496f.length) {
                i = f5492b[i];
                if (i == 44100) {
                    return (f5496f[i3] + (i2 % 2)) * 2;
                }
                i2 = f5495e[i3];
                return i == 32000 ? i2 * 6 : i2 * 4;
            }
        }
        return -1;
    }
}
