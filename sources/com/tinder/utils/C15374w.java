package com.tinder.utils;

import android.content.Context;
import android.support.annotation.Nullable;
import java.lang.ref.WeakReference;

@Deprecated
/* renamed from: com.tinder.utils.w */
public class C15374w {
    /* renamed from: a */
    private static boolean f47644a = true;

    /* renamed from: a */
    public static float m57701a(float f, float f2, float f3, float f4, float f5) {
        return (((f5 - f3) / (f4 - f2)) * (f - f2)) + f3;
    }

    /* renamed from: a */
    public static boolean m57705a(@Nullable WeakReference weakReference) {
        return (weakReference == null || weakReference.get() == null) ? null : true;
    }

    /* renamed from: a */
    public static int m57702a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Context context2) {
            ad.a("tried getting app versionCode", context2);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m57704a() {
        return f47644a;
    }

    /* renamed from: a */
    public static void m57703a(boolean z) {
        f47644a = z;
    }
}
