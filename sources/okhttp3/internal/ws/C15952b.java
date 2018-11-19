package okhttp3.internal.ws;

import com.facebook.ads.AdError;
import okio.C18549c.C15975a;

/* renamed from: okhttp3.internal.ws.b */
public final class C15952b {
    /* renamed from: a */
    static void m60446a(C15975a c15975a, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = c15975a.f49603d;
            int i2 = c15975a.f49604e;
            int i3 = c15975a.f49605f;
            while (i2 < i3) {
                i %= length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i]);
                i2++;
                i++;
            }
        } while (c15975a.m60606a() != -1);
    }

    /* renamed from: a */
    static String m60445a(int i) {
        StringBuilder stringBuilder;
        if (i >= AdError.NETWORK_ERROR_CODE) {
            if (i < 5000) {
                if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
                    return 0;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Code ");
                stringBuilder.append(i);
                stringBuilder.append(" is reserved and may not be used.");
                return stringBuilder.toString();
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Code must be in range [1000,5000): ");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    /* renamed from: b */
    static void m60447b(int i) {
        i = C15952b.m60445a(i);
        if (i != 0) {
            throw new IllegalArgumentException(i);
        }
    }
}
