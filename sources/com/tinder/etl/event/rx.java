package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class rx implements EtlEvent {

    /* renamed from: com.tinder.etl.event.rx$a */
    public static class C9238a {
        /* renamed from: a */
        private rx f31355a;

        private C9238a() {
            this.f31355a = new rx();
        }

        /* renamed from: a */
        public rx m38683a() {
            return this.f31355a;
        }
    }

    /* renamed from: com.tinder.etl.event.rx$b */
    public class C11463b extends fw {
        /* renamed from: a */
        final /* synthetic */ rx f37267a;

        /* renamed from: a */
        public String mo10346a() {
            return "Profile.GenderFeatureView";
        }

        public C11463b(rx rxVar, Map<EtlField<?>, Object> map) {
            this.f37267a = rxVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.rx$c */
    private final class C11464c implements DescriptorFactory<C11463b, rx> {
        /* renamed from: a */
        final /* synthetic */ rx f37268a;

        private C11464c(rx rxVar) {
            this.f37268a = rxVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46072a((rx) etlEvent);
        }

        /* renamed from: a */
        public final C11463b m46072a(rx rxVar) {
            return new C11463b(this.f37268a, new HashMap());
        }
    }

    private rx() {
    }

    /* renamed from: a */
    public static C9238a m46073a() {
        return new C9238a();
    }

    public final DescriptorFactory<C11463b, rx> getDescriptorFactory() {
        return new C11464c();
    }
}
