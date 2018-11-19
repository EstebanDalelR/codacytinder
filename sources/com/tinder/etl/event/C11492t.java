package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.t */
public final class C11492t implements EtlEvent {
    /* renamed from: a */
    private Number f37352a;
    /* renamed from: b */
    private Number f37353b;
    /* renamed from: c */
    private Number f37354c;
    /* renamed from: d */
    private String f37355d;
    /* renamed from: e */
    private String f37356e;
    /* renamed from: f */
    private String f37357f;

    /* renamed from: com.tinder.etl.event.t$a */
    public static class C9264a {
        /* renamed from: a */
        private C11492t f31368a;

        private C9264a() {
            this.f31368a = new C11492t();
        }

        /* renamed from: a */
        public final C9264a m38732a(Number number) {
            this.f31368a.f37352a = number;
            return this;
        }

        /* renamed from: b */
        public final C9264a m38735b(Number number) {
            this.f31368a.f37353b = number;
            return this;
        }

        /* renamed from: c */
        public final C9264a m38737c(Number number) {
            this.f31368a.f37354c = number;
            return this;
        }

        /* renamed from: a */
        public final C9264a m38733a(String str) {
            this.f31368a.f37355d = str;
            return this;
        }

        /* renamed from: b */
        public final C9264a m38736b(String str) {
            this.f31368a.f37356e = str;
            return this;
        }

        /* renamed from: a */
        public C11492t m38734a() {
            return this.f31368a;
        }
    }

    /* renamed from: com.tinder.etl.event.t$b */
    public class C11490b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11492t f37350a;

        /* renamed from: a */
        public String mo10346a() {
            return "Ad.ChatOpen";
        }

        public C11490b(C11492t c11492t, Map<EtlField<?>, Object> map) {
            this.f37350a = c11492t;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.t$c */
    private final class C11491c implements DescriptorFactory<C11490b, C11492t> {
        /* renamed from: a */
        final /* synthetic */ C11492t f37351a;

        private C11491c(C11492t c11492t) {
            this.f37351a = c11492t;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46204a((C11492t) etlEvent);
        }

        /* renamed from: a */
        public final C11490b m46204a(C11492t c11492t) {
            Map hashMap = new HashMap();
            if (c11492t.f37352a != null) {
                hashMap.put(new C11582z(), c11492t.f37352a);
            }
            if (c11492t.f37353b != null) {
                hashMap.put(new ad(), c11492t.f37353b);
            }
            if (c11492t.f37354c != null) {
                hashMap.put(new aj(), c11492t.f37354c);
            }
            if (c11492t.f37355d != null) {
                hashMap.put(new cr(), c11492t.f37355d);
            }
            if (c11492t.f37356e != null) {
                hashMap.put(new eh(), c11492t.f37356e);
            }
            if (c11492t.f37357f != null) {
                hashMap.put(new xe(), c11492t.f37357f);
            }
            return new C11490b(this.f37351a, hashMap);
        }
    }

    private C11492t() {
    }

    /* renamed from: a */
    public static C9264a m46205a() {
        return new C9264a();
    }

    public final DescriptorFactory<C11490b, C11492t> getDescriptorFactory() {
        return new C11491c();
    }
}
