package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class kw implements EtlEvent {
    /* renamed from: a */
    private Number f37013a;
    /* renamed from: b */
    private Number f37014b;
    /* renamed from: c */
    private Number f37015c;
    /* renamed from: d */
    private Number f37016d;
    /* renamed from: e */
    private Boolean f37017e;
    /* renamed from: f */
    private Number f37018f;
    /* renamed from: g */
    private Number f37019g;

    /* renamed from: com.tinder.etl.event.kw$a */
    public static class C9158a {
        /* renamed from: a */
        private kw f31315a;

        private C9158a() {
            this.f31315a = new kw();
        }

        /* renamed from: a */
        public final C9158a m38508a(Number number) {
            this.f31315a.f37013a = number;
            return this;
        }

        /* renamed from: b */
        public final C9158a m38510b(Number number) {
            this.f31315a.f37014b = number;
            return this;
        }

        /* renamed from: c */
        public final C9158a m38511c(Number number) {
            this.f31315a.f37015c = number;
            return this;
        }

        /* renamed from: d */
        public final C9158a m38512d(Number number) {
            this.f31315a.f37016d = number;
            return this;
        }

        /* renamed from: a */
        public final C9158a m38507a(Boolean bool) {
            this.f31315a.f37017e = bool;
            return this;
        }

        /* renamed from: e */
        public final C9158a m38513e(Number number) {
            this.f31315a.f37018f = number;
            return this;
        }

        /* renamed from: f */
        public final C9158a m38514f(Number number) {
            this.f31315a.f37019g = number;
            return this;
        }

        /* renamed from: a */
        public kw m38509a() {
            return this.f31315a;
        }
    }

    /* renamed from: com.tinder.etl.event.kw$b */
    public class C11376b extends fw {
        /* renamed from: a */
        final /* synthetic */ kw f37011a;

        /* renamed from: a */
        public String mo10346a() {
            return "LikesYou.Pill.Reset";
        }

        public C11376b(kw kwVar, Map<EtlField<?>, Object> map) {
            this.f37011a = kwVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.kw$c */
    private final class C11377c implements DescriptorFactory<C11376b, kw> {
        /* renamed from: a */
        final /* synthetic */ kw f37012a;

        private C11377c(kw kwVar) {
            this.f37012a = kwVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45640a((kw) etlEvent);
        }

        /* renamed from: a */
        public final C11376b m45640a(kw kwVar) {
            Map hashMap = new HashMap();
            if (kwVar.f37013a != null) {
                hashMap.put(new xd(), kwVar.f37013a);
            }
            if (kwVar.f37014b != null) {
                hashMap.put(new ef(), kwVar.f37014b);
            }
            if (kwVar.f37015c != null) {
                hashMap.put(new qa(), kwVar.f37015c);
            }
            if (kwVar.f37016d != null) {
                hashMap.put(new fk(), kwVar.f37016d);
            }
            if (kwVar.f37017e != null) {
                hashMap.put(new jp(), kwVar.f37017e);
            }
            if (kwVar.f37018f != null) {
                hashMap.put(new hc(), kwVar.f37018f);
            }
            if (kwVar.f37019g != null) {
                hashMap.put(new kp(), kwVar.f37019g);
            }
            return new C11376b(this.f37012a, hashMap);
        }
    }

    private kw() {
    }

    /* renamed from: a */
    public static C9158a m45641a() {
        return new C9158a();
    }

    public final DescriptorFactory<C11376b, kw> getDescriptorFactory() {
        return new C11377c();
    }
}
