package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C2162p;
import com.google.android.exoplayer2.source.MediaPeriod.Callback;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.util.C2289a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* renamed from: com.google.android.exoplayer2.source.j */
final class C4255j implements MediaPeriod, Callback {
    /* renamed from: a */
    public final MediaPeriod[] f13763a;
    /* renamed from: b */
    private final IdentityHashMap<SampleStream, Integer> f13764b;
    /* renamed from: c */
    private final CompositeSequenceableLoaderFactory f13765c;
    /* renamed from: d */
    private final ArrayList<MediaPeriod> f13766d = new ArrayList();
    /* renamed from: e */
    private Callback f13767e;
    /* renamed from: f */
    private TrackGroupArray f13768f;
    /* renamed from: g */
    private MediaPeriod[] f13769g;
    /* renamed from: h */
    private SequenceableLoader f13770h;

    public /* synthetic */ void onContinueLoadingRequested(SequenceableLoader sequenceableLoader) {
        m17013a((MediaPeriod) sequenceableLoader);
    }

    public C4255j(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, MediaPeriod... mediaPeriodArr) {
        this.f13765c = compositeSequenceableLoaderFactory;
        this.f13763a = mediaPeriodArr;
        this.f13770h = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(new SequenceableLoader[null]);
        this.f13764b = new IdentityHashMap();
    }

    public void prepare(Callback callback, long j) {
        this.f13767e = callback;
        Collections.addAll(this.f13766d, this.f13763a);
        for (MediaPeriod prepare : this.f13763a) {
            prepare.prepare(this, j);
        }
    }

    public void maybeThrowPrepareError() throws IOException {
        for (MediaPeriod maybeThrowPrepareError : this.f13763a) {
            maybeThrowPrepareError.maybeThrowPrepareError();
        }
    }

    public TrackGroupArray getTrackGroups() {
        return this.f13768f;
    }

