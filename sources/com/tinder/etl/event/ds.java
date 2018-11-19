package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ds implements EtlEvent {
    /* renamed from: a */
    private Boolean f36616a;
    /* renamed from: b */
    private Boolean f36617b;
    /* renamed from: c */
    private String f36618c;
    /* renamed from: d */
    private String f36619d;
    /* renamed from: e */
    private String f36620e;
    /* renamed from: f */
    private Number f36621f;
    /* renamed from: g */
    private Number f36622g;
    /* renamed from: h */
    private String f36623h;
    /* renamed from: i */
    private Boolean f36624i;

    /* renamed from: com.tinder.etl.event.ds$a */
    public static class C9060a {
        /* renamed from: a */
        private ds f31265a;

        private C9060a() {
            this.f31265a = new ds();
        }

        /* renamed from: a */
        public final C9060a m38180a(Boolean bool) {
            this.f31265a.f36616a = bool;
            return this;
        }

        /* renamed from: a */
        public final C9060a m38182a(String str) {
            this.f31265a.f36618c = str;
            return this;
        }

        /* renamed from: b */
        public final C9060a m38186b(String str) {
            this.f31265a.f36619d = str;
            return this;
        }

        /* renamed from: c */
        public final C9060a m38187c(String str) {
            this.f31265a.f36620e = str;
            return this;
        }

        /* renamed from: a */
        public final C9060a m38181a(Number number) {
            this.f31265a.f36621f = number;
            return this;
        }

        /* renamed from: b */
        public final C9060a m38185b(Number number) {
            this.f31265a.f36622g = number;
            return this;
        }

        /* renamed from: d */
        public final C9060a m38188d(String str) {
            this.f31265a.f36623h = str;
            return this;
        }

        /* renamed from: b */
        public final C9060a m38184b(Boolean bool) {
            this.f31265a.f36624i = bool;
            return this;
        }

        /* renamed from: a */
        public ds m38183a() {
            return this.f31265a;
        }
    }

    /* renamed from: com.tinder.etl.event.ds$b */
    public class C11270b extends fw {
        /* renamed from: a */
        final /* synthetic */ ds f36614a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.TapTextInput";
        }

        public C11270b(ds dsVar, Map<EtlField<?>, Object> map) {
            this.f36614a = dsVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ds$c */
    private final class C11271c implements DescriptorFactory<C11270b, ds> {
        /* renamed from: a */
        final /* synthetic */ ds f36615a;

        private C11271c(ds dsVar) {
            this.f36615a = dsVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44918a((ds) etlEvent);
        }

        /* renamed from: a */
        public final C11270b m44918a(ds dsVar) {
            Map hashMap = new HashMap();
            if (dsVar.f36616a != null) {
                hashMap.put(new ev(), dsVar.f36616a);
            }
            if (dsVar.f36617b != null) {
                hashMap.put(new ja(), dsVar.f36617b);
            }
            if (dsVar.f36618c != null) {
                hashMap.put(new kb(), dsVar.f36618c);
            }
            if (dsVar.f36619d != null) {
                hashMap.put(new ll(), dsVar.f36619d);
            }
            if (dsVar.f36620e != null) {
                hashMap.put(new lx(), dsVar.f36620e);
            }
            if (dsVar.f36621f != null) {
                hashMap.put(new nx(), dsVar.f36621f);
            }
            if (dsVar.f36622g != null) {
                hashMap.put(new ny(), dsVar.f36622g);
            }
            if (dsVar.f36623h != null) {
                hashMap.put(new ov(), dsVar.f36623h);
            }
            if (dsVar.f36624i != null) {
                hashMap.put(new xh(), dsVar.f36624i);
            }
            return new C11270b(this.f36615a, hashMap);
        }
    }

    private ds() {
    }

    /* renamed from: a */
    public static C9060a m44919a() {
        return new C9060a();
    }

    public final DescriptorFactory<C11270b, ds> getDescriptorFactory() {
        return new C11271c();
    }
}
