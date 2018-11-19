package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2309o;
import com.google.android.exoplayer2.util.Clock;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;

/* renamed from: com.google.android.exoplayer2.upstream.e */
public final class C3722e implements BandwidthMeter, TransferListener<Object> {
    @Nullable
    /* renamed from: a */
    private final Handler f11737a;
    @Nullable
    /* renamed from: b */
    private final EventListener f11738b;
    /* renamed from: c */
    private final C2309o f11739c;
    /* renamed from: d */
    private final Clock f11740d;
    /* renamed from: e */
    private int f11741e;
    /* renamed from: f */
    private long f11742f;
    /* renamed from: g */
    private long f11743g;
    /* renamed from: h */
    private long f11744h;
    /* renamed from: i */
    private long f11745i;
    /* renamed from: j */
    private long f11746j;

    public C3722e() {
        this(null, null, 1000000, 2000, Clock.f6878a);
    }

    private C3722e(@Nullable Handler handler, @Nullable EventListener eventListener, long j, int i, Clock clock) {
        this.f11737a = handler;
        this.f11738b = eventListener;
        this.f11739c = new C2309o(i);
        this.f11740d = clock;
        this.f11746j = j;
    }

    public synchronized long getBitrateEstimate() {
        return this.f11746j;
    }

    public synchronized void onTransferStart(Object obj, DataSpec dataSpec) {
        if (this.f11741e == null) {
            this.f11742f = this.f11740d.elapsedRealtime();
        }
        this.f11741e++;
    }

    public synchronized void onBytesTransferred(Object obj, int i) {
        this.f11743g += (long) i;
    }

    public synchronized void onTransferEnd(Object obj) {
        C2289a.m8313b(this.f11741e > null ? true : null);
        long elapsedRealtime = this.f11740d.elapsedRealtime();
        int i = (int) (elapsedRealtime - this.f11742f);
        long j = (long) i;
        this.f11744h += j;
        this.f11745i += this.f11743g;
        if (i > 0) {
            this.f11739c.m8435a((int) Math.sqrt((double) this.f11743g), (float) ((this.f11743g * 8000) / j));
            if (this.f11744h >= DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL || this.f11745i >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                this.f11746j = (long) this.f11739c.m8434a(0.5f);
            }
        }
        m14141a(i, this.f11743g, this.f11746j);
        obj = this.f11741e - 1;
        this.f11741e = obj;
        if (obj > null) {
            this.f11742f = elapsedRealtime;
        }
        this.f11743g = 0;
    }

    /* renamed from: a */
    private void m14141a(int i, long j, long j2) {
        if (this.f11737a != null && this.f11738b != null) {
            final int i2 = i;
            final long j3 = j;
            final long j4 = j2;
            this.f11737a.post(new Runnable(this) {
                /* renamed from: d */
                final /* synthetic */ C3722e f6877d;

                public void run() {
                    this.f6877d.f11738b.onBandwidthSample(i2, j3, j4);
                }
            });
        }
    }
}
