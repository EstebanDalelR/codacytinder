package com.facebook.ads.internal.p047k;

import java.util.Set;

/* renamed from: com.facebook.ads.internal.k.aj */
public class aj {
    /* renamed from: a */
    public static String m5189a(Set<String> set, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String append : set) {
            stringBuilder.append(append);
            stringBuilder.append(str);
        }
        return stringBuilder.length() > 0 ? stringBuilder.substring(0, stringBuilder.length() - 1) : "";
    }
}
