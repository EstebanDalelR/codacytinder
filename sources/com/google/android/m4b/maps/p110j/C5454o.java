package com.google.android.m4b.maps.p110j;

import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.m4b.maps.j.o */
public final class C5454o {
    /* renamed from: a */
    private static final Uri f20445a;
    /* renamed from: b */
    private static final Uri f20446b;

    static {
        Uri parse = Uri.parse("http://plus.google.com/");
        f20445a = parse;
        f20446b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    /* renamed from: a */
    public static Intent m23713a(String str) {
        str = Uri.fromParts("package", str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(str);
        return intent;
    }

    /* renamed from: b */
    public static Intent m23714b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details").buildUpon().appendQueryParameter("id", str).build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    /* renamed from: a */
    public static Intent m23712a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }
}
