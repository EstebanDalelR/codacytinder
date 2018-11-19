package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.location.LocationDetails;
import com.tinder.api.model.profile.Travel.TravelLocationInfo;

/* renamed from: com.tinder.api.model.profile.$AutoValue_Travel_TravelLocationInfo */
abstract class C$AutoValue_Travel_TravelLocationInfo extends TravelLocationInfo {
    private final LocationDetails administrativeAreaLevel1;
    private final LocationDetails administrativeAreaLevel2;
    private final LocationDetails country;
    private final double lat;
    private final LocationDetails locality;
    private final double lon;
    private final LocationDetails route;
    private final LocationDetails street;
    private final String streetAddress;

    C$AutoValue_Travel_TravelLocationInfo(double d, double d2, @Nullable LocationDetails locationDetails, @Nullable LocationDetails locationDetails2, @Nullable LocationDetails locationDetails3, LocationDetails locationDetails4, @Nullable LocationDetails locationDetails5, @Nullable String str, @Nullable LocationDetails locationDetails6) {
        this.lat = d;
        this.lon = d2;
        this.locality = locationDetails;
        this.administrativeAreaLevel1 = locationDetails2;
        this.administrativeAreaLevel2 = locationDetails3;
        if (locationDetails4 == null) {
            throw new NullPointerException("Null country");
        }
        this.country = locationDetails4;
        this.route = locationDetails5;
        this.streetAddress = str;
        this.street = locationDetails6;
    }

    public double lat() {
        return this.lat;
    }

    public double lon() {
        return this.lon;
    }

    @Nullable
    @Json(name = "locality")
    public LocationDetails locality() {
        return this.locality;
    }

    @Nullable
    @Json(name = "administrative_area_level_1")
    public LocationDetails administrativeAreaLevel1() {
        return this.administrativeAreaLevel1;
    }

    @Nullable
    @Json(name = "administrative_area_level_2")
    public LocationDetails administrativeAreaLevel2() {
        return this.administrativeAreaLevel2;
    }

    @Json(name = "country")
    public LocationDetails country() {
        return this.country;
    }

    @Nullable
    @Json(name = "route")
    public LocationDetails route() {
        return this.route;
    }

    @Nullable
    @Json(name = "street_address")
    public String streetAddress() {
        return this.streetAddress;
    }

