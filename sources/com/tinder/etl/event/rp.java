package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class rp implements EtlEvent {
    /* renamed from: a */
    private String f37252a;
    /* renamed from: b */
    private String f37253b;

    /* renamed from: com.tinder.etl.event.rp$a */
    public static class C9230a {
        /* renamed from: a */
        private rp f31351a;

        private C9230a() {
            this.f31351a = new rp();
        }

        /* renamed from: a */
        public final C9230a m38674a(String str) {
            this.f31351a.f37252a = str;
            return this;
        }

        /* renamed from: b */
        public final C9230a m38676b(String str) {
            this.f31351a.f37253b = str;
            return this;
        }

        /* renamed from: a */
        public rp m38675a() {
            return this.f31351a;
        }
    }

    /* renamed from: com.tinder.etl.event.rp$b */
    public class C11455b extends fw {
        /* renamed from: a */
        final /* synthetic */ rp f37250a;

        /* renamed from: a */
        public String mo10346a() {
            return "Profile.ChangeJobTitle";
        }

        public C11455b(rp rpVar, Map<EtlField<?>, Object> map) {
            this.f37250a = rpVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.rp$c */
    private final class C11456c implements DescriptorFactory<C11455b, rp> {
        /* renamed from: a */
        final /* synthetic */ rp f37251a;

        private C11456c(rp rpVar) {
            this.f37251a = rpVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46046a((rp) etlEvent);
        }

        /* renamed from: a */
        public final C11455b m46046a(rp rpVar) {
            Map hashMap = new HashMap();
            if (rpVar.f37252a != null) {
                hashMap.put(new ka(), rpVar.f37252a);
            }
            if (rpVar.f37253b != null) {
                hashMap.put(new rh(), rpVar.f37253b);
            }
            return new C11455b(this.f37251a, hashMap);
        }
    }

    private rp() {
    }

    /* renamed from: a */
    public static C9230a m46047a() {
        return new C9230a();
    }

    public final DescriptorFactory<C11455b, rp> getDescriptorFactory() {
        return new C11456c();
    }
}
