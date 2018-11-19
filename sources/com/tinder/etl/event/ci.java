package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ci implements EtlEvent {
    /* renamed from: a */
    private Boolean f36306a;
    /* renamed from: b */
    private Number f36307b;
    /* renamed from: c */
    private Number f36308c;
    /* renamed from: d */
    private String f36309d;
    /* renamed from: e */
    private Number f36310e;
    /* renamed from: f */
    private Number f36311f;
    /* renamed from: g */
    private Number f36312g;
    /* renamed from: h */
    private Number f36313h;
    /* renamed from: i */
    private Number f36314i;
    /* renamed from: j */
    private Number f36315j;

    /* renamed from: com.tinder.etl.event.ci$a */
    public static class C9010a {
        /* renamed from: a */
        private ci f31240a;

        private C9010a() {
            this.f31240a = new ci();
        }

        /* renamed from: a */
        public final C9010a m37925a(Boolean bool) {
            this.f31240a.f36306a = bool;
            return this;
        }

        /* renamed from: a */
        public final C9010a m37926a(Number number) {
            this.f31240a.f36307b = number;
            return this;
        }

        /* renamed from: b */
        public final C9010a m37929b(Number number) {
            this.f31240a.f36308c = number;
            return this;
        }

        /* renamed from: a */
        public final C9010a m37927a(String str) {
            this.f31240a.f36309d = str;
            return this;
        }

        /* renamed from: c */
        public final C9010a m37930c(Number number) {
            this.f31240a.f36310e = number;
            return this;
        }

        /* renamed from: d */
        public final C9010a m37931d(Number number) {
            this.f31240a.f36311f = number;
            return this;
        }

        /* renamed from: a */
        public ci m37928a() {
            return this.f31240a;
        }
    }

    /* renamed from: com.tinder.etl.event.ci$b */
    public class C11218b extends fw {
        /* renamed from: a */
        final /* synthetic */ ci f36304a;

        /* renamed from: a */
        public String mo10346a() {
            return "Boost.Start";
        }

        public C11218b(ci ciVar, Map<EtlField<?>, Object> map) {
            this.f36304a = ciVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ci$c */
    private final class C11219c implements DescriptorFactory<C11218b, ci> {
        /* renamed from: a */
        final /* synthetic */ ci f36305a;

        private C11219c(ci ciVar) {
            this.f36305a = ciVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44353a((ci) etlEvent);
        }

        /* renamed from: a */
        public final C11218b m44353a(ci ciVar) {
            Map hashMap = new HashMap();
            if (ciVar.f36306a != null) {
                hashMap.put(new iz(), ciVar.f36306a);
            }
            if (ciVar.f36307b != null) {
                hashMap.put(new bw(), ciVar.f36307b);
            }
            if (ciVar.f36308c != null) {
                hashMap.put(new cf(), ciVar.f36308c);
            }
            if (ciVar.f36309d != null) {
                hashMap.put(new bx(), ciVar.f36309d);
            }
            if (ciVar.f36310e != null) {
                hashMap.put(new by(), ciVar.f36310e);
            }
            if (ciVar.f36311f != null) {
                hashMap.put(new ch(), ciVar.f36311f);
            }
            if (ciVar.f36312g != null) {
                hashMap.put(new kr(), ciVar.f36312g);
            }
            if (ciVar.f36313h != null) {
                hashMap.put(new km(), ciVar.f36313h);
            }
            if (ciVar.f36314i != null) {
                hashMap.put(new kl(), ciVar.f36314i);
            }
            if (ciVar.f36315j != null) {
                hashMap.put(new kv(), ciVar.f36315j);
            }
            return new C11218b(this.f36305a, hashMap);
        }
    }

    private ci() {
    }

    /* renamed from: a */
    public static C9010a m44354a() {
        return new C9010a();
    }

    public final DescriptorFactory<C11218b, ci> getDescriptorFactory() {
        return new C11219c();
    }
}
