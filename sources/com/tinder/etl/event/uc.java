package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class uc implements EtlEvent {
    /* renamed from: a */
    private Boolean f37424a;
    /* renamed from: b */
    private Boolean f37425b;
    /* renamed from: c */
    private String f37426c;
    /* renamed from: d */
    private String f37427d;

    /* renamed from: com.tinder.etl.event.uc$a */
    public static class C9280a {
        /* renamed from: a */
        private uc f31376a;

        private C9280a() {
            this.f31376a = new uc();
        }

        /* renamed from: a */
        public final C9280a m38779a(Boolean bool) {
            this.f31376a.f37424a = bool;
            return this;
        }

        /* renamed from: a */
        public final C9280a m38780a(String str) {
            this.f31376a.f37427d = str;
            return this;
        }

        /* renamed from: a */
        public uc m38781a() {
            return this.f31376a;
        }
    }

    /* renamed from: com.tinder.etl.event.uc$b */
    public class C11508b extends fw {
        /* renamed from: a */
        final /* synthetic */ uc f37422a;

        /* renamed from: a */
        public String mo10346a() {
            return "Recs.ProfileClose";
        }

        public C11508b(uc ucVar, Map<EtlField<?>, Object> map) {
            this.f37422a = ucVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.uc$c */
    private final class C11509c implements DescriptorFactory<C11508b, uc> {
        /* renamed from: a */
        final /* synthetic */ uc f37423a;

        private C11509c(uc ucVar) {
            this.f37423a = ucVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46323a((uc) etlEvent);
        }

        /* renamed from: a */
        public final C11508b m46323a(uc ucVar) {
            Map hashMap = new HashMap();
            if (ucVar.f37424a != null) {
                hashMap.put(new ev(), ucVar.f37424a);
            }
            if (ucVar.f37425b != null) {
                hashMap.put(new hj(), ucVar.f37425b);
            }
            if (ucVar.f37426c != null) {
                hashMap.put(new mq(), ucVar.f37426c);
            }
            if (ucVar.f37427d != null) {
                hashMap.put(new ov(), ucVar.f37427d);
            }
            return new C11508b(this.f37423a, hashMap);
        }
    }

    private uc() {
    }

    /* renamed from: a */
    public static C9280a m46324a() {
        return new C9280a();
    }

    public final DescriptorFactory<C11508b, uc> getDescriptorFactory() {
        return new C11509c();
    }
}
