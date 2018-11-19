package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.d */
public final class C11232d implements EtlEvent {

    /* renamed from: com.tinder.etl.event.d$a */
    public static class C9022a {
        /* renamed from: a */
        private C11232d f31246a;

        private C9022a() {
            this.f31246a = new C11232d();
        }

        /* renamed from: a */
        public C11232d m37969a() {
            return this.f31246a;
        }
    }

    /* renamed from: com.tinder.etl.event.d$b */
    public class C11230b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11232d f36358a;

        /* renamed from: a */
        public String mo10346a() {
            return "Account.InstagramLoginFail";
        }

        public C11230b(C11232d c11232d, Map<EtlField<?>, Object> map) {
            this.f36358a = c11232d;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.d$c */
    private final class C11231c implements DescriptorFactory<C11230b, C11232d> {
        /* renamed from: a */
        final /* synthetic */ C11232d f36359a;

        private C11231c(C11232d c11232d) {
            this.f36359a = c11232d;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44451a((C11232d) etlEvent);
        }

        /* renamed from: a */
        public final C11230b m44451a(C11232d c11232d) {
            return new C11230b(this.f36359a, new HashMap());
        }
    }

    private C11232d() {
    }

    /* renamed from: a */
    public static C9022a m44452a() {
        return new C9022a();
    }

    public final DescriptorFactory<C11230b, C11232d> getDescriptorFactory() {
        return new C11231c();
    }
}
