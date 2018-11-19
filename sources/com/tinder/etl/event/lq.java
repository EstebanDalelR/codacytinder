package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class lq implements EtlEvent {
    /* renamed from: a */
    private String f37056a;
    /* renamed from: b */
    private String f37057b;
    /* renamed from: c */
    private String f37058c;
    /* renamed from: d */
    private Boolean f37059d;
    /* renamed from: e */
    private Number f37060e;
    /* renamed from: f */
    private Boolean f37061f;
    /* renamed from: g */
    private Boolean f37062g;
    /* renamed from: h */
    private Boolean f37063h;
    /* renamed from: i */
    private String f37064i;
    /* renamed from: j */
    private String f37065j;
    /* renamed from: k */
    private String f37066k;
    /* renamed from: l */
    private String f37067l;
    /* renamed from: m */
    private String f37068m;
    /* renamed from: n */
    private Number f37069n;
    /* renamed from: o */
    private Boolean f37070o;
    /* renamed from: p */
    private String f37071p;
    /* renamed from: q */
    private String f37072q;
    /* renamed from: r */
    private String f37073r;
    /* renamed from: s */
    private String f37074s;
    /* renamed from: t */
    private Boolean f37075t;
    /* renamed from: u */
    private Boolean f37076u;

    /* renamed from: com.tinder.etl.event.lq$a */
    public static class C9168a {
        /* renamed from: a */
        private lq f31320a;

        private C9168a() {
            this.f31320a = new lq();
        }

        /* renamed from: a */
        public final C9168a m38536a(Boolean bool) {
            this.f31320a.f37059d = bool;
            return this;
        }

        /* renamed from: b */
        public final C9168a m38539b(Boolean bool) {
            this.f31320a.f37062g = bool;
            return this;
        }

        /* renamed from: a */
        public final C9168a m38537a(String str) {
            this.f31320a.f37064i = str;
            return this;
        }

        /* renamed from: b */
        public final C9168a m38540b(String str) {
            this.f31320a.f37065j = str;
            return this;
        }

        /* renamed from: c */
        public final C9168a m38542c(String str) {
            this.f31320a.f37066k = str;
            return this;
        }

        /* renamed from: c */
        public final C9168a m38541c(Boolean bool) {
            this.f31320a.f37070o = bool;
            return this;
        }

        /* renamed from: d */
        public final C9168a m38543d(Boolean bool) {
            this.f31320a.f37075t = bool;
            return this;
        }

        /* renamed from: e */
        public final C9168a m38544e(Boolean bool) {
            this.f31320a.f37076u = bool;
            return this;
        }

        /* renamed from: a */
        public lq m38538a() {
            return this.f31320a;
        }
    }

    /* renamed from: com.tinder.etl.event.lq$b */
    public class C11387b extends fw {
        /* renamed from: a */
        final /* synthetic */ lq f37054a;

        /* renamed from: a */
        public String mo10346a() {
            return "Match.New";
        }

        public C11387b(lq lqVar, Map<EtlField<?>, Object> map) {
            this.f37054a = lqVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.lq$c */
    private final class C11388c implements DescriptorFactory<C11387b, lq> {
        /* renamed from: a */
        final /* synthetic */ lq f37055a;

        private C11388c(lq lqVar) {
            this.f37055a = lqVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45712a((lq) etlEvent);
        }

        /* renamed from: a */
        public final C11387b m45712a(lq lqVar) {
            Map hashMap = new HashMap();
            if (lqVar.f37056a != null) {
                hashMap.put(new C11401o(), lqVar.f37056a);
            }
            if (lqVar.f37057b != null) {
                hashMap.put(new bp(), lqVar.f37057b);
            }
            if (lqVar.f37058c != null) {
                hashMap.put(new eq(), lqVar.f37058c);
            }
            if (lqVar.f37059d != null) {
                hashMap.put(new ev(), lqVar.f37059d);
            }
            if (lqVar.f37060e != null) {
                hashMap.put(new gu(), lqVar.f37060e);
            }
            if (lqVar.f37061f != null) {
                hashMap.put(new gv(), lqVar.f37061f);
            }
            if (lqVar.f37062g != null) {
                hashMap.put(new hi(), lqVar.f37062g);
            }
            if (lqVar.f37063h != null) {
                hashMap.put(new hj(), lqVar.f37063h);
            }
            if (lqVar.f37064i != null) {
                hashMap.put(new ll(), lqVar.f37064i);
            }
            if (lqVar.f37065j != null) {
                hashMap.put(new ov(), lqVar.f37065j);
            }
            if (lqVar.f37066k != null) {
                hashMap.put(new qb(), lqVar.f37066k);
            }
            if (lqVar.f37067l != null) {
                hashMap.put(new uw(), lqVar.f37067l);
            }
            if (lqVar.f37068m != null) {
                hashMap.put(new uv(), lqVar.f37068m);
            }
            if (lqVar.f37069n != null) {
                hashMap.put(new vm(), lqVar.f37069n);
            }
            if (lqVar.f37070o != null) {
                hashMap.put(new xh(), lqVar.f37070o);
            }
            if (lqVar.f37071p != null) {
                hashMap.put(new ya(), lqVar.f37071p);
            }
            if (lqVar.f37072q != null) {
                hashMap.put(new xz(), lqVar.f37072q);
            }
            if (lqVar.f37073r != null) {
                hashMap.put(new yd(), lqVar.f37073r);
            }
            if (lqVar.f37074s != null) {
                hashMap.put(new yc(), lqVar.f37074s);
            }
            if (lqVar.f37075t != null) {
                hashMap.put(new zm(), lqVar.f37075t);
            }
            if (lqVar.f37076u != null) {
                hashMap.put(new kj(), lqVar.f37076u);
            }
            return new C11387b(this.f37055a, hashMap);
        }
    }

    private lq() {
    }

    /* renamed from: a */
    public static C9168a m45713a() {
        return new C9168a();
    }

    public final DescriptorFactory<C11387b, lq> getDescriptorFactory() {
        return new C11388c();
    }
}
