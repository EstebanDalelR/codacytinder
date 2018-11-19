package com.google.android.exoplayer2.util;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.tinder.domain.config.model.ProfileEditingConfig;
import io.fabric.sdk.android.services.events.C15645a;

/* renamed from: com.google.android.exoplayer2.util.c */
public final class C2292c {
    /* renamed from: a */
    private static final byte[] f6890a = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};
    /* renamed from: b */
    private static final int[] f6891b = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, C15645a.MAX_BYTE_SIZE_PER_FILE, 7350};
    /* renamed from: c */
    private static final int[] f6892c = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair<Integer, Integer> m8322a(byte[] bArr) throws ParserException {
        return C2292c.m8321a(new C2301j(bArr), null);
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m8321a(C2301j c2301j, boolean z) throws ParserException {
        int a = C2292c.m8320a(c2301j);
        int b = C2292c.m8326b(c2301j);
        int c = c2301j.m8373c(4);
        if (a == true || a == true) {
            b = C2292c.m8326b(c2301j);
            a = C2292c.m8320a(c2301j);
            if (a == true) {
                c = c2301j.m8373c(4);
            }
        }
        if (z) {
            if (a != true) {
                switch (a) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        break;
                    default:
                        switch (a) {
                            case 6:
                            case 7:
                                break;
                            default:
                                switch (a) {
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                        break;
                                    default:
                                        z = new StringBuilder();
                                        z.append("Unsupported audio object type: ");
                                        z.append(a);
                                        throw new ParserException(z.toString());
                                }
                        }
                }
            }
            C2292c.m8323a(c2301j, a, c);
            switch (a) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    c2301j = c2301j.m8373c(2);
                    if (c2301j == 2 || c2301j == true) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unsupported epConfig: ");
                        stringBuilder.append(c2301j);
                        throw new ParserException(stringBuilder.toString());
                    }
                default:
                    break;
            }
        }
        c2301j = f6892c[c];
        C2289a.m8311a(c2301j != true);
        return Pair.create(Integer.valueOf(b), Integer.valueOf(c2301j));
    }

    /* renamed from: a */
    public static byte[] m8324a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & ProfileEditingConfig.DEFAULT_MAX_LENGTH) | ((i3 << 3) & 120))};
    }

    /* renamed from: a */
    public static byte[] m8325a(byte[] bArr, int i, int i2) {
        Object obj = new byte[(f6890a.length + i2)];
        System.arraycopy(f6890a, 0, obj, 0, f6890a.length);
        System.arraycopy(bArr, i, obj, f6890a.length, i2);
        return obj;
    }

    /* renamed from: a */
    private static int m8320a(C2301j c2301j) {
        int c = c2301j.m8373c(5);
        return c == 31 ? c2301j.m8373c(6) + 32 : c;
    }

    /* renamed from: b */
    private static int m8326b(C2301j c2301j) {
        int c = c2301j.m8373c(4);
        if (c == 15) {
            return c2301j.m8373c(24);
        }
        C2289a.m8311a(c < 13 ? true : null);
        return f6891b[c];
    }

    /* renamed from: a */
    private static void m8323a(C2301j c2301j, int i, int i2) {
        c2301j.m8370b(1);
        if (c2301j.m8376e()) {
            c2301j.m8370b(14);
        }
        boolean e = c2301j.m8376e();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            c2301j.m8370b(3);
        }
        if (e) {
            if (i == 22) {
                c2301j.m8370b(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                c2301j.m8370b(3);
            }
            c2301j.m8370b(1);
        }
    }
}
