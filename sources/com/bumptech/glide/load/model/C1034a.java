package com.bumptech.glide.load.model;

import android.net.Uri;
import com.tinder.api.ManagerWebServices;

/* renamed from: com.bumptech.glide.load.model.a */
final class C1034a {
    /* renamed from: a */
    private static final int f2838a = "file:///android_asset/".length();

    /* renamed from: a */
    public static boolean m3568a(Uri uri) {
        return (!ManagerWebServices.PARAM_FILE.equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || "android_asset".equals(uri.getPathSegments().get(0)) == null) ? false : true;
    }

    /* renamed from: b */
    public static String m3569b(Uri uri) {
        return uri.toString().substring(f2838a);
    }
}
