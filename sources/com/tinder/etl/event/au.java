package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class au implements EtlEvent {
    /* renamed from: a */
    private String f36211a;
    /* renamed from: b */
    private String f36212b;
    /* renamed from: c */
    private Number f36213c;
    /* renamed from: d */
    private Boolean f36214d;

    /* renamed from: com.tinder.etl.event.au$a */
    public static class C8982a {
        /* renamed from: a */
        private au f31226a;

        private C8982a() {
            this.f31226a = new au();
        }

        /* renamed from: a */
        public final C8982a m37847a(String str) {
            this.f31226a.f36211a = str;
            return this;
        }

        /* renamed from: b */
        public final C8982a m37849b(String str) {
            this.f31226a.f36212b = str;
            return this;
        }

        /* renamed from: a */
        public final C8982a m37846a(Number number) {
            this.f31226a.f36213c = number;
            return this;
        }

        /* renamed from: a */
        public final C8982a m37845a(Boolean bool) {
            this.f31226a.f36214d = bool;
            return this;
        }

        /* renamed from: a */
        public au m37848a() {
            return this.f31226a;
        }
    }

    /* renamed from: com.tinder.etl.event.au$b */
    public class C11188b extends fw {
        /* renamed from: a */
        final /* synthetic */ au f36209a;

        /* renamed from: a */
        public String mo10346a() {
            return "App.Screenshot";
        }

        public C11188b(au auVar, Map<EtlField<?>, Object> map) {
            this.f36209a = auVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.au$c */
    private final class C11189c implements DescriptorFactory<C11188b, au> {
        /* renamed from: a */
        final /* synthetic */ au f36210a;

        private C11189c(au auVar) {
            this.f36210a = auVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44178a((au) etlEvent);
        }

        /* renamed from: a */
        public final C11188b m44178a(au auVar) {
            Map hashMap = new HashMap();
            if (auVar.f36211a != null) {
                hashMap.put(new hk(), auVar.f36211a);
            }
            if (auVar.f36212b != null) {
                hashMap.put(new or(), auVar.f36212b);
            }
            if (auVar.f36213c != null) {
                hashMap.put(new vl(), auVar.f36213c);
            }
            if (auVar.f36214d != null) {
                hashMap.put(new py(), auVar.f36214d);
            }
            return new C11188b(this.f36210a, hashMap);
        }
    }

    private au() {
    }

    /* renamed from: a */
    public static C8982a m44179a() {
        return new C8982a();
    }

    public final DescriptorFactory<C11188b, au> getDescriptorFactory() {
        return new C11189c();
    }
}
