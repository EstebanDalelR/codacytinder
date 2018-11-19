package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C2255e;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.C3721d;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2304m;
import com.google.android.exoplayer2.util.C2314v;
import com.tinder.api.ManagerWebServices;

/* renamed from: com.google.android.exoplayer2.d */
public class C3599d implements LoadControl {
    /* renamed from: a */
    private final C3721d f10819a;
    /* renamed from: b */
    private final long f10820b;
    /* renamed from: c */
    private final long f10821c;
    /* renamed from: d */
    private final long f10822d;
    /* renamed from: e */
    private final long f10823e;
    /* renamed from: f */
    private final int f10824f;
    /* renamed from: g */
    private final boolean f10825g;
    /* renamed from: h */
    private final C2304m f10826h;
    /* renamed from: i */
    private int f10827i;
    /* renamed from: j */
    private boolean f10828j;

    public long getBackBufferDurationUs() {
        return 0;
    }

    public boolean retainBackBufferFromKeyframe() {
        return false;
    }

    public C3599d() {
        this(new C3721d(true, 65536));
    }

    @Deprecated
    public C3599d(C3721d c3721d) {
        this(c3721d, 15000, 50000, ManagerWebServices.FB_WEAR_TIMEOUT, 5000, -1, true);
    }

    @Deprecated
    public C3599d(C3721d c3721d, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(c3721d, i, i2, i3, i4, i5, z, null);
    }

    @Deprecated
    public C3599d(C3721d c3721d, int i, int i2, int i3, int i4, int i5, boolean z, C2304m c2304m) {
        C3599d.m13512a(i3, 0, "bufferForPlaybackMs", "0");
        C3599d.m13512a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        C3599d.m13512a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        C3599d.m13512a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        C3599d.m13512a(i2, i, "maxBufferMs", "minBufferMs");
        this.f10819a = c3721d;
        this.f10820b = ((long) i) * 1000;
        this.f10821c = ((long) i2) * 1000;
        this.f10822d = ((long) i3) * 1000;
        this.f10823e = ((long) i4) * 1000;
        this.f10824f = i5;
        this.f10825g = z;
        this.f10826h = c2304m;
    }

    public void onPrepared() {
        m13513a(false);
    }

    public void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, C2255e c2255e) {
        this.f10827i = this.f10824f == -1 ? m13514a(rendererArr, c2255e) : this.f10824f;
        this.f10819a.m14139a(this.f10827i);
    }

    public void onStopped() {
        m13513a(true);
    }

    public void onReleased() {
        m13513a(true);
    }

    public Allocator getAllocator() {
        return this.f10819a;
    }

    public boolean shouldContinueLoading(long j, float f) {
        boolean z = true;
        Object obj = this.f10819a.getTotalBytesAllocated() >= this.f10827i ? 1 : null;
        boolean z2 = this.f10828j;
        long j2 = this.f10820b;
        if (f > 1.0f) {
            j2 = Math.min(C2314v.m8461a(j2, f), this.f10821c);
        }
        if (j < j2) {
            if (this.f10825g == null) {
                if (obj != null) {
                    z = false;
                }
            }
            this.f10828j = z;
        } else if (j > this.f10821c || obj != null) {
            this.f10828j = false;
        }
        if (!(this.f10826h == null || this.f10828j == z2)) {
            if (this.f10828j != null) {
                this.f10826h.m8427a(0);
            } else {
                this.f10826h.m8428b(0);
            }
        }
        return this.f10828j;
    }

    public boolean shouldStartPlayback(long j, float f, boolean z) {
        j = C2314v.m8485b(j, f);
        f = z ? this.f10823e : this.f10822d;
        if (f > 0 && j < f) {
            if (this.f10825g != null || this.f10819a.getTotalBytesAllocated() < this.f10827i) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: a */
    protected int m13514a(Renderer[] rendererArr, C2255e c2255e) {
        int i = 0;
        for (int i2 = 0; i2 < rendererArr.length; i2++) {
            if (c2255e.m8123a(i2) != null) {
                i += C2314v.m8497f(rendererArr[i2].getTrackType());
            }
        }
        return i;
    }

    /* renamed from: a */
    private void m13513a(boolean z) {
        this.f10827i = 0;
        if (this.f10826h != null && this.f10828j) {
            this.f10826h.m8428b(0);
        }
        this.f10828j = false;
        if (z) {
            this.f10819a.m14138a();
        }
    }

    /* renamed from: a */
    private static void m13512a(int i, int i2, String str, String str2) {
        i = i >= i2 ? 1 : 0;
        i2 = new StringBuilder();
        i2.append(str);
        i2.append(" cannot be less than ");
        i2.append(str2);
        C2289a.m8312a(i, i2.toString());
    }
}
