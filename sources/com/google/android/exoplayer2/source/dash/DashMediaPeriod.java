package com.google.android.exoplayer2.source.dash;

import android.util.SparseArray;
import com.google.android.exoplayer2.C2162p;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.C3687f;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2177a;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.SequenceableLoader.Callback;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream.C3678a;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream.ReleaseCallback;
import com.google.android.exoplayer2.source.dash.DashChunkSource.Factory;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.C3683b;
import com.google.android.exoplayer2.source.dash.p063a.C2196c;
import com.google.android.exoplayer2.source.dash.p063a.C3684b;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;

final class DashMediaPeriod implements MediaPeriod, Callback<ChunkSampleStream<DashChunkSource>>, ReleaseCallback<DashChunkSource> {
    /* renamed from: a */
    private final Factory f13683a;
    /* renamed from: b */
    private final int f13684b;
    /* renamed from: c */
    private final C2177a f13685c;
    /* renamed from: d */
    private final long f13686d;
    /* renamed from: e */
    private final LoaderErrorThrower f13687e;
    /* renamed from: f */
    private final Allocator f13688f;
    /* renamed from: g */
    private final TrackGroupArray f13689g;
    /* renamed from: h */
    private final TrackGroupInfo[] f13690h;
    /* renamed from: i */
    private final CompositeSequenceableLoaderFactory f13691i;
    /* renamed from: j */
    private final PlayerEmsgHandler f13692j;
    /* renamed from: k */
    private final IdentityHashMap<ChunkSampleStream<DashChunkSource>, C3683b> f13693k;
    /* renamed from: l */
    private MediaPeriod.Callback f13694l;
    /* renamed from: m */
    private ChunkSampleStream<DashChunkSource>[] f13695m;
    /* renamed from: n */
    private C3685a[] f13696n;
    /* renamed from: o */
    private SequenceableLoader f13697o;
    /* renamed from: p */
    private C3684b f13698p;
    /* renamed from: q */
    private int f13699q;
    /* renamed from: r */
    private List<C2196c> f13700r;
    /* renamed from: s */
    private boolean f13701s;

    private static final class TrackGroupInfo {
        /* renamed from: a */
        public final int[] f6308a;
        /* renamed from: b */
        public final int f6309b;
        /* renamed from: c */
        public final int f6310c;
        /* renamed from: d */
        public final int f6311d;
        /* renamed from: e */
        public final int f6312e;
        /* renamed from: f */
        public final int f6313f;
        /* renamed from: g */
        public final int f6314g;

        @Retention(RetentionPolicy.SOURCE)
        public @interface TrackGroupCategory {
        }
    }

    public /* synthetic */ void onContinueLoadingRequested(SequenceableLoader sequenceableLoader) {
        m16966a((ChunkSampleStream) sequenceableLoader);
    }

    public synchronized void onSampleStreamReleased(ChunkSampleStream<DashChunkSource> chunkSampleStream) {
        C3683b c3683b = (C3683b) this.f13693k.remove(chunkSampleStream);
        if (c3683b != null) {
            c3683b.m13953a();
        }
    }

    public void prepare(MediaPeriod.Callback callback, long j) {
        this.f13694l = callback;
        callback.onPrepared(this);
    }

    public void maybeThrowPrepareError() throws IOException {
        this.f13687e.maybeThrowError();
    }

    public TrackGroupArray getTrackGroups() {
        return this.f13689g;
    }

