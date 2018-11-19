package com.google.android.exoplayer2.text.p067c;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.c.b */
final class C3704b implements Subtitle {
    /* renamed from: a */
    private final List<Cue> f11562a;

    public long getEventTime(int i) {
        return 0;
    }

    public int getEventTimeCount() {
        return 1;
    }

    public int getNextEventTimeIndex(long j) {
        return -1;
    }

    public C3704b(List<Cue> list) {
        this.f11562a = list;
    }

    public List<Cue> getCues(long j) {
        return this.f11562a;
    }
}
