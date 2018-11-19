package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.v */
public final class C11530v implements EtlEvent {
    /* renamed from: a */
    private Number f37597a;
    /* renamed from: b */
    private Number f37598b;
    /* renamed from: c */
    private Number f37599c;
    /* renamed from: d */
    private Number f37600d;
    /* renamed from: e */
    private String f37601e;
    /* renamed from: f */
    private Number f37602f;
    /* renamed from: g */
    private String f37603g;
    /* renamed from: h */
    private Boolean f37604h;
    /* renamed from: i */
    private String f37605i;

    /* renamed from: com.tinder.etl.event.v$a */
    public static class C9300a {
        /* renamed from: a */
        private C11530v f31386a;

        private C9300a() {
            this.f31386a = new C11530v();
        }

        /* renamed from: a */
        public final C9300a m38887a(Number number) {
            this.f31386a.f37597a = number;
            return this;
        }

        /* renamed from: b */
        public final C9300a m38890b(Number number) {
            this.f31386a.f37598b = number;
            return this;
        }

        /* renamed from: c */
        public final C9300a m38892c(Number number) {
            this.f31386a.f37599c = number;
            return this;
        }

        /* renamed from: d */
        public final C9300a m38893d(Number number) {
            this.f31386a.f37600d = number;
            return this;
        }

        /* renamed from: a */
        public final C9300a m38888a(String str) {
            this.f31386a.f37601e = str;
            return this;
        }

        /* renamed from: e */
        public final C9300a m38894e(Number number) {
            this.f31386a.f37602f = number;
            return this;
        }

        /* renamed from: b */
        public final C9300a m38891b(String str) {
            this.f31386a.f37603g = str;
            return this;
        }

        /* renamed from: a */
        public final C9300a m38886a(Boolean bool) {
            this.f31386a.f37604h = bool;
            return this;
        }

        /* renamed from: a */
        public C11530v m38889a() {
            return this.f31386a;
        }
    }

    /* renamed from: com.tinder.etl.event.v$b */
    public class C11528b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11530v f37595a;

        /* renamed from: a */
        public String mo10346a() {
            return "Ad.Complete";
        }

        public C11528b(C11530v c11530v, Map<EtlField<?>, Object> map) {
            this.f37595a = c11530v;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.v$c */
    private final class C11529c implements DescriptorFactory<C11528b, C11530v> {
        /* renamed from: a */
        final /* synthetic */ C11530v f37596a;

        private C11529c(C11530v c11530v) {
            this.f37596a = c11530v;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46603a((C11530v) etlEvent);
        }

        /* renamed from: a */
        public final C11528b m46603a(C11530v c11530v) {
            Map hashMap = new HashMap();
            if (c11530v.f37597a != null) {
                hashMap.put(new C11413q(), c11530v.f37597a);
            }
            if (c11530v.f37598b != null) {
                hashMap.put(new C11582z(), c11530v.f37598b);
            }
            if (c11530v.f37599c != null) {
                hashMap.put(new ad(), c11530v.f37599c);
            }
            if (c11530v.f37600d != null) {
                hashMap.put(new aj(), c11530v.f37600d);
            }
            if (c11530v.f37601e != null) {
                hashMap.put(new cr(), c11530v.f37601e);
            }
            if (c11530v.f37602f != null) {
                hashMap.put(new cu(), c11530v.f37602f);
            }
            if (c11530v.f37603g != null) {
                hashMap.put(new eh(), c11530v.f37603g);
            }
            if (c11530v.f37604h != null) {
                hashMap.put(new ms(), c11530v.f37604h);
            }
            if (c11530v.f37605i != null) {
                hashMap.put(new xe(), c11530v.f37605i);
            }
            return new C11528b(this.f37596a, hashMap);
        }
    }

    private C11530v() {
    }

    /* renamed from: a */
    public static C9300a m46604a() {
        return new C9300a();
    }

    public final DescriptorFactory<C11528b, C11530v> getDescriptorFactory() {
        return new C11529c();
    }
}
