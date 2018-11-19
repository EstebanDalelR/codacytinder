package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.ae.C7397a;
import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.cg.r */
public final class C5187r {
    /* renamed from: a */
    public static double m23178a(double d, double d2) {
        d = Math.abs(d - d2);
        return Math.min(d, 360.0d - d);
    }

    /* renamed from: a */
    public static ae<LatLng> m23181a(List<LatLng> list) {
        C7397a g = ae.m27686g();
        LinkedList b = au.m20530b((Iterable) list);
        if (b.isEmpty()) {
            return ae.m27685e();
        }
        LatLng latLng = (LatLng) b.removeFirst();
        while (!b.isEmpty()) {
            LatLng latLng2 = (LatLng) b.getFirst();
            if (Math.max(Math.abs(latLng.latitude - latLng2.latitude), C5187r.m23178a(latLng.longitude, latLng2.longitude)) < 4.0d) {
                g.m31831c(latLng);
                latLng = (LatLng) b.removeFirst();
            } else {
                Object obj = (latLng.latitude == (-latLng2.latitude) && Math.abs(latLng.longitude - latLng2.longitude) == 180.0d) ? 1 : null;
                if (obj != null) {
                    obj = new LatLng(0.0d, (latLng.longitude + latLng2.longitude) / 2.0d);
                } else {
                    bl a = bl.m22976a(latLng);
                    bl a2 = bl.m22976a(latLng2);
                    bl blVar = r9;
                    bl blVar2 = new bl((a.f19118a + a2.f19118a) / 2.0d, (a.f19119b + a2.f19119b) / 2.0d, (a.f19120c + a2.f19120c) / 2.0d);
                    if (blVar.f19118a == 0.0d && blVar.f19119b == 0.0d && blVar.f19120c == 0.0d) {
                        throw new ArithmeticException();
                    }
                    double d;
                    double atan2 = Math.atan2(blVar.f19120c, Math.sqrt((blVar.f19118a * blVar.f19118a) + (blVar.f19119b * blVar.f19119b)));
                    if (blVar.f19119b == 0.0d && blVar.f19118a == 0.0d) {
                        d = 0.0d;
                    } else {
                        d = Math.atan2(blVar.f19119b, blVar.f19118a);
                    }
                    obj = new LatLng(Math.toDegrees(atan2), Math.toDegrees(d));
                }
                b.addFirst(obj);
            }
        }
        g.m31831c(latLng);
        return g.m31828a();
    }

    /* renamed from: a */
    public static double m23179a(LatLng latLng, double d) {
        return Math.toDegrees(d / (Math.cos(Math.toRadians(latLng.latitude)) * 6371009.0d));
    }

    /* renamed from: a */
    public static double m23177a(double d) {
        return Math.toDegrees(d / 6371009.0d);
    }

    /* renamed from: a */
    public static ae<LatLng> m23180a(LatLng latLng, double d, int i) {
        LatLng latLng2 = latLng;
        C7397a g = ae.m27686g();
        double toRadians = Math.toRadians(latLng2.latitude);
        double toRadians2 = Math.toRadians(latLng2.longitude);
        double d2 = d / 6371009.0d;
        double cos = Math.cos(d2);
        d2 = Math.sin(d2);
        double cos2 = Math.cos(toRadians);
        toRadians = Math.sin(toRadians);
        int i2 = 0;
        while (i2 < 100) {
            double d3 = (((double) i2) * 6.283185307179586d) / 99.0d;
            double cos3 = Math.cos(d3);
            d3 = Math.sin(d3);
            cos3 = (toRadians * cos) + ((cos2 * d2) * cos3);
            int i3 = i2;
            C7397a c7397a = g;
            LatLng latLng3 = new LatLng(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(Math.atan2((d3 * d2) * cos2, cos - (cos3 * toRadians)) + toRadians2));
            C7397a c7397a2 = c7397a;
            c7397a2.m31831c(latLng3);
            g = c7397a2;
            i2 = i3 + 1;
        }
        return g.m31828a();
    }

    /* renamed from: a */
    public static LatLngBounds m23182a(LatLng latLng, double d, double d2, double d3, double d4) {
        Object obj = latLng;
        double d5 = d4;
        C5571j.m24293a(obj, (Object) "Null anchor");
        C5571j.m24299a(d3 >= 0.0d, "Negative latSpan: %s", Double.valueOf(d3));
        C5571j.m24299a(d5 >= 0.0d, "Negative lngSpan: %s", Double.valueOf(d4));
        d5 = Math.min(359.999999d, d5);
        return new LatLngBounds(new LatLng(obj.latitude - ((1.0d - d2) * d3), obj.longitude - (d5 * d)), new LatLng(obj.latitude + (d3 * d2), obj.longitude + (d5 * (1.0d - d))));
    }
}
