package com.tinder.api.model.location;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;

/* renamed from: com.tinder.api.model.location.$AutoValue_Location */
abstract class C$AutoValue_Location extends Location {
    private final LocationDetails administrativeAreaLevel1;
    private final LocationDetails administrativeAreaLevel2;
    private final LocationDetails country;
    private final Double latitude;
    private final LocationDetails locality;
    private final Double longitude;

    C$AutoValue_Location(@Nullable Double d, @Nullable Double d2, @Nullable LocationDetails locationDetails, @Nullable LocationDetails locationDetails2, @Nullable LocationDetails locationDetails3, @Nullable LocationDetails locationDetails4) {
        this.latitude = d;
        this.longitude = d2;
        this.locality = locationDetails;
        this.administrativeAreaLevel1 = locationDetails2;
        this.administrativeAreaLevel2 = locationDetails3;
        this.country = locationDetails4;
    }

    @Nullable
    @Json(name = "lat")
    public Double latitude() {
        return this.latitude;
    }

    @Nullable
    @Json(name = "lon")
    public Double longitude() {
        return this.longitude;
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

    @Nullable
    @Json(name = "country")
    public LocationDetails country() {
        return this.country;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Location{latitude=");
        stringBuilder.append(this.latitude);
        stringBuilder.append(", longitude=");
        stringBuilder.append(this.longitude);
        stringBuilder.append(", locality=");
        stringBuilder.append(this.locality);
        stringBuilder.append(", administrativeAreaLevel1=");
        stringBuilder.append(this.administrativeAreaLevel1);
        stringBuilder.append(", administrativeAreaLevel2=");
        stringBuilder.append(this.administrativeAreaLevel2);
        stringBuilder.append(", country=");
        stringBuilder.append(this.country);
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
        r1 = r5 instanceof com.tinder.api.model.location.Location;
        r2 = 0;
        if (r1 == 0) goto L_0x0098;
    L_0x0009:
        r5 = (com.tinder.api.model.location.Location) r5;
        r1 = r4.latitude;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.latitude();
        if (r1 != 0) goto L_0x0096;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.latitude;
        r3 = r5.latitude();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0096;
    L_0x0022:
        r1 = r4.longitude;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.longitude();
        if (r1 != 0) goto L_0x0096;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.longitude;
        r3 = r5.longitude();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0096;
    L_0x0039:
        r1 = r4.locality;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.locality();
        if (r1 != 0) goto L_0x0096;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.locality;
        r3 = r5.locality();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0096;
    L_0x0050:
        r1 = r4.administrativeAreaLevel1;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.administrativeAreaLevel1();
        if (r1 != 0) goto L_0x0096;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.administrativeAreaLevel1;
        r3 = r5.administrativeAreaLevel1();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0096;
    L_0x0067:
        r1 = r4.administrativeAreaLevel2;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.administrativeAreaLevel2();
        if (r1 != 0) goto L_0x0096;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.administrativeAreaLevel2;
        r3 = r5.administrativeAreaLevel2();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0096;
    L_0x007e:
        r1 = r4.country;
        if (r1 != 0) goto L_0x0089;
    L_0x0082:
        r5 = r5.country();
        if (r5 != 0) goto L_0x0096;
    L_0x0088:
        goto L_0x0097;
    L_0x0089:
        r1 = r4.country;
        r5 = r5.country();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0096;
    L_0x0095:
        goto L_0x0097;
    L_0x0096:
        r0 = 0;
    L_0x0097:
        return r0;
    L_0x0098:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.location.$AutoValue_Location.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((this.latitude == null ? 0 : this.latitude.hashCode()) ^ 1000003) * 1000003) ^ (this.longitude == null ? 0 : this.longitude.hashCode())) * 1000003) ^ (this.locality == null ? 0 : this.locality.hashCode())) * 1000003) ^ (this.administrativeAreaLevel1 == null ? 0 : this.administrativeAreaLevel1.hashCode())) * 1000003) ^ (this.administrativeAreaLevel2 == null ? 0 : this.administrativeAreaLevel2.hashCode())) * 1000003;
        if (this.country != null) {
            i = this.country.hashCode();
        }
        return hashCode ^ i;
    }
}
