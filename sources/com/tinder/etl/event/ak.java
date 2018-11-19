package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ak implements EtlEvent {
    /* renamed from: a */
    private Number f36193a;
    /* renamed from: b */
    private Number f36194b;
    /* renamed from: c */
    private Number f36195c;
    /* renamed from: d */
    private Number f36196d;
    /* renamed from: e */
    private Number f36197e;
    /* renamed from: f */
    private String f36198f;
    /* renamed from: g */
    private String f36199g;
    /* renamed from: h */
    private String f36200h;
    /* renamed from: i */
    private Boolean f36201i;
    /* renamed from: j */
    private String f36202j;

    /* renamed from: com.tinder.etl.event.ak$a */
    public static class C8978a {
        /* renamed from: a */
        private ak f31224a;

        private C8978a() {
            this.f31224a = new ak();
        }

        /* renamed from: a */
        public final C8978a m37832a(Number number) {
            this.f31224a.f36193a = number;
            return this;
        }

        /* renamed from: b */
        public final C8978a m37835b(Number number) {
            this.f31224a.f36194b = number;
            return this;
        }

        /* renamed from: c */
        public final C8978a m37837c(Number number) {
            this.f31224a.f36195c = number;
            return this;
        }

        /* renamed from: d */
        public final C8978a m37839d(Number number) {
            this.f31224a.f36196d = number;
            return this;
        }

        /* renamed from: e */
        public final C8978a m37840e(Number number) {
            this.f31224a.f36197e = number;
            return this;
        }

        /* renamed from: a */
        public final C8978a m37833a(String str) {
            this.f31224a.f36198f = str;
            return this;
        }

        /* renamed from: b */
        public final C8978a m37836b(String str) {
            this.f31224a.f36199g = str;
            return this;
        }

        /* renamed from: c */
        public final C8978a m37838c(String str) {
            this.f31224a.f36200h = str;
            return this;
        }

        /* renamed from: a */
        public final C8978a m37831a(Boolean bool) {
            this.f31224a.f36201i = bool;
            return this;
        }

        /* renamed from: a */
        public ak m37834a() {
            return this.f31224a;
        }
    }

    /* renamed from: com.tinder.etl.event.ak$b */
    public class C11184b extends fw {
        /* renamed from: a */
        final /* synthetic */ ak f36191a;

        /* renamed from: a */
        public String mo10346a() {
            return "Ad.View";
        }

        public C11184b(ak akVar, Map<EtlField<?>, Object> map) {
            this.f36191a = akVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ak$c */
    private final class C11185c implements DescriptorFactory<C11184b, ak> {
        /* renamed from: a */
        final /* synthetic */ ak f36192a;

        private C11185c(ak akVar) {
            this.f36192a = akVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44146a((ak) etlEvent);
        }

        /* renamed from: a */
        public final C11184b m44146a(ak akVar) {
            Map hashMap = new HashMap();
            if (akVar.f36193a != null) {
                hashMap.put(new C11413q(), akVar.f36193a);
            }
            if (akVar.f36194b != null) {
                hashMap.put(new C11582z(), akVar.f36194b);
            }
            if (akVar.f36195c != null) {
                hashMap.put(new ad(), akVar.f36195c);
            }
            if (akVar.f36196d != null) {
                hashMap.put(new aj(), akVar.f36196d);
            }
            if (akVar.f36197e != null) {
                hashMap.put(new bb(), akVar.f36197e);
            }
            if (akVar.f36198f != null) {
                hashMap.put(new cr(), akVar.f36198f);
            }
            if (akVar.f36199g != null) {
                hashMap.put(new eh(), akVar.f36199g);
            }
            if (akVar.f36200h != null) {
                hashMap.put(new gx(), akVar.f36200h);
            }
            if (akVar.f36201i != null) {
                hashMap.put(new ms(), akVar.f36201i);
            }
            if (akVar.f36202j != null) {
                hashMap.put(new xe(), akVar.f36202j);
            }
            return new C11184b(this.f36192a, hashMap);
        }
    }

    private ak() {
    }

    /* renamed from: a */
    public static C8978a m44147a() {
        return new C8978a();
    }

    public final DescriptorFactory<C11184b, ak> getDescriptorFactory() {
        return new C11185c();
    }
}
