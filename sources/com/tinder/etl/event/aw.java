package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class aw implements EtlEvent {
    /* renamed from: a */
    private String f36217a;

    /* renamed from: com.tinder.etl.event.aw$a */
    public static class C8984a {
        /* renamed from: a */
        private aw f31227a;

        private C8984a() {
            this.f31227a = new aw();
        }

        /* renamed from: a */
        public final C8984a m37850a(String str) {
            this.f31227a.f36217a = str;
            return this;
        }

        /* renamed from: a */
        public aw m37851a() {
            return this.f31227a;
        }
    }

    /* renamed from: com.tinder.etl.event.aw$b */
    public class C11190b extends fw {
        /* renamed from: a */
        final /* synthetic */ aw f36215a;

        /* renamed from: a */
        public String mo10346a() {
            return "App.Session";
        }

        public C11190b(aw awVar, Map<EtlField<?>, Object> map) {
            this.f36215a = awVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.aw$c */
    private final class C11191c implements DescriptorFactory<C11190b, aw> {
        /* renamed from: a */
        final /* synthetic */ aw f36216a;

        private C11191c(aw awVar) {
            this.f36216a = awVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44189a((aw) etlEvent);
        }

        /* renamed from: a */
        public final C11190b m44189a(aw awVar) {
            Map hashMap = new HashMap();
            if (awVar.f36217a != null) {
                hashMap.put(new av(), awVar.f36217a);
            }
            return new C11190b(this.f36216a, hashMap);
        }
    }

    private aw() {
    }

    /* renamed from: a */
    public static C8984a m44190a() {
        return new C8984a();
    }

    public final DescriptorFactory<C11190b, aw> getDescriptorFactory() {
        return new C11191c();
    }
}
