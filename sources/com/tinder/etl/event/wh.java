package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class wh implements EtlEvent {
    /* renamed from: a */
    private Boolean f37643a;
    /* renamed from: b */
    private Boolean f37644b;
    /* renamed from: c */
    private Boolean f37645c;
    /* renamed from: d */
    private Boolean f37646d;
    /* renamed from: e */
    private Boolean f37647e;
    /* renamed from: f */
    private Boolean f37648f;
    /* renamed from: g */
    private String f37649g;
    /* renamed from: h */
    private Boolean f37650h;

    /* renamed from: com.tinder.etl.event.wh$a */
    public static class C9312a {
        /* renamed from: a */
        private wh f31392a;

        private C9312a() {
            this.f31392a = new wh();
        }

        /* renamed from: a */
        public final C9312a m38922a(Boolean bool) {
            this.f31392a.f37645c = bool;
            return this;
        }

        /* renamed from: b */
        public final C9312a m38924b(Boolean bool) {
            this.f31392a.f37647e = bool;
            return this;
        }

        /* renamed from: c */
        public final C9312a m38925c(Boolean bool) {
            this.f31392a.f37648f = bool;
            return this;
        }

        /* renamed from: a */
        public wh m38923a() {
            return this.f31392a;
        }
    }

    /* renamed from: com.tinder.etl.event.wh$b */
    public class C11542b extends fw {
        /* renamed from: a */
        final /* synthetic */ wh f37641a;

        /* renamed from: a */
        public String mo10346a() {
            return "Settings.Feed";
        }

        public C11542b(wh whVar, Map<EtlField<?>, Object> map) {
            this.f37641a = whVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.wh$c */
    private final class C11543c implements DescriptorFactory<C11542b, wh> {
        /* renamed from: a */
        final /* synthetic */ wh f37642a;

        private C11543c(wh whVar) {
            this.f37642a = whVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46685a((wh) etlEvent);
        }

        /* renamed from: a */
        public final C11542b m46685a(wh whVar) {
            Map hashMap = new HashMap();
            if (whVar.f37643a != null) {
                hashMap.put(new br(), whVar.f37643a);
            }
            if (whVar.f37644b != null) {
                hashMap.put(new jh(), whVar.f37644b);
            }
            if (whVar.f37645c != null) {
                hashMap.put(new px(), whVar.f37645c);
            }
            if (whVar.f37646d != null) {
                hashMap.put(new vh(), whVar.f37646d);
            }
            if (whVar.f37647e != null) {
                hashMap.put(new wz(), whVar.f37647e);
            }
            if (whVar.f37648f != null) {
                hashMap.put(new xb(), whVar.f37648f);
            }
            if (whVar.f37649g != null) {
                hashMap.put(new wy(), whVar.f37649g);
            }
            if (whVar.f37650h != null) {
                hashMap.put(new abe(), whVar.f37650h);
            }
            return new C11542b(this.f37642a, hashMap);
        }
    }

    private wh() {
    }

    /* renamed from: a */
    public static C9312a m46686a() {
        return new C9312a();
    }

    public final DescriptorFactory<C11542b, wh> getDescriptorFactory() {
        return new C11543c();
    }
}
