package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ys implements EtlEvent {
    /* renamed from: a */
    private String f37816a;
    /* renamed from: b */
    private Number f37817b;
    /* renamed from: c */
    private List f37818c;
    /* renamed from: d */
    private String f37819d;
    /* renamed from: e */
    private List f37820e;
    /* renamed from: f */
    private List f37821f;
    /* renamed from: g */
    private Number f37822g;
    /* renamed from: h */
    private String f37823h;
    /* renamed from: i */
    private Number f37824i;
    /* renamed from: j */
    private List f37825j;
    /* renamed from: k */
    private Number f37826k;
    /* renamed from: l */
    private Boolean f37827l;

    /* renamed from: com.tinder.etl.event.ys$a */
    public static class C9340a {
        /* renamed from: a */
        private ys f31406a;

        private C9340a() {
            this.f31406a = new ys();
        }

        /* renamed from: a */
        public final C9340a m39065a(String str) {
            this.f31406a.f37816a = str;
            return this;
        }

        /* renamed from: a */
        public final C9340a m39064a(Number number) {
            this.f31406a.f37817b = number;
            return this;
        }

        /* renamed from: a */
        public final C9340a m39066a(List list) {
            this.f31406a.f37818c = list;
            return this;
        }

        /* renamed from: b */
        public final C9340a m39069b(String str) {
            this.f31406a.f37819d = str;
            return this;
        }

        /* renamed from: b */
        public final C9340a m39070b(List list) {
            this.f31406a.f37820e = list;
            return this;
        }

        /* renamed from: c */
        public final C9340a m39073c(List list) {
            this.f31406a.f37821f = list;
            return this;
        }

        /* renamed from: b */
        public final C9340a m39068b(Number number) {
            this.f31406a.f37822g = number;
            return this;
        }

        /* renamed from: c */
        public final C9340a m39072c(String str) {
            this.f31406a.f37823h = str;
            return this;
        }

        /* renamed from: c */
        public final C9340a m39071c(Number number) {
            this.f31406a.f37824i = number;
            return this;
        }

        /* renamed from: d */
        public final C9340a m39075d(List list) {
            this.f31406a.f37825j = list;
            return this;
        }

        /* renamed from: d */
        public final C9340a m39074d(Number number) {
            this.f31406a.f37826k = number;
            return this;
        }

        /* renamed from: a */
        public final C9340a m39063a(Boolean bool) {
            this.f31406a.f37827l = bool;
            return this;
        }

        /* renamed from: a */
        public ys m39067a() {
            return this.f31406a;
        }
    }

    /* renamed from: com.tinder.etl.event.ys$b */
    public class C11572b extends fw {
        /* renamed from: a */
        final /* synthetic */ ys f37814a;

        /* renamed from: a */
        public String mo10346a() {
            return "TinderPlus.PaywallFeatureView";
        }

        public C11572b(ys ysVar, Map<EtlField<?>, Object> map) {
            this.f37814a = ysVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ys$c */
    private final class C11573c implements DescriptorFactory<C11572b, ys> {
        /* renamed from: a */
        final /* synthetic */ ys f37815a;

        private C11573c(ys ysVar) {
            this.f37815a = ysVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46999a((ys) etlEvent);
        }

        /* renamed from: a */
        public final C11572b m46999a(ys ysVar) {
            Map hashMap = new HashMap();
            if (ysVar.f37816a != null) {
                hashMap.put(new ej(), ysVar.f37816a);
            }
            if (ysVar.f37817b != null) {
                hashMap.put(new ew(), ysVar.f37817b);
            }
            if (ysVar.f37818c != null) {
                hashMap.put(new ge(), ysVar.f37818c);
            }
            if (ysVar.f37819d != null) {
                hashMap.put(new gc(), ysVar.f37819d);
            }
            if (ysVar.f37820e != null) {
                hashMap.put(new je(), ysVar.f37820e);
            }
            if (ysVar.f37821f != null) {
                hashMap.put(new jf(), ysVar.f37821f);
            }
            if (ysVar.f37822g != null) {
                hashMap.put(new pk(), ysVar.f37822g);
            }
            if (ysVar.f37823h != null) {
                hashMap.put(new qw(), ysVar.f37823h);
            }
            if (ysVar.f37824i != null) {
                hashMap.put(new qz(), ysVar.f37824i);
            }
            if (ysVar.f37825j != null) {
                hashMap.put(new rm(), ysVar.f37825j);
            }
            if (ysVar.f37826k != null) {
                hashMap.put(new xs(), ysVar.f37826k);
            }
            if (ysVar.f37827l != null) {
                hashMap.put(new zn(), ysVar.f37827l);
            }
            return new C11572b(this.f37815a, hashMap);
        }
    }

    private ys() {
    }

    /* renamed from: a */
    public static C9340a m47000a() {
        return new C9340a();
    }

    public final DescriptorFactory<C11572b, ys> getDescriptorFactory() {
        return new C11573c();
    }
}
