package com.bumptech.glide.load.model;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.load.model.h */
public final class C3061h implements Headers {
    /* renamed from: c */
    private final Map<String, List<LazyHeaderFactory>> f9520c;
    /* renamed from: d */
    private volatile Map<String, String> f9521d;

    /* renamed from: com.bumptech.glide.load.model.h$a */
    public static final class C1038a {
        /* renamed from: a */
        private static final String f2850a = System.getProperty("http.agent");
        /* renamed from: b */
        private static final Map<String, List<LazyHeaderFactory>> f2851b;
        /* renamed from: c */
        private boolean f2852c = true;
        /* renamed from: d */
        private Map<String, List<LazyHeaderFactory>> f2853d = f2851b;
        /* renamed from: e */
        private boolean f2854e = true;
        /* renamed from: f */
        private boolean f2855f = true;

        static {
            Map hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f2850a)) {
                hashMap.put("User-Agent", Collections.singletonList(new C3060b(f2850a)));
            }
            hashMap.put("Accept-Encoding", Collections.singletonList(new C3060b("identity")));
            f2851b = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: a */
        public C3061h m3584a() {
            this.f2852c = true;
            return new C3061h(this.f2853d);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.h$b */
    static final class C3060b implements LazyHeaderFactory {
        /* renamed from: a */
        private final String f9519a;

        C3060b(String str) {
            this.f9519a = str;
        }

        public String buildHeader() {
            return this.f9519a;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("StringHeaderFactory{value='");
            stringBuilder.append(this.f9519a);
            stringBuilder.append('\'');
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3060b)) {
                return null;
            }
            return this.f9519a.equals(((C3060b) obj).f9519a);
        }

        public int hashCode() {
            return this.f9519a.hashCode();
        }
    }

    C3061h(Map<String, List<LazyHeaderFactory>> map) {
        this.f9520c = Collections.unmodifiableMap(map);
    }

    public Map<String, String> getHeaders() {
        if (this.f9521d == null) {
            synchronized (this) {
                if (this.f9521d == null) {
                    this.f9521d = Collections.unmodifiableMap(m12007a());
                }
            }
        }
        return this.f9521d;
    }

    /* renamed from: a */
    private Map<String, String> m12007a() {
        Map<String, String> hashMap = new HashMap();
        for (Entry entry : this.f9520c.entrySet()) {
            StringBuilder stringBuilder = new StringBuilder();
            List list = (List) entry.getValue();
            for (int i = 0; i < list.size(); i++) {
                stringBuilder.append(((LazyHeaderFactory) list.get(i)).buildHeader());
                if (i != list.size() - 1) {
                    stringBuilder.append(',');
                }
            }
            hashMap.put(entry.getKey(), stringBuilder.toString());
        }
        return hashMap;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LazyHeaders{headers=");
        stringBuilder.append(this.f9520c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3061h)) {
            return null;
        }
        return this.f9520c.equals(((C3061h) obj).f9520c);
    }

    public int hashCode() {
        return this.f9520c.hashCode();
    }
}
