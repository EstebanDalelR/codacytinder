package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class be implements EtlEvent {
    /* renamed from: a */
    private String f36229a;
    /* renamed from: b */
    private String f36230b;

    /* renamed from: com.tinder.etl.event.be$a */
    public static class C8990a {
        /* renamed from: a */
        private be f31230a;

        private C8990a() {
            this.f31230a = new be();
        }

        /* renamed from: a */
        public final C8990a m37859a(String str) {
            this.f31230a.f36229a = str;
            return this;
        }

        /* renamed from: b */
        public final C8990a m37861b(String str) {
            this.f31230a.f36230b = str;
            return this;
        }

        /* renamed from: a */
        public be m37860a() {
            return this.f31230a;
        }
    }

    /* renamed from: com.tinder.etl.event.be$b */
    public class C11197b extends fw {
        /* renamed from: a */
        final /* synthetic */ be f36227a;

        /* renamed from: a */
        public String mo10346a() {
            return "Auth.AccountLinkModal";
        }

        public C11197b(be beVar, Map<EtlField<?>, Object> map) {
            this.f36227a = beVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.be$c */
    private final class C11198c implements DescriptorFactory<C11197b, be> {
        /* renamed from: a */
        final /* synthetic */ be f36228a;

        private C11198c(be beVar) {
            this.f36228a = beVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44210a((be) etlEvent);
        }

        /* renamed from: a */
        public final C11197b m44210a(be beVar) {
            Map hashMap = new HashMap();
            if (beVar.f36229a != null) {
                hashMap.put(new bd(), beVar.f36229a);
            }
            if (beVar.f36230b != null) {
                hashMap.put(new bf(), beVar.f36230b);
            }
            return new C11197b(this.f36228a, hashMap);
        }
    }

    private be() {
    }

    /* renamed from: a */
    public static C8990a m44211a() {
        return new C8990a();
    }

    public final DescriptorFactory<C11197b, be> getDescriptorFactory() {
        return new C11198c();
    }
}
