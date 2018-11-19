package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ac implements EtlEvent {
    /* renamed from: a */
    private Number f36126a;
    /* renamed from: b */
    private Number f36127b;
    /* renamed from: c */
    private Number f36128c;
    /* renamed from: d */
    private Number f36129d;
    /* renamed from: e */
    private String f36130e;
    /* renamed from: f */
    private String f36131f;
    /* renamed from: g */
    private Boolean f36132g;
    /* renamed from: h */
    private String f36133h;

    /* renamed from: com.tinder.etl.event.ac$a */
    public static class C8966a {
        /* renamed from: a */
        private ac f31218a;

        private C8966a() {
            this.f31218a = new ac();
        }

        /* renamed from: a */
        public final C8966a m37780a(Number number) {
            this.f31218a.f36126a = number;
            return this;
        }

        /* renamed from: b */
        public final C8966a m37783b(Number number) {
            this.f31218a.f36127b = number;
            return this;
        }

        /* renamed from: c */
        public final C8966a m37785c(Number number) {
            this.f31218a.f36128c = number;
            return this;
        }

        /* renamed from: d */
        public final C8966a m37786d(Number number) {
            this.f31218a.f36129d = number;
            return this;
        }

        /* renamed from: a */
        public final C8966a m37781a(String str) {
            this.f31218a.f36130e = str;
            return this;
        }

        /* renamed from: b */
        public final C8966a m37784b(String str) {
            this.f31218a.f36131f = str;
            return this;
        }

        /* renamed from: a */
        public final C8966a m37779a(Boolean bool) {
            this.f31218a.f36132g = bool;
            return this;
        }

        /* renamed from: a */
        public ac m37782a() {
            return this.f31218a;
        }
    }

    /* renamed from: com.tinder.etl.event.ac$b */
    public class C11172b extends fw {
        /* renamed from: a */
        final /* synthetic */ ac f36124a;

        /* renamed from: a */
        public String mo10346a() {
            return "Ad.Play";
        }

        public C11172b(ac acVar, Map<EtlField<?>, Object> map) {
            this.f36124a = acVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ac$c */
    private final class C11173c implements DescriptorFactory<C11172b, ac> {
        /* renamed from: a */
        final /* synthetic */ ac f36125a;

        private C11173c(ac acVar) {
            this.f36125a = acVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44027a((ac) etlEvent);
        }

        /* renamed from: a */
        public final C11172b m44027a(ac acVar) {
            Map hashMap = new HashMap();
            if (acVar.f36126a != null) {
                hashMap.put(new C11413q(), acVar.f36126a);
            }
            if (acVar.f36127b != null) {
                hashMap.put(new C11582z(), acVar.f36127b);
            }
            if (acVar.f36128c != null) {
                hashMap.put(new ad(), acVar.f36128c);
            }
            if (acVar.f36129d != null) {
                hashMap.put(new aj(), acVar.f36129d);
            }
            if (acVar.f36130e != null) {
                hashMap.put(new cr(), acVar.f36130e);
            }
            if (acVar.f36131f != null) {
                hashMap.put(new eh(), acVar.f36131f);
            }
            if (acVar.f36132g != null) {
                hashMap.put(new ms(), acVar.f36132g);
            }
            if (acVar.f36133h != null) {
                hashMap.put(new xe(), acVar.f36133h);
            }
            return new C11172b(this.f36125a, hashMap);
        }
    }

    private ac() {
    }

    /* renamed from: a */
    public static C8966a m44028a() {
        return new C8966a();
    }

    public final DescriptorFactory<C11172b, ac> getDescriptorFactory() {
        return new C11173c();
    }
}
