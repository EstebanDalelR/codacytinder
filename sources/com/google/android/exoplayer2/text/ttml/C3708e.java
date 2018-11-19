package com.google.android.exoplayer2.text.ttml;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.C2314v;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.text.ttml.e */
final class C3708e implements Subtitle {
    /* renamed from: a */
    private final C2236b f11569a;
    /* renamed from: b */
    private final long[] f11570b;
    /* renamed from: c */
    private final Map<String, TtmlStyle> f11571c;
    /* renamed from: d */
    private final Map<String, C2237c> f11572d;

    public C3708e(C2236b c2236b, Map<String, TtmlStyle> map, Map<String, C2237c> map2) {
        this.f11569a = c2236b;
        this.f11572d = map2;
        this.f11571c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f11570b = c2236b.m8025b();
    }

    public int getNextEventTimeIndex(long j) {
        j = C2314v.m8484b(this.f11570b, j, false, false);
        return j < this.f11570b.length ? j : -1;
    }

    public int getEventTimeCount() {
        return this.f11570b.length;
    }

    public long getEventTime(int i) {
        return this.f11570b[i];
    }

    public List<Cue> getCues(long j) {
        return this.f11569a.m8022a(j, this.f11571c, this.f11572d);
    }
}
