package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class tv implements EtlEvent {
    /* renamed from: a */
    private Boolean f37360a;
    /* renamed from: b */
    private Number f37361b;
    /* renamed from: c */
    private Number f37362c;
    /* renamed from: d */
    private String f37363d;
    /* renamed from: e */
    private Number f37364e;
    /* renamed from: f */
    private Number f37365f;
    /* renamed from: g */
    private Number f37366g;

    /* renamed from: com.tinder.etl.event.tv$a */
    public static class C9266a {
        /* renamed from: a */
        private tv f31369a;

        private C9266a() {
            this.f31369a = new tv();
        }

        /* renamed from: a */
        public final C9266a m38738a(Boolean bool) {
            this.f31369a.f37360a = bool;
            return this;
        }

        /* renamed from: a */
        public final C9266a m38740a(String str) {
            this.f31369a.f37363d = str;
            return this;
        }

        /* renamed from: a */
        public final C9266a m38739a(Number number) {
            this.f31369a.f37365f = number;
            return this;
        }

        /* renamed from: b */
        public final C9266a m38742b(Number number) {
            this.f31369a.f37366g = number;
            return this;
        }

        /* renamed from: a */
        public tv m38741a() {
            return this.f31369a;
        }
    }

    /* renamed from: com.tinder.etl.event.tv$b */
    public class C11493b extends fw {
        /* renamed from: a */
        final /* synthetic */ tv f37358a;

        /* renamed from: a */
        public String mo10346a() {
            return "Recs.AllPhotos";
        }

        public C11493b(tv tvVar, Map<EtlField<?>, Object> map) {
            this.f37358a = tvVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.tv$c */
    private final class C11494c implements DescriptorFactory<C11493b, tv> {
        /* renamed from: a */
        final /* synthetic */ tv f37359a;

        private C11494c(tv tvVar) {
            this.f37359a = tvVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46218a((tv) etlEvent);
        }

        /* renamed from: a */
        public final C11493b m46218a(tv tvVar) {
            Map hashMap = new HashMap();
            if (tvVar.f37360a != null) {
                hashMap.put(new jy(), tvVar.f37360a);
            }
            if (tvVar.f37361b != null) {
                hashMap.put(new lf(), tvVar.f37361b);
            }
            if (tvVar.f37362c != null) {
                hashMap.put(new ma(), tvVar.f37362c);
            }
            if (tvVar.f37363d != null) {
                hashMap.put(new ov(), tvVar.f37363d);
            }
            if (tvVar.f37364e != null) {
                hashMap.put(new pp(), tvVar.f37364e);
            }
            if (tvVar.f37365f != null) {
                hashMap.put(new pt(), tvVar.f37365f);
            }
            if (tvVar.f37366g != null) {
                hashMap.put(new pu(), tvVar.f37366g);
            }
            return new C11493b(this.f37359a, hashMap);
        }
    }

    private tv() {
    }

    /* renamed from: a */
    public static C9266a m46219a() {
        return new C9266a();
    }

    public final DescriptorFactory<C11493b, tv> getDescriptorFactory() {
        return new C11494c();
    }
}
