package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ub implements EtlEvent {
    /* renamed from: a */
    private String f37410a;
    /* renamed from: b */
    private Boolean f37411b;
    /* renamed from: c */
    private Number f37412c;
    /* renamed from: d */
    private Number f37413d;
    /* renamed from: e */
    private Number f37414e;
    /* renamed from: f */
    private Number f37415f;
    /* renamed from: g */
    private Number f37416g;
    /* renamed from: h */
    private String f37417h;
    /* renamed from: i */
    private Number f37418i;
    /* renamed from: j */
    private String f37419j;
    /* renamed from: k */
    private String f37420k;
    /* renamed from: l */
    private Number f37421l;

    /* renamed from: com.tinder.etl.event.ub$a */
    public static class C9278a {
        /* renamed from: a */
        private ub f31375a;

        private C9278a() {
            this.f31375a = new ub();
        }

        /* renamed from: a */
        public final C9278a m38774a(String str) {
            this.f31375a.f37410a = str;
            return this;
        }

        /* renamed from: a */
        public final C9278a m38772a(Boolean bool) {
            this.f31375a.f37411b = bool;
            return this;
        }

        /* renamed from: b */
        public final C9278a m38776b(String str) {
            this.f31375a.f37417h = str;
            return this;
        }

        /* renamed from: c */
        public final C9278a m38777c(String str) {
            this.f31375a.f37419j = str;
            return this;
        }

        /* renamed from: d */
        public final C9278a m38778d(String str) {
            this.f31375a.f37420k = str;
            return this;
        }

        /* renamed from: a */
        public final C9278a m38773a(Number number) {
            this.f31375a.f37421l = number;
            return this;
        }

        /* renamed from: a */
        public ub m38775a() {
            return this.f31375a;
        }
    }

    /* renamed from: com.tinder.etl.event.ub$b */
    public class C11506b extends fw {
        /* renamed from: a */
        final /* synthetic */ ub f37408a;

        /* renamed from: a */
        public String mo10346a() {
            return "Recs.PhotoView";
        }

        public C11506b(ub ubVar, Map<EtlField<?>, Object> map) {
            this.f37408a = ubVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ub$c */
    private final class C11507c implements DescriptorFactory<C11506b, ub> {
        /* renamed from: a */
        final /* synthetic */ ub f37409a;

        private C11507c(ub ubVar) {
            this.f37409a = ubVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46302a((ub) etlEvent);
        }

        /* renamed from: a */
        public final C11506b m46302a(ub ubVar) {
            Map hashMap = new HashMap();
            if (ubVar.f37410a != null) {
                hashMap.put(new eq(), ubVar.f37410a);
            }
            if (ubVar.f37411b != null) {
                hashMap.put(new ev(), ubVar.f37411b);
            }
            if (ubVar.f37412c != null) {
                hashMap.put(new lf(), ubVar.f37412c);
            }
            if (ubVar.f37413d != null) {
                hashMap.put(new ma(), ubVar.f37413d);
            }
            if (ubVar.f37414e != null) {
                hashMap.put(new mc(), ubVar.f37414e);
            }
            if (ubVar.f37415f != null) {
                hashMap.put(new me(), ubVar.f37415f);
            }
            if (ubVar.f37416g != null) {
                hashMap.put(new pp(), ubVar.f37416g);
            }
            if (ubVar.f37417h != null) {
                hashMap.put(new pq(), ubVar.f37417h);
            }
            if (ubVar.f37418i != null) {
                hashMap.put(new pr(), ubVar.f37418i);
            }
            if (ubVar.f37419j != null) {
                hashMap.put(new uw(), ubVar.f37419j);
            }
            if (ubVar.f37420k != null) {
                hashMap.put(new ov(), ubVar.f37420k);
            }
            if (ubVar.f37421l != null) {
                hashMap.put(new pu(), ubVar.f37421l);
            }
            return new C11506b(this.f37409a, hashMap);
        }
    }

    private ub() {
    }

    /* renamed from: a */
    public static C9278a m46303a() {
        return new C9278a();
    }

    public final DescriptorFactory<C11506b, ub> getDescriptorFactory() {
        return new C11507c();
    }
}
