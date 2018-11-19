package com.google.android.exoplayer2.source.hls;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.C2310s;

/* renamed from: com.google.android.exoplayer2.source.hls.e */
public final class C2208e {
    /* renamed from: a */
    private final SparseArray<C2310s> f6374a;

    /* renamed from: a */
    public C2310s m7890a(int i) {
        C2310s c2310s = (C2310s) this.f6374a.get(i);
        if (c2310s != null) {
            return c2310s;
        }
        c2310s = new C2310s(Format.OFFSET_SAMPLE_RELATIVE);
        this.f6374a.put(i, c2310s);
        return c2310s;
    }
}
