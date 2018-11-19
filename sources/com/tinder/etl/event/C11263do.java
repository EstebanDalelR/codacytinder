package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.do */
public final class C11263do implements EtlEvent {
    /* renamed from: A */
    private Number f36552A;
    /* renamed from: a */
    private Boolean f36553a;
    /* renamed from: b */
    private Boolean f36554b;
    /* renamed from: c */
    private Boolean f36555c;
    /* renamed from: d */
    private Boolean f36556d;
    /* renamed from: e */
    private String f36557e;
    /* renamed from: f */
    private String f36558f;
    /* renamed from: g */
    private String f36559g;
    /* renamed from: h */
    private String f36560h;
    /* renamed from: i */
    private Boolean f36561i;
    /* renamed from: j */
    private Boolean f36562j;
    /* renamed from: k */
    private Boolean f36563k;
    /* renamed from: l */
    private String f36564l;
    /* renamed from: m */
    private String f36565m;
    /* renamed from: n */
    private String f36566n;
    /* renamed from: o */
    private String f36567o;
    /* renamed from: p */
    private Number f36568p;
    /* renamed from: q */
    private Number f36569q;
    /* renamed from: r */
    private Number f36570r;
    /* renamed from: s */
    private Number f36571s;
    /* renamed from: t */
    private String f36572t;
    /* renamed from: u */
    private Boolean f36573u;
    /* renamed from: v */
    private String f36574v;
    /* renamed from: w */
    private Boolean f36575w;
    /* renamed from: x */
    private String f36576x;
    /* renamed from: y */
    private String f36577y;
    /* renamed from: z */
    private Boolean f36578z;

    /* renamed from: com.tinder.etl.event.do$a */
    public static class C9052a {
        /* renamed from: a */
        private C11263do f31261a;

        private C9052a() {
            this.f31261a = new C11263do();
        }

        /* renamed from: a */
        public final C9052a m38127a(Boolean bool) {
            this.f31261a.f36553a = bool;
            return this;
        }

        /* renamed from: b */
        public final C9052a m38131b(Boolean bool) {
            this.f31261a.f36554b = bool;
            return this;
        }

        /* renamed from: c */
        public final C9052a m38134c(Boolean bool) {
            this.f31261a.f36555c = bool;
            return this;
        }

        /* renamed from: d */
        public final C9052a m38137d(Boolean bool) {
            this.f31261a.f36556d = bool;
            return this;
        }

        /* renamed from: a */
        public final C9052a m38129a(String str) {
            this.f31261a.f36557e = str;
            return this;
        }

        /* renamed from: b */
        public final C9052a m38133b(String str) {
            this.f31261a.f36558f = str;
            return this;
        }

        /* renamed from: c */
        public final C9052a m38136c(String str) {
            this.f31261a.f36559g = str;
            return this;
        }

        /* renamed from: e */
        public final C9052a m38140e(Boolean bool) {
            this.f31261a.f36561i = bool;
            return this;
        }

        /* renamed from: d */
        public final C9052a m38139d(String str) {
            this.f31261a.f36564l = str;
            return this;
        }

        /* renamed from: e */
        public final C9052a m38142e(String str) {
            this.f31261a.f36565m = str;
            return this;
        }

        /* renamed from: f */
        public final C9052a m38144f(String str) {
            this.f31261a.f36566n = str;
            return this;
        }

        /* renamed from: g */
        public final C9052a m38146g(String str) {
            this.f31261a.f36567o = str;
            return this;
        }

        /* renamed from: a */
        public final C9052a m38128a(Number number) {
            this.f31261a.f36568p = number;
            return this;
        }

        /* renamed from: b */
        public final C9052a m38132b(Number number) {
            this.f31261a.f36569q = number;
            return this;
        }

        /* renamed from: c */
        public final C9052a m38135c(Number number) {
            this.f31261a.f36570r = number;
            return this;
        }

        /* renamed from: d */
        public final C9052a m38138d(Number number) {
            this.f31261a.f36571s = number;
            return this;
        }

        /* renamed from: h */
        public final C9052a m38147h(String str) {
            this.f31261a.f36572t = str;
            return this;
        }

        /* renamed from: i */
        public final C9052a m38148i(String str) {
            this.f31261a.f36574v = str;
            return this;
        }

        /* renamed from: f */
        public final C9052a m38143f(Boolean bool) {
            this.f31261a.f36575w = bool;
            return this;
        }

