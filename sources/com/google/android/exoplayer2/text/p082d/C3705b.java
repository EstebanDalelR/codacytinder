package com.google.android.exoplayer2.text.p082d;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.d.b */
final class C3705b implements Subtitle {
    /* renamed from: a */
    private final Cue[] f11563a;
    /* renamed from: b */
    private final long[] f11564b;

    public C3705b(Cue[] cueArr, long[] jArr) {
        this.f11563a = cueArr;
        this.f11564b = jArr;
    }

    public int getNextEventTimeIndex(long j) {
        j = C2314v.m8484b(this.f11564b, j, false, false);
        return j < this.f11564b.length ? j : -1;
    }

    public int getEventTimeCount() {
        return this.f11564b.length;
    }

    public long getEventTime(int i) {
        boolean z = false;
        C2289a.m8311a(i >= 0);
        if (i < this.f11564b.length) {
            z = true;
        }
        C2289a.m8311a(z);
        return this.f11564b[i];
    }

    public List<Cue> getCues(long j) {
        j = C2314v.m8460a(this.f11564b, j, true, false);
        if (j != -1) {
            if (this.f11563a[j] != null) {
                return Collections.singletonList(this.f11563a[j]);
            }
        }
        return Collections.emptyList();
    }
}
