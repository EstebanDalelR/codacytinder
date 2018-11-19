package com.foursquare.internal.p058a;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.foursquare.api.FoursquareLocation;

/* renamed from: com.foursquare.internal.a.a */
public final class C1912a {
    @NonNull
    /* renamed from: a */
    private static final C1912a f5131a = new C1912a();

    @Nullable
    @Deprecated
    /* renamed from: b */
    public FoursquareLocation m6646b() {
        return null;
    }

    @NonNull
    /* renamed from: a */
    public static C1912a m6645a() {
        return f5131a;
    }

    private C1912a() {
    }

    @Nullable
    /* renamed from: a */
    public static FoursquareLocation m6644a(@NonNull Context context) {
        Location lastKnownLocation = ((LocationManager) context.getSystemService("location")).getLastKnownLocation("network");
        if (lastKnownLocation == null) {
            return null;
        }
        return new FoursquareLocation(lastKnownLocation);
    }
}
