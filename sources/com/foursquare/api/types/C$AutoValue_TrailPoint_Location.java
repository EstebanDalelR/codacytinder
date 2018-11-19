package com.foursquare.api.types;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.foursquare.api.types.TrailPoint.Location;
import com.foursquare.pilgrim.BackgroundWakeupSource;

/* renamed from: com.foursquare.api.types.$AutoValue_TrailPoint_Location */
abstract class C$AutoValue_TrailPoint_Location extends Location {
    private final long elapsedRealtimeNanos;
    private final Float hacc;
    private final Float heading;
    private final double lat;
    private final double lng;
    private final BackgroundWakeupSource source;
    private final Float speed;
    private final long timestamp;

    static final class Builder implements com.foursquare.api.types.TrailPoint.Location.Builder {
        private Long elapsedRealtimeNanos;
        private Float hacc;
        private Float heading;
        private Double lat;
        private Double lng;
        private BackgroundWakeupSource source;
        private Float speed;
        private Long timestamp;

        Builder() {
        }

        public com.foursquare.api.types.TrailPoint.Location.Builder lat(double d) {
            this.lat = Double.valueOf(d);
            return this;
        }

        public com.foursquare.api.types.TrailPoint.Location.Builder lng(double d) {
            this.lng = Double.valueOf(d);
            return this;
        }

        public com.foursquare.api.types.TrailPoint.Location.Builder hacc(@Nullable Float f) {
            this.hacc = f;
            return this;
        }

        public com.foursquare.api.types.TrailPoint.Location.Builder timestamp(long j) {
            this.timestamp = Long.valueOf(j);
            return this;
        }

        public com.foursquare.api.types.TrailPoint.Location.Builder elapsedRealtimeNanos(long j) {
            this.elapsedRealtimeNanos = Long.valueOf(j);
            return this;
        }

        public com.foursquare.api.types.TrailPoint.Location.Builder speed(@Nullable Float f) {
            this.speed = f;
            return this;
        }

        public com.foursquare.api.types.TrailPoint.Location.Builder heading(@Nullable Float f) {
            this.heading = f;
            return this;
        }

        public com.foursquare.api.types.TrailPoint.Location.Builder source(BackgroundWakeupSource backgroundWakeupSource) {
            if (backgroundWakeupSource == null) {
                throw new NullPointerException("Null source");
            }
            this.source = backgroundWakeupSource;
            return this;
        }

