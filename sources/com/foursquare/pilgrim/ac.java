package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.api.types.GoogleMotionReading;
import com.foursquare.api.types.TrailPoint;
import com.foursquare.api.types.TrailPoint.Builder;
import com.foursquare.api.types.TrailPoint.Location;
import java.util.List;

final class ac {
    @Nullable
    /* renamed from: a */
    final String f5274a;
    @NonNull
    /* renamed from: b */
    final List<WifiScanResult> f5275b;
    @Nullable
    /* renamed from: c */
    final GoogleMotionReading f5276c;
    /* renamed from: d */
    final boolean f5277d;
    @NonNull
    /* renamed from: e */
    final BackgroundWakeupSource f5278e;
    @NonNull
    /* renamed from: f */
    private final FoursquareLocation f5279f;

    ac(@NonNull FoursquareLocation foursquareLocation, @Nullable String str, @NonNull List<WifiScanResult> list, @Nullable GoogleMotionReading googleMotionReading, boolean z, @NonNull BackgroundWakeupSource backgroundWakeupSource) {
        this.f5279f = foursquareLocation;
        this.f5274a = str;
        this.f5275b = list;
        this.f5276c = googleMotionReading;
        this.f5277d = z;
        this.f5278e = backgroundWakeupSource;
    }

    @NonNull
    /* renamed from: a */
    FoursquareLocation m6895a() {
        return this.f5279f;
    }

    @NonNull
    /* renamed from: b */
    public TrailPoint m6896b() {
        Builder newBuilder = TrailPoint.newBuilder();
        Float f = null;
        Location.Builder speed = Location.newBuilder().source(this.f5278e).lat(this.f5279f.getLat()).lng(this.f5279f.getLng()).hacc(this.f5279f.hasAccuracy() ? Float.valueOf(this.f5279f.getAccuracy()) : null).speed(this.f5279f.hasSpeed() ? Float.valueOf(this.f5279f.getSpeed()) : null);
        if (this.f5279f.hasHeading()) {
            f = Float.valueOf(this.f5279f.getHeading());
        }
        return newBuilder.location(speed.heading(f).timestamp(this.f5279f.getTime()).elapsedRealtimeNanos(this.f5279f.getElapsedRealtimeNanos()).build()).motionReading(this.f5276c).wifiScans(this.f5275b).build();
    }
}
