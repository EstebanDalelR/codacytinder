package com.foursquare.api;

import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import com.foursquare.api.$AutoValue_Add3rdPartyCheckinParams.GsonTypeAdapter;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.Date;

@AutoValue
@RestrictTo({Scope.LIBRARY_GROUP})
public abstract class Add3rdPartyCheckinParams implements Parcelable {

    public interface Builder {
        @NonNull
        Add3rdPartyCheckinParams build();

        @NonNull
        Builder ll(@NonNull FoursquareLocation foursquareLocation);

        @NonNull
        Builder now(@NonNull Date date);

        @NonNull
        Builder pilgrimVisitId(@Nullable String str);

        @NonNull
        Builder venueId(@NonNull String str);

        @NonNull
        Builder venueIdType(@NonNull VenueIdType venueIdType);

        @NonNull
        Builder wifiScan(@Nullable String str);
    }

    public enum VenueIdType {
        FOURSQUARE,
        HARMONIZED_THIRD_PARTY
    }

    @NonNull
    public abstract FoursquareLocation ll();

    @NonNull
    public abstract Date now();

    @Nullable
    public abstract String pilgrimVisitId();

    @NonNull
    public abstract Builder toBuilder();

    @NonNull
    public abstract String venueId();

    @NonNull
    public abstract VenueIdType venueIdType();

    @Nullable
    public abstract String wifiScan();

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public static TypeAdapter<Add3rdPartyCheckinParams> typeAdapter(@NonNull Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    Add3rdPartyCheckinParams() {
    }
}
