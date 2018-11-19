package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ko implements EtlEvent {
    /* renamed from: a */
    private Number f36990a;
    /* renamed from: b */
    private Number f36991b;
    /* renamed from: c */
    private Number f36992c;
    /* renamed from: d */
    private String f36993d;
    /* renamed from: e */
    private Number f36994e;
    /* renamed from: f */
    private Number f36995f;

    /* renamed from: com.tinder.etl.event.ko$a */
    public static class C9152a {
        /* renamed from: a */
        private ko f31312a;

        private C9152a() {
            this.f31312a = new ko();
        }

        /* renamed from: a */
        public final C9152a m38488a(Number number) {
            this.f31312a.f36990a = number;
            return this;
        }

        /* renamed from: b */
        public final C9152a m38491b(Number number) {
            this.f31312a.f36991b = number;
            return this;
        }

        /* renamed from: c */
        public final C9152a m38492c(Number number) {
            this.f31312a.f36992c = number;
            return this;
        }

        /* renamed from: a */
        public final C9152a m38489a(String str) {
            this.f31312a.f36993d = str;
            return this;
        }

        /* renamed from: d */
        public final C9152a m38493d(Number number) {
            this.f31312a.f36994e = number;
            return this;
        }

        /* renamed from: e */
        public final C9152a m38494e(Number number) {
            this.f31312a.f36995f = number;
            return this;
        }

        /* renamed from: a */
        public ko m38490a() {
            return this.f31312a;
        }
    }

    /* renamed from: com.tinder.etl.event.ko$b */
    public class C11370b extends fw {
        /* renamed from: a */
        final /* synthetic */ ko f36988a;

        /* renamed from: a */
        public String mo10346a() {
            return "LikesYou.List.Exit";
        }

        public C11370b(ko koVar, Map<EtlField<?>, Object> map) {
            this.f36988a = koVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ko$c */
    private final class C11371c implements DescriptorFactory<C11370b, ko> {
        /* renamed from: a */
        final /* synthetic */ ko f36989a;

        private C11371c(ko koVar) {
            this.f36989a = koVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45598a((ko) etlEvent);
        }

        /* renamed from: a */
        public final C11370b m45598a(ko koVar) {
            Map hashMap = new HashMap();
            if (koVar.f36990a != null) {
                hashMap.put(new ky(), koVar.f36990a);
            }
            if (koVar.f36991b != null) {
                hashMap.put(new kz(), koVar.f36991b);
            }
            if (koVar.f36992c != null) {
                hashMap.put(new np(), koVar.f36992c);
            }
            if (koVar.f36993d != null) {
                hashMap.put(new kq(), koVar.f36993d);
            }
            if (koVar.f36994e != null) {
                hashMap.put(new kx(), koVar.f36994e);
            }
            if (koVar.f36995f != null) {
                hashMap.put(new kp(), koVar.f36995f);
            }
            return new C11370b(this.f36989a, hashMap);
        }
    }

    private ko() {
    }

    /* renamed from: a */
    public static C9152a m45599a() {
        return new C9152a();
    }

    public final DescriptorFactory<C11370b, ko> getDescriptorFactory() {
        return new C11371c();
    }
}
