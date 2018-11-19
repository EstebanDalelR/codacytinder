package com.google.android.gms.common.util;

import android.support.v4.util.C0546b;
import android.support.v4.util.C2880a;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.util.d */
public final class C2520d {
    /* renamed from: a */
    public static <K, V> Map<K, V> m9193a(K k, V v, K k2, V v2, K k3, V v3) {
        Map b = C2520d.m9198b(3, false);
        b.put(k, v);
        b.put(k2, v2);
        b.put(k3, v3);
        return Collections.unmodifiableMap(b);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m9194a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Map b = C2520d.m9198b(6, false);
        b.put(k, v);
        b.put(k2, v2);
        b.put(k3, v3);
        b.put(k4, v4);
        b.put(k5, v5);
        b.put(k6, v6);
        return Collections.unmodifiableMap(b);
    }

    /* renamed from: a */
    private static <T> Set<T> m9195a(int i, boolean z) {
        return i <= 256 ? new C0546b(i) : new HashSet(i, 1.0f);
    }

    /* renamed from: a */
    public static <T> Set<T> m9196a(T t, T t2, T t3) {
        Set a = C2520d.m9195a(3, false);
        a.add(t);
        a.add(t2);
        a.add(t3);
        return Collections.unmodifiableSet(a);
    }

    /* renamed from: a */
    public static <T> Set<T> m9197a(T... tArr) {
        Object obj;
        Object obj2;
        switch (tArr.length) {
            case 0:
                return Collections.emptySet();
            case 1:
                return Collections.singleton(tArr[0]);
            case 2:
                obj = tArr[0];
                obj2 = tArr[1];
                Set a = C2520d.m9195a(2, false);
                a.add(obj);
                a.add(obj2);
                return Collections.unmodifiableSet(a);
            case 3:
                return C2520d.m9196a(tArr[0], tArr[1], tArr[2]);
            case 4:
                obj = tArr[0];
                Object obj3 = tArr[1];
                Object obj4 = tArr[2];
                obj2 = tArr[3];
                Set a2 = C2520d.m9195a(4, false);
                a2.add(obj);
                a2.add(obj3);
                a2.add(obj4);
                a2.add(obj2);
                return Collections.unmodifiableSet(a2);
            default:
                obj = C2520d.m9195a(tArr.length, false);
                Collections.addAll(obj, tArr);
                return Collections.unmodifiableSet(obj);
        }
    }

    /* renamed from: b */
    private static <K, V> Map<K, V> m9198b(int i, boolean z) {
        return i <= 256 ? new C2880a(i) : new HashMap(i, 1.0f);
    }
}
