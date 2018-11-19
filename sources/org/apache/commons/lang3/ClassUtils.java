package org.apache.commons.lang3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ClassUtils {
    /* renamed from: a */
    public static final String f49625a = String.valueOf('.');
    /* renamed from: b */
    public static final String f49626b = String.valueOf('$');
    /* renamed from: c */
    private static final Map<String, Class<?>> f49627c = new HashMap();
    /* renamed from: d */
    private static final Map<Class<?>, Class<?>> f49628d = new HashMap();
    /* renamed from: e */
    private static final Map<Class<?>, Class<?>> f49629e = new HashMap();
    /* renamed from: f */
    private static final Map<String, String> f49630f;
    /* renamed from: g */
    private static final Map<String, String> f49631g;

    public enum Interfaces {
        INCLUDE,
        EXCLUDE
    }

    static {
        f49627c.put("boolean", Boolean.TYPE);
        f49627c.put("byte", Byte.TYPE);
        f49627c.put("char", Character.TYPE);
        f49627c.put("short", Short.TYPE);
        f49627c.put("int", Integer.TYPE);
        f49627c.put("long", Long.TYPE);
        f49627c.put("double", Double.TYPE);
        f49627c.put("float", Float.TYPE);
        f49627c.put("void", Void.TYPE);
        f49628d.put(Boolean.TYPE, Boolean.class);
        f49628d.put(Byte.TYPE, Byte.class);
        f49628d.put(Character.TYPE, Character.class);
        f49628d.put(Short.TYPE, Short.class);
        f49628d.put(Integer.TYPE, Integer.class);
        f49628d.put(Long.TYPE, Long.class);
        f49628d.put(Double.TYPE, Double.class);
        f49628d.put(Float.TYPE, Float.class);
        f49628d.put(Void.TYPE, Void.TYPE);
        for (Entry entry : f49628d.entrySet()) {
            Class cls = (Class) entry.getKey();
            Class cls2 = (Class) entry.getValue();
            if (!cls.equals(cls2)) {
                f49629e.put(cls2, cls);
            }
        }
        Map hashMap = new HashMap();
        hashMap.put("int", "I");
        hashMap.put("boolean", "Z");
        hashMap.put("float", "F");
        hashMap.put("long", "J");
        hashMap.put("short", "S");
        hashMap.put("byte", "B");
        hashMap.put("double", "D");
        hashMap.put("char", "C");
        Map hashMap2 = new HashMap();
        for (Entry entry2 : hashMap.entrySet()) {
            hashMap2.put(entry2.getValue(), entry2.getKey());
        }
        f49630f = Collections.unmodifiableMap(hashMap);
        f49631g = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static String m60645a(Class<?> cls) {
        return cls == null ? "" : m60646a(cls.getName());
    }

    /* renamed from: a */
    public static String m60646a(String str) {
        if (C15987b.m60655a(str)) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        if (str.startsWith("[")) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                stringBuilder.append("[]");
            }
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = str.substring(1, str.length() - 1);
            }
            if (f49631g.containsKey(str)) {
                str = (String) f49631g.get(str);
            }
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            i = lastIndexOf + 1;
        }
        i = str.indexOf(36, i);
        str = str.substring(lastIndexOf + 1);
        if (i != -1) {
            str = str.replace('$', '.');
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(stringBuilder);
        return stringBuilder2.toString();
    }
}
