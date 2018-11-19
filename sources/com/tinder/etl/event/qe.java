package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class qe implements EtlEvent {
    /* renamed from: a */
    private Number f37128a;
    /* renamed from: b */
    private String f37129b;
    /* renamed from: c */
    private Boolean f37130c;
    /* renamed from: d */
    private String f37131d;
    /* renamed from: e */
    private List f37132e;
    /* renamed from: f */
    private String f37133f;

    /* renamed from: com.tinder.etl.event.qe$a */
    public static class C9190a {
        /* renamed from: a */
        private qe f31331a;

        private C9190a() {
            this.f31331a = new qe();
        }

        /* renamed from: a */
        public final C9190a m38579a(Number number) {
            this.f31331a.f37128a = number;
            return this;
        }

        /* renamed from: a */
        public final C9190a m38580a(String str) {
            this.f31331a.f37129b = str;
            return this;
        }

        /* renamed from: a */
        public final C9190a m38578a(Boolean bool) {
            this.f31331a.f37130c = bool;
            return this;
        }

        /* renamed from: b */
        public final C9190a m38583b(String str) {
            this.f31331a.f37131d = str;
            return this;
        }

        /* renamed from: a */
        public final C9190a m38581a(List list) {
            this.f31331a.f37132e = list;
            return this;
        }

        /* renamed from: c */
        public final C9190a m38584c(String str) {
            this.f31331a.f37133f = str;
            return this;
        }

        /* renamed from: a */
        public qe m38582a() {
            return this.f31331a;
        }
    }

    /* renamed from: com.tinder.etl.event.qe$b */
    public class C11414b extends fw {
        /* renamed from: a */
        final /* synthetic */ qe f37126a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.ClientArrival";
        }

        public C11414b(qe qeVar, Map<EtlField<?>, Object> map) {
            this.f37126a = qeVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.qe$c */
    private final class C11415c implements DescriptorFactory<C11414b, qe> {
        /* renamed from: a */
        final /* synthetic */ qe f37127a;

        private C11415c(qe qeVar) {
            this.f37127a = qeVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45826a((qe) etlEvent);
        }

        /* renamed from: a */
        public final C11414b m45826a(qe qeVar) {
            Map hashMap = new HashMap();
            if (qeVar.f37128a != null) {
                hashMap.put(new az(), qeVar.f37128a);
            }
            if (qeVar.f37129b != null) {
                hashMap.put(new gy(), qeVar.f37129b);
            }
            if (qeVar.f37130c != null) {
                hashMap.put(new jz(), qeVar.f37130c);
            }
            if (qeVar.f37131d != null) {
                hashMap.put(new le(), qeVar.f37131d);
            }
            if (qeVar.f37132e != null) {
                hashMap.put(new pa(), qeVar.f37132e);
            }
            if (qeVar.f37133f != null) {
                hashMap.put(new aas(), qeVar.f37133f);
            }
            return new C11414b(this.f37127a, hashMap);
        }
    }

    private qe() {
    }

    /* renamed from: a */
    public static C9190a m45827a() {
        return new C9190a();
    }

    public final DescriptorFactory<C11414b, qe> getDescriptorFactory() {
        return new C11415c();
    }
}
