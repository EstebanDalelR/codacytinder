package com.google.android.m4b.maps.p113m;

import android.content.res.Resources;

/* renamed from: com.google.android.m4b.maps.m.e */
public final class C5478e {
    /* renamed from: a */
    public static boolean m23834a(Resources resources) {
        if (resources == null) {
            return false;
        }
        Object obj = (resources.getConfiguration().screenLayout & 15) > 3 ? 1 : null;
        if (!C5479f.m23835a() || obj == null) {
            resources = resources.getConfiguration();
            resources = (!C5479f.m23837b() || (resources.screenLayout & 15) > 3 || resources.smallestScreenWidthDp < 600) ? null : true;
            return resources != null;
        }
    }
}
