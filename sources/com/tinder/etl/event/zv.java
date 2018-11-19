package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class zv implements EtlEvent {
    /* renamed from: a */
    private Boolean f37956a;
    /* renamed from: b */
    private Boolean f37957b;
    /* renamed from: c */
    private String f37958c;
    /* renamed from: d */
    private Boolean f37959d;
    /* renamed from: e */
    private String f37960e;
    /* renamed from: f */
    private String f37961f;
    /* renamed from: g */
    private Boolean f37962g;
    /* renamed from: h */
    private Number f37963h;
    /* renamed from: i */
    private Number f37964i;
    /* renamed from: j */
    private Number f37965j;
    /* renamed from: k */
    private String f37966k;
    /* renamed from: l */
    private Number f37967l;
    /* renamed from: m */
    private Boolean f37968m;
    /* renamed from: n */
    private String f37969n;

    /* renamed from: com.tinder.etl.event.zv$a */
    public static class C9360a {
        /* renamed from: a */
        private zv f31416a;

        private C9360a() {
            this.f31416a = new zv();
        }

        /* renamed from: a */
        public final C9360a m39182a(Boolean bool) {
            this.f31416a.f37956a = bool;
            return this;
        }

        /* renamed from: b */
        public final C9360a m39186b(Boolean bool) {
            this.f31416a.f37957b = bool;
            return this;
        }

        /* renamed from: a */
        public final C9360a m39184a(String str) {
            this.f31416a.f37958c = str;
            return this;
        }

        /* renamed from: c */
        public final C9360a m39189c(Boolean bool) {
            this.f31416a.f37959d = bool;
            return this;
        }

        /* renamed from: b */
        public final C9360a m39188b(String str) {
            this.f31416a.f37961f = str;
            return this;
        }

        /* renamed from: d */
        public final C9360a m39191d(Boolean bool) {
            this.f31416a.f37962g = bool;
            return this;
        }

        /* renamed from: a */
        public final C9360a m39183a(Number number) {
            this.f31416a.f37965j = number;
            return this;
        }

        /* renamed from: c */
        public final C9360a m39190c(String str) {
            this.f31416a.f37966k = str;
            return this;
        }

        /* renamed from: b */
        public final C9360a m39187b(Number number) {
            this.f31416a.f37967l = number;
            return this;
        }

        /* renamed from: e */
        public final C9360a m39193e(Boolean bool) {
            this.f31416a.f37968m = bool;
            return this;
        }

        /* renamed from: d */
        public final C9360a m39192d(String str) {
            this.f31416a.f37969n = str;
            return this;
        }

        /* renamed from: a */
        public zv m39185a() {
            return this.f31416a;
        }
    }

    /* renamed from: com.tinder.etl.event.zv$b */
    public class C11593b extends fw {
        /* renamed from: a */
        final /* synthetic */ zv f37954a;

        /* renamed from: a */
        public String mo10346a() {
            return "UserInteraction.EditProfile";
        }

        public C11593b(zv zvVar, Map<EtlField<?>, Object> map) {
            this.f37954a = zvVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.zv$c */
    private final class C11594c implements DescriptorFactory<C11593b, zv> {
        /* renamed from: a */
        final /* synthetic */ zv f37955a;

        private C11594c(zv zvVar) {
            this.f37955a = zvVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m47258a((zv) etlEvent);
        }

        /* renamed from: a */
        public final C11593b m47258a(zv zvVar) {
            Map hashMap = new HashMap();
            if (zvVar.f37956a != null) {
                hashMap.put(new ao(), zvVar.f37956a);
            }
            if (zvVar.f37957b != null) {
                hashMap.put(new as(), zvVar.f37957b);
            }
            if (zvVar.f37958c != null) {
                hashMap.put(new bs(), zvVar.f37958c);
            }
            if (zvVar.f37959d != null) {
                hashMap.put(new fg(), zvVar.f37959d);
            }
            if (zvVar.f37960e != null) {
                hashMap.put(new fn(), zvVar.f37960e);
            }
            if (zvVar.f37961f != null) {
                hashMap.put(new fm(), zvVar.f37961f);
            }
            if (zvVar.f37962g != null) {
                hashMap.put(new ji(), zvVar.f37962g);
            }
            if (zvVar.f37963h != null) {
                hashMap.put(new nq(), zvVar.f37963h);
            }
            if (zvVar.f37964i != null) {
                hashMap.put(new nv(), zvVar.f37964i);
            }
            if (zvVar.f37965j != null) {
                hashMap.put(new oc(), zvVar.f37965j);
            }
            if (zvVar.f37966k != null) {
                hashMap.put(new vi(), zvVar.f37966k);
            }
            if (zvVar.f37967l != null) {
                hashMap.put(new wt(), zvVar.f37967l);
            }
            if (zvVar.f37968m != null) {
                hashMap.put(new xa(), zvVar.f37968m);
            }
            if (zvVar.f37969n != null) {
                hashMap.put(new abf(), zvVar.f37969n);
            }
            return new C11593b(this.f37955a, hashMap);
        }
    }

    private zv() {
    }

    /* renamed from: a */
    public static C9360a m47259a() {
        return new C9360a();
    }

    public final DescriptorFactory<C11593b, zv> getDescriptorFactory() {
        return new C11594c();
    }
}
