package com.google.android.gms.common.util;

import com.tinder.api.ManagerWebServices;
import java.util.HashMap;

/* renamed from: com.google.android.gms.common.util.j */
public final class C2525j {
    /* renamed from: a */
    public static void m9209a(StringBuilder stringBuilder, HashMap<String, String> hashMap) {
        stringBuilder.append("{");
        Object obj = 1;
        for (String str : hashMap.keySet()) {
            String str2;
            if (obj == null) {
                stringBuilder.append(",");
            } else {
                obj = null;
            }
            String str3 = (String) hashMap.get(str2);
            stringBuilder.append("\"");
            stringBuilder.append(str2);
            stringBuilder.append("\":");
            if (str3 == null) {
                str2 = ManagerWebServices.NULL_STRING_VALUE;
            } else {
                stringBuilder.append("\"");
                stringBuilder.append(str3);
                str2 = "\"";
            }
            stringBuilder.append(str2);
        }
        stringBuilder.append("}");
    }
}
