package com.google.android.exoplayer2.source.hls;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C3618b;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.chunk.C4249g;
import com.google.android.exoplayer2.source.hls.playlist.C4252a.C2211a;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2310s;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.exoplayer2.source.hls.d */
final class C4373d extends C4249g {
    /* renamed from: m */
    private static final AtomicInteger f14442m = new AtomicInteger();
    /* renamed from: A */
    private int f14443A;
    /* renamed from: B */
    private int f14444B;
    /* renamed from: C */
    private boolean f14445C;
    /* renamed from: D */
    private boolean f14446D;
    /* renamed from: E */
    private volatile boolean f14447E;
    /* renamed from: F */
    private volatile boolean f14448F;
    /* renamed from: a */
    public final int f14449a;
    /* renamed from: k */
    public final int f14450k;
    /* renamed from: l */
    public final C2211a f14451l;
    /* renamed from: n */
    private final DataSource f14452n;
    /* renamed from: o */
    private final DataSpec f14453o;
    /* renamed from: p */
    private final boolean f14454p = (this.i instanceof C3691a);
    /* renamed from: q */
    private final boolean f14455q;
    /* renamed from: r */
    private final boolean f14456r;
    /* renamed from: s */
    private final C2310s f14457s;
    /* renamed from: t */
    private final boolean f14458t;
    /* renamed from: u */
    private final Extractor f14459u;
    /* renamed from: v */
    private final boolean f14460v;
    /* renamed from: w */
    private final boolean f14461w;
    /* renamed from: x */
    private final Id3Decoder f14462x;
    /* renamed from: y */
    private final C2302k f14463y;
    /* renamed from: z */
    private HlsSampleStreamWrapper f14464z;

    public C4373d(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, DataSpec dataSpec, DataSpec dataSpec2, C2211a c2211a, List<Format> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z, boolean z2, C2310s c2310s, C4373d c4373d, DrmInitData drmInitData, byte[] bArr, byte[] bArr2) {
        Extractor extractor;
        DataSpec dataSpec3;
        DataSpec dataSpec4 = dataSpec2;
        C2211a c2211a2 = c2211a;
        C4373d c4373d2 = c4373d;
        int i3 = i2;
        super(C4373d.m18019a(dataSource, bArr, bArr2), dataSpec, c2211a2.f6390b, i, obj, j, j2, j3);
        this.f14450k = i3;
        this.f14453o = dataSpec4;
        this.f14451l = c2211a2;
        this.f14455q = z2;
        C2310s c2310s2 = c2310s;
        this.f14457s = c2310s2;
        this.f14456r = z;
        boolean z3 = true;
        C4373d c4373d3 = c4373d;
        if (c4373d3 != null) {
            Extractor extractor2;
            r12.f14458t = c4373d3.f14451l != c2211a2;
            if (c4373d3.f14450k == i3) {
                if (!r12.f14458t) {
                    extractor2 = c4373d3.f14459u;
                    extractor = extractor2;
                    dataSpec3 = dataSpec;
                }
            }
            extractor2 = null;
            extractor = extractor2;
            dataSpec3 = dataSpec;
        } else {
            r12.f14458t = false;
            dataSpec3 = dataSpec;
            extractor = null;
        }
        Pair createExtractor = hlsExtractorFactory.createExtractor(extractor, dataSpec3.f6822a, r12.d, list, drmInitData, c2310s2);
        r12.f14459u = (Extractor) createExtractor.first;
        r12.f14460v = ((Boolean) createExtractor.second).booleanValue();
        r12.f14461w = r12.f14459u == extractor;
        if (!r12.f14461w || dataSpec4 == null) {
            z3 = false;
        }
        r12.f14446D = z3;
        if (!r12.f14460v) {
            r12.f14462x = null;
            r12.f14463y = null;
        } else if (c4373d3 == null || c4373d3.f14463y == null) {
            r12.f14462x = new Id3Decoder();
            r12.f14463y = new C2302k(10);
        } else {
            r12.f14462x = c4373d3.f14462x;
            r12.f14463y = c4373d3.f14463y;
        }
        r12.f14452n = dataSource;
        r12.f14449a = f14442m.getAndIncrement();
    }

    /* renamed from: a */
    public void m18022a(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
        this.f14464z = hlsSampleStreamWrapper;
        hlsSampleStreamWrapper.m13982a(this.f14449a, this.f14458t, this.f14461w);
        if (!this.f14461w) {
            this.f14459u.init(hlsSampleStreamWrapper);
        }
    }

    /* renamed from: d */
    public boolean mo3732d() {
        return this.f14448F;
    }

    /* renamed from: b */
    public long mo3499b() {
        return (long) this.f14444B;
    }

    public void cancelLoad() {
        this.f14447E = true;
    }

    public boolean isLoadCanceled() {
        return this.f14447E;
    }

    public void load() throws IOException, InterruptedException {
        m18020e();
        if (!this.f14447E) {
            if (!this.f14456r) {
                m18021f();
            }
            this.f14448F = true;
        }
    }

