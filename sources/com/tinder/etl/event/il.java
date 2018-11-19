package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class il implements EtlEvent {
    /* renamed from: a */
    private Number f36881a;
    /* renamed from: b */
    private String f36882b;
    /* renamed from: c */
    private Number f36883c;
    /* renamed from: d */
    private String f36884d;
    /* renamed from: e */
    private Number f36885e;
    /* renamed from: f */
    private Number f36886f;
    /* renamed from: g */
    private List f36887g;
    /* renamed from: h */
    private Number f36888h;
    /* renamed from: i */
    private String f36889i;
    /* renamed from: j */
    private List f36890j;
    /* renamed from: k */
    private Number f36891k;
    /* renamed from: l */
    private String f36892l;
    /* renamed from: m */
    private String f36893m;
    /* renamed from: n */
    private String f36894n;

    /* renamed from: com.tinder.etl.event.il$a */
    public static class C9122a {
        /* renamed from: a */
        private il f31297a;

        private C9122a() {
            this.f31297a = new il();
        }

        /* renamed from: a */
        public final C9122a m38398a(Number number) {
            this.f31297a.f36881a = number;
            return this;
        }

        /* renamed from: a */
        public final C9122a m38399a(String str) {
            this.f31297a.f36882b = str;
            return this;
        }

        /* renamed from: b */
        public final C9122a m38402b(Number number) {
            this.f31297a.f36883c = number;
            return this;
        }

        /* renamed from: b */
        public final C9122a m38403b(String str) {
            this.f31297a.f36884d = str;
            return this;
        }

        /* renamed from: c */
        public final C9122a m38405c(Number number) {
            this.f31297a.f36885e = number;
            return this;
        }

        /* renamed from: d */
        public final C9122a m38407d(Number number) {
            this.f31297a.f36886f = number;
            return this;
        }

        /* renamed from: a */
        public final C9122a m38400a(List list) {
            this.f31297a.f36887g = list;
            return this;
        }

        /* renamed from: e */
        public final C9122a m38408e(Number number) {
            this.f31297a.f36888h = number;
            return this;
        }

        /* renamed from: c */
        public final C9122a m38406c(String str) {
            this.f31297a.f36889i = str;
            return this;
        }

        /* renamed from: b */
        public final C9122a m38404b(List list) {
            this.f31297a.f36890j = list;
            return this;
        }

        /* renamed from: a */
        public il m38401a() {
            return this.f31297a;
        }
    }

    /* renamed from: com.tinder.etl.event.il$b */
    public class C11338b extends fw {
        /* renamed from: a */
        final /* synthetic */ il f36879a;

        /* renamed from: a */
        public String mo10346a() {
            return "Gold.Purchase";
        }

        public C11338b(il ilVar, Map<EtlField<?>, Object> map) {
            this.f36879a = ilVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.il$c */
    private final class C11339c implements DescriptorFactory<C11338b, il> {
        /* renamed from: a */
        final /* synthetic */ il f36880a;

        private C11339c(il ilVar) {
            this.f36880a = ilVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45399a((il) etlEvent);
        }

        /* renamed from: a */
        public final C11338b m45399a(il ilVar) {
            Map hashMap = new HashMap();
            if (ilVar.f36881a != null) {
                hashMap.put(new bq(), ilVar.f36881a);
            }
            if (ilVar.f36882b != null) {
                hashMap.put(new ej(), ilVar.f36882b);
            }
            if (ilVar.f36883c != null) {
                hashMap.put(new kf(), ilVar.f36883c);
            }
            if (ilVar.f36884d != null) {
                hashMap.put(new lc(), ilVar.f36884d);
            }
            if (ilVar.f36885e != null) {
                hashMap.put(new pk(), ilVar.f36885e);
            }
            if (ilVar.f36886f != null) {
                hashMap.put(new pl(), ilVar.f36886f);
            }
            if (ilVar.f36887g != null) {
                hashMap.put(new rm(), ilVar.f36887g);
            }
            if (ilVar.f36888h != null) {
                hashMap.put(new sk(), ilVar.f36888h);
            }
            if (ilVar.f36889i != null) {
                hashMap.put(new wr(), ilVar.f36889i);
            }
            if (ilVar.f36890j != null) {
                hashMap.put(new ws(), ilVar.f36890j);
            }
            if (ilVar.f36891k != null) {
                hashMap.put(new ez(), ilVar.f36891k);
            }
            if (ilVar.f36892l != null) {
                hashMap.put(new ex(), ilVar.f36892l);
            }
            if (ilVar.f36893m != null) {
                hashMap.put(new ey(), ilVar.f36893m);
            }
            if (ilVar.f36894n != null) {
                hashMap.put(new yf(), ilVar.f36894n);
            }
            return new C11338b(this.f36880a, hashMap);
        }
    }

    private il() {
    }

    /* renamed from: a */
    public static C9122a m45400a() {
        return new C9122a();
    }

    public final DescriptorFactory<C11338b, il> getDescriptorFactory() {
        return new C11339c();
    }
}
