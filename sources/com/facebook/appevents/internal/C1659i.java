package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.ComponentName;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import bolts.C0753b;
import com.facebook.FacebookSdk;

/* renamed from: com.facebook.appevents.internal.i */
class C1659i {
    /* renamed from: a */
    private String f4575a;
    /* renamed from: b */
    private boolean f4576b;

    /* renamed from: com.facebook.appevents.internal.i$a */
    public static class C1658a {
        /* renamed from: a */
        public static C1659i m5626a(Activity activity) {
            String str = "";
            ComponentName callingActivity = activity.getCallingActivity();
            if (callingActivity != null) {
                str = callingActivity.getPackageName();
                if (str.equals(activity.getPackageName())) {
                    return null;
                }
            }
            activity = activity.getIntent();
            boolean z = false;
            if (!(activity == null || activity.getBooleanExtra("_fbSourceApplicationHasBeenSet", false))) {
                activity.putExtra("_fbSourceApplicationHasBeenSet", true);
                Bundle a = C0753b.m2667a(activity);
                if (a != null) {
                    Bundle bundle = a.getBundle("referer_app_link");
                    if (bundle != null) {
                        str = bundle.getString("package");
                    }
                    z = true;
                }
            }
            activity.putExtra("_fbSourceApplicationHasBeenSet", true);
            return new C1659i(str, z);
        }
    }

    private C1659i(String str, boolean z) {
        this.f4575a = str;
        this.f4576b = z;
    }

    /* renamed from: a */
    public static C1659i m5627a() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.m3994e());
        if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
            return new C1659i(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
        }
        return null;
    }

    /* renamed from: b */
    public static void m5628b() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.m3994e()).edit();
        edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
        edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
        edit.apply();
    }

    public String toString() {
        String str = "Unclassified";
        if (this.f4576b) {
            str = "Applink";
        }
        if (this.f4575a == null) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("(");
        stringBuilder.append(this.f4575a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: c */
    public void m5629c() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.m3994e()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f4575a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f4576b);
        edit.apply();
    }
}
