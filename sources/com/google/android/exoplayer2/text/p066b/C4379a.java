package com.google.android.exoplayer2.text.p066b;

import com.google.android.exoplayer2.text.C4258a;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.C2302k;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.b.a */
public final class C4379a extends C4258a {
    /* renamed from: a */
    private final C2232b f14511a;

    /* renamed from: a */
    protected /* synthetic */ Subtitle mo3740a(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        return m18089b(bArr, i, z);
    }

    public C4379a(List<byte[]> list) {
        super("DvbDecoder");
        C2302k c2302k = new C2302k((byte[]) list.get(0));
        this.f14511a = new C2232b(c2302k.m8396h(), c2302k.m8396h());
    }

    /* renamed from: b */
    protected C3703c m18089b(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f14511a.m7978a();
        }
        return new C3703c(this.f14511a.m7977a(bArr, i));
    }
}
