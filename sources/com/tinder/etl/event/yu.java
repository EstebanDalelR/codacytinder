package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class yu implements EtlEvent {
    /* renamed from: a */
    private Number f37855a;
    /* renamed from: b */
    private String f37856b;
    /* renamed from: c */
    private Number f37857c;
    /* renamed from: d */
    private String f37858d;
    /* renamed from: e */
    private String f37859e;
    /* renamed from: f */
    private List f37860f;
    /* renamed from: g */
    private List f37861g;
    /* renamed from: h */
    private List f37862h;
    /* renamed from: i */
    private Number f37863i;
    /* renamed from: j */
    private Number f37864j;
    /* renamed from: k */
    private Number f37865k;
    /* renamed from: l */
    private Number f37866l;
    /* renamed from: m */
    private Number f37867m;
    /* renamed from: n */
    private String f37868n;
    /* renamed from: o */
    private Boolean f37869o;
    /* renamed from: p */
    private Number f37870p;
    /* renamed from: q */
    private Number f37871q;
    /* renamed from: r */
    private String f37872r;

    /* renamed from: com.tinder.etl.event.yu$a */
    public static class C9344a {
        /* renamed from: a */
        private yu f31408a;

        private C9344a() {
            this.f31408a = new yu();
        }

        /* renamed from: a */
        public final C9344a m39100a(Number number) {
            this.f31408a.f37855a = number;
            return this;
        }

        /* renamed from: a */
        public final C9344a m39101a(String str) {
            this.f31408a.f37856b = str;
            return this;
        }

        /* renamed from: b */
        public final C9344a m39104b(Number number) {
            this.f31408a.f37857c = number;
            return this;
        }

        /* renamed from: b */
        public final C9344a m39105b(String str) {
            this.f31408a.f37858d = str;
            return this;
        }

        /* renamed from: c */
        public final C9344a m39108c(String str) {
            this.f31408a.f37859e = str;
            return this;
        }

        /* renamed from: a */
        public final C9344a m39102a(List list) {
            this.f31408a.f37860f = list;
            return this;
        }

        /* renamed from: b */
        public final C9344a m39106b(List list) {
            this.f31408a.f37861g = list;
            return this;
        }

        /* renamed from: c */
        public final C9344a m39109c(List list) {
            this.f31408a.f37862h = list;
            return this;
        }

        /* renamed from: c */
        public final C9344a m39107c(Number number) {
            this.f31408a.f37863i = number;
            return this;
        }

        /* renamed from: d */
        public final C9344a m39110d(Number number) {
            this.f31408a.f37864j = number;
            return this;
        }

        /* renamed from: e */
        public final C9344a m39112e(Number number) {
            this.f31408a.f37865k = number;
            return this;
        }

        /* renamed from: f */
        public final C9344a m39113f(Number number) {
            this.f31408a.f37866l = number;
            return this;
        }

        /* renamed from: g */
        public final C9344a m39114g(Number number) {
            this.f31408a.f37867m = number;
            return this;
        }

        /* renamed from: d */
        public final C9344a m39111d(String str) {
            this.f31408a.f37868n = str;
            return this;
        }

        /* renamed from: a */
        public final C9344a m39099a(Boolean bool) {
            this.f31408a.f37869o = bool;
            return this;
        }

        /* renamed from: h */
        public final C9344a m39115h(Number number) {
            this.f31408a.f37870p = number;
            return this;
        }

        /* renamed from: i */
        public final C9344a m39116i(Number number) {
            this.f31408a.f37871q = number;
            return this;
        }

        /* renamed from: a */
        public yu m39103a() {
            return this.f31408a;
        }
    }

    /* renamed from: com.tinder.etl.event.yu$b */
    public class C11576b extends fw {
        /* renamed from: a */
        final /* synthetic */ yu f37853a;

        /* renamed from: a */
        public String mo10346a() {
            return "TinderPlus.Restore";
        }

        public C11576b(yu yuVar, Map<EtlField<?>, Object> map) {
            this.f37853a = yuVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.yu$c */
    private final class C11577c implements DescriptorFactory<C11576b, yu> {
        /* renamed from: a */
        final /* synthetic */ yu f37854a;

        private C11577c(yu yuVar) {
            this.f37854a = yuVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m47074a((yu) etlEvent);
        }

        /* renamed from: a */
        public final C11576b m47074a(yu yuVar) {
            Map hashMap = new HashMap();
            if (yuVar.f37855a != null) {
                hashMap.put(new bq(), yuVar.f37855a);
            }
            if (yuVar.f37856b != null) {
                hashMap.put(new ej(), yuVar.f37856b);
            }
            if (yuVar.f37857c != null) {
                hashMap.put(new ez(), yuVar.f37857c);
            }
            if (yuVar.f37858d != null) {
                hashMap.put(new ey(), yuVar.f37858d);
            }
            if (yuVar.f37859e != null) {
                hashMap.put(new ex(), yuVar.f37859e);
            }
            if (yuVar.f37860f != null) {
                hashMap.put(new ge(), yuVar.f37860f);
            }
            if (yuVar.f37861g != null) {
                hashMap.put(new je(), yuVar.f37861g);
            }
            if (yuVar.f37862h != null) {
                hashMap.put(new jf(), yuVar.f37862h);
            }
            if (yuVar.f37863i != null) {
                hashMap.put(new pk(), yuVar.f37863i);
            }
            if (yuVar.f37864j != null) {
                hashMap.put(new pl(), yuVar.f37864j);
            }
            if (yuVar.f37865k != null) {
                hashMap.put(new rj(), yuVar.f37865k);
            }
            if (yuVar.f37866l != null) {
                hashMap.put(new sk(), yuVar.f37866l);
            }
            if (yuVar.f37867m != null) {
                hashMap.put(new ve(), yuVar.f37867m);
            }
            if (yuVar.f37868n != null) {
                hashMap.put(new wr(), yuVar.f37868n);
            }
            if (yuVar.f37869o != null) {
                hashMap.put(new xg(), yuVar.f37869o);
            }
            if (yuVar.f37870p != null) {
                hashMap.put(new xs(), yuVar.f37870p);
            }
            if (yuVar.f37871q != null) {
                hashMap.put(new ye(), yuVar.f37871q);
            }
            if (yuVar.f37872r != null) {
                hashMap.put(new yf(), yuVar.f37872r);
            }
            return new C11576b(this.f37854a, hashMap);
        }
    }

    private yu() {
    }

    /* renamed from: a */
    public static C9344a m47075a() {
        return new C9344a();
    }

    public final DescriptorFactory<C11576b, yu> getDescriptorFactory() {
        return new C11577c();
    }
}
