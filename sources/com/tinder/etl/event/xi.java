package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class xi implements EtlEvent {
    /* renamed from: a */
    private Number f37671a;
    /* renamed from: b */
    private String f37672b;
    /* renamed from: c */
    private Number f37673c;
    /* renamed from: d */
    private List f37674d;
    /* renamed from: e */
    private Number f37675e;
    /* renamed from: f */
    private Number f37676f;
    /* renamed from: g */
    private Number f37677g;

    /* renamed from: com.tinder.etl.event.xi$a */
    public static class C9320a {
        /* renamed from: a */
        private xi f31396a;

        private C9320a() {
            this.f31396a = new xi();
        }

        /* renamed from: a */
        public final C9320a m38940a(Number number) {
            this.f31396a.f37671a = number;
            return this;
        }

        /* renamed from: b */
        public final C9320a m38943b(Number number) {
            this.f31396a.f37673c = number;
            return this;
        }

        /* renamed from: a */
        public final C9320a m38941a(List list) {
            this.f31396a.f37674d = list;
            return this;
        }

        /* renamed from: c */
        public final C9320a m38944c(Number number) {
            this.f31396a.f37675e = number;
            return this;
        }

        /* renamed from: d */
        public final C9320a m38945d(Number number) {
            this.f31396a.f37676f = number;
            return this;
        }

        /* renamed from: e */
        public final C9320a m38946e(Number number) {
            this.f31396a.f37677g = number;
            return this;
        }

        /* renamed from: a */
        public xi m38942a() {
            return this.f31396a;
        }
    }

    /* renamed from: com.tinder.etl.event.xi$b */
    public class C11551b extends fw {
        /* renamed from: a */
        final /* synthetic */ xi f37669a;

        /* renamed from: a */
        public String mo10346a() {
            return "SuperLikePaywall.Cancel";
        }

        public C11551b(xi xiVar, Map<EtlField<?>, Object> map) {
            this.f37669a = xiVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.xi$c */
    private final class C11552c implements DescriptorFactory<C11551b, xi> {
        /* renamed from: a */
        final /* synthetic */ xi f37670a;

        private C11552c(xi xiVar) {
            this.f37670a = xiVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46731a((xi) etlEvent);
        }

        /* renamed from: a */
        public final C11551b m46731a(xi xiVar) {
            Map hashMap = new HashMap();
            if (xiVar.f37671a != null) {
                hashMap.put(new hc(), xiVar.f37671a);
            }
            if (xiVar.f37672b != null) {
                hashMap.put(new ov(), xiVar.f37672b);
            }
            if (xiVar.f37673c != null) {
                hashMap.put(new pg(), xiVar.f37673c);
            }
            if (xiVar.f37674d != null) {
                hashMap.put(new rm(), xiVar.f37674d);
            }
            if (xiVar.f37675e != null) {
                hashMap.put(new xl(), xiVar.f37675e);
            }
            if (xiVar.f37676f != null) {
                hashMap.put(new xs(), xiVar.f37676f);
            }
            if (xiVar.f37677g != null) {
                hashMap.put(new yi(), xiVar.f37677g);
            }
            return new C11551b(this.f37670a, hashMap);
        }
    }

    private xi() {
    }

    /* renamed from: a */
    public static C9320a m46732a() {
        return new C9320a();
    }

    public final DescriptorFactory<C11551b, xi> getDescriptorFactory() {
        return new C11552c();
    }
}
