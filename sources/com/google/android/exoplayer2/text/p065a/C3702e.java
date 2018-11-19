package com.google.android.exoplayer2.text.p065a;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.C2289a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.a.e */
final class C3702e implements Subtitle {
    /* renamed from: a */
    private final List<Cue> f11560a;

    public int getEventTimeCount() {
        return 1;
    }

    public int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }

    public C3702e(List<Cue> list) {
        this.f11560a = list;
    }

    public long getEventTime(int i) {
        C2289a.m8311a(i == 0);
        return 0;
    }

    public List<Cue> getCues(long j) {
        return j >= 0 ? this.f11560a : Collections.emptyList();
    }
}
