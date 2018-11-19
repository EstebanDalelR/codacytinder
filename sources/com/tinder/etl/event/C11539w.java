package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.w */
public final class C11539w implements EtlEvent {
    /* renamed from: a */
    private Number f37630a;
    /* renamed from: b */
    private Number f37631b;
    /* renamed from: c */
    private String f37632c;
    /* renamed from: d */
    private String f37633d;
    /* renamed from: e */
    private Number f37634e;
    /* renamed from: f */
    private Boolean f37635f;
    /* renamed from: g */
    private String f37636g;

    /* renamed from: com.tinder.etl.event.w$a */
    public static class C9308a {
        /* renamed from: a */
        private C11539w f31390a;

        private C9308a() {
            this.f31390a = new C11539w();
        }

        /* renamed from: a */
        public final C9308a m38912a(Number number) {
            this.f31390a.f37630a = number;
            return this;
        }

        /* renamed from: b */
        public final C9308a m38915b(Number number) {
            this.f31390a.f37631b = number;
            return this;
        }

        /* renamed from: a */
        public final C9308a m38913a(String str) {
            this.f31390a.f37632c = str;
            return this;
        }

        /* renamed from: b */
        public final C9308a m38916b(String str) {
            this.f31390a.f37633d = str;
            return this;
        }

        /* renamed from: c */
        public final C9308a m38917c(Number number) {
            this.f31390a.f37634e = number;
            return this;
        }

        /* renamed from: a */
        public final C9308a m38911a(Boolean bool) {
            this.f31390a.f37635f = bool;
            return this;
        }

        /* renamed from: c */
        public final C9308a m38918c(String str) {
            this.f31390a.f37636g = str;
            return this;
        }

        /* renamed from: a */
        public C11539w m38914a() {
            return this.f31390a;
        }
    }

    /* renamed from: com.tinder.etl.event.w$b */
    public class C11537b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11539w f37628a;

        /* renamed from: a */
        public String mo10346a() {
            return "Ad.DetailsClose";
        }

        public C11537b(C11539w c11539w, Map<EtlField<?>, Object> map) {
            this.f37628a = c11539w;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.w$c */
    private final class C11538c implements DescriptorFactory<C11537b, C11539w> {
        /* renamed from: a */
        final /* synthetic */ C11539w f37629a;

        private C11538c(C11539w c11539w) {
            this.f37629a = c11539w;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46661a((C11539w) etlEvent);
        }

        /* renamed from: a */
        public final C11537b m46661a(C11539w c11539w) {
            Map hashMap = new HashMap();
            if (c11539w.f37630a != null) {
                hashMap.put(new C11413q(), c11539w.f37630a);
            }
            if (c11539w.f37631b != null) {
                hashMap.put(new ad(), c11539w.f37631b);
            }
            if (c11539w.f37632c != null) {
                hashMap.put(new cr(), c11539w.f37632c);
            }
            if (c11539w.f37633d != null) {
                hashMap.put(new eh(), c11539w.f37633d);
            }
            if (c11539w.f37634e != null) {
                hashMap.put(new hc(), c11539w.f37634e);
            }
            if (c11539w.f37635f != null) {
                hashMap.put(new ms(), c11539w.f37635f);
            }
            if (c11539w.f37636g != null) {
                hashMap.put(new zl(), c11539w.f37636g);
            }
            return new C11537b(this.f37629a, hashMap);
        }
    }

    private C11539w() {
    }

    /* renamed from: a */
    public static C9308a m46662a() {
        return new C9308a();
    }

    public final DescriptorFactory<C11537b, C11539w> getDescriptorFactory() {
        return new C11538c();
    }
}
