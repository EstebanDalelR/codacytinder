package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class da implements EtlEvent {
    /* renamed from: a */
    private Number f36362a;
    /* renamed from: b */
    private Boolean f36363b;
    /* renamed from: c */
    private Boolean f36364c;
    /* renamed from: d */
    private String f36365d;
    /* renamed from: e */
    private String f36366e;
    /* renamed from: f */
    private String f36367f;
    /* renamed from: g */
    private Number f36368g;
    /* renamed from: h */
    private Number f36369h;
    /* renamed from: i */
    private String f36370i;
    /* renamed from: j */
    private Boolean f36371j;

    /* renamed from: com.tinder.etl.event.da$a */
    public static class C9024a {
        /* renamed from: a */
        private da f31247a;

        private C9024a() {
            this.f31247a = new da();
        }

        /* renamed from: a */
        public final C9024a m37971a(Number number) {
            this.f31247a.f36362a = number;
            return this;
        }

        /* renamed from: a */
        public final C9024a m37970a(Boolean bool) {
            this.f31247a.f36363b = bool;
            return this;
        }

        /* renamed from: b */
        public final C9024a m37974b(Boolean bool) {
            this.f31247a.f36364c = bool;
            return this;
        }

        /* renamed from: a */
        public final C9024a m37972a(String str) {
            this.f31247a.f36365d = str;
            return this;
        }

        /* renamed from: b */
        public final C9024a m37976b(String str) {
            this.f31247a.f36366e = str;
            return this;
        }

        /* renamed from: c */
        public final C9024a m37979c(String str) {
            this.f31247a.f36367f = str;
            return this;
        }

        /* renamed from: b */
        public final C9024a m37975b(Number number) {
            this.f31247a.f36368g = number;
            return this;
        }

        /* renamed from: c */
        public final C9024a m37978c(Number number) {
            this.f31247a.f36369h = number;
            return this;
        }

        /* renamed from: d */
        public final C9024a m37980d(String str) {
            this.f31247a.f36370i = str;
            return this;
        }

        /* renamed from: c */
        public final C9024a m37977c(Boolean bool) {
            this.f31247a.f36371j = bool;
            return this;
        }

        /* renamed from: a */
        public da m37973a() {
            return this.f31247a;
        }
    }

    /* renamed from: com.tinder.etl.event.da$b */
    public class C11233b extends fw {
        /* renamed from: a */
        final /* synthetic */ da f36360a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.End";
        }

        public C11233b(da daVar, Map<EtlField<?>, Object> map) {
            this.f36360a = daVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.da$c */
    private final class C11234c implements DescriptorFactory<C11233b, da> {
        /* renamed from: a */
        final /* synthetic */ da f36361a;

        private C11234c(da daVar) {
            this.f36361a = daVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44454a((da) etlEvent);
        }

        /* renamed from: a */
        public final C11233b m44454a(da daVar) {
            Map hashMap = new HashMap();
            if (daVar.f36362a != null) {
                hashMap.put(new cz(), daVar.f36362a);
            }
            if (daVar.f36363b != null) {
                hashMap.put(new ev(), daVar.f36363b);
            }
            if (daVar.f36364c != null) {
                hashMap.put(new ja(), daVar.f36364c);
            }
            if (daVar.f36365d != null) {
                hashMap.put(new kb(), daVar.f36365d);
            }
            if (daVar.f36366e != null) {
                hashMap.put(new ll(), daVar.f36366e);
            }
            if (daVar.f36367f != null) {
                hashMap.put(new lx(), daVar.f36367f);
            }
            if (daVar.f36368g != null) {
                hashMap.put(new ny(), daVar.f36368g);
            }
            if (daVar.f36369h != null) {
                hashMap.put(new nx(), daVar.f36369h);
            }
            if (daVar.f36370i != null) {
                hashMap.put(new ov(), daVar.f36370i);
            }
            if (daVar.f36371j != null) {
                hashMap.put(new xh(), daVar.f36371j);
            }
            return new C11233b(this.f36361a, hashMap);
        }
    }

    private da() {
    }

    /* renamed from: a */
    public static C9024a m44455a() {
        return new C9024a();
    }

    public final DescriptorFactory<C11233b, da> getDescriptorFactory() {
        return new C11234c();
    }
}