        public Location build() {
            String str = "";
            if (this.lat == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" lat");
                str = stringBuilder.toString();
            }
            if (this.lng == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" lng");
                str = stringBuilder.toString();
            }
            if (this.timestamp == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" timestamp");
                str = stringBuilder.toString();
            }
            if (this.elapsedRealtimeNanos == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" elapsedRealtimeNanos");
                str = stringBuilder.toString();
            }
            if (this.source == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" source");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_TrailPoint_Location(this.lat.doubleValue(), this.lng.doubleValue(), this.hacc, this.timestamp.longValue(), this.elapsedRealtimeNanos.longValue(), this.speed, this.heading, this.source);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    C$AutoValue_TrailPoint_Location(double d, double d2, @Nullable Float f, long j, long j2, @Nullable Float f2, @Nullable Float f3, BackgroundWakeupSource backgroundWakeupSource) {
        this.lat = d;
        this.lng = d2;
        this.hacc = f;
        this.timestamp = j;
        this.elapsedRealtimeNanos = j2;
        this.speed = f2;
        this.heading = f3;
        if (backgroundWakeupSource == null) {
            throw new NullPointerException("Null source");
        }
        this.source = backgroundWakeupSource;
    }

    public double lat() {
        return this.lat;
    }

    public double lng() {
        return this.lng;
    }

    @Nullable
    public Float hacc() {
        return this.hacc;
    }

    public long timestamp() {
        return this.timestamp;
    }

    public long elapsedRealtimeNanos() {
        return this.elapsedRealtimeNanos;
    }

    @Nullable
    public Float speed() {
        return this.speed;
    }

    @Nullable
    public Float heading() {
        return this.heading;
    }

    @NonNull
    public BackgroundWakeupSource source() {
        return this.source;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Location{lat=");
        stringBuilder.append(this.lat);
        stringBuilder.append(", lng=");
        stringBuilder.append(this.lng);
        stringBuilder.append(", hacc=");
        stringBuilder.append(this.hacc);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", elapsedRealtimeNanos=");
        stringBuilder.append(this.elapsedRealtimeNanos);
        stringBuilder.append(", speed=");
        stringBuilder.append(this.speed);
        stringBuilder.append(", heading=");
        stringBuilder.append(this.heading);
        stringBuilder.append(", source=");
        stringBuilder.append(this.source);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
        r7 = this;
        r0 = 1;
        if (r8 != r7) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r8 instanceof com.foursquare.api.types.TrailPoint.Location;
        r2 = 0;
        if (r1 == 0) goto L_0x0097;
    L_0x0009:
        r8 = (com.foursquare.api.types.TrailPoint.Location) r8;
        r3 = r7.lat;
        r3 = java.lang.Double.doubleToLongBits(r3);
        r5 = r8.lat();
        r5 = java.lang.Double.doubleToLongBits(r5);
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x0095;
    L_0x001d:
        r3 = r7.lng;
        r3 = java.lang.Double.doubleToLongBits(r3);
        r5 = r8.lng();
        r5 = java.lang.Double.doubleToLongBits(r5);
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x0095;
    L_0x002f:
        r1 = r7.hacc;
        if (r1 != 0) goto L_0x003a;
    L_0x0033:
        r1 = r8.hacc();
        if (r1 != 0) goto L_0x0095;
    L_0x0039:
        goto L_0x0046;
    L_0x003a:
        r1 = r7.hacc;
        r3 = r8.hacc();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0095;
    L_0x0046:
        r3 = r7.timestamp;
        r5 = r8.timestamp();
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x0095;
    L_0x0050:
        r3 = r7.elapsedRealtimeNanos;
        r5 = r8.elapsedRealtimeNanos();
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x0095;
    L_0x005a:
        r1 = r7.speed;
        if (r1 != 0) goto L_0x0065;
    L_0x005e:
        r1 = r8.speed();
        if (r1 != 0) goto L_0x0095;
    L_0x0064:
        goto L_0x0071;
    L_0x0065:
        r1 = r7.speed;
        r3 = r8.speed();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0095;
    L_0x0071:
        r1 = r7.heading;
        if (r1 != 0) goto L_0x007c;
    L_0x0075:
        r1 = r8.heading();
        if (r1 != 0) goto L_0x0095;
    L_0x007b:
        goto L_0x0088;
    L_0x007c:
        r1 = r7.heading;
        r3 = r8.heading();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0095;
    L_0x0088:
        r1 = r7.source;
        r8 = r8.source();
        r8 = r1.equals(r8);
        if (r8 == 0) goto L_0x0095;
    L_0x0094:
        goto L_0x0096;
    L_0x0095:
        r0 = 0;
    L_0x0096:
        return r0;
    L_0x0097:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.api.types.$AutoValue_TrailPoint_Location.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int doubleToLongBits = (((((((((((((int) ((Double.doubleToLongBits(this.lat) >>> 32) ^ Double.doubleToLongBits(this.lat))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.lng) >>> 32) ^ Double.doubleToLongBits(this.lng)))) * 1000003) ^ (this.hacc == null ? 0 : this.hacc.hashCode())) * 1000003) ^ ((int) ((this.timestamp >>> 32) ^ this.timestamp))) * 1000003) ^ ((int) ((this.elapsedRealtimeNanos >>> 32) ^ this.elapsedRealtimeNanos))) * 1000003) ^ (this.speed == null ? 0 : this.speed.hashCode())) * 1000003;
        if (this.heading != null) {
            i = this.heading.hashCode();
        }
        return ((doubleToLongBits ^ i) * 1000003) ^ this.source.hashCode();
    }
}
