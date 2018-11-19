package okio;

import java.nio.charset.Charset;

/* renamed from: okio.r */
final class C15983r {
    /* renamed from: a */
    public static final Charset f49624a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static int m60638a(int i) {
        return ((i & 255) << 24) | ((((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8)) | ((65280 & i) << 8));
    }

    /* renamed from: a */
    public static long m60639a(long j) {
        return ((((((((j & -72057594037927936L) >>> 56) | ((j & 71776119061217280L) >>> 40)) | ((j & 280375465082880L) >>> 24)) | ((j & 1095216660480L) >>> 8)) | ((j & 4278190080L) << 8)) | ((j & 16711680) << 24)) | ((j & 65280) << 40)) | ((j & 255) << 56);
    }

    /* renamed from: a */
    public static short m60640a(short s) {
        int i = s & 65535;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    /* renamed from: a */
    public static void m60641a(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j) {
            if (j - j2 >= j3) {
                return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
    }

    /* renamed from: a */
    public static void m60642a(Throwable th) {
        C15983r.m60644b(th);
    }

    /* renamed from: b */
    private static <T extends Throwable> void m60644b(Throwable th) throws Throwable {
        throw th;
    }

    /* renamed from: a */
    public static boolean m60643a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return 1;
    }
}
