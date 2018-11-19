package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.C1745t.C1744f;

public class DialogPresenter {

    public interface ParameterProvider {
        Bundle getLegacyParameters();

        Bundle getParameters();
    }

    /* renamed from: a */
    public static void m5711a(C1697a c1697a) {
        m5714a(c1697a, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    /* renamed from: a */
    public static void m5714a(C1697a c1697a, FacebookException facebookException) {
        m5721b(c1697a, facebookException);
    }

    /* renamed from: a */
    public static void m5712a(C1697a c1697a, Activity activity) {
        activity.startActivityForResult(c1697a.m5860b(), c1697a.m5862d());
        c1697a.m5863e();
    }

    /* renamed from: a */
    public static void m5716a(C1697a c1697a, C1725l c1725l) {
        c1725l.m5947a(c1697a.m5860b(), c1697a.m5862d());
        c1697a.m5863e();
    }

    /* renamed from: a */
    public static boolean m5718a(DialogFeature dialogFeature) {
        return m5720b(dialogFeature).m6017b() != -1 ? true : null;
    }

    /* renamed from: b */
    public static void m5721b(C1697a c1697a, FacebookException facebookException) {
        if (facebookException != null) {
            C1749x.m6068b(FacebookSdk.m3994e());
            Intent intent = new Intent();
            intent.setClass(FacebookSdk.m3994e(), FacebookActivity.class);
            intent.setAction(FacebookActivity.f14824a);
            C1745t.m6032a(intent, c1697a.m5861c().toString(), null, C1745t.m6018a(), C1745t.m6027a(facebookException));
            c1697a.m5859a(intent);
        }
    }

    /* renamed from: a */
    public static void m5717a(C1697a c1697a, String str, Bundle bundle) {
        C1749x.m6068b(FacebookSdk.m3994e());
        C1749x.m6062a(FacebookSdk.m3994e());
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        C1745t.m6032a(intent, c1697a.m5861c().toString(), str, C1745t.m6018a(), bundle2);
        intent.setClass(FacebookSdk.m3994e(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        c1697a.m5859a(intent);
    }

    /* renamed from: a */
    public static void m5713a(C1697a c1697a, Bundle bundle, DialogFeature dialogFeature) {
        C1749x.m6068b(FacebookSdk.m3994e());
        C1749x.m6062a(FacebookSdk.m3994e());
        String name = dialogFeature.name();
        Uri c = m5722c(dialogFeature);
        if (c == null) {
            bundle = new StringBuilder();
            bundle.append("Unable to fetch the Url for the DialogFeature : '");
            bundle.append(name);
            bundle.append("'");
            throw new FacebookException(bundle.toString());
        }
        bundle = C1747v.m6053a(c1697a.m5861c().toString(), C1745t.m6018a(), bundle);
        if (bundle == null) {
            throw new FacebookException("Unable to fetch the app's key-hash");
        }
        if (c.isRelative()) {
            bundle = Utility.m5750a(C1747v.m6054a(), c.toString(), bundle);
        } else {
            bundle = Utility.m5750a(c.getAuthority(), c.getPath(), bundle);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("url", bundle.toString());
        bundle2.putBoolean("is_fallback", true);
        Intent intent = new Intent();
        C1745t.m6032a(intent, c1697a.m5861c().toString(), dialogFeature.getAction(), C1745t.m6018a(), bundle2);
        intent.setClass(FacebookSdk.m3994e(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        c1697a.m5859a(intent);
    }

    /* renamed from: a */
    public static void m5715a(C1697a c1697a, ParameterProvider parameterProvider, DialogFeature dialogFeature) {
        Context e = FacebookSdk.m3994e();
        String action = dialogFeature.getAction();
        C1744f b = m5720b(dialogFeature);
        int b2 = b.m6017b();
        if (b2 == -1) {
            throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        Bundle parameters;
        if (C1745t.m6033a(b2)) {
            parameters = parameterProvider.getParameters();
        } else {
            parameters = parameterProvider.getLegacyParameters();
        }
        if (parameters == null) {
            parameters = new Bundle();
        }
        Intent a = C1745t.m6023a(e, c1697a.m5861c().toString(), action, b, parameters);
        if (a == null) {
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        c1697a.m5859a(a);
    }

    /* renamed from: c */
    private static Uri m5722c(DialogFeature dialogFeature) {
        dialogFeature = C1709i.m5895a(FacebookSdk.m3998i(), dialogFeature.getAction(), dialogFeature.name());
        return dialogFeature != null ? dialogFeature.m5893c() : null;
    }

    /* renamed from: b */
    public static C1744f m5720b(DialogFeature dialogFeature) {
        String i = FacebookSdk.m3998i();
        String action = dialogFeature.getAction();
        return C1745t.m6029a(action, m5719a(i, action, dialogFeature));
    }

    /* renamed from: a */
    private static int[] m5719a(String str, String str2, DialogFeature dialogFeature) {
        str = C1709i.m5895a(str, str2, dialogFeature.name());
        if (str != null) {
            return str.m5894d();
        }
        return new int[]{dialogFeature.getMinVersion()};
    }
}
