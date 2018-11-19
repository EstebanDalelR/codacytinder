package org.apache.commons.lang3.time;

import java.text.Format;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: org.apache.commons.lang3.time.c */
abstract class C16006c<F extends Format> {
    /* renamed from: b */
    private static final ConcurrentMap<C16005a, String> f49770b = new ConcurrentHashMap(7);
    /* renamed from: a */
    private final ConcurrentMap<C16005a, F> f49771a = new ConcurrentHashMap(7);

    /* renamed from: org.apache.commons.lang3.time.c$a */
    private static class C16005a {
        /* renamed from: a */
        private final Object[] f49768a;
        /* renamed from: b */
        private int f49769b;

        public C16005a(Object... objArr) {
            this.f49768a = objArr;
        }

        public boolean equals(Object obj) {
            return Arrays.equals(this.f49768a, ((C16005a) obj).f49768a);
        }

        public int hashCode() {
            if (this.f49769b == 0) {
                int i = 0;
                for (Object obj : this.f49768a) {
                    if (obj != null) {
                        i = (i * 7) + obj.hashCode();
                    }
                }
                this.f49769b = i;
            }
            return this.f49769b;
        }
    }

    /* renamed from: b */
    protected abstract F mo13457b(String str, TimeZone timeZone, Locale locale);

    C16006c() {
    }

    /* renamed from: c */
    public F m60768c(String str, TimeZone timeZone, Locale locale) {
        if (str == null) {
            throw new NullPointerException("pattern must not be null");
        }
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        C16005a c16005a = new C16005a(str, timeZone, locale);
        Format format = (Format) this.f49771a.get(c16005a);
        if (format != null) {
            return format;
        }
        F b = mo13457b(str, timeZone, locale);
        F f = (Format) this.f49771a.putIfAbsent(c16005a, b);
        return f != null ? f : b;
    }
}
