package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzzv;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

@zzzv
public final class bh {
    /* renamed from: a */
    private static String m8684a(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            String a = obj == null ? ManagerWebServices.NULL_STRING_VALUE : obj instanceof Bundle ? m8684a((Bundle) obj) : obj.toString();
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static Object[] m8685a(String str, zzjj zzjj, String str2, int i, @Nullable zzjn zzjn) {
        Set hashSet = new HashSet(Arrays.asList(str.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        if (hashSet.contains("formatString")) {
            arrayList.add(null);
        }
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains(ManagerWebServices.FB_PARAM_BIRTH_DATE)) {
            arrayList.add(Long.valueOf(zzjj.zzbdf));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(m8684a(zzjj.extras));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzjj.zzbdg));
        }
        if (hashSet.contains("keywords")) {
            if (zzjj.zzbdh != null) {
                arrayList.add(zzjj.zzbdh.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzjj.zzbdi));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzjj.zzbdj));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzjj.zzbdk));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzjj.zzbdl);
        }
        if (hashSet.contains("location")) {
            if (zzjj.zzbdn != null) {
                arrayList.add(zzjj.zzbdn.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzjj.zzbdo);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(m8684a(zzjj.zzbdp));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(m8684a(zzjj.zzbdq));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (zzjj.zzbdr != null) {
                arrayList.add(zzjj.zzbdr.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzjj.zzbds);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzjj.zzbdt);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzjj.zzbdu));
        }
        return arrayList.toArray();
    }
}
