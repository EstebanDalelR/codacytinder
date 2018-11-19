package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ax implements EtlEvent {
    /* renamed from: a */
    private String f36220a;
    /* renamed from: b */
    private String f36221b;
    /* renamed from: c */
    private String f36222c;
    /* renamed from: d */
    private String f36223d;

    /* renamed from: com.tinder.etl.event.ax$a */
    public static class C8986a {
        /* renamed from: a */
        private ax f31228a;

        private C8986a() {
            this.f31228a = new ax();
        }

        /* renamed from: a */
        public final C8986a m37852a(String str) {
            this.f31228a.f36220a = str;
            return this;
        }

        /* renamed from: b */
        public final C8986a m37854b(String str) {
            this.f31228a.f36221b = str;
            return this;
        }

        /* renamed from: c */
        public final C8986a m37855c(String str) {
            this.f31228a.f36222c = str;
            return this;
        }

        /* renamed from: d */
        public final C8986a m37856d(String str) {
            this.f31228a.f36223d = str;
            return this;
        }

        /* renamed from: a */
        public ax m37853a() {
            return this.f31228a;
        }
    }

    /* renamed from: com.tinder.etl.event.ax$b */
    public class C11192b extends fw {
        /* renamed from: a */
        final /* synthetic */ ax f36218a;

        /* renamed from: a */
        public String mo10346a() {
            return "App.Tutorial";
        }

        public C11192b(ax axVar, Map<EtlField<?>, Object> map) {
            this.f36218a = axVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ax$c */
    private final class C11193c implements DescriptorFactory<C11192b, ax> {
        /* renamed from: a */
        final /* synthetic */ ax f36219a;

        private C11193c(ax axVar) {
            this.f36219a = axVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44194a((ax) etlEvent);
        }

        /* renamed from: a */
        public final C11192b m44194a(ax axVar) {
            Map hashMap = new HashMap();
            if (axVar.f36220a != null) {
                hashMap.put(new zh(), axVar.f36220a);
            }
            if (axVar.f36221b != null) {
                hashMap.put(new zi(), axVar.f36221b);
            }
            if (axVar.f36222c != null) {
                hashMap.put(new zj(), axVar.f36222c);
            }
            if (axVar.f36223d != null) {
                hashMap.put(new zk(), axVar.f36223d);
            }
            return new C11192b(this.f36219a, hashMap);
        }
    }

    private ax() {
    }

    /* renamed from: a */
    public static C8986a m44195a() {
        return new C8986a();
    }

    public final DescriptorFactory<C11192b, ax> getDescriptorFactory() {
        return new C11193c();
    }
}
