package com.leanplum.p069a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.leanplum.a.g */
public class C3859g implements ba {
    /* renamed from: a */
    private /* synthetic */ Runnable f12105a;

    /* renamed from: a */
    public static <T> T m14558a(Object obj) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: a */
    private static <T> ArrayList<T> m14562a(T... tArr) {
        Object arrayList = new ArrayList(tArr != null ? tArr.length : 0);
        if (tArr != null) {
            Collections.addAll(arrayList, tArr);
        }
        return arrayList;
    }

    @SafeVarargs
    /* renamed from: b */
    private static <T> HashSet<T> m14565b(T... tArr) {
        Object hashSet = new HashSet(tArr != null ? tArr.length : 0);
        if (tArr != null) {
            Collections.addAll(hashSet, tArr);
        }
        return hashSet;
    }

    /* renamed from: c */
    private static <T, U> HashMap<T, U> m14566c(Object... objArr) {
        Map hashMap = new HashMap(objArr != null ? objArr.length : 0);
        if (objArr == null) {
            objArr = null;
        }
        return (HashMap) C3859g.m14563a(hashMap, objArr);
    }

    /* renamed from: d */
    private static <T, U> LinkedHashMap<T, U> m14567d(Object... objArr) {
        Map linkedHashMap = new LinkedHashMap(objArr != null ? objArr.length : 0);
        if (objArr == null) {
            objArr = null;
        }
        return (LinkedHashMap) C3859g.m14563a(linkedHashMap, objArr);
    }

    /* renamed from: a */
    private static <T, U> Map<T, U> m14563a(Map<T, U> map, T[] tArr) {
        if (tArr != null) {
            if (tArr.length != 0) {
                if (tArr.length % 2 != 0) {
                    throw new IllegalArgumentException("newMap requires an even number of items.");
                }
                for (int i = 0; i < tArr.length; i += 2) {
                    map.put(tArr[i], tArr[i + 1]);
                }
                return map;
            }
        }
        return map;
    }

    /* renamed from: a */
    static <T> String m14561a(T[] tArr, String str) {
        if (tArr == null) {
            return null;
        }
        tArr = Arrays.asList(tArr);
        if (tArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Object next : tArr) {
            if (next != null) {
                stringBuilder.append(next.toString());
                stringBuilder.append(str);
            }
        }
        tArr = stringBuilder.toString();
        return tArr.length() > 0 ? tArr.substring(0, tArr.length() - str.length()) : tArr;
    }

    /* renamed from: a */
    private static String m14560a(List<?> list, String str) {
        if (list == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Object next : list) {
            if (next != null) {
                stringBuilder.append(next.toString());
                stringBuilder.append(str);
            }
        }
        list = stringBuilder.toString();
        return list.length() > 0 ? list.substring(0, list.length() - str.length()) : list;
    }

    /* renamed from: a */
    public static <K, V> V m14559a(Map<K, V> map, K k, V v) {
        return (map != null && map.containsKey(k)) ? map.get(k) : v;
    }

    /* renamed from: a */
    private static long[] m14564a(Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        int i = 0;
        if (lArr.length == 0) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        while (i < lArr.length) {
            jArr[i] = lArr[i].longValue();
            i++;
        }
        return jArr;
    }

    C3859g(Runnable runnable) {
        this.f12105a = runnable;
    }

    /* renamed from: a */
    public void mo2627a(JSONObject jSONObject) {
        if (this.f12105a != null) {
            this.f12105a.run();
        }
    }
}
