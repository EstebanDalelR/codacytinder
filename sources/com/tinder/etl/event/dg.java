package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class dg implements EtlEvent {
    /* renamed from: a */
    private Number f36454a;
    /* renamed from: b */
    private String f36455b;
    /* renamed from: c */
    private String f36456c;
    /* renamed from: d */
    private Number f36457d;
    /* renamed from: e */
    private Number f36458e;
    /* renamed from: f */
    private String f36459f;

    /* renamed from: com.tinder.etl.event.dg$a */
    public static class C9036a {
        /* renamed from: a */
        private dg f31253a;

        private C9036a() {
            this.f31253a = new dg();
        }

        /* renamed from: a */
        public final C9036a m38048a(Number number) {
            this.f31253a.f36454a = number;
            return this;
        }

        /* renamed from: a */
        public final C9036a m38049a(String str) {
            this.f31253a.f36455b = str;
            return this;
        }

        /* renamed from: b */
        public final C9036a m38051b(String str) {
            this.f31253a.f36456c = str;
            return this;
        }

        /* renamed from: a */
        public dg m38050a() {
            return this.f31253a;
        }
    }

    /* renamed from: com.tinder.etl.event.dg$b */
    public class C11245b extends fw {
        /* renamed from: a */
        final /* synthetic */ dg f36452a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.OpenInstagram";
        }

        public C11245b(dg dgVar, Map<EtlField<?>, Object> map) {
            this.f36452a = dgVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.dg$c */
    private final class C11246c implements DescriptorFactory<C11245b, dg> {
        /* renamed from: a */
        final /* synthetic */ dg f36453a;

        private C11246c(dg dgVar) {
            this.f36453a = dgVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44624a((dg) etlEvent);
        }

        /* renamed from: a */
        public final C11245b m44624a(dg dgVar) {
            Map hashMap = new HashMap();
            if (dgVar.f36454a != null) {
                hashMap.put(new hc(), dgVar.f36454a);
            }
            if (dgVar.f36455b != null) {
                hashMap.put(new ov(), dgVar.f36455b);
            }
            if (dgVar.f36456c != null) {
                hashMap.put(new jj(), dgVar.f36456c);
            }
            if (dgVar.f36457d != null) {
                hashMap.put(new ny(), dgVar.f36457d);
            }
            if (dgVar.f36458e != null) {
                hashMap.put(new nx(), dgVar.f36458e);
            }
            if (dgVar.f36459f != null) {
                hashMap.put(new kb(), dgVar.f36459f);
            }
            return new C11245b(this.f36453a, hashMap);
        }
    }

    private dg() {
    }

    /* renamed from: a */
    public static C9036a m44625a() {
        return new C9036a();
    }

    public final DescriptorFactory<C11245b, dg> getDescriptorFactory() {
        return new C11246c();
    }
}
