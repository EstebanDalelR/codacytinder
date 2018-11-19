package com.foursquare.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.foursquare.api.Add3rdPartyCheckinParams.Builder;
import com.foursquare.api.Add3rdPartyCheckinParams.VenueIdType;
import java.util.Date;

/* renamed from: com.foursquare.api.$$AutoValue_Add3rdPartyCheckinParams */
abstract class C$$AutoValue_Add3rdPartyCheckinParams extends Add3rdPartyCheckinParams {
    private final FoursquareLocation ll;
    private final Date now;
    private final String pilgrimVisitId;
    private final String venueId;
    private final VenueIdType venueIdType;
    private final String wifiScan;

    /* renamed from: com.foursquare.api.$$AutoValue_Add3rdPartyCheckinParams$Builder */
    static final class Builder implements com.foursquare.api.Add3rdPartyCheckinParams.Builder {
        private FoursquareLocation ll;
        private Date now;
        private String pilgrimVisitId;
        private String venueId;
        private VenueIdType venueIdType;
        private String wifiScan;

        Builder() {
        }

        private Builder(Add3rdPartyCheckinParams add3rdPartyCheckinParams) {
            this.venueId = add3rdPartyCheckinParams.venueId();
            this.venueIdType = add3rdPartyCheckinParams.venueIdType();
            this.now = add3rdPartyCheckinParams.now();
            this.pilgrimVisitId = add3rdPartyCheckinParams.pilgrimVisitId();
            this.wifiScan = add3rdPartyCheckinParams.wifiScan();
            this.ll = add3rdPartyCheckinParams.ll();
        }

        public com.foursquare.api.Add3rdPartyCheckinParams.Builder venueId(String str) {
            if (str == null) {
                throw new NullPointerException("Null venueId");
            }
            this.venueId = str;
            return this;
        }

        public com.foursquare.api.Add3rdPartyCheckinParams.Builder venueIdType(VenueIdType venueIdType) {
            if (venueIdType == null) {
                throw new NullPointerException("Null venueIdType");
            }
            this.venueIdType = venueIdType;
            return this;
        }

        public com.foursquare.api.Add3rdPartyCheckinParams.Builder now(Date date) {
            if (date == null) {
                throw new NullPointerException("Null now");
            }
            this.now = date;
            return this;
        }

        public com.foursquare.api.Add3rdPartyCheckinParams.Builder pilgrimVisitId(@Nullable String str) {
            this.pilgrimVisitId = str;
            return this;
        }

        public com.foursquare.api.Add3rdPartyCheckinParams.Builder wifiScan(@Nullable String str) {
            this.wifiScan = str;
            return this;
        }

        public com.foursquare.api.Add3rdPartyCheckinParams.Builder ll(FoursquareLocation foursquareLocation) {
            if (foursquareLocation == null) {
                throw new NullPointerException("Null ll");
            }
            this.ll = foursquareLocation;
            return this;
        }

        public Add3rdPartyCheckinParams build() {
            String str = "";
            if (this.venueId == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" venueId");
                str = stringBuilder.toString();
            }
            if (this.venueIdType == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" venueIdType");
                str = stringBuilder.toString();
            }
            if (this.now == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" now");
                str = stringBuilder.toString();
            }
            if (this.ll == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" ll");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_Add3rdPartyCheckinParams(this.venueId, this.venueIdType, this.now, this.pilgrimVisitId, this.wifiScan, this.ll);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    C$$AutoValue_Add3rdPartyCheckinParams(String str, VenueIdType venueIdType, Date date, @Nullable String str2, @Nullable String str3, FoursquareLocation foursquareLocation) {
        if (str == null) {
            throw new NullPointerException("Null venueId");
        }
        this.venueId = str;
        if (venueIdType == null) {
            throw new NullPointerException("Null venueIdType");
        }
        this.venueIdType = venueIdType;
        if (date == null) {
            throw new NullPointerException("Null now");
        }
        this.now = date;
        this.pilgrimVisitId = str2;
        this.wifiScan = str3;
        if (foursquareLocation == null) {
            throw new NullPointerException("Null ll");
        }
        this.ll = foursquareLocation;
    }

    @NonNull
    public String venueId() {
        return this.venueId;
    }

    @NonNull
    public VenueIdType venueIdType() {
        return this.venueIdType;
    }

    @NonNull
    public Date now() {
        return this.now;
    }

    @Nullable
    public String pilgrimVisitId() {
        return this.pilgrimVisitId;
    }

    @Nullable
    public String wifiScan() {
        return this.wifiScan;
    }

    @NonNull
    public FoursquareLocation ll() {
        return this.ll;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Add3rdPartyCheckinParams{venueId=");
        stringBuilder.append(this.venueId);
        stringBuilder.append(", venueIdType=");
        stringBuilder.append(this.venueIdType);
        stringBuilder.append(", now=");
        stringBuilder.append(this.now);
        stringBuilder.append(", pilgrimVisitId=");
        stringBuilder.append(this.pilgrimVisitId);
        stringBuilder.append(", wifiScan=");
        stringBuilder.append(this.wifiScan);
        stringBuilder.append(", ll=");
        stringBuilder.append(this.ll);
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
        r1 = r5 instanceof com.foursquare.api.Add3rdPartyCheckinParams;
        r2 = 0;
        if (r1 == 0) goto L_0x006c;
    L_0x0009:
        r5 = (com.foursquare.api.Add3rdPartyCheckinParams) r5;
        r1 = r4.venueId;
        r3 = r5.venueId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x006a;
    L_0x0017:
        r1 = r4.venueIdType;
        r3 = r5.venueIdType();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x006a;
    L_0x0023:
        r1 = r4.now;
        r3 = r5.now();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x006a;
    L_0x002f:
        r1 = r4.pilgrimVisitId;
        if (r1 != 0) goto L_0x003a;
    L_0x0033:
        r1 = r5.pilgrimVisitId();
        if (r1 != 0) goto L_0x006a;
    L_0x0039:
        goto L_0x0046;
    L_0x003a:
        r1 = r4.pilgrimVisitId;
        r3 = r5.pilgrimVisitId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x006a;
    L_0x0046:
        r1 = r4.wifiScan;
        if (r1 != 0) goto L_0x0051;
    L_0x004a:
        r1 = r5.wifiScan();
        if (r1 != 0) goto L_0x006a;
    L_0x0050:
        goto L_0x005d;
    L_0x0051:
        r1 = r4.wifiScan;
        r3 = r5.wifiScan();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x006a;
    L_0x005d:
        r1 = r4.ll;
        r5 = r5.ll();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x006a;
    L_0x0069:
        goto L_0x006b;
    L_0x006a:
        r0 = 0;
    L_0x006b:
        return r0;
    L_0x006c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.api.$$AutoValue_Add3rdPartyCheckinParams.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((this.venueId.hashCode() ^ 1000003) * 1000003) ^ this.venueIdType.hashCode()) * 1000003) ^ this.now.hashCode()) * 1000003) ^ (this.pilgrimVisitId == null ? 0 : this.pilgrimVisitId.hashCode())) * 1000003;
        if (this.wifiScan != null) {
            i = this.wifiScan.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.ll.hashCode();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }
}
