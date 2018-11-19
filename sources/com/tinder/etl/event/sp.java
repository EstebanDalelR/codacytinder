package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class sp implements EtlEvent {
    /* renamed from: a */
    private String f37309a;

    /* renamed from: com.tinder.etl.event.sp$a */
    public static class C9252a {
        /* renamed from: a */
        private sp f31362a;

        private C9252a() {
            this.f31362a = new sp();
        }

        /* renamed from: a */
        public final C9252a m38715a(String str) {
            this.f31362a.f37309a = str;
            return this;
        }

        /* renamed from: a */
        public sp m38716a() {
            return this.f31362a;
        }
    }

    /* renamed from: com.tinder.etl.event.sp$b */
    public class C11478b extends fw {
        /* renamed from: a */
        final /* synthetic */ sp f37307a;

        /* renamed from: a */
        public String mo10346a() {
            return "Push.Market";
        }

        public C11478b(sp spVar, Map<EtlField<?>, Object> map) {
            this.f37307a = spVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.sp$c */
    private final class C11479c implements DescriptorFactory<C11478b, sp> {
        /* renamed from: a */
        final /* synthetic */ sp f37308a;

        private C11479c(sp spVar) {
            this.f37308a = spVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46144a((sp) etlEvent);
        }

        /* renamed from: a */
        public final C11478b m46144a(sp spVar) {
            Map hashMap = new HashMap();
            if (spVar.f37309a != null) {
                hashMap.put(new cr(), spVar.f37309a);
            }
            return new C11478b(this.f37308a, hashMap);
        }
    }

    private sp() {
    }

    /* renamed from: a */
    public static C9252a m46145a() {
        return new C9252a();
    }

    public final DescriptorFactory<C11478b, sp> getDescriptorFactory() {
        return new C11479c();
    }
}
