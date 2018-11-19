package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ro implements EtlEvent {
    /* renamed from: a */
    private String f37248a;
    /* renamed from: b */
    private String f37249b;

    /* renamed from: com.tinder.etl.event.ro$a */
    public static class C9228a {
        /* renamed from: a */
        private ro f31350a;

        private C9228a() {
            this.f31350a = new ro();
        }

        /* renamed from: a */
        public final C9228a m38671a(String str) {
            this.f31350a.f37248a = str;
            return this;
        }

        /* renamed from: b */
        public final C9228a m38673b(String str) {
            this.f31350a.f37249b = str;
            return this;
        }

        /* renamed from: a */
        public ro m38672a() {
            return this.f31350a;
        }
    }

    /* renamed from: com.tinder.etl.event.ro$b */
    public class C11453b extends fw {
        /* renamed from: a */
        final /* synthetic */ ro f37246a;

        /* renamed from: a */
        public String mo10346a() {
            return "Profile.ChangeEmployer";
        }

        public C11453b(ro roVar, Map<EtlField<?>, Object> map) {
            this.f37246a = roVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ro$c */
    private final class C11454c implements DescriptorFactory<C11453b, ro> {
        /* renamed from: a */
        final /* synthetic */ ro f37247a;

        private C11454c(ro roVar) {
            this.f37247a = roVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46039a((ro) etlEvent);
        }

        /* renamed from: a */
        public final C11453b m46039a(ro roVar) {
            Map hashMap = new HashMap();
            if (roVar.f37248a != null) {
                hashMap.put(new fq(), roVar.f37248a);
            }
            if (roVar.f37249b != null) {
                hashMap.put(new re(), roVar.f37249b);
            }
            return new C11453b(this.f37247a, hashMap);
        }
    }

    private ro() {
    }

    /* renamed from: a */
    public static C9228a m46040a() {
        return new C9228a();
    }

    public final DescriptorFactory<C11453b, ro> getDescriptorFactory() {
        return new C11454c();
    }
}
