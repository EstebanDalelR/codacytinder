package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class qr implements EtlEvent {
    /* renamed from: a */
    private Boolean f37206a;
    /* renamed from: b */
    private Number f37207b;
    /* renamed from: c */
    private String f37208c;
    /* renamed from: d */
    private String f37209d;
    /* renamed from: e */
    private String f37210e;

    /* renamed from: com.tinder.etl.event.qr$a */
    public static class C9214a {
        /* renamed from: a */
        private qr f31343a;

        private C9214a() {
            this.f31343a = new qr();
        }

        /* renamed from: a */
        public final C9214a m38640a(Boolean bool) {
            this.f31343a.f37206a = bool;
            return this;
        }

        /* renamed from: a */
        public final C9214a m38641a(Number number) {
            this.f31343a.f37207b = number;
            return this;
        }

        /* renamed from: a */
        public final C9214a m38642a(String str) {
            this.f31343a.f37208c = str;
            return this;
        }

        /* renamed from: b */
        public final C9214a m38644b(String str) {
            this.f31343a.f37209d = str;
            return this;
        }

        /* renamed from: c */
        public final C9214a m38645c(String str) {
            this.f31343a.f37210e = str;
            return this;
        }

        /* renamed from: a */
        public qr m38643a() {
            return this.f31343a;
        }
    }

    /* renamed from: com.tinder.etl.event.qr$b */
    public class C11438b extends fw {
        /* renamed from: a */
        final /* synthetic */ qr f37204a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.RemoveRecentPlace";
        }

        public C11438b(qr qrVar, Map<EtlField<?>, Object> map) {
            this.f37204a = qrVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.qr$c */
    private final class C11439c implements DescriptorFactory<C11438b, qr> {
        /* renamed from: a */
        final /* synthetic */ qr f37205a;

        private C11439c(qr qrVar) {
            this.f37205a = qrVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45966a((qr) etlEvent);
        }

        /* renamed from: a */
        public final C11438b m45966a(qr qrVar) {
            Map hashMap = new HashMap();
            if (qrVar.f37206a != null) {
                hashMap.put(new dx(), qrVar.f37206a);
            }
            if (qrVar.f37207b != null) {
                hashMap.put(new ft(), qrVar.f37207b);
            }
            if (qrVar.f37208c != null) {
                hashMap.put(new qb(), qrVar.f37208c);
            }
            if (qrVar.f37209d != null) {
                hashMap.put(new wy(), qrVar.f37209d);
            }
            if (qrVar.f37210e != null) {
                hashMap.put(new zl(), qrVar.f37210e);
            }
            return new C11438b(this.f37205a, hashMap);
        }
    }

    private qr() {
    }

    /* renamed from: a */
    public static C9214a m45967a() {
        return new C9214a();
    }

    public final DescriptorFactory<C11438b, qr> getDescriptorFactory() {
        return new C11439c();
    }
}
