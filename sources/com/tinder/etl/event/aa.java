package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class aa implements EtlEvent {
    /* renamed from: a */
    private Number f36094a;
    /* renamed from: b */
    private Number f36095b;
    /* renamed from: c */
    private String f36096c;
    /* renamed from: d */
    private Number f36097d;
    /* renamed from: e */
    private Number f36098e;
    /* renamed from: f */
    private Number f36099f;
    /* renamed from: g */
    private String f36100g;
    /* renamed from: h */
    private String f36101h;
    /* renamed from: i */
    private Boolean f36102i;
    /* renamed from: j */
    private String f36103j;

    /* renamed from: com.tinder.etl.event.aa$a */
    public static class C8954a {
        /* renamed from: a */
        private aa f31212a;

        private C8954a() {
            this.f31212a = new aa();
        }

        /* renamed from: a */
        public final C8954a m37756a(Number number) {
            this.f31212a.f36094a = number;
            return this;
        }

        /* renamed from: b */
        public final C8954a m37759b(Number number) {
            this.f31212a.f36095b = number;
            return this;
        }

        /* renamed from: a */
        public final C8954a m37757a(String str) {
            this.f31212a.f36096c = str;
            return this;
        }

        /* renamed from: c */
        public final C8954a m37761c(Number number) {
            this.f31212a.f36097d = number;
            return this;
        }

        /* renamed from: d */
        public final C8954a m37763d(Number number) {
            this.f31212a.f36098e = number;
            return this;
        }

        /* renamed from: b */
        public final C8954a m37760b(String str) {
            this.f31212a.f36100g = str;
            return this;
        }

        /* renamed from: c */
        public final C8954a m37762c(String str) {
            this.f31212a.f36101h = str;
            return this;
        }

        /* renamed from: a */
        public final C8954a m37755a(Boolean bool) {
            this.f31212a.f36102i = bool;
            return this;
        }

        /* renamed from: a */
        public aa m37758a() {
            return this.f31212a;
        }
    }

    /* renamed from: com.tinder.etl.event.aa$b */
    public class C11160b extends fw {
        /* renamed from: a */
        final /* synthetic */ aa f36092a;

        /* renamed from: a */
        public String mo10346a() {
            return "Ad.Open";
        }

        public C11160b(aa aaVar, Map<EtlField<?>, Object> map) {
            this.f36092a = aaVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.aa$c */
    private final class C11161c implements DescriptorFactory<C11160b, aa> {
        /* renamed from: a */
        final /* synthetic */ aa f36093a;

        private C11161c(aa aaVar) {
            this.f36093a = aaVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m43971a((aa) etlEvent);
        }

        /* renamed from: a */
        public final C11160b m43971a(aa aaVar) {
            Map hashMap = new HashMap();
            if (aaVar.f36094a != null) {
                hashMap.put(new C11413q(), aaVar.f36094a);
            }
            if (aaVar.f36095b != null) {
                hashMap.put(new C11582z(), aaVar.f36095b);
            }
            if (aaVar.f36096c != null) {
                hashMap.put(new ab(), aaVar.f36096c);
            }
            if (aaVar.f36097d != null) {
                hashMap.put(new ad(), aaVar.f36097d);
            }
            if (aaVar.f36098e != null) {
                hashMap.put(new aj(), aaVar.f36098e);
            }
            if (aaVar.f36099f != null) {
                hashMap.put(new bb(), aaVar.f36099f);
            }
            if (aaVar.f36100g != null) {
                hashMap.put(new cr(), aaVar.f36100g);
            }
            if (aaVar.f36101h != null) {
                hashMap.put(new eh(), aaVar.f36101h);
            }
            if (aaVar.f36102i != null) {
                hashMap.put(new ms(), aaVar.f36102i);
            }
            if (aaVar.f36103j != null) {
                hashMap.put(new xe(), aaVar.f36103j);
            }
            return new C11160b(this.f36093a, hashMap);
        }
    }

    private aa() {
    }

    /* renamed from: a */
    public static C8954a m43972a() {
        return new C8954a();
    }

    public final DescriptorFactory<C11160b, aa> getDescriptorFactory() {
        return new C11161c();
    }
}
