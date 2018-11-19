package com.tinder.analytics.p155d;

import android.support.annotation.NonNull;
import com.tinder.api.ManagerWebServices;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.tinder.analytics.d.a */
public class C6217a {
    @NonNull
    /* renamed from: a */
    public static Map<String, Double> m26845a(@NonNull Map<String, Object> map) {
        Map hashMap = new HashMap(2);
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if ((ManagerWebServices.PARAM_LAT.equals(str) || ManagerWebServices.PARAM_LON.equals(str)) && (value instanceof Number)) {
                hashMap.put(str, Double.valueOf(C6217a.m26844a(((Number) value).doubleValue(), 2)));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static double m26844a(double d, int i) {
        double pow = Math.pow(10.0d, (double) i);
        return ((double) Math.round(d * pow)) / pow;
    }
}
