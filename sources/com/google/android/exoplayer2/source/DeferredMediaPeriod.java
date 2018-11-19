package com.google.android.exoplayer2.source;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.C2162p;
import com.google.android.exoplayer2.source.MediaPeriod.Callback;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import java.io.IOException;

public final class DeferredMediaPeriod implements MediaPeriod, Callback {
    /* renamed from: a */
    public final MediaSource f13643a;
    /* renamed from: b */
    public final C2166a f13644b;
    /* renamed from: c */
    private final Allocator f13645c;
    /* renamed from: d */
    private MediaPeriod f13646d;
    /* renamed from: e */
    private Callback f13647e;
    /* renamed from: f */
    private long f13648f;
    @Nullable
    /* renamed from: g */
    private PrepareErrorListener f13649g;
    /* renamed from: h */
    private boolean f13650h;
    /* renamed from: i */
    private long f13651i = 1;

    public interface PrepareErrorListener {
        void onPrepareError(C2166a c2166a, IOException iOException);
    }

    public /* synthetic */ void onContinueLoadingRequested(SequenceableLoader sequenceableLoader) {
        m16932a((MediaPeriod) sequenceableLoader);
    }

    public DeferredMediaPeriod(MediaSource mediaSource, C2166a c2166a, Allocator allocator) {
        this.f13644b = c2166a;
        this.f13645c = allocator;
        this.f13643a = mediaSource;
    }

    /* renamed from: a */
    public void m16931a(PrepareErrorListener prepareErrorListener) {
        this.f13649g = prepareErrorListener;
    }

    /* renamed from: a */
    public void m16930a() {
        this.f13646d = this.f13643a.createPeriod(this.f13644b, this.f13645c);
        if (this.f13647e != null) {
            this.f13646d.prepare(this, this.f13648f);
        }
    }

    /* renamed from: b */
    public void m16933b() {
        if (this.f13646d != null) {
            this.f13643a.releasePeriod(this.f13646d);
        }
    }

    public void prepare(Callback callback, long j) {
        this.f13647e = callback;
        this.f13648f = j;
        if (this.f13646d != null) {
            this.f13646d.prepare(this, j);
        }
    }

    public void maybeThrowPrepareError() throws IOException {
        try {
            if (this.f13646d != null) {
                this.f13646d.maybeThrowPrepareError();
            } else {
                this.f13643a.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e) {
            if (this.f13649g == null) {
                throw e;
            } else if (!this.f13650h) {
                this.f13650h = true;
                this.f13649g.onPrepareError(this.f13644b, e);
            }
        }
    }

    public TrackGroupArray getTrackGroups() {
        return this.f13646d.getTrackGroups();
    }

    public long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2;
        if (this.f13651i == -9223372036854775807L || j != 0) {
            j2 = j;
        } else {
            long j3 = r0.f13651i;
            r0.f13651i = -9223372036854775807L;
            j2 = j3;
        }
        return r0.f13646d.selectTracks(trackSelectionArr, zArr, sampleStreamArr, zArr2, j2);
    }

    public void discardBuffer(long j, boolean z) {
        this.f13646d.discardBuffer(j, z);
    }

    public long readDiscontinuity() {
        return this.f13646d.readDiscontinuity();
    }

    public long getBufferedPositionUs() {
        return this.f13646d.getBufferedPositionUs();
    }

    public long seekToUs(long j) {
        return this.f13646d.seekToUs(j);
    }

    public long getAdjustedSeekPositionUs(long j, C2162p c2162p) {
        return this.f13646d.getAdjustedSeekPositionUs(j, c2162p);
    }

    public long getNextLoadPositionUs() {
        return this.f13646d.getNextLoadPositionUs();
    }

    public void reevaluateBuffer(long j) {
        this.f13646d.reevaluateBuffer(j);
    }

    public boolean continueLoading(long j) {
        return (this.f13646d == null || this.f13646d.continueLoading(j) == null) ? 0 : 1;
    }

    /* renamed from: a */
    public void m16932a(MediaPeriod mediaPeriod) {
        this.f13647e.onContinueLoadingRequested(this);
    }

    public void onPrepared(MediaPeriod mediaPeriod) {
        this.f13647e.onPrepared(this);
    }
}
