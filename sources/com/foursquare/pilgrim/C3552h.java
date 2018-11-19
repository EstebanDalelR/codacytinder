package com.foursquare.pilgrim;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.api.types.GoogleMotionReading;
import com.foursquare.api.types.StopDetect;
import com.foursquare.internal.api.C1913a;
import com.foursquare.internal.util.C1943e;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.foursquare.pilgrim.h */
class C3552h extends BaseSpeedStrategy {
    @SerializedName("mCurrentSpeed")
    /* renamed from: a */
    private double f10649a = -1.0d;
    @SerializedName("mLaterLocation")
    /* renamed from: b */
    private FoursquareLocation f10650b;
    @SerializedName("mEarlierLocation")
    /* renamed from: c */
    private FoursquareLocation f10651c;
    @SerializedName("mMotionState")
    /* renamed from: d */
    private MotionState f10652d = MotionState.UNKNOWN;
    @SerializedName("secondToLastRawLocation")
    /* renamed from: e */
    private FoursquareLocation f10653e;
    @SerializedName("lastRawLocation")
    /* renamed from: f */
    private FoursquareLocation f10654f;
    @SerializedName("speedStrategyCreatedAtTimeMillis")
    /* renamed from: g */
    private final long f10655g = System.currentTimeMillis();

    C3552h() {
    }

    /* renamed from: c */
    MotionState mo2056c() {
        return this.f10652d;
    }

    /* renamed from: b */
    double mo2055b() {
        return this.f10649a;
    }

    /* renamed from: a */
    FoursquareLocation mo2051a() {
        return this.f10650b;
    }

    /* renamed from: a */
    void mo2053a(FoursquareLocation foursquareLocation, GoogleMotionReading googleMotionReading, List<ScanResult> list, ax axVar) {
        if (foursquareLocation != null) {
            if (foursquareLocation.isValid() != null) {
                m13391a(foursquareLocation, axVar.m7037g());
            }
        }
    }

    public String toString() {
        return mo2057d();
    }

    /* renamed from: a */
    boolean mo2054a(@Nullable FoursquareLocation foursquareLocation) {
        return m13398a(foursquareLocation, System.currentTimeMillis(), ae.m6902a() ^ 1);
    }

