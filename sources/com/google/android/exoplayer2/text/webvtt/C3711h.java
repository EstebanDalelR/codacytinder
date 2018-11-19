package com.google.android.exoplayer2.text.webvtt;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.webvtt.h */
final class C3711h implements Subtitle {
    /* renamed from: a */
    private final List<C3710d> f11576a;
    /* renamed from: b */
    private final int f11577b;
    /* renamed from: c */
    private final long[] f11578c = new long[(this.f11577b * 2)];
    /* renamed from: d */
    private final long[] f11579d;

    public C3711h(List<C3710d> list) {
        this.f11576a = list;
        this.f11577b = list.size();
        for (int i = 0; i < this.f11577b; i++) {
            C3710d c3710d = (C3710d) list.get(i);
            int i2 = i * 2;
            this.f11578c[i2] = c3710d.f11574o;
            this.f11578c[i2 + 1] = c3710d.f11575p;
        }
        this.f11579d = Arrays.copyOf(this.f11578c, this.f11578c.length);
        Arrays.sort(this.f11579d);
    }

    public int getNextEventTimeIndex(long j) {
        j = C2314v.m8484b(this.f11579d, j, false, false);
        return j < this.f11579d.length ? j : -1;
    }

    public int getEventTimeCount() {
        return this.f11579d.length;
    }

    public long getEventTime(int i) {
        boolean z = false;
        C2289a.m8311a(i >= 0);
        if (i < this.f11579d.length) {
            z = true;
        }
        C2289a.m8311a(z);
        return this.f11579d[i];
    }

    public List<Cue> getCues(long j) {
        CharSequence charSequence = null;
        List list = null;
        C3710d c3710d = list;
        for (int i = 0; i < this.f11577b; i++) {
            int i2 = i * 2;
            if (this.f11578c[i2] <= j && j < this.f11578c[i2 + 1]) {
                if (list == null) {
                    list = new ArrayList();
                }
                C3710d c3710d2 = (C3710d) this.f11576a.get(i);
                if (!c3710d2.m14038a()) {
                    list.add(c3710d2);
                } else if (c3710d == null) {
                    c3710d = c3710d2;
                } else if (charSequence == null) {
                    charSequence = new SpannableStringBuilder();
                    charSequence.append(c3710d.a).append("\n").append(c3710d2.a);
                } else {
                    charSequence.append("\n").append(c3710d2.a);
                }
            }
        }
        if (charSequence != null) {
            list.add(new C3710d(charSequence));
        } else if (c3710d != null) {
            list.add(c3710d);
        }
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }
}
