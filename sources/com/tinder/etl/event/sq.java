package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class sq implements EtlEvent {
    /* renamed from: a */
    private String f37312a;

    /* renamed from: com.tinder.etl.event.sq$a */
    public static class C9254a {
        /* renamed from: a */
        private sq f31363a;

        private C9254a() {
            this.f31363a = new sq();
        }

        /* renamed from: a */
        public final C9254a m38717a(String str) {
            this.f31363a.f37312a = str;
            return this;
        }

        /* renamed from: a */
        public sq m38718a() {
            return this.f31363a;
        }
    }

    /* renamed from: com.tinder.etl.event.sq$b */
    public class C11480b extends fw {
        /* renamed from: a */
        final /* synthetic */ sq f37310a;

        /* renamed from: a */
        public String mo10346a() {
            return "Push.Match";
        }

        public C11480b(sq sqVar, Map<EtlField<?>, Object> map) {
            this.f37310a = sqVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.sq$c */
    private final class C11481c implements DescriptorFactory<C11480b, sq> {
        /* renamed from: a */
        final /* synthetic */ sq f37311a;

        private C11481c(sq sqVar) {
            this.f37311a = sqVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46149a((sq) etlEvent);
        }

        /* renamed from: a */
        public final C11480b m46149a(sq sqVar) {
            Map hashMap = new HashMap();
            if (sqVar.f37312a != null) {
                hashMap.put(new ll(), sqVar.f37312a);
            }
            return new C11480b(this.f37311a, hashMap);
        }
    }

    private sq() {
    }

    /* renamed from: a */
    public static C9254a m46150a() {
        return new C9254a();
    }

    public final DescriptorFactory<C11480b, sq> getDescriptorFactory() {
        return new C11481c();
    }
}
