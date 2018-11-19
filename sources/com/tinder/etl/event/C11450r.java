package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.r */
public final class C11450r implements EtlEvent {
    /* renamed from: a */
    private Number f37233a;
    /* renamed from: b */
    private Number f37234b;
    /* renamed from: c */
    private Number f37235c;
    /* renamed from: d */
    private String f37236d;
    /* renamed from: e */
    private String f37237e;
    /* renamed from: f */
    private String f37238f;

    /* renamed from: com.tinder.etl.event.r$a */
    public static class C9224a {
        /* renamed from: a */
        private C11450r f31348a;

        private C9224a() {
            this.f31348a = new C11450r();
        }

        /* renamed from: a */
        public final C9224a m38661a(Number number) {
            this.f31348a.f37233a = number;
            return this;
        }

        /* renamed from: b */
        public final C9224a m38664b(Number number) {
            this.f31348a.f37234b = number;
            return this;
        }

        /* renamed from: c */
        public final C9224a m38666c(Number number) {
            this.f31348a.f37235c = number;
            return this;
        }

        /* renamed from: a */
        public final C9224a m38662a(String str) {
            this.f31348a.f37236d = str;
            return this;
        }

        /* renamed from: b */
        public final C9224a m38665b(String str) {
            this.f31348a.f37237e = str;
            return this;
        }

        /* renamed from: a */
        public C11450r m38663a() {
            return this.f31348a;
        }
    }

    /* renamed from: com.tinder.etl.event.r$b */
    public class C11448b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11450r f37231a;

        /* renamed from: a */
        public String mo10346a() {
            return "Ad.ChatBlock";
        }

        public C11448b(C11450r c11450r, Map<EtlField<?>, Object> map) {
            this.f37231a = c11450r;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.r$c */
    private final class C11449c implements DescriptorFactory<C11448b, C11450r> {
        /* renamed from: a */
        final /* synthetic */ C11450r f37232a;

        private C11449c(C11450r c11450r) {
            this.f37232a = c11450r;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46014a((C11450r) etlEvent);
        }

        /* renamed from: a */
        public final C11448b m46014a(C11450r c11450r) {
            Map hashMap = new HashMap();
            if (c11450r.f37233a != null) {
                hashMap.put(new C11582z(), c11450r.f37233a);
            }
            if (c11450r.f37234b != null) {
                hashMap.put(new ad(), c11450r.f37234b);
            }
            if (c11450r.f37235c != null) {
                hashMap.put(new aj(), c11450r.f37235c);
            }
            if (c11450r.f37236d != null) {
                hashMap.put(new cr(), c11450r.f37236d);
            }
            if (c11450r.f37237e != null) {
                hashMap.put(new eh(), c11450r.f37237e);
            }
            if (c11450r.f37238f != null) {
                hashMap.put(new xe(), c11450r.f37238f);
            }
            return new C11448b(this.f37232a, hashMap);
        }
    }

    private C11450r() {
    }

    /* renamed from: a */
    public static C9224a m46015a() {
        return new C9224a();
    }

    public final DescriptorFactory<C11448b, C11450r> getDescriptorFactory() {
        return new C11449c();
    }
}
