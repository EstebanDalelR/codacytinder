package com.google.android.exoplayer2.text.p066b;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.b.c */
final class C3703c implements Subtitle {
    /* renamed from: a */
    private final List<Cue> f11561a;

    public long getEventTime(int i) {
        return 0;
    }

    public int getEventTimeCount() {
        return 1;
    }

    public int getNextEventTimeIndex(long j) {
        return -1;
    }

    public C3703c(List<Cue> list) {
        this.f11561a = list;
    }

    public List<Cue> getCues(long j) {
        return this.f11561a;
    }
}
