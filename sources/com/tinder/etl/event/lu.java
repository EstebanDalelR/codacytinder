package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class lu implements EtlEvent {
    /* renamed from: a */
    private Number f37084a;
    /* renamed from: b */
    private Number f37085b;
    /* renamed from: c */
    private Number f37086c;
    /* renamed from: d */
    private String f37087d;
    /* renamed from: e */
    private String f37088e;
    /* renamed from: f */
    private String f37089f;

    /* renamed from: com.tinder.etl.event.lu$a */
    public static class C9172a {
        /* renamed from: a */
        private lu f31322a;

        private C9172a() {
            this.f31322a = new lu();
        }

        /* renamed from: a */
        public final C9172a m38549a(String str) {
            this.f31322a.f37087d = str;
            return this;
        }

        /* renamed from: b */
        public final C9172a m38551b(String str) {
            this.f31322a.f37088e = str;
            return this;
        }

        /* renamed from: c */
        public final C9172a m38552c(String str) {
            this.f31322a.f37089f = str;
            return this;
        }

        /* renamed from: a */
        public lu m38550a() {
            return this.f31322a;
        }
    }

    /* renamed from: com.tinder.etl.event.lu$b */
    public class C11391b extends fw {
        /* renamed from: a */
        final /* synthetic */ lu f37082a;

        /* renamed from: a */
        public String mo10346a() {
            return "Match.SearchSelect";
        }

        public C11391b(lu luVar, Map<EtlField<?>, Object> map) {
            this.f37082a = luVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.lu$c */
    private final class C11392c implements DescriptorFactory<C11391b, lu> {
        /* renamed from: a */
        final /* synthetic */ lu f37083a;

        private C11392c(lu luVar) {
            this.f37083a = luVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45753a((lu) etlEvent);
        }

        /* renamed from: a */
        public final C11391b m45753a(lu luVar) {
            Map hashMap = new HashMap();
            if (luVar.f37084a != null) {
                hashMap.put(new nt(), luVar.f37084a);
            }
            if (luVar.f37085b != null) {
                hashMap.put(new nu(), luVar.f37085b);
            }
            if (luVar.f37086c != null) {
                hashMap.put(new oj(), luVar.f37086c);
            }
            if (luVar.f37087d != null) {
                hashMap.put(new ov(), luVar.f37087d);
            }
            if (luVar.f37088e != null) {
                hashMap.put(new ll(), luVar.f37088e);
            }
            if (luVar.f37089f != null) {
                hashMap.put(new lt(), luVar.f37089f);
            }
            return new C11391b(this.f37083a, hashMap);
        }
    }

    private lu() {
    }

    /* renamed from: a */
    public static C9172a m45754a() {
        return new C9172a();
    }

    public final DescriptorFactory<C11391b, lu> getDescriptorFactory() {
        return new C11392c();
    }
}
