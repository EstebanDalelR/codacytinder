package com.google.android.exoplayer2.text.p084f;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.C2289a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.f.b */
final class C3707b implements Subtitle {
    /* renamed from: a */
    public static final C3707b f11567a = new C3707b();
    /* renamed from: b */
    private final List<Cue> f11568b;

    public int getEventTimeCount() {
        return 1;
    }

    public int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }

    public C3707b(Cue cue) {
        this.f11568b = Collections.singletonList(cue);
    }

    private C3707b() {
        this.f11568b = Collections.emptyList();
    }

    public long getEventTime(int i) {
        C2289a.m8311a(i == 0);
        return 0;
    }

    public List<Cue> getCues(long j) {
        return j >= 0 ? this.f11568b : Collections.emptyList();
    }
}
