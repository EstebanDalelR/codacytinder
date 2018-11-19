package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.C2154o;
import com.google.android.exoplayer2.util.C2314v;

/* renamed from: com.google.android.exoplayer2.trackselection.f */
public final class C2256f {
    /* renamed from: a */
    public final int f6688a;
    /* renamed from: b */
    public final C2154o[] f6689b;
    /* renamed from: c */
    public final C2255e f6690c;
    /* renamed from: d */
    public final Object f6691d;

    public C2256f(C2154o[] c2154oArr, TrackSelection[] trackSelectionArr, Object obj) {
        this.f6689b = c2154oArr;
        this.f6690c = new C2255e(trackSelectionArr);
        this.f6691d = obj;
        this.f6688a = c2154oArr.length;
    }

    /* renamed from: a */
    public boolean m8125a(int i) {
        return this.f6689b[i] != 0;
    }

    /* renamed from: a */
    public boolean m8126a(C2256f c2256f) {
        if (c2256f != null) {
            if (c2256f.f6690c.f6685a == this.f6690c.f6685a) {
                for (int i = 0; i < this.f6690c.f6685a; i++) {
                    if (!m8127a(c2256f, i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m8127a(C2256f c2256f, int i) {
        boolean z = false;
        if (c2256f == null) {
            return false;
        }
        if (C2314v.m8480a(this.f6689b[i], c2256f.f6689b[i]) && C2314v.m8480a(this.f6690c.m8123a(i), c2256f.f6690c.m8123a(i)) != null) {
            z = true;
        }
        return z;
    }
}
