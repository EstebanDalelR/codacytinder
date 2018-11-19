package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class qt implements EtlEvent {
    /* renamed from: a */
    private Boolean f37219a;
    /* renamed from: b */
    private Number f37220b;
    /* renamed from: c */
    private String f37221c;
    /* renamed from: d */
    private String f37222d;

    /* renamed from: com.tinder.etl.event.qt$a */
    public static class C9218a {
        /* renamed from: a */
        private qt f31345a;

        private C9218a() {
            this.f31345a = new qt();
        }

        /* renamed from: a */
        public final C9218a m38650a(Boolean bool) {
            this.f31345a.f37219a = bool;
            return this;
        }

        /* renamed from: a */
        public final C9218a m38651a(Number number) {
            this.f31345a.f37220b = number;
            return this;
        }

        /* renamed from: a */
        public final C9218a m38652a(String str) {
            this.f31345a.f37221c = str;
            return this;
        }

        /* renamed from: b */
        public final C9218a m38654b(String str) {
            this.f31345a.f37222d = str;
            return this;
        }

        /* renamed from: a */
        public qt m38653a() {
            return this.f31345a;
        }
    }

    /* renamed from: com.tinder.etl.event.qt$b */
    public class C11442b extends fw {
        /* renamed from: a */
        final /* synthetic */ qt f37217a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.View";
        }

        public C11442b(qt qtVar, Map<EtlField<?>, Object> map) {
            this.f37217a = qtVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.qt$c */
    private final class C11443c implements DescriptorFactory<C11442b, qt> {
        /* renamed from: a */
        final /* synthetic */ qt f37218a;

        private C11443c(qt qtVar) {
            this.f37218a = qtVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45989a((qt) etlEvent);
        }

        /* renamed from: a */
        public final C11442b m45989a(qt qtVar) {
            Map hashMap = new HashMap();
            if (qtVar.f37219a != null) {
                hashMap.put(new jv(), qtVar.f37219a);
            }
            if (qtVar.f37220b != null) {
                hashMap.put(new qd(), qtVar.f37220b);
            }
            if (qtVar.f37221c != null) {
                hashMap.put(new vk(), qtVar.f37221c);
            }
            if (qtVar.f37222d != null) {
                hashMap.put(new wy(), qtVar.f37222d);
            }
            return new C11442b(this.f37218a, hashMap);
        }
    }

    private qt() {
    }

    /* renamed from: a */
    public static C9218a m45990a() {
        return new C9218a();
    }

    public final DescriptorFactory<C11442b, qt> getDescriptorFactory() {
        return new C11443c();
    }
}
