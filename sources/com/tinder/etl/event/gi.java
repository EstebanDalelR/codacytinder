package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class gi implements EtlEvent {
    /* renamed from: a */
    private String f36716a;

    /* renamed from: com.tinder.etl.event.gi$a */
    public static class C9086a {
        /* renamed from: a */
        private gi f31279a;

        private C9086a() {
            this.f31279a = new gi();
        }

        /* renamed from: a */
        public final C9086a m38261a(String str) {
            this.f31279a.f36716a = str;
            return this;
        }

        /* renamed from: a */
        public gi m38262a() {
            return this.f31279a;
        }
    }

    /* renamed from: com.tinder.etl.event.gi$b */
    public class C11299b extends fw {
        /* renamed from: a */
        final /* synthetic */ gi f36714a;

        /* renamed from: a */
        public String mo10346a() {
            return "Feed.NoActivity";
        }

        public C11299b(gi giVar, Map<EtlField<?>, Object> map) {
            this.f36714a = giVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.gi$c */
    private final class C11300c implements DescriptorFactory<C11299b, gi> {
        /* renamed from: a */
        final /* synthetic */ gi f36715a;

        private C11300c(gi giVar) {
            this.f36715a = giVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45097a((gi) etlEvent);
        }

        /* renamed from: a */
        public final C11299b m45097a(gi giVar) {
            Map hashMap = new HashMap();
            if (giVar.f36716a != null) {
                hashMap.put(new gk(), giVar.f36716a);
            }
            return new C11299b(this.f36715a, hashMap);
        }
    }

    private gi() {
    }

    /* renamed from: a */
    public static C9086a m45098a() {
        return new C9086a();
    }

    public final DescriptorFactory<C11299b, gi> getDescriptorFactory() {
        return new C11300c();
    }
}
