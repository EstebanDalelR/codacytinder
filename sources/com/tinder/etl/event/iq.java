package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class iq implements EtlEvent {
    /* renamed from: a */
    private String f36932a;
    /* renamed from: b */
    private String f36933b;
    /* renamed from: c */
    private String f36934c;

    /* renamed from: com.tinder.etl.event.iq$a */
    public static class C9132a {
        /* renamed from: a */
        private iq f31302a;

        private C9132a() {
            this.f31302a = new iq();
        }

        /* renamed from: a */
        public final C9132a m38440a(String str) {
            this.f31302a.f36932a = str;
            return this;
        }

        /* renamed from: b */
        public final C9132a m38442b(String str) {
            this.f31302a.f36933b = str;
            return this;
        }

        /* renamed from: c */
        public final C9132a m38443c(String str) {
            this.f31302a.f36934c = str;
            return this;
        }

        /* renamed from: a */
        public iq m38441a() {
            return this.f31302a;
        }
    }

    /* renamed from: com.tinder.etl.event.iq$b */
    public class C11348b extends fw {
        /* renamed from: a */
        final /* synthetic */ iq f36930a;

        /* renamed from: a */
        public String mo10346a() {
            return "GrandGesture.Close";
        }

        public C11348b(iq iqVar, Map<EtlField<?>, Object> map) {
            this.f36930a = iqVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.iq$c */
    private final class C11349c implements DescriptorFactory<C11348b, iq> {
        /* renamed from: a */
        final /* synthetic */ iq f36931a;

        private C11349c(iq iqVar) {
            this.f36931a = iqVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45492a((iq) etlEvent);
        }

        /* renamed from: a */
        public final C11348b m45492a(iq iqVar) {
            Map hashMap = new HashMap();
            if (iqVar.f36932a != null) {
                hashMap.put(new hp(), iqVar.f36932a);
            }
            if (iqVar.f36933b != null) {
                hashMap.put(new ll(), iqVar.f36933b);
            }
            if (iqVar.f36934c != null) {
                hashMap.put(new ov(), iqVar.f36934c);
            }
            return new C11348b(this.f36931a, hashMap);
        }
    }

    private iq() {
    }

    /* renamed from: a */
    public static C9132a m45493a() {
        return new C9132a();
    }

    public final DescriptorFactory<C11348b, iq> getDescriptorFactory() {
        return new C11349c();
    }
}
