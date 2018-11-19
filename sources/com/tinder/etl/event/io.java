package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class io implements EtlEvent {
    /* renamed from: a */
    private Number f36919a;
    /* renamed from: b */
    private String f36920b;
    /* renamed from: c */
    private Number f36921c;
    /* renamed from: d */
    private String f36922d;
    /* renamed from: e */
    private List f36923e;
    /* renamed from: f */
    private Number f36924f;
    /* renamed from: g */
    private String f36925g;
    /* renamed from: h */
    private List f36926h;

    /* renamed from: com.tinder.etl.event.io$a */
    public static class C9128a {
        /* renamed from: a */
        private io f31300a;

        private C9128a() {
            this.f31300a = new io();
        }

        /* renamed from: a */
        public final C9128a m38429a(Number number) {
            this.f31300a.f36919a = number;
            return this;
        }

        /* renamed from: a */
        public final C9128a m38430a(String str) {
            this.f31300a.f36920b = str;
            return this;
        }

        /* renamed from: b */
        public final C9128a m38433b(Number number) {
            this.f31300a.f36921c = number;
            return this;
        }

        /* renamed from: b */
        public final C9128a m38434b(String str) {
            this.f31300a.f36922d = str;
            return this;
        }

        /* renamed from: a */
        public final C9128a m38431a(List list) {
            this.f31300a.f36923e = list;
            return this;
        }

        /* renamed from: c */
        public final C9128a m38436c(Number number) {
            this.f31300a.f36924f = number;
            return this;
        }

        /* renamed from: c */
        public final C9128a m38437c(String str) {
            this.f31300a.f36925g = str;
            return this;
        }

        /* renamed from: b */
        public final C9128a m38435b(List list) {
            this.f31300a.f36926h = list;
            return this;
        }

        /* renamed from: a */
        public io m38432a() {
            return this.f31300a;
        }
    }

    /* renamed from: com.tinder.etl.event.io$b */
    public class C11344b extends fw {
        /* renamed from: a */
        final /* synthetic */ io f36917a;

        /* renamed from: a */
        public String mo10346a() {
            return "Gold.SkuOffered";
        }

        public C11344b(io ioVar, Map<EtlField<?>, Object> map) {
            this.f36917a = ioVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.io$c */
    private final class C11345c implements DescriptorFactory<C11344b, io> {
        /* renamed from: a */
        final /* synthetic */ io f36918a;

        private C11345c(io ioVar) {
            this.f36918a = ioVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45468a((io) etlEvent);
        }

        /* renamed from: a */
        public final C11344b m45468a(io ioVar) {
            Map hashMap = new HashMap();
            if (ioVar.f36919a != null) {
                hashMap.put(new bq(), ioVar.f36919a);
            }
            if (ioVar.f36920b != null) {
                hashMap.put(new ej(), ioVar.f36920b);
            }
            if (ioVar.f36921c != null) {
                hashMap.put(new kf(), ioVar.f36921c);
            }
            if (ioVar.f36922d != null) {
                hashMap.put(new lc(), ioVar.f36922d);
            }
            if (ioVar.f36923e != null) {
                hashMap.put(new rm(), ioVar.f36923e);
            }
            if (ioVar.f36924f != null) {
                hashMap.put(new sk(), ioVar.f36924f);
            }
            if (ioVar.f36925g != null) {
                hashMap.put(new wr(), ioVar.f36925g);
            }
            if (ioVar.f36926h != null) {
                hashMap.put(new ws(), ioVar.f36926h);
            }
            return new C11344b(this.f36918a, hashMap);
        }
    }

    private io() {
    }

    /* renamed from: a */
    public static C9128a m45469a() {
        return new C9128a();
    }

    public final DescriptorFactory<C11344b, io> getDescriptorFactory() {
        return new C11345c();
    }
}
