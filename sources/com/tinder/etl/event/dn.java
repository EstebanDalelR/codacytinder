package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class dn implements EtlEvent {
    /* renamed from: a */
    private String f36535a;
    /* renamed from: b */
    private String f36536b;
    /* renamed from: c */
    private String f36537c;
    /* renamed from: d */
    private Boolean f36538d;
    /* renamed from: e */
    private String f36539e;
    /* renamed from: f */
    private String f36540f;
    /* renamed from: g */
    private String f36541g;
    /* renamed from: h */
    private String f36542h;
    /* renamed from: i */
    private Number f36543i;
    /* renamed from: j */
    private Number f36544j;
    /* renamed from: k */
    private Number f36545k;
    /* renamed from: l */
    private Number f36546l;
    /* renamed from: m */
    private String f36547m;
    /* renamed from: n */
    private String f36548n;
    /* renamed from: o */
    private Boolean f36549o;

    /* renamed from: com.tinder.etl.event.dn$a */
    public static class C9050a {
        /* renamed from: a */
        private dn f31260a;

        private C9050a() {
            this.f31260a = new dn();
        }

        /* renamed from: a */
        public final C9050a m38114a(String str) {
            this.f31260a.f36535a = str;
            return this;
        }

        /* renamed from: b */
        public final C9050a m38118b(String str) {
            this.f31260a.f36536b = str;
            return this;
        }

        /* renamed from: c */
        public final C9050a m38120c(String str) {
            this.f31260a.f36537c = str;
            return this;
        }

        /* renamed from: a */
        public final C9050a m38112a(Boolean bool) {
            this.f31260a.f36538d = bool;
            return this;
        }

        /* renamed from: d */
        public final C9050a m38122d(String str) {
            this.f31260a.f36539e = str;
            return this;
        }

        /* renamed from: e */
        public final C9050a m38123e(String str) {
            this.f31260a.f36540f = str;
            return this;
        }

        /* renamed from: f */
        public final C9050a m38124f(String str) {
            this.f31260a.f36541g = str;
            return this;
        }

        /* renamed from: g */
        public final C9050a m38125g(String str) {
            this.f31260a.f36542h = str;
            return this;
        }

        /* renamed from: a */
        public final C9050a m38113a(Number number) {
            this.f31260a.f36543i = number;
            return this;
        }

        /* renamed from: b */
        public final C9050a m38117b(Number number) {
            this.f31260a.f36544j = number;
            return this;
        }

        /* renamed from: c */
        public final C9050a m38119c(Number number) {
            this.f31260a.f36545k = number;
            return this;
        }

        /* renamed from: d */
        public final C9050a m38121d(Number number) {
            this.f31260a.f36546l = number;
            return this;
        }

        /* renamed from: h */
        public final C9050a m38126h(String str) {
            this.f31260a.f36547m = str;
            return this;
        }

        /* renamed from: b */
        public final C9050a m38116b(Boolean bool) {
            this.f31260a.f36549o = bool;
            return this;
        }

        /* renamed from: a */
        public dn m38115a() {
            return this.f31260a;
        }
    }

    /* renamed from: com.tinder.etl.event.dn$b */
    public class C11259b extends fw {
        /* renamed from: a */
        final /* synthetic */ dn f36533a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.SendMessageError";
        }

        public C11259b(dn dnVar, Map<EtlField<?>, Object> map) {
            this.f36533a = dnVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.dn$c */
    private final class C11260c implements DescriptorFactory<C11259b, dn> {
        /* renamed from: a */
        final /* synthetic */ dn f36534a;

        private C11260c(dn dnVar) {
            this.f36534a = dnVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44769a((dn) etlEvent);
        }

        /* renamed from: a */
        public final C11259b m44769a(dn dnVar) {
            Map hashMap = new HashMap();
            if (dnVar.f36535a != null) {
                hashMap.put(new ec(), dnVar.f36535a);
            }
            if (dnVar.f36536b != null) {
                hashMap.put(new ed(), dnVar.f36536b);
            }
            if (dnVar.f36537c != null) {
                hashMap.put(new ee(), dnVar.f36537c);
            }
            if (dnVar.f36538d != null) {
                hashMap.put(new ev(), dnVar.f36538d);
            }
            if (dnVar.f36539e != null) {
                hashMap.put(new kb(), dnVar.f36539e);
            }
            if (dnVar.f36540f != null) {
                hashMap.put(new ll(), dnVar.f36540f);
            }
            if (dnVar.f36541g != null) {
                hashMap.put(new lx(), dnVar.f36541g);
            }
            if (dnVar.f36542h != null) {
                hashMap.put(new ml(), dnVar.f36542h);
            }
            if (dnVar.f36543i != null) {
                hashMap.put(new mm(), dnVar.f36543i);
            }
            if (dnVar.f36544j != null) {
                hashMap.put(new mp(), dnVar.f36544j);
            }
            if (dnVar.f36545k != null) {
                hashMap.put(new nx(), dnVar.f36545k);
            }
            if (dnVar.f36546l != null) {
                hashMap.put(new ny(), dnVar.f36546l);
            }
            if (dnVar.f36547m != null) {
                hashMap.put(new ov(), dnVar.f36547m);
            }
            if (dnVar.f36548n != null) {
                hashMap.put(new vn(), dnVar.f36548n);
            }
            if (dnVar.f36549o != null) {
                hashMap.put(new xh(), dnVar.f36549o);
            }
            return new C11259b(this.f36534a, hashMap);
        }
    }

    private dn() {
    }

    /* renamed from: a */
    public static C9050a m44770a() {
        return new C9050a();
    }

    public final DescriptorFactory<C11259b, dn> getDescriptorFactory() {
        return new C11260c();
    }
}