    @VisibleForTesting
    /* renamed from: a */
    boolean m13398a(@Nullable FoursquareLocation foursquareLocation, long j, boolean z) {
        C3552h c3552h = this;
        FoursquareLocation foursquareLocation2 = foursquareLocation;
        if (foursquareLocation2 == null) {
            return false;
        }
        boolean a = C3552h.m13392a(j, foursquareLocation2);
        if (z && a) {
            return false;
        }
        FoursquareLocation foursquareLocation3 = c3552h.f10654f;
        FoursquareLocation foursquareLocation4 = c3552h.f10653e;
        if (foursquareLocation3 == null || C3552h.m13393a(foursquareLocation2, c3552h.f10650b)) {
            return true;
        }
        if (ae.m6901a(foursquareLocation) < ae.m6901a(foursquareLocation3)) {
            return false;
        }
        double a2 = (double) C1943e.m6827a(foursquareLocation2, foursquareLocation3);
        long toSeconds = TimeUnit.MILLISECONDS.toSeconds(ae.m6901a(foursquareLocation) - ae.m6901a(foursquareLocation3));
        if (toSeconds == 0) {
            return false;
        }
        double d = (double) toSeconds;
        a2 /= d;
        if (a2 >= 500.0d) {
            return false;
        }
        if (foursquareLocation4 != null) {
            double a3 = (double) C1943e.m6827a(foursquareLocation3, foursquareLocation4);
            double d2 = a2;
            long toSeconds2 = TimeUnit.MILLISECONDS.toSeconds(ae.m6901a(foursquareLocation3) - ae.m6901a(foursquareLocation4));
            if (toSeconds2 == 0 || (d2 - (a3 / ((double) toSeconds2))) / d > 20.0d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m13391a(FoursquareLocation foursquareLocation, StopDetect stopDetect) {
        FoursquareLocation foursquareLocation2 = foursquareLocation;
        if (this.f10650b == null && r0.f10651c == null) {
            r0.f10650b = foursquareLocation2;
            r0.f10651c = foursquareLocation2;
            r0.f10653e = r0.f10654f;
            r0.f10654f = foursquareLocation2;
        } else if (C3552h.m13393a(foursquareLocation2, r0.f10650b)) {
            r0.f10650b = foursquareLocation2;
            r0.f10651c = foursquareLocation2;
            r0.f10653e = r0.f10654f;
            r0.f10654f = foursquareLocation2;
            r0.f10649a = -1.0d;
            r0.f10652d = MotionState.UNKNOWN;
        } else {
            double d;
            double d2;
            StopDetect stopDetect2;
            C3552h c3552h;
            double speedLag = (double) stopDetect.getSpeedLag();
            long round = Math.round(((double) TimeUnit.MILLISECONDS.toSeconds(ae.m6901a(foursquareLocation) - ae.m6901a(r0.f10650b))) / 60.0d);
            long toMillis = TimeUnit.SECONDS.toMillis(60);
            if (round > 1) {
                List<FoursquareLocation> arrayList = new ArrayList((int) round);
                double lat = r0.f10650b.getLat();
                double lng = r0.f10650b.getLng();
                long time = r0.f10650b.getTime();
                long elapsedRealtimeNanos = r0.f10650b.getElapsedRealtimeNanos();
                d = speedLag;
                speedLag = (double) round;
                double lat2 = (foursquareLocation.getLat() - lat) / speedLag;
                double lng2 = (foursquareLocation.getLng() - lng) / speedLag;
                int i = 1;
                while (true) {
                    long j = (long) i;
                    if (j >= round) {
                        break;
                    }
                    long j2 = round;
                    d2 = (double) i;
                    arrayList.add(new FoursquareLocation(lat + (lat2 * d2), lng + (d2 * lng2), time + (toMillis * j), elapsedRealtimeNanos + (TimeUnit.MILLISECONDS.toNanos(toMillis) * j)));
                    i++;
                    round = j2;
                }
                for (FoursquareLocation foursquareLocation22 : arrayList) {
                    m13391a(foursquareLocation22, stopDetect);
                }
                stopDetect2 = stopDetect;
                c3552h = this;
            } else {
                stopDetect2 = stopDetect;
                d = speedLag;
                c3552h = r0;
            }
            FoursquareLocation foursquareLocation3 = foursquareLocation;
            double a = af.m6904a(c3552h.f10650b.getLat(), (double) ae.m6901a(c3552h.f10650b), foursquareLocation.getLat(), (double) ae.m6901a(foursquareLocation), (double) stopDetect.getLocLag());
            double a2 = af.m6904a(c3552h.f10650b.getLng(), (double) ae.m6901a(c3552h.f10650b), foursquareLocation.getLng(), (double) ae.m6901a(foursquareLocation), (double) stopDetect.getLocLag());
            double d3 = d;
            d2 = af.m6904a(c3552h.f10651c.getLat(), (double) ae.m6901a(c3552h.f10651c), a, (double) ae.m6901a(foursquareLocation), d3);
            double a3 = af.m6904a(c3552h.f10651c.getLng(), (double) ae.m6901a(c3552h.f10651c), a2, (double) ae.m6901a(foursquareLocation), d3);
            c3552h.f10650b = new FoursquareLocation(a, a2, foursquareLocation.getTime(), foursquareLocation.getElapsedRealtimeNanos());
            c3552h.f10651c = new FoursquareLocation(d2, a3, foursquareLocation.getTime(), foursquareLocation.getElapsedRealtimeNanos());
            c3552h.f10649a = ((double) C1943e.m6827a(c3552h.f10650b, c3552h.f10651c)) / d;
            c3552h.f10652d = C3552h.m13390a(c3552h.f10652d, c3552h.f10649a, stopDetect2, c3552h.f10655g);
            c3552h.f10653e = c3552h.f10654f;
            c3552h.f10654f = foursquareLocation3;
        }
    }

    /* renamed from: a */
    void mo2052a(Context context) throws Exception {
        try {
            am.m6939a(context, C1913a.m6652a(this));
        } catch (Context context2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MotionState for EMASpeedStrategy was not valid JSON. Probably contained a NaN, Infinity, or -Infinity. EMASpeedStrategy info: ");
            stringBuilder.append(mo2057d());
            new RealExceptionReporter().reportException(new IllegalArgumentException(stringBuilder.toString(), context2));
        }
    }

    /* renamed from: d */
    String mo2057d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stop Detect:\n");
        stringBuilder.append("Speed: ");
        stringBuilder.append(mo2055b());
        stringBuilder.append("\n");
        stringBuilder.append("Motion State: ");
        stringBuilder.append(mo2056c());
        stringBuilder.append("\n");
        if (this.f10650b != null) {
            stringBuilder.append("Later Location: ");
            stringBuilder.append(this.f10650b);
            stringBuilder.append("\n");
        }
        if (this.f10651c != null) {
            stringBuilder.append("Earlier Location: ");
            stringBuilder.append(this.f10651c);
            stringBuilder.append("\n");
        }
        if (this.f10654f != null) {
            stringBuilder.append("Last Location: ");
            stringBuilder.append(this.f10654f);
            stringBuilder.append("\n");
        }
        if (this.f10653e != null) {
            stringBuilder.append("Second To Last: ");
            stringBuilder.append(this.f10653e);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @NonNull
    /* renamed from: a */
    private static MotionState m13390a(@NonNull MotionState motionState, double d, @NonNull StopDetect stopDetect, long j) {
        if (ax.m7003a().m7051u()) {
            d = d < stopDetect.getLowThres() ? MotionState.STOPPED : d > stopDetect.getHighThres() ? MotionState.MOVING : motionState;
            if (motionState != MotionState.UNKNOWN || d != MotionState.STOPPED) {
                return d;
            }
            if (System.currentTimeMillis() - j > TimeUnit.MINUTES.toMillis(10)) {
                return MotionState.STOPPED;
            }
            return MotionState.UNKNOWN;
        }
        switch (motionState) {
            case UNKNOWN:
                if (d > stopDetect.getHighThres()) {
                    return MotionState.MOVING;
                }
                break;
            case MOVING:
                if (d < stopDetect.getLowThres()) {
                    return MotionState.STOPPED;
                }
                break;
            case STOPPED:
                if (d > stopDetect.getHighThres()) {
                    return MotionState.MOVING;
                }
                break;
            default:
                break;
        }
        return motionState;
    }

    /* renamed from: a */
    private static boolean m13393a(FoursquareLocation foursquareLocation, FoursquareLocation foursquareLocation2) {
        return TimeUnit.MILLISECONDS.toDays(Math.abs(ae.m6901a(foursquareLocation) - ae.m6901a(foursquareLocation2))) >= 1 ? true : null;
    }

    /* renamed from: a */
    private static boolean m13392a(long j, FoursquareLocation foursquareLocation) {
        long time = foursquareLocation.getTime();
        long toMillis = TimeUnit.HOURS.toMillis(3);
        long j2 = j + toMillis;
        if (time >= j - toMillis) {
            if (time <= j2) {
                return 0;
            }
        }
        return 1;
    }
}
