package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class hm implements EtlEvent {
    /* renamed from: a */
    private String f36807a;
    /* renamed from: b */
    private String f36808b;
    /* renamed from: c */
    private String f36809c;
    /* renamed from: d */
    private Number f36810d;
    /* renamed from: e */
    private Number f36811e;
    /* renamed from: f */
    private String f36812f;

    /* renamed from: com.tinder.etl.event.hm$a */
    public static class C9106a {
        /* renamed from: a */
        private hm f31289a;

        private C9106a() {
            this.f31289a = new hm();
        }

        /* renamed from: a */
        public final C9106a m38340a(String str) {
            this.f31289a.f36807a = str;
            return this;
        }

        /* renamed from: b */
        public final C9106a m38343b(String str) {
            this.f31289a.f36808b = str;
            return this;
        }

        /* renamed from: c */
        public final C9106a m38344c(String str) {
            this.f31289a.f36809c = str;
            return this;
        }

        /* renamed from: a */
        public final C9106a m38339a(Number number) {
            this.f31289a.f36810d = number;
            return this;
        }

        /* renamed from: b */
        public final C9106a m38342b(Number number) {
            this.f31289a.f36811e = number;
            return this;
        }

        /* renamed from: d */
        public final C9106a m38345d(String str) {
            this.f31289a.f36812f = str;
            return this;
        }

        /* renamed from: a */
        public hm m38341a() {
            return this.f31289a;
        }
    }

    /* renamed from: com.tinder.etl.event.hm$b */
    public class C11320b extends fw {
        /* renamed from: a */
        final /* synthetic */ hm f36805a;

        /* renamed from: a */
        public String mo10346a() {
            return "GIF.SearchHide";
        }

        public C11320b(hm hmVar, Map<EtlField<?>, Object> map) {
            this.f36805a = hmVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.hm$c */
    private final class C11321c implements DescriptorFactory<C11320b, hm> {
        /* renamed from: a */
        final /* synthetic */ hm f36806a;

        private C11321c(hm hmVar) {
            this.f36806a = hmVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45266a((hm) etlEvent);
        }

        /* renamed from: a */
        public final C11320b m45266a(hm hmVar) {
            Map hashMap = new HashMap();
            if (hmVar.f36807a != null) {
                hashMap.put(new kb(), hmVar.f36807a);
            }
            if (hmVar.f36808b != null) {
                hashMap.put(new ll(), hmVar.f36808b);
            }
            if (hmVar.f36809c != null) {
                hashMap.put(new lx(), hmVar.f36809c);
            }
            if (hmVar.f36810d != null) {
                hashMap.put(new nx(), hmVar.f36810d);
            }
            if (hmVar.f36811e != null) {
                hashMap.put(new ny(), hmVar.f36811e);
            }
            if (hmVar.f36812f != null) {
                hashMap.put(new ov(), hmVar.f36812f);
            }
            return new C11320b(this.f36806a, hashMap);
        }
    }

    private hm() {
    }

    /* renamed from: a */
    public static C9106a m45267a() {
        return new C9106a();
    }

    public final DescriptorFactory<C11320b, hm> getDescriptorFactory() {
        return new C11321c();
    }
}
