package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class lo implements EtlEvent {
    /* renamed from: a */
    private Number f37034a;
    /* renamed from: b */
    private Number f37035b;
    /* renamed from: c */
    private Number f37036c;
    /* renamed from: d */
    private Number f37037d;
    /* renamed from: e */
    private Number f37038e;
    /* renamed from: f */
    private Number f37039f;
    /* renamed from: g */
    private Number f37040g;
    /* renamed from: h */
    private Number f37041h;
    /* renamed from: i */
    private Number f37042i;
    /* renamed from: j */
    private Number f37043j;
    /* renamed from: k */
    private Boolean f37044k;
    /* renamed from: l */
    private Boolean f37045l;

    /* renamed from: com.tinder.etl.event.lo$a */
    public static class C9164a {
        /* renamed from: a */
        private lo f31318a;

        private C9164a() {
            this.f31318a = new lo();
        }

        /* renamed from: a */
        public final C9164a m38524a(Number number) {
            this.f31318a.f37034a = number;
            return this;
        }

        /* renamed from: b */
        public final C9164a m38526b(Number number) {
            this.f31318a.f37036c = number;
            return this;
        }

        /* renamed from: c */
        public final C9164a m38527c(Number number) {
            this.f31318a.f37038e = number;
            return this;
        }

        /* renamed from: d */
        public final C9164a m38528d(Number number) {
            this.f31318a.f37039f = number;
            return this;
        }

        /* renamed from: e */
        public final C9164a m38529e(Number number) {
            this.f31318a.f37040g = number;
            return this;
        }

        /* renamed from: f */
        public final C9164a m38530f(Number number) {
            this.f31318a.f37041h = number;
            return this;
        }

        /* renamed from: g */
        public final C9164a m38531g(Number number) {
            this.f31318a.f37042i = number;
            return this;
        }

        /* renamed from: h */
        public final C9164a m38532h(Number number) {
            this.f31318a.f37043j = number;
            return this;
        }

        /* renamed from: a */
        public final C9164a m38523a(Boolean bool) {
            this.f31318a.f37044k = bool;
            return this;
        }

        /* renamed from: a */
        public lo m38525a() {
            return this.f31318a;
        }
    }

    /* renamed from: com.tinder.etl.event.lo$b */
    public class C11383b extends fw {
        /* renamed from: a */
        final /* synthetic */ lo f37032a;

        /* renamed from: a */
        public String mo10346a() {
            return "Match.List";
        }

        public C11383b(lo loVar, Map<EtlField<?>, Object> map) {
            this.f37032a = loVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.lo$c */
    private final class C11384c implements DescriptorFactory<C11383b, lo> {
        /* renamed from: a */
        final /* synthetic */ lo f37033a;

        private C11384c(lo loVar) {
            this.f37033a = loVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45677a((lo) etlEvent);
        }

        /* renamed from: a */
        public final C11383b m45677a(lo loVar) {
            Map hashMap = new HashMap();
            if (loVar.f37034a != null) {
                hashMap.put(new nr(), loVar.f37034a);
            }
            if (loVar.f37035b != null) {
                hashMap.put(new ns(), loVar.f37035b);
            }
            if (loVar.f37036c != null) {
                hashMap.put(new nw(), loVar.f37036c);
            }
            if (loVar.f37037d != null) {
                hashMap.put(new of(), loVar.f37037d);
            }
            if (loVar.f37038e != null) {
                hashMap.put(new ok(), loVar.f37038e);
            }
            if (loVar.f37039f != null) {
                hashMap.put(new ol(), loVar.f37039f);
            }
            if (loVar.f37040g != null) {
                hashMap.put(new he(), loVar.f37040g);
            }
            if (loVar.f37041h != null) {
                hashMap.put(new hh(), loVar.f37041h);
            }
            if (loVar.f37042i != null) {
                hashMap.put(new kg(), loVar.f37042i);
            }
            if (loVar.f37043j != null) {
                hashMap.put(new kh(), loVar.f37043j);
            }
            if (loVar.f37044k != null) {
                hashMap.put(new la(), loVar.f37044k);
            }
            if (loVar.f37045l != null) {
                hashMap.put(new zo(), loVar.f37045l);
            }
            return new C11383b(this.f37033a, hashMap);
        }
    }

    private lo() {
    }

    /* renamed from: a */
    public static C9164a m45678a() {
        return new C9164a();
    }

    public final DescriptorFactory<C11383b, lo> getDescriptorFactory() {
        return new C11384c();
    }
}
