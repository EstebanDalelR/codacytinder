package com.google.android.exoplayer2.extractor.p061b;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.C2302k;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.b.k */
final class C2069k {

    /* renamed from: com.google.android.exoplayer2.extractor.b.k$a */
    public static final class C2065a {
        /* renamed from: a */
        public final int f5682a;
        /* renamed from: b */
        public final int f5683b;
        /* renamed from: c */
        public final long[] f5684c;
        /* renamed from: d */
        public final int f5685d;
        /* renamed from: e */
        public final boolean f5686e;

        public C2065a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f5682a = i;
            this.f5683b = i2;
            this.f5684c = jArr;
            this.f5685d = i3;
            this.f5686e = z;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.b.k$b */
    public static final class C2066b {
        /* renamed from: a */
        public final String f5687a;
        /* renamed from: b */
        public final String[] f5688b;
        /* renamed from: c */
        public final int f5689c;

        public C2066b(String str, String[] strArr, int i) {
            this.f5687a = str;
            this.f5688b = strArr;
            this.f5689c = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.b.k$c */
    public static final class C2067c {
        /* renamed from: a */
        public final boolean f5690a;
        /* renamed from: b */
        public final int f5691b;
        /* renamed from: c */
        public final int f5692c;
        /* renamed from: d */
        public final int f5693d;

        public C2067c(boolean z, int i, int i2, int i3) {
            this.f5690a = z;
            this.f5691b = i;
            this.f5692c = i2;
            this.f5693d = i3;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.b.k$d */
    public static final class C2068d {
        /* renamed from: a */
        public final long f5694a;
        /* renamed from: b */
        public final int f5695b;
        /* renamed from: c */
        public final long f5696c;
        /* renamed from: d */
        public final int f5697d;
        /* renamed from: e */
        public final int f5698e;
        /* renamed from: f */
        public final int f5699f;
        /* renamed from: g */
        public final int f5700g;
        /* renamed from: h */
        public final int f5701h;
        /* renamed from: i */
        public final boolean f5702i;
        /* renamed from: j */
        public final byte[] f5703j;

        public C2068d(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.f5694a = j;
            this.f5695b = i;
            this.f5696c = j2;
            this.f5697d = i2;
            this.f5698e = i3;
            this.f5699f = i4;
            this.f5700g = i5;
            this.f5701h = i6;
            this.f5702i = z;
            this.f5703j = bArr;
        }
    }

    /* renamed from: a */
    public static int m7403a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: a */
    public static C2068d m7405a(C2302k c2302k) throws ParserException {
        C2302k c2302k2 = c2302k;
        C2069k.m7407a(1, c2302k2, false);
        long n = c2302k.m8402n();
        int g = c2302k.m8395g();
        long n2 = c2302k.m8402n();
        int p = c2302k.m8404p();
        int p2 = c2302k.m8404p();
        int p3 = c2302k.m8404p();
        int g2 = c2302k.m8395g();
        return new C2068d(n, g, n2, p, p2, p3, (int) Math.pow(2.0d, (double) (g2 & 15)), (int) Math.pow(2.0d, (double) ((g2 & 240) >> 4)), (c2302k.m8395g() & 1) > 0, Arrays.copyOf(c2302k2.f6929a, c2302k.m8387c()));
    }

    /* renamed from: b */
    public static C2066b m7410b(C2302k c2302k) throws ParserException {
        int i = 0;
        C2069k.m7407a(3, c2302k, false);
        String e = c2302k.m8392e((int) c2302k.m8402n());
        int length = 11 + e.length();
        long n = c2302k.m8402n();
        String[] strArr = new String[((int) n)];
        length += 4;
        while (((long) i) < n) {
            length += 4;
            strArr[i] = c2302k.m8392e((int) c2302k.m8402n());
            length += strArr[i].length();
            i++;
        }
        if ((c2302k.m8395g() & 1) != null) {
            return new C2066b(e, strArr, length + 1);
        }
        throw new ParserException("framing bit expected to be set");
    }

    /* renamed from: a */
    public static boolean m7407a(int i, C2302k c2302k, boolean z) throws ParserException {
        if (c2302k.m8385b() < 7) {
            if (z) {
                return false;
            }
            z = new StringBuilder();
            z.append("too short header: ");
            z.append(c2302k.m8385b());
            throw new ParserException(z.toString());
        } else if (c2302k.m8395g() == i) {
            if (c2302k.m8395g() == 118 && c2302k.m8395g() == 111 && c2302k.m8395g() == 114 && c2302k.m8395g() == 98 && c2302k.m8395g() == 105) {
                if (c2302k.m8395g() == 115) {
                    return true;
                }
            }
            if (z) {
                return false;
            }
            throw new ParserException("expected characters 'vorbis'");
        } else if (z) {
            return false;
        } else {
            z = new StringBuilder();
            z.append("expected header type ");
            z.append(Integer.toHexString(i));
            throw new ParserException(z.toString());
        }
    }

    /* renamed from: a */
    public static C2067c[] m7409a(C2302k c2302k, int i) throws ParserException {
        int i2 = 0;
        C2069k.m7407a(5, c2302k, false);
        int g = c2302k.m8395g() + 1;
        C2063i c2063i = new C2063i(c2302k.f6929a);
        c2063i.m7402b(c2302k.m8389d() * 8);
        for (c2302k = null; c2302k < g; c2302k++) {
            C2069k.m7413d(c2063i);
        }
        c2302k = c2063i.m7399a(6) + 1;
        while (i2 < c2302k) {
            if (c2063i.m7399a(16) != 0) {
                throw new ParserException("placeholder of time domain transforms not zeroed out");
            }
            i2++;
        }
        C2069k.m7412c(c2063i);
        C2069k.m7411b(c2063i);
        C2069k.m7406a(i, c2063i);
        c2302k = C2069k.m7408a(c2063i);
        if (c2063i.m7400a() != 0) {
            return c2302k;
        }
        throw new ParserException("framing bit after modes not set as expected");
    }

    /* renamed from: a */
    private static C2067c[] m7408a(C2063i c2063i) {
        int a = c2063i.m7399a(6) + 1;
        C2067c[] c2067cArr = new C2067c[a];
        for (int i = 0; i < a; i++) {
            c2067cArr[i] = new C2067c(c2063i.m7400a(), c2063i.m7399a(16), c2063i.m7399a(16), c2063i.m7399a(8));
        }
        return c2067cArr;
    }

    /* renamed from: a */
    private static void m7406a(int i, C2063i c2063i) throws ParserException {
        int a = c2063i.m7399a(6) + 1;
        for (int i2 = 0; i2 < a; i2++) {
            int a2 = c2063i.m7399a(16);
            if (a2 != 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("mapping type other than 0 not supported: ");
                stringBuilder.append(a2);
                Log.e("VorbisUtil", stringBuilder.toString());
            } else {
                int a3;
                a2 = c2063i.m7400a() ? c2063i.m7399a(4) + 1 : 1;
                if (c2063i.m7400a()) {
                    a3 = c2063i.m7399a(8) + 1;
                    for (int i3 = 0; i3 < a3; i3++) {
                        int i4 = i - 1;
                        c2063i.m7402b(C2069k.m7403a(i4));
                        c2063i.m7402b(C2069k.m7403a(i4));
                    }
                }
                if (c2063i.m7399a(2) != 0) {
                    throw new ParserException("to reserved bits must be zero after mapping coupling steps");
                }
                if (a2 > 1) {
                    for (a3 = 0; a3 < i; a3++) {
                        c2063i.m7402b(4);
                    }
                }
                for (int i5 = 0; i5 < a2; i5++) {
                    c2063i.m7402b(8);
                    c2063i.m7402b(8);
                    c2063i.m7402b(8);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m7411b(C2063i c2063i) throws ParserException {
        int a = c2063i.m7399a(6) + 1;
        for (int i = 0; i < a; i++) {
            if (c2063i.m7399a(16) > 2) {
                throw new ParserException("residueType greater than 2 is not decodable");
            }
            int i2;
            c2063i.m7402b(24);
            c2063i.m7402b(24);
            c2063i.m7402b(24);
            int a2 = c2063i.m7399a(6) + 1;
            c2063i.m7402b(8);
            int[] iArr = new int[a2];
            for (i2 = 0; i2 < a2; i2++) {
                iArr[i2] = ((c2063i.m7400a() ? c2063i.m7399a(5) : 0) * 8) + c2063i.m7399a(3);
            }
            for (i2 = 0; i2 < a2; i2++) {
                for (int i3 = 0; i3 < 8; i3++) {
                    if ((iArr[i2] & (1 << i3)) != 0) {
                        c2063i.m7402b(8);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private static void m7412c(C2063i c2063i) throws ParserException {
        int a = c2063i.m7399a(6) + 1;
        for (int i = 0; i < a; i++) {
            int a2 = c2063i.m7399a(16);
            int a3;
            switch (a2) {
                case 0:
                    c2063i.m7402b(8);
                    c2063i.m7402b(16);
                    c2063i.m7402b(16);
                    c2063i.m7402b(6);
                    c2063i.m7402b(8);
                    a3 = c2063i.m7399a(4) + 1;
                    for (a2 = 0; a2 < a3; a2++) {
                        c2063i.m7402b(8);
                    }
                    break;
                case 1:
                    int a4;
                    a3 = c2063i.m7399a(5);
                    int[] iArr = new int[a3];
                    int i2 = -1;
                    for (a2 = 0; a2 < a3; a2++) {
                        iArr[a2] = c2063i.m7399a(4);
                        if (iArr[a2] > i2) {
                            i2 = iArr[a2];
                        }
                    }
                    int[] iArr2 = new int[(i2 + 1)];
                    for (i2 = 0; i2 < iArr2.length; i2++) {
                        iArr2[i2] = c2063i.m7399a(3) + 1;
                        a4 = c2063i.m7399a(2);
                        if (a4 > 0) {
                            c2063i.m7402b(8);
                        }
                        for (int i3 = 0; i3 < (1 << a4); i3++) {
                            c2063i.m7402b(8);
                        }
                    }
                    c2063i.m7402b(2);
                    int a5 = c2063i.m7399a(4);
                    i2 = 0;
                    a4 = 0;
                    for (int i4 = 0; i4 < a3; i4++) {
                        i2 += iArr2[iArr[i4]];
                        while (a4 < i2) {
                            c2063i.m7402b(a5);
                            a4++;
                        }
                    }
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("floor type greater than 1 not decodable: ");
                    stringBuilder.append(a2);
                    throw new ParserException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: d */
    private static C2065a m7413d(C2063i c2063i) throws ParserException {
        if (c2063i.m7399a(24) != 5653314) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected code book to start with [0x56, 0x43, 0x42] at ");
            stringBuilder.append(c2063i.m7401b());
            throw new ParserException(stringBuilder.toString());
        }
        int i;
        int i2;
        int a = c2063i.m7399a(16);
        int a2 = c2063i.m7399a(24);
        long[] jArr = new long[a2];
        boolean a3 = c2063i.m7400a();
        long j = 0;
        if (a3) {
            int a4 = c2063i.m7399a(5) + 1;
            i = 0;
            while (i < jArr.length) {
                int a5 = c2063i.m7399a(C2069k.m7403a(a2 - i));
                int i3 = i;
                for (i = 0; i < a5 && i3 < jArr.length; i++) {
                    jArr[i3] = (long) a4;
                    i3++;
                }
                a4++;
                i = i3;
            }
        } else {
            boolean a6 = c2063i.m7400a();
            for (i2 = 0; i2 < jArr.length; i2++) {
                if (!a6) {
                    jArr[i2] = (long) (c2063i.m7399a(5) + 1);
                } else if (c2063i.m7400a()) {
                    jArr[i2] = (long) (c2063i.m7399a(5) + 1);
                } else {
                    jArr[i2] = 0;
                }
            }
        }
        i2 = c2063i.m7399a(4);
        if (i2 > 2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("lookup type greater than 2 not decodable: ");
            stringBuilder2.append(i2);
            throw new ParserException(stringBuilder2.toString());
        }
        if (i2 == 1 || i2 == 2) {
            c2063i.m7402b(32);
            c2063i.m7402b(32);
            i = c2063i.m7399a(4) + 1;
            c2063i.m7402b(1);
            if (i2 != 1) {
                j = (long) (a2 * a);
            } else if (a != 0) {
                j = C2069k.m7404a((long) a2, (long) a);
            }
            c2063i.m7402b((int) (j * ((long) i)));
        }
        return new C2065a(a, a2, jArr, i2, a3);
    }

    /* renamed from: a */
    private static long m7404a(long j, long j2) {
        return (long) Math.floor(Math.pow((double) j, 1.0d / ((double) j2)));
    }
}
