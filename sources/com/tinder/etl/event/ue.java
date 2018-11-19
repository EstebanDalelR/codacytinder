package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ue implements EtlEvent {
    /* renamed from: a */
    private String f37440a;
    /* renamed from: b */
    private String f37441b;
    /* renamed from: c */
    private Number f37442c;
    /* renamed from: d */
    private Number f37443d;
    /* renamed from: e */
    private String f37444e;
    /* renamed from: f */
    private Number f37445f;

    /* renamed from: com.tinder.etl.event.ue$a */
    public static class C9284a {
        /* renamed from: a */
        private ue f31378a;

        private C9284a() {
            this.f31378a = new ue();
        }

        /* renamed from: a */
        public final C9284a m38789a(String str) {
            this.f31378a.f37440a = str;
            return this;
        }

        /* renamed from: b */
        public final C9284a m38791b(String str) {
            this.f31378a.f37444e = str;
            return this;
        }

        /* renamed from: a */
        public final C9284a m38788a(Number number) {
            this.f31378a.f37445f = number;
            return this;
        }

        /* renamed from: a */
        public ue m38790a() {
            return this.f31378a;
        }
    }

    /* renamed from: com.tinder.etl.event.ue$b */
    public class C11512b extends fw {
        /* renamed from: a */
        final /* synthetic */ ue f37438a;

        /* renamed from: a */
        public String mo10346a() {
            return "Recs.ProfileInstagramSelect";
        }

        public C11512b(ue ueVar, Map<EtlField<?>, Object> map) {
            this.f37438a = ueVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ue$c */
    private final class C11513c implements DescriptorFactory<C11512b, ue> {
        /* renamed from: a */
        final /* synthetic */ ue f37439a;

        private C11513c(ue ueVar) {
            this.f37439a = ueVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46348a((ue) etlEvent);
        }

        /* renamed from: a */
        public final C11512b m46348a(ue ueVar) {
            Map hashMap = new HashMap();
            if (ueVar.f37440a != null) {
                hashMap.put(new jj(), ueVar.f37440a);
            }
            if (ueVar.f37441b != null) {
                hashMap.put(new kb(), ueVar.f37441b);
            }
            if (ueVar.f37442c != null) {
                hashMap.put(new nx(), ueVar.f37442c);
            }
            if (ueVar.f37443d != null) {
                hashMap.put(new ny(), ueVar.f37443d);
            }
            if (ueVar.f37444e != null) {
                hashMap.put(new ov(), ueVar.f37444e);
            }
            if (ueVar.f37445f != null) {
                hashMap.put(new pr(), ueVar.f37445f);
            }
            return new C11512b(this.f37439a, hashMap);
        }
    }

    private ue() {
    }

    /* renamed from: a */
    public static C9284a m46349a() {
        return new C9284a();
    }

    public final DescriptorFactory<C11512b, ue> getDescriptorFactory() {
        return new C11513c();
    }
}
