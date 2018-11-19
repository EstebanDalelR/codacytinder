package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.pl;
import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.google.android.gms.common.internal.v */
public final class C2506v {
    /* renamed from: a */
    private static Object f7661a = new Object();
    /* renamed from: b */
    private static boolean f7662b;
    /* renamed from: c */
    private static String f7663c;
    /* renamed from: d */
    private static int f7664d;

    /* renamed from: a */
    public static int m9170a(Context context) {
        C2506v.m9171b(context);
        return f7664d;
    }

    /* renamed from: b */
    private static void m9171b(Context context) {
        synchronized (f7661a) {
            if (f7662b) {
                return;
            }
            f7662b = true;
            try {
                Bundle bundle = pl.a(context).a(context.getPackageName(), ProfileEditingConfig.DEFAULT_MAX_LENGTH).metaData;
                if (bundle == null) {
                    return;
                } else {
                    f7663c = bundle.getString("com.google.app.id");
                    f7664d = bundle.getInt("com.google.android.gms.version");
                }
            } catch (Throwable e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
        }
    }
}
