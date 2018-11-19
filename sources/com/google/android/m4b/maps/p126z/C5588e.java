package com.google.android.m4b.maps.p126z;

import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.z.e */
public final class C5588e {
    /* renamed from: a */
    private final long f20603a = 0;
    /* renamed from: b */
    private final long f20604b = 0;
    /* renamed from: c */
    private final long f20605c = 0;
    /* renamed from: d */
    private final long f20606d = 0;
    /* renamed from: e */
    private final long f20607e = 0;
    /* renamed from: f */
    private final long f20608f = 0;

    public C5588e(long j, long j2, long j3, long j4, long j5, long j6) {
        C5571j.m24297a(true);
        C5571j.m24297a(true);
        C5571j.m24297a(true);
        C5571j.m24297a(true);
        C5571j.m24297a(true);
        C5571j.m24297a(true);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f20603a), Long.valueOf(this.f20604b), Long.valueOf(this.f20605c), Long.valueOf(this.f20606d), Long.valueOf(this.f20607e), Long.valueOf(this.f20608f)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5588e)) {
            return false;
        }
        C5588e c5588e = (C5588e) obj;
        if (this.f20603a == c5588e.f20603a && this.f20604b == c5588e.f20604b && this.f20605c == c5588e.f20605c && this.f20606d == c5588e.f20606d && this.f20607e == c5588e.f20607e && this.f20608f == c5588e.f20608f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return C5569h.m24283a(this).m24280a("hitCount", this.f20603a).m24280a("missCount", this.f20604b).m24280a("loadSuccessCount", this.f20605c).m24280a("loadExceptionCount", this.f20606d).m24280a("totalLoadTime", this.f20607e).m24280a("evictionCount", this.f20608f).toString();
    }
}
