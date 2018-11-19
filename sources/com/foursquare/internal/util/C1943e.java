package com.foursquare.internal.util;

import android.location.Location;
import android.support.annotation.FloatRange;
import com.foursquare.api.FoursquareLocation;

/* renamed from: com.foursquare.internal.util.e */
public class C1943e {
    /* renamed from: c */
    private static double m6829c(double d, double d2, double d3, double d4) {
        double toRadians = Math.toRadians(d3 - d);
        toRadians /= 2.0d;
        d2 = Math.toRadians(d4 - d2) / 2.0d;
        double sin = (Math.sin(toRadians) * Math.sin(toRadians)) + (((Math.cos(Math.toRadians(d)) * Math.cos(Math.toRadians(d3))) * Math.sin(d2)) * Math.sin(d2));
        return (Math.atan2(Math.sqrt(sin), Math.sqrt(1.0d - sin)) * 2.0d) * 6378.137d;
    }

    /* renamed from: a */
    public static double m6826a(double d, double d2, double d3, double d4) {
        return C1943e.m6829c(d, d2, d3, d4) * 1000.0d;
    }

    /* renamed from: a */
    public static float m6827a(FoursquareLocation foursquareLocation, FoursquareLocation foursquareLocation2) {
        if (foursquareLocation != null) {
            if (foursquareLocation2 != null) {
                float[] fArr = new float[1];
                Location.distanceBetween(foursquareLocation.getLat(), foursquareLocation.getLng(), foursquareLocation2.getLat(), foursquareLocation2.getLng(), fArr);
                return fArr[null];
            }
        }
        return null;
    }

    @FloatRange(from = 0.0d, to = 3.4028234663852886E38d)
    /* renamed from: b */
    public static double m6828b(double d, double d2, double d3, double d4) {
        return Math.sqrt(Math.pow(d3 - d, 2.0d) + Math.pow(d4 - d2, 2.0d));
    }
}
