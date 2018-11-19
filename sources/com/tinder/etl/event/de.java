package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class de implements EtlEvent {
    /* renamed from: a */
    private String f36414a;
    /* renamed from: b */
    private Boolean f36415b;
    /* renamed from: c */
    private String f36416c;
    /* renamed from: d */
    private String f36417d;
    /* renamed from: e */
    private String f36418e;
    /* renamed from: f */
    private String f36419f;
    /* renamed from: g */
    private Number f36420g;
    /* renamed from: h */
    private Number f36421h;
    /* renamed from: i */
    private Number f36422i;
    /* renamed from: j */
    private Number f36423j;
    /* renamed from: k */
    private String f36424k;
    /* renamed from: l */
    private Boolean f36425l;
    /* renamed from: m */
    private String f36426m;
    /* renamed from: n */
    private String f36427n;

    /* renamed from: com.tinder.etl.event.de$a */
    public static class C9032a {
        /* renamed from: a */
        private de f31251a;

        private C9032a() {
            this.f31251a = new de();
        }

        /* renamed from: a */
        public final C9032a m38020a(String str) {
            this.f31251a.f36414a = str;
            return this;
        }

        /* renamed from: a */
        public final C9032a m38018a(Boolean bool) {
            this.f31251a.f36415b = bool;
            return this;
        }

        /* renamed from: b */
        public final C9032a m38024b(String str) {
            this.f31251a.f36416c = str;
            return this;
        }

        /* renamed from: c */
        public final C9032a m38026c(String str) {
            this.f31251a.f36417d = str;
            return this;
        }

        /* renamed from: d */
        public final C9032a m38028d(String str) {
            this.f31251a.f36418e = str;
            return this;
        }

        /* renamed from: e */
        public final C9032a m38029e(String str) {
            this.f31251a.f36419f = str;
            return this;
        }

        /* renamed from: a */
        public final C9032a m38019a(Number number) {
            this.f31251a.f36420g = number;
            return this;
        }

        /* renamed from: b */
        public final C9032a m38023b(Number number) {
            this.f31251a.f36421h = number;
            return this;
        }

        /* renamed from: c */
        public final C9032a m38025c(Number number) {
            this.f31251a.f36422i = number;
            return this;
        }

        /* renamed from: d */
        public final C9032a m38027d(Number number) {
            this.f31251a.f36423j = number;
            return this;
        }

        /* renamed from: f */
        public final C9032a m38030f(String str) {
            this.f31251a.f36424k = str;
            return this;
        }

        /* renamed from: b */
        public final C9032a m38022b(Boolean bool) {
            this.f31251a.f36425l = bool;
            return this;
        }

        /* renamed from: g */
        public final C9032a m38031g(String str) {
            this.f31251a.f36426m = str;
            return this;
        }

        /* renamed from: h */
        public final C9032a m38032h(String str) {
            this.f31251a.f36427n = str;
            return this;
        }

        /* renamed from: a */
        public de m38021a() {
            return this.f31251a;
        }
    }

    /* renamed from: com.tinder.etl.event.de$b */
    public class C11241b extends fw {
        /* renamed from: a */
        final /* synthetic */ de f36412a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.MediaUnavailable";
        }

        public C11241b(de deVar, Map<EtlField<?>, Object> map) {
            this.f36412a = deVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.de$c */
    private final class C11242c implements DescriptorFactory<C11241b, de> {
        /* renamed from: a */
        final /* synthetic */ de f36413a;

        private C11242c(de deVar) {
            this.f36413a = deVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44554a((de) etlEvent);
        }

        /* renamed from: a */
        public final C11241b m44554a(de deVar) {
            Map hashMap = new HashMap();
            if (deVar.f36414a != null) {
                hashMap.put(new ec(), deVar.f36414a);
            }
            if (deVar.f36415b != null) {
                hashMap.put(new ev(), deVar.f36415b);
            }
            if (deVar.f36416c != null) {
                hashMap.put(new ll(), deVar.f36416c);
            }
            if (deVar.f36417d != null) {
                hashMap.put(new mb(), deVar.f36417d);
            }
            if (deVar.f36418e != null) {
                hashMap.put(new lx(), deVar.f36418e);
            }
            if (deVar.f36419f != null) {
                hashMap.put(new ml(), deVar.f36419f);
            }
            if (deVar.f36420g != null) {
                hashMap.put(new mm(), deVar.f36420g);
            }
            if (deVar.f36421h != null) {
                hashMap.put(new mp(), deVar.f36421h);
            }
            if (deVar.f36422i != null) {
                hashMap.put(new nx(), deVar.f36422i);
            }
            if (deVar.f36423j != null) {
                hashMap.put(new ny(), deVar.f36423j);
            }
            if (deVar.f36424k != null) {
                hashMap.put(new ov(), deVar.f36424k);
            }
            if (deVar.f36425l != null) {
                hashMap.put(new xh(), deVar.f36425l);
            }
            if (deVar.f36426m != null) {
                hashMap.put(new zl(), deVar.f36426m);
            }
            if (deVar.f36427n != null) {
                hashMap.put(new zt(), deVar.f36427n);
            }
            return new C11241b(this.f36413a, hashMap);
        }
    }

    private de() {
    }

    /* renamed from: a */
    public static C9032a m44555a() {
        return new C9032a();
    }

    public final DescriptorFactory<C11241b, de> getDescriptorFactory() {
        return new C11242c();
    }
}
