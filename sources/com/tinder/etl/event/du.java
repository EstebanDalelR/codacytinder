package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class du implements EtlEvent {
    /* renamed from: a */
    private String f36639a;
    /* renamed from: b */
    private String f36640b;
    /* renamed from: c */
    private String f36641c;
    /* renamed from: d */
    private Number f36642d;
    /* renamed from: e */
    private String f36643e;
    /* renamed from: f */
    private Number f36644f;
    /* renamed from: g */
    private String f36645g;
    /* renamed from: h */
    private String f36646h;
    /* renamed from: i */
    private String f36647i;
    /* renamed from: j */
    private Map f36648j;

    /* renamed from: com.tinder.etl.event.du$a */
    public static class C9064a {
        /* renamed from: a */
        private du f31267a;

        private C9064a() {
            this.f31267a = new du();
        }

        /* renamed from: a */
        public final C9064a m38201a(String str) {
            this.f31267a.f36639a = str;
            return this;
        }

        /* renamed from: b */
        public final C9064a m38205b(String str) {
            this.f31267a.f36640b = str;
            return this;
        }

        /* renamed from: c */
        public final C9064a m38206c(String str) {
            this.f31267a.f36641c = str;
            return this;
        }

        /* renamed from: a */
        public final C9064a m38200a(Number number) {
            this.f31267a.f36642d = number;
            return this;
        }

        /* renamed from: d */
        public final C9064a m38207d(String str) {
            this.f31267a.f36643e = str;
            return this;
        }

        /* renamed from: b */
        public final C9064a m38204b(Number number) {
            this.f31267a.f36644f = number;
            return this;
        }

        /* renamed from: e */
        public final C9064a m38208e(String str) {
            this.f31267a.f36645g = str;
            return this;
        }

        /* renamed from: f */
        public final C9064a m38209f(String str) {
            this.f31267a.f36646h = str;
            return this;
        }

        /* renamed from: a */
        public final C9064a m38202a(Map map) {
            this.f31267a.f36648j = map;
            return this;
        }

        /* renamed from: a */
        public du m38203a() {
            return this.f31267a;
        }
    }

    /* renamed from: com.tinder.etl.event.du$b */
    public class C11274b extends fw {
        /* renamed from: a */
        final /* synthetic */ du f36637a;

        /* renamed from: a */
        public String mo10346a() {
            return "Client.PerfEvent";
        }

        public C11274b(du duVar, Map<EtlField<?>, Object> map) {
            this.f36637a = duVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.du$c */
    private final class C11275c implements DescriptorFactory<C11274b, du> {
        /* renamed from: a */
        final /* synthetic */ du f36638a;

        private C11275c(du duVar) {
            this.f36638a = duVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44961a((du) etlEvent);
        }

        /* renamed from: a */
        public final C11274b m44961a(du duVar) {
            Map hashMap = new HashMap();
            if (duVar.f36639a != null) {
                hashMap.put(new nf(), duVar.f36639a);
            }
            if (duVar.f36640b != null) {
                hashMap.put(new nc(), duVar.f36640b);
            }
            if (duVar.f36641c != null) {
                hashMap.put(new ne(), duVar.f36641c);
            }
            if (duVar.f36642d != null) {
                hashMap.put(new ni(), duVar.f36642d);
            }
            if (duVar.f36643e != null) {
                hashMap.put(new nd(), duVar.f36643e);
            }
            if (duVar.f36644f != null) {
                hashMap.put(new fk(), duVar.f36644f);
            }
            if (duVar.f36645g != null) {
                hashMap.put(new uz(), duVar.f36645g);
            }
            if (duVar.f36646h != null) {
                hashMap.put(new ov(), duVar.f36646h);
            }
            if (duVar.f36647i != null) {
                hashMap.put(new ll(), duVar.f36647i);
            }
            if (duVar.f36648j != null) {
                hashMap.put(new pf(), duVar.f36648j);
            }
            return new C11274b(this.f36638a, hashMap);
        }
    }

    private du() {
    }

    /* renamed from: a */
    public static C9064a m44962a() {
        return new C9064a();
    }

    public final DescriptorFactory<C11274b, du> getDescriptorFactory() {
        return new C11275c();
    }
}
