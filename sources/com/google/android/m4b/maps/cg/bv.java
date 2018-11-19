package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;
import com.google.android.m4b.maps.model.StreetViewPanoramaLocation;

public class bv {
    /* renamed from: a */
    private static final String f19136a = "bv";
    /* renamed from: b */
    private Context f19137b;

    bv(Context context) {
        this.f19137b = context;
    }

    /* renamed from: a */
    public final void m23044a(StreetViewPanoramaLocation streetViewPanoramaLocation, StreetViewPanoramaCamera streetViewPanoramaCamera) {
        float f = streetViewPanoramaCamera.tilt * -1.0f;
        streetViewPanoramaCamera = String.format("&cbp=1,%f,,%f,%f", new Object[]{Float.valueOf(streetViewPanoramaCamera.bearing), Float.valueOf(streetViewPanoramaCamera.zoom), Float.valueOf(f)});
        streetViewPanoramaLocation = streetViewPanoramaLocation.panoId;
        String valueOf = String.valueOf("https://cbk0.google.com/cbk?cb_client=an_mobile&output=report&panoid=");
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(valueOf).length() + 1) + String.valueOf(streetViewPanoramaLocation).length()) + String.valueOf(streetViewPanoramaCamera).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(streetViewPanoramaLocation);
        stringBuilder.append("&");
        stringBuilder.append(streetViewPanoramaCamera);
        streetViewPanoramaCamera = new Intent("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
        streetViewPanoramaCamera.setFlags(268435456);
        try {
            this.f19137b.startActivity(streetViewPanoramaCamera);
        } catch (StreetViewPanoramaLocation streetViewPanoramaLocation2) {
            if (C4728u.m21050a(f19136a, 6) != null) {
                Log.e(f19136a, "Could not start activty.", streetViewPanoramaLocation2);
            }
        }
    }
}
