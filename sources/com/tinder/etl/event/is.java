package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class is implements EtlEvent {
    /* renamed from: a */
    private String f36943a;
    /* renamed from: b */
    private String f36944b;
    /* renamed from: c */
    private String f36945c;

    /* renamed from: com.tinder.etl.event.is$a */
    public static class C9136a {
        /* renamed from: a */
        private is f31304a;

        private C9136a() {
            this.f31304a = new is();
        }

        /* renamed from: a */
        public final C9136a m38449a(String str) {
            this.f31304a.f36943a = str;
            return this;
        }

        /* renamed from: b */
        public final C9136a m38451b(String str) {
            this.f31304a.f36944b = str;
            return this;
        }

        /* renamed from: c */
        public final C9136a m38452c(String str) {
            this.f31304a.f36945c = str;
            return this;
        }

        /* renamed from: a */
        public is m38450a() {
            return this.f31304a;
        }
    }

    /* renamed from: com.tinder.etl.event.is$b */
    public class C11352b extends fw {
        /* renamed from: a */
        final /* synthetic */ is f36941a;

        /* renamed from: a */
        public String mo10346a() {
            return "GrandGesture.Open";
        }

        public C11352b(is isVar, Map<EtlField<?>, Object> map) {
            this.f36941a = isVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.is$c */
    private final class C11353c implements DescriptorFactory<C11352b, is> {
        /* renamed from: a */
        final /* synthetic */ is f36942a;

        private C11353c(is isVar) {
            this.f36942a = isVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45512a((is) etlEvent);
        }

        /* renamed from: a */
        public final C11352b m45512a(is isVar) {
            Map hashMap = new HashMap();
            if (isVar.f36943a != null) {
                hashMap.put(new hs(), isVar.f36943a);
            }
            if (isVar.f36944b != null) {
                hashMap.put(new ll(), isVar.f36944b);
            }
            if (isVar.f36945c != null) {
                hashMap.put(new ov(), isVar.f36945c);
            }
            return new C11352b(this.f36942a, hashMap);
        }
    }

    private is() {
    }

    /* renamed from: a */
    public static C9136a m45513a() {
        return new C9136a();
    }

    public final DescriptorFactory<C11352b, is> getDescriptorFactory() {
        return new C11353c();
    }
}
