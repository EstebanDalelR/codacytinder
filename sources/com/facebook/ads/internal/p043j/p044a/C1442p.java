package com.facebook.ads.internal.p043j.p044a;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.j.a.p */
public class C1442p implements Map<String, String> {
    /* renamed from: a */
    private Map<String, String> f3987a = new HashMap();

    /* renamed from: a */
    public C1442p m5049a(Map<? extends String, ? extends String> map) {
        putAll(map);
        return this;
    }

    /* renamed from: a */
    public String m5050a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : this.f3987a.keySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("&");
            }
            stringBuilder.append(str);
            String str2 = (String) this.f3987a.get(str2);
            if (str2 != null) {
                stringBuilder.append("=");
                try {
                    stringBuilder.append(URLEncoder.encode(str2, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public String m5051a(Object obj) {
        return (String) this.f3987a.get(obj);
    }

    /* renamed from: a */
    public String m5052a(String str, String str2) {
        return (String) this.f3987a.put(str, str2);
    }

    /* renamed from: b */
    public String m5053b(Object obj) {
        return (String) this.f3987a.remove(obj);
    }

    /* renamed from: b */
    public byte[] m5054b() {
        try {
            return m5050a().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void clear() {
        this.f3987a.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f3987a.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f3987a.containsValue(obj);
    }

    public Set<Entry<String, String>> entrySet() {
        return this.f3987a.entrySet();
    }

    public /* synthetic */ Object get(Object obj) {
        return m5051a(obj);
    }

    public boolean isEmpty() {
        return this.f3987a.isEmpty();
    }

    public Set<String> keySet() {
        return this.f3987a.keySet();
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m5052a((String) obj, (String) obj2);
    }

    public void putAll(Map<? extends String, ? extends String> map) {
        this.f3987a.putAll(map);
    }

    public /* synthetic */ Object remove(Object obj) {
        return m5053b(obj);
    }

    public int size() {
        return this.f3987a.size();
    }

    public Collection<String> values() {
        return this.f3987a.values();
    }
}
