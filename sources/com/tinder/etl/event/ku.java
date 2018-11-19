package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ku implements EtlEvent {
    /* renamed from: a */
    private Number f37007a;
    /* renamed from: b */
    private Number f37008b;
    /* renamed from: c */
    private Number f37009c;
    /* renamed from: d */
    private Number f37010d;

    /* renamed from: com.tinder.etl.event.ku$a */
    public static class C9156a {
        /* renamed from: a */
        private ku f31314a;

        private C9156a() {
            this.f31314a = new ku();
        }

        /* renamed from: a */
        public final C9156a m38503a(Number number) {
            this.f31314a.f37007a = number;
            return this;
        }

        /* renamed from: b */
        public final C9156a m38505b(Number number) {
            this.f31314a.f37008b = number;
            return this;
        }

        /* renamed from: c */
        public final C9156a m38506c(Number number) {
            this.f31314a.f37009c = number;
            return this;
        }

        /* renamed from: a */
        public ku m38504a() {
            return this.f31314a;
        }
    }

    /* renamed from: com.tinder.etl.event.ku$b */
    public class C11374b extends fw {
        /* renamed from: a */
        final /* synthetic */ ku f37005a;

        /* renamed from: a */
        public String mo10346a() {
            return "LikesYou.Pill.CountCheck";
        }

        public C11374b(ku kuVar, Map<EtlField<?>, Object> map) {
            this.f37005a = kuVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ku$c */
    private final class C11375c implements DescriptorFactory<C11374b, ku> {
        /* renamed from: a */
        final /* synthetic */ ku f37006a;

        private C11375c(ku kuVar) {
            this.f37006a = kuVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45630a((ku) etlEvent);
        }

        /* renamed from: a */
        public final C11374b m45630a(ku kuVar) {
            Map hashMap = new HashMap();
            if (kuVar.f37007a != null) {
                hashMap.put(new rd(), kuVar.f37007a);
            }
            if (kuVar.f37008b != null) {
                hashMap.put(new pz(), kuVar.f37008b);
            }
            if (kuVar.f37009c != null) {
                hashMap.put(new mv(), kuVar.f37009c);
            }
            if (kuVar.f37010d != null) {
                hashMap.put(new hc(), kuVar.f37010d);
            }
            return new C11374b(this.f37006a, hashMap);
        }
    }

    private ku() {
    }

    /* renamed from: a */
    public static C9156a m45631a() {
        return new C9156a();
    }

    public final DescriptorFactory<C11374b, ku> getDescriptorFactory() {
        return new C11375c();
    }
}
