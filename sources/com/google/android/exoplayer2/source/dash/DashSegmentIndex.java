package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.source.dash.p063a.C2198e;

public interface DashSegmentIndex {
    long getDurationUs(long j, long j2);

    long getFirstSegmentNum();

    int getSegmentCount(long j);

    long getSegmentNum(long j, long j2);

    C2198e getSegmentUrl(long j);

    long getTimeUs(long j);

    boolean isExplicit();
}
