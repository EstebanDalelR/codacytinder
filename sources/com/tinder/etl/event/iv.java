package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class iv implements EtlEvent {
    /* renamed from: a */
    private String f36961a;
    /* renamed from: b */
    private Number f36962b;
    /* renamed from: c */
    private String f36963c;
    /* renamed from: d */
    private Number f36964d;
    /* renamed from: e */
    private String f36965e;
    /* renamed from: f */
    private String f36966f;
    /* renamed from: g */
    private Boolean f36967g;

    /* renamed from: com.tinder.etl.event.iv$a */
    public static class C9142a {
        /* renamed from: a */
        private iv f31307a;

        private C9142a() {
            this.f31307a = new iv();
        }

        /* renamed from: a */
        public final C9142a m38466a(String str) {
            this.f31307a.f36961a = str;
            return this;
        }

        /* renamed from: a */
        public final C9142a m38465a(Number number) {
            this.f31307a.f36962b = number;
            return this;
        }

        /* renamed from: b */
        public final C9142a m38469b(String str) {
            this.f31307a.f36963c = str;
            return this;
        }

        /* renamed from: b */
        public final C9142a m38468b(Number number) {
            this.f31307a.f36964d = number;
            return this;
        }

        /* renamed from: c */
        public final C9142a m38470c(String str) {
            this.f31307a.f36965e = str;
            return this;
        }

        /* renamed from: d */
        public final C9142a m38471d(String str) {
            this.f31307a.f36966f = str;
            return this;
        }

        /* renamed from: a */
        public final C9142a m38464a(Boolean bool) {
            this.f31307a.f36967g = bool;
            return this;
        }

        /* renamed from: a */
        public iv m38467a() {
            return this.f31307a;
        }
    }

    /* renamed from: com.tinder.etl.event.iv$b */
    public class C11358b extends fw {
        /* renamed from: a */
        final /* synthetic */ iv f36959a;

        /* renamed from: a */
        public String mo10346a() {
            return "GrandGesture.ShowPreview";
        }

        public C11358b(iv ivVar, Map<EtlField<?>, Object> map) {
            this.f36959a = ivVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.iv$c */
    private final class C11359c implements DescriptorFactory<C11358b, iv> {
        /* renamed from: a */
        final /* synthetic */ iv f36960a;

        private C11359c(iv ivVar) {
            this.f36960a = ivVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45545a((iv) etlEvent);
        }

        /* renamed from: a */
        public final C11358b m45545a(iv ivVar) {
            Map hashMap = new HashMap();
            if (ivVar.f36961a != null) {
                hashMap.put(new hr(), ivVar.f36961a);
            }
            if (ivVar.f36962b != null) {
                hashMap.put(new ht(), ivVar.f36962b);
            }
            if (ivVar.f36963c != null) {
                hashMap.put(new hy(), ivVar.f36963c);
            }
            if (ivVar.f36964d != null) {
                hashMap.put(new hz(), ivVar.f36964d);
            }
            if (ivVar.f36965e != null) {
                hashMap.put(new ll(), ivVar.f36965e);
            }
            if (ivVar.f36966f != null) {
                hashMap.put(new ov(), ivVar.f36966f);
            }
            if (ivVar.f36967g != null) {
                hashMap.put(new ww(), ivVar.f36967g);
            }
            return new C11358b(this.f36960a, hashMap);
        }
    }

    private iv() {
    }

    /* renamed from: a */
    public static C9142a m45546a() {
        return new C9142a();
    }

    public final DescriptorFactory<C11358b, iv> getDescriptorFactory() {
        return new C11359c();
    }
}