        /* renamed from: j */
        public final C9052a m38149j(String str) {
            this.f31261a.f36576x = str;
            return this;
        }

        /* renamed from: g */
        public final C9052a m38145g(Boolean bool) {
            this.f31261a.f36578z = bool;
            return this;
        }

        /* renamed from: e */
        public final C9052a m38141e(Number number) {
            this.f31261a.f36552A = number;
            return this;
        }

        /* renamed from: a */
        public C11263do m38130a() {
            return this.f31261a;
        }
    }

    /* renamed from: com.tinder.etl.event.do$b */
    public class C11261b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11263do f36550a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.SendMessage";
        }

        public C11261b(C11263do c11263do, Map<EtlField<?>, Object> map) {
            this.f36550a = c11263do;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.do$c */
    private final class C11262c implements DescriptorFactory<C11261b, C11263do> {
        /* renamed from: a */
        final /* synthetic */ C11263do f36551a;

        private C11262c(C11263do c11263do) {
            this.f36551a = c11263do;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44801a((C11263do) etlEvent);
        }

        /* renamed from: a */
        public final C11261b m44801a(C11263do c11263do) {
            Map hashMap = new HashMap();
            if (c11263do.f36553a != null) {
                hashMap.put(new dy(), c11263do.f36553a);
            }
            if (c11263do.f36554b != null) {
                hashMap.put(new dz(), c11263do.f36554b);
            }
            if (c11263do.f36555c != null) {
                hashMap.put(new ea(), c11263do.f36555c);
            }
            if (c11263do.f36556d != null) {
                hashMap.put(new eb(), c11263do.f36556d);
            }
            if (c11263do.f36557e != null) {
                hashMap.put(new ec(), c11263do.f36557e);
            }
            if (c11263do.f36558f != null) {
                hashMap.put(new ed(), c11263do.f36558f);
            }
            if (c11263do.f36559g != null) {
                hashMap.put(new ee(), c11263do.f36559g);
            }
            if (c11263do.f36560h != null) {
                hashMap.put(new eq(), c11263do.f36560h);
            }
            if (c11263do.f36561i != null) {
                hashMap.put(new ev(), c11263do.f36561i);
            }
            if (c11263do.f36562j != null) {
                hashMap.put(new gv(), c11263do.f36562j);
            }
            if (c11263do.f36563k != null) {
                hashMap.put(new hi(), c11263do.f36563k);
            }
            if (c11263do.f36564l != null) {
                hashMap.put(new kb(), c11263do.f36564l);
            }
            if (c11263do.f36565m != null) {
                hashMap.put(new ll(), c11263do.f36565m);
            }
            if (c11263do.f36566n != null) {
                hashMap.put(new lx(), c11263do.f36566n);
            }
            if (c11263do.f36567o != null) {
                hashMap.put(new ml(), c11263do.f36567o);
            }
            if (c11263do.f36568p != null) {
                hashMap.put(new mm(), c11263do.f36568p);
            }
            if (c11263do.f36569q != null) {
                hashMap.put(new mp(), c11263do.f36569q);
            }
            if (c11263do.f36570r != null) {
                hashMap.put(new nx(), c11263do.f36570r);
            }
            if (c11263do.f36571s != null) {
                hashMap.put(new ny(), c11263do.f36571s);
            }
            if (c11263do.f36572t != null) {
                hashMap.put(new ov(), c11263do.f36572t);
            }
            if (c11263do.f36573u != null) {
                hashMap.put(new ox(), c11263do.f36573u);
            }
            if (c11263do.f36574v != null) {
                hashMap.put(new qb(), c11263do.f36574v);
            }
            if (c11263do.f36575w != null) {
                hashMap.put(new vc(), c11263do.f36575w);
            }
            if (c11263do.f36576x != null) {
                hashMap.put(new vn(), c11263do.f36576x);
            }
            if (c11263do.f36577y != null) {
                hashMap.put(new wo(), c11263do.f36577y);
            }
            if (c11263do.f36578z != null) {
                hashMap.put(new xh(), c11263do.f36578z);
            }
            if (c11263do.f36552A != null) {
                hashMap.put(new yk(), c11263do.f36552A);
            }
            return new C11261b(this.f36551a, hashMap);
        }
    }

    private C11263do() {
    }

    /* renamed from: a */
    public static C9052a m44803a() {
        return new C9052a();
    }

    public final DescriptorFactory<C11261b, C11263do> getDescriptorFactory() {
        return new C11262c();
    }
}
