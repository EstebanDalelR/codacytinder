package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class rr implements EtlEvent {
    /* renamed from: a */
    private Number f37260a;
    /* renamed from: b */
    private Number f37261b;
    /* renamed from: c */
    private Number f37262c;
    /* renamed from: d */
    private String f37263d;
    /* renamed from: e */
    private Number f37264e;

    /* renamed from: com.tinder.etl.event.rr$a */
    public static class C9234a {
        /* renamed from: a */
        private rr f31353a;

        private C9234a() {
            this.f31353a = new rr();
        }

        /* renamed from: a */
        public final C9234a m38680a(String str) {
            this.f31353a.f37263d = str;
            return this;
        }

        /* renamed from: a */
        public rr m38681a() {
            return this.f31353a;
        }
    }

    /* renamed from: com.tinder.etl.event.rr$b */
    public class C11459b extends fw {
        /* renamed from: a */
        final /* synthetic */ rr f37258a;

        /* renamed from: a */
        public String mo10346a() {
            return "Profile.DeletePhoto";
        }

        public C11459b(rr rrVar, Map<EtlField<?>, Object> map) {
            this.f37258a = rrVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.rr$c */
    private final class C11460c implements DescriptorFactory<C11459b, rr> {
        /* renamed from: a */
        final /* synthetic */ rr f37259a;

        private C11460c(rr rrVar) {
            this.f37259a = rrVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46060a((rr) etlEvent);
        }

        /* renamed from: a */
        public final C11459b m46060a(rr rrVar) {
            Map hashMap = new HashMap();
            if (rrVar.f37260a != null) {
                hashMap.put(new hc(), rrVar.f37260a);
            }
            if (rrVar.f37261b != null) {
                hashMap.put(new hd(), rrVar.f37261b);
            }
            if (rrVar.f37262c != null) {
                hashMap.put(new me(), rrVar.f37262c);
            }
            if (rrVar.f37263d != null) {
                hashMap.put(new pq(), rrVar.f37263d);
            }
            if (rrVar.f37264e != null) {
                hashMap.put(new yz(), rrVar.f37264e);
            }
            return new C11459b(this.f37259a, hashMap);
        }
    }

    private rr() {
    }

    /* renamed from: a */
    public static C9234a m46061a() {
        return new C9234a();
    }

    public final DescriptorFactory<C11459b, rr> getDescriptorFactory() {
        return new C11460c();
    }
}
