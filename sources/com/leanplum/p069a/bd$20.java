package com.leanplum.p069a;

import android.content.res.Configuration;
import android.util.DisplayMetrics;
import com.tinder.api.ManagerWebServices;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.leanplum.a.bd$20 */
final class bd$20 extends be {
    bd$20() {
    }

    /* renamed from: a */
    public final Object m30567a(String str) {
        if (ManagerWebServices.PARAM_SMALL.equals(str)) {
            return Integer.valueOf(1);
        }
        if ("normal".equals(str)) {
            return Integer.valueOf(2);
        }
        if (ManagerWebServices.PARAM_LARGE.equals(str)) {
            return Integer.valueOf(3);
        }
        return "xlarge".equals(str) != null ? Integer.valueOf(4) : null;
    }

    /* renamed from: a */
    public final boolean m30569a(Object obj, Configuration configuration) {
        return (configuration.screenLayout & 15) <= ((Integer) obj).intValue() ? true : null;
    }

    /* renamed from: a */
    public final Map<String, Object> m30568a(Map<String, Object> map, DisplayMetrics displayMetrics) {
        displayMetrics = new HashMap();
        map = map.entrySet().iterator();
        int i = Integer.MIN_VALUE;
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            Integer num = (Integer) entry.getValue();
            if (num.intValue() > i) {
                i = num.intValue();
                displayMetrics.clear();
            }
            if (num.intValue() == i) {
                displayMetrics.put(entry.getKey(), num);
            }
        }
        return displayMetrics;
    }
}
