package com.google.android.m4b.maps.bd;

import android.content.res.Resources;
import android.os.Build.VERSION;
import com.google.android.m4b.maps.C4513R;

/* renamed from: com.google.android.m4b.maps.bd.a */
public final class C4774a {
    /* renamed from: a */
    public static boolean m21152a(Resources resources) {
        return (VERSION.SDK_INT >= 11 ? 1 : null) != null ? false : resources.getBoolean(C4513R.bool.maps_is_tablet);
    }
}
