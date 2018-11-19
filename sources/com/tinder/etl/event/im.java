package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class im implements EtlEvent {
    /* renamed from: a */
    private Number f36897a;
    /* renamed from: b */
    private String f36898b;
    /* renamed from: c */
    private Number f36899c;
    /* renamed from: d */
    private String f36900d;
    /* renamed from: e */
    private List f36901e;
    /* renamed from: f */
    private Number f36902f;
    /* renamed from: g */
    private String f36903g;
    /* renamed from: h */
    private List f36904h;

    /* renamed from: com.tinder.etl.event.im$a */
    public static class C9124a {
        /* renamed from: a */
        private im f31298a;

        private C9124a() {
            this.f31298a = new im();
        }

        /* renamed from: a */
        public final C9124a m38409a(Number number) {
            this.f31298a.f36897a = number;
            return this;
        }

        /* renamed from: a */
        public final C9124a m38410a(String str) {
            this.f31298a.f36898b = str;
            return this;
        }

        /* renamed from: b */
        public final C9124a m38413b(Number number) {
            this.f31298a.f36899c = number;
            return this;
        }

        /* renamed from: b */
        public final C9124a m38414b(String str) {
            this.f31298a.f36900d = str;
            return this;
        }

        /* renamed from: a */
        public final C9124a m38411a(List list) {
            this.f31298a.f36901e = list;
            return this;
        }

        /* renamed from: c */
        public final C9124a m38416c(Number number) {
            this.f31298a.f36902f = number;
            return this;
        }

        /* renamed from: c */
        public final C9124a m38417c(String str) {
            this.f31298a.f36903g = str;
            return this;
        }

        /* renamed from: b */
        public final C9124a m38415b(List list) {
            this.f31298a.f36904h = list;
            return this;
        }

        /* renamed from: a */
        public im m38412a() {
            return this.f31298a;
        }
    }

    /* renamed from: com.tinder.etl.event.im$b */
    public class C11340b extends fw {
        /* renamed from: a */
        final /* synthetic */ im f36895a;

        /* renamed from: a */
        public String mo10346a() {
            return "Gold.Restore";
        }

        public C11340b(im imVar, Map<EtlField<?>, Object> map) {
            this.f36895a = imVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.im$c */
    private final class C11341c implements DescriptorFactory<C11340b, im> {
        /* renamed from: a */
        final /* synthetic */ im f36896a;

        private C11341c(im imVar) {
            this.f36896a = imVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45426a((im) etlEvent);
        }

        /* renamed from: a */
        public final C11340b m45426a(im imVar) {
            Map hashMap = new HashMap();
            if (imVar.f36897a != null) {
                hashMap.put(new bq(), imVar.f36897a);
            }
            if (imVar.f36898b != null) {
                hashMap.put(new ej(), imVar.f36898b);
            }
            if (imVar.f36899c != null) {
                hashMap.put(new kf(), imVar.f36899c);
            }
            if (imVar.f36900d != null) {
                hashMap.put(new lc(), imVar.f36900d);
            }
            if (imVar.f36901e != null) {
                hashMap.put(new rm(), imVar.f36901e);
            }
            if (imVar.f36902f != null) {
                hashMap.put(new sk(), imVar.f36902f);
            }
            if (imVar.f36903g != null) {
                hashMap.put(new wr(), imVar.f36903g);
            }
            if (imVar.f36904h != null) {
                hashMap.put(new ws(), imVar.f36904h);
            }
            return new C11340b(this.f36896a, hashMap);
        }
    }

    private im() {
    }

    /* renamed from: a */
    public static C9124a m45427a() {
        return new C9124a();
    }

    public final DescriptorFactory<C11340b, im> getDescriptorFactory() {
        return new C11341c();
    }
}
