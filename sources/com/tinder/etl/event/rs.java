package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class rs implements EtlEvent {

    /* renamed from: com.tinder.etl.event.rs$a */
    public static class C9236a {
        /* renamed from: a */
        private rs f31354a;

        private C9236a() {
            this.f31354a = new rs();
        }

        /* renamed from: a */
        public rs m38682a() {
            return this.f31354a;
        }
    }

    /* renamed from: com.tinder.etl.event.rs$b */
    public class C11461b extends fw {
        /* renamed from: a */
        final /* synthetic */ rs f37265a;

        /* renamed from: a */
        public String mo10346a() {
            return "Profile.Edit";
        }

        public C11461b(rs rsVar, Map<EtlField<?>, Object> map) {
            this.f37265a = rsVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.rs$c */
    private final class C11462c implements DescriptorFactory<C11461b, rs> {
        /* renamed from: a */
        final /* synthetic */ rs f37266a;

        private C11462c(rs rsVar) {
            this.f37266a = rsVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46069a((rs) etlEvent);
        }

        /* renamed from: a */
        public final C11461b m46069a(rs rsVar) {
            return new C11461b(this.f37266a, new HashMap());
        }
    }

    private rs() {
    }

    /* renamed from: a */
    public static C9236a m46070a() {
        return new C9236a();
    }

    public final DescriptorFactory<C11461b, rs> getDescriptorFactory() {
        return new C11462c();
    }
}
