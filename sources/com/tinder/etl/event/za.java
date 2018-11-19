package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class za implements EtlEvent {
    /* renamed from: a */
    private List f37908a;
    /* renamed from: b */
    private Number f37909b;
    /* renamed from: c */
    private String f37910c;
    /* renamed from: d */
    private Number f37911d;
    /* renamed from: e */
    private Number f37912e;
    /* renamed from: f */
    private String f37913f;
    /* renamed from: g */
    private String f37914g;
    /* renamed from: h */
    private Number f37915h;

    /* renamed from: com.tinder.etl.event.za$a */
    public static class C9350a {
        /* renamed from: a */
        private za f31411a;

        private C9350a() {
            this.f31411a = new za();
        }

        /* renamed from: a */
        public final C9350a m39147a(List list) {
            this.f31411a.f37908a = list;
            return this;
        }

        /* renamed from: a */
        public final C9350a m39145a(Number number) {
            this.f31411a.f37909b = number;
            return this;
        }

        /* renamed from: a */
        public final C9350a m39146a(String str) {
            this.f31411a.f37910c = str;
            return this;
        }

        /* renamed from: b */
        public final C9350a m39149b(Number number) {
            this.f31411a.f37911d = number;
            return this;
        }

        /* renamed from: c */
        public final C9350a m39151c(Number number) {
            this.f31411a.f37912e = number;
            return this;
        }

        /* renamed from: b */
        public final C9350a m39150b(String str) {
            this.f31411a.f37913f = str;
            return this;
        }

        /* renamed from: c */
        public final C9350a m39152c(String str) {
            this.f31411a.f37914g = str;
            return this;
        }

        /* renamed from: d */
        public final C9350a m39153d(Number number) {
            this.f31411a.f37915h = number;
            return this;
        }

        /* renamed from: a */
        public za m39148a() {
            return this.f31411a;
        }
    }

    /* renamed from: com.tinder.etl.event.za$b */
    public class C11583b extends fw {
        /* renamed from: a */
        final /* synthetic */ za f37906a;

        /* renamed from: a */
        public String mo10346a() {
            return "TopPicksALCPaywall.Purchase";
        }

        public C11583b(za zaVar, Map<EtlField<?>, Object> map) {
            this.f37906a = zaVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.za$c */
    private final class C11584c implements DescriptorFactory<C11583b, za> {
        /* renamed from: a */
        final /* synthetic */ za f37907a;

        private C11584c(za zaVar) {
            this.f37907a = zaVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m47173a((za) etlEvent);
        }

        /* renamed from: a */
        public final C11583b m47173a(za zaVar) {
            Map hashMap = new HashMap();
            if (zaVar.f37908a != null) {
                hashMap.put(new rm(), zaVar.f37908a);
            }
            if (zaVar.f37909b != null) {
                hashMap.put(new hc(), zaVar.f37909b);
            }
            if (zaVar.f37910c != null) {
                hashMap.put(new wr(), zaVar.f37910c);
            }
            if (zaVar.f37911d != null) {
                hashMap.put(new ar(), zaVar.f37911d);
            }
            if (zaVar.f37912e != null) {
                hashMap.put(new rj(), zaVar.f37912e);
            }
            if (zaVar.f37913f != null) {
                hashMap.put(new ej(), zaVar.f37913f);
            }
            if (zaVar.f37914g != null) {
                hashMap.put(new lc(), zaVar.f37914g);
            }
            if (zaVar.f37915h != null) {
                hashMap.put(new bq(), zaVar.f37915h);
            }
            return new C11583b(this.f37907a, hashMap);
        }
    }

    private za() {
    }

    /* renamed from: a */
    public static C9350a m47174a() {
        return new C9350a();
    }

    public final DescriptorFactory<C11583b, za> getDescriptorFactory() {
        return new C11584c();
    }
}
