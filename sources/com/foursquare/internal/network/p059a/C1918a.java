package com.foursquare.internal.network.p059a;

import com.foursquare.api.FoursquareLocation;

/* renamed from: com.foursquare.internal.network.a.a */
public class C1918a {
    /* renamed from: a */
    public static String m6681a(FoursquareLocation foursquareLocation) {
        if (foursquareLocation == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(foursquareLocation.getLat());
        stringBuilder.append(",");
        stringBuilder.append(foursquareLocation.getLng());
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public static String m6682b(FoursquareLocation foursquareLocation) {
        return (foursquareLocation == null || !foursquareLocation.hasAccuracy()) ? null : String.valueOf(foursquareLocation.getAccuracy());
    }

    /* renamed from: c */
    public static String m6683c(FoursquareLocation foursquareLocation) {
        return (foursquareLocation == null || !foursquareLocation.hasAltitude()) ? null : String.valueOf(foursquareLocation.getAltitude());
    }
}
