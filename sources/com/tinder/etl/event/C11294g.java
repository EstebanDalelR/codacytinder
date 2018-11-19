package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.g */
public final class C11294g implements EtlEvent {
    /* renamed from: a */
    private String f36677a;

    /* renamed from: com.tinder.etl.event.g$a */
    public static class C9080a {
        /* renamed from: a */
        private C11294g f31276a;

        private C9080a() {
            this.f31276a = new C11294g();
        }

        /* renamed from: a */
        public final C9080a m38229a(String str) {
            this.f31276a.f36677a = str;
            return this;
        }

        /* renamed from: a */
        public C11294g m38230a() {
            return this.f31276a;
        }
    }

    /* renamed from: com.tinder.etl.event.g$b */
    public class C11292b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11294g f36675a;

        /* renamed from: a */
        public String mo10346a() {
            return "Account.InstagramLogoutSuccess";
        }

        public C11292b(C11294g c11294g, Map<EtlField<?>, Object> map) {
            this.f36675a = c11294g;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.g$c */
    private final class C11293c implements DescriptorFactory<C11292b, C11294g> {
        /* renamed from: a */
        final /* synthetic */ C11294g f36676a;

        private C11293c(C11294g c11294g) {
            this.f36676a = c11294g;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45026a((C11294g) etlEvent);
        }

        /* renamed from: a */
        public final C11292b m45026a(C11294g c11294g) {
            Map hashMap = new HashMap();
            if (c11294g.f36677a != null) {
                hashMap.put(new jj(), c11294g.f36677a);
            }
            return new C11292b(this.f36676a, hashMap);
        }
    }

    private C11294g() {
    }

    /* renamed from: a */
    public static C9080a m45027a() {
        return new C9080a();
    }

    public final DescriptorFactory<C11292b, C11294g> getDescriptorFactory() {
        return new C11293c();
    }
}
