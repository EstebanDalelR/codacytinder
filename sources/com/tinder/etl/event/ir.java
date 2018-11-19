package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ir implements EtlEvent {
    /* renamed from: a */
    private String f36937a;
    /* renamed from: b */
    private String f36938b;
    /* renamed from: c */
    private String f36939c;
    /* renamed from: d */
    private String f36940d;

    /* renamed from: com.tinder.etl.event.ir$a */
    public static class C9134a {
        /* renamed from: a */
        private ir f31303a;

        private C9134a() {
            this.f31303a = new ir();
        }

        /* renamed from: a */
        public final C9134a m38444a(String str) {
            this.f31303a.f36937a = str;
            return this;
        }

        /* renamed from: b */
        public final C9134a m38446b(String str) {
            this.f31303a.f36938b = str;
            return this;
        }

        /* renamed from: c */
        public final C9134a m38447c(String str) {
            this.f31303a.f36939c = str;
            return this;
        }

        /* renamed from: d */
        public final C9134a m38448d(String str) {
            this.f31303a.f36940d = str;
            return this;
        }

        /* renamed from: a */
        public ir m38445a() {
            return this.f31303a;
        }
    }

    /* renamed from: com.tinder.etl.event.ir$b */
    public class C11350b extends fw {
        /* renamed from: a */
        final /* synthetic */ ir f36935a;

        /* renamed from: a */
        public String mo10346a() {
            return "GrandGesture.DismissIntro";
        }

        public C11350b(ir irVar, Map<EtlField<?>, Object> map) {
            this.f36935a = irVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ir$c */
    private final class C11351c implements DescriptorFactory<C11350b, ir> {
        /* renamed from: a */
        final /* synthetic */ ir f36936a;

        private C11351c(ir irVar) {
            this.f36936a = irVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45501a((ir) etlEvent);
        }

        /* renamed from: a */
        public final C11350b m45501a(ir irVar) {
            Map hashMap = new HashMap();
            if (irVar.f36937a != null) {
                hashMap.put(new hq(), irVar.f36937a);
            }
            if (irVar.f36938b != null) {
                hashMap.put(new hu(), irVar.f36938b);
            }
            if (irVar.f36939c != null) {
                hashMap.put(new ll(), irVar.f36939c);
            }
            if (irVar.f36940d != null) {
                hashMap.put(new ov(), irVar.f36940d);
            }
            return new C11350b(this.f36936a, hashMap);
        }
    }

    private ir() {
    }

    /* renamed from: a */
    public static C9134a m45502a() {
        return new C9134a();
    }

    public final DescriptorFactory<C11350b, ir> getDescriptorFactory() {
        return new C11351c();
    }
}
