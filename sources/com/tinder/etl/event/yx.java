package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class yx implements EtlEvent {
    /* renamed from: a */
    private String f37898a;
    /* renamed from: b */
    private String f37899b;
    /* renamed from: c */
    private List f37900c;
    /* renamed from: d */
    private Number f37901d;
    /* renamed from: e */
    private Number f37902e;
    /* renamed from: f */
    private String f37903f;
    /* renamed from: g */
    private String f37904g;
    /* renamed from: h */
    private String f37905h;

    /* renamed from: com.tinder.etl.event.yx$a */
    public static class C9348a {
        /* renamed from: a */
        private yx f31410a;

        private C9348a() {
            this.f31410a = new yx();
        }

        /* renamed from: a */
        public final C9348a m39138a(String str) {
            this.f31410a.f37898a = str;
            return this;
        }

        /* renamed from: b */
        public final C9348a m39142b(String str) {
            this.f31410a.f37899b = str;
            return this;
        }

        /* renamed from: a */
        public final C9348a m39139a(List list) {
            this.f31410a.f37900c = list;
            return this;
        }

        /* renamed from: a */
        public final C9348a m39137a(Number number) {
            this.f31410a.f37901d = number;
            return this;
        }

        /* renamed from: b */
        public final C9348a m39141b(Number number) {
            this.f31410a.f37902e = number;
            return this;
        }

        /* renamed from: c */
        public final C9348a m39143c(String str) {
            this.f31410a.f37903f = str;
            return this;
        }

        /* renamed from: d */
        public final C9348a m39144d(String str) {
            this.f31410a.f37904g = str;
            return this;
        }

        /* renamed from: a */
        public yx m39140a() {
            return this.f31410a;
        }
    }

    /* renamed from: com.tinder.etl.event.yx$b */
    public class C11580b extends fw {
        /* renamed from: a */
        final /* synthetic */ yx f37896a;

        /* renamed from: a */
        public String mo10346a() {
            return "TinderPlus.SkuOffered";
        }

        public C11580b(yx yxVar, Map<EtlField<?>, Object> map) {
            this.f37896a = yxVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.yx$c */
    private final class C11581c implements DescriptorFactory<C11580b, yx> {
        /* renamed from: a */
        final /* synthetic */ yx f37897a;

        private C11581c(yx yxVar) {
            this.f37897a = yxVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m47155a((yx) etlEvent);
        }

        /* renamed from: a */
        public final C11580b m47155a(yx yxVar) {
            Map hashMap = new HashMap();
            if (yxVar.f37898a != null) {
                hashMap.put(new ej(), yxVar.f37898a);
            }
            if (yxVar.f37899b != null) {
                hashMap.put(new lc(), yxVar.f37899b);
            }
            if (yxVar.f37900c != null) {
                hashMap.put(new ws(), yxVar.f37900c);
            }
            if (yxVar.f37901d != null) {
                hashMap.put(new bq(), yxVar.f37901d);
            }
            if (yxVar.f37902e != null) {
                hashMap.put(new ez(), yxVar.f37902e);
            }
            if (yxVar.f37903f != null) {
                hashMap.put(new ey(), yxVar.f37903f);
            }
            if (yxVar.f37904g != null) {
                hashMap.put(new ex(), yxVar.f37904g);
            }
            if (yxVar.f37905h != null) {
                hashMap.put(new yf(), yxVar.f37905h);
            }
            return new C11580b(this.f37897a, hashMap);
        }
    }

    private yx() {
    }

    /* renamed from: a */
    public static C9348a m47156a() {
        return new C9348a();
    }

    public final DescriptorFactory<C11580b, yx> getDescriptorFactory() {
        return new C11581c();
    }
}
