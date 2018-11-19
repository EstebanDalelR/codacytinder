package com.leanplum;

import android.content.Context;
import com.leanplum.p069a.ao;
import com.leanplum.utils.SharedPreferencesUtil;

/* renamed from: com.leanplum.c */
abstract class C5731c {
    /* renamed from: a */
    private static String f21325a;

    public abstract String getRegistrationId();

    public abstract boolean isInitialized();

    public abstract boolean isManifestSetup();

    public abstract void unregister();

    C5731c() {
    }

    /* renamed from: a */
    static String m25187a() {
        return f21325a;
    }

    /* renamed from: a */
    private static void m25188a(String str) {
        Leanplum.a(str);
    }

    /* renamed from: a */
    final void m25189a(Context context, String str) {
        if (str == null) {
            ao.b(new Object[]{"Registration ID is undefined."});
            return;
        }
        f21325a = str;
        if (!str.equals(SharedPreferencesUtil.getString(context, "__leanplum_push__", "registration_id"))) {
            ao.c(new Object[]{"Device registered for push notifications with registration token", str});
            storePreferences(context.getApplicationContext());
            Leanplum.a(f21325a);
        }
    }

    public void storePreferences(Context context) {
        ao.d(new Object[]{"Saving the registration ID in the shared preferences."});
        SharedPreferencesUtil.setString(context, "__leanplum_push__", "registration_id", f21325a);
    }
}
