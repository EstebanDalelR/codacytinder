package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.location.LocationDetails;
import com.tinder.api.model.profile.AutoValue_Travel_TravelLocationInfo.MoshiJsonAdapter;
import java.util.List;

public abstract class Travel {

    public static abstract class TravelLocationInfo {
        @Nullable
        @Json(name = "administrative_area_level_1")
        public abstract LocationDetails administrativeAreaLevel1();

        @Nullable
        @Json(name = "administrative_area_level_2")
        public abstract LocationDetails administrativeAreaLevel2();

        @Json(name = "country")
        public abstract LocationDetails country();

        public abstract double lat();

        @Nullable
        @Json(name = "locality")
        public abstract LocationDetails locality();

        public abstract double lon();

        @Nullable
        @Json(name = "route")
        public abstract LocationDetails route();

        @Nullable
        @Json(name = "street_number")
        public abstract LocationDetails street();

        @Nullable
        @Json(name = "street_address")
        public abstract String streetAddress();

        public static JsonAdapter<TravelLocationInfo> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class TravelPosition {
        public abstract Double lat();

        public abstract Double lon();

        public static JsonAdapter<TravelPosition> jsonAdapter(C5987p c5987p) {
            return new AutoValue_Travel_TravelPosition.MoshiJsonAdapter(c5987p);
        }
    }

    @Nullable
    @Json(name = "is_traveling")
    public abstract Boolean isTraveling();

    @Nullable
    @Json(name = "travel_location_info")
    public abstract List<TravelLocationInfo> travelLocationInfo();

    @Nullable
    @Json(name = "travel_pos")
    public abstract TravelPosition travelPos();

    public static JsonAdapter<Travel> jsonAdapter(C5987p c5987p) {
        return new AutoValue_Travel.MoshiJsonAdapter(c5987p);
    }
}
