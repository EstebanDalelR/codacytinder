package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class dp implements EtlEvent {
    /* renamed from: a */
    private String f36581a;
    /* renamed from: b */
    private Boolean f36582b;
    /* renamed from: c */
    private Boolean f36583c;
    /* renamed from: d */
    private String f36584d;
    /* renamed from: e */
    private String f36585e;
    /* renamed from: f */
    private String f36586f;
    /* renamed from: g */
    private Number f36587g;
    /* renamed from: h */
    private Number f36588h;
    /* renamed from: i */
    private String f36589i;
    /* renamed from: j */
    private Boolean f36590j;

    /* renamed from: com.tinder.etl.event.dp$a */
    public static class C9054a {
        /* renamed from: a */
        private dp f31262a;

        private C9054a() {
            this.f31262a = new dp();
        }

        /* renamed from: a */
        public final C9054a m38152a(String str) {
            this.f31262a.f36581a = str;
            return this;
        }

        /* renamed from: a */
        public final C9054a m38150a(Boolean bool) {
            this.f31262a.f36582b = bool;
            return this;
        }

        /* renamed from: b */
        public final C9054a m38156b(String str) {
            this.f31262a.f36584d = str;
            return this;
        }

        /* renamed from: c */
        public final C9054a m38157c(String str) {
            this.f31262a.f36585e = str;
            return this;
        }

        /* renamed from: d */
        public final C9054a m38158d(String str) {
            this.f31262a.f36586f = str;
            return this;
        }

        /* renamed from: a */
        public final C9054a m38151a(Number number) {
            this.f31262a.f36587g = number;
            return this;
        }

        /* renamed from: b */
        public final C9054a m38155b(Number number) {
            this.f31262a.f36588h = number;
            return this;
        }

        /* renamed from: e */
        public final C9054a m38159e(String str) {
            this.f31262a.f36589i = str;
            return this;
        }

        /* renamed from: b */
        public final C9054a m38154b(Boolean bool) {
            this.f31262a.f36590j = bool;
            return this;
        }

        /* renamed from: a */
        public dp m38153a() {
            return this.f31262a;
        }
    }

    /* renamed from: com.tinder.etl.event.dp$b */
    public class C11264b extends fw {
        /* renamed from: a */
        final /* synthetic */ dp f36579a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.TapInputType";
        }

        public C11264b(dp dpVar, Map<EtlField<?>, Object> map) {
            this.f36579a = dpVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.dp$c */
    private final class C11265c implements DescriptorFactory<C11264b, dp> {
        /* renamed from: a */
        final /* synthetic */ dp f36580a;

        private C11265c(dp dpVar) {
            this.f36580a = dpVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44853a((dp) etlEvent);
        }

        /* renamed from: a */
        public final C11264b m44853a(dp dpVar) {
            Map hashMap = new HashMap();
            if (dpVar.f36581a != null) {
                hashMap.put(new cq(), dpVar.f36581a);
            }
            if (dpVar.f36582b != null) {
                hashMap.put(new ev(), dpVar.f36582b);
            }
            if (dpVar.f36583c != null) {
                hashMap.put(new ja(), dpVar.f36583c);
            }
            if (dpVar.f36584d != null) {
                hashMap.put(new kb(), dpVar.f36584d);
            }
            if (dpVar.f36585e != null) {
                hashMap.put(new ll(), dpVar.f36585e);
            }
            if (dpVar.f36586f != null) {
                hashMap.put(new lx(), dpVar.f36586f);
            }
            if (dpVar.f36587g != null) {
                hashMap.put(new nx(), dpVar.f36587g);
            }
            if (dpVar.f36588h != null) {
                hashMap.put(new ny(), dpVar.f36588h);
            }
            if (dpVar.f36589i != null) {
                hashMap.put(new ov(), dpVar.f36589i);
            }
            if (dpVar.f36590j != null) {
                hashMap.put(new xh(), dpVar.f36590j);
            }
            return new C11264b(this.f36580a, hashMap);
        }
    }

    private dp() {
    }

    /* renamed from: a */
    public static C9054a m44854a() {
        return new C9054a();
    }

    public final DescriptorFactory<C11264b, dp> getDescriptorFactory() {
        return new C11265c();
    }
}
