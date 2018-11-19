package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class er implements EtlEvent {
    /* renamed from: a */
    private String f36668a;
    /* renamed from: b */
    private Boolean f36669b;
    /* renamed from: c */
    private String f36670c;
    /* renamed from: d */
    private String f36671d;

    /* renamed from: com.tinder.etl.event.er$a */
    public static class C9076a {
        /* renamed from: a */
        private er f31273a;

        private C9076a() {
            this.f31273a = new er();
        }

        /* renamed from: a */
        public final C9076a m38221a(String str) {
            this.f31273a.f36668a = str;
            return this;
        }

        /* renamed from: a */
        public final C9076a m38220a(Boolean bool) {
            this.f31273a.f36669b = bool;
            return this;
        }

        /* renamed from: b */
        public final C9076a m38223b(String str) {
            this.f31273a.f36670c = str;
            return this;
        }

        /* renamed from: c */
        public final C9076a m38224c(String str) {
            this.f31273a.f36671d = str;
            return this;
        }

        /* renamed from: a */
        public er m38222a() {
            return this.f31273a;
        }
    }

    /* renamed from: com.tinder.etl.event.er$b */
    public class C11287b extends fw {
        /* renamed from: a */
        final /* synthetic */ er f36666a;

        /* renamed from: a */
        public String mo10346a() {
            return "DeepLink.ShareID";
        }

        public C11287b(er erVar, Map<EtlField<?>, Object> map) {
            this.f36666a = erVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.er$c */
    private final class C11288c implements DescriptorFactory<C11287b, er> {
        /* renamed from: a */
        final /* synthetic */ er f36667a;

        private C11288c(er erVar) {
            this.f36667a = erVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45010a((er) etlEvent);
        }

        /* renamed from: a */
        public final C11287b m45010a(er erVar) {
            Map hashMap = new HashMap();
            if (erVar.f36668a != null) {
                hashMap.put(new C11401o(), erVar.f36668a);
            }
            if (erVar.f36669b != null) {
                hashMap.put(new dw(), erVar.f36669b);
            }
            if (erVar.f36670c != null) {
                hashMap.put(new uw(), erVar.f36670c);
            }
            if (erVar.f36671d != null) {
                hashMap.put(new wn(), erVar.f36671d);
            }
            return new C11287b(this.f36667a, hashMap);
        }
    }

    private er() {
    }

    /* renamed from: a */
    public static C9076a m45011a() {
        return new C9076a();
    }

    public final DescriptorFactory<C11287b, er> getDescriptorFactory() {
        return new C11288c();
    }
}
