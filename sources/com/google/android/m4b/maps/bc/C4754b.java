package com.google.android.m4b.maps.bc;

import android.graphics.Color;
import com.google.android.m4b.maps.ax.C4700b;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.bq;
import com.google.android.m4b.maps.bv.C4948t;
import com.google.android.m4b.maps.bz.C6571c;
import com.google.android.m4b.maps.cg.bw;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.CameraPosition.Builder;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;
import com.google.android.m4b.maps.model.StreetViewPanoramaLink;

/* renamed from: com.google.android.m4b.maps.bc.b */
public final class C4754b {
    /* renamed from: a */
    public static C4700b m21094a(LatLng latLng) {
        return new C4700b(C4754b.m21092a(latLng.latitude), C4754b.m21092a(latLng.longitude));
    }

    /* renamed from: b */
    public static af m21100b(LatLng latLng) {
        return af.m21455a(latLng.latitude, latLng.longitude);
    }

    /* renamed from: a */
    public static LatLng m21097a(af afVar) {
        return new LatLng(afVar.m21481b(), afVar.m21485d());
    }

    /* renamed from: a */
    public static CameraPosition m21096a(C6571c c6571c) {
        return new Builder().m23848a(C4754b.m21097a(c6571c.m29272c())).m23847a(c6571c.m29269a()).m23851c(c6571c.m29274e()).m23850b(c6571c.m29273d()).m23849a();
    }

    /* renamed from: a */
    public static int m21092a(double d) {
        return (int) Math.round(d * 1000000.0d);
    }

    /* renamed from: a */
    public static bq m21095a(LatLngBounds latLngBounds) {
        if (latLngBounds.northeast.longitude >= latLngBounds.southwest.longitude) {
            return bq.m28669a(new al(C4754b.m21100b(latLngBounds.southwest), C4754b.m21100b(latLngBounds.northeast)));
        }
        return bq.m28669a(new al(C4754b.m21100b(latLngBounds.southwest), C4754b.m21100b(latLngBounds.northeast).m21489e(new af(1073741824, 0))));
    }

    /* renamed from: a */
    public static int m21093a(int i) {
        int alpha = Color.alpha(i);
        return Color.argb(alpha, (Color.red(i) * alpha) / 255, (Color.green(i) * alpha) / 255, (Color.blue(i) * alpha) / 255);
    }

    /* renamed from: a */
    public static StreetViewPanoramaCamera m21098a(bw bwVar) {
        if (bwVar == null) {
            return null;
        }
        return new StreetViewPanoramaCamera(bwVar.m23054e(), bwVar.m23053d(), bwVar.m23049b());
    }

    /* renamed from: a */
    public static StreetViewPanoramaLink[] m21099a(C4948t[] c4948tArr) {
        if (c4948tArr == null) {
            return null;
        }
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = new StreetViewPanoramaLink[c4948tArr.length];
        for (int i = 0; i < c4948tArr.length; i++) {
            streetViewPanoramaLinkArr[i] = new StreetViewPanoramaLink(c4948tArr[i].f18296c, c4948tArr[i].f18294a);
        }
        return streetViewPanoramaLinkArr;
    }
}
