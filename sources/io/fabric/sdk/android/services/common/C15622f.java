package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.text.TextUtils;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.config.model.ProfileEditingConfig;
import io.fabric.sdk.android.C15608c;

/* renamed from: io.fabric.sdk.android.services.common.f */
public class C15622f {
    /* renamed from: a */
    protected String m58688a() {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    /* renamed from: a */
    public String m58689a(Context context) {
        Object c = m58691c(context);
        if (TextUtils.isEmpty(c)) {
            c = m58692d(context);
        }
        if (TextUtils.isEmpty(c)) {
            c = m58690b(context);
        }
        if (TextUtils.isEmpty(c)) {
            m58693e(context);
        }
        return c;
    }

    /* renamed from: b */
    protected String m58690b(Context context) {
        return new C15627j().m58701a(context);
    }

    /* renamed from: c */
    protected String m58691c(Context context) {
        StringBuilder stringBuilder;
        String str = null;
        try {
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), ProfileEditingConfig.DEFAULT_MAX_LENGTH).metaData;
            if (context == null) {
                return null;
            }
            String string = context.getString("io.fabric.ApiKey");
            try {
                if ("@string/twitter_consumer_secret".equals(string)) {
                    C15608c.m58560h().mo12791d("Fabric", "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");
                } else {
                    str = string;
                }
                if (str != null) {
                    return str;
                }
                C15608c.m58560h().mo12791d("Fabric", "Falling back to Crashlytics key lookup from Manifest");
                return context.getString("com.crashlytics.ApiKey");
            } catch (Exception e) {
                context = e;
                str = string;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Caught non-fatal exception while retrieving apiKey: ");
                stringBuilder.append(context);
                C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
                return str;
            }
        } catch (Exception e2) {
            context = e2;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Caught non-fatal exception while retrieving apiKey: ");
            stringBuilder.append(context);
            C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
            return str;
        }
    }

    /* renamed from: d */
    protected String m58692d(Context context) {
        int a = CommonUtils.m58585a(context, "io.fabric.ApiKey", ManagerWebServices.PARAM_TEASER_STRING);
        if (a == 0) {
            C15608c.m58560h().mo12791d("Fabric", "Falling back to Crashlytics key lookup from Strings");
            a = CommonUtils.m58585a(context, "com.crashlytics.ApiKey", ManagerWebServices.PARAM_TEASER_STRING);
        }
        return a != 0 ? context.getResources().getString(a) : null;
    }

    /* renamed from: e */
    protected void m58693e(Context context) {
        if (!C15608c.m58561i()) {
            if (CommonUtils.m58623i(context) == null) {
                C15608c.m58560h().mo12793e("Fabric", m58688a());
                return;
            }
        }
        throw new IllegalArgumentException(m58688a());
    }
}
