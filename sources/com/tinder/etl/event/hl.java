package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class hl implements EtlEvent {
    /* renamed from: a */
    private Number f36796a;
    /* renamed from: b */
    private String f36797b;
    /* renamed from: c */
    private Number f36798c;
    /* renamed from: d */
    private String f36799d;
    /* renamed from: e */
    private String f36800e;
    /* renamed from: f */
    private String f36801f;
    /* renamed from: g */
    private Number f36802g;
    /* renamed from: h */
    private Number f36803h;
    /* renamed from: i */
    private String f36804i;

    /* renamed from: com.tinder.etl.event.hl$a */
    public static class C9104a {
        /* renamed from: a */
        private hl f31288a;

        private C9104a() {
            this.f31288a = new hl();
        }

        /* renamed from: a */
        public final C9104a m38329a(Number number) {
            this.f31288a.f36796a = number;
            return this;
        }

        /* renamed from: a */
        public final C9104a m38330a(String str) {
            this.f31288a.f36797b = str;
            return this;
        }

        /* renamed from: b */
        public final C9104a m38332b(Number number) {
            this.f31288a.f36798c = number;
            return this;
        }

        /* renamed from: b */
        public final C9104a m38333b(String str) {
            this.f31288a.f36799d = str;
            return this;
        }

        /* renamed from: c */
        public final C9104a m38335c(String str) {
            this.f31288a.f36800e = str;
            return this;
        }

        /* renamed from: d */
        public final C9104a m38337d(String str) {
            this.f31288a.f36801f = str;
            return this;
        }

        /* renamed from: c */
        public final C9104a m38334c(Number number) {
            this.f31288a.f36802g = number;
            return this;
        }

        /* renamed from: d */
        public final C9104a m38336d(Number number) {
            this.f31288a.f36803h = number;
            return this;
        }

        /* renamed from: e */
        public final C9104a m38338e(String str) {
            this.f31288a.f36804i = str;
            return this;
        }

        /* renamed from: a */
        public hl m38331a() {
            return this.f31288a;
        }
    }

    /* renamed from: com.tinder.etl.event.hl$b */
    public class C11318b extends fw {
        /* renamed from: a */
        final /* synthetic */ hl f36794a;

        /* renamed from: a */
        public String mo10346a() {
            return "GIF.Search";
        }

        public C11318b(hl hlVar, Map<EtlField<?>, Object> map) {
            this.f36794a = hlVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.hl$c */
    private final class C11319c implements DescriptorFactory<C11318b, hl> {
        /* renamed from: a */
        final /* synthetic */ hl f36795a;

        private C11319c(hl hlVar) {
            this.f36795a = hlVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45245a((hl) etlEvent);
        }

        /* renamed from: a */
        public final C11318b m45245a(hl hlVar) {
            Map hashMap = new HashMap();
            if (hlVar.f36796a != null) {
                hashMap.put(new ef(), hlVar.f36796a);
            }
            if (hlVar.f36797b != null) {
                hashMap.put(new id(), hlVar.f36797b);
            }
            if (hlVar.f36798c != null) {
                hashMap.put(new ie(), hlVar.f36798c);
            }
            if (hlVar.f36799d != null) {
                hashMap.put(new kb(), hlVar.f36799d);
            }
            if (hlVar.f36800e != null) {
                hashMap.put(new ll(), hlVar.f36800e);
            }
            if (hlVar.f36801f != null) {
                hashMap.put(new lx(), hlVar.f36801f);
            }
            if (hlVar.f36802g != null) {
                hashMap.put(new nx(), hlVar.f36802g);
            }
            if (hlVar.f36803h != null) {
                hashMap.put(new ny(), hlVar.f36803h);
            }
            if (hlVar.f36804i != null) {
                hashMap.put(new ov(), hlVar.f36804i);
            }
            return new C11318b(this.f36795a, hashMap);
        }
    }

    private hl() {
    }

    /* renamed from: a */
    public static C9104a m45246a() {
        return new C9104a();
    }

    public final DescriptorFactory<C11318b, hl> getDescriptorFactory() {
        return new C11319c();
    }
}
