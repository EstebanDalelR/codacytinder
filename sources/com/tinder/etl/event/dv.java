package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class dv implements EtlEvent {
    /* renamed from: a */
    private String f36651a;
    /* renamed from: b */
    private String f36652b;
    /* renamed from: c */
    private String f36653c;
    /* renamed from: d */
    private String f36654d;
    /* renamed from: e */
    private String f36655e;
    /* renamed from: f */
    private Map f36656f;

    /* renamed from: com.tinder.etl.event.dv$a */
    public static class C9066a {
        /* renamed from: a */
        private dv f31268a;

        private C9066a() {
            this.f31268a = new dv();
        }

        /* renamed from: a */
        public final C9066a m38210a(String str) {
            this.f31268a.f36651a = str;
            return this;
        }

        /* renamed from: b */
        public final C9066a m38213b(String str) {
            this.f31268a.f36652b = str;
            return this;
        }

        /* renamed from: c */
        public final C9066a m38214c(String str) {
            this.f31268a.f36654d = str;
            return this;
        }

        /* renamed from: a */
        public final C9066a m38211a(Map map) {
            this.f31268a.f36656f = map;
            return this;
        }

        /* renamed from: a */
        public dv m38212a() {
            return this.f31268a;
        }
    }

    /* renamed from: com.tinder.etl.event.dv$b */
    public class C11276b extends fw {
        /* renamed from: a */
        final /* synthetic */ dv f36649a;

        /* renamed from: a */
        public String mo10346a() {
            return "Client.UnifiedEvent";
        }

        public C11276b(dv dvVar, Map<EtlField<?>, Object> map) {
            this.f36649a = dvVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.dv$c */
    private final class C11277c implements DescriptorFactory<C11276b, dv> {
        /* renamed from: a */
        final /* synthetic */ dv f36650a;

        private C11277c(dv dvVar) {
            this.f36650a = dvVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44983a((dv) etlEvent);
        }

        /* renamed from: a */
        public final C11276b m44983a(dv dvVar) {
            Map hashMap = new HashMap();
            if (dvVar.f36651a != null) {
                hashMap.put(new ng(), dvVar.f36651a);
            }
            if (dvVar.f36652b != null) {
                hashMap.put(new nh(), dvVar.f36652b);
            }
            if (dvVar.f36653c != null) {
                hashMap.put(new nb(), dvVar.f36653c);
            }
            if (dvVar.f36654d != null) {
                hashMap.put(new na(), dvVar.f36654d);
            }
            if (dvVar.f36655e != null) {
                hashMap.put(new nj(), dvVar.f36655e);
            }
            if (dvVar.f36656f != null) {
                hashMap.put(new pf(), dvVar.f36656f);
            }
            return new C11276b(this.f36650a, hashMap);
        }
    }

    private dv() {
    }

    /* renamed from: a */
    public static C9066a m44984a() {
        return new C9066a();
    }

    public final DescriptorFactory<C11276b, dv> getDescriptorFactory() {
        return new C11277c();
    }
}
