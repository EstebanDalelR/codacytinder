package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class qf implements EtlEvent {
    /* renamed from: a */
    private Number f37136a;
    /* renamed from: b */
    private Boolean f37137b;
    /* renamed from: c */
    private String f37138c;
    /* renamed from: d */
    private String f37139d;

    /* renamed from: com.tinder.etl.event.qf$a */
    public static class C9192a {
        /* renamed from: a */
        private qf f31332a;

        private C9192a() {
            this.f31332a = new qf();
        }

        /* renamed from: a */
        public final C9192a m38586a(Number number) {
            this.f31332a.f37136a = number;
            return this;
        }

        /* renamed from: a */
        public final C9192a m38585a(Boolean bool) {
            this.f31332a.f37137b = bool;
            return this;
        }

        /* renamed from: a */
        public final C9192a m38587a(String str) {
            this.f31332a.f37138c = str;
            return this;
        }

        /* renamed from: b */
        public final C9192a m38589b(String str) {
            this.f31332a.f37139d = str;
            return this;
        }

        /* renamed from: a */
        public qf m38588a() {
            return this.f31332a;
        }
    }

    /* renamed from: com.tinder.etl.event.qf$b */
    public class C11416b extends fw {
        /* renamed from: a */
        final /* synthetic */ qf f37134a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.ClientArrivalWorkHome";
        }

        public C11416b(qf qfVar, Map<EtlField<?>, Object> map) {
            this.f37134a = qfVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.qf$c */
    private final class C11417c implements DescriptorFactory<C11416b, qf> {
        /* renamed from: a */
        final /* synthetic */ qf f37135a;

        private C11417c(qf qfVar) {
            this.f37135a = qfVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45841a((qf) etlEvent);
        }

        /* renamed from: a */
        public final C11416b m45841a(qf qfVar) {
            Map hashMap = new HashMap();
            if (qfVar.f37136a != null) {
                hashMap.put(new az(), qfVar.f37136a);
            }
            if (qfVar.f37137b != null) {
                hashMap.put(new jz(), qfVar.f37137b);
            }
            if (qfVar.f37138c != null) {
                hashMap.put(new le(), qfVar.f37138c);
            }
            if (qfVar.f37139d != null) {
                hashMap.put(new aas(), qfVar.f37139d);
            }
            return new C11416b(this.f37135a, hashMap);
        }
    }

    private qf() {
    }

    /* renamed from: a */
    public static C9192a m45842a() {
        return new C9192a();
    }

    public final DescriptorFactory<C11416b, qf> getDescriptorFactory() {
        return new C11417c();
    }
}
