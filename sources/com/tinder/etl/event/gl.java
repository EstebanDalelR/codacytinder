package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class gl implements EtlEvent {
    /* renamed from: a */
    private String f36736a;

    /* renamed from: com.tinder.etl.event.gl$a */
    public static class C9090a {
        /* renamed from: a */
        private gl f31281a;

        private C9090a() {
            this.f31281a = new gl();
        }

        /* renamed from: a */
        public final C9090a m38279a(String str) {
            this.f31281a.f36736a = str;
            return this;
        }

        /* renamed from: a */
        public gl m38280a() {
            return this.f31281a;
        }
    }

    /* renamed from: com.tinder.etl.event.gl$b */
    public class C11303b extends fw {
        /* renamed from: a */
        final /* synthetic */ gl f36734a;

        /* renamed from: a */
        public String mo10346a() {
            return "Feed.ShowBadge";
        }

        public C11303b(gl glVar, Map<EtlField<?>, Object> map) {
            this.f36734a = glVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.gl$c */
    private final class C11304c implements DescriptorFactory<C11303b, gl> {
        /* renamed from: a */
        final /* synthetic */ gl f36735a;

        private C11304c(gl glVar) {
            this.f36735a = glVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45135a((gl) etlEvent);
        }

        /* renamed from: a */
        public final C11303b m45135a(gl glVar) {
            Map hashMap = new HashMap();
            if (glVar.f36736a != null) {
                hashMap.put(new wy(), glVar.f36736a);
            }
            return new C11303b(this.f36735a, hashMap);
        }
    }

    private gl() {
    }

    /* renamed from: a */
    public static C9090a m45136a() {
        return new C9090a();
    }

    public final DescriptorFactory<C11303b, gl> getDescriptorFactory() {
        return new C11304c();
    }
}
