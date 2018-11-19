package com.tinder.analytics.fireworks;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/* renamed from: com.tinder.analytics.fireworks.i */
public class C2632i {
    @Nonnull
    /* renamed from: a */
    private String f8217a;
    @Nonnull
    /* renamed from: b */
    private Map<C2633r, Object> f8218b;

    /* renamed from: com.tinder.analytics.fireworks.i$a */
    public static class C2631a {
        @Nonnull
        /* renamed from: a */
        private final String f8215a;
        @Nonnull
        /* renamed from: b */
        private final Map<C2633r, Object> f8216b;

        private C2631a(@Nonnull String str) {
            this.f8215a = str;
            this.f8216b = new HashMap();
        }

        private C2631a(@Nonnull C2632i c2632i) {
            this.f8215a = c2632i.f8217a;
            this.f8216b = new HashMap(c2632i.f8218b);
        }

        @Nonnull
        /* renamed from: a */
        public C2631a m9863a(@Nonnull C2633r c2633r, @Nonnull Object obj) {
            this.f8216b.put(c2633r, obj);
            return this;
        }

        @Nonnull
        /* renamed from: a */
        public C2632i m9864a() {
            return new C2632i(this.f8215a, this.f8216b);
        }
    }

    @Nonnull
    /* renamed from: a */
    public static C2631a m9865a(@Nonnull String str) {
        return new C2631a(str);
    }

    private C2632i(@Nonnull String str, @Nonnull Map<C2633r, Object> map) {
        this.f8217a = str;
        this.f8218b = map;
    }

    @Nonnull
    /* renamed from: a */
    public C2631a m9868a() {
        return new C2631a();
    }

    @Nonnull
    /* renamed from: b */
    public String m9869b() {
        return this.f8217a;
    }

    @Nonnull
    /* renamed from: c */
    public Map<C2633r, Object> m9870c() {
        return this.f8218b;
    }
}
