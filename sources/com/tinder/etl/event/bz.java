package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class bz implements EtlEvent {
    /* renamed from: a */
    private Boolean f36244a;
    /* renamed from: b */
    private Number f36245b;
    /* renamed from: c */
    private Number f36246c;
    /* renamed from: d */
    private List f36247d;
    /* renamed from: e */
    private Number f36248e;
    /* renamed from: f */
    private Number f36249f;

    /* renamed from: com.tinder.etl.event.bz$a */
    public static class C8996a {
        /* renamed from: a */
        private bz f31233a;

        private C8996a() {
            this.f31233a = new bz();
        }

        /* renamed from: a */
        public final C8996a m37871a(Boolean bool) {
            this.f31233a.f36244a = bool;
            return this;
        }

        /* renamed from: a */
        public final C8996a m37872a(Number number) {
            this.f31233a.f36245b = number;
            return this;
        }

        /* renamed from: b */
        public final C8996a m37875b(Number number) {
            this.f31233a.f36246c = number;
            return this;
        }

        /* renamed from: a */
        public final C8996a m37873a(List list) {
            this.f31233a.f36247d = list;
            return this;
        }

        /* renamed from: c */
        public final C8996a m37876c(Number number) {
            this.f31233a.f36248e = number;
            return this;
        }

        /* renamed from: d */
        public final C8996a m37877d(Number number) {
            this.f31233a.f36249f = number;
            return this;
        }

        /* renamed from: a */
        public bz m37874a() {
            return this.f31233a;
        }
    }

    /* renamed from: com.tinder.etl.event.bz$b */
    public class C11203b extends fw {
        /* renamed from: a */
        final /* synthetic */ bz f36242a;

        /* renamed from: a */
        public String mo10346a() {
            return "BoostPaywall.Cancel";
        }

        public C11203b(bz bzVar, Map<EtlField<?>, Object> map) {
            this.f36242a = bzVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.bz$c */
    private final class C11204c implements DescriptorFactory<C11203b, bz> {
        /* renamed from: a */
        final /* synthetic */ bz f36243a;

        private C11204c(bz bzVar) {
            this.f36243a = bzVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44237a((bz) etlEvent);
        }

        /* renamed from: a */
        public final C11203b m44237a(bz bzVar) {
            Map hashMap = new HashMap();
            if (bzVar.f36244a != null) {
                hashMap.put(new iz(), bzVar.f36244a);
            }
            if (bzVar.f36245b != null) {
                hashMap.put(new yi(), bzVar.f36245b);
            }
            if (bzVar.f36246c != null) {
                hashMap.put(new cc(), bzVar.f36246c);
            }
            if (bzVar.f36247d != null) {
                hashMap.put(new rm(), bzVar.f36247d);
            }
            if (bzVar.f36248e != null) {
                hashMap.put(new hc(), bzVar.f36248e);
            }
            if (bzVar.f36249f != null) {
                hashMap.put(new cf(), bzVar.f36249f);
            }
            return new C11203b(this.f36243a, hashMap);
        }
    }

    private bz() {
    }

    /* renamed from: a */
    public static C8996a m44238a() {
        return new C8996a();
    }

    public final DescriptorFactory<C11203b, bz> getDescriptorFactory() {
        return new C11204c();
    }
}
