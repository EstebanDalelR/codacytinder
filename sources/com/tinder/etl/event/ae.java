package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ae implements EtlEvent {
    /* renamed from: a */
    private Number f36136a;
    /* renamed from: b */
    private Number f36137b;
    /* renamed from: c */
    private Number f36138c;
    /* renamed from: d */
    private Number f36139d;
    /* renamed from: e */
    private String f36140e;
    /* renamed from: f */
    private String f36141f;
    /* renamed from: g */
    private Boolean f36142g;
    /* renamed from: h */
    private String f36143h;

    /* renamed from: com.tinder.etl.event.ae$a */
    public static class C8968a {
        /* renamed from: a */
        private ae f31219a;

        private C8968a() {
            this.f31219a = new ae();
        }

        /* renamed from: a */
        public final C8968a m37788a(Number number) {
            this.f31219a.f36136a = number;
            return this;
        }

        /* renamed from: b */
        public final C8968a m37791b(Number number) {
            this.f31219a.f36137b = number;
            return this;
        }

        /* renamed from: c */
        public final C8968a m37793c(Number number) {
            this.f31219a.f36138c = number;
            return this;
        }

        /* renamed from: d */
        public final C8968a m37794d(Number number) {
            this.f31219a.f36139d = number;
            return this;
        }

        /* renamed from: a */
        public final C8968a m37789a(String str) {
            this.f31219a.f36140e = str;
            return this;
        }

        /* renamed from: b */
        public final C8968a m37792b(String str) {
            this.f31219a.f36141f = str;
            return this;
        }

        /* renamed from: a */
        public final C8968a m37787a(Boolean bool) {
            this.f31219a.f36142g = bool;
            return this;
        }

        /* renamed from: a */
        public ae m37790a() {
            return this.f31219a;
        }
    }

    /* renamed from: com.tinder.etl.event.ae$b */
    public class C11174b extends fw {
        /* renamed from: a */
        final /* synthetic */ ae f36134a;

        /* renamed from: a */
        public String mo10346a() {
            return "Ad.Replay";
        }

        public C11174b(ae aeVar, Map<EtlField<?>, Object> map) {
            this.f36134a = aeVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ae$c */
    private final class C11175c implements DescriptorFactory<C11174b, ae> {
        /* renamed from: a */
        final /* synthetic */ ae f36135a;

        private C11175c(ae aeVar) {
            this.f36135a = aeVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44045a((ae) etlEvent);
        }

        /* renamed from: a */
        public final C11174b m44045a(ae aeVar) {
            Map hashMap = new HashMap();
            if (aeVar.f36136a != null) {
                hashMap.put(new C11413q(), aeVar.f36136a);
            }
            if (aeVar.f36137b != null) {
                hashMap.put(new C11582z(), aeVar.f36137b);
            }
            if (aeVar.f36138c != null) {
                hashMap.put(new ad(), aeVar.f36138c);
            }
            if (aeVar.f36139d != null) {
                hashMap.put(new aj(), aeVar.f36139d);
            }
            if (aeVar.f36140e != null) {
                hashMap.put(new cr(), aeVar.f36140e);
            }
            if (aeVar.f36141f != null) {
                hashMap.put(new eh(), aeVar.f36141f);
            }
            if (aeVar.f36142g != null) {
                hashMap.put(new ms(), aeVar.f36142g);
            }
            if (aeVar.f36143h != null) {
                hashMap.put(new xe(), aeVar.f36143h);
            }
            return new C11174b(this.f36135a, hashMap);
        }
    }

    private ae() {
    }

    /* renamed from: a */
    public static C8968a m44046a() {
        return new C8968a();
    }

    public final DescriptorFactory<C11174b, ae> getDescriptorFactory() {
        return new C11175c();
    }
}
