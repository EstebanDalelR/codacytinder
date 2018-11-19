package com.facebook.ads.internal.p040g;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.facebook.ads.internal.C1391d;
import com.facebook.ads.internal.C1391d.C1388c;
import com.facebook.ads.internal.p047k.C1481b;
import com.facebook.ads.internal.p047k.C1482c;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1490h.C1489a;

/* renamed from: com.facebook.ads.internal.g.f */
public class C1411f {
    /* renamed from: a */
    public static String f3886a = "";
    /* renamed from: b */
    public static String f3887b = "";
    /* renamed from: c */
    public static boolean f3888c = false;
    /* renamed from: d */
    public static String f3889d = "";

    /* renamed from: a */
    public static void m4911a(Context context) {
        try {
            C1489a a;
            C1391d a2;
            SharedPreferences sharedPreferences = context.getSharedPreferences("SDKIDFA", 0);
            if (sharedPreferences.contains("attributionId")) {
                f3886a = sharedPreferences.getString("attributionId", "");
            }
            if (sharedPreferences.contains("advertisingId")) {
                f3887b = sharedPreferences.getString("advertisingId", "");
                f3888c = sharedPreferences.getBoolean("limitAdTracking", f3888c);
                f3889d = C1388c.SHARED_PREFS.name();
            }
            try {
                a = C1490h.m5237a(context.getContentResolver());
            } catch (Throwable e) {
                C1482c.m5218a(C1481b.m5215a(e, "Error retrieving attribution id from fb4a"));
                a = null;
            }
            if (a != null) {
                String str = a.f4120a;
                if (str != null) {
                    f3886a = str;
                }
            }
            try {
                a2 = C1391d.m4830a(context, a);
            } catch (Throwable e2) {
                C1482c.m5218a(C1481b.m5215a(e2, "Error retrieving advertising id from Google Play Services"));
                a2 = null;
            }
            if (a2 != null) {
                String a3 = a2.m4833a();
                Boolean valueOf = Boolean.valueOf(a2.m4834b());
                if (a3 != null) {
                    f3887b = a3;
                    f3888c = valueOf.booleanValue();
                    f3889d = a2.m4835c().name();
                }
            }
            Editor edit = sharedPreferences.edit();
            edit.putString("attributionId", f3886a);
            edit.putString("advertisingId", f3887b);
            edit.putBoolean("limitAdTracking", f3888c);
            edit.apply();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
