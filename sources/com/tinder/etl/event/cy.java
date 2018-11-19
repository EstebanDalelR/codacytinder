package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class cy implements EtlEvent {
    /* renamed from: a */
    private String f36344a;
    /* renamed from: b */
    private String f36345b;
    /* renamed from: c */
    private String f36346c;
    /* renamed from: d */
    private Boolean f36347d;
    /* renamed from: e */
    private String f36348e;
    /* renamed from: f */
    private String f36349f;
    /* renamed from: g */
    private String f36350g;
    /* renamed from: h */
    private String f36351h;
    /* renamed from: i */
    private Number f36352i;
    /* renamed from: j */
    private Number f36353j;
    /* renamed from: k */
    private Number f36354k;
    /* renamed from: l */
    private Number f36355l;
    /* renamed from: m */
    private String f36356m;
    /* renamed from: n */
    private Boolean f36357n;

    /* renamed from: com.tinder.etl.event.cy$a */
    public static class C9020a {
        /* renamed from: a */
        private cy f31245a;

        private C9020a() {
            this.f31245a = new cy();
        }

        /* renamed from: a */
        public final C9020a m37956a(String str) {
            this.f31245a.f36344a = str;
            return this;
        }

        /* renamed from: b */
        public final C9020a m37960b(String str) {
            this.f31245a.f36345b = str;
            return this;
        }

        /* renamed from: c */
        public final C9020a m37962c(String str) {
            this.f31245a.f36346c = str;
            return this;
        }

        /* renamed from: a */
        public final C9020a m37954a(Boolean bool) {
            this.f31245a.f36347d = bool;
            return this;
        }

        /* renamed from: d */
        public final C9020a m37964d(String str) {
            this.f31245a.f36348e = str;
            return this;
        }

        /* renamed from: e */
        public final C9020a m37965e(String str) {
            this.f31245a.f36349f = str;
            return this;
        }

        /* renamed from: f */
        public final C9020a m37966f(String str) {
            this.f31245a.f36350g = str;
            return this;
        }

        /* renamed from: g */
        public final C9020a m37967g(String str) {
            this.f31245a.f36351h = str;
            return this;
        }

        /* renamed from: a */
        public final C9020a m37955a(Number number) {
            this.f31245a.f36352i = number;
            return this;
        }

        /* renamed from: b */
        public final C9020a m37959b(Number number) {
            this.f31245a.f36353j = number;
            return this;
        }

        /* renamed from: c */
        public final C9020a m37961c(Number number) {
            this.f31245a.f36354k = number;
            return this;
        }

        /* renamed from: d */
        public final C9020a m37963d(Number number) {
            this.f31245a.f36355l = number;
            return this;
        }

        /* renamed from: h */
        public final C9020a m37968h(String str) {
            this.f31245a.f36356m = str;
            return this;
        }

        /* renamed from: b */
        public final C9020a m37958b(Boolean bool) {
            this.f31245a.f36357n = bool;
            return this;
        }

        /* renamed from: a */
        public cy m37957a() {
            return this.f31245a;
        }
    }

    /* renamed from: com.tinder.etl.event.cy$b */
    public class C11228b extends fw {
        /* renamed from: a */
        final /* synthetic */ cy f36342a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.DeleteMessage";
        }

        public C11228b(cy cyVar, Map<EtlField<?>, Object> map) {
            this.f36342a = cyVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.cy$c */
    private final class C11229c implements DescriptorFactory<C11228b, cy> {
        /* renamed from: a */
        final /* synthetic */ cy f36343a;

        private C11229c(cy cyVar) {
            this.f36343a = cyVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44420a((cy) etlEvent);
        }

        /* renamed from: a */
        public final C11228b m44420a(cy cyVar) {
            Map hashMap = new HashMap();
            if (cyVar.f36344a != null) {
                hashMap.put(new ec(), cyVar.f36344a);
            }
            if (cyVar.f36345b != null) {
                hashMap.put(new ed(), cyVar.f36345b);
            }
            if (cyVar.f36346c != null) {
                hashMap.put(new ee(), cyVar.f36346c);
            }
            if (cyVar.f36347d != null) {
                hashMap.put(new ev(), cyVar.f36347d);
            }
            if (cyVar.f36348e != null) {
                hashMap.put(new kb(), cyVar.f36348e);
            }
            if (cyVar.f36349f != null) {
                hashMap.put(new ll(), cyVar.f36349f);
            }
            if (cyVar.f36350g != null) {
                hashMap.put(new lx(), cyVar.f36350g);
            }
            if (cyVar.f36351h != null) {
                hashMap.put(new ml(), cyVar.f36351h);
            }
            if (cyVar.f36352i != null) {
                hashMap.put(new mm(), cyVar.f36352i);
            }
            if (cyVar.f36353j != null) {
                hashMap.put(new mp(), cyVar.f36353j);
            }
            if (cyVar.f36354k != null) {
                hashMap.put(new nx(), cyVar.f36354k);
            }
            if (cyVar.f36355l != null) {
                hashMap.put(new ny(), cyVar.f36355l);
            }
            if (cyVar.f36356m != null) {
                hashMap.put(new ov(), cyVar.f36356m);
            }
            if (cyVar.f36357n != null) {
                hashMap.put(new xh(), cyVar.f36357n);
            }
            return new C11228b(this.f36343a, hashMap);
        }
    }

    private cy() {
    }

    /* renamed from: a */
    public static C9020a m44421a() {
        return new C9020a();
    }

    public final DescriptorFactory<C11228b, cy> getDescriptorFactory() {
        return new C11229c();
    }
}
