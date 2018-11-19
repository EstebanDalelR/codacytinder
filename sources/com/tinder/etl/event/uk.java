package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class uk implements EtlEvent {
    /* renamed from: a */
    private Number f37561a;
    /* renamed from: b */
    private String f37562b;
    /* renamed from: c */
    private Number f37563c;
    /* renamed from: d */
    private Number f37564d;
    /* renamed from: e */
    private Number f37565e;
    /* renamed from: f */
    private Number f37566f;
    /* renamed from: g */
    private Number f37567g;
    /* renamed from: h */
    private Number f37568h;
    /* renamed from: i */
    private String f37569i;
    /* renamed from: j */
    private String f37570j;

    /* renamed from: com.tinder.etl.event.uk$a */
    public static class C9294a {
        /* renamed from: a */
        private uk f31383a;

        private C9294a() {
            this.f31383a = new uk();
        }

        /* renamed from: a */
        public final C9294a m38855a(Number number) {
            this.f31383a.f37561a = number;
            return this;
        }

        /* renamed from: a */
        public final C9294a m38856a(String str) {
            this.f31383a.f37562b = str;
            return this;
        }

        /* renamed from: b */
        public final C9294a m38858b(Number number) {
            this.f31383a.f37563c = number;
            return this;
        }

        /* renamed from: c */
        public final C9294a m38860c(Number number) {
            this.f31383a.f37564d = number;
            return this;
        }

        /* renamed from: d */
        public final C9294a m38862d(Number number) {
            this.f31383a.f37565e = number;
            return this;
        }

        /* renamed from: e */
        public final C9294a m38863e(Number number) {
            this.f31383a.f37566f = number;
            return this;
        }

        /* renamed from: f */
        public final C9294a m38864f(Number number) {
            this.f31383a.f37567g = number;
            return this;
        }

        /* renamed from: g */
        public final C9294a m38865g(Number number) {
            this.f31383a.f37568h = number;
            return this;
        }

        /* renamed from: b */
        public final C9294a m38859b(String str) {
            this.f31383a.f37569i = str;
            return this;
        }

        /* renamed from: c */
        public final C9294a m38861c(String str) {
            this.f31383a.f37570j = str;
            return this;
        }

        /* renamed from: a */
        public uk m38857a() {
            return this.f31383a;
        }
    }

    /* renamed from: com.tinder.etl.event.uk$b */
    public class C11522b extends fw {
        /* renamed from: a */
        final /* synthetic */ uk f37559a;

        /* renamed from: a */
        public String mo10346a() {
            return "Recs.Session";
        }

        public C11522b(uk ukVar, Map<EtlField<?>, Object> map) {
            this.f37559a = ukVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.uk$c */
    private final class C11523c implements DescriptorFactory<C11522b, uk> {
        /* renamed from: a */
        final /* synthetic */ uk f37560a;

        private C11523c(uk ukVar) {
            this.f37560a = ukVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46536a((uk) etlEvent);
        }

        /* renamed from: a */
        public final C11522b m46536a(uk ukVar) {
            Map hashMap = new HashMap();
            if (ukVar.f37561a != null) {
                hashMap.put(new fk(), ukVar.f37561a);
            }
            if (ukVar.f37562b != null) {
                hashMap.put(new uj(), ukVar.f37562b);
            }
            if (ukVar.f37563c != null) {
                hashMap.put(new ul(), ukVar.f37563c);
            }
            if (ukVar.f37564d != null) {
                hashMap.put(new um(), ukVar.f37564d);
            }
            if (ukVar.f37565e != null) {
                hashMap.put(new un(), ukVar.f37565e);
            }
            if (ukVar.f37566f != null) {
                hashMap.put(new uo(), ukVar.f37566f);
            }
            if (ukVar.f37567g != null) {
                hashMap.put(new uq(), ukVar.f37567g);
            }
            if (ukVar.f37568h != null) {
                hashMap.put(new up(), ukVar.f37568h);
            }
            if (ukVar.f37569i != null) {
                hashMap.put(new ur(), ukVar.f37569i);
            }
            if (ukVar.f37570j != null) {
                hashMap.put(new us(), ukVar.f37570j);
            }
            return new C11522b(this.f37560a, hashMap);
        }
    }

    private uk() {
    }

    /* renamed from: a */
    public static C9294a m46537a() {
        return new C9294a();
    }

    public final DescriptorFactory<C11522b, uk> getDescriptorFactory() {
        return new C11523c();
    }
}