    @Nullable
    @Json(name = "street_number")
    public LocationDetails street() {
        return this.street;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TravelLocationInfo{lat=");
        stringBuilder.append(this.lat);
        stringBuilder.append(", lon=");
        stringBuilder.append(this.lon);
        stringBuilder.append(", locality=");
        stringBuilder.append(this.locality);
        stringBuilder.append(", administrativeAreaLevel1=");
        stringBuilder.append(this.administrativeAreaLevel1);
        stringBuilder.append(", administrativeAreaLevel2=");
        stringBuilder.append(this.administrativeAreaLevel2);
        stringBuilder.append(", country=");
        stringBuilder.append(this.country);
        stringBuilder.append(", route=");
        stringBuilder.append(this.route);
        stringBuilder.append(", streetAddress=");
        stringBuilder.append(this.streetAddress);
        stringBuilder.append(", street=");
        stringBuilder.append(this.street);
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
        r1 = r8 instanceof com.tinder.api.model.profile.Travel.TravelLocationInfo;
        r2 = 0;
        if (r1 == 0) goto L_0x00c8;
    L_0x0009:
        r8 = (com.tinder.api.model.profile.Travel.TravelLocationInfo) r8;
        r3 = r7.lat;
        r3 = java.lang.Double.doubleToLongBits(r3);
        r5 = r8.lat();
        r5 = java.lang.Double.doubleToLongBits(r5);
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x00c6;
    L_0x001d:
        r3 = r7.lon;
        r3 = java.lang.Double.doubleToLongBits(r3);
        r5 = r8.lon();
        r5 = java.lang.Double.doubleToLongBits(r5);
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x00c6;
    L_0x002f:
        r1 = r7.locality;
        if (r1 != 0) goto L_0x003a;
    L_0x0033:
        r1 = r8.locality();
        if (r1 != 0) goto L_0x00c6;
    L_0x0039:
        goto L_0x0046;
    L_0x003a:
        r1 = r7.locality;
        r3 = r8.locality();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c6;
    L_0x0046:
        r1 = r7.administrativeAreaLevel1;
        if (r1 != 0) goto L_0x0051;
    L_0x004a:
        r1 = r8.administrativeAreaLevel1();
        if (r1 != 0) goto L_0x00c6;
    L_0x0050:
        goto L_0x005d;
    L_0x0051:
        r1 = r7.administrativeAreaLevel1;
        r3 = r8.administrativeAreaLevel1();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c6;
    L_0x005d:
        r1 = r7.administrativeAreaLevel2;
        if (r1 != 0) goto L_0x0068;
    L_0x0061:
        r1 = r8.administrativeAreaLevel2();
        if (r1 != 0) goto L_0x00c6;
    L_0x0067:
        goto L_0x0074;
    L_0x0068:
        r1 = r7.administrativeAreaLevel2;
        r3 = r8.administrativeAreaLevel2();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c6;
    L_0x0074:
        r1 = r7.country;
        r3 = r8.country();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c6;
    L_0x0080:
        r1 = r7.route;
        if (r1 != 0) goto L_0x008b;
    L_0x0084:
        r1 = r8.route();
        if (r1 != 0) goto L_0x00c6;
    L_0x008a:
        goto L_0x0097;
    L_0x008b:
        r1 = r7.route;
        r3 = r8.route();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c6;
    L_0x0097:
        r1 = r7.streetAddress;
        if (r1 != 0) goto L_0x00a2;
    L_0x009b:
        r1 = r8.streetAddress();
        if (r1 != 0) goto L_0x00c6;
    L_0x00a1:
        goto L_0x00ae;
    L_0x00a2:
        r1 = r7.streetAddress;
        r3 = r8.streetAddress();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c6;
    L_0x00ae:
        r1 = r7.street;
        if (r1 != 0) goto L_0x00b9;
    L_0x00b2:
        r8 = r8.street();
        if (r8 != 0) goto L_0x00c6;
    L_0x00b8:
        goto L_0x00c7;
    L_0x00b9:
        r1 = r7.street;
        r8 = r8.street();
        r8 = r1.equals(r8);
        if (r8 == 0) goto L_0x00c6;
    L_0x00c5:
        goto L_0x00c7;
    L_0x00c6:
        r0 = 0;
    L_0x00c7:
        return r0;
    L_0x00c8:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.profile.$AutoValue_Travel_TravelLocationInfo.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int doubleToLongBits = ((((((((((((((int) (((long) (((int) (((long) 1000003) ^ ((Double.doubleToLongBits(this.lat) >>> 32) ^ Double.doubleToLongBits(this.lat)))) * 1000003)) ^ ((Double.doubleToLongBits(this.lon) >>> 32) ^ Double.doubleToLongBits(this.lon)))) * 1000003) ^ (this.locality == null ? 0 : this.locality.hashCode())) * 1000003) ^ (this.administrativeAreaLevel1 == null ? 0 : this.administrativeAreaLevel1.hashCode())) * 1000003) ^ (this.administrativeAreaLevel2 == null ? 0 : this.administrativeAreaLevel2.hashCode())) * 1000003) ^ this.country.hashCode()) * 1000003) ^ (this.route == null ? 0 : this.route.hashCode())) * 1000003) ^ (this.streetAddress == null ? 0 : this.streetAddress.hashCode())) * 1000003;
        if (this.street != null) {
            i = this.street.hashCode();
        }
        return doubleToLongBits ^ i;
    }
}
