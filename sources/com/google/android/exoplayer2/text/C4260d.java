package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.C3600d;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.d */
public abstract class C4260d extends C3600d implements Subtitle {
    /* renamed from: c */
    private Subtitle f13795c;
    /* renamed from: d */
    private long f13796d;

    /* renamed from: e */
    public abstract void mo3739e();

    /* renamed from: a */
    public void m17039a(long j, Subtitle subtitle, long j2) {
        this.a = j;
        this.f13795c = subtitle;
        if (j2 == Format.OFFSET_SAMPLE_RELATIVE) {
            j2 = this.a;
        }
        this.f13796d = j2;
    }

    public int getEventTimeCount() {
        return this.f13795c.getEventTimeCount();
    }

    public long getEventTime(int i) {
        return this.f13795c.getEventTime(i) + this.f13796d;
    }

    public int getNextEventTimeIndex(long j) {
        return this.f13795c.getNextEventTimeIndex(j - this.f13796d);
    }

    public List<Cue> getCues(long j) {
        return this.f13795c.getCues(j - this.f13796d);
    }

    /* renamed from: a */
    public void mo2221a() {
        super.mo2221a();
        this.f13795c = null;
    }
}
