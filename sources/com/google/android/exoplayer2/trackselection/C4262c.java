package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.TrackGroup;

/* renamed from: com.google.android.exoplayer2.trackselection.c */
public final class C4262c extends C3713b {
    /* renamed from: d */
    private final int f13812d;
    /* renamed from: e */
    private final Object f13813e;

    public int getSelectedIndex() {
        return 0;
    }

    public void updateSelectedTrack(long j, long j2, long j3) {
    }

    public C4262c(TrackGroup trackGroup, int i) {
        this(trackGroup, i, 0, null);
    }

    public C4262c(TrackGroup trackGroup, int i, int i2, Object obj) {
        super(trackGroup, i);
        this.f13812d = i2;
        this.f13813e = obj;
    }

    public int getSelectionReason() {
        return this.f13812d;
    }

    public Object getSelectionData() {
        return this.f13813e;
    }
}
