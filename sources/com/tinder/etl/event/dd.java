package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class dd implements EtlEvent {
    /* renamed from: a */
    private String f36400a;
    /* renamed from: b */
    private String f36401b;
    /* renamed from: c */
    private String f36402c;
    /* renamed from: d */
    private String f36403d;
    /* renamed from: e */
    private String f36404e;
    /* renamed from: f */
    private String f36405f;
    /* renamed from: g */
    private String f36406g;
    /* renamed from: h */
    private Number f36407h;
    /* renamed from: i */
    private Number f36408i;
    /* renamed from: j */
    private Number f36409j;
    /* renamed from: k */
    private Number f36410k;
    /* renamed from: l */
    private String f36411l;

    /* renamed from: com.tinder.etl.event.dd$a */
    public static class C9030a {
        /* renamed from: a */
        private dd f31250a;

        private C9030a() {
            this.f31250a = new dd();
        }

        /* renamed from: a */
        public final C9030a m38006a(String str) {
            this.f31250a.f36400a = str;
            return this;
        }

        /* renamed from: b */
        public final C9030a m38009b(String str) {
            this.f31250a.f36401b = str;
            return this;
        }

        /* renamed from: c */
        public final C9030a m38011c(String str) {
            this.f31250a.f36402c = str;
            return this;
        }

        /* renamed from: d */
        public final C9030a m38013d(String str) {
            this.f31250a.f36403d = str;
            return this;
        }

        /* renamed from: e */
        public final C9030a m38014e(String str) {
            this.f31250a.f36404e = str;
            return this;
        }

        /* renamed from: f */
        public final C9030a m38015f(String str) {
            this.f31250a.f36405f = str;
            return this;
        }

        /* renamed from: g */
        public final C9030a m38016g(String str) {
            this.f31250a.f36406g = str;
            return this;
        }

        /* renamed from: a */
        public final C9030a m38005a(Number number) {
            this.f31250a.f36407h = number;
            return this;
        }

        /* renamed from: b */
        public final C9030a m38008b(Number number) {
            this.f31250a.f36408i = number;
            return this;
        }

        /* renamed from: c */
        public final C9030a m38010c(Number number) {
            this.f31250a.f36409j = number;
            return this;
        }

        /* renamed from: d */
        public final C9030a m38012d(Number number) {
            this.f31250a.f36410k = number;
            return this;
        }

        /* renamed from: h */
        public final C9030a m38017h(String str) {
            this.f31250a.f36411l = str;
            return this;
        }

        /* renamed from: a */
        public dd m38007a() {
            return this.f31250a;
        }
    }

    /* renamed from: com.tinder.etl.event.dd$b */
    public class C11239b extends fw {
        /* renamed from: a */
        final /* synthetic */ dd f36398a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.LongPressOption";
        }

        public C11239b(dd ddVar, Map<EtlField<?>, Object> map) {
            this.f36398a = ddVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.dd$c */
    private final class C11240c implements DescriptorFactory<C11239b, dd> {
        /* renamed from: a */
        final /* synthetic */ dd f36399a;

        private C11240c(dd ddVar) {
            this.f36399a = ddVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44527a((dd) etlEvent);
        }

        /* renamed from: a */
        public final C11239b m44527a(dd ddVar) {
            Map hashMap = new HashMap();
            if (ddVar.f36400a != null) {
                hashMap.put(new cq(), ddVar.f36400a);
            }
            if (ddVar.f36401b != null) {
                hashMap.put(new ec(), ddVar.f36401b);
            }
            if (ddVar.f36402c != null) {
                hashMap.put(new ed(), ddVar.f36402c);
            }
            if (ddVar.f36403d != null) {
                hashMap.put(new ee(), ddVar.f36403d);
            }
            if (ddVar.f36404e != null) {
                hashMap.put(new ll(), ddVar.f36404e);
            }
            if (ddVar.f36405f != null) {
                hashMap.put(new lx(), ddVar.f36405f);
            }
            if (ddVar.f36406g != null) {
                hashMap.put(new ml(), ddVar.f36406g);
            }
            if (ddVar.f36407h != null) {
                hashMap.put(new mm(), ddVar.f36407h);
            }
            if (ddVar.f36408i != null) {
                hashMap.put(new mp(), ddVar.f36408i);
            }
            if (ddVar.f36409j != null) {
                hashMap.put(new nx(), ddVar.f36409j);
            }
            if (ddVar.f36410k != null) {
                hashMap.put(new ny(), ddVar.f36410k);
            }
            if (ddVar.f36411l != null) {
                hashMap.put(new ov(), ddVar.f36411l);
            }
            return new C11239b(this.f36399a, hashMap);
        }
    }

    private dd() {
    }

    /* renamed from: a */
    public static C9030a m44528a() {
        return new C9030a();
    }

    public final DescriptorFactory<C11239b, dd> getDescriptorFactory() {
        return new C11240c();
    }
}
