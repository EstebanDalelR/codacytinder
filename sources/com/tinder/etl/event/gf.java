package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class gf implements EtlEvent {
    /* renamed from: a */
    private Number f36680a;
    /* renamed from: b */
    private String f36681b;
    /* renamed from: c */
    private Boolean f36682c;
    /* renamed from: d */
    private String f36683d;
    /* renamed from: e */
    private Boolean f36684e;

    /* renamed from: com.tinder.etl.event.gf$a */
    public static class C9082a {
        /* renamed from: a */
        private gf f31277a;

        private C9082a() {
            this.f31277a = new gf();
        }

        /* renamed from: a */
        public final C9082a m38232a(Number number) {
            this.f31277a.f36680a = number;
            return this;
        }

        /* renamed from: a */
        public final C9082a m38233a(String str) {
            this.f31277a.f36681b = str;
            return this;
        }

        /* renamed from: a */
        public final C9082a m38231a(Boolean bool) {
            this.f31277a.f36682c = bool;
            return this;
        }

        /* renamed from: b */
        public final C9082a m38236b(String str) {
            this.f31277a.f36683d = str;
            return this;
        }

        /* renamed from: b */
        public final C9082a m38235b(Boolean bool) {
            this.f31277a.f36684e = bool;
            return this;
        }

        /* renamed from: a */
        public gf m38234a() {
            return this.f31277a;
        }
    }

    /* renamed from: com.tinder.etl.event.gf$b */
    public class C11295b extends fw {
        /* renamed from: a */
        final /* synthetic */ gf f36678a;

        /* renamed from: a */
        public String mo10346a() {
            return "Feed.Fetch";
        }

        public C11295b(gf gfVar, Map<EtlField<?>, Object> map) {
            this.f36678a = gfVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.gf$c */
    private final class C11296c implements DescriptorFactory<C11295b, gf> {
        /* renamed from: a */
        final /* synthetic */ gf f36679a;

        private C11296c(gf gfVar) {
            this.f36679a = gfVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45031a((gf) etlEvent);
        }

        /* renamed from: a */
        public final C11295b m45031a(gf gfVar) {
            Map hashMap = new HashMap();
            if (gfVar.f36680a != null) {
                hashMap.put(new C11397m(), gfVar.f36680a);
            }
            if (gfVar.f36681b != null) {
                hashMap.put(new gk(), gfVar.f36681b);
            }
            if (gfVar.f36682c != null) {
                hashMap.put(new jr(), gfVar.f36682c);
            }
            if (gfVar.f36683d != null) {
                hashMap.put(new wy(), gfVar.f36683d);
            }
            if (gfVar.f36684e != null) {
                hashMap.put(new zo(), gfVar.f36684e);
            }
            return new C11295b(this.f36679a, hashMap);
        }
    }

    private gf() {
    }

    /* renamed from: a */
    public static C9082a m45032a() {
        return new C9082a();
    }

    public final DescriptorFactory<C11295b, gf> getDescriptorFactory() {
        return new C11296c();
    }
}
