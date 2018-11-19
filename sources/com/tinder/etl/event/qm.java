package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class qm implements EtlEvent {
    /* renamed from: a */
    private Boolean f37174a;
    /* renamed from: b */
    private String f37175b;
    /* renamed from: c */
    private Number f37176c;
    /* renamed from: d */
    private Boolean f37177d;
    /* renamed from: e */
    private Number f37178e;
    /* renamed from: f */
    private List f37179f;
    /* renamed from: g */
    private String f37180g;

    /* renamed from: com.tinder.etl.event.qm$a */
    public static class C9204a {
        /* renamed from: a */
        private qm f31338a;

        private C9204a() {
            this.f31338a = new qm();
        }

        /* renamed from: a */
        public final C9204a m38619a(String str) {
            this.f31338a.f37175b = str;
            return this;
        }

        /* renamed from: a */
        public final C9204a m38618a(Number number) {
            this.f31338a.f37176c = number;
            return this;
        }

        /* renamed from: a */
        public final C9204a m38617a(Boolean bool) {
            this.f31338a.f37177d = bool;
            return this;
        }

        /* renamed from: b */
        public final C9204a m38621b(Number number) {
            this.f31338a.f37178e = number;
            return this;
        }

        /* renamed from: b */
        public final C9204a m38622b(String str) {
            this.f31338a.f37180g = str;
            return this;
        }

        /* renamed from: a */
        public qm m38620a() {
            return this.f31338a;
        }
    }

    /* renamed from: com.tinder.etl.event.qm$b */
    public class C11428b extends fw {
        /* renamed from: a */
        final /* synthetic */ qm f37172a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.ManageEnabled";
        }

        public C11428b(qm qmVar, Map<EtlField<?>, Object> map) {
            this.f37172a = qmVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.qm$c */
    private final class C11429c implements DescriptorFactory<C11428b, qm> {
        /* renamed from: a */
        final /* synthetic */ qm f37173a;

        private C11429c(qm qmVar) {
            this.f37173a = qmVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45911a((qm) etlEvent);
        }

        /* renamed from: a */
        public final C11428b m45911a(qm qmVar) {
            Map hashMap = new HashMap();
            if (qmVar.f37174a != null) {
                hashMap.put(new dx(), qmVar.f37174a);
            }
            if (qmVar.f37175b != null) {
                hashMap.put(new el(), qmVar.f37175b);
            }
            if (qmVar.f37176c != null) {
                hashMap.put(new ft(), qmVar.f37176c);
            }
            if (qmVar.f37177d != null) {
                hashMap.put(new qj(), qmVar.f37177d);
            }
            if (qmVar.f37178e != null) {
                hashMap.put(new tj(), qmVar.f37178e);
            }
            if (qmVar.f37179f != null) {
                hashMap.put(new tk(), qmVar.f37179f);
            }
            if (qmVar.f37180g != null) {
                hashMap.put(new wy(), qmVar.f37180g);
            }
            return new C11428b(this.f37173a, hashMap);
        }
    }

    private qm() {
    }

    /* renamed from: a */
    public static C9204a m45912a() {
        return new C9204a();
    }

    public final DescriptorFactory<C11428b, qm> getDescriptorFactory() {
        return new C11429c();
    }
}
