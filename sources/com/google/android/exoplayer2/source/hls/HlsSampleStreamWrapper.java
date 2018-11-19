package com.google.android.exoplayer2.source.hls;

import android.os.Handler;
import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C3623d;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2177a;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.chunk.C3680c;
import com.google.android.exoplayer2.source.hls.C2207c.C2206b;
import com.google.android.exoplayer2.source.hls.playlist.C4252a.C2211a;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.Loadable;
import com.google.android.exoplayer2.upstream.Loader.ReleaseCallback;
import com.google.android.exoplayer2.util.C2289a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

final class HlsSampleStreamWrapper implements ExtractorOutput, UpstreamFormatChangedListener, SequenceableLoader, com.google.android.exoplayer2.upstream.Loader.Callback<C3680c>, ReleaseCallback {
    /* renamed from: A */
    private boolean f11466A;
    /* renamed from: B */
    private boolean f11467B;
    /* renamed from: C */
    private boolean f11468C;
    /* renamed from: D */
    private long f11469D;
    /* renamed from: a */
    private final int f11470a;
    /* renamed from: b */
    private final Callback f11471b;
    /* renamed from: c */
    private final C2207c f11472c;
    /* renamed from: d */
    private final Allocator f11473d;
    /* renamed from: e */
    private final int f11474e;
    /* renamed from: f */
    private final Loader f11475f;
    /* renamed from: g */
    private final C2177a f11476g;
    /* renamed from: h */
    private final C2206b f11477h;
    /* renamed from: i */
    private final ArrayList<C4373d> f11478i;
    /* renamed from: j */
    private final Runnable f11479j;
    /* renamed from: k */
    private final Runnable f11480k;
    /* renamed from: l */
    private final Handler f11481l;
    /* renamed from: m */
    private SampleQueue[] f11482m;
    /* renamed from: n */
    private int[] f11483n;
    /* renamed from: o */
    private boolean f11484o;
    /* renamed from: p */
    private int f11485p;
    /* renamed from: q */
    private boolean f11486q;
    /* renamed from: r */
    private int f11487r;
    /* renamed from: s */
    private boolean f11488s;
    /* renamed from: t */
    private boolean f11489t;
    /* renamed from: u */
    private int f11490u;
    /* renamed from: v */
    private boolean f11491v;
    /* renamed from: w */
    private boolean[] f11492w;
    /* renamed from: x */
    private boolean[] f11493x;
    /* renamed from: y */
    private long f11494y;
    /* renamed from: z */
    private long f11495z;

    public interface Callback extends com.google.android.exoplayer2.source.SequenceableLoader.Callback<HlsSampleStreamWrapper> {
        void onPlaylistRefreshRequired(C2211a c2211a);

        void onPrepared();
    }

    public void reevaluateBuffer(long j) {
    }

    public void seekMap(SeekMap seekMap) {
    }

    public /* synthetic */ void onLoadCanceled(Loadable loadable, long j, long j2, boolean z) {
        m13985a((C3680c) loadable, j, j2, z);
    }

    public /* synthetic */ void onLoadCompleted(Loadable loadable, long j, long j2) {
        m13984a((C3680c) loadable, j, j2);
    }

    public /* synthetic */ int onLoadError(Loadable loadable, long j, long j2, IOException iOException) {
        return m13981a((C3680c) loadable, j, j2, iOException);
    }

    public void onLoaderReleased() {
        m13977a();
    }

    public long getBufferedPositionUs() {
        if (this.f11467B) {
            return Long.MIN_VALUE;
        }
        if (m13980c()) {
            return this.f11495z;
        }
        long j = this.f11494y;
        C4373d b = m13979b();
        if (!b.mo3732d()) {
            b = this.f11478i.size() > 1 ? (C4373d) this.f11478i.get(this.f11478i.size() - 2) : null;
        }
        if (b != null) {
            j = Math.max(j, b.h);
        }
        if (this.f11488s) {
            for (SampleQueue h : this.f11482m) {
                j = Math.max(j, h.m13886h());
            }
        }
        return j;
    }

    public long getNextLoadPositionUs() {
        if (m13980c()) {
            return this.f11495z;
        }
        return this.f11467B ? Long.MIN_VALUE : m13979b().h;
    }

