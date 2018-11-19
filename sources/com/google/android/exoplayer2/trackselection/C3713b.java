package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.C4249g;
import com.google.android.exoplayer2.util.C2289a;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.trackselection.b */
public abstract class C3713b implements TrackSelection {
    /* renamed from: a */
    protected final TrackGroup f11588a;
    /* renamed from: b */
    protected final int f11589b;
    /* renamed from: c */
    protected final int[] f11590c;
    /* renamed from: d */
    private final Format[] f11591d;
    /* renamed from: e */
    private final long[] f11592e;
    /* renamed from: f */
    private int f11593f;

    /* renamed from: com.google.android.exoplayer2.trackselection.b$a */
    private static final class C2253a implements Comparator<Format> {
        private C2253a() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m8116a((Format) obj, (Format) obj2);
        }

        /* renamed from: a */
        public int m8116a(Format format, Format format2) {
            return format2.bitrate - format.bitrate;
        }
    }

    public void disable() {
    }

    public void enable() {
    }

    public void onPlaybackSpeed(float f) {
    }

    public C3713b(TrackGroup trackGroup, int... iArr) {
        C2289a.m8313b(iArr.length > 0);
        this.f11588a = (TrackGroup) C2289a.m8309a((Object) trackGroup);
        this.f11589b = iArr.length;
        this.f11591d = new Format[this.f11589b];
        for (int i = 0; i < iArr.length; i++) {
            this.f11591d[i] = trackGroup.getFormat(iArr[i]);
        }
        Arrays.sort(this.f11591d, new C2253a());
        this.f11590c = new int[this.f11589b];
        for (int i2 = 0; i2 < this.f11589b; i2++) {
            this.f11590c[i2] = trackGroup.indexOf(this.f11591d[i2]);
        }
        this.f11592e = new long[this.f11589b];
    }

    public final TrackGroup getTrackGroup() {
        return this.f11588a;
    }

    public final int length() {
        return this.f11590c.length;
    }

    public final Format getFormat(int i) {
        return this.f11591d[i];
    }

    public final int getIndexInTrackGroup(int i) {
        return this.f11590c[i];
    }

    public final int indexOf(Format format) {
        for (int i = 0; i < this.f11589b; i++) {
            if (this.f11591d[i] == format) {
                return i;
            }
        }
        return -1;
    }

    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.f11589b; i2++) {
            if (this.f11590c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final Format getSelectedFormat() {
        return this.f11591d[getSelectedIndex()];
    }

    public final int getSelectedIndexInTrackGroup() {
        return this.f11590c[getSelectedIndex()];
    }

    public int evaluateQueueSize(long j, List<? extends C4249g> list) {
        return list.size();
    }

    public final boolean blacklist(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a = m14040a(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.f11589b && !a) {
            a = (i2 == i || m14040a(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!a) {
            return false;
        }
        this.f11592e[i] = Math.max(this.f11592e[i], elapsedRealtime + j);
        return true;
    }

    /* renamed from: a */
    protected final boolean m14040a(int i, long j) {
        return this.f11592e[i] > j;
    }

    public int hashCode() {
        if (this.f11593f == 0) {
            this.f11593f = (System.identityHashCode(this.f11588a) * 31) + Arrays.hashCode(this.f11590c);
        }
        return this.f11593f;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C3713b c3713b = (C3713b) obj;
                if (this.f11588a != c3713b.f11588a || Arrays.equals(this.f11590c, c3713b.f11590c) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }
}
