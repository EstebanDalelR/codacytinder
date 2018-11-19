package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class xm implements EtlEvent {
    /* renamed from: a */
    private Number f37708a;
    /* renamed from: b */
    private Number f37709b;
    /* renamed from: c */
    private String f37710c;
    /* renamed from: d */
    private Number f37711d;
    /* renamed from: e */
    private List f37712e;
    /* renamed from: f */
    private Number f37713f;
    /* renamed from: g */
    private Number f37714g;
    /* renamed from: h */
    private Number f37715h;

    /* renamed from: com.tinder.etl.event.xm$a */
    public static class C9326a {
        /* renamed from: a */
        private xm f31399a;

        private C9326a() {
            this.f31399a = new xm();
        }

        /* renamed from: a */
        public final C9326a m38972a(Number number) {
            this.f31399a.f37708a = number;
            return this;
        }

        /* renamed from: b */
        public final C9326a m38975b(Number number) {
            this.f31399a.f37709b = number;
            return this;
        }

        /* renamed from: c */
        public final C9326a m38976c(Number number) {
            this.f31399a.f37711d = number;
            return this;
        }

        /* renamed from: a */
        public final C9326a m38973a(List list) {
            this.f31399a.f37712e = list;
            return this;
        }

        /* renamed from: d */
        public final C9326a m38977d(Number number) {
            this.f31399a.f37713f = number;
            return this;
        }

        /* renamed from: e */
        public final C9326a m38978e(Number number) {
            this.f31399a.f37714g = number;
            return this;
        }

        /* renamed from: f */
        public final C9326a m38979f(Number number) {
            this.f31399a.f37715h = number;
            return this;
        }

        /* renamed from: a */
        public xm m38974a() {
            return this.f31399a;
        }
    }

    /* renamed from: com.tinder.etl.event.xm$b */
    public class C11557b extends fw {
        /* renamed from: a */
        final /* synthetic */ xm f37706a;

        /* renamed from: a */
        public String mo10346a() {
            return "SuperLikePaywall.View";
        }

        public C11557b(xm xmVar, Map<EtlField<?>, Object> map) {
            this.f37706a = xmVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.xm$c */
    private final class C11558c implements DescriptorFactory<C11557b, xm> {
        /* renamed from: a */
        final /* synthetic */ xm f37707a;

        private C11558c(xm xmVar) {
            this.f37707a = xmVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46800a((xm) etlEvent);
        }

        /* renamed from: a */
        public final C11557b m46800a(xm xmVar) {
            Map hashMap = new HashMap();
            if (xmVar.f37708a != null) {
                hashMap.put(new pg(), xmVar.f37708a);
            }
            if (xmVar.f37709b != null) {
                hashMap.put(new yi(), xmVar.f37709b);
            }
            if (xmVar.f37710c != null) {
                hashMap.put(new ov(), xmVar.f37710c);
            }
            if (xmVar.f37711d != null) {
                hashMap.put(new xl(), xmVar.f37711d);
            }
            if (xmVar.f37712e != null) {
                hashMap.put(new rm(), xmVar.f37712e);
            }
            if (xmVar.f37713f != null) {
                hashMap.put(new hc(), xmVar.f37713f);
            }
            if (xmVar.f37714g != null) {
                hashMap.put(new xs(), xmVar.f37714g);
            }
            if (xmVar.f37715h != null) {
                hashMap.put(new sk(), xmVar.f37715h);
            }
            return new C11557b(this.f37707a, hashMap);
        }
    }

    private xm() {
    }

    /* renamed from: a */
    public static C9326a m46801a() {
        return new C9326a();
    }

    public final DescriptorFactory<C11557b, xm> getDescriptorFactory() {
        return new C11558c();
    }
}
