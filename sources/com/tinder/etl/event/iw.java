package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class iw implements EtlEvent {
    /* renamed from: a */
    private String f36970a;
    /* renamed from: b */
    private Number f36971b;
    /* renamed from: c */
    private Number f36972c;
    /* renamed from: d */
    private String f36973d;
    /* renamed from: e */
    private String f36974e;

    /* renamed from: com.tinder.etl.event.iw$a */
    public static class C9144a {
        /* renamed from: a */
        private iw f31308a;

        private C9144a() {
            this.f31308a = new iw();
        }

        /* renamed from: a */
        public final C9144a m38473a(String str) {
            this.f31308a.f36970a = str;
            return this;
        }

        /* renamed from: a */
        public final C9144a m38472a(Number number) {
            this.f31308a.f36971b = number;
            return this;
        }

        /* renamed from: b */
        public final C9144a m38475b(Number number) {
            this.f31308a.f36972c = number;
            return this;
        }

        /* renamed from: b */
        public final C9144a m38476b(String str) {
            this.f31308a.f36973d = str;
            return this;
        }

        /* renamed from: c */
        public final C9144a m38477c(String str) {
            this.f31308a.f36974e = str;
            return this;
        }

        /* renamed from: a */
        public iw m38474a() {
            return this.f31308a;
        }
    }

    /* renamed from: com.tinder.etl.event.iw$b */
    public class C11360b extends fw {
        /* renamed from: a */
        final /* synthetic */ iw f36968a;

        /* renamed from: a */
        public String mo10346a() {
            return "GrandGesture.ShowTutorial";
        }

        public C11360b(iw iwVar, Map<EtlField<?>, Object> map) {
            this.f36968a = iwVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.iw$c */
    private final class C11361c implements DescriptorFactory<C11360b, iw> {
        /* renamed from: a */
        final /* synthetic */ iw f36969a;

        private C11361c(iw iwVar) {
            this.f36969a = iwVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45562a((iw) etlEvent);
        }

        /* renamed from: a */
        public final C11360b m45562a(iw iwVar) {
            Map hashMap = new HashMap();
            if (iwVar.f36970a != null) {
                hashMap.put(new hr(), iwVar.f36970a);
            }
            if (iwVar.f36971b != null) {
                hashMap.put(new ht(), iwVar.f36971b);
            }
            if (iwVar.f36972c != null) {
                hashMap.put(new hz(), iwVar.f36972c);
            }
            if (iwVar.f36973d != null) {
                hashMap.put(new ll(), iwVar.f36973d);
            }
            if (iwVar.f36974e != null) {
                hashMap.put(new ov(), iwVar.f36974e);
            }
            return new C11360b(this.f36969a, hashMap);
        }
    }

    private iw() {
    }

    /* renamed from: a */
    public static C9144a m45563a() {
        return new C9144a();
    }

    public final DescriptorFactory<C11360b, iw> getDescriptorFactory() {
        return new C11361c();
    }
}
