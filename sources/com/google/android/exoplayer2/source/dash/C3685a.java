package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.C2122i;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.C2134b;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.dash.p063a.C2196c;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.dash.a */
final class C3685a implements SampleStream {
    /* renamed from: a */
    private final Format f11443a;
    /* renamed from: b */
    private final C2134b f11444b = new C2134b();
    /* renamed from: c */
    private long[] f11445c;
    /* renamed from: d */
    private boolean f11446d;
    /* renamed from: e */
    private C2196c f11447e;
    /* renamed from: f */
    private boolean f11448f;
    /* renamed from: g */
    private int f11449g;
    /* renamed from: h */
    private long f11450h = -9223372036854775807L;

    public boolean isReady() {
        return true;
    }

    public void maybeThrowError() throws IOException {
    }

    C3685a(C2196c c2196c, Format format, boolean z) {
        this.f11443a = format;
        this.f11447e = c2196c;
        this.f11445c = c2196c.f6330b;
        m13960a(c2196c, z);
    }

    /* renamed from: a */
    void m13960a(C2196c c2196c, boolean z) {
        long j = this.f11449g == 0 ? -9223372036854775807L : this.f11445c[this.f11449g - 1];
        this.f11446d = z;
        this.f11447e = c2196c;
        this.f11445c = c2196c.f6330b;
        if (this.f11450h != -9223372036854775807) {
            m13959a(this.f11450h);
        } else if (j != -9223372036854775807L) {
            this.f11449g = C2314v.m8484b(this.f11445c, j, false, false);
        }
    }

    public int readData(C2122i c2122i, DecoderInputBuffer decoderInputBuffer, boolean z) {
        if (!z) {
            if (this.f11448f) {
                if (this.f11449g != this.f11445c.length) {
                    c2122i = this.f11449g;
                    this.f11449g = c2122i + 1;
                    z = this.f11444b.m7687a(this.f11447e.f6329a[c2122i], this.f11447e.f6331c);
                    if (!z) {
                        return -3;
                    }
                    decoderInputBuffer.m13518e(z.length);
                    decoderInputBuffer.m7340a(1);
                    decoderInputBuffer.f10830b.put(z);
                    decoderInputBuffer.f10831c = this.f11445c[c2122i];
                    return -4;
                } else if (this.f11446d != null) {
                    return -3;
                } else {
                    decoderInputBuffer.m7340a(4);
                    return -4;
                }
            }
        }
        c2122i.f6062a = this.f11443a;
        this.f11448f = true;
        return -5;
    }

    public int skipData(long j) {
        j = Math.max(this.f11449g, C2314v.m8484b(this.f11445c, j, true, false));
        int i = j - this.f11449g;
        this.f11449g = j;
        return i;
    }

    /* renamed from: a */
    public void m13959a(long j) {
        boolean z = false;
        this.f11449g = C2314v.m8484b(this.f11445c, j, true, false);
        if (this.f11446d && this.f11449g == this.f11445c.length) {
            z = true;
        }
        if (!z) {
            j = -9223372036854775807L;
        }
        this.f11450h = j;
    }
}
