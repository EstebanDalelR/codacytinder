package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class cb implements EtlEvent {
    /* renamed from: a */
    private Boolean f36272a;
    /* renamed from: b */
    private Number f36273b;
    /* renamed from: c */
    private Number f36274c;
    /* renamed from: d */
    private List f36275d;
    /* renamed from: e */
    private Number f36276e;
    /* renamed from: f */
    private Number f36277f;
    /* renamed from: g */
    private String f36278g;
    /* renamed from: h */
    private Number f36279h;
    /* renamed from: i */
    private Number f36280i;
    /* renamed from: j */
    private String f36281j;
    /* renamed from: k */
    private String f36282k;
    /* renamed from: l */
    private Number f36283l;
    /* renamed from: m */
    private Boolean f36284m;

    /* renamed from: com.tinder.etl.event.cb$a */
    public static class C9002a {
        /* renamed from: a */
        private cb f31236a;

        private C9002a() {
            this.f31236a = new cb();
        }

        /* renamed from: a */
        public final C9002a m37896a(Boolean bool) {
            this.f31236a.f36272a = bool;
            return this;
        }

        /* renamed from: a */
        public final C9002a m37897a(Number number) {
            this.f31236a.f36273b = number;
            return this;
        }

        /* renamed from: b */
        public final C9002a m37902b(Number number) {
            this.f31236a.f36274c = number;
            return this;
        }

        /* renamed from: a */
        public final C9002a m37899a(List list) {
            this.f31236a.f36275d = list;
            return this;
        }

        /* renamed from: c */
        public final C9002a m37904c(Number number) {
            this.f31236a.f36276e = number;
            return this;
        }

        /* renamed from: d */
        public final C9002a m37906d(Number number) {
            this.f31236a.f36277f = number;
            return this;
        }

        /* renamed from: a */
        public final C9002a m37898a(String str) {
            this.f31236a.f36278g = str;
            return this;
        }

        /* renamed from: e */
        public final C9002a m37907e(Number number) {
            this.f31236a.f36279h = number;
            return this;
        }

        /* renamed from: f */
        public final C9002a m37908f(Number number) {
            this.f31236a.f36280i = number;
            return this;
        }

        /* renamed from: b */
        public final C9002a m37903b(String str) {
            this.f31236a.f36281j = str;
            return this;
        }

        /* renamed from: c */
        public final C9002a m37905c(String str) {
            this.f31236a.f36282k = str;
            return this;
        }

        /* renamed from: g */
        public final C9002a m37909g(Number number) {
            this.f31236a.f36283l = number;
            return this;
        }

        /* renamed from: b */
        public final C9002a m37901b(Boolean bool) {
            this.f31236a.f36284m = bool;
            return this;
        }

        /* renamed from: a */
        public cb m37900a() {
            return this.f31236a;
        }
    }

    /* renamed from: com.tinder.etl.event.cb$b */
    public class C11210b extends fw {
        /* renamed from: a */
        final /* synthetic */ cb f36270a;

        /* renamed from: a */
        public String mo10346a() {
            return "BoostPaywall.Select";
        }

        public C11210b(cb cbVar, Map<EtlField<?>, Object> map) {
            this.f36270a = cbVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.cb$c */
    private final class C11211c implements DescriptorFactory<C11210b, cb> {
        /* renamed from: a */
        final /* synthetic */ cb f36271a;

        private C11211c(cb cbVar) {
            this.f36271a = cbVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44290a((cb) etlEvent);
        }

        /* renamed from: a */
        public final C11210b m44290a(cb cbVar) {
            Map hashMap = new HashMap();
            if (cbVar.f36272a != null) {
                hashMap.put(new iz(), cbVar.f36272a);
            }
            if (cbVar.f36273b != null) {
                hashMap.put(new yi(), cbVar.f36273b);
            }
            if (cbVar.f36274c != null) {
                hashMap.put(new cc(), cbVar.f36274c);
            }
            if (cbVar.f36275d != null) {
                hashMap.put(new rm(), cbVar.f36275d);
            }
            if (cbVar.f36276e != null) {
                hashMap.put(new hc(), cbVar.f36276e);
            }
            if (cbVar.f36277f != null) {
                hashMap.put(new cf(), cbVar.f36277f);
            }
            if (cbVar.f36278g != null) {
                hashMap.put(new wr(), cbVar.f36278g);
            }
            if (cbVar.f36279h != null) {
                hashMap.put(new ar(), cbVar.f36279h);
            }
            if (cbVar.f36280i != null) {
                hashMap.put(new rj(), cbVar.f36280i);
            }
            if (cbVar.f36281j != null) {
                hashMap.put(new ej(), cbVar.f36281j);
            }
            if (cbVar.f36282k != null) {
                hashMap.put(new lc(), cbVar.f36282k);
            }
            if (cbVar.f36283l != null) {
                hashMap.put(new bq(), cbVar.f36283l);
            }
            if (cbVar.f36284m != null) {
                hashMap.put(new jx(), cbVar.f36284m);
            }
            return new C11210b(this.f36271a, hashMap);
        }
    }

    private cb() {
    }

    /* renamed from: a */
    public static C9002a m44291a() {
        return new C9002a();
    }

    public final DescriptorFactory<C11210b, cb> getDescriptorFactory() {
        return new C11211c();
    }
}
