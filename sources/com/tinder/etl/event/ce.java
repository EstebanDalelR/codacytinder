package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ce implements EtlEvent {
    /* renamed from: a */
    private Number f36296a;
    /* renamed from: b */
    private String f36297b;
    /* renamed from: c */
    private Number f36298c;
    /* renamed from: d */
    private Number f36299d;
    /* renamed from: e */
    private Boolean f36300e;

    /* renamed from: com.tinder.etl.event.ce$a */
    public static class C9006a {
        /* renamed from: a */
        private ce f31238a;

        private C9006a() {
            this.f31238a = new ce();
        }

        /* renamed from: a */
        public final C9006a m37919a(Number number) {
            this.f31238a.f36296a = number;
            return this;
        }

        /* renamed from: a */
        public final C9006a m37920a(String str) {
            this.f31238a.f36297b = str;
            return this;
        }

        /* renamed from: b */
        public final C9006a m37922b(Number number) {
            this.f31238a.f36299d = number;
            return this;
        }

        /* renamed from: a */
        public final C9006a m37918a(Boolean bool) {
            this.f31238a.f36300e = bool;
            return this;
        }

        /* renamed from: a */
        public ce m37921a() {
            return this.f31238a;
        }
    }

    /* renamed from: com.tinder.etl.event.ce$b */
    public class C11214b extends fw {
        /* renamed from: a */
        final /* synthetic */ ce f36294a;

        /* renamed from: a */
        public String mo10346a() {
            return "Boost.ProgressView";
        }

        public C11214b(ce ceVar, Map<EtlField<?>, Object> map) {
            this.f36294a = ceVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ce$c */
    private final class C11215c implements DescriptorFactory<C11214b, ce> {
        /* renamed from: a */
        final /* synthetic */ ce f36295a;

        private C11215c(ce ceVar) {
            this.f36295a = ceVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44336a((ce) etlEvent);
        }

        /* renamed from: a */
        public final C11214b m44336a(ce ceVar) {
            Map hashMap = new HashMap();
            if (ceVar.f36296a != null) {
                hashMap.put(new bw(), ceVar.f36296a);
            }
            if (ceVar.f36297b != null) {
                hashMap.put(new bx(), ceVar.f36297b);
            }
            if (ceVar.f36298c != null) {
                hashMap.put(new by(), ceVar.f36298c);
            }
            if (ceVar.f36299d != null) {
                hashMap.put(new cf(), ceVar.f36299d);
            }
            if (ceVar.f36300e != null) {
                hashMap.put(new iz(), ceVar.f36300e);
            }
            return new C11214b(this.f36295a, hashMap);
        }
    }

    private ce() {
    }

    /* renamed from: a */
    public static C9006a m44337a() {
        return new C9006a();
    }

    public final DescriptorFactory<C11214b, ce> getDescriptorFactory() {
        return new C11215c();
    }
}
