package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class dm implements EtlEvent {
    /* renamed from: a */
    private String f36519a;
    /* renamed from: b */
    private String f36520b;
    /* renamed from: c */
    private String f36521c;
    /* renamed from: d */
    private Boolean f36522d;
    /* renamed from: e */
    private String f36523e;
    /* renamed from: f */
    private String f36524f;
    /* renamed from: g */
    private String f36525g;
    /* renamed from: h */
    private String f36526h;
    /* renamed from: i */
    private Number f36527i;
    /* renamed from: j */
    private Number f36528j;
    /* renamed from: k */
    private Number f36529k;
    /* renamed from: l */
    private Number f36530l;
    /* renamed from: m */
    private String f36531m;
    /* renamed from: n */
    private Boolean f36532n;

    /* renamed from: com.tinder.etl.event.dm$a */
    public static class C9048a {
        /* renamed from: a */
        private dm f31259a;

        private C9048a() {
            this.f31259a = new dm();
        }

        /* renamed from: a */
        public final C9048a m38099a(String str) {
            this.f31259a.f36519a = str;
            return this;
        }

        /* renamed from: b */
        public final C9048a m38103b(String str) {
            this.f31259a.f36520b = str;
            return this;
        }

        /* renamed from: c */
        public final C9048a m38105c(String str) {
            this.f31259a.f36521c = str;
            return this;
        }

        /* renamed from: a */
        public final C9048a m38097a(Boolean bool) {
            this.f31259a.f36522d = bool;
            return this;
        }

        /* renamed from: d */
        public final C9048a m38107d(String str) {
            this.f31259a.f36523e = str;
            return this;
        }

        /* renamed from: e */
        public final C9048a m38108e(String str) {
            this.f31259a.f36524f = str;
            return this;
        }

        /* renamed from: f */
        public final C9048a m38109f(String str) {
            this.f31259a.f36525g = str;
            return this;
        }

        /* renamed from: g */
        public final C9048a m38110g(String str) {
            this.f31259a.f36526h = str;
            return this;
        }

        /* renamed from: a */
        public final C9048a m38098a(Number number) {
            this.f31259a.f36527i = number;
            return this;
        }

        /* renamed from: b */
        public final C9048a m38102b(Number number) {
            this.f31259a.f36528j = number;
            return this;
        }

        /* renamed from: c */
        public final C9048a m38104c(Number number) {
            this.f31259a.f36529k = number;
            return this;
        }

        /* renamed from: d */
        public final C9048a m38106d(Number number) {
            this.f31259a.f36530l = number;
            return this;
        }

        /* renamed from: h */
        public final C9048a m38111h(String str) {
            this.f31259a.f36531m = str;
            return this;
        }

        /* renamed from: b */
        public final C9048a m38101b(Boolean bool) {
            this.f31259a.f36532n = bool;
            return this;
        }

        /* renamed from: a */
        public dm m38100a() {
            return this.f31259a;
        }
    }

    /* renamed from: com.tinder.etl.event.dm$b */
    public class C11257b extends fw {
        /* renamed from: a */
        final /* synthetic */ dm f36517a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.SendErrorOptions";
        }

        public C11257b(dm dmVar, Map<EtlField<?>, Object> map) {
            this.f36517a = dmVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.dm$c */
    private final class C11258c implements DescriptorFactory<C11257b, dm> {
        /* renamed from: a */
        final /* synthetic */ dm f36518a;

        private C11258c(dm dmVar) {
            this.f36518a = dmVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44738a((dm) etlEvent);
        }

        /* renamed from: a */
        public final C11257b m44738a(dm dmVar) {
            Map hashMap = new HashMap();
            if (dmVar.f36519a != null) {
                hashMap.put(new ec(), dmVar.f36519a);
            }
            if (dmVar.f36520b != null) {
                hashMap.put(new ed(), dmVar.f36520b);
            }
            if (dmVar.f36521c != null) {
                hashMap.put(new ee(), dmVar.f36521c);
            }
            if (dmVar.f36522d != null) {
                hashMap.put(new ev(), dmVar.f36522d);
            }
            if (dmVar.f36523e != null) {
                hashMap.put(new kb(), dmVar.f36523e);
            }
            if (dmVar.f36524f != null) {
                hashMap.put(new ll(), dmVar.f36524f);
            }
            if (dmVar.f36525g != null) {
                hashMap.put(new lx(), dmVar.f36525g);
            }
            if (dmVar.f36526h != null) {
                hashMap.put(new ml(), dmVar.f36526h);
            }
            if (dmVar.f36527i != null) {
                hashMap.put(new mm(), dmVar.f36527i);
            }
            if (dmVar.f36528j != null) {
                hashMap.put(new mp(), dmVar.f36528j);
            }
            if (dmVar.f36529k != null) {
                hashMap.put(new nx(), dmVar.f36529k);
            }
            if (dmVar.f36530l != null) {
                hashMap.put(new ny(), dmVar.f36530l);
            }
            if (dmVar.f36531m != null) {
                hashMap.put(new ov(), dmVar.f36531m);
            }
            if (dmVar.f36532n != null) {
                hashMap.put(new xh(), dmVar.f36532n);
            }
            return new C11257b(this.f36518a, hashMap);
        }
    }

    private dm() {
    }

    /* renamed from: a */
    public static C9048a m44739a() {
        return new C9048a();
    }

    public final DescriptorFactory<C11257b, dm> getDescriptorFactory() {
        return new C11258c();
    }
}
