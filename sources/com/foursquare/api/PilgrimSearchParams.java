package com.foursquare.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import com.foursquare.api.AutoValue_PilgrimSearchParams.GsonTypeAdapter;
import com.foursquare.pilgrim.PilgrimUserInfo;
import com.foursquare.pilgrim.RegionType;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
@RestrictTo({Scope.LIBRARY_GROUP})
public abstract class PilgrimSearchParams {

    public interface Builder {
        @NonNull
        PilgrimSearchParams build();

        @NonNull
        Builder checksum(@Nullable String str);

        @NonNull
        Builder elapsedRealtimeNanos(long j);

        @NonNull
        Builder hasHomeWork(boolean z);

        @NonNull
        Builder limit(int i);

        @NonNull
        Builder limitAdsTracking(boolean z);

        @NonNull
        Builder location(@NonNull FoursquareLocation foursquareLocation);

        @NonNull
        Builder locationType(@NonNull RegionType regionType);

        @NonNull
        Builder nearbyTriggers(@Nullable String str);

        @NonNull
        Builder now(long j);

        @NonNull
        Builder skipLogging(boolean z);

        @NonNull
        Builder timestamp(long j);

        @NonNull
        Builder userInfo(@Nullable PilgrimUserInfo pilgrimUserInfo);

        @NonNull
        Builder wifiScan(@Nullable String str);
    }

    @Nullable
    public abstract String checksum();

    public abstract long elapsedRealtimeNanos();

    public abstract boolean hasHomeWork();

    public abstract int limit();

    public abstract boolean limitAdsTracking();

    @NonNull
    public abstract FoursquareLocation location();

    @NonNull
    public abstract RegionType locationType();

    @Nullable
    public abstract String nearbyTriggers();

    public abstract long now();

    public abstract boolean skipLogging();

    public abstract long timestamp();

    @Nullable
    public abstract PilgrimUserInfo userInfo();

    @Nullable
    public abstract String wifiScan();

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public static TypeAdapter<PilgrimSearchParams> typeAdapter(@NonNull Gson gson) {
        return new GsonTypeAdapter(gson);
    }
}
