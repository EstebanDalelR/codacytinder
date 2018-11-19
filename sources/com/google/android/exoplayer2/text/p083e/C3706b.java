package com.google.android.exoplayer2.text.p083e;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.e.b */
final class C3706b implements Subtitle {
    /* renamed from: a */
    private final Cue[] f11565a;
    /* renamed from: b */
    private final long[] f11566b;

    public C3706b(Cue[] cueArr, long[] jArr) {
        this.f11565a = cueArr;
        this.f11566b = jArr;
    }

    public int getNextEventTimeIndex(long j) {
        j = C2314v.m8484b(this.f11566b, j, false, false);
        return j < this.f11566b.length ? j : -1;
    }

    public int getEventTimeCount() {
        return this.f11566b.length;
    }

    public long getEventTime(int i) {
        boolean z = false;
        C2289a.m8311a(i >= 0);
        if (i < this.f11566b.length) {
            z = true;
        }
        C2289a.m8311a(z);
        return this.f11566b[i];
    }

    public List<Cue> getCues(long j) {
        j = C2314v.m8460a(this.f11566b, j, true, false);
        if (j != -1) {
            if (this.f11565a[j] != null) {
                return Collections.singletonList(this.f11565a[j]);
            }
        }
        return Collections.emptyList();
    }
}
