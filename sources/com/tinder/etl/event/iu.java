package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class iu implements EtlEvent {
    /* renamed from: a */
    private String f36956a;
    /* renamed from: b */
    private String f36957b;
    /* renamed from: c */
    private String f36958c;

    /* renamed from: com.tinder.etl.event.iu$a */
    public static class C9140a {
        /* renamed from: a */
        private iu f31306a;

        private C9140a() {
            this.f31306a = new iu();
        }

        /* renamed from: a */
        public final C9140a m38460a(String str) {
            this.f31306a.f36956a = str;
            return this;
        }

        /* renamed from: b */
        public final C9140a m38462b(String str) {
            this.f31306a.f36957b = str;
            return this;
        }

        /* renamed from: c */
        public final C9140a m38463c(String str) {
            this.f31306a.f36958c = str;
            return this;
        }

        /* renamed from: a */
        public iu m38461a() {
            return this.f31306a;
        }
    }

    /* renamed from: com.tinder.etl.event.iu$b */
    public class C11356b extends fw {
        /* renamed from: a */
        final /* synthetic */ iu f36954a;

        /* renamed from: a */
        public String mo10346a() {
            return "GrandGesture.ShowIntro";
        }

        public C11356b(iu iuVar, Map<EtlField<?>, Object> map) {
            this.f36954a = iuVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.iu$c */
    private final class C11357c implements DescriptorFactory<C11356b, iu> {
        /* renamed from: a */
        final /* synthetic */ iu f36955a;

        private C11357c(iu iuVar) {
            this.f36955a = iuVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45536a((iu) etlEvent);
        }

        /* renamed from: a */
        public final C11356b m45536a(iu iuVar) {
            Map hashMap = new HashMap();
            if (iuVar.f36956a != null) {
                hashMap.put(new hx(), iuVar.f36956a);
            }
            if (iuVar.f36957b != null) {
                hashMap.put(new ll(), iuVar.f36957b);
            }
            if (iuVar.f36958c != null) {
                hashMap.put(new ov(), iuVar.f36958c);
            }
            return new C11356b(this.f36955a, hashMap);
        }
    }

    private iu() {
    }

    /* renamed from: a */
    public static C9140a m45537a() {
        return new C9140a();
    }

    public final DescriptorFactory<C11356b, iu> getDescriptorFactory() {
        return new C11357c();
    }
}
