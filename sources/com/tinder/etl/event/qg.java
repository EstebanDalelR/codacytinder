package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class qg implements EtlEvent {
    /* renamed from: a */
    private Number f37142a;
    /* renamed from: b */
    private Number f37143b;
    /* renamed from: c */
    private String f37144c;
    /* renamed from: d */
    private Boolean f37145d;
    /* renamed from: e */
    private String f37146e;
    /* renamed from: f */
    private List f37147f;
    /* renamed from: g */
    private String f37148g;

    /* renamed from: com.tinder.etl.event.qg$a */
    public static class C9194a {
        /* renamed from: a */
        private qg f31333a;

        private C9194a() {
            this.f31333a = new qg();
        }

        /* renamed from: a */
        public final C9194a m38591a(Number number) {
            this.f31333a.f37142a = number;
            return this;
        }

        /* renamed from: b */
        public final C9194a m38595b(Number number) {
            this.f31333a.f37143b = number;
            return this;
        }

        /* renamed from: a */
        public final C9194a m38592a(String str) {
            this.f31333a.f37144c = str;
            return this;
        }

        /* renamed from: a */
        public final C9194a m38590a(Boolean bool) {
            this.f31333a.f37145d = bool;
            return this;
        }

        /* renamed from: b */
        public final C9194a m38596b(String str) {
            this.f31333a.f37146e = str;
            return this;
        }

        /* renamed from: a */
        public final C9194a m38593a(List list) {
            this.f31333a.f37147f = list;
            return this;
        }

        /* renamed from: c */
        public final C9194a m38597c(String str) {
            this.f31333a.f37148g = str;
            return this;
        }

        /* renamed from: a */
        public qg m38594a() {
            return this.f31333a;
        }
    }

    /* renamed from: com.tinder.etl.event.qg$b */
    public class C11418b extends fw {
        /* renamed from: a */
        final /* synthetic */ qg f37140a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.ClientDeparture";
        }

        public C11418b(qg qgVar, Map<EtlField<?>, Object> map) {
            this.f37140a = qgVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.qg$c */
    private final class C11419c implements DescriptorFactory<C11418b, qg> {
        /* renamed from: a */
        final /* synthetic */ qg f37141a;

        private C11419c(qg qgVar) {
            this.f37141a = qgVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45852a((qg) etlEvent);
        }

        /* renamed from: a */
        public final C11418b m45852a(qg qgVar) {
            Map hashMap = new HashMap();
            if (qgVar.f37142a != null) {
                hashMap.put(new az(), qgVar.f37142a);
            }
            if (qgVar.f37143b != null) {
                hashMap.put(new et(), qgVar.f37143b);
            }
            if (qgVar.f37144c != null) {
                hashMap.put(new gy(), qgVar.f37144c);
            }
            if (qgVar.f37145d != null) {
                hashMap.put(new jz(), qgVar.f37145d);
            }
            if (qgVar.f37146e != null) {
                hashMap.put(new le(), qgVar.f37146e);
            }
            if (qgVar.f37147f != null) {
                hashMap.put(new pa(), qgVar.f37147f);
            }
            if (qgVar.f37148g != null) {
                hashMap.put(new aas(), qgVar.f37148g);
            }
            return new C11418b(this.f37141a, hashMap);
        }
    }

    private qg() {
    }

    /* renamed from: a */
    public static C9194a m45853a() {
        return new C9194a();
    }

    public final DescriptorFactory<C11418b, qg> getDescriptorFactory() {
        return new C11419c();
    }
}
