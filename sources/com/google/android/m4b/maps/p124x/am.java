package com.google.android.m4b.maps.p124x;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: com.google.android.m4b.maps.x.am */
public final class am {
    /* renamed from: a */
    public static <T extends Parcelable> T m24119a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(am.class.getClassLoader());
        bundle = bundle.getBundle("map_state");
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(am.class.getClassLoader());
        return bundle.getParcelable(str);
    }

    /* renamed from: a */
    public static void m24120a(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(am.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(am.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    private am() {
    }
}
