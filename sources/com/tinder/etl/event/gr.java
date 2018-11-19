package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class gr implements EtlEvent {
    /* renamed from: a */
    private Number f36776a;
    /* renamed from: b */
    private String f36777b;
    /* renamed from: c */
    private String f36778c;

    /* renamed from: com.tinder.etl.event.gr$a */
    public static class C9098a {
        /* renamed from: a */
        private gr f31285a;

        private C9098a() {
            this.f31285a = new gr();
        }

        /* renamed from: a */
        public final C9098a m38313a(Number number) {
            this.f31285a.f36776a = number;
            return this;
        }

        /* renamed from: a */
        public final C9098a m38314a(String str) {
            this.f31285a.f36777b = str;
            return this;
        }

        /* renamed from: b */
        public final C9098a m38316b(String str) {
            this.f31285a.f36778c = str;
            return this;
        }

        /* renamed from: a */
        public gr m38315a() {
            return this.f31285a;
        }
    }

    /* renamed from: com.tinder.etl.event.gr$b */
    public class C11311b extends fw {
        /* renamed from: a */
        final /* synthetic */ gr f36774a;

        /* renamed from: a */
        public String mo10346a() {
            return "Feedback.Session";
        }

        public C11311b(gr grVar, Map<EtlField<?>, Object> map) {
            this.f36774a = grVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.gr$c */
    private final class C11312c implements DescriptorFactory<C11311b, gr> {
        /* renamed from: a */
        final /* synthetic */ gr f36775a;

        private C11312c(gr grVar) {
            this.f36775a = grVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45209a((gr) etlEvent);
        }

        /* renamed from: a */
        public final C11311b m45209a(gr grVar) {
            Map hashMap = new HashMap();
            if (grVar.f36776a != null) {
                hashMap.put(new fk(), grVar.f36776a);
            }
            if (grVar.f36777b != null) {
                hashMap.put(new gs(), grVar.f36777b);
            }
            if (grVar.f36778c != null) {
                hashMap.put(new wy(), grVar.f36778c);
            }
            return new C11311b(this.f36775a, hashMap);
        }
    }

    private gr() {
    }

    /* renamed from: a */
    public static C9098a m45210a() {
        return new C9098a();
    }

    public final DescriptorFactory<C11311b, gr> getDescriptorFactory() {
        return new C11312c();
    }
}
