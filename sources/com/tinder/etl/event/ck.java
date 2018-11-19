package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ck implements EtlEvent {
    /* renamed from: a */
    private Number f36321a;
    /* renamed from: b */
    private String f36322b;
    /* renamed from: c */
    private Number f36323c;
    /* renamed from: d */
    private Number f36324d;
    /* renamed from: e */
    private Boolean f36325e;

    /* renamed from: com.tinder.etl.event.ck$a */
    public static class C9014a {
        /* renamed from: a */
        private ck f31242a;

        private C9014a() {
            this.f31242a = new ck();
        }

        /* renamed from: a */
        public final C9014a m37935a(Number number) {
            this.f31242a.f36321a = number;
            return this;
        }

        /* renamed from: a */
        public final C9014a m37936a(String str) {
            this.f31242a.f36322b = str;
            return this;
        }

        /* renamed from: b */
        public final C9014a m37938b(Number number) {
            this.f31242a.f36323c = number;
            return this;
        }

        /* renamed from: c */
        public final C9014a m37939c(Number number) {
            this.f31242a.f36324d = number;
            return this;
        }

        /* renamed from: a */
        public final C9014a m37934a(Boolean bool) {
            this.f31242a.f36325e = bool;
            return this;
        }

        /* renamed from: a */
        public ck m37937a() {
            return this.f31242a;
        }
    }

    /* renamed from: com.tinder.etl.event.ck$b */
    public class C11222b extends fw {
        /* renamed from: a */
        final /* synthetic */ ck f36319a;

        /* renamed from: a */
        public String mo10346a() {
            return "Boost.ViewResult";
        }

        public C11222b(ck ckVar, Map<EtlField<?>, Object> map) {
            this.f36319a = ckVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ck$c */
    private final class C11223c implements DescriptorFactory<C11222b, ck> {
        /* renamed from: a */
        final /* synthetic */ ck f36320a;

        private C11223c(ck ckVar) {
            this.f36320a = ckVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44377a((ck) etlEvent);
        }

        /* renamed from: a */
        public final C11222b m44377a(ck ckVar) {
            Map hashMap = new HashMap();
            if (ckVar.f36321a != null) {
                hashMap.put(new bw(), ckVar.f36321a);
            }
            if (ckVar.f36322b != null) {
                hashMap.put(new bx(), ckVar.f36322b);
            }
            if (ckVar.f36323c != null) {
                hashMap.put(new cf(), ckVar.f36323c);
            }
            if (ckVar.f36324d != null) {
                hashMap.put(new cl(), ckVar.f36324d);
            }
            if (ckVar.f36325e != null) {
                hashMap.put(new iz(), ckVar.f36325e);
            }
            return new C11222b(this.f36320a, hashMap);
        }
    }

    private ck() {
    }

    /* renamed from: a */
    public static C9014a m44378a() {
        return new C9014a();
    }

    public final DescriptorFactory<C11222b, ck> getDescriptorFactory() {
        return new C11223c();
    }
}
