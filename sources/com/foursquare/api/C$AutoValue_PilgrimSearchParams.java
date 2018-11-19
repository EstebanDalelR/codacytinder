package com.foursquare.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.foursquare.pilgrim.PilgrimUserInfo;
import com.foursquare.pilgrim.RegionType;

/* renamed from: com.foursquare.api.$AutoValue_PilgrimSearchParams */
abstract class C$AutoValue_PilgrimSearchParams extends PilgrimSearchParams {
    private final String checksum;
    private final long elapsedRealtimeNanos;
    private final boolean hasHomeWork;
    private final int limit;
    private final boolean limitAdsTracking;
    private final FoursquareLocation location;
    private final RegionType locationType;
    private final String nearbyTriggers;
    private final long now;
    private final boolean skipLogging;
    private final long timestamp;
    private final PilgrimUserInfo userInfo;
    private final String wifiScan;

    static final class Builder implements com.foursquare.api.PilgrimSearchParams.Builder {
        private String checksum;
        private Long elapsedRealtimeNanos;
        private Boolean hasHomeWork;
        private Integer limit;
        private Boolean limitAdsTracking;
        private FoursquareLocation location;
        private RegionType locationType;
        private String nearbyTriggers;
        private Long now;
        private Boolean skipLogging;
        private Long timestamp;
        private PilgrimUserInfo userInfo;
        private String wifiScan;

        Builder() {
        }

        public com.foursquare.api.PilgrimSearchParams.Builder location(FoursquareLocation foursquareLocation) {
            if (foursquareLocation == null) {
                throw new NullPointerException("Null location");
            }
            this.location = foursquareLocation;
            return this;
        }

        public com.foursquare.api.PilgrimSearchParams.Builder timestamp(long j) {
            this.timestamp = Long.valueOf(j);
            return this;
        }

        public com.foursquare.api.PilgrimSearchParams.Builder now(long j) {
            this.now = Long.valueOf(j);
            return this;
        }

        public com.foursquare.api.PilgrimSearchParams.Builder elapsedRealtimeNanos(long j) {
            this.elapsedRealtimeNanos = Long.valueOf(j);
            return this;
        }

        public com.foursquare.api.PilgrimSearchParams.Builder limit(int i) {
            this.limit = Integer.valueOf(i);
            return this;
        }

        public com.foursquare.api.PilgrimSearchParams.Builder wifiScan(@Nullable String str) {
            this.wifiScan = str;
            return this;
        }

        public com.foursquare.api.PilgrimSearchParams.Builder limitAdsTracking(boolean z) {
            this.limitAdsTracking = Boolean.valueOf(z);
            return this;
        }

        public com.foursquare.api.PilgrimSearchParams.Builder checksum(@Nullable String str) {
            this.checksum = str;
            return this;
        }

        public com.foursquare.api.PilgrimSearchParams.Builder hasHomeWork(boolean z) {
            this.hasHomeWork = Boolean.valueOf(z);
            return this;
        }

        public com.foursquare.api.PilgrimSearchParams.Builder userInfo(@Nullable PilgrimUserInfo pilgrimUserInfo) {
            this.userInfo = pilgrimUserInfo;
            return this;
        }

        public com.foursquare.api.PilgrimSearchParams.Builder locationType(RegionType regionType) {
            if (regionType == null) {
                throw new NullPointerException("Null locationType");
            }
            this.locationType = regionType;
            return this;
        }

        public com.foursquare.api.PilgrimSearchParams.Builder nearbyTriggers(@Nullable String str) {
            this.nearbyTriggers = str;
            return this;
        }

        public com.foursquare.api.PilgrimSearchParams.Builder skipLogging(boolean z) {
            this.skipLogging = Boolean.valueOf(z);
            return this;
        }

