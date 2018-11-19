package com.foursquare.pilgrim;

import android.content.Context;
import android.location.Location;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.api.types.GeoFence;
import com.foursquare.api.types.NextPing;
import com.foursquare.internal.util.C1942d;
import com.foursquare.pilgrim.PilgrimLogger.PilgrimLogEntry;
import java.util.Date;
import java.util.Map.Entry;

final class ap {
    /* renamed from: a */
    static boolean m6952a(Context context, int i) {
        if (i <= ax.m7003a().m7045o()) {
            if (C1942d.m6825b(context) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    static boolean m6951a() {
        return bh.m7107a(new Date()) > 50;
    }

    /* renamed from: a */
    static String m6950a(PilgrimUserInfo pilgrimUserInfo) {
        if (pilgrimUserInfo == null) {
            return null;
        }
        Builder builder = new Builder();
        for (Entry entry : pilgrimUserInfo.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                if (!TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return builder.build().getEncodedQuery();
    }

    /* renamed from: a */
    static NextPing m6949a(FoursquareLocation foursquareLocation) {
        NextPing nextPing = new NextPing();
        if (foursquareLocation != null) {
            GeoFence geoFence = new GeoFence(foursquareLocation.getLat(), foursquareLocation.getLng(), (double) ax.m7003a().m7044n());
            nextPing.setMinTime(3600);
            nextPing.setGeoFence(geoFence);
        }
        return nextPing;
    }

    /* renamed from: a */
    static boolean m6953a(FoursquareLocation foursquareLocation, double d, GeoFence geoFence, ax axVar) {
        boolean z = false;
        if (foursquareLocation != null) {
            if (geoFence != null) {
                if (axVar.m7054x() != null) {
                    return ae.m6903a(geoFence, foursquareLocation);
                }
                axVar = new float[3];
                Location.distanceBetween(geoFence.getLat(), geoFence.getLng(), foursquareLocation.getLat(), foursquareLocation.getLng(), axVar);
                if (((double) axVar[0]) > geoFence.getRadius() * d) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m6954a(PilgrimLogEntry pilgrimLogEntry) {
        if (ax.m7003a().m7034d() != ax.m7003a().m7037g().getSampleRateInSeconds()) {
            pilgrimLogEntry = ax.m7003a().m7035e();
            Object obj = -1;
            int hashCode = pilgrimLogEntry.hashCode();
            if (hashCode != -1902812103) {
                if (hashCode == 714282651) {
                    if (pilgrimLogEntry.equals("serversleeprequest") != null) {
                        obj = 1;
                    }
                }
            } else if (pilgrimLogEntry.equals("lowbattery") != null) {
                obj = null;
            }
            switch (obj) {
                case null:
                    ax.m7003a().m7022a(ax.m7003a().m7037g().getSampleRateInSeconds(), "normal");
                    ax.m7003a().m7037g().setFastestIntervalInSeconds(60);
                    return true;
                case 1:
                    return false;
                default:
                    return false;
            }
        } else if (((long) ax.m7003a().m7037g().getFastestIntervalInSeconds()) == 60) {
            return false;
        } else {
            ax.m7003a().m7037g().setFastestIntervalInSeconds(60);
            return true;
        }
    }

    /* renamed from: b */
    static boolean m6955b(PilgrimLogEntry pilgrimLogEntry) {
        if (ax.m7003a().m7034d() == 600) {
            return null;
        }
        ax.m7003a().m7022a(600, "lowbattery");
        ax.m7003a().m7037g().setFastestIntervalInSeconds(600);
        return true;
    }
}
