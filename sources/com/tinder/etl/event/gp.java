package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class gp implements EtlEvent {
    /* renamed from: a */
    private String f36769a;
    /* renamed from: b */
    private String f36770b;
    /* renamed from: c */
    private String f36771c;
    /* renamed from: d */
    private Number f36772d;
    /* renamed from: e */
    private String f36773e;

    /* renamed from: com.tinder.etl.event.gp$a */
    public static class C9096a {
        /* renamed from: a */
        private gp f31284a;

        private C9096a() {
            this.f31284a = new gp();
        }

        /* renamed from: a */
        public final C9096a m38308a(String str) {
            this.f31284a.f36769a = str;
            return this;
        }

        /* renamed from: b */
        public final C9096a m38310b(String str) {
            this.f31284a.f36770b = str;
            return this;
        }

        /* renamed from: c */
        public final C9096a m38311c(String str) {
            this.f31284a.f36771c = str;
            return this;
        }

        /* renamed from: a */
        public final C9096a m38307a(Number number) {
            this.f31284a.f36772d = number;
            return this;
        }

        /* renamed from: d */
        public final C9096a m38312d(String str) {
            this.f31284a.f36773e = str;
            return this;
        }

        /* renamed from: a */
        public gp m38309a() {
            return this.f31284a;
        }
    }

    /* renamed from: com.tinder.etl.event.gp$b */
    public class C11309b extends fw {
        /* renamed from: a */
        final /* synthetic */ gp f36767a;

        /* renamed from: a */
        public String mo10346a() {
            return "Feedback.App";
        }

        public C11309b(gp gpVar, Map<EtlField<?>, Object> map) {
            this.f36767a = gpVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.gp$c */
    private final class C11310c implements DescriptorFactory<C11309b, gp> {
        /* renamed from: a */
        final /* synthetic */ gp f36768a;

        private C11310c(gp gpVar) {
            this.f36768a = gpVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45196a((gp) etlEvent);
        }

        /* renamed from: a */
        public final C11309b m45196a(gp gpVar) {
            Map hashMap = new HashMap();
            if (gpVar.f36769a != null) {
                hashMap.put(new go(), gpVar.f36769a);
            }
            if (gpVar.f36770b != null) {
                hashMap.put(new gs(), gpVar.f36770b);
            }
            if (gpVar.f36771c != null) {
                hashMap.put(new wy(), gpVar.f36771c);
            }
            if (gpVar.f36772d != null) {
                hashMap.put(new xc(), gpVar.f36772d);
            }
            if (gpVar.f36773e != null) {
                hashMap.put(new yg(), gpVar.f36773e);
            }
            return new C11309b(this.f36768a, hashMap);
        }
    }

    private gp() {
    }

    /* renamed from: a */
    public static C9096a m45197a() {
        return new C9096a();
    }

    public final DescriptorFactory<C11309b, gp> getDescriptorFactory() {
        return new C11310c();
    }
}
