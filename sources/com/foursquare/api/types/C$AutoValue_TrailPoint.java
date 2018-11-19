package com.foursquare.api.types;

import android.support.annotation.Nullable;
import com.foursquare.api.types.TrailPoint.Location;
import com.foursquare.pilgrim.WifiScanResult;
import java.util.List;

/* renamed from: com.foursquare.api.types.$AutoValue_TrailPoint */
abstract class C$AutoValue_TrailPoint extends TrailPoint {
    private final Location location;
    private final GoogleMotionReading motionReading;
    private final List<WifiScanResult> wifiScans;

    static final class Builder implements com.foursquare.api.types.TrailPoint.Builder {
        private Location location;
        private GoogleMotionReading motionReading;
        private List<WifiScanResult> wifiScans;

        Builder() {
        }

        public com.foursquare.api.types.TrailPoint.Builder location(@Nullable Location location) {
            this.location = location;
            return this;
        }

        public com.foursquare.api.types.TrailPoint.Builder motionReading(@Nullable GoogleMotionReading googleMotionReading) {
            this.motionReading = googleMotionReading;
            return this;
        }

        public com.foursquare.api.types.TrailPoint.Builder wifiScans(@Nullable List<WifiScanResult> list) {
            this.wifiScans = list;
            return this;
        }

        public TrailPoint build() {
            return new AutoValue_TrailPoint(this.location, this.motionReading, this.wifiScans);
        }
    }

    C$AutoValue_TrailPoint(@Nullable Location location, @Nullable GoogleMotionReading googleMotionReading, @Nullable List<WifiScanResult> list) {
        this.location = location;
        this.motionReading = googleMotionReading;
        this.wifiScans = list;
    }

    @Nullable
    public Location location() {
        return this.location;
    }

    @Nullable
    public GoogleMotionReading motionReading() {
        return this.motionReading;
    }

    @Nullable
    public List<WifiScanResult> wifiScans() {
        return this.wifiScans;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrailPoint{location=");
        stringBuilder.append(this.location);
        stringBuilder.append(", motionReading=");
        stringBuilder.append(this.motionReading);
        stringBuilder.append(", wifiScans=");
        stringBuilder.append(this.wifiScans);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.foursquare.api.types.TrailPoint;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.foursquare.api.types.TrailPoint) r5;
        r1 = r4.location;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.location();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.location;
        r3 = r5.location();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.motionReading;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.motionReading();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.motionReading;
        r3 = r5.motionReading();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.wifiScans;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.wifiScans();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.wifiScans;
        r5 = r5.wifiScans();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0052;
    L_0x0051:
        r0 = 0;
    L_0x0052:
        return r0;
    L_0x0053:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.api.types.$AutoValue_TrailPoint.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.location == null ? 0 : this.location.hashCode()) ^ 1000003) * 1000003) ^ (this.motionReading == null ? 0 : this.motionReading.hashCode())) * 1000003;
        if (this.wifiScans != null) {
            i = this.wifiScans.hashCode();
        }
        return hashCode ^ i;
    }
}
