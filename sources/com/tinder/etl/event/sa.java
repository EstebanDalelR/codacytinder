package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class sa implements EtlEvent {
    /* renamed from: a */
    private String f37279a;
    /* renamed from: b */
    private Number f37280b;
    /* renamed from: c */
    private Boolean f37281c;

    /* renamed from: com.tinder.etl.event.sa$a */
    public static class C9242a {
        /* renamed from: a */
        private sa f31357a;

        private C9242a() {
            this.f31357a = new sa();
        }

        /* renamed from: a */
        public final C9242a m38692a(String str) {
            this.f31357a.f37279a = str;
            return this;
        }

        /* renamed from: a */
        public final C9242a m38691a(Number number) {
            this.f31357a.f37280b = number;
            return this;
        }

        /* renamed from: a */
        public final C9242a m38690a(Boolean bool) {
            this.f31357a.f37281c = bool;
            return this;
        }

        /* renamed from: a */
        public sa m38693a() {
            return this.f31357a;
        }
    }

    /* renamed from: com.tinder.etl.event.sa$b */
    public class C11468b extends fw {
        /* renamed from: a */
        final /* synthetic */ sa f37277a;

        /* renamed from: a */
        public String mo10346a() {
            return "Profile.MoreGender";
        }

        public C11468b(sa saVar, Map<EtlField<?>, Object> map) {
            this.f37277a = saVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.sa$c */
    private final class C11469c implements DescriptorFactory<C11468b, sa> {
        /* renamed from: a */
        final /* synthetic */ sa f37278a;

        private C11469c(sa saVar) {
            this.f37278a = saVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46089a((sa) etlEvent);
        }

        /* renamed from: a */
        public final C11468b m46089a(sa saVar) {
            Map hashMap = new HashMap();
            if (saVar.f37279a != null) {
                hashMap.put(new jd(), saVar.f37279a);
            }
            if (saVar.f37280b != null) {
                hashMap.put(new jg(), saVar.f37280b);
            }
            if (saVar.f37281c != null) {
                hashMap.put(new wp(), saVar.f37281c);
            }
            return new C11468b(this.f37278a, hashMap);
        }
    }

    private sa() {
    }

    /* renamed from: a */
    public static C9242a m46090a() {
        return new C9242a();
    }

    public final DescriptorFactory<C11468b, sa> getDescriptorFactory() {
        return new C11469c();
    }
}
