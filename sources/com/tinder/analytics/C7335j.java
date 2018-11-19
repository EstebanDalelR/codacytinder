package com.tinder.analytics;

import android.location.Location;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumLocationAccuracyType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/analytics/LeanplumLocationTracker;", "Lcom/tinder/analytics/ThirdPartyLocationUpdatesListener;", "()V", "onLocationUpdated", "", "location", "Landroid/location/Location;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.analytics.j */
public final class C7335j implements ThirdPartyLocationUpdatesListener {
    public void onLocationUpdated(@NotNull Location location) {
        C2668g.b(location, "location");
        Leanplum.setDeviceLocation(location, LeanplumLocationAccuracyType.GPS);
    }
}
