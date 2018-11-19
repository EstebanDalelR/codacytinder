package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ca implements EtlEvent {
    /* renamed from: a */
    private Boolean f36256a;
    /* renamed from: b */
    private Number f36257b;
    /* renamed from: c */
    private Number f36258c;
    /* renamed from: d */
    private List f36259d;
    /* renamed from: e */
    private Number f36260e;
    /* renamed from: f */
    private Number f36261f;
    /* renamed from: g */
    private String f36262g;
    /* renamed from: h */
    private Number f36263h;
    /* renamed from: i */
    private Number f36264i;
    /* renamed from: j */
    private String f36265j;
    /* renamed from: k */
    private String f36266k;
    /* renamed from: l */
    private Number f36267l;
    /* renamed from: m */
    private Boolean f36268m;
    /* renamed from: n */
    private Number f36269n;

    /* renamed from: com.tinder.etl.event.ca$a */
    public static class C9000a {
        /* renamed from: a */
        private ca f31235a;

        private C9000a() {
            this.f31235a = new ca();
        }

        /* renamed from: a */
        public final C9000a m37881a(Boolean bool) {
            this.f31235a.f36256a = bool;
            return this;
        }

        /* renamed from: a */
        public final C9000a m37882a(Number number) {
            this.f31235a.f36257b = number;
            return this;
        }

        /* renamed from: b */
        public final C9000a m37887b(Number number) {
            this.f31235a.f36258c = number;
            return this;
        }

        /* renamed from: a */
        public final C9000a m37884a(List list) {
            this.f31235a.f36259d = list;
            return this;
        }

        /* renamed from: c */
        public final C9000a m37889c(Number number) {
            this.f31235a.f36260e = number;
            return this;
        }

        /* renamed from: d */
        public final C9000a m37891d(Number number) {
            this.f31235a.f36261f = number;
            return this;
        }

        /* renamed from: a */
        public final C9000a m37883a(String str) {
            this.f31235a.f36262g = str;
            return this;
        }

        /* renamed from: e */
        public final C9000a m37892e(Number number) {
            this.f31235a.f36263h = number;
            return this;
        }

        /* renamed from: f */
        public final C9000a m37893f(Number number) {
            this.f31235a.f36264i = number;
            return this;
        }

        /* renamed from: b */
        public final C9000a m37888b(String str) {
            this.f31235a.f36265j = str;
            return this;
        }

        /* renamed from: c */
        public final C9000a m37890c(String str) {
            this.f31235a.f36266k = str;
            return this;
        }

        /* renamed from: g */
        public final C9000a m37894g(Number number) {
            this.f31235a.f36267l = number;
            return this;
        }

        /* renamed from: b */
        public final C9000a m37886b(Boolean bool) {
            this.f31235a.f36268m = bool;
            return this;
        }

        /* renamed from: h */
        public final C9000a m37895h(Number number) {
            this.f31235a.f36269n = number;
            return this;
        }

        /* renamed from: a */
        public ca m37885a() {
            return this.f31235a;
        }
    }

    /* renamed from: com.tinder.etl.event.ca$b */
    public class C11208b extends fw {
        /* renamed from: a */
        final /* synthetic */ ca f36254a;

        /* renamed from: a */
        public String mo10346a() {
            return "BoostPaywall.Purchase";
        }

        public C11208b(ca caVar, Map<EtlField<?>, Object> map) {
            this.f36254a = caVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ca$c */
    private final class C11209c implements DescriptorFactory<C11208b, ca> {
        /* renamed from: a */
        final /* synthetic */ ca f36255a;

        private C11209c(ca caVar) {
            this.f36255a = caVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44259a((ca) etlEvent);
        }

        /* renamed from: a */
        public final C11208b m44259a(ca caVar) {
            Map hashMap = new HashMap();
            if (caVar.f36256a != null) {
                hashMap.put(new iz(), caVar.f36256a);
            }
            if (caVar.f36257b != null) {
                hashMap.put(new yi(), caVar.f36257b);
            }
            if (caVar.f36258c != null) {
                hashMap.put(new cc(), caVar.f36258c);
            }
            if (caVar.f36259d != null) {
                hashMap.put(new rm(), caVar.f36259d);
            }
            if (caVar.f36260e != null) {
                hashMap.put(new hc(), caVar.f36260e);
            }
            if (caVar.f36261f != null) {
                hashMap.put(new cf(), caVar.f36261f);
            }
            if (caVar.f36262g != null) {
                hashMap.put(new wr(), caVar.f36262g);
            }
            if (caVar.f36263h != null) {
                hashMap.put(new ar(), caVar.f36263h);
            }
            if (caVar.f36264i != null) {
                hashMap.put(new rj(), caVar.f36264i);
            }
            if (caVar.f36265j != null) {
                hashMap.put(new ej(), caVar.f36265j);
            }
            if (caVar.f36266k != null) {
                hashMap.put(new lc(), caVar.f36266k);
            }
            if (caVar.f36267l != null) {
                hashMap.put(new bq(), caVar.f36267l);
            }
            if (caVar.f36268m != null) {
                hashMap.put(new jx(), caVar.f36268m);
            }
            if (caVar.f36269n != null) {
                hashMap.put(new sk(), caVar.f36269n);
            }
            return new C11208b(this.f36255a, hashMap);
        }
    }

    private ca() {
    }

    /* renamed from: a */
    public static C9000a m44260a() {
        return new C9000a();
    }

    public final DescriptorFactory<C11208b, ca> getDescriptorFactory() {
        return new C11209c();
    }
}
