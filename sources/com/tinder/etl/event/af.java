package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class af implements EtlEvent {
    /* renamed from: a */
    private String f36146a;
    /* renamed from: b */
    private Number f36147b;
    /* renamed from: c */
    private Number f36148c;
    /* renamed from: d */
    private Number f36149d;
    /* renamed from: e */
    private Number f36150e;
    /* renamed from: f */
    private String f36151f;
    /* renamed from: g */
    private String f36152g;
    /* renamed from: h */
    private String f36153h;
    /* renamed from: i */
    private Boolean f36154i;
    /* renamed from: j */
    private String f36155j;

    /* renamed from: com.tinder.etl.event.af$a */
    public static class C8970a {
        /* renamed from: a */
        private af f31220a;

        private C8970a() {
            this.f31220a = new af();
        }

        /* renamed from: a */
        public final C8970a m37797a(String str) {
            this.f31220a.f36146a = str;
            return this;
        }

        /* renamed from: a */
        public final C8970a m37796a(Number number) {
            this.f31220a.f36147b = number;
            return this;
        }

        /* renamed from: b */
        public final C8970a m37799b(Number number) {
            this.f31220a.f36148c = number;
            return this;
        }

        /* renamed from: c */
        public final C8970a m37801c(Number number) {
            this.f31220a.f36149d = number;
            return this;
        }

        /* renamed from: d */
        public final C8970a m37803d(Number number) {
            this.f31220a.f36150e = number;
            return this;
        }

        /* renamed from: b */
        public final C8970a m37800b(String str) {
            this.f31220a.f36151f = str;
            return this;
        }

        /* renamed from: c */
        public final C8970a m37802c(String str) {
            this.f31220a.f36152g = str;
            return this;
        }

        /* renamed from: d */
        public final C8970a m37804d(String str) {
            this.f31220a.f36153h = str;
            return this;
        }

        /* renamed from: a */
        public final C8970a m37795a(Boolean bool) {
            this.f31220a.f36154i = bool;
            return this;
        }

        /* renamed from: e */
        public final C8970a m37805e(String str) {
            this.f31220a.f36155j = str;
            return this;
        }

        /* renamed from: a */
        public af m37798a() {
            return this.f31220a;
        }
    }

    /* renamed from: com.tinder.etl.event.af$b */
    public class C11176b extends fw {
        /* renamed from: a */
        final /* synthetic */ af f36144a;

        /* renamed from: a */
        public String mo10346a() {
            return "Ad.RequestReceive";
        }

        public C11176b(af afVar, Map<EtlField<?>, Object> map) {
            this.f36144a = afVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.af$c */
    private final class C11177c implements DescriptorFactory<C11176b, af> {
        /* renamed from: a */
        final /* synthetic */ af f36145a;

        private C11177c(af afVar) {
            this.f36145a = afVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44063a((af) etlEvent);
        }

        /* renamed from: a */
        public final C11176b m44063a(af afVar) {
            Map hashMap = new HashMap();
            if (afVar.f36146a != null) {
                hashMap.put(new C11402p(), afVar.f36146a);
            }
            if (afVar.f36147b != null) {
                hashMap.put(new C11413q(), afVar.f36147b);
            }
            if (afVar.f36148c != null) {
                hashMap.put(new C11582z(), afVar.f36148c);
            }
            if (afVar.f36149d != null) {
                hashMap.put(new ad(), afVar.f36149d);
            }
            if (afVar.f36150e != null) {
                hashMap.put(new aj(), afVar.f36150e);
            }
            if (afVar.f36151f != null) {
                hashMap.put(new cr(), afVar.f36151f);
            }
            if (afVar.f36152g != null) {
                hashMap.put(new eh(), afVar.f36152g);
            }
            if (afVar.f36153h != null) {
                hashMap.put(new ei(), afVar.f36153h);
            }
            if (afVar.f36154i != null) {
                hashMap.put(new ms(), afVar.f36154i);
            }
            if (afVar.f36155j != null) {
                hashMap.put(new yy(), afVar.f36155j);
            }
            return new C11176b(this.f36145a, hashMap);
        }
    }

    private af() {
    }

    /* renamed from: a */
    public static C8970a m44064a() {
        return new C8970a();
    }

    public final DescriptorFactory<C11176b, af> getDescriptorFactory() {
        return new C11177c();
    }
}
