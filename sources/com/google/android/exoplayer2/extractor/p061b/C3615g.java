package com.google.android.exoplayer2.extractor.p061b;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.p061b.C2062h.C2061a;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.b.g */
final class C3615g extends C2062h {
    /* renamed from: a */
    private static final int f10930a = C2314v.m8499g("Opus");
    /* renamed from: b */
    private static final byte[] f10931b = new byte[]{(byte) 79, (byte) 112, (byte) 117, (byte) 115, (byte) 72, (byte) 101, (byte) 97, (byte) 100};
    /* renamed from: c */
    private boolean f10932c;

    C3615g() {
    }

    /* renamed from: a */
    public static boolean m13608a(C2302k c2302k) {
        if (c2302k.m8385b() < f10931b.length) {
            return false;
        }
        byte[] bArr = new byte[f10931b.length];
        c2302k.m8384a(bArr, 0, f10931b.length);
        return Arrays.equals(bArr, f10931b);
    }

    /* renamed from: a */
    protected void mo2253a(boolean z) {
        super.mo2253a(z);
        if (z) {
            this.f10932c = false;
        }
    }

    /* renamed from: b */
    protected long mo2255b(C2302k c2302k) {
        return m7395b(m13606a(c2302k.f6929a));
    }

    /* renamed from: a */
    protected boolean mo2254a(C2302k c2302k, long j, C2061a c2061a) throws IOException, InterruptedException {
        boolean z = true;
        if (this.f10932c == null) {
            c2302k = Arrays.copyOf(c2302k.f6929a, c2302k.m8387c());
            int i = c2302k[9] & 255;
            j = ((c2302k[11] & 255) << 8) | (c2302k[10] & 255);
            List arrayList = new ArrayList(3);
            arrayList.add(c2302k);
            m13607a(arrayList, j);
            m13607a(arrayList, 3840);
            c2061a.f5658a = Format.createAudioSampleFormat(null, "audio/opus", null, -1, -1, i, 48000, arrayList, null, 0, null);
            this.f10932c = true;
            return true;
        }
        if (c2302k.m8403o() != f10930a) {
            z = false;
        }
        c2302k.m8388c(0);
        return z;
    }

    /* renamed from: a */
    private void m13607a(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }

    /* renamed from: a */
    private long m13606a(byte[] bArr) {
        int i = bArr[0] & 255;
        switch (i & 3) {
            case 0:
                bArr = 1;
                break;
            case 1:
            case 2:
                bArr = 2;
                break;
            default:
                bArr = bArr[1] & 63;
                break;
        }
        i >>= 3;
        int i2 = i & 3;
        i = i >= 16 ? ManagerWebServices.FB_WEAR_TIMEOUT << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? ManagerWebServices.TIMEOUT_AUTH_MS : 10000 << i2;
        return (long) (bArr * i);
    }
}
