package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.C2289a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.exoplayer2.upstream.cache.f */
public class C2285f {
    /* renamed from: a */
    private final Map<String, Object> f6870a = new HashMap();
    /* renamed from: b */
    private final List<String> f6871b = new ArrayList();

    /* renamed from: a */
    public C2285f m8295a(String str, String str2) {
        return m8292a(str, (Object) str2);
    }

    /* renamed from: a */
    public C2285f m8294a(String str, long j) {
        return m8292a(str, Long.valueOf(j));
    }

    /* renamed from: a */
    public C2285f m8293a(String str) {
        this.f6871b.add(str);
        this.f6870a.remove(str);
        return this;
    }

    /* renamed from: a */
    public List<String> m8296a() {
        return Collections.unmodifiableList(new ArrayList(this.f6871b));
    }

    /* renamed from: b */
    public Map<String, Object> m8297b() {
        Map hashMap = new HashMap(this.f6870a);
        for (Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private C2285f m8292a(String str, Object obj) {
        this.f6870a.put(C2289a.m8309a((Object) str), C2289a.m8309a(obj));
        this.f6871b.remove(str);
        return this;
    }
}
