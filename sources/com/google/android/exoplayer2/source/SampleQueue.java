package com.google.android.exoplayer2.source;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.C2122i;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput.C2055a;
import com.google.android.exoplayer2.source.C2213k.C2212a;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.C2278a;
import com.google.android.exoplayer2.util.C2302k;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class SampleQueue implements TrackOutput {
    /* renamed from: a */
    private final Allocator f11341a;
    /* renamed from: b */
    private final int f11342b;
    /* renamed from: c */
    private final C2213k f11343c = new C2213k();
    /* renamed from: d */
    private final C2212a f11344d = new C2212a();
    /* renamed from: e */
    private final C2302k f11345e = new C2302k(32);
    /* renamed from: f */
    private C2180a f11346f = new C2180a(0, this.f11342b);
    /* renamed from: g */
    private C2180a f11347g = this.f11346f;
    /* renamed from: h */
    private C2180a f11348h = this.f11346f;
    /* renamed from: i */
    private Format f11349i;
    /* renamed from: j */
    private boolean f11350j;
    /* renamed from: k */
    private Format f11351k;
    /* renamed from: l */
    private long f11352l;
    /* renamed from: m */
    private long f11353m;
    /* renamed from: n */
    private boolean f11354n;
    /* renamed from: o */
    private UpstreamFormatChangedListener f11355o;

    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(Format format);
    }

    /* renamed from: com.google.android.exoplayer2.source.SampleQueue$a */
    private static final class C2180a {
        /* renamed from: a */
        public final long f6275a;
        /* renamed from: b */
        public final long f6276b;
        /* renamed from: c */
        public boolean f6277c;
        @Nullable
        /* renamed from: d */
        public C2278a f6278d;
        @Nullable
        /* renamed from: e */
        public C2180a f6279e;

        public C2180a(long j, int i) {
            this.f6275a = j;
            this.f6276b = j + ((long) i);
        }

        /* renamed from: a */
        public void m7847a(C2278a c2278a, C2180a c2180a) {
            this.f6278d = c2278a;
            this.f6279e = c2180a;
            this.f6277c = true;
        }

        /* renamed from: a */
        public int m7845a(long j) {
            return ((int) (j - this.f6275a)) + this.f6278d.f6844b;
        }

        /* renamed from: a */
        public C2180a m7846a() {
            this.f6278d = null;
            C2180a c2180a = this.f6279e;
            this.f6279e = null;
            return c2180a;
        }
    }

    public SampleQueue(Allocator allocator) {
        this.f11341a = allocator;
        this.f11342b = allocator.getIndividualAllocationLength();
    }

    /* renamed from: a */
    public void m13871a() {
        m13876a(false);
    }

    /* renamed from: a */
    public void m13876a(boolean z) {
        this.f11343c.m7904a(z);
        m13865a(this.f11346f);
        this.f11346f = new C2180a(0, this.f11342b);
        this.f11347g = this.f11346f;
        this.f11348h = this.f11346f;
        this.f11353m = 0;
        this.f11341a.trim();
    }

    /* renamed from: a */
    public void m13872a(int i) {
        this.f11343c.m7908b(i);
    }

    /* renamed from: b */
    public void m13878b() {
        this.f11354n = true;
    }

    /* renamed from: c */
    public int m13880c() {
        return this.f11343c.m7898a();
    }

    /* renamed from: b */
    public void m13879b(int i) {
        this.f11353m = this.f11343c.m7901a(i);
        if (this.f11353m != 0) {
            if (this.f11353m != this.f11346f.f6275a) {
                i = this.f11346f;
                while (this.f11353m > i.f6276b) {
                    i = i.f6279e;
                }
                C2180a c2180a = i.f6279e;
                m13865a(c2180a);
                i.f6279e = new C2180a(i.f6276b, this.f11342b);
                this.f11348h = this.f11353m == i.f6276b ? i.f6279e : i;
                if (this.f11347g == c2180a) {
                    this.f11347g = i.f6279e;
                    return;
                }
                return;
            }
        }
        m13865a(this.f11346f);
        this.f11346f = new C2180a(this.f11353m, this.f11342b);
        this.f11347g = this.f11346f;
        this.f11348h = this.f11346f;
    }

    /* renamed from: d */
    public boolean m13882d() {
        return this.f11343c.m7912d();
    }

    /* renamed from: e */
    public int m13883e() {
        return this.f11343c.m7906b();
    }

    /* renamed from: f */
    public int m13884f() {
        return this.f11343c.m7910c();
    }

    /* renamed from: g */
    public Format m13885g() {
        return this.f11343c.m7913e();
    }

    /* renamed from: h */
    public long m13886h() {
        return this.f11343c.m7914f();
    }

    /* renamed from: i */
    public long m13887i() {
        return this.f11343c.m7915g();
    }

    /* renamed from: j */
    public void m13888j() {
        this.f11343c.m7916h();
        this.f11347g = this.f11346f;
    }

    /* renamed from: a */
    public void m13874a(long j, boolean z, boolean z2) {
        m13867c(this.f11343c.m7907b(j, z, z2));
    }

    /* renamed from: k */
    public void m13889k() {
        m13867c(this.f11343c.m7918j());
    }

    /* renamed from: l */
    public void m13890l() {
        m13867c(this.f11343c.m7919k());
    }

    /* renamed from: m */
    public int m13891m() {
        return this.f11343c.m7917i();
    }

    /* renamed from: b */
    public int m13877b(long j, boolean z, boolean z2) {
        return this.f11343c.m7899a(j, z, z2);
    }

    /* renamed from: c */
    public boolean m13881c(int i) {
        return this.f11343c.m7911c(i);
    }

    /* renamed from: a */
    public int m13870a(C2122i c2122i, DecoderInputBuffer decoderInputBuffer, boolean z, boolean z2, long j) {
        switch (this.f11343c.m7900a(c2122i, decoderInputBuffer, z, z2, this.f11349i, this.f11344d)) {
            case true:
                this.f11349i = c2122i.f6062a;
                return -5;
            case true:
                if (decoderInputBuffer.m7344c() == null) {
                    if (decoderInputBuffer.f10831c < j) {
                        decoderInputBuffer.m7341b(Integer.MIN_VALUE);
                    }
                    if (decoderInputBuffer.m13520g() != null) {
                        m13864a(decoderInputBuffer, this.f11344d);
                    }
                    decoderInputBuffer.m13518e(this.f11344d.f6391a);
                    m13862a(this.f11344d.f6392b, decoderInputBuffer.f10830b, this.f11344d.f6391a);
                }
                return -4;
            case true:
                return -3;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    private void m13864a(DecoderInputBuffer decoderInputBuffer, C2212a c2212a) {
        long j;
        int h;
        int[] iArr;
        int[] iArr2;
        long j2;
        C2055a c2055a;
        int i;
        DecoderInputBuffer decoderInputBuffer2 = decoderInputBuffer;
        C2212a c2212a2 = c2212a;
        long j3 = c2212a2.f6392b;
        this.f11345e.m8381a(1);
        m13863a(j3, this.f11345e.f6929a, 1);
        long j4 = j3 + 1;
        int i2 = 0;
        byte b = this.f11345e.f6929a[0];
        Object obj = (b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? 1 : null;
        int i3 = b & 127;
        if (decoderInputBuffer2.f10829a.f5600a == null) {
            decoderInputBuffer2.f10829a.f5600a = new byte[16];
        }
        m13863a(j4, decoderInputBuffer2.f10829a.f5600a, i3);
        long j5 = j4 + ((long) i3);
        if (obj != null) {
            r0.f11345e.m8381a(2);
            m13863a(j5, r0.f11345e.f6929a, 2);
            j = j5 + 2;
            h = r0.f11345e.m8396h();
        } else {
            j = j5;
            h = 1;
        }
        int[] iArr3 = decoderInputBuffer2.f10829a.f5603d;
        if (iArr3 != null) {
            if (iArr3.length < h) {
            }
            iArr = iArr3;
            iArr3 = decoderInputBuffer2.f10829a.f5604e;
            if (iArr3 != null) {
                if (iArr3.length < h) {
                }
                iArr2 = iArr3;
                if (obj == null) {
                    i3 = h * 6;
                    r0.f11345e.m8381a(i3);
                    m13863a(j, r0.f11345e.f6929a, i3);
                    j2 = j + ((long) i3);
                    r0.f11345e.m8388c(0);
                    while (i2 < h) {
                        iArr[i2] = r0.f11345e.m8396h();
                        iArr2[i2] = r0.f11345e.m8409u();
                        i2++;
                    }
                    j = j2;
                } else {
                    iArr[0] = 0;
                    iArr2[0] = c2212a2.f6391a - ((int) (j - c2212a2.f6392b));
                }
                c2055a = c2212a2.f6393c;
                decoderInputBuffer2.f10829a.m7352a(h, iArr, iArr2, c2055a.f5638b, decoderInputBuffer2.f10829a.f5600a, c2055a.f5637a, c2055a.f5639c, c2055a.f5640d);
                i = (int) (j - c2212a2.f6392b);
                c2212a2.f6392b += (long) i;
                c2212a2.f6391a -= i;
            }
            iArr3 = new int[h];
            iArr2 = iArr3;
            if (obj == null) {
                iArr[0] = 0;
                iArr2[0] = c2212a2.f6391a - ((int) (j - c2212a2.f6392b));
            } else {
                i3 = h * 6;
                r0.f11345e.m8381a(i3);
                m13863a(j, r0.f11345e.f6929a, i3);
                j2 = j + ((long) i3);
                r0.f11345e.m8388c(0);
                while (i2 < h) {
                    iArr[i2] = r0.f11345e.m8396h();
                    iArr2[i2] = r0.f11345e.m8409u();
                    i2++;
                }
                j = j2;
            }
            c2055a = c2212a2.f6393c;
            decoderInputBuffer2.f10829a.m7352a(h, iArr, iArr2, c2055a.f5638b, decoderInputBuffer2.f10829a.f5600a, c2055a.f5637a, c2055a.f5639c, c2055a.f5640d);
            i = (int) (j - c2212a2.f6392b);
            c2212a2.f6392b += (long) i;
            c2212a2.f6391a -= i;
        }
        iArr3 = new int[h];
        iArr = iArr3;
        iArr3 = decoderInputBuffer2.f10829a.f5604e;
        if (iArr3 != null) {
            if (iArr3.length < h) {
            }
            iArr2 = iArr3;
            if (obj == null) {
                i3 = h * 6;
                r0.f11345e.m8381a(i3);
                m13863a(j, r0.f11345e.f6929a, i3);
                j2 = j + ((long) i3);
                r0.f11345e.m8388c(0);
                while (i2 < h) {
                    iArr[i2] = r0.f11345e.m8396h();
                    iArr2[i2] = r0.f11345e.m8409u();
                    i2++;
                }
                j = j2;
            } else {
                iArr[0] = 0;
                iArr2[0] = c2212a2.f6391a - ((int) (j - c2212a2.f6392b));
            }
            c2055a = c2212a2.f6393c;
            decoderInputBuffer2.f10829a.m7352a(h, iArr, iArr2, c2055a.f5638b, decoderInputBuffer2.f10829a.f5600a, c2055a.f5637a, c2055a.f5639c, c2055a.f5640d);
            i = (int) (j - c2212a2.f6392b);
            c2212a2.f6392b += (long) i;
            c2212a2.f6391a -= i;
        }
        iArr3 = new int[h];
        iArr2 = iArr3;
        if (obj == null) {
            iArr[0] = 0;
            iArr2[0] = c2212a2.f6391a - ((int) (j - c2212a2.f6392b));
        } else {
            i3 = h * 6;
            r0.f11345e.m8381a(i3);
            m13863a(j, r0.f11345e.f6929a, i3);
            j2 = j + ((long) i3);
            r0.f11345e.m8388c(0);
            while (i2 < h) {
                iArr[i2] = r0.f11345e.m8396h();
                iArr2[i2] = r0.f11345e.m8409u();
                i2++;
            }
            j = j2;
        }
        c2055a = c2212a2.f6393c;
        decoderInputBuffer2.f10829a.m7352a(h, iArr, iArr2, c2055a.f5638b, decoderInputBuffer2.f10829a.f5600a, c2055a.f5637a, c2055a.f5639c, c2055a.f5640d);
        i = (int) (j - c2212a2.f6392b);
        c2212a2.f6392b += (long) i;
        c2212a2.f6391a -= i;
    }

    /* renamed from: a */
    private void m13862a(long j, ByteBuffer byteBuffer, int i) {
        m13866b(j);
        while (i > 0) {
            int min = Math.min(i, (int) (this.f11347g.f6276b - j));
            byteBuffer.put(this.f11347g.f6278d.f6843a, this.f11347g.m7845a(j), min);
            i -= min;
            long j2 = j + ((long) min);
            if (j2 == this.f11347g.f6276b) {
                this.f11347g = this.f11347g.f6279e;
            }
            j = j2;
        }
    }

    /* renamed from: a */
    private void m13863a(long j, byte[] bArr, int i) {
        m13866b(j);
        long j2 = j;
        j = i;
        while (j > null) {
            int min = Math.min(j, (int) (this.f11347g.f6276b - j2));
            System.arraycopy(this.f11347g.f6278d.f6843a, this.f11347g.m7845a(j2), bArr, i - j, min);
            j -= min;
            long j3 = j2 + ((long) min);
            if (j3 == this.f11347g.f6276b) {
                this.f11347g = this.f11347g.f6279e;
            }
            j2 = j3;
        }
    }

    /* renamed from: b */
    private void m13866b(long j) {
        while (j >= this.f11347g.f6276b) {
            this.f11347g = this.f11347g.f6279e;
        }
    }

    /* renamed from: c */
    private void m13867c(long j) {
        if (j != -1) {
            while (j >= this.f11346f.f6276b) {
                this.f11341a.release(this.f11346f.f6278d);
                this.f11346f = this.f11346f.m7846a();
            }
            if (this.f11347g.f6275a < this.f11346f.f6275a) {
                this.f11347g = this.f11346f;
            }
        }
    }

    /* renamed from: a */
    public void m13875a(UpstreamFormatChangedListener upstreamFormatChangedListener) {
        this.f11355o = upstreamFormatChangedListener;
    }

    /* renamed from: a */
    public void m13873a(long j) {
        if (this.f11352l != j) {
            this.f11352l = j;
            this.f11350j = 1;
        }
    }

    public void format(Format format) {
        Format a = m13861a(format, this.f11352l);
        boolean a2 = this.f11343c.m7905a(a);
        this.f11351k = format;
        this.f11350j = null;
        if (this.f11355o != null && a2) {
            this.f11355o.onUpstreamFormatChanged(a);
        }
    }

    public int sampleData(ExtractorInput extractorInput, int i, boolean z) throws IOException, InterruptedException {
        extractorInput = extractorInput.read(this.f11348h.f6278d.f6843a, this.f11348h.m7845a(this.f11353m), m13868d(i));
        if (extractorInput != -1) {
            m13869e(extractorInput);
            return extractorInput;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void sampleData(C2302k c2302k, int i) {
        while (i > 0) {
            int d = m13868d(i);
            c2302k.m8384a(this.f11348h.f6278d.f6843a, this.f11348h.m7845a(this.f11353m), d);
            i -= d;
            m13869e(d);
        }
    }

    public void sampleMetadata(long j, int i, int i2, int i3, C2055a c2055a) {
        long j2 = j;
        if (this.f11350j) {
            format(r0.f11351k);
        }
        if (r0.f11354n) {
            if ((i & 1) != 0) {
                if (r0.f11343c.m7909b(j2)) {
                    r0.f11354n = false;
                }
            }
            return;
        }
        int i4 = i2;
        r0.f11343c.m7903a(j2 + r0.f11352l, i, (r0.f11353m - ((long) i4)) - ((long) i3), i4, c2055a);
    }

    /* renamed from: a */
    private void m13865a(C2180a c2180a) {
        if (c2180a.f6277c) {
            C2278a[] c2278aArr = new C2278a[(this.f11348h.f6277c + (((int) (this.f11348h.f6275a - c2180a.f6275a)) / this.f11342b))];
            for (int i = 0; i < c2278aArr.length; i++) {
                c2278aArr[i] = c2180a.f6278d;
                c2180a = c2180a.m7846a();
            }
            this.f11341a.release(c2278aArr);
        }
    }

    /* renamed from: d */
    private int m13868d(int i) {
        if (!this.f11348h.f6277c) {
            this.f11348h.m7847a(this.f11341a.allocate(), new C2180a(this.f11348h.f6276b, this.f11342b));
        }
        return Math.min(i, (int) (this.f11348h.f6276b - this.f11353m));
    }

    /* renamed from: e */
    private void m13869e(int i) {
        this.f11353m += (long) i;
        if (this.f11353m == this.f11348h.f6276b) {
            this.f11348h = this.f11348h.f6279e;
        }
    }

    /* renamed from: a */
    private static Format m13861a(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (!(j == 0 || format.subsampleOffsetUs == Format.OFFSET_SAMPLE_RELATIVE)) {
            format = format.copyWithSubsampleOffsetUs(format.subsampleOffsetUs + j);
        }
        return format;
    }
}
