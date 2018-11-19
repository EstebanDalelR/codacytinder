package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class lp implements EtlEvent {
    /* renamed from: a */
    private String f37048a;
    /* renamed from: b */
    private String f37049b;
    /* renamed from: c */
    private Boolean f37050c;
    /* renamed from: d */
    private Number f37051d;
    /* renamed from: e */
    private Number f37052e;
    /* renamed from: f */
    private String f37053f;

    /* renamed from: com.tinder.etl.event.lp$a */
    public static class C9166a {
        /* renamed from: a */
        private lp f31319a;

        private C9166a() {
            this.f31319a = new lp();
        }

        /* renamed from: a */
        public final C9166a m38534a(String str) {
            this.f31319a.f37048a = str;
            return this;
        }

        /* renamed from: a */
        public final C9166a m38533a(Boolean bool) {
            this.f31319a.f37050c = bool;
            return this;
        }

        /* renamed from: a */
        public lp m38535a() {
            return this.f31319a;
        }
    }

    /* renamed from: com.tinder.etl.event.lp$b */
    public class C11385b extends fw {
        /* renamed from: a */
        final /* synthetic */ lp f37046a;

        /* renamed from: a */
        public String mo10346a() {
            return "Match.MuteNotifications";
        }

        public C11385b(lp lpVar, Map<EtlField<?>, Object> map) {
            this.f37046a = lpVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.lp$c */
    private final class C11386c implements DescriptorFactory<C11385b, lp> {
        /* renamed from: a */
        final /* synthetic */ lp f37047a;

        private C11386c(lp lpVar) {
            this.f37047a = lpVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45701a((lp) etlEvent);
        }

        /* renamed from: a */
        public final C11385b m45701a(lp lpVar) {
            Map hashMap = new HashMap();
            if (lpVar.f37048a != null) {
                hashMap.put(new ll(), lpVar.f37048a);
            }
            if (lpVar.f37049b != null) {
                hashMap.put(new ov(), lpVar.f37049b);
            }
            if (lpVar.f37050c != null) {
                hashMap.put(new mt(), lpVar.f37050c);
            }
            if (lpVar.f37051d != null) {
                hashMap.put(new ny(), lpVar.f37051d);
            }
            if (lpVar.f37052e != null) {
                hashMap.put(new nx(), lpVar.f37052e);
            }
            if (lpVar.f37053f != null) {
                hashMap.put(new kb(), lpVar.f37053f);
            }
            return new C11385b(this.f37047a, hashMap);
        }
    }

    private lp() {
    }

    /* renamed from: a */
    public static C9166a m45702a() {
        return new C9166a();
    }

    public final DescriptorFactory<C11385b, lp> getDescriptorFactory() {
        return new C11386c();
    }
}
