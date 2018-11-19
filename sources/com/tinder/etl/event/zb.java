package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zb implements EtlEvent {
    /* renamed from: a */
    private List f37918a;
    /* renamed from: b */
    private Number f37919b;

    /* renamed from: com.tinder.etl.event.zb$a */
    public static class C9352a {
        /* renamed from: a */
        private zb f31412a;

        private C9352a() {
            this.f31412a = new zb();
        }

        /* renamed from: a */
        public final C9352a m39155a(List list) {
            this.f31412a.f37918a = list;
            return this;
        }

        /* renamed from: a */
        public final C9352a m39154a(Number number) {
            this.f31412a.f37919b = number;
            return this;
        }

        /* renamed from: a */
        public zb m39156a() {
            return this.f31412a;
        }
    }

    /* renamed from: com.tinder.etl.event.zb$b */
    public class C11585b extends fw {
        /* renamed from: a */
        final /* synthetic */ zb f37916a;

        /* renamed from: a */
        public String mo10346a() {
            return "TopPicksALCPaywall.View";
        }

        public C11585b(zb zbVar, Map<EtlField<?>, Object> map) {
            this.f37916a = zbVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.zb$c */
    private final class C11586c implements DescriptorFactory<C11585b, zb> {
        /* renamed from: a */
        final /* synthetic */ zb f37917a;

        private C11586c(zb zbVar) {
            this.f37917a = zbVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m47192a((zb) etlEvent);
        }

        /* renamed from: a */
        public final C11585b m47192a(zb zbVar) {
            Map hashMap = new HashMap();
            if (zbVar.f37918a != null) {
                hashMap.put(new rm(), zbVar.f37918a);
            }
            if (zbVar.f37919b != null) {
                hashMap.put(new hc(), zbVar.f37919b);
            }
            return new C11585b(this.f37917a, hashMap);
        }
    }

    private zb() {
    }

    /* renamed from: a */
    public static C9352a m47193a() {
        return new C9352a();
    }

    public final DescriptorFactory<C11585b, zb> getDescriptorFactory() {
        return new C11586c();
    }
}
