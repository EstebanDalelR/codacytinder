package com.foursquare.pilgrim;

import android.content.Context;
import android.support.annotation.NonNull;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.api.PilgrimSearchParams;
import com.foursquare.internal.network.C1923d;
import com.foursquare.internal.network.C1928e;
import com.foursquare.internal.network.C1932g;
import com.foursquare.internal.network.p059a.C1918a;
import com.foursquare.internal.util.C1942d;
import com.foursquare.internal.util.C1947i;
import com.foursquare.pilgrim.PilgrimLogger.PilgrimLogEntry;
import com.foursquare.pilgrim.bm.C1977a;
import java.util.Date;

final class ba implements ak {
    /* renamed from: a */
    private final Context f10619a;

    ba(Context context) {
        this.f10619a = context;
    }

    /* renamed from: a */
    public C1932g<ay> mo2047a(FoursquareLocation foursquareLocation, CurrentPlace currentPlace, String str, boolean z, String str2, boolean z2) throws Exception {
        if (C1947i.m6837a().mo2014a(this.f10619a) == null) {
            throw new C1992y("We don't have a network connection, won't try to ping server.");
        } else if (m13329a() != null) {
            throw new C1992y("We are still in a server required sleep, not doing any network calls");
        } else {
            str2 = C1942d.m6822a(this.f10619a);
            float f = ((float) str2) / 100.0f;
            str2 = str2 == 100 ? "full" : C1942d.m6825b(this.f10619a) != null ? "charging" : "unplugged";
            ai a = bb.m7069a(this.f10619a, currentPlace.getLocation());
            String str3 = null;
            if (a != null) {
                str3 = C1918a.m6681a(a.m6920a());
            }
            return C1928e.m6757a().m6763b(bf.m7089a().m7093a(new C1977a().m7149a(foursquareLocation).m7150a(currentPlace).m7151a(str).m7152a(z).m7154b(currentPlace.getType().toString()).m7148a(f).m7156c(str2).m7157d(str3).m7155b(z2).m7153a()));
        }
    }

    /* renamed from: a */
    public C1932g<aw> mo2048a(FoursquareLocation foursquareLocation, boolean z, @NonNull PilgrimLogEntry pilgrimLogEntry, @NonNull RegionType regionType, String str, boolean z2) throws Exception {
        if (!z) {
            throw new C1992y("Battery level too low, won't try to ping server.");
        } else if (m13329a()) {
            throw new C1992y("We are still in a server required sleep, not doing any network calls");
        } else if (C1947i.m6837a().mo2014a(this.f10619a)) {
            Date date = new Date();
            if (ap.m6951a() != null) {
                pilgrimLogEntry = new StringBuilder();
                pilgrimLogEntry.append("Too many requests for today (");
                pilgrimLogEntry.append(date);
                pilgrimLogEntry.append(")");
                throw new C1992y(pilgrimLogEntry.toString());
            }
            bh.m7118b(date);
            C1923d.m6723a().m6736a(bh.m7137m());
            return C1928e.m6757a().m6763b(bf.m7089a().m7092a(PilgrimSearchParams.newBuilder().location(foursquareLocation).timestamp(foursquareLocation.getTime()).now(System.currentTimeMillis()).elapsedRealtimeNanos(foursquareLocation.getElapsedRealtimeNanos()).limit(1).wifiScan(C1923d.m6723a().m6741f()).limitAdsTracking(z2).checksum(bh.m7134j()).hasHomeWork(FrequentLocations.hasHomeOrWork(this.f10619a)).userInfo(PilgrimSdk.get().f5255c.m6998g()).locationType(regionType).nearbyTriggers(al.m6930a()).skipLogging(C1942d.m6824b()).build()));
        } else {
            throw new C1992y("We don't have a network connection, won't try to ping server.");
        }
    }

    /* renamed from: a */
    private static boolean m13329a() {
        return System.currentTimeMillis() < ax.m7003a().m7039i();
    }
}
