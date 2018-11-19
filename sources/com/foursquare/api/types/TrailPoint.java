package com.foursquare.api.types;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import com.foursquare.api.types.AutoValue_TrailPoint_Location.GsonTypeAdapter;
import com.foursquare.pilgrim.BackgroundWakeupSource;
import com.foursquare.pilgrim.WifiScanResult;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.List;

@AutoValue
@RestrictTo({Scope.LIBRARY_GROUP})
public abstract class TrailPoint {

    public interface Builder {
        @NonNull
        TrailPoint build();

        @NonNull
        Builder location(@Nullable Location location);

        @NonNull
        Builder motionReading(@Nullable GoogleMotionReading googleMotionReading);

        @NonNull
        Builder wifiScans(@Nullable List<WifiScanResult> list);
    }

    @AutoValue
    public static abstract class Location {

        public interface Builder {
            @NonNull
            Location build();

            @NonNull
            Builder elapsedRealtimeNanos(long j);

            @NonNull
            Builder hacc(@Nullable Float f);

            @NonNull
            Builder heading(@Nullable Float f);

            @NonNull
            Builder lat(double d);

            @NonNull
            Builder lng(double d);

            @NonNull
            Builder source(@NonNull BackgroundWakeupSource backgroundWakeupSource);

            @NonNull
            Builder speed(@Nullable Float f);

            @NonNull
            Builder timestamp(long j);
        }

        public abstract long elapsedRealtimeNanos();

        @Nullable
        public abstract Float hacc();

        @Nullable
        public abstract Float heading();

        public abstract double lat();

        public abstract double lng();

        @NonNull
        public abstract BackgroundWakeupSource source();

        @Nullable
        public abstract Float speed();

        public abstract long timestamp();

        @NonNull
        public static Builder newBuilder() {
            return new Builder();
        }

        public static TypeAdapter<Location> typeAdapter(Gson gson) {
            return new GsonTypeAdapter(gson);
        }
    }

    @Nullable
    public abstract Location location();

    @Nullable
    public abstract GoogleMotionReading motionReading();

    @Nullable
    public abstract List<WifiScanResult> wifiScans();

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public final TrailPoint filteredForPrivacySettings(boolean z, boolean z2, boolean z3) {
        List list = null;
        z = newBuilder().location(z ? location() : false).motionReading(z2 ? motionReading() : false);
        if (z3) {
            list = wifiScans();
        }
        return z.wifiScans(list).build();
    }

    public static TypeAdapter<TrailPoint> typeAdapter(@NonNull Gson gson) {
        return new AutoValue_TrailPoint.GsonTypeAdapter(gson);
    }
}
