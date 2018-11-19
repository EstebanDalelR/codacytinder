package com.leanplum.p069a;

import android.content.res.Configuration;
import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.leanplum.a.bd$6 */
final class bd$6 extends be {
    /* renamed from: a */
    private static int f25525a = 213;
    /* renamed from: b */
    private static int f25526b = 480;
    /* renamed from: c */
    private static int f25527c;

    /* renamed from: a */
    public final boolean m30580a(Object obj, Configuration configuration) {
        return true;
    }

    bd$6() {
    }

    /* renamed from: a */
    public final Object m30578a(String str) {
        if ("ldpi".equals(str)) {
            return Integer.valueOf(120);
        }
        if ("mdpi".equals(str)) {
            return Integer.valueOf(160);
        }
        if ("hdpi".equals(str)) {
            return Integer.valueOf(240);
        }
        if ("xhdpi".equals(str)) {
            return Integer.valueOf(320);
        }
        if ("nodpi".equals(str)) {
            return Integer.valueOf(null);
        }
        if ("tvdpi".equals(str)) {
            return Integer.valueOf(213);
        }
        return "xxhigh".equals(str) != null ? Integer.valueOf(480) : null;
    }

    /* renamed from: a */
    public final Map<String, Object> m30579a(Map<String, Object> map, DisplayMetrics displayMetrics) {
        Map<String, Object> hashMap = new HashMap();
        int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        for (Entry entry : map.entrySet()) {
            Integer num = (Integer) entry.getValue();
            if (num.intValue() < i && num.intValue() >= displayMetrics.densityDpi) {
                i = num.intValue();
                hashMap.clear();
            }
            if (num.intValue() == i) {
                hashMap.put(entry.getKey(), num);
            }
        }
        if (hashMap.size() == null) {
            displayMetrics = Integer.MIN_VALUE;
            for (String str : map.keySet()) {
                Integer num2 = (Integer) map.get(str);
                if (num2.intValue() > displayMetrics) {
                    displayMetrics = num2.intValue();
                    hashMap.clear();
                }
                if (num2.intValue() == displayMetrics) {
                    hashMap.put(str, num2);
                }
            }
        }
        return hashMap;
    }
}
