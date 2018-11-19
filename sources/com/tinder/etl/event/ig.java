package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ig implements EtlEvent {
    /* renamed from: a */
    private Number f36845a;
    /* renamed from: b */
    private String f36846b;
    /* renamed from: c */
    private Number f36847c;
    /* renamed from: d */
    private String f36848d;
    /* renamed from: e */
    private Number f36849e;
    /* renamed from: f */
    private Number f36850f;
    /* renamed from: g */
    private List f36851g;
    /* renamed from: h */
    private Number f36852h;
    /* renamed from: i */
    private String f36853i;
    /* renamed from: j */
    private List f36854j;

    /* renamed from: com.tinder.etl.event.ig$a */
    public static class C9114a {
        /* renamed from: a */
        private ig f31293a;

        private C9114a() {
            this.f31293a = new ig();
        }

        /* renamed from: a */
        public final C9114a m38373a(Number number) {
            this.f31293a.f36845a = number;
            return this;
        }

        /* renamed from: a */
        public final C9114a m38374a(String str) {
            this.f31293a.f36846b = str;
            return this;
        }

        /* renamed from: b */
        public final C9114a m38377b(Number number) {
            this.f31293a.f36847c = number;
            return this;
        }

        /* renamed from: b */
        public final C9114a m38378b(String str) {
            this.f31293a.f36848d = str;
            return this;
        }

        /* renamed from: c */
        public final C9114a m38380c(Number number) {
            this.f31293a.f36849e = number;
            return this;
        }

        /* renamed from: d */
        public final C9114a m38382d(Number number) {
            this.f31293a.f36850f = number;
            return this;
        }

        /* renamed from: a */
        public final C9114a m38375a(List list) {
            this.f31293a.f36851g = list;
            return this;
        }

        /* renamed from: e */
        public final C9114a m38383e(Number number) {
            this.f31293a.f36852h = number;
            return this;
        }

        /* renamed from: c */
        public final C9114a m38381c(String str) {
            this.f31293a.f36853i = str;
            return this;
        }

        /* renamed from: b */
        public final C9114a m38379b(List list) {
            this.f31293a.f36854j = list;
            return this;
        }

        /* renamed from: a */
        public ig m38376a() {
            return this.f31293a;
        }
    }

    /* renamed from: com.tinder.etl.event.ig$b */
    public class C11330b extends fw {
        /* renamed from: a */
        final /* synthetic */ ig f36843a;

        /* renamed from: a */
        public String mo10346a() {
            return "Gold.Cancel";
        }

        public C11330b(ig igVar, Map<EtlField<?>, Object> map) {
            this.f36843a = igVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ig$c */
    private final class C11331c implements DescriptorFactory<C11330b, ig> {
        /* renamed from: a */
        final /* synthetic */ ig f36844a;

        private C11331c(ig igVar) {
            this.f36844a = igVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45338a((ig) etlEvent);
        }

        /* renamed from: a */
        public final C11330b m45338a(ig igVar) {
            Map hashMap = new HashMap();
            if (igVar.f36845a != null) {
                hashMap.put(new bq(), igVar.f36845a);
            }
            if (igVar.f36846b != null) {
                hashMap.put(new ej(), igVar.f36846b);
            }
            if (igVar.f36847c != null) {
                hashMap.put(new kf(), igVar.f36847c);
            }
            if (igVar.f36848d != null) {
                hashMap.put(new lc(), igVar.f36848d);
            }
            if (igVar.f36849e != null) {
                hashMap.put(new pk(), igVar.f36849e);
            }
            if (igVar.f36850f != null) {
                hashMap.put(new pl(), igVar.f36850f);
            }
            if (igVar.f36851g != null) {
                hashMap.put(new rm(), igVar.f36851g);
            }
            if (igVar.f36852h != null) {
                hashMap.put(new sk(), igVar.f36852h);
            }
            if (igVar.f36853i != null) {
                hashMap.put(new wr(), igVar.f36853i);
            }
            if (igVar.f36854j != null) {
                hashMap.put(new ws(), igVar.f36854j);
            }
            return new C11330b(this.f36844a, hashMap);
        }
    }

    private ig() {
    }

    /* renamed from: a */
    public static C9114a m45339a() {
        return new C9114a();
    }

    public final DescriptorFactory<C11330b, ig> getDescriptorFactory() {
        return new C11331c();
    }
}