    public long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        ArrayList arrayList;
        C4255j c4255j = this;
        TrackSelection[] trackSelectionArr2 = trackSelectionArr;
        SampleStream[] sampleStreamArr2 = sampleStreamArr;
        int[] iArr = new int[trackSelectionArr2.length];
        int[] iArr2 = new int[trackSelectionArr2.length];
        for (int i = 0; i < trackSelectionArr2.length; i++) {
            int i2;
            if (sampleStreamArr2[i] == null) {
                i2 = -1;
            } else {
                i2 = ((Integer) c4255j.f13764b.get(sampleStreamArr2[i])).intValue();
            }
            iArr[i] = i2;
            iArr2[i] = -1;
            if (trackSelectionArr2[i] != null) {
                TrackGroup trackGroup = trackSelectionArr2[i].getTrackGroup();
                for (int i3 = 0; i3 < c4255j.f13763a.length; i3++) {
                    if (c4255j.f13763a[i3].getTrackGroups().indexOf(trackGroup) != -1) {
                        iArr2[i] = i3;
                        break;
                    }
                }
            }
        }
        c4255j.f13764b.clear();
        Object obj = new SampleStream[trackSelectionArr2.length];
        SampleStream[] sampleStreamArr3 = new SampleStream[trackSelectionArr2.length];
        TrackSelection[] trackSelectionArr3 = new TrackSelection[trackSelectionArr2.length];
        ArrayList arrayList2 = new ArrayList(c4255j.f13763a.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < c4255j.f13763a.length) {
            int i5 = 0;
            while (i5 < trackSelectionArr2.length) {
                TrackSelection trackSelection = null;
                sampleStreamArr3[i5] = iArr[i5] == i4 ? sampleStreamArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    trackSelection = trackSelectionArr2[i5];
                }
                trackSelectionArr3[i5] = trackSelection;
                i5++;
            }
            arrayList = arrayList2;
            TrackSelection[] trackSelectionArr4 = trackSelectionArr3;
            int i6 = i4;
            long selectTracks = c4255j.f13763a[i4].selectTracks(trackSelectionArr3, zArr, sampleStreamArr3, zArr2, j2);
            if (i6 == 0) {
                j2 = selectTracks;
            } else if (selectTracks != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            Object obj2 = null;
            for (i5 = 0; i5 < trackSelectionArr2.length; i5++) {
                boolean z = true;
                if (iArr2[i5] == i6) {
                    C2289a.m8313b(sampleStreamArr3[i5] != null);
                    obj[i5] = sampleStreamArr3[i5];
                    c4255j.f13764b.put(sampleStreamArr3[i5], Integer.valueOf(i6));
                    obj2 = 1;
                } else if (iArr[i5] == i6) {
                    if (sampleStreamArr3[i5] != null) {
                        z = false;
                    }
                    C2289a.m8313b(z);
                }
            }
            if (obj2 != null) {
                arrayList.add(c4255j.f13763a[i6]);
            }
            i4 = i6 + 1;
            arrayList2 = arrayList;
            trackSelectionArr3 = trackSelectionArr4;
        }
        arrayList = arrayList2;
        System.arraycopy(obj, 0, sampleStreamArr2, 0, obj.length);
        c4255j.f13769g = new MediaPeriod[arrayList.size()];
        arrayList.toArray(c4255j.f13769g);
        c4255j.f13770h = c4255j.f13765c.createCompositeSequenceableLoader(c4255j.f13769g);
        return j2;
    }

    public void discardBuffer(long j, boolean z) {
        for (MediaPeriod discardBuffer : this.f13769g) {
            discardBuffer.discardBuffer(j, z);
        }
    }

    public void reevaluateBuffer(long j) {
        this.f13770h.reevaluateBuffer(j);
    }

    public boolean continueLoading(long j) {
        if (this.f13766d.isEmpty()) {
            return this.f13770h.continueLoading(j);
        }
        int size = this.f13766d.size();
        for (int i = 0; i < size; i++) {
            ((MediaPeriod) this.f13766d.get(i)).continueLoading(j);
        }
        return false;
    }

    public long getNextLoadPositionUs() {
        return this.f13770h.getNextLoadPositionUs();
    }

    public long readDiscontinuity() {
        long readDiscontinuity = this.f13763a[0].readDiscontinuity();
        for (int i = 1; i < this.f13763a.length; i++) {
            if (this.f13763a[i].readDiscontinuity() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity.");
            }
        }
        if (readDiscontinuity != -9223372036854775807L) {
            MediaPeriod[] mediaPeriodArr = this.f13769g;
            int length = mediaPeriodArr.length;
            int i2 = 0;
            while (i2 < length) {
                MediaPeriod mediaPeriod = mediaPeriodArr[i2];
                if (mediaPeriod == this.f13763a[0] || mediaPeriod.seekToUs(readDiscontinuity) == readDiscontinuity) {
                    i2++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            }
        }
        return readDiscontinuity;
    }

    public long getBufferedPositionUs() {
        return this.f13770h.getBufferedPositionUs();
    }

    public long seekToUs(long j) {
        j = this.f13769g[0].seekToUs(j);
        for (int i = 1; i < this.f13769g.length; i++) {
            if (this.f13769g[i].seekToUs(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    public long getAdjustedSeekPositionUs(long j, C2162p c2162p) {
        return this.f13769g[0].getAdjustedSeekPositionUs(j, c2162p);
    }

    public void onPrepared(MediaPeriod mediaPeriod) {
        this.f13766d.remove(mediaPeriod);
        if (this.f13766d.isEmpty() != null) {
            int i = 0;
            for (MediaPeriod trackGroups : this.f13763a) {
                i += trackGroups.getTrackGroups().length;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i];
            MediaPeriod[] mediaPeriodArr = this.f13763a;
            int length = mediaPeriodArr.length;
            i = 0;
            int i2 = 0;
            while (i < length) {
                TrackGroupArray trackGroups2 = mediaPeriodArr[i].getTrackGroups();
                int i3 = trackGroups2.length;
                int i4 = i2;
                i2 = 0;
                while (i2 < i3) {
                    int i5 = i4 + 1;
                    trackGroupArr[i4] = trackGroups2.get(i2);
                    i2++;
                    i4 = i5;
                }
                i++;
                i2 = i4;
            }
            this.f13768f = new TrackGroupArray(trackGroupArr);
            this.f13767e.onPrepared(this);
        }
    }

    /* renamed from: a */
    public void m17013a(MediaPeriod mediaPeriod) {
        this.f13767e.onContinueLoadingRequested(this);
    }
}