        public PilgrimSearchParams build() {
            String str = "";
            if (this.location == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" location");
                str = stringBuilder.toString();
            }
            if (r0.timestamp == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" timestamp");
                str = stringBuilder.toString();
            }
            if (r0.now == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" now");
                str = stringBuilder.toString();
            }
            if (r0.elapsedRealtimeNanos == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" elapsedRealtimeNanos");
                str = stringBuilder.toString();
            }
            if (r0.limit == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" limit");
                str = stringBuilder.toString();
            }
            if (r0.limitAdsTracking == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" limitAdsTracking");
                str = stringBuilder.toString();
            }
            if (r0.hasHomeWork == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" hasHomeWork");
                str = stringBuilder.toString();
            }
            if (r0.locationType == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" locationType");
                str = stringBuilder.toString();
            }
            if (r0.skipLogging == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" skipLogging");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                FoursquareLocation foursquareLocation = r0.location;
                long longValue = r0.timestamp.longValue();
                long longValue2 = r0.now.longValue();
                long longValue3 = r0.elapsedRealtimeNanos.longValue();
                int intValue = r0.limit.intValue();
                String str2 = r0.wifiScan;
                boolean booleanValue = r0.limitAdsTracking.booleanValue();
                String str3 = r0.checksum;
                boolean booleanValue2 = r0.hasHomeWork.booleanValue();
                PilgrimUserInfo pilgrimUserInfo = r0.userInfo;
                RegionType regionType = r0.locationType;
                PilgrimUserInfo pilgrimUserInfo2 = pilgrimUserInfo;
                return new AutoValue_PilgrimSearchParams(foursquareLocation, longValue, longValue2, longValue3, intValue, str2, booleanValue, str3, booleanValue2, pilgrimUserInfo2, regionType, r0.nearbyTriggers, r0.skipLogging.booleanValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    C$AutoValue_PilgrimSearchParams(FoursquareLocation foursquareLocation, long j, long j2, long j3, int i, @Nullable String str, boolean z, @Nullable String str2, boolean z2, @Nullable PilgrimUserInfo pilgrimUserInfo, RegionType regionType, @Nullable String str3, boolean z3) {
        PilgrimSearchParams pilgrimSearchParams = this;
        FoursquareLocation foursquareLocation2 = foursquareLocation;
        RegionType regionType2 = regionType;
        if (foursquareLocation2 == null) {
            throw new NullPointerException("Null location");
        }
        pilgrimSearchParams.location = foursquareLocation2;
        pilgrimSearchParams.timestamp = j;
        pilgrimSearchParams.now = j2;
        pilgrimSearchParams.elapsedRealtimeNanos = j3;
        pilgrimSearchParams.limit = i;
        pilgrimSearchParams.wifiScan = str;
        pilgrimSearchParams.limitAdsTracking = z;
        pilgrimSearchParams.checksum = str2;
        pilgrimSearchParams.hasHomeWork = z2;
        pilgrimSearchParams.userInfo = pilgrimUserInfo;
        if (regionType2 == null) {
            throw new NullPointerException("Null locationType");
        }
        pilgrimSearchParams.locationType = regionType2;
        pilgrimSearchParams.nearbyTriggers = str3;
        pilgrimSearchParams.skipLogging = z3;
    }

    @NonNull
    public FoursquareLocation location() {
        return this.location;
    }

    public long timestamp() {
        return this.timestamp;
    }

    public long now() {
        return this.now;
    }

    public long elapsedRealtimeNanos() {
        return this.elapsedRealtimeNanos;
    }

    public int limit() {
        return this.limit;
    }

    @Nullable
    public String wifiScan() {
        return this.wifiScan;
    }

    public boolean limitAdsTracking() {
        return this.limitAdsTracking;
    }

    @Nullable
    public String checksum() {
        return this.checksum;
    }

    public boolean hasHomeWork() {
        return this.hasHomeWork;
    }

    @Nullable
    public PilgrimUserInfo userInfo() {
        return this.userInfo;
    }

    @NonNull
    public RegionType locationType() {
        return this.locationType;
    }

    @Nullable
    public String nearbyTriggers() {
        return this.nearbyTriggers;
    }

    public boolean skipLogging() {
        return this.skipLogging;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PilgrimSearchParams{location=");
        stringBuilder.append(this.location);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", now=");
        stringBuilder.append(this.now);
        stringBuilder.append(", elapsedRealtimeNanos=");
        stringBuilder.append(this.elapsedRealtimeNanos);
        stringBuilder.append(", limit=");
        stringBuilder.append(this.limit);
        stringBuilder.append(", wifiScan=");
        stringBuilder.append(this.wifiScan);
        stringBuilder.append(", limitAdsTracking=");
        stringBuilder.append(this.limitAdsTracking);
        stringBuilder.append(", checksum=");
        stringBuilder.append(this.checksum);
        stringBuilder.append(", hasHomeWork=");
        stringBuilder.append(this.hasHomeWork);
        stringBuilder.append(", userInfo=");
        stringBuilder.append(this.userInfo);
        stringBuilder.append(", locationType=");
        stringBuilder.append(this.locationType);
        stringBuilder.append(", nearbyTriggers=");
        stringBuilder.append(this.nearbyTriggers);
        stringBuilder.append(", skipLogging=");
        stringBuilder.append(this.skipLogging);
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
        r1 = r8 instanceof com.foursquare.api.PilgrimSearchParams;
        r2 = 0;
        if (r1 == 0) goto L_0x00c0;
    L_0x0009:
        r8 = (com.foursquare.api.PilgrimSearchParams) r8;
        r1 = r7.location;
        r3 = r8.location();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00be;
    L_0x0017:
        r3 = r7.timestamp;
        r5 = r8.timestamp();
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x00be;
    L_0x0021:
        r3 = r7.now;
        r5 = r8.now();
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x00be;
    L_0x002b:
        r3 = r7.elapsedRealtimeNanos;
        r5 = r8.elapsedRealtimeNanos();
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x00be;
    L_0x0035:
        r1 = r7.limit;
        r3 = r8.limit();
        if (r1 != r3) goto L_0x00be;
    L_0x003d:
        r1 = r7.wifiScan;
        if (r1 != 0) goto L_0x0048;
    L_0x0041:
        r1 = r8.wifiScan();
        if (r1 != 0) goto L_0x00be;
    L_0x0047:
        goto L_0x0054;
    L_0x0048:
        r1 = r7.wifiScan;
        r3 = r8.wifiScan();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00be;
    L_0x0054:
        r1 = r7.limitAdsTracking;
        r3 = r8.limitAdsTracking();
        if (r1 != r3) goto L_0x00be;
    L_0x005c:
        r1 = r7.checksum;
        if (r1 != 0) goto L_0x0067;
    L_0x0060:
        r1 = r8.checksum();
        if (r1 != 0) goto L_0x00be;
    L_0x0066:
        goto L_0x0073;
    L_0x0067:
        r1 = r7.checksum;
        r3 = r8.checksum();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00be;
    L_0x0073:
        r1 = r7.hasHomeWork;
        r3 = r8.hasHomeWork();
        if (r1 != r3) goto L_0x00be;
    L_0x007b:
        r1 = r7.userInfo;
        if (r1 != 0) goto L_0x0086;
    L_0x007f:
        r1 = r8.userInfo();
        if (r1 != 0) goto L_0x00be;
    L_0x0085:
        goto L_0x0092;
    L_0x0086:
        r1 = r7.userInfo;
        r3 = r8.userInfo();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00be;
    L_0x0092:
        r1 = r7.locationType;
        r3 = r8.locationType();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00be;
    L_0x009e:
        r1 = r7.nearbyTriggers;
        if (r1 != 0) goto L_0x00a9;
    L_0x00a2:
        r1 = r8.nearbyTriggers();
        if (r1 != 0) goto L_0x00be;
    L_0x00a8:
        goto L_0x00b5;
    L_0x00a9:
        r1 = r7.nearbyTriggers;
        r3 = r8.nearbyTriggers();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00be;
    L_0x00b5:
        r1 = r7.skipLogging;
        r8 = r8.skipLogging();
        if (r1 != r8) goto L_0x00be;
    L_0x00bd:
        goto L_0x00bf;
    L_0x00be:
        r0 = 0;
    L_0x00bf:
        return r0;
    L_0x00c0:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.api.$AutoValue_PilgrimSearchParams.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int i2 = 1237;
        int hashCode = (((((((((((((((((((((this.location.hashCode() ^ 1000003) * 1000003) ^ ((int) ((this.timestamp >>> 32) ^ this.timestamp))) * 1000003) ^ ((int) ((this.now >>> 32) ^ this.now))) * 1000003) ^ ((int) ((this.elapsedRealtimeNanos >>> 32) ^ this.elapsedRealtimeNanos))) * 1000003) ^ this.limit) * 1000003) ^ (this.wifiScan == null ? 0 : this.wifiScan.hashCode())) * 1000003) ^ (this.limitAdsTracking ? 1231 : 1237)) * 1000003) ^ (this.checksum == null ? 0 : this.checksum.hashCode())) * 1000003) ^ (this.hasHomeWork ? 1231 : 1237)) * 1000003) ^ (this.userInfo == null ? 0 : this.userInfo.hashCode())) * 1000003) ^ this.locationType.hashCode()) * 1000003;
        if (this.nearbyTriggers != null) {
            i = this.nearbyTriggers.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        if (this.skipLogging) {
            i2 = 1231;
        }
        return hashCode ^ i2;
    }
}
