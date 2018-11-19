package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class lw implements EtlEvent {
    /* renamed from: a */
    private Number f37098a;
    /* renamed from: b */
    private Number f37099b;
    /* renamed from: c */
    private Number f37100c;
    /* renamed from: d */
    private Number f37101d;
    /* renamed from: e */
    private String f37102e;
    /* renamed from: f */
    private String f37103f;

    /* renamed from: com.tinder.etl.event.lw$a */
    public static class C9176a {
        /* renamed from: a */
        private lw f31324a;

        private C9176a() {
            this.f31324a = new lw();
        }

        /* renamed from: a */
        public final C9176a m38558a(Number number) {
            this.f31324a.f37098a = number;
            return this;
        }

        /* renamed from: b */
        public final C9176a m38560b(Number number) {
            this.f31324a.f37099b = number;
            return this;
        }

        /* renamed from: c */
        public final C9176a m38561c(Number number) {
            this.f31324a.f37100c = number;
            return this;
        }

        /* renamed from: d */
        public final C9176a m38562d(Number number) {
            this.f31324a.f37101d = number;
            return this;
        }

        /* renamed from: a */
        public lw m38559a() {
            return this.f31324a;
        }
    }

    /* renamed from: com.tinder.etl.event.lw$b */
    public class C11395b extends fw {
        /* renamed from: a */
        final /* synthetic */ lw f37096a;

        /* renamed from: a */
        public String mo10346a() {
            return "Match.StopSearch";
        }

        public C11395b(lw lwVar, Map<EtlField<?>, Object> map) {
            this.f37096a = lwVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.lw$c */
    private final class C11396c implements DescriptorFactory<C11395b, lw> {
        /* renamed from: a */
        final /* synthetic */ lw f37097a;

        private C11396c(lw lwVar) {
            this.f37097a = lwVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45776a((lw) etlEvent);
        }

        /* renamed from: a */
        public final C11395b m45776a(lw lwVar) {
            Map hashMap = new HashMap();
            if (lwVar.f37098a != null) {
                hashMap.put(new nr(), lwVar.f37098a);
            }
            if (lwVar.f37099b != null) {
                hashMap.put(new nw(), lwVar.f37099b);
            }
            if (lwVar.f37100c != null) {
                hashMap.put(new ok(), lwVar.f37100c);
            }
            if (lwVar.f37101d != null) {
                hashMap.put(new ol(), lwVar.f37101d);
            }
            if (lwVar.f37102e != null) {
                hashMap.put(new td(), lwVar.f37102e);
            }
            if (lwVar.f37103f != null) {
                hashMap.put(new wy(), lwVar.f37103f);
            }
            return new C11395b(this.f37097a, hashMap);
        }
    }

    private lw() {
    }

    /* renamed from: a */
    public static C9176a m45777a() {
        return new C9176a();
    }

    public final DescriptorFactory<C11395b, lw> getDescriptorFactory() {
        return new C11396c();
    }
}
