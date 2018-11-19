package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class uf implements EtlEvent {
    /* renamed from: A */
    private String f37448A;
    /* renamed from: B */
    private Boolean f37449B;
    /* renamed from: C */
    private Boolean f37450C;
    /* renamed from: D */
    private Boolean f37451D;
    /* renamed from: E */
    private Boolean f37452E;
    /* renamed from: F */
    private Boolean f37453F;
    /* renamed from: G */
    private Boolean f37454G;
    /* renamed from: a */
    private Number f37455a;
    /* renamed from: b */
    private String f37456b;
    /* renamed from: c */
    private Boolean f37457c;
    /* renamed from: d */
    private Boolean f37458d;
    /* renamed from: e */
    private String f37459e;
    /* renamed from: f */
    private String f37460f;
    /* renamed from: g */
    private Number f37461g;
    /* renamed from: h */
    private Number f37462h;
    /* renamed from: i */
    private Number f37463i;
    /* renamed from: j */
    private String f37464j;
    /* renamed from: k */
    private Number f37465k;
    /* renamed from: l */
    private Number f37466l;
    /* renamed from: m */
    private String f37467m;
    /* renamed from: n */
    private Number f37468n;
    /* renamed from: o */
    private List f37469o;
    /* renamed from: p */
    private Number f37470p;
    /* renamed from: q */
    private Number f37471q;
    /* renamed from: r */
    private String f37472r;
    /* renamed from: s */
    private String f37473s;
    /* renamed from: t */
    private String f37474t;
    /* renamed from: u */
    private String f37475u;
    /* renamed from: v */
    private String f37476v;
    /* renamed from: w */
    private String f37477w;
    /* renamed from: x */
    private String f37478x;
    /* renamed from: y */
    private Number f37479y;
    /* renamed from: z */
    private String f37480z;

    /* renamed from: com.tinder.etl.event.uf$a */
    public static class C9286a {
        /* renamed from: a */
        private uf f31379a;

        private C9286a() {
            this.f31379a = new uf();
        }

        /* renamed from: a */
        public final C9286a m38794a(String str) {
            this.f31379a.f37456b = str;
            return this;
        }

        /* renamed from: a */
        public final C9286a m38792a(Boolean bool) {
            this.f31379a.f37457c = bool;
            return this;
        }

        /* renamed from: b */
        public final C9286a m38797b(String str) {
            this.f31379a.f37459e = str;
            return this;
        }

        /* renamed from: a */
        public final C9286a m38793a(Number number) {
            this.f31379a.f37462h = number;
            return this;
        }

        /* renamed from: c */
        public final C9286a m38798c(String str) {
            this.f31379a.f37464j = str;
            return this;
        }

        /* renamed from: b */
        public final C9286a m38796b(Number number) {
            this.f31379a.f37466l = number;
            return this;
        }

        /* renamed from: d */
        public final C9286a m38799d(String str) {
            this.f31379a.f37467m = str;
            return this;
        }

        /* renamed from: e */
        public final C9286a m38800e(String str) {
            this.f31379a.f37472r = str;
            return this;
        }

        /* renamed from: f */
        public final C9286a m38801f(String str) {
            this.f31379a.f37474t = str;
            return this;
        }

        /* renamed from: a */
        public uf m38795a() {
            return this.f31379a;
        }
    }

    /* renamed from: com.tinder.etl.event.uf$b */
    public class C11514b extends fw {
        /* renamed from: a */
        final /* synthetic */ uf f37446a;

        /* renamed from: a */
        public String mo10346a() {
            return "Recs.ProfileOpen";
        }

        public C11514b(uf ufVar, Map<EtlField<?>, Object> map) {
            this.f37446a = ufVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.uf$c */
    private final class C11515c implements DescriptorFactory<C11514b, uf> {
        /* renamed from: a */
        final /* synthetic */ uf f37447a;

        private C11515c(uf ufVar) {
            this.f37447a = ufVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46360a((uf) etlEvent);
        }

        /* renamed from: a */
        public final C11514b m46360a(uf ufVar) {
            Map hashMap = new HashMap();
            if (ufVar.f37455a != null) {
                hashMap.put(new bu(), ufVar.f37455a);
            }
            if (ufVar.f37456b != null) {
                hashMap.put(new eq(), ufVar.f37456b);
            }
            if (ufVar.f37457c != null) {
                hashMap.put(new ev(), ufVar.f37457c);
            }
            if (ufVar.f37458d != null) {
                hashMap.put(new hj(), ufVar.f37458d);
            }
            if (ufVar.f37459e != null) {
                hashMap.put(new jj(), ufVar.f37459e);
            }
            if (ufVar.f37460f != null) {
                hashMap.put(new kc(), ufVar.f37460f);
            }
            if (ufVar.f37461g != null) {
                hashMap.put(new lf(), ufVar.f37461g);
            }
            if (ufVar.f37462h != null) {
                hashMap.put(new ld(), ufVar.f37462h);
            }
            if (ufVar.f37463i != null) {
                hashMap.put(new ma(), ufVar.f37463i);
            }
            if (ufVar.f37464j != null) {
                hashMap.put(new ov(), ufVar.f37464j);
            }
            if (ufVar.f37465k != null) {
                hashMap.put(new pp(), ufVar.f37465k);
            }
            if (ufVar.f37466l != null) {
                hashMap.put(new pt(), ufVar.f37466l);
            }
            if (ufVar.f37467m != null) {
                hashMap.put(new qb(), ufVar.f37467m);
            }
            if (ufVar.f37468n != null) {
                hashMap.put(new rt(), ufVar.f37468n);
            }
            if (ufVar.f37469o != null) {
                hashMap.put(new ru(), ufVar.f37469o);
            }
            if (ufVar.f37470p != null) {
                hashMap.put(new rv(), ufVar.f37470p);
            }
            if (ufVar.f37471q != null) {
                hashMap.put(new sb(), ufVar.f37471q);
            }
            if (ufVar.f37472r != null) {
                hashMap.put(new ya(), ufVar.f37472r);
            }
            if (ufVar.f37473s != null) {
                hashMap.put(new xz(), ufVar.f37473s);
            }
            if (ufVar.f37474t != null) {
                hashMap.put(new yd(), ufVar.f37474t);
            }
            if (ufVar.f37475u != null) {
                hashMap.put(new yc(), ufVar.f37475u);
            }
            if (ufVar.f37476v != null) {
                hashMap.put(new zz(), ufVar.f37476v);
            }
            if (ufVar.f37477w != null) {
                hashMap.put(new aaa(), ufVar.f37477w);
            }
            if (ufVar.f37478x != null) {
                hashMap.put(new aab(), ufVar.f37478x);
            }
            if (ufVar.f37479y != null) {
                hashMap.put(new aac(), ufVar.f37479y);
            }
            if (ufVar.f37480z != null) {
                hashMap.put(new aad(), ufVar.f37480z);
            }
            if (ufVar.f37448A != null) {
                hashMap.put(new aae(), ufVar.f37448A);
            }
            if (ufVar.f37449B != null) {
                hashMap.put(new aam(), ufVar.f37449B);
            }
            if (ufVar.f37450C != null) {
                hashMap.put(new aan(), ufVar.f37450C);
            }
            if (ufVar.f37451D != null) {
                hashMap.put(new aao(), ufVar.f37451D);
            }
            if (ufVar.f37452E != null) {
                hashMap.put(new aap(), ufVar.f37452E);
            }
            if (ufVar.f37453F != null) {
                hashMap.put(new aaq(), ufVar.f37453F);
            }
            if (ufVar.f37454G != null) {
                hashMap.put(new aar(), ufVar.f37454G);
            }
            return new C11514b(this.f37447a, hashMap);
        }
    }

    private uf() {
    }

    /* renamed from: a */
    public static C9286a m46368a() {
        return new C9286a();
    }

    public final DescriptorFactory<C11514b, uf> getDescriptorFactory() {
        return new C11515c();
    }
}
