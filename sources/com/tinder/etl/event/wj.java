package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class wj implements EtlEvent {
    /* renamed from: a */
    private String f37658a;
    /* renamed from: b */
    private String f37659b;

    /* renamed from: com.tinder.etl.event.wj$a */
    public static class C9316a {
        /* renamed from: a */
        private wj f31394a;

        private C9316a() {
            this.f31394a = new wj();
        }

        /* renamed from: a */
        public final C9316a m38929a(String str) {
            this.f31394a.f37658a = str;
            return this;
        }

        /* renamed from: b */
        public final C9316a m38931b(String str) {
            this.f31394a.f37659b = str;
            return this;
        }

        /* renamed from: a */
        public wj m38930a() {
            return this.f31394a;
        }
    }

    /* renamed from: com.tinder.etl.event.wj$b */
    public class C11546b extends fw {
        /* renamed from: a */
        final /* synthetic */ wj f37656a;

        /* renamed from: a */
        public String mo10346a() {
            return "Settings.Option";
        }

        public C11546b(wj wjVar, Map<EtlField<?>, Object> map) {
            this.f37656a = wjVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.wj$c */
    private final class C11547c implements DescriptorFactory<C11546b, wj> {
        /* renamed from: a */
        final /* synthetic */ wj f37657a;

        private C11547c(wj wjVar) {
            this.f37657a = wjVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46707a((wj) etlEvent);
        }

        /* renamed from: a */
        public final C11546b m46707a(wj wjVar) {
            Map hashMap = new HashMap();
            if (wjVar.f37658a != null) {
                hashMap.put(new wy(), wjVar.f37658a);
            }
            if (wjVar.f37659b != null) {
                hashMap.put(new zl(), wjVar.f37659b);
            }
            return new C11546b(this.f37657a, hashMap);
        }
    }

    private wj() {
    }

    /* renamed from: a */
    public static C9316a m46708a() {
        return new C9316a();
    }

    public final DescriptorFactory<C11546b, wj> getDescriptorFactory() {
        return new C11547c();
    }
}
