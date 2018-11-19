package com.google.i18n.phonenumbers.internal;

import java.util.LinkedHashMap;
import java.util.regex.Pattern;

/* renamed from: com.google.i18n.phonenumbers.internal.b */
public class C5628b {
    /* renamed from: a */
    private C5627a<String, Pattern> f20898a;

    /* renamed from: com.google.i18n.phonenumbers.internal.b$a */
    private static class C5627a<K, V> {
        /* renamed from: a */
        private LinkedHashMap<K, V> f20896a;
        /* renamed from: b */
        private int f20897b;

        public C5627a(int i) {
            this.f20897b = i;
            this.f20896a = new RegexCache$LRUCache$1(this, ((i * 4) / 3) + 1, 0.75f, true);
        }

        /* renamed from: a */
        public synchronized V m24679a(K k) {
            return this.f20896a.get(k);
        }

        /* renamed from: a */
        public synchronized void m24680a(K k, V v) {
            this.f20896a.put(k, v);
        }
    }

    public C5628b(int i) {
        this.f20898a = new C5627a(i);
    }

    /* renamed from: a */
    public Pattern m24681a(String str) {
        Pattern pattern = (Pattern) this.f20898a.m24679a((Object) str);
        if (pattern != null) {
            return pattern;
        }
        pattern = Pattern.compile(str);
        this.f20898a.m24680a(str, pattern);
        return pattern;
    }
}
