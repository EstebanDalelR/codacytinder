package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ls implements EtlEvent {
    /* renamed from: a */
    private String f37079a;
    /* renamed from: b */
    private Boolean f37080b;
    /* renamed from: c */
    private Boolean f37081c;

    /* renamed from: com.tinder.etl.event.ls$a */
    public static class C9170a {
        /* renamed from: a */
        private ls f31321a;

        private C9170a() {
            this.f31321a = new ls();
        }

        /* renamed from: a */
        public final C9170a m38546a(String str) {
            this.f31321a.f37079a = str;
            return this;
        }

        /* renamed from: a */
        public final C9170a m38545a(Boolean bool) {
            this.f31321a.f37080b = bool;
            return this;
        }

        /* renamed from: b */
        public final C9170a m38548b(Boolean bool) {
            this.f31321a.f37081c = bool;
            return this;
        }

        /* renamed from: a */
        public ls m38547a() {
            return this.f31321a;
        }
    }

    /* renamed from: com.tinder.etl.event.ls$b */
    public class C11389b extends fw {
        /* renamed from: a */
        final /* synthetic */ ls f37077a;

        /* renamed from: a */
        public String mo10346a() {
            return "Match.OpenChat";
        }

        public C11389b(ls lsVar, Map<EtlField<?>, Object> map) {
            this.f37077a = lsVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ls$c */
    private final class C11390c implements DescriptorFactory<C11389b, ls> {
        /* renamed from: a */
        final /* synthetic */ ls f37078a;

        private C11390c(ls lsVar) {
            this.f37078a = lsVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45744a((ls) etlEvent);
        }

        /* renamed from: a */
        public final C11389b m45744a(ls lsVar) {
            Map hashMap = new HashMap();
            if (lsVar.f37079a != null) {
                hashMap.put(new ll(), lsVar.f37079a);
            }
            if (lsVar.f37080b != null) {
                hashMap.put(new xh(), lsVar.f37080b);
            }
            if (lsVar.f37081c != null) {
                hashMap.put(new ev(), lsVar.f37081c);
            }
            return new C11389b(this.f37078a, hashMap);
        }
    }

    private ls() {
    }

    /* renamed from: a */
    public static C9170a m45745a() {
        return new C9170a();
    }

    public final DescriptorFactory<C11389b, ls> getDescriptorFactory() {
        return new C11390c();
    }
}
