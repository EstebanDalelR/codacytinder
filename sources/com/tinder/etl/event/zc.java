package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class zc implements EtlEvent {
    /* renamed from: a */
    private Boolean f37922a;

    /* renamed from: com.tinder.etl.event.zc$a */
    public static class C9354a {
        /* renamed from: a */
        private zc f31413a;

        private C9354a() {
            this.f31413a = new zc();
        }

        /* renamed from: a */
        public final C9354a m39157a(Boolean bool) {
            this.f31413a.f37922a = bool;
            return this;
        }

        /* renamed from: a */
        public zc m39158a() {
            return this.f31413a;
        }
    }

    /* renamed from: com.tinder.etl.event.zc$b */
    public class C11587b extends fw {
        /* renamed from: a */
        final /* synthetic */ zc f37920a;

        /* renamed from: a */
        public String mo10346a() {
            return "TopPicks.EmptyState.View";
        }

        public C11587b(zc zcVar, Map<EtlField<?>, Object> map) {
            this.f37920a = zcVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.zc$c */
    private final class C11588c implements DescriptorFactory<C11587b, zc> {
        /* renamed from: a */
        final /* synthetic */ zc f37921a;

        private C11588c(zc zcVar) {
            this.f37921a = zcVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m47199a((zc) etlEvent);
        }

        /* renamed from: a */
        public final C11587b m47199a(zc zcVar) {
            Map hashMap = new HashMap();
            if (zcVar.f37922a != null) {
                hashMap.put(new jt(), zcVar.f37922a);
            }
            return new C11587b(this.f37921a, hashMap);
        }
    }

    private zc() {
    }

    /* renamed from: a */
    public static C9354a m47200a() {
        return new C9354a();
    }

    public final DescriptorFactory<C11587b, zc> getDescriptorFactory() {
        return new C11588c();
    }
}
