package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class df implements EtlEvent {
    /* renamed from: a */
    private String f36430a;
    /* renamed from: b */
    private Number f36431b;
    /* renamed from: c */
    private String f36432c;
    /* renamed from: d */
    private String f36433d;
    /* renamed from: e */
    private Boolean f36434e;
    /* renamed from: f */
    private Boolean f36435f;
    /* renamed from: g */
    private Boolean f36436g;
    /* renamed from: h */
    private Boolean f36437h;
    /* renamed from: i */
    private String f36438i;
    /* renamed from: j */
    private String f36439j;
    /* renamed from: k */
    private String f36440k;
    /* renamed from: l */
    private Number f36441l;
    /* renamed from: m */
    private Number f36442m;
    /* renamed from: n */
    private Number f36443n;
    /* renamed from: o */
    private String f36444o;
    /* renamed from: p */
    private String f36445p;
    /* renamed from: q */
    private Number f36446q;
    /* renamed from: r */
    private String f36447r;
    /* renamed from: s */
    private String f36448s;
    /* renamed from: t */
    private String f36449t;
    /* renamed from: u */
    private Boolean f36450u;
    /* renamed from: v */
    private Number f36451v;

    /* renamed from: com.tinder.etl.event.df$a */
    public static class C9034a {
        /* renamed from: a */
        private df f31252a;

        private C9034a() {
            this.f31252a = new df();
        }

        /* renamed from: a */
        public final C9034a m38034a(Number number) {
            this.f31252a.f36431b = number;
            return this;
        }

        /* renamed from: a */
        public final C9034a m38035a(String str) {
            this.f31252a.f36432c = str;
            return this;
        }

        /* renamed from: a */
        public final C9034a m38033a(Boolean bool) {
            this.f31252a.f36434e = bool;
            return this;
        }

        /* renamed from: b */
        public final C9034a m38037b(Boolean bool) {
            this.f31252a.f36437h = bool;
            return this;
        }

        /* renamed from: b */
        public final C9034a m38039b(String str) {
            this.f31252a.f36438i = str;
            return this;
        }

        /* renamed from: c */
        public final C9034a m38042c(String str) {
            this.f31252a.f36439j = str;
            return this;
        }

        /* renamed from: d */
        public final C9034a m38044d(String str) {
            this.f31252a.f36440k = str;
            return this;
        }

        /* renamed from: b */
        public final C9034a m38038b(Number number) {
            this.f31252a.f36441l = number;
            return this;
        }

        /* renamed from: c */
        public final C9034a m38041c(Number number) {
            this.f31252a.f36442m = number;
            return this;
        }

        /* renamed from: d */
        public final C9034a m38043d(Number number) {
            this.f31252a.f36443n = number;
            return this;
        }

        /* renamed from: e */
        public final C9034a m38046e(String str) {
            this.f31252a.f36444o = str;
            return this;
        }

        /* renamed from: f */
        public final C9034a m38047f(String str) {
            this.f31252a.f36445p = str;
            return this;
        }

        /* renamed from: c */
        public final C9034a m38040c(Boolean bool) {
            this.f31252a.f36450u = bool;
            return this;
        }

        /* renamed from: e */
        public final C9034a m38045e(Number number) {
            this.f31252a.f36451v = number;
            return this;
        }

        /* renamed from: a */
        public df m38036a() {
            return this.f31252a;
        }
    }

    /* renamed from: com.tinder.etl.event.df$b */
    public class C11243b extends fw {
        /* renamed from: a */
        final /* synthetic */ df f36428a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.Open";
        }

        public C11243b(df dfVar, Map<EtlField<?>, Object> map) {
            this.f36428a = dfVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.df$c */
    private final class C11244c implements DescriptorFactory<C11243b, df> {
        /* renamed from: a */
        final /* synthetic */ df f36429a;

        private C11244c(df dfVar) {
            this.f36429a = dfVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44585a((df) etlEvent);
        }

        /* renamed from: a */
        public final C11243b m44585a(df dfVar) {
            Map hashMap = new HashMap();
            if (dfVar.f36430a != null) {
                hashMap.put(new C11401o(), dfVar.f36430a);
            }
            if (dfVar.f36431b != null) {
                hashMap.put(new bc(), dfVar.f36431b);
            }
            if (dfVar.f36432c != null) {
                hashMap.put(new bp(), dfVar.f36432c);
            }
            if (dfVar.f36433d != null) {
                hashMap.put(new eq(), dfVar.f36433d);
            }
            if (dfVar.f36434e != null) {
                hashMap.put(new ev(), dfVar.f36434e);
            }
            if (dfVar.f36435f != null) {
                hashMap.put(new hi(), dfVar.f36435f);
            }
            if (dfVar.f36436g != null) {
                hashMap.put(new ja(), dfVar.f36436g);
            }
            if (dfVar.f36437h != null) {
                hashMap.put(new jo(), dfVar.f36437h);
            }
            if (dfVar.f36438i != null) {
                hashMap.put(new kb(), dfVar.f36438i);
            }
            if (dfVar.f36439j != null) {
                hashMap.put(new ll(), dfVar.f36439j);
            }
            if (dfVar.f36440k != null) {
                hashMap.put(new lx(), dfVar.f36440k);
            }
            if (dfVar.f36441l != null) {
                hashMap.put(new nx(), dfVar.f36441l);
            }
            if (dfVar.f36442m != null) {
                hashMap.put(new ny(), dfVar.f36442m);
            }
            if (dfVar.f36443n != null) {
                hashMap.put(new op(), dfVar.f36443n);
            }
            if (dfVar.f36444o != null) {
                hashMap.put(new ov(), dfVar.f36444o);
            }
            if (dfVar.f36445p != null) {
                hashMap.put(new qb(), dfVar.f36445p);
            }
            if (dfVar.f36446q != null) {
                hashMap.put(new ta(), dfVar.f36446q);
            }
            if (dfVar.f36447r != null) {
                hashMap.put(new wo(), dfVar.f36447r);
            }
            if (dfVar.f36448s != null) {
                hashMap.put(new uw(), dfVar.f36448s);
            }
            if (dfVar.f36449t != null) {
                hashMap.put(new uv(), dfVar.f36449t);
            }
            if (dfVar.f36450u != null) {
                hashMap.put(new xh(), dfVar.f36450u);
            }
            if (dfVar.f36451v != null) {
                hashMap.put(new yk(), dfVar.f36451v);
            }
            return new C11243b(this.f36429a, hashMap);
        }
    }

    private df() {
    }

    /* renamed from: a */
    public static C9034a m44586a() {
        return new C9034a();
    }

    public final DescriptorFactory<C11243b, df> getDescriptorFactory() {
        return new C11244c();
    }
}
