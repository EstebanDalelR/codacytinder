package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.zzcfs;

public interface Geofence {

    /* renamed from: com.google.android.gms.location.Geofence$a */
    public static final class C4480a {
        /* renamed from: a */
        private String f16706a = null;
        /* renamed from: b */
        private int f16707b = 0;
        /* renamed from: c */
        private long f16708c = Long.MIN_VALUE;
        /* renamed from: d */
        private short f16709d = (short) -1;
        /* renamed from: e */
        private double f16710e;
        /* renamed from: f */
        private double f16711f;
        /* renamed from: g */
        private float f16712g;
        /* renamed from: h */
        private int f16713h = 0;
        /* renamed from: i */
        private int f16714i = -1;

        /* renamed from: a */
        public final C4480a m20338a(double d, double d2, float f) {
            this.f16709d = (short) 1;
            this.f16710e = d;
            this.f16711f = d2;
            this.f16712g = f;
            return this;
        }

        /* renamed from: a */
        public final C4480a m20339a(int i) {
            this.f16707b = i;
            return this;
        }

        /* renamed from: a */
        public final C4480a m20340a(long j) {
            if (j < 0) {
                this.f16708c = -1;
                return this;
            }
            this.f16708c = SystemClock.elapsedRealtime() + j;
            return this;
        }

        /* renamed from: a */
        public final C4480a m20341a(String str) {
            this.f16706a = str;
            return this;
        }

        /* renamed from: a */
        public final Geofence m20342a() {
            if (this.f16706a == null) {
                throw new IllegalArgumentException("Request ID not set.");
            } else if (this.f16707b == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            } else if ((this.f16707b & 4) != 0 && this.f16714i < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            } else if (this.f16708c == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            } else if (this.f16709d == (short) -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            } else if (this.f16713h >= 0) {
                return new zzcfs(this.f16706a, this.f16707b, (short) 1, this.f16710e, this.f16711f, this.f16712g, this.f16708c, this.f16713h, this.f16714i);
            } else {
                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
            }
        }
    }

    String getRequestId();
}
