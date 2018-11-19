package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class it implements EtlEvent {
    /* renamed from: a */
    private String f36948a;
    /* renamed from: b */
    private String f36949b;
    /* renamed from: c */
    private String f36950c;
    /* renamed from: d */
    private String f36951d;
    /* renamed from: e */
    private String f36952e;
    /* renamed from: f */
    private Boolean f36953f;

    /* renamed from: com.tinder.etl.event.it$a */
    public static class C9138a {
        /* renamed from: a */
        private it f31305a;

        private C9138a() {
            this.f31305a = new it();
        }

        /* renamed from: a */
        public final C9138a m38454a(String str) {
            this.f31305a.f36948a = str;
            return this;
        }

        /* renamed from: b */
        public final C9138a m38456b(String str) {
            this.f31305a.f36949b = str;
            return this;
        }

        /* renamed from: c */
        public final C9138a m38457c(String str) {
            this.f31305a.f36950c = str;
            return this;
        }

        /* renamed from: d */
        public final C9138a m38458d(String str) {
            this.f31305a.f36951d = str;
            return this;
        }

        /* renamed from: e */
        public final C9138a m38459e(String str) {
            this.f31305a.f36952e = str;
            return this;
        }

        /* renamed from: a */
        public final C9138a m38453a(Boolean bool) {
            this.f31305a.f36953f = bool;
            return this;
        }

        /* renamed from: a */
        public it m38455a() {
            return this.f31305a;
        }
    }

    /* renamed from: com.tinder.etl.event.it$b */
    public class C11354b extends fw {
        /* renamed from: a */
        final /* synthetic */ it f36946a;

        /* renamed from: a */
        public String mo10346a() {
            return "GrandGesture.ShowAnimation";
        }

        public C11354b(it itVar, Map<EtlField<?>, Object> map) {
            this.f36946a = itVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.it$c */
    private final class C11355c implements DescriptorFactory<C11354b, it> {
        /* renamed from: a */
        final /* synthetic */ it f36947a;

        private C11355c(it itVar) {
            this.f36947a = itVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45521a((it) etlEvent);
        }

        /* renamed from: a */
        public final C11354b m45521a(it itVar) {
            Map hashMap = new HashMap();
            if (itVar.f36948a != null) {
                hashMap.put(new hr(), itVar.f36948a);
            }
            if (itVar.f36949b != null) {
                hashMap.put(new hv(), itVar.f36949b);
            }
            if (itVar.f36950c != null) {
                hashMap.put(new hw(), itVar.f36950c);
            }
            if (itVar.f36951d != null) {
                hashMap.put(new ll(), itVar.f36951d);
            }
            if (itVar.f36952e != null) {
                hashMap.put(new ov(), itVar.f36952e);
            }
            if (itVar.f36953f != null) {
                hashMap.put(new ww(), itVar.f36953f);
            }
            return new C11354b(this.f36947a, hashMap);
        }
    }

    private it() {
    }

    /* renamed from: a */
    public static C9138a m45522a() {
        return new C9138a();
    }

    public final DescriptorFactory<C11354b, it> getDescriptorFactory() {
        return new C11355c();
    }
}
