package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class cx implements EtlEvent {
    /* renamed from: a */
    private String f36337a;
    /* renamed from: b */
    private String f36338b;
    /* renamed from: c */
    private String f36339c;
    /* renamed from: d */
    private Number f36340d;
    /* renamed from: e */
    private String f36341e;

    /* renamed from: com.tinder.etl.event.cx$a */
    public static class C9018a {
        /* renamed from: a */
        private cx f31244a;

        private C9018a() {
            this.f31244a = new cx();
        }

        /* renamed from: a */
        public final C9018a m37949a(String str) {
            this.f31244a.f36337a = str;
            return this;
        }

        /* renamed from: b */
        public final C9018a m37951b(String str) {
            this.f31244a.f36338b = str;
            return this;
        }

        /* renamed from: c */
        public final C9018a m37952c(String str) {
            this.f31244a.f36339c = str;
            return this;
        }

        /* renamed from: a */
        public final C9018a m37948a(Number number) {
            this.f31244a.f36340d = number;
            return this;
        }

        /* renamed from: d */
        public final C9018a m37953d(String str) {
            this.f31244a.f36341e = str;
            return this;
        }

        /* renamed from: a */
        public cx m37950a() {
            return this.f31244a;
        }
    }

    /* renamed from: com.tinder.etl.event.cx$b */
    public class C11226b extends fw {
        /* renamed from: a */
        final /* synthetic */ cx f36335a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.CancelSendErrorOption";
        }

        public C11226b(cx cxVar, Map<EtlField<?>, Object> map) {
            this.f36335a = cxVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.cx$c */
    private final class C11227c implements DescriptorFactory<C11226b, cx> {
        /* renamed from: a */
        final /* synthetic */ cx f36336a;

        private C11227c(cx cxVar) {
            this.f36336a = cxVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44407a((cx) etlEvent);
        }

        /* renamed from: a */
        public final C11226b m44407a(cx cxVar) {
            Map hashMap = new HashMap();
            if (cxVar.f36337a != null) {
                hashMap.put(new cq(), cxVar.f36337a);
            }
            if (cxVar.f36338b != null) {
                hashMap.put(new ll(), cxVar.f36338b);
            }
            if (cxVar.f36339c != null) {
                hashMap.put(new lx(), cxVar.f36339c);
            }
            if (cxVar.f36340d != null) {
                hashMap.put(new mm(), cxVar.f36340d);
            }
            if (cxVar.f36341e != null) {
                hashMap.put(new ov(), cxVar.f36341e);
            }
            return new C11226b(this.f36336a, hashMap);
        }
    }

    private cx() {
    }

    /* renamed from: a */
    public static C9018a m44408a() {
        return new C9018a();
    }

    public final DescriptorFactory<C11226b, cx> getDescriptorFactory() {
        return new C11227c();
    }
}
