package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class qs implements EtlEvent {
    /* renamed from: a */
    private Boolean f37213a;
    /* renamed from: b */
    private Number f37214b;
    /* renamed from: c */
    private Number f37215c;
    /* renamed from: d */
    private String f37216d;

    /* renamed from: com.tinder.etl.event.qs$a */
    public static class C9216a {
        /* renamed from: a */
        private qs f31344a;

        private C9216a() {
            this.f31344a = new qs();
        }

        /* renamed from: a */
        public final C9216a m38646a(Number number) {
            this.f31344a.f37214b = number;
            return this;
        }

        /* renamed from: b */
        public final C9216a m38649b(Number number) {
            this.f31344a.f37215c = number;
            return this;
        }

        /* renamed from: a */
        public final C9216a m38647a(String str) {
            this.f31344a.f37216d = str;
            return this;
        }

        /* renamed from: a */
        public qs m38648a() {
            return this.f31344a;
        }
    }

    /* renamed from: com.tinder.etl.event.qs$b */
    public class C11440b extends fw {
        /* renamed from: a */
        final /* synthetic */ qs f37211a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.ViewDetail";
        }

        public C11440b(qs qsVar, Map<EtlField<?>, Object> map) {
            this.f37211a = qsVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.qs$c */
    private final class C11441c implements DescriptorFactory<C11440b, qs> {
        /* renamed from: a */
        final /* synthetic */ qs f37212a;

        private C11441c(qs qsVar) {
            this.f37212a = qsVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45979a((qs) etlEvent);
        }

        /* renamed from: a */
        public final C11440b m45979a(qs qsVar) {
            Map hashMap = new HashMap();
            if (qsVar.f37213a != null) {
                hashMap.put(new ju(), qsVar.f37213a);
            }
            if (qsVar.f37214b != null) {
                hashMap.put(new nz(), qsVar.f37214b);
            }
            if (qsVar.f37215c != null) {
                hashMap.put(new oi(), qsVar.f37215c);
            }
            if (qsVar.f37216d != null) {
                hashMap.put(new qb(), qsVar.f37216d);
            }
            return new C11440b(this.f37212a, hashMap);
        }
    }

    private qs() {
    }

    /* renamed from: a */
    public static C9216a m45980a() {
        return new C9216a();
    }

    public final DescriptorFactory<C11440b, qs> getDescriptorFactory() {
        return new C11441c();
    }
}
