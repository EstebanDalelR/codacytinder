package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.text.TextUtils;
import com.tinder.api.ManagerWebServices;
import io.fabric.sdk.android.C15608c;

/* renamed from: io.fabric.sdk.android.services.common.j */
public class C15627j {
    /* renamed from: a */
    protected String m58701a(Context context) {
        int a = CommonUtils.m58585a(context, "google_app_id", ManagerWebServices.PARAM_TEASER_STRING);
        if (a == 0) {
            return null;
        }
        C15608c.m58560h().mo12791d("Fabric", "Generating Crashlytics ApiKey from google_app_id in Strings");
        return m58702a(context.getResources().getString(a));
    }

    /* renamed from: a */
    protected String m58702a(String str) {
        return CommonUtils.m58612b(str).substring(0, 40);
    }

    /* renamed from: b */
    public boolean m58703b(Context context) {
        boolean z = false;
        if (CommonUtils.m58606a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        Object obj = CommonUtils.m58585a(context, "google_app_id", ManagerWebServices.PARAM_TEASER_STRING) != 0 ? 1 : null;
        if (TextUtils.isEmpty(new C15622f().m58691c(context))) {
            if (TextUtils.isEmpty(new C15622f().m58692d(context)) != null) {
                context = null;
                if (obj != null && r5 == null) {
                    z = true;
                }
                return z;
            }
        }
        context = true;
        z = true;
        return z;
    }
}