    public boolean continueLoading(long j) {
        if (!this.f11467B) {
            if (!r0.f11475f.m14087a()) {
                C4373d c4373d;
                long j2;
                if (m13980c()) {
                    c4373d = null;
                    j2 = r0.f11495z;
                } else {
                    c4373d = m13979b();
                    j2 = c4373d.h;
                }
                r0.f11472c.m7888a(c4373d, j, j2, r0.f11477h);
                boolean z = r0.f11477h.f6352b;
                C3680c c3680c = r0.f11477h.f6351a;
                C2211a c2211a = r0.f11477h.f6353c;
                r0.f11477h.m7881a();
                if (z) {
                    r0.f11495z = -9223372036854775807L;
                    r0.f11467B = true;
                    return true;
                } else if (c3680c == null) {
                    if (c2211a != null) {
                        r0.f11471b.onPlaylistRefreshRequired(c2211a);
                    }
                    return false;
                } else {
                    if (m13978a(c3680c)) {
                        r0.f11495z = -9223372036854775807L;
                        c4373d = (C4373d) c3680c;
                        c4373d.m18022a(r0);
                        r0.f11478i.add(c4373d);
                    }
                    long a = r0.f11475f.m14085a(c3680c, r0, r0.f11474e);
                    r0.f11476g.m7833a(c3680c.f11415b, c3680c.f11416c, r0.f11470a, c3680c.f11417d, c3680c.f11418e, c3680c.f11419f, c3680c.f11420g, c3680c.f11421h, a);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m13984a(C3680c c3680c, long j, long j2) {
        C3680c c3680c2 = c3680c;
        this.f11472c.m7887a(c3680c2);
        this.f11476g.m7834a(c3680c2.f11415b, c3680c2.f11416c, this.f11470a, c3680c2.f11417d, c3680c2.f11418e, c3680c2.f11419f, c3680c2.f11420g, c3680c2.f11421h, j, j2, c3680c.mo3499b());
        if (this.f11489t) {
            r0.f11471b.onContinueLoadingRequested(r0);
        } else {
            continueLoading(r0.f11494y);
        }
    }

    /* renamed from: a */
    public void m13985a(C3680c c3680c, long j, long j2, boolean z) {
        C3680c c3680c2 = c3680c;
        C2177a c2177a = this.f11476g;
        DataSpec dataSpec = c3680c2.f11415b;
        int i = c3680c2.f11416c;
        int i2 = this.f11470a;
        Format format = c3680c2.f11417d;
        int i3 = c3680c2.f11418e;
        Object obj = c3680c2.f11419f;
        long j3 = c3680c2.f11420g;
        long j4 = c3680c2.f11421h;
        c2177a.m7841b(dataSpec, i, i2, format, i3, obj, j3, j4, j, j2, c3680c.mo3499b());
        if (!z) {
            m13977a();
            if (r0.f11490u > 0) {
                r0.f11471b.onContinueLoadingRequested(r0);
            }
        }
    }

    /* renamed from: a */
    public int m13981a(C3680c c3680c, long j, long j2, IOException iOException) {
        boolean z;
        boolean z2;
        HlsSampleStreamWrapper hlsSampleStreamWrapper = this;
        C3680c c3680c2 = c3680c;
        IOException iOException2 = iOException;
        long b = c3680c.mo3499b();
        boolean a = m13978a(c3680c);
        int i = 0;
        if (a) {
            if (b != 0) {
                z = false;
                if (hlsSampleStreamWrapper.f11472c.m7889a(c3680c2, z, iOException2)) {
                    z2 = false;
                } else {
                    if (a) {
                        C2289a.m8313b(((C4373d) hlsSampleStreamWrapper.f11478i.remove(hlsSampleStreamWrapper.f11478i.size() - 1)) != c3680c2);
                        if (hlsSampleStreamWrapper.f11478i.isEmpty()) {
                            hlsSampleStreamWrapper.f11495z = hlsSampleStreamWrapper.f11494y;
                        }
                    }
                    z2 = true;
                }
                hlsSampleStreamWrapper.f11476g.m7835a(c3680c2.f11415b, c3680c2.f11416c, hlsSampleStreamWrapper.f11470a, c3680c2.f11417d, c3680c2.f11418e, c3680c2.f11419f, c3680c2.f11420g, c3680c2.f11421h, j, j2, c3680c.mo3499b(), iOException, z2);
                if (z2) {
                    if (iOException instanceof ParserException) {
                        i = 3;
                    }
                    return i;
                }
                if (hlsSampleStreamWrapper.f11489t) {
                    continueLoading(hlsSampleStreamWrapper.f11494y);
                } else {
                    hlsSampleStreamWrapper.f11471b.onContinueLoadingRequested(hlsSampleStreamWrapper);
                }
                return 2;
            }
        }
        z = true;
        if (hlsSampleStreamWrapper.f11472c.m7889a(c3680c2, z, iOException2)) {
            z2 = false;
        } else {
            if (a) {
                if (((C4373d) hlsSampleStreamWrapper.f11478i.remove(hlsSampleStreamWrapper.f11478i.size() - 1)) != c3680c2) {
                }
                C2289a.m8313b(((C4373d) hlsSampleStreamWrapper.f11478i.remove(hlsSampleStreamWrapper.f11478i.size() - 1)) != c3680c2);
                if (hlsSampleStreamWrapper.f11478i.isEmpty()) {
                    hlsSampleStreamWrapper.f11495z = hlsSampleStreamWrapper.f11494y;
                }
            }
            z2 = true;
        }
        hlsSampleStreamWrapper.f11476g.m7835a(c3680c2.f11415b, c3680c2.f11416c, hlsSampleStreamWrapper.f11470a, c3680c2.f11417d, c3680c2.f11418e, c3680c2.f11419f, c3680c2.f11420g, c3680c2.f11421h, j, j2, c3680c.mo3499b(), iOException, z2);
        if (z2) {
            if (iOException instanceof ParserException) {
                i = 3;
            }
            return i;
        }
        if (hlsSampleStreamWrapper.f11489t) {
            hlsSampleStreamWrapper.f11471b.onContinueLoadingRequested(hlsSampleStreamWrapper);
        } else {
            continueLoading(hlsSampleStreamWrapper.f11494y);
        }
        return 2;
    }

    /* renamed from: a */
    public void m13982a(int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (!z2) {
            this.f11484o = false;
            this.f11486q = false;
        }
        for (SampleQueue a : this.f11482m) {
            a.m13872a(i);
        }
        if (z) {
            i = this.f11482m;
            z = i.length;
            while (z3 < z) {
                i[z3].m13878b();
                z3++;
            }
        }
    }

    public TrackOutput track(int i, int i2) {
        int length = this.f11482m.length;
        boolean z = false;
        if (i2 == 1) {
            if (this.f11485p != -1) {
                if (this.f11484o) {
                    if (this.f11483n[this.f11485p] == i) {
                        i = this.f11482m[this.f11485p];
                    } else {
                        i = m13976a(i, i2);
                    }
                    return i;
                }
                this.f11484o = true;
                this.f11483n[this.f11485p] = i;
                return this.f11482m[this.f11485p];
            } else if (this.f11468C) {
                return m13976a(i, i2);
            }
        } else if (i2 != 2) {
            for (int i3 = 0; i3 < length; i3++) {
                if (this.f11483n[i3] == i) {
                    return this.f11482m[i3];
                }
            }
            if (this.f11468C) {
                return m13976a(i, i2);
            }
        } else if (this.f11487r != -1) {
            if (this.f11486q) {
                if (this.f11483n[this.f11487r] == i) {
                    i = this.f11482m[this.f11487r];
                } else {
                    i = m13976a(i, i2);
                }
                return i;
            }
            this.f11486q = true;
            this.f11483n[this.f11487r] = i;
            return this.f11482m[this.f11487r];
        } else if (this.f11468C) {
            return m13976a(i, i2);
        }
        TrackOutput sampleQueue = new SampleQueue(this.f11473d);
        sampleQueue.m13873a(this.f11469D);
        sampleQueue.m13875a((UpstreamFormatChangedListener) this);
        int i4 = length + 1;
        this.f11483n = Arrays.copyOf(this.f11483n, i4);
        this.f11483n[length] = i;
        this.f11482m = (SampleQueue[]) Arrays.copyOf(this.f11482m, i4);
        this.f11482m[length] = sampleQueue;
        this.f11493x = Arrays.copyOf(this.f11493x, i4);
        i = this.f11493x;
        if (i2 == 1 || i2 == 2) {
            z = true;
        }
        i[length] = z;
        this.f11491v |= this.f11493x[length];
        if (i2 == 1) {
            this.f11484o = true;
            this.f11485p = length;
        } else if (i2 == 2) {
            this.f11486q = true;
            this.f11487r = length;
        }
        this.f11492w = Arrays.copyOf(this.f11492w, i4);
        return sampleQueue;
    }

    public void endTracks() {
        this.f11468C = true;
        this.f11481l.post(this.f11480k);
    }

    public void onUpstreamFormatChanged(Format format) {
        this.f11481l.post(this.f11479j);
    }

    /* renamed from: a */
    public void m13983a(long j) {
        this.f11469D = j;
        for (SampleQueue a : this.f11482m) {
            a.m13873a(j);
        }
    }

    /* renamed from: a */
    private void m13977a() {
        for (SampleQueue a : this.f11482m) {
            a.m13876a(this.f11466A);
        }
        this.f11466A = false;
    }

    /* renamed from: b */
    private C4373d m13979b() {
        return (C4373d) this.f11478i.get(this.f11478i.size() - 1);
    }

    /* renamed from: c */
    private boolean m13980c() {
        return this.f11495z != -9223372036854775807L;
    }

    /* renamed from: a */
    private static boolean m13978a(C3680c c3680c) {
        return c3680c instanceof C4373d;
    }

    /* renamed from: a */
    private static C3623d m13976a(int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unmapped track with id ");
        stringBuilder.append(i);
        stringBuilder.append(" of type ");
        stringBuilder.append(i2);
        Log.w("HlsSampleStreamWrapper", stringBuilder.toString());
        return new C3623d();
    }
}
