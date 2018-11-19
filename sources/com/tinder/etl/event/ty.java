package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ty implements EtlEvent {
    /* renamed from: a */
    private Number f37372a;
    /* renamed from: b */
    private Number f37373b;
    /* renamed from: c */
    private Number f37374c;
    /* renamed from: d */
    private Number f37375d;
    /* renamed from: e */
    private Number f37376e;
    /* renamed from: f */
    private Number f37377f;
    /* renamed from: g */
    private String f37378g;

    /* renamed from: com.tinder.etl.event.ty$a */
    public static class C9270a {
        /* renamed from: a */
        private ty f31371a;

        private C9270a() {
            this.f31371a = new ty();
        }

        /* renamed from: a */
        public final C9270a m38745a(Number number) {
            this.f31371a.f37372a = number;
            return this;
        }

        /* renamed from: b */
        public final C9270a m38748b(Number number) {
            this.f31371a.f37373b = number;
            return this;
        }

        /* renamed from: c */
        public final C9270a m38749c(Number number) {
            this.f31371a.f37374c = number;
            return this;
        }

        /* renamed from: d */
        public final C9270a m38750d(Number number) {
            this.f31371a.f37375d = number;
            return this;
        }

        /* renamed from: e */
        public final C9270a m38751e(Number number) {
            this.f31371a.f37376e = number;
            return this;
        }

        /* renamed from: f */
        public final C9270a m38752f(Number number) {
            this.f31371a.f37377f = number;
            return this;
        }

        /* renamed from: a */
        public final C9270a m38746a(String str) {
            this.f31371a.f37378g = str;
            return this;
        }

        /* renamed from: a */
        public ty m38747a() {
            return this.f31371a;
        }
    }

    /* renamed from: com.tinder.etl.event.ty$b */
    public class C11497b extends fw {
        /* renamed from: a */
        final /* synthetic */ ty f37370a;

        /* renamed from: a */
        public String mo10346a() {
            return "Recs.Interact";
        }

        public C11497b(ty tyVar, Map<EtlField<?>, Object> map) {
            this.f37370a = tyVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ty$c */
    private final class C11498c implements DescriptorFactory<C11497b, ty> {
        /* renamed from: a */
        final /* synthetic */ ty f37371a;

        private C11498c(ty tyVar) {
            this.f37371a = tyVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46237a((ty) etlEvent);
        }

        /* renamed from: a */
        public final C11497b m46237a(ty tyVar) {
            Map hashMap = new HashMap();
            if (tyVar.f37372a != null) {
                hashMap.put(new ly(), tyVar.f37372a);
            }
            if (tyVar.f37373b != null) {
                hashMap.put(new mr(), tyVar.f37373b);
            }
            if (tyVar.f37374c != null) {
                hashMap.put(new mw(), tyVar.f37374c);
            }
            if (tyVar.f37375d != null) {
                hashMap.put(new mx(), tyVar.f37375d);
            }
            if (tyVar.f37376e != null) {
                hashMap.put(new my(), tyVar.f37376e);
            }
            if (tyVar.f37377f != null) {
                hashMap.put(new te(), tyVar.f37377f);
            }
            if (tyVar.f37378g != null) {
                hashMap.put(new zl(), tyVar.f37378g);
            }
            return new C11497b(this.f37371a, hashMap);
        }
    }

    private ty() {
    }

    /* renamed from: a */
    public static C9270a m46238a() {
        return new C9270a();
    }

    public final DescriptorFactory<C11497b, ty> getDescriptorFactory() {
        return new C11498c();
    }
}
