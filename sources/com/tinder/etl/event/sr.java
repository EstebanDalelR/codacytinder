package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class sr implements EtlEvent {
    /* renamed from: a */
    private String f37315a;

    /* renamed from: com.tinder.etl.event.sr$a */
    public static class C9256a {
        /* renamed from: a */
        private sr f31364a;

        private C9256a() {
            this.f31364a = new sr();
        }

        /* renamed from: a */
        public final C9256a m38719a(String str) {
            this.f31364a.f37315a = str;
            return this;
        }

        /* renamed from: a */
        public sr m38720a() {
            return this.f31364a;
        }
    }

    /* renamed from: com.tinder.etl.event.sr$b */
    public class C11482b extends fw {
        /* renamed from: a */
        final /* synthetic */ sr f37313a;

        /* renamed from: a */
        public String mo10346a() {
            return "Push.Message";
        }

        public C11482b(sr srVar, Map<EtlField<?>, Object> map) {
            this.f37313a = srVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.sr$c */
    private final class C11483c implements DescriptorFactory<C11482b, sr> {
        /* renamed from: a */
        final /* synthetic */ sr f37314a;

        private C11483c(sr srVar) {
            this.f37314a = srVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46154a((sr) etlEvent);
        }

        /* renamed from: a */
        public final C11482b m46154a(sr srVar) {
            Map hashMap = new HashMap();
            if (srVar.f37315a != null) {
                hashMap.put(new ll(), srVar.f37315a);
            }
            return new C11482b(this.f37314a, hashMap);
        }
    }

    private sr() {
    }

    /* renamed from: a */
    public static C9256a m46155a() {
        return new C9256a();
    }

    public final DescriptorFactory<C11482b, sr> getDescriptorFactory() {
        return new C11483c();
    }
}
