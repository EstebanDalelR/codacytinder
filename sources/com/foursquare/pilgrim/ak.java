package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.internal.network.C1932g;
import com.foursquare.pilgrim.PilgrimLogger.PilgrimLogEntry;

interface ak {
    /* renamed from: a */
    C1932g<ay> mo2047a(FoursquareLocation foursquareLocation, CurrentPlace currentPlace, String str, boolean z, String str2, boolean z2) throws Exception;

    /* renamed from: a */
    C1932g<aw> mo2048a(FoursquareLocation foursquareLocation, boolean z, @NonNull PilgrimLogEntry pilgrimLogEntry, @NonNull RegionType regionType, String str, boolean z2) throws Exception;
}
