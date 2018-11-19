package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.f */
public final class C11291f implements EtlEvent {
    /* renamed from: a */
    private String f36674a;

    /* renamed from: com.tinder.etl.event.f$a */
    public static class C9078a {
        /* renamed from: a */
        private C11291f f31274a;

        private C9078a() {
            this.f31274a = new C11291f();
        }

        /* renamed from: a */
        public final C9078a m38225a(String str) {
            this.f31274a.f36674a = str;
            return this;
        }

        /* renamed from: a */
        public C11291f m38226a() {
            return this.f31274a;
        }
    }

    /* renamed from: com.tinder.etl.event.f$b */
    public class C11289b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11291f f36672a;

        /* renamed from: a */
        public String mo10346a() {
            return "Account.InstagramLogoutFail";
        }

        public C11289b(C11291f c11291f, Map<EtlField<?>, Object> map) {
            this.f36672a = c11291f;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.f$c */
    private final class C11290c implements DescriptorFactory<C11289b, C11291f> {
        /* renamed from: a */
        final /* synthetic */ C11291f f36673a;

        private C11290c(C11291f c11291f) {
            this.f36673a = c11291f;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45021a((C11291f) etlEvent);
        }

        /* renamed from: a */
        public final C11289b m45021a(C11291f c11291f) {
            Map hashMap = new HashMap();
            if (c11291f.f36674a != null) {
                hashMap.put(new jj(), c11291f.f36674a);
            }
            return new C11289b(this.f36673a, hashMap);
        }
    }

    private C11291f() {
    }

    /* renamed from: a */
    public static C9078a m45022a() {
        return new C9078a();
    }

    public final DescriptorFactory<C11289b, C11291f> getDescriptorFactory() {
        return new C11290c();
    }
}
