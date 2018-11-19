package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ix implements EtlEvent {
    /* renamed from: a */
    private String f36977a;
    /* renamed from: b */
    private String f36978b;
    /* renamed from: c */
    private String f36979c;
    /* renamed from: d */
    private String f36980d;
    /* renamed from: e */
    private String f36981e;

    /* renamed from: com.tinder.etl.event.ix$a */
    public static class C9146a {
        /* renamed from: a */
        private ix f31309a;

        private C9146a() {
            this.f31309a = new ix();
        }

        /* renamed from: a */
        public final C9146a m38478a(String str) {
            this.f31309a.f36977a = str;
            return this;
        }

        /* renamed from: b */
        public final C9146a m38480b(String str) {
            this.f31309a.f36978b = str;
            return this;
        }

        /* renamed from: c */
        public final C9146a m38481c(String str) {
            this.f31309a.f36979c = str;
            return this;
        }

        /* renamed from: d */
        public final C9146a m38482d(String str) {
            this.f31309a.f36980d = str;
            return this;
        }

        /* renamed from: e */
        public final C9146a m38483e(String str) {
            this.f31309a.f36981e = str;
            return this;
        }

        /* renamed from: a */
        public ix m38479a() {
            return this.f31309a;
        }
    }

    /* renamed from: com.tinder.etl.event.ix$b */
    public class C11362b extends fw {
        /* renamed from: a */
        final /* synthetic */ ix f36975a;

        /* renamed from: a */
        public String mo10346a() {
            return "GrandGesture.UpdateSetting";
        }

        public C11362b(ix ixVar, Map<EtlField<?>, Object> map) {
            this.f36975a = ixVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ix$c */
    private final class C11363c implements DescriptorFactory<C11362b, ix> {
        /* renamed from: a */
        final /* synthetic */ ix f36976a;

        private C11363c(ix ixVar) {
            this.f36976a = ixVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45575a((ix) etlEvent);
        }

        /* renamed from: a */
        public final C11362b m45575a(ix ixVar) {
            Map hashMap = new HashMap();
            if (ixVar.f36977a != null) {
                hashMap.put(new hr(), ixVar.f36977a);
            }
            if (ixVar.f36978b != null) {
                hashMap.put(new ll(), ixVar.f36978b);
            }
            if (ixVar.f36979c != null) {
                hashMap.put(new ov(), ixVar.f36979c);
            }
            if (ixVar.f36980d != null) {
                hashMap.put(new wf(), ixVar.f36980d);
            }
            if (ixVar.f36981e != null) {
                hashMap.put(new wg(), ixVar.f36981e);
            }
            return new C11362b(this.f36976a, hashMap);
        }
    }

    private ix() {
    }

    /* renamed from: a */
    public static C9146a m45576a() {
        return new C9146a();
    }

    public final DescriptorFactory<C11362b, ix> getDescriptorFactory() {
        return new C11363c();
    }
}