    public long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        SparseArray sparseArray = new SparseArray();
        List arrayList = new ArrayList();
        TrackSelection[] trackSelectionArr2 = trackSelectionArr;
        boolean[] zArr3 = zArr;
        SampleStream[] sampleStreamArr2 = sampleStreamArr;
        boolean[] zArr4 = zArr2;
        SparseArray sparseArray2 = sparseArray;
        m16962a(trackSelectionArr2, zArr3, sampleStreamArr2, zArr4, j, sparseArray2);
        m16963a(trackSelectionArr2, zArr3, sampleStreamArr2, zArr4, arrayList);
        m16965b(trackSelectionArr2, zArr3, sampleStreamArr2, zArr4, j, sparseArray2);
        this.f13695m = m16964a(sparseArray.size());
        for (int i = 0; i < r8.f13695m.length; i++) {
            r8.f13695m[i] = (ChunkSampleStream) sparseArray.valueAt(i);
        }
        r8.f13696n = new C3685a[arrayList.size()];
        arrayList.toArray(r8.f13696n);
        r8.f13697o = r8.f13691i.createCompositeSequenceableLoader(r8.f13695m);
        return j;
    }

    /* renamed from: a */
    private void m16962a(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j, SparseArray<ChunkSampleStream<DashChunkSource>> sparseArray) {
        int i = 0;
        while (i < trackSelectionArr.length) {
            if (sampleStreamArr[i] instanceof ChunkSampleStream) {
                ChunkSampleStream chunkSampleStream = (ChunkSampleStream) sampleStreamArr[i];
                if (trackSelectionArr[i] != null) {
                    if (zArr[i]) {
                        sparseArray.put(this.f13689g.indexOf(trackSelectionArr[i].getTrackGroup()), chunkSampleStream);
                    }
                }
                chunkSampleStream.m13939a((ReleaseCallback) this);
                sampleStreamArr[i] = null;
            }
            if (sampleStreamArr[i] == null && trackSelectionArr[i] != null) {
                int indexOf = this.f13689g.indexOf(trackSelectionArr[i].getTrackGroup());
                TrackGroupInfo trackGroupInfo = this.f13690h[indexOf];
                if (trackGroupInfo.f6310c == 0) {
                    ChunkSampleStream a = m16960a(trackGroupInfo, trackSelectionArr[i], j);
                    sparseArray.put(indexOf, a);
                    sampleStreamArr[i] = a;
                    zArr2[i] = true;
                }
            }
            i++;
        }
    }

    /* renamed from: a */
    private void m16963a(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, List<C3685a> list) {
        int i = 0;
        while (i < trackSelectionArr.length) {
            if (sampleStreamArr[i] instanceof C3685a) {
                C3685a c3685a = (C3685a) sampleStreamArr[i];
                if (trackSelectionArr[i] != null) {
                    if (zArr[i]) {
                        list.add(c3685a);
                    }
                }
                sampleStreamArr[i] = null;
            }
            if (sampleStreamArr[i] == null && trackSelectionArr[i] != null) {
                TrackGroupInfo trackGroupInfo = this.f13690h[this.f13689g.indexOf(trackSelectionArr[i].getTrackGroup())];
                if (trackGroupInfo.f6310c == 2) {
                    C3685a c3685a2 = new C3685a((C2196c) this.f13700r.get(trackGroupInfo.f6311d), trackSelectionArr[i].getTrackGroup().getFormat(0), this.f13698p.f11435d);
                    sampleStreamArr[i] = c3685a2;
                    zArr2[i] = true;
                    list.add(c3685a2);
                }
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m16965b(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j, SparseArray<ChunkSampleStream<DashChunkSource>> sparseArray) {
        int i = 0;
        while (i < trackSelectionArr.length) {
            if (((sampleStreamArr[i] instanceof C3678a) || (sampleStreamArr[i] instanceof C3687f)) && (trackSelectionArr[i] == null || !zArr[i])) {
                m16961a(sampleStreamArr[i]);
                sampleStreamArr[i] = null;
            }
            if (trackSelectionArr[i] != null) {
                TrackGroupInfo trackGroupInfo = this.f13690h[this.f13689g.indexOf(trackSelectionArr[i].getTrackGroup())];
                if (trackGroupInfo.f6310c == 1) {
                    ChunkSampleStream chunkSampleStream = (ChunkSampleStream) sparseArray.get(trackGroupInfo.f6312e);
                    SampleStream sampleStream = sampleStreamArr[i];
                    boolean z = chunkSampleStream == null ? sampleStream instanceof C3687f : (sampleStream instanceof C3678a) && ((C3678a) sampleStream).f11387a == chunkSampleStream;
                    if (!z) {
                        C3687f c3687f;
                        m16961a(sampleStream);
                        if (chunkSampleStream == null) {
                            c3687f = new C3687f();
                        } else {
                            c3687f = chunkSampleStream.m13936a(j, trackGroupInfo.f6309b);
                        }
                        sampleStreamArr[i] = c3687f;
                        zArr2[i] = true;
                    }
                }
            }
            i++;
        }
    }

    public void discardBuffer(long j, boolean z) {
        for (ChunkSampleStream a : this.f13695m) {
            a.m13938a(j, z);
        }
    }

    public void reevaluateBuffer(long j) {
        this.f13697o.reevaluateBuffer(j);
    }

    public boolean continueLoading(long j) {
        return this.f13697o.continueLoading(j);
    }

    public long getNextLoadPositionUs() {
        return this.f13697o.getNextLoadPositionUs();
    }

    public long readDiscontinuity() {
        if (!this.f13701s) {
            this.f13685c.m7843c();
            this.f13701s = true;
        }
        return -9223372036854775807L;
    }

    public long getBufferedPositionUs() {
        return this.f13697o.getBufferedPositionUs();
    }

    public long seekToUs(long j) {
        for (ChunkSampleStream a : this.f13695m) {
            a.m13937a(j);
        }
        for (C3685a a2 : this.f13696n) {
            a2.m13959a(j);
        }
        return j;
    }

    public long getAdjustedSeekPositionUs(long j, C2162p c2162p) {
        for (ChunkSampleStream chunkSampleStream : this.f13695m) {
            if (chunkSampleStream.f11392a == 2) {
                return chunkSampleStream.m13935a(j, c2162p);
            }
        }
        return j;
    }

    /* renamed from: a */
    public void m16966a(ChunkSampleStream<DashChunkSource> chunkSampleStream) {
        this.f13694l.onContinueLoadingRequested(this);
    }

    /* renamed from: a */
    private ChunkSampleStream<DashChunkSource> m16960a(TrackGroupInfo trackGroupInfo, TrackSelection trackSelection, long j) {
        int i;
        DashMediaPeriod dashMediaPeriod = this;
        TrackGroupInfo trackGroupInfo2 = trackGroupInfo;
        int[] iArr = new int[2];
        Format[] formatArr = new Format[2];
        boolean z = trackGroupInfo2.f6313f != -1;
        if (z) {
            formatArr[0] = dashMediaPeriod.f13689g.get(trackGroupInfo2.f6313f).getFormat(0);
            iArr[0] = 4;
            i = 1;
        } else {
            i = 0;
        }
        boolean z2 = trackGroupInfo2.f6314g != -1;
        if (z2) {
            formatArr[i] = dashMediaPeriod.f13689g.get(trackGroupInfo2.f6314g).getFormat(0);
            int i2 = i + 1;
            iArr[i] = 3;
            i = i2;
        }
        if (i < iArr.length) {
            formatArr = (Format[]) Arrays.copyOf(formatArr, i);
            iArr = Arrays.copyOf(iArr, i);
        }
        Format[] formatArr2 = formatArr;
        C3683b a = (dashMediaPeriod.f13698p.f11435d && z) ? dashMediaPeriod.f13692j.m7876a() : null;
        C3683b c3683b = a;
        C3683b c3683b2 = c3683b;
        ChunkSampleStream<DashChunkSource> chunkSampleStream = new ChunkSampleStream(trackGroupInfo2.f6309b, iArr, formatArr2, dashMediaPeriod.f13683a.createDashChunkSource(dashMediaPeriod.f13687e, dashMediaPeriod.f13698p, dashMediaPeriod.f13699q, trackGroupInfo2.f6308a, trackSelection, trackGroupInfo2.f6309b, dashMediaPeriod.f13686d, z, z2, c3683b), dashMediaPeriod, dashMediaPeriod.f13688f, j, dashMediaPeriod.f13684b, dashMediaPeriod.f13685c);
        synchronized (this) {
            try {
                dashMediaPeriod.f13693k.put(chunkSampleStream, c3683b2);
            } catch (Throwable th) {
                Throwable th2 = th;
            }
        }
        return chunkSampleStream;
    }

    /* renamed from: a */
    private static ChunkSampleStream<DashChunkSource>[] m16964a(int i) {
        return new ChunkSampleStream[i];
    }

    /* renamed from: a */
    private static void m16961a(SampleStream sampleStream) {
        if (sampleStream instanceof C3678a) {
            ((C3678a) sampleStream).m13920a();
        }
    }
}
