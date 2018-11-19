package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class dh implements EtlEvent {
    /* renamed from: a */
    private Boolean f36462a;
    /* renamed from: b */
    private Boolean f36463b;
    /* renamed from: c */
    private String f36464c;
    /* renamed from: d */
    private String f36465d;
    /* renamed from: e */
    private String f36466e;
    /* renamed from: f */
    private Number f36467f;
    /* renamed from: g */
    private Number f36468g;
    /* renamed from: h */
    private String f36469h;
    /* renamed from: i */
    private String f36470i;
    /* renamed from: j */
    private Boolean f36471j;

    /* renamed from: com.tinder.etl.event.dh$a */
    public static class C9038a {
        /* renamed from: a */
        private dh f31254a;

        private C9038a() {
            this.f31254a = new dh();
        }

        /* renamed from: a */
        public final C9038a m38052a(Boolean bool) {
            this.f31254a.f36462a = bool;
            return this;
        }

        /* renamed from: a */
        public final C9038a m38054a(String str) {
            this.f31254a.f36464c = str;
            return this;
        }

        /* renamed from: b */
        public final C9038a m38058b(String str) {
            this.f31254a.f36465d = str;
            return this;
        }

        /* renamed from: c */
        public final C9038a m38059c(String str) {
            this.f31254a.f36466e = str;
            return this;
        }

        /* renamed from: a */
        public final C9038a m38053a(Number number) {
            this.f31254a.f36467f = number;
            return this;
        }

        /* renamed from: b */
        public final C9038a m38057b(Number number) {
            this.f31254a.f36468g = number;
            return this;
        }

        /* renamed from: d */
        public final C9038a m38060d(String str) {
            this.f31254a.f36469h = str;
            return this;
        }

        /* renamed from: e */
        public final C9038a m38061e(String str) {
            this.f31254a.f36470i = str;
            return this;
        }

        /* renamed from: b */
        public final C9038a m38056b(Boolean bool) {
            this.f31254a.f36471j = bool;
            return this;
        }

        /* renamed from: a */
        public dh m38055a() {
            return this.f31254a;
        }
    }

    /* renamed from: com.tinder.etl.event.dh$b */
    public class C11247b extends fw {
        /* renamed from: a */
        final /* synthetic */ dh f36460a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.OpenProfile";
        }

        public C11247b(dh dhVar, Map<EtlField<?>, Object> map) {
            this.f36460a = dhVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.dh$c */
    private final class C11248c implements DescriptorFactory<C11247b, dh> {
        /* renamed from: a */
        final /* synthetic */ dh f36461a;

        private C11248c(dh dhVar) {
            this.f36461a = dhVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44636a((dh) etlEvent);
        }

        /* renamed from: a */
        public final C11247b m44636a(dh dhVar) {
            Map hashMap = new HashMap();
            if (dhVar.f36462a != null) {
                hashMap.put(new ev(), dhVar.f36462a);
            }
            if (dhVar.f36463b != null) {
                hashMap.put(new ja(), dhVar.f36463b);
            }
            if (dhVar.f36464c != null) {
                hashMap.put(new kb(), dhVar.f36464c);
            }
            if (dhVar.f36465d != null) {
                hashMap.put(new ll(), dhVar.f36465d);
            }
            if (dhVar.f36466e != null) {
                hashMap.put(new lx(), dhVar.f36466e);
            }
            if (dhVar.f36467f != null) {
                hashMap.put(new nx(), dhVar.f36467f);
            }
            if (dhVar.f36468g != null) {
                hashMap.put(new ny(), dhVar.f36468g);
            }
            if (dhVar.f36469h != null) {
                hashMap.put(new oo(), dhVar.f36469h);
            }
            if (dhVar.f36470i != null) {
                hashMap.put(new ov(), dhVar.f36470i);
            }
            if (dhVar.f36471j != null) {
                hashMap.put(new xh(), dhVar.f36471j);
            }
            return new C11247b(this.f36461a, hashMap);
        }
    }

    private dh() {
    }

    /* renamed from: a */
    public static C9038a m44637a() {
        return new C9038a();
    }

    public final DescriptorFactory<C11247b, dh> getDescriptorFactory() {
        return new C11248c();
    }
}
