package com.android.billingclient.p020a;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.C0889d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.android.billingclient.a.a */
public final class C0865a {
    /* renamed from: a */
    public static int f2256a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static void m2961a(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    /* renamed from: b */
    public static void m2962b(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* renamed from: a */
    public static int m2958a(Intent intent, String str) {
        if (intent != null) {
            return C0865a.m2959a(intent.getExtras(), str);
        }
        C0865a.m2962b("BillingHelper", "Got null intent!");
        return 6;
    }

    /* renamed from: a */
    public static int m2959a(Bundle bundle, String str) {
        if (bundle == null) {
            C0865a.m2962b(str, "Unexpected null bundle received!");
            return 6;
        }
        bundle = bundle.get("RESPONSE_CODE");
        if (bundle == null) {
            C0865a.m2961a(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return null;
        } else if (bundle instanceof Integer) {
            return ((Integer) bundle).intValue();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected type for bundle response code: ");
            stringBuilder.append(bundle.getClass().getName());
            C0865a.m2962b(str, stringBuilder.toString());
            return 6;
        }
    }

    /* renamed from: a */
    public static List<C0889d> m2960a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        List stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        List stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        List<C0889d> arrayList = new ArrayList();
        if (stringArrayList != null) {
            if (stringArrayList2 != null) {
                bundle = null;
                while (bundle < stringArrayList.size() && bundle < stringArrayList2.size()) {
                    C0889d c = C0865a.m2963c((String) stringArrayList.get(bundle), (String) stringArrayList2.get(bundle));
                    if (c != null) {
                        arrayList.add(c);
                    }
                    bundle++;
                }
                return arrayList;
            }
        }
        C0865a.m2962b("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
        bundle = C0865a.m2963c(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
        if (bundle == null) {
            C0865a.m2962b("BillingHelper", "Couldn't find single purchase data as well.");
            return null;
        }
        arrayList.add(bundle);
        return arrayList;
    }

    /* renamed from: c */
    private static C0889d m2963c(String str, String str2) {
        C0889d c0889d = null;
        if (str != null) {
            if (str2 != null) {
                try {
                    c0889d = new C0889d(str, str2);
                } catch (String str3) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Got JSONException while parsing purchase data: ");
                    stringBuilder.append(str3);
                    C0865a.m2962b("BillingHelper", stringBuilder.toString());
                }
                return c0889d;
            }
        }
        C0865a.m2962b("BillingHelper", "Received a bad purchase data.");
        return null;
    }
}
