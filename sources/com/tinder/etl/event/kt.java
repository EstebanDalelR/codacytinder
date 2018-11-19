package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class kt implements EtlEvent {
    /* renamed from: a */
    private Number f36998a;
    /* renamed from: b */
    private Number f36999b;
    /* renamed from: c */
    private Number f37000c;
    /* renamed from: d */
    private Number f37001d;
    /* renamed from: e */
    private Number f37002e;
    /* renamed from: f */
    private Number f37003f;
    /* renamed from: g */
    private Boolean f37004g;

    /* renamed from: com.tinder.etl.event.kt$a */
    public static class C9154a {
        /* renamed from: a */
        private kt f31313a;

        private C9154a() {
            this.f31313a = new kt();
        }

        /* renamed from: a */
        public final C9154a m38496a(Number number) {
            this.f31313a.f36998a = number;
            return this;
        }

        /* renamed from: b */
        public final C9154a m38498b(Number number) {
            this.f31313a.f36999b = number;
            return this;
        }

        /* renamed from: c */
        public final C9154a m38499c(Number number) {
            this.f31313a.f37000c = number;
            return this;
        }

        /* renamed from: d */
        public final C9154a m38500d(Number number) {
            this.f31313a.f37001d = number;
            return this;
        }

        /* renamed from: e */
        public final C9154a m38501e(Number number) {
            this.f31313a.f37002e = number;
            return this;
        }

        /* renamed from: f */
        public final C9154a m38502f(Number number) {
            this.f31313a.f37003f = number;
            return this;
        }

        /* renamed from: a */
        public final C9154a m38495a(Boolean bool) {
            this.f31313a.f37004g = bool;
            return this;
        }

        /* renamed from: a */
        public kt m38497a() {
            return this.f31313a;
        }
    }

    /* renamed from: com.tinder.etl.event.kt$b */
    public class C11372b extends fw {
        /* renamed from: a */
        final /* synthetic */ kt f36996a;

        /* renamed from: a */
        public String mo10346a() {
            return "LikesYou.Pill.Change";
        }

        public C11372b(kt ktVar, Map<EtlField<?>, Object> map) {
            this.f36996a = ktVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.kt$c */
    private final class C11373c implements DescriptorFactory<C11372b, kt> {
        /* renamed from: a */
        final /* synthetic */ kt f36997a;

        private C11373c(kt ktVar) {
            this.f36997a = ktVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45613a((kt) etlEvent);
        }

        /* renamed from: a */
        public final C11372b m45613a(kt ktVar) {
            Map hashMap = new HashMap();
            if (ktVar.f36998a != null) {
                hashMap.put(new xd(), ktVar.f36998a);
            }
            if (ktVar.f36999b != null) {
                hashMap.put(new ef(), ktVar.f36999b);
            }
            if (ktVar.f37000c != null) {
                hashMap.put(new es(), ktVar.f37000c);
            }
            if (ktVar.f37001d != null) {
                hashMap.put(new qa(), ktVar.f37001d);
            }
            if (ktVar.f37002e != null) {
                hashMap.put(new fk(), ktVar.f37002e);
            }
            if (ktVar.f37003f != null) {
                hashMap.put(new fj(), ktVar.f37003f);
            }
            if (ktVar.f37004g != null) {
                hashMap.put(new jp(), ktVar.f37004g);
            }
            return new C11372b(this.f36997a, hashMap);
        }
    }

    private kt() {
    }

    /* renamed from: a */
    public static C9154a m45614a() {
        return new C9154a();
    }

    public final DescriptorFactory<C11372b, kt> getDescriptorFactory() {
        return new C11373c();
    }
}
