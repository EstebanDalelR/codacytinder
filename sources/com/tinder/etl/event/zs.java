package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class zs implements EtlEvent {
    /* renamed from: a */
    private Boolean f37925a;
    /* renamed from: b */
    private Boolean f37926b;
    /* renamed from: c */
    private Number f37927c;

    /* renamed from: com.tinder.etl.event.zs$a */
    public static class C9356a {
        /* renamed from: a */
        private zs f31414a;

        private C9356a() {
            this.f31414a = new zs();
        }

        /* renamed from: a */
        public final C9356a m39159a(Boolean bool) {
            this.f31414a.f37925a = bool;
            return this;
        }

        /* renamed from: b */
        public final C9356a m39162b(Boolean bool) {
            this.f31414a.f37926b = bool;
            return this;
        }

        /* renamed from: a */
        public final C9356a m39160a(Number number) {
            this.f31414a.f37927c = number;
            return this;
        }

        /* renamed from: a */
        public zs m39161a() {
            return this.f31414a;
        }
    }

    /* renamed from: com.tinder.etl.event.zs$b */
    public class C11589b extends fw {
        /* renamed from: a */
        final /* synthetic */ zs f37923a;

        /* renamed from: a */
        public String mo10346a() {
            return "Updates.Received";
        }

        public C11589b(zs zsVar, Map<EtlField<?>, Object> map) {
            this.f37923a = zsVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.zs$c */
    private final class C11590c implements DescriptorFactory<C11589b, zs> {
        /* renamed from: a */
        final /* synthetic */ zs f37924a;

        private C11590c(zs zsVar) {
            this.f37924a = zsVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m47204a((zs) etlEvent);
        }

        /* renamed from: a */
        public final C11589b m47204a(zs zsVar) {
            Map hashMap = new HashMap();
            if (zsVar.f37925a != null) {
                hashMap.put(new zr(), zsVar.f37925a);
            }
            if (zsVar.f37926b != null) {
                hashMap.put(new zq(), zsVar.f37926b);
            }
            if (zsVar.f37927c != null) {
                hashMap.put(new zp(), zsVar.f37927c);
            }
            return new C11589b(this.f37924a, hashMap);
        }
    }

    private zs() {
    }

    /* renamed from: a */
    public static C9356a m47205a() {
        return new C9356a();
    }

    public final DescriptorFactory<C11589b, zs> getDescriptorFactory() {
        return new C11590c();
    }
}
