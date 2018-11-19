package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class dl implements EtlEvent {
    /* renamed from: a */
    private String f36503a;
    /* renamed from: b */
    private String f36504b;
    /* renamed from: c */
    private Boolean f36505c;
    /* renamed from: d */
    private String f36506d;
    /* renamed from: e */
    private String f36507e;
    /* renamed from: f */
    private String f36508f;
    /* renamed from: g */
    private String f36509g;
    /* renamed from: h */
    private Number f36510h;
    /* renamed from: i */
    private Number f36511i;
    /* renamed from: j */
    private Number f36512j;
    /* renamed from: k */
    private Number f36513k;
    /* renamed from: l */
    private String f36514l;
    /* renamed from: m */
    private Number f36515m;
    /* renamed from: n */
    private Boolean f36516n;

    /* renamed from: com.tinder.etl.event.dl$a */
    public static class C9046a {
        /* renamed from: a */
        private dl f31258a;

        private C9046a() {
            this.f31258a = new dl();
        }

        /* renamed from: a */
        public final C9046a m38084a(String str) {
            this.f31258a.f36503a = str;
            return this;
        }

        /* renamed from: b */
        public final C9046a m38088b(String str) {
            this.f31258a.f36504b = str;
            return this;
        }

        /* renamed from: a */
        public final C9046a m38082a(Boolean bool) {
            this.f31258a.f36505c = bool;
            return this;
        }

        /* renamed from: c */
        public final C9046a m38090c(String str) {
            this.f31258a.f36506d = str;
            return this;
        }

        /* renamed from: d */
        public final C9046a m38092d(String str) {
            this.f31258a.f36507e = str;
            return this;
        }

        /* renamed from: e */
        public final C9046a m38094e(String str) {
            this.f31258a.f36508f = str;
            return this;
        }

        /* renamed from: f */
        public final C9046a m38095f(String str) {
            this.f31258a.f36509g = str;
            return this;
        }

        /* renamed from: a */
        public final C9046a m38083a(Number number) {
            this.f31258a.f36510h = number;
            return this;
        }

        /* renamed from: b */
        public final C9046a m38087b(Number number) {
            this.f31258a.f36511i = number;
            return this;
        }

        /* renamed from: c */
        public final C9046a m38089c(Number number) {
            this.f31258a.f36512j = number;
            return this;
        }

        /* renamed from: d */
        public final C9046a m38091d(Number number) {
            this.f31258a.f36513k = number;
            return this;
        }

        /* renamed from: g */
        public final C9046a m38096g(String str) {
            this.f31258a.f36514l = str;
            return this;
        }

        /* renamed from: e */
        public final C9046a m38093e(Number number) {
            this.f31258a.f36515m = number;
            return this;
        }

        /* renamed from: b */
        public final C9046a m38086b(Boolean bool) {
            this.f31258a.f36516n = bool;
            return this;
        }

        /* renamed from: a */
        public dl m38085a() {
            return this.f31258a;
        }
    }

    /* renamed from: com.tinder.etl.event.dl$b */
    public class C11255b extends fw {
        /* renamed from: a */
        final /* synthetic */ dl f36501a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.SelectSendErrorOptions";
        }

        public C11255b(dl dlVar, Map<EtlField<?>, Object> map) {
            this.f36501a = dlVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.dl$c */
    private final class C11256c implements DescriptorFactory<C11255b, dl> {
        /* renamed from: a */
        final /* synthetic */ dl f36502a;

        private C11256c(dl dlVar) {
            this.f36502a = dlVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44707a((dl) etlEvent);
        }

        /* renamed from: a */
        public final C11255b m44707a(dl dlVar) {
            Map hashMap = new HashMap();
            if (dlVar.f36503a != null) {
                hashMap.put(new cq(), dlVar.f36503a);
            }
            if (dlVar.f36504b != null) {
                hashMap.put(new ec(), dlVar.f36504b);
            }
            if (dlVar.f36505c != null) {
                hashMap.put(new ev(), dlVar.f36505c);
            }
            if (dlVar.f36506d != null) {
                hashMap.put(new kb(), dlVar.f36506d);
            }
            if (dlVar.f36507e != null) {
                hashMap.put(new ll(), dlVar.f36507e);
            }
            if (dlVar.f36508f != null) {
                hashMap.put(new lx(), dlVar.f36508f);
            }
            if (dlVar.f36509g != null) {
                hashMap.put(new ml(), dlVar.f36509g);
            }
            if (dlVar.f36510h != null) {
                hashMap.put(new mm(), dlVar.f36510h);
            }
            if (dlVar.f36511i != null) {
                hashMap.put(new mp(), dlVar.f36511i);
            }
            if (dlVar.f36512j != null) {
                hashMap.put(new nx(), dlVar.f36512j);
            }
            if (dlVar.f36513k != null) {
                hashMap.put(new ny(), dlVar.f36513k);
            }
            if (dlVar.f36514l != null) {
                hashMap.put(new ov(), dlVar.f36514l);
            }
            if (dlVar.f36515m != null) {
                hashMap.put(new qz(), dlVar.f36515m);
            }
            if (dlVar.f36516n != null) {
                hashMap.put(new xh(), dlVar.f36516n);
            }
            return new C11255b(this.f36502a, hashMap);
        }
    }

    private dl() {
    }

    /* renamed from: a */
    public static C9046a m44708a() {
        return new C9046a();
    }

    public final DescriptorFactory<C11255b, dl> getDescriptorFactory() {
        return new C11256c();
    }
}
