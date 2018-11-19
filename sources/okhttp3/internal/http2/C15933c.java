package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.C15908c;
import okio.ByteString;

/* renamed from: okhttp3.internal.http2.c */
public final class C15933c {
    /* renamed from: a */
    static final ByteString f49388a = ByteString.m60580a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    /* renamed from: b */
    static final String[] f49389b = new String[64];
    /* renamed from: c */
    static final String[] f49390c = new String[256];
    /* renamed from: d */
    private static final String[] f49391d = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    static {
        int i = 0;
        for (int i2 = 0; i2 < f49390c.length; i2++) {
            f49390c[i2] = C15908c.m60157a("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
        }
        f49389b[0] = "";
        f49389b[1] = "END_STREAM";
        int[] iArr = new int[]{1};
        f49389b[8] = "PADDED";
        for (int i3 : iArr) {
            String[] strArr = f49389b;
            int i4 = i3 | 8;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(f49389b[i3]);
            stringBuilder.append("|PADDED");
            strArr[i4] = stringBuilder.toString();
        }
        f49389b[4] = "END_HEADERS";
        f49389b[32] = "PRIORITY";
        f49389b[36] = "END_HEADERS|PRIORITY";
        for (int i32 : new int[]{4, 32, 36}) {
            for (int i5 : iArr) {
                String[] strArr2 = f49389b;
                int i6 = i5 | i32;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(f49389b[i5]);
                stringBuilder2.append('|');
                stringBuilder2.append(f49389b[i32]);
                strArr2[i6] = stringBuilder2.toString();
                strArr2 = f49389b;
                i6 |= 8;
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(f49389b[i5]);
                stringBuilder2.append('|');
                stringBuilder2.append(f49389b[i32]);
                stringBuilder2.append("|PADDED");
                strArr2[i6] = stringBuilder2.toString();
            }
        }
        while (i < f49389b.length) {
            if (f49389b[i] == null) {
                f49389b[i] = f49390c[i];
            }
            i++;
        }
    }

    private C15933c() {
    }

    /* renamed from: a */
    static IllegalArgumentException m60311a(String str, Object... objArr) {
        throw new IllegalArgumentException(C15908c.m60157a(str, objArr));
    }

    /* renamed from: b */
    static IOException m60314b(String str, Object... objArr) throws IOException {
        throw new IOException(C15908c.m60157a(str, objArr));
    }

    /* renamed from: a */
    static String m60313a(boolean z, int i, int i2, byte b, byte b2) {
        String a = b < f49391d.length ? f49391d[b] : C15908c.m60157a("0x%02x", Byte.valueOf(b));
        b = C15933c.m60312a(b, b2);
        String str = "%s 0x%08x %5d %-13s %s";
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[true] = Integer.valueOf(i2);
        objArr[true] = a;
        objArr[true] = b;
        return C15908c.m60157a(str, objArr);
    }

    /* renamed from: a */
    static String m60312a(byte b, byte b2) {
        if (b2 == (byte) 0) {
            return "";
        }
        switch (b) {
            case (byte) 2:
            case (byte) 3:
            case (byte) 7:
            case (byte) 8:
                return f49390c[b2];
            case (byte) 4:
            case (byte) 6:
                return b2 == (byte) 1 ? "ACK" : f49390c[b2];
            default:
                String str;
                if (b2 < f49389b.length) {
                    str = f49389b[b2];
                } else {
                    str = f49390c[b2];
                }
                if (b != (byte) 5 || (b2 & 4) == 0) {
                    return (b != (byte) 0 || (b2 & 32) == (byte) 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                } else {
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
        }
    }
}
