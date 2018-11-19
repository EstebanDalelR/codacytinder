package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class qi implements EtlEvent {
    /* renamed from: a */
    private String f37158a;
    /* renamed from: b */
    private Boolean f37159b;
    /* renamed from: c */
    private Number f37160c;
    /* renamed from: d */
    private Boolean f37161d;
    /* renamed from: e */
    private Number f37162e;
    /* renamed from: f */
    private String f37163f;

    /* renamed from: com.tinder.etl.event.qi$a */
    public static class C9198a {
        /* renamed from: a */
        private qi f31335a;

        private C9198a() {
            this.f31335a = new qi();
        }

        /* renamed from: a */
        public final C9198a m38606a(String str) {
            this.f31335a.f37158a = str;
            return this;
        }

        /* renamed from: a */
        public final C9198a m38604a(Boolean bool) {
            this.f31335a.f37159b = bool;
            return this;
        }

        /* renamed from: a */
        public final C9198a m38605a(Number number) {
            this.f31335a.f37160c = number;
            return this;
        }

        /* renamed from: b */
        public final C9198a m38608b(Boolean bool) {
            this.f31335a.f37161d = bool;
            return this;
        }

        /* renamed from: b */
        public final C9198a m38609b(Number number) {
            this.f31335a.f37162e = number;
            return this;
        }

        /* renamed from: b */
        public final C9198a m38610b(String str) {
            this.f31335a.f37163f = str;
            return this;
        }

        /* renamed from: a */
        public qi m38607a() {
            return this.f31335a;
        }
    }

    /* renamed from: com.tinder.etl.event.qi$b */
    public class C11422b extends fw {
        /* renamed from: a */
        final /* synthetic */ qi f37156a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.CorrectRecentPlace";
        }

        public C11422b(qi qiVar, Map<EtlField<?>, Object> map) {
            this.f37156a = qiVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.qi$c */
    private final class C11423c implements DescriptorFactory<C11422b, qi> {
        /* renamed from: a */
        final /* synthetic */ qi f37157a;

        private C11423c(qi qiVar) {
            this.f37157a = qiVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45882a((qi) etlEvent);
        }

        /* renamed from: a */
        public final C11422b m45882a(qi qiVar) {
            Map hashMap = new HashMap();
            if (qiVar.f37158a != null) {
                hashMap.put(new aq(), qiVar.f37158a);
            }
            if (qiVar.f37159b != null) {
                hashMap.put(new dx(), qiVar.f37159b);
            }
            if (qiVar.f37160c != null) {
                hashMap.put(new ft(), qiVar.f37160c);
            }
            if (qiVar.f37161d != null) {
                hashMap.put(new mz(), qiVar.f37161d);
            }
            if (qiVar.f37162e != null) {
                hashMap.put(new nn(), qiVar.f37162e);
            }
            if (qiVar.f37163f != null) {
                hashMap.put(new qb(), qiVar.f37163f);
            }
            return new C11422b(this.f37157a, hashMap);
        }
    }

    private qi() {
    }

    /* renamed from: a */
    public static C9198a m45883a() {
        return new C9198a();
    }

    public final DescriptorFactory<C11422b, qi> getDescriptorFactory() {
        return new C11423c();
    }
}
