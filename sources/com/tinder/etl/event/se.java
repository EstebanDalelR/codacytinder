package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class se implements EtlEvent {
    /* renamed from: a */
    private Boolean f37298a;

    /* renamed from: com.tinder.etl.event.se$a */
    public static class C9246a {
        /* renamed from: a */
        private se f31359a;

        private C9246a() {
            this.f31359a = new se();
        }

        /* renamed from: a */
        public final C9246a m38707a(Boolean bool) {
            this.f31359a.f37298a = bool;
            return this;
        }

        /* renamed from: a */
        public se m38708a() {
            return this.f31359a;
        }
    }

    /* renamed from: com.tinder.etl.event.se$b */
    public class C11472b extends fw {
        /* renamed from: a */
        final /* synthetic */ se f37296a;

        /* renamed from: a */
        public String mo10346a() {
            return "Profile.ShowGender";
        }

        public C11472b(se seVar, Map<EtlField<?>, Object> map) {
            this.f37296a = seVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.se$c */
    private final class C11473c implements DescriptorFactory<C11472b, se> {
        /* renamed from: a */
        final /* synthetic */ se f37297a;

        private C11473c(se seVar) {
            this.f37297a = seVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46125a((se) etlEvent);
        }

        /* renamed from: a */
        public final C11472b m46125a(se seVar) {
            Map hashMap = new HashMap();
            if (seVar.f37298a != null) {
                hashMap.put(new wp(), seVar.f37298a);
            }
            return new C11472b(this.f37297a, hashMap);
        }
    }

    private se() {
    }

    /* renamed from: a */
    public static C9246a m46126a() {
        return new C9246a();
    }

    public final DescriptorFactory<C11472b, se> getDescriptorFactory() {
        return new C11473c();
    }
}
