package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.C4249g;
import com.google.android.exoplayer2.trackselection.TrackSelection.Factory;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.C2314v;
import com.google.android.exoplayer2.util.Clock;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.trackselection.a */
public class C4261a extends C3713b {
    /* renamed from: d */
    private final BandwidthMeter f13800d;
    /* renamed from: e */
    private final long f13801e;
    /* renamed from: f */
    private final long f13802f;
    /* renamed from: g */
    private final long f13803g;
    /* renamed from: h */
    private final float f13804h;
    /* renamed from: i */
    private final float f13805i;
    /* renamed from: j */
    private final long f13806j;
    /* renamed from: k */
    private final Clock f13807k;
    /* renamed from: l */
    private float f13808l = 1.0f;
    /* renamed from: m */
    private int f13809m = m17070a(0);
    /* renamed from: n */
    private int f13810n = 1;
    /* renamed from: o */
    private long f13811o = 1;

    /* renamed from: com.google.android.exoplayer2.trackselection.a$a */
    public static final class C3712a implements Factory {
        /* renamed from: a */
        private final BandwidthMeter f11580a;
        /* renamed from: b */
        private final int f11581b;
        /* renamed from: c */
        private final int f11582c;
        /* renamed from: d */
        private final int f11583d;
        /* renamed from: e */
        private final float f11584e;
        /* renamed from: f */
        private final float f11585f;
        /* renamed from: g */
        private final long f11586g;
        /* renamed from: h */
        private final Clock f11587h;

        public /* synthetic */ TrackSelection createTrackSelection(TrackGroup trackGroup, int[] iArr) {
            return m14039a(trackGroup, iArr);
        }

        public C3712a(BandwidthMeter bandwidthMeter) {
            this(bandwidthMeter, 10000, 25000, 25000, 0.75f, 0.75f, DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL, Clock.f6878a);
        }

        public C3712a(BandwidthMeter bandwidthMeter, int i, int i2, int i3, float f, float f2, long j, Clock clock) {
            this.f11580a = bandwidthMeter;
            this.f11581b = i;
            this.f11582c = i2;
            this.f11583d = i3;
            this.f11584e = f;
            this.f11585f = f2;
            this.f11586g = j;
            this.f11587h = clock;
        }

        /* renamed from: a */
        public C4261a m14039a(TrackGroup trackGroup, int... iArr) {
            return new C4261a(trackGroup, iArr, this.f11580a, (long) this.f11581b, (long) this.f11582c, (long) this.f11583d, this.f11584e, this.f11585f, this.f11586g, this.f11587h);
        }
    }

    public Object getSelectionData() {
        return null;
    }

    public C4261a(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter, long j, long j2, long j3, float f, float f2, long j4, Clock clock) {
        super(trackGroup, iArr);
        this.f13800d = bandwidthMeter;
        this.f13801e = j * 1000;
        this.f13802f = j2 * 1000;
        this.f13803g = j3 * 1000;
        this.f13804h = f;
        this.f13805i = f2;
        this.f13806j = j4;
        this.f13807k = clock;
    }

    public void enable() {
        this.f13811o = -9223372036854775807L;
    }

    public void onPlaybackSpeed(float f) {
        this.f13808l = f;
    }

    public void updateSelectedTrack(long j, long j2, long j3) {
        j = this.f13807k.elapsedRealtime();
        int i = this.f13809m;
        this.f13809m = m17070a(j);
        if (this.f13809m != i) {
            if (m14040a(i, j) == null) {
                j = getFormat(i);
                Format format = getFormat(this.f13809m);
                if (format.bitrate > j.bitrate && j2 < m17071b(j3)) {
                    this.f13809m = i;
                } else if (format.bitrate < j.bitrate && j2 >= this.f13802f) {
                    this.f13809m = i;
                }
            }
            if (this.f13809m != i) {
                this.f13810n = 3;
            }
        }
    }

    public int getSelectedIndex() {
        return this.f13809m;
    }

    public int getSelectionReason() {
        return this.f13810n;
    }

    public int evaluateQueueSize(long j, List<? extends C4249g> list) {
        long elapsedRealtime = this.f13807k.elapsedRealtime();
        if (this.f13811o != -9223372036854775807L && elapsedRealtime - this.f13811o < this.f13806j) {
            return list.size();
        }
        this.f13811o = elapsedRealtime;
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (C2314v.m8485b(((C4249g) list.get(size - 1)).g - j, this.f13808l) < this.f13803g) {
            return size;
        }
        Format format = getFormat(m17070a(elapsedRealtime));
        while (i < size) {
            C4249g c4249g = (C4249g) list.get(i);
            Format format2 = c4249g.d;
            if (C2314v.m8485b(c4249g.g - j, this.f13808l) >= this.f13803g && format2.bitrate < format.bitrate && format2.height != -1 && format2.height < 720 && format2.width != -1 && format2.width < 1280 && format2.height < format.height) {
                return i;
            }
            i++;
        }
        return size;
    }

    /* renamed from: a */
    private int m17070a(long j) {
        long bitrateEstimate = (long) (((float) this.f13800d.getBitrateEstimate()) * this.f13804h);
        int i = 0;
        int i2 = 0;
        while (i < this.b) {
            if (j == Long.MIN_VALUE || !m14040a(i, j)) {
                if (((long) Math.round(((float) getFormat(i).bitrate) * this.f13808l)) <= bitrateEstimate) {
                    return i;
                }
                i2 = i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    private long m17071b(long j) {
        Object obj = (j == -9223372036854775807L || j > this.f13801e) ? null : 1;
        return obj != null ? (long) (((float) j) * this.f13805i) : this.f13801e;
    }
}
