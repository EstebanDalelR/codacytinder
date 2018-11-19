package com.google.android.exoplayer2.extractor.mp4;

import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.exoplayer2.util.C2302k;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.f */
public final class C2099f {

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.f$a */
    private static class C2098a {
        /* renamed from: a */
        private final UUID f5929a;
        /* renamed from: b */
        private final int f5930b;
        /* renamed from: c */
        private final byte[] f5931c;

        public C2098a(UUID uuid, int i, byte[] bArr) {
            this.f5929a = uuid;
            this.f5930b = i;
            this.f5931c = bArr;
        }
    }

    @Nullable
    /* renamed from: a */
    public static UUID m7516a(byte[] bArr) {
        bArr = C2099f.m7519c(bArr);
        if (bArr == null) {
            return null;
        }
        return bArr.f5929a;
    }

    /* renamed from: b */
    public static int m7518b(byte[] bArr) {
        bArr = C2099f.m7519c(bArr);
        if (bArr == null) {
            return -1;
        }
        return bArr.f5930b;
    }

    @Nullable
    /* renamed from: a */
    public static byte[] m7517a(byte[] bArr, UUID uuid) {
        bArr = C2099f.m7519c(bArr);
        if (bArr == null) {
            return null;
        }
        if (uuid == null || uuid.equals(bArr.f5929a)) {
            return bArr.f5931c;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UUID mismatch. Expected: ");
        stringBuilder.append(uuid);
        stringBuilder.append(", got: ");
        stringBuilder.append(bArr.f5929a);
        stringBuilder.append(".");
        Log.w("PsshAtomUtil", stringBuilder.toString());
        return null;
    }

    @Nullable
    /* renamed from: c */
    private static C2098a m7519c(byte[] bArr) {
        C2302k c2302k = new C2302k(bArr);
        if (c2302k.m8387c() < 32) {
            return null;
        }
        c2302k.m8388c(0);
        if (c2302k.m8403o() != c2302k.m8385b() + 4 || c2302k.m8403o() != C2087a.f5834U) {
            return null;
        }
        int a = C2087a.m7470a(c2302k.m8403o());
        if (a > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported pssh version: ");
            stringBuilder.append(a);
            Log.w("PsshAtomUtil", stringBuilder.toString());
            return null;
        }
        UUID uuid = new UUID(c2302k.m8405q(), c2302k.m8405q());
        if (a == 1) {
            c2302k.m8390d(c2302k.m8409u() * 16);
        }
        int u = c2302k.m8409u();
        if (u != c2302k.m8385b()) {
            return null;
        }
        byte[] bArr2 = new byte[u];
        c2302k.m8384a(bArr2, 0, u);
        return new C2098a(uuid, a, bArr2);
    }
}
