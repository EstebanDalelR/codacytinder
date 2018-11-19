package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class xj implements EtlEvent {
    /* renamed from: a */
    private Number f37680a;
    /* renamed from: b */
    private String f37681b;
    /* renamed from: c */
    private Number f37682c;
    /* renamed from: d */
    private String f37683d;
    /* renamed from: e */
    private Number f37684e;
    /* renamed from: f */
    private Number f37685f;
    /* renamed from: g */
    private List f37686g;
    /* renamed from: h */
    private Number f37687h;
    /* renamed from: i */
    private String f37688i;
    /* renamed from: j */
    private Number f37689j;
    /* renamed from: k */
    private Number f37690k;
    /* renamed from: l */
    private Number f37691l;

    /* renamed from: com.tinder.etl.event.xj$a */
    public static class C9322a {
        /* renamed from: a */
        private xj f31397a;

        private C9322a() {
            this.f31397a = new xj();
        }

        /* renamed from: a */
        public final C9322a m38947a(Number number) {
            this.f31397a.f37680a = number;
            return this;
        }

        /* renamed from: a */
        public final C9322a m38948a(String str) {
            this.f31397a.f37681b = str;
            return this;
        }

        /* renamed from: b */
        public final C9322a m38951b(Number number) {
            this.f31397a.f37682c = number;
            return this;
        }

        /* renamed from: b */
        public final C9322a m38952b(String str) {
            this.f31397a.f37683d = str;
            return this;
        }

        /* renamed from: c */
        public final C9322a m38953c(Number number) {
            this.f31397a.f37684e = number;
            return this;
        }

        /* renamed from: d */
        public final C9322a m38955d(Number number) {
            this.f31397a.f37685f = number;
            return this;
        }

        /* renamed from: a */
        public final C9322a m38949a(List list) {
            this.f31397a.f37686g = list;
            return this;
        }

        /* renamed from: e */
        public final C9322a m38956e(Number number) {
            this.f31397a.f37687h = number;
            return this;
        }

        /* renamed from: c */
        public final C9322a m38954c(String str) {
            this.f31397a.f37688i = str;
            return this;
        }

        /* renamed from: f */
        public final C9322a m38957f(Number number) {
            this.f31397a.f37689j = number;
            return this;
        }

        /* renamed from: g */
        public final C9322a m38958g(Number number) {
            this.f31397a.f37690k = number;
            return this;
        }

        /* renamed from: h */
        public final C9322a m38959h(Number number) {
            this.f31397a.f37691l = number;
            return this;
        }

        /* renamed from: a */
        public xj m38950a() {
            return this.f31397a;
        }
    }

    /* renamed from: com.tinder.etl.event.xj$b */
    public class C11553b extends fw {
        /* renamed from: a */
        final /* synthetic */ xj f37678a;

        /* renamed from: a */
        public String mo10346a() {
            return "SuperLikePaywall.Purchase";
        }

        public C11553b(xj xjVar, Map<EtlField<?>, Object> map) {
            this.f37678a = xjVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.xj$c */
    private final class C11554c implements DescriptorFactory<C11553b, xj> {
        /* renamed from: a */
        final /* synthetic */ xj f37679a;

        private C11554c(xj xjVar) {
            this.f37679a = xjVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46747a((xj) etlEvent);
        }

        /* renamed from: a */
        public final C11553b m46747a(xj xjVar) {
            Map hashMap = new HashMap();
            if (xjVar.f37680a != null) {
                hashMap.put(new ar(), xjVar.f37680a);
            }
            if (xjVar.f37681b != null) {
                hashMap.put(new ej(), xjVar.f37681b);
            }
            if (xjVar.f37682c != null) {
                hashMap.put(new hc(), xjVar.f37682c);
            }
            if (xjVar.f37683d != null) {
                hashMap.put(new lc(), xjVar.f37683d);
            }
            if (xjVar.f37684e != null) {
                hashMap.put(new pg(), xjVar.f37684e);
            }
            if (xjVar.f37685f != null) {
                hashMap.put(new rj(), xjVar.f37685f);
            }
            if (xjVar.f37686g != null) {
                hashMap.put(new rm(), xjVar.f37686g);
            }
            if (xjVar.f37687h != null) {
                hashMap.put(new sk(), xjVar.f37687h);
            }
            if (xjVar.f37688i != null) {
                hashMap.put(new wr(), xjVar.f37688i);
            }
            if (xjVar.f37689j != null) {
                hashMap.put(new xl(), xjVar.f37689j);
            }
            if (xjVar.f37690k != null) {
                hashMap.put(new xs(), xjVar.f37690k);
            }
            if (xjVar.f37691l != null) {
                hashMap.put(new yi(), xjVar.f37691l);
            }
            return new C11553b(this.f37679a, hashMap);
        }
    }

    private xj() {
    }

    /* renamed from: a */
    public static C9322a m46748a() {
        return new C9322a();
    }

    public final DescriptorFactory<C11553b, xj> getDescriptorFactory() {
        return new C11554c();
    }
}
