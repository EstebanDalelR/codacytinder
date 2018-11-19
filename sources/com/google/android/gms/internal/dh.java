package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;

@zzzv
public final class dh {
    /* renamed from: a */
    public static String m19613a(String str, Context context) {
        if (ar.z().m19598a(context)) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            String i = ar.z().m19611i(context);
            if (i == null) {
                return str;
            }
            if (((Boolean) aja.m19221f().m19334a(alo.an)).booleanValue()) {
                String str2 = (String) aja.m19221f().m19334a(alo.ao);
                if (str.contains(str2)) {
                    if (ar.e().m19759d(str)) {
                        ar.z().m19603d(context, i);
                        return str.replace(str2, i);
                    } else if (ar.e().m19760e(str)) {
                        ar.z().m19605e(context, i);
                        return str.replace(str2, i);
                    }
                }
            } else if (!str.contains("fbs_aeid")) {
                if (ar.e().m19759d(str)) {
                    ar.z().m19603d(context, i);
                    ar.e();
                    return fk.m19680a(str, "fbs_aeid", i).toString();
                } else if (ar.e().m19760e(str)) {
                    ar.z().m19605e(context, i);
                    ar.e();
                    str = fk.m19680a(str, "fbs_aeid", i).toString();
                }
            }
        }
        return str;
    }
}
