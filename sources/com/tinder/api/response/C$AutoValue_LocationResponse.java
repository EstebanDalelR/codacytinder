package com.tinder.api.response;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.location.Location;
import java.util.List;

/* renamed from: com.tinder.api.response.$AutoValue_LocationResponse */
abstract class C$AutoValue_LocationResponse extends LocationResponse {
    private final List<Location> locationList;
    private final Integer status;

    C$AutoValue_LocationResponse(List<Location> list, @Nullable Integer num) {
        if (list == null) {
            throw new NullPointerException("Null locationList");
        }
        this.locationList = list;
        this.status = num;
    }

    @Json(name = "results")
    public List<Location> locationList() {
        return this.locationList;
    }

    @Nullable
    @Json(name = "status")
    public Integer status() {
        return this.status;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LocationResponse{locationList=");
        stringBuilder.append(this.locationList);
        stringBuilder.append(", status=");
        stringBuilder.append(this.status);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocationResponse)) {
            return false;
        }
        LocationResponse locationResponse = (LocationResponse) obj;
        if (this.locationList.equals(locationResponse.locationList())) {
            if (this.status == null) {
                if (locationResponse.status() == null) {
                    return z;
                }
            } else if (this.status.equals(locationResponse.status()) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return ((this.locationList.hashCode() ^ 1000003) * 1000003) ^ (this.status == null ? 0 : this.status.hashCode());
    }
}
