package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.C2289a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.webvtt.c */
final class C3709c implements Subtitle {
    /* renamed from: a */
    private final List<Cue> f11573a;

    public int getEventTimeCount() {
        return 1;
    }

    public int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }

    public C3709c(List<Cue> list) {
        this.f11573a = Collections.unmodifiableList(list);
    }

    public long getEventTime(int i) {
        C2289a.m8311a(i == 0);
        return 0;
    }

    public List<Cue> getCues(long j) {
        return j >= 0 ? this.f11573a : Collections.emptyList();
    }
}
