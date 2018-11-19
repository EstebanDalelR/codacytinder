package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.api.types.GeoFence;
import com.foursquare.internal.util.C1942d;
import com.foursquare.internal.util.C1943e;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

class ae {
    /* renamed from: a */
    static Comparator<FoursquareLocation> f5283a = new C19641();

    /* renamed from: com.foursquare.pilgrim.ae$1 */
    class C19641 implements Comparator<FoursquareLocation> {
        C19641() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m6900a((FoursquareLocation) obj, (FoursquareLocation) obj2);
        }

        /* renamed from: a */
        public int m6900a(FoursquareLocation foursquareLocation, FoursquareLocation foursquareLocation2) {
            return (int) (foursquareLocation.getTime() - foursquareLocation2.getTime());
        }
    }

    /* renamed from: a */
    static long m6901a(@NonNull FoursquareLocation foursquareLocation) {
        if (m6902a()) {
            return TimeUnit.NANOSECONDS.toMillis(foursquareLocation.getElapsedRealtimeNanos());
        }
        return foursquareLocation.getTime();
    }

    /* renamed from: a */
    static boolean m6902a() {
        return ax.m7003a().m7046p() && C1942d.m6823a();
    }

    /* renamed from: a */
    static boolean m6903a(GeoFence geoFence, FoursquareLocation foursquareLocation) {
        return geoFence.getRadius() + ((double) foursquareLocation.getAccuracy()) < C1943e.m6826a(geoFence.getLat(), geoFence.getLng(), foursquareLocation.getLat(), foursquareLocation.getLng()) ? true : null;
    }
}
