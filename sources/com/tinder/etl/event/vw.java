package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class vw implements EtlEvent {
    /* renamed from: a */
    private Number f37625a;
    /* renamed from: b */
    private String f37626b;
    /* renamed from: c */
    private String f37627c;

    /* renamed from: com.tinder.etl.event.vw$a */
    public static class C9306a {
        /* renamed from: a */
        private vw f31389a;

        private C9306a() {
            this.f31389a = new vw();
        }

        /* renamed from: a */
        public final C9306a m38907a(Number number) {
            this.f31389a.f37625a = number;
            return this;
        }

        /* renamed from: a */
        public final C9306a m38908a(String str) {
            this.f31389a.f37626b = str;
            return this;
        }

        /* renamed from: b */
        public final C9306a m38910b(String str) {
            this.f31389a.f37627c = str;
            return this;
        }

        /* renamed from: a */
        public vw m38909a() {
            return this.f31389a;
        }
    }

    /* renamed from: com.tinder.etl.event.vw$b */
    public class C11535b extends fw {
        /* renamed from: a */
        final /* synthetic */ vw f37623a;

        /* renamed from: a */
        public String mo10346a() {
            return "Session.Notification";
        }

        public C11535b(vw vwVar, Map<EtlField<?>, Object> map) {
            this.f37623a = vwVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.vw$c */
    private final class C11536c implements DescriptorFactory<C11535b, vw> {
        /* renamed from: a */
        final /* synthetic */ vw f37624a;

        private C11536c(vw vwVar) {
            this.f37624a = vwVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46652a((vw) etlEvent);
        }

        /* renamed from: a */
        public final C11535b m46652a(vw vwVar) {
            Map hashMap = new HashMap();
            if (vwVar.f37625a != null) {
                hashMap.put(new vy(), vwVar.f37625a);
            }
            if (vwVar.f37626b != null) {
                hashMap.put(new vz(), vwVar.f37626b);
            }
            if (vwVar.f37627c != null) {
                hashMap.put(new vx(), vwVar.f37627c);
            }
            return new C11535b(this.f37624a, hashMap);
        }
    }

    private vw() {
    }

    /* renamed from: a */
    public static C9306a m46653a() {
        return new C9306a();
    }

    public final DescriptorFactory<C11535b, vw> getDescriptorFactory() {
        return new C11536c();
    }
}
