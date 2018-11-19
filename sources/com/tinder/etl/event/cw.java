package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class cw implements EtlEvent {
    /* renamed from: a */
    private String f36328a;
    /* renamed from: b */
    private String f36329b;
    /* renamed from: c */
    private String f36330c;
    /* renamed from: d */
    private Number f36331d;
    /* renamed from: e */
    private Number f36332e;
    /* renamed from: f */
    private String f36333f;
    /* renamed from: g */
    private String f36334g;

    /* renamed from: com.tinder.etl.event.cw$a */
    public static class C9016a {
        /* renamed from: a */
        private cw f31243a;

        private C9016a() {
            this.f31243a = new cw();
        }

        /* renamed from: a */
        public final C9016a m37941a(String str) {
            this.f31243a.f36328a = str;
            return this;
        }

        /* renamed from: b */
        public final C9016a m37944b(String str) {
            this.f31243a.f36329b = str;
            return this;
        }

        /* renamed from: c */
        public final C9016a m37945c(String str) {
            this.f31243a.f36330c = str;
            return this;
        }

        /* renamed from: a */
        public final C9016a m37940a(Number number) {
            this.f31243a.f36331d = number;
            return this;
        }

        /* renamed from: b */
        public final C9016a m37943b(Number number) {
            this.f31243a.f36332e = number;
            return this;
        }

        /* renamed from: d */
        public final C9016a m37946d(String str) {
            this.f31243a.f36333f = str;
            return this;
        }

        /* renamed from: e */
        public final C9016a m37947e(String str) {
            this.f31243a.f36334g = str;
            return this;
        }

        /* renamed from: a */
        public cw m37942a() {
            return this.f31243a;
        }
    }

    /* renamed from: com.tinder.etl.event.cw$b */
    public class C11224b extends fw {
        /* renamed from: a */
        final /* synthetic */ cw f36326a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.Block";
        }

        public C11224b(cw cwVar, Map<EtlField<?>, Object> map) {
            this.f36326a = cwVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.cw$c */
    private final class C11225c implements DescriptorFactory<C11224b, cw> {
        /* renamed from: a */
        final /* synthetic */ cw f36327a;

        private C11225c(cw cwVar) {
            this.f36327a = cwVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44390a((cw) etlEvent);
        }

        /* renamed from: a */
        public final C11224b m44390a(cw cwVar) {
            Map hashMap = new HashMap();
            if (cwVar.f36328a != null) {
                hashMap.put(new kb(), cwVar.f36328a);
            }
            if (cwVar.f36329b != null) {
                hashMap.put(new ll(), cwVar.f36329b);
            }
            if (cwVar.f36330c != null) {
                hashMap.put(new lx(), cwVar.f36330c);
            }
            if (cwVar.f36331d != null) {
                hashMap.put(new nx(), cwVar.f36331d);
            }
            if (cwVar.f36332e != null) {
                hashMap.put(new ny(), cwVar.f36332e);
            }
            if (cwVar.f36333f != null) {
                hashMap.put(new ov(), cwVar.f36333f);
            }
            if (cwVar.f36334g != null) {
                hashMap.put(new uy(), cwVar.f36334g);
            }
            return new C11224b(this.f36327a, hashMap);
        }
    }

    private cw() {
    }

    /* renamed from: a */
    public static C9016a m44391a() {
        return new C9016a();
    }

    public final DescriptorFactory<C11224b, cw> getDescriptorFactory() {
        return new C11225c();
    }
}
