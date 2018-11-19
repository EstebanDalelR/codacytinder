package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class gt implements EtlEvent {
    /* renamed from: a */
    private Number f36781a;
    /* renamed from: b */
    private String f36782b;
    /* renamed from: c */
    private String f36783c;
    /* renamed from: d */
    private String f36784d;
    /* renamed from: e */
    private String f36785e;
    /* renamed from: f */
    private String f36786f;
    /* renamed from: g */
    private String f36787g;
    /* renamed from: h */
    private String f36788h;
    /* renamed from: i */
    private String f36789i;
    /* renamed from: j */
    private String f36790j;
    /* renamed from: k */
    private String f36791k;

    /* renamed from: com.tinder.etl.event.gt$a */
    public static class C9100a {
        /* renamed from: a */
        private gt f31286a;

        private C9100a() {
            this.f31286a = new gt();
        }

        /* renamed from: a */
        public final C9100a m38317a(Number number) {
            this.f31286a.f36781a = number;
            return this;
        }

        /* renamed from: a */
        public final C9100a m38318a(String str) {
            this.f31286a.f36782b = str;
            return this;
        }

        /* renamed from: b */
        public final C9100a m38320b(String str) {
            this.f31286a.f36783c = str;
            return this;
        }

        /* renamed from: c */
        public final C9100a m38321c(String str) {
            this.f31286a.f36784d = str;
            return this;
        }

        /* renamed from: d */
        public final C9100a m38322d(String str) {
            this.f31286a.f36785e = str;
            return this;
        }

        /* renamed from: e */
        public final C9100a m38323e(String str) {
            this.f31286a.f36786f = str;
            return this;
        }

        /* renamed from: f */
        public final C9100a m38324f(String str) {
            this.f31286a.f36787g = str;
            return this;
        }

        /* renamed from: g */
        public final C9100a m38325g(String str) {
            this.f31286a.f36788h = str;
            return this;
        }

        /* renamed from: h */
        public final C9100a m38326h(String str) {
            this.f31286a.f36789i = str;
            return this;
        }

        /* renamed from: i */
        public final C9100a m38327i(String str) {
            this.f31286a.f36790j = str;
            return this;
        }

        /* renamed from: a */
        public gt m38319a() {
            return this.f31286a;
        }
    }

    /* renamed from: com.tinder.etl.event.gt$b */
    public class C11313b extends fw {
        /* renamed from: a */
        final /* synthetic */ gt f36779a;

        /* renamed from: a */
        public String mo10346a() {
            return "Feedback.User";
        }

        public C11313b(gt gtVar, Map<EtlField<?>, Object> map) {
            this.f36779a = gtVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.gt$c */
    private final class C11314c implements DescriptorFactory<C11313b, gt> {
        /* renamed from: a */
        final /* synthetic */ gt f36780a;

        private C11314c(gt gtVar) {
            this.f36780a = gtVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45218a((gt) etlEvent);
        }

        /* renamed from: a */
        public final C11313b m45218a(gt gtVar) {
            Map hashMap = new HashMap();
            if (gtVar.f36781a != null) {
                hashMap.put(new bc(), gtVar.f36781a);
            }
            if (gtVar.f36782b != null) {
                hashMap.put(new ec(), gtVar.f36782b);
            }
            if (gtVar.f36783c != null) {
                hashMap.put(new go(), gtVar.f36783c);
            }
            if (gtVar.f36784d != null) {
                hashMap.put(new gs(), gtVar.f36784d);
            }
            if (gtVar.f36785e != null) {
                hashMap.put(new ll(), gtVar.f36785e);
            }
            if (gtVar.f36786f != null) {
                hashMap.put(new lx(), gtVar.f36786f);
            }
            if (gtVar.f36787g != null) {
                hashMap.put(new ov(), gtVar.f36787g);
            }
            if (gtVar.f36788h != null) {
                hashMap.put(new tg(), gtVar.f36788h);
            }
            if (gtVar.f36789i != null) {
                hashMap.put(new ti(), gtVar.f36789i);
            }
            if (gtVar.f36790j != null) {
                hashMap.put(new wy(), gtVar.f36790j);
            }
            if (gtVar.f36791k != null) {
                hashMap.put(new wx(), gtVar.f36791k);
            }
            return new C11313b(this.f36780a, hashMap);
        }
    }

    private gt() {
    }

    /* renamed from: a */
    public static C9100a m45219a() {
        return new C9100a();
    }

    public final DescriptorFactory<C11313b, gt> getDescriptorFactory() {
        return new C11314c();
    }
}
