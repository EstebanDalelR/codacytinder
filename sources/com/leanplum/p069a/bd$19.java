package com.leanplum.p069a;

import android.content.res.Configuration;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.leanplum.a.bd$19 */
final class bd$19 extends be {
    bd$19() {
    }

    /* renamed from: a */
    public final Object m30562a(String str) {
        return (str.startsWith("h") && str.endsWith("dp")) ? Integer.getInteger(str.substring(1, str.length() - 2)) : null;
    }

    /* renamed from: a */
    public final boolean m30564a(Object obj, Configuration configuration) {
        try {
            if (((Integer) configuration.getClass().getField("screenHeightDp").get(configuration)).intValue() >= ((Integer) obj).intValue()) {
                return true;
            }
            return false;
        } catch (Object obj2) {
            bo.a(obj2);
            return false;
        }
    }

    /* renamed from: a */
    public final Map<String, Object> m30563a(Map<String, Object> map, DisplayMetrics displayMetrics) {
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
