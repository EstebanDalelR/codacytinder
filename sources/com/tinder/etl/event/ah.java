package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ah implements EtlEvent {
    /* renamed from: a */
    private Number f36167a;
    /* renamed from: b */
    private Number f36168b;
    /* renamed from: c */
    private Number f36169c;
    /* renamed from: d */
    private Number f36170d;
    /* renamed from: e */
    private Number f36171e;
    /* renamed from: f */
    private String f36172f;
    /* renamed from: g */
    private String f36173g;
    /* renamed from: h */
    private String f36174h;
    /* renamed from: i */
    private Boolean f36175i;
    /* renamed from: j */
    private Number f36176j;
    /* renamed from: k */
    private Number f36177k;
    /* renamed from: l */
    private String f36178l;

    /* renamed from: com.tinder.etl.event.ah$a */
    public static class C8974a {
        /* renamed from: a */
        private ah f31222a;

        private C8974a() {
            this.f31222a = new ah();
        }

        /* renamed from: a */
        public final C8974a m37811a(Number number) {
            this.f31222a.f36167a = number;
            return this;
        }

        /* renamed from: b */
        public final C8974a m37814b(Number number) {
            this.f31222a.f36168b = number;
            return this;
        }

        /* renamed from: c */
        public final C8974a m37816c(Number number) {
            this.f31222a.f36169c = number;
            return this;
        }

        /* renamed from: d */
        public final C8974a m37817d(Number number) {
            this.f31222a.f36170d = number;
            return this;
        }

        /* renamed from: e */
        public final C8974a m37818e(Number number) {
            this.f31222a.f36171e = number;
            return this;
        }

        /* renamed from: a */
        public final C8974a m37812a(String str) {
            this.f31222a.f36172f = str;
            return this;
        }

        /* renamed from: b */
        public final C8974a m37815b(String str) {
            this.f31222a.f36173g = str;
            return this;
        }

        /* renamed from: a */
        public final C8974a m37810a(Boolean bool) {
            this.f31222a.f36175i = bool;
            return this;
        }

        /* renamed from: f */
        public final C8974a m37819f(Number number) {
            this.f31222a.f36176j = number;
            return this;
        }

        /* renamed from: g */
        public final C8974a m37820g(Number number) {
            this.f31222a.f36177k = number;
            return this;
        }

        /* renamed from: a */
        public ah m37813a() {
            return this.f31222a;
        }
    }

    /* renamed from: com.tinder.etl.event.ah$b */
    public class C11180b extends fw {
        /* renamed from: a */
        final /* synthetic */ ah f36165a;

        /* renamed from: a */
        public String mo10346a() {
            return "Ad.Select";
        }

        public C11180b(ah ahVar, Map<EtlField<?>, Object> map) {
            this.f36165a = ahVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ah$c */
    private final class C11181c implements DescriptorFactory<C11180b, ah> {
        /* renamed from: a */
        final /* synthetic */ ah f36166a;

        private C11181c(ah ahVar) {
            this.f36166a = ahVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44099a((ah) etlEvent);
        }

        /* renamed from: a */
        public final C11180b m44099a(ah ahVar) {
            Map hashMap = new HashMap();
            if (ahVar.f36167a != null) {
                hashMap.put(new C11364j(), ahVar.f36167a);
            }
            if (ahVar.f36168b != null) {
                hashMap.put(new C11413q(), ahVar.f36168b);
            }
            if (ahVar.f36169c != null) {
                hashMap.put(new C11582z(), ahVar.f36169c);
            }
            if (ahVar.f36170d != null) {
                hashMap.put(new ad(), ahVar.f36170d);
            }
            if (ahVar.f36171e != null) {
                hashMap.put(new aj(), ahVar.f36171e);
            }
            if (ahVar.f36172f != null) {
                hashMap.put(new cr(), ahVar.f36172f);
            }
            if (ahVar.f36173g != null) {
                hashMap.put(new eh(), ahVar.f36173g);
            }
            if (ahVar.f36174h != null) {
                hashMap.put(new gx(), ahVar.f36174h);
            }
            if (ahVar.f36175i != null) {
                hashMap.put(new ms(), ahVar.f36175i);
            }
            if (ahVar.f36176j != null) {
                hashMap.put(new sh(), ahVar.f36176j);
            }
            if (ahVar.f36177k != null) {
                hashMap.put(new yo(), ahVar.f36177k);
            }
            if (ahVar.f36178l != null) {
                hashMap.put(new xe(), ahVar.f36178l);
            }
            return new C11180b(this.f36166a, hashMap);
        }
    }

    private ah() {
    }

    /* renamed from: a */
    public static C8974a m44100a() {
        return new C8974a();
    }

    public final DescriptorFactory<C11180b, ah> getDescriptorFactory() {
        return new C11181c();
    }
}