    /* renamed from: e */
    private void m18020e() throws IOException, InterruptedException {
        if (!this.f14446D) {
            if (this.f14453o != null) {
                DataSpec a = this.f14453o.m8234a((long) this.f14443A);
                ExtractorInput c3618b;
                try {
                    c3618b = new C3618b(this.f14452n, a.f6824c, this.f14452n.open(a));
                    int i = 0;
                    while (i == 0) {
                        if (this.f14447E) {
                            break;
                        }
                        i = this.f14459u.read(c3618b, null);
                    }
                    this.f14443A = (int) (c3618b.getPosition() - this.f14453o.f6824c);
                    C2314v.m8472a(this.i);
                    this.f14446D = true;
                } catch (Throwable th) {
                    C2314v.m8472a(this.i);
                }
            }
        }
    }

    /* renamed from: f */
    private void m18021f() throws IOException, InterruptedException {
        Object obj;
        ExtractorInput c3618b;
        int i = 0;
        DataSpec dataSpec;
        if (this.f14454p) {
            dataSpec = this.b;
            if (this.f14444B != 0) {
                obj = 1;
                if (!this.f14455q) {
                    this.f14457s.m8445e();
                } else if (this.f14457s.m8438a() == Format.OFFSET_SAMPLE_RELATIVE) {
                    this.f14457s.m8439a(this.g);
                }
                c3618b = new C3618b(this.i, dataSpec.f6824c, this.i.open(dataSpec));
                if (this.f14460v && !this.f14445C) {
                    long a = m18018a(c3618b);
                    this.f14445C = true;
                    this.f14464z.m13983a(a == -9223372036854775807L ? this.f14457s.m8441b(a) : this.g);
                }
                if (obj != null) {
                    c3618b.skipFully(this.f14444B);
                }
                while (i == 0) {
                    if (!this.f14447E) {
                        break;
                    }
                    i = this.f14459u.read(c3618b, null);
                }
                this.f14444B = (int) (c3618b.getPosition() - this.b.f6824c);
                C2314v.m8472a(this.i);
            }
        }
        dataSpec = this.b.m8234a((long) this.f14444B);
        obj = null;
        if (!this.f14455q) {
            this.f14457s.m8445e();
        } else if (this.f14457s.m8438a() == Format.OFFSET_SAMPLE_RELATIVE) {
            this.f14457s.m8439a(this.g);
        }
        try {
            c3618b = new C3618b(this.i, dataSpec.f6824c, this.i.open(dataSpec));
            long a2 = m18018a(c3618b);
            this.f14445C = true;
            if (a2 == -9223372036854775807L) {
            }
            this.f14464z.m13983a(a2 == -9223372036854775807L ? this.f14457s.m8441b(a2) : this.g);
            if (obj != null) {
                c3618b.skipFully(this.f14444B);
            }
            while (i == 0) {
                if (!this.f14447E) {
                    break;
                }
                i = this.f14459u.read(c3618b, null);
            }
            this.f14444B = (int) (c3618b.getPosition() - this.b.f6824c);
            C2314v.m8472a(this.i);
        } catch (Throwable th) {
            C2314v.m8472a(this.i);
        }
    }

    /* renamed from: a */
    private long m18018a(ExtractorInput extractorInput) throws IOException, InterruptedException {
        extractorInput.resetPeekPosition();
        if (!extractorInput.peekFully(this.f14463y.f6929a, 0, 10, true)) {
            return -9223372036854775807L;
        }
        this.f14463y.m8381a(10);
        if (this.f14463y.m8399k() != Id3Decoder.f11333b) {
            return -9223372036854775807L;
        }
        this.f14463y.m8390d(3);
        int t = this.f14463y.m8408t();
        int i = t + 10;
        if (i > this.f14463y.m8391e()) {
            Object obj = this.f14463y.f6929a;
            this.f14463y.m8381a(i);
            System.arraycopy(obj, 0, this.f14463y.f6929a, 0, 10);
        }
        if (extractorInput.peekFully(this.f14463y.f6929a, 10, t, true) == null) {
            return -9223372036854775807L;
        }
        extractorInput = this.f14462x.m13852a(this.f14463y.f6929a, t);
        if (extractorInput == null) {
            return -9223372036854775807L;
        }
        t = extractorInput.length();
        for (int i2 = 0; i2 < t; i2++) {
            Entry entry = extractorInput.get(i2);
            if (entry instanceof PrivFrame) {
                PrivFrame privFrame = (PrivFrame) entry;
                if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.owner)) {
                    System.arraycopy(privFrame.privateData, 0, this.f14463y.f6929a, 0, 8);
                    this.f14463y.m8381a(8);
                    return this.f14463y.m8405q() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private static DataSource m18019a(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        return bArr != null ? new C3691a(dataSource, bArr, bArr2) : dataSource;
    }
}
