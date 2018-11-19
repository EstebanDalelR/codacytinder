package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class xn implements EtlEvent {
    /* renamed from: a */
    private String f37718a;
    /* renamed from: b */
    private Number f37719b;
    /* renamed from: c */
    private Number f37720c;
    /* renamed from: d */
    private String f37721d;
    /* renamed from: e */
    private Number f37722e;
    /* renamed from: f */
    private String f37723f;
    /* renamed from: g */
    private Number f37724g;
    /* renamed from: h */
    private String f37725h;

    /* renamed from: com.tinder.etl.event.xn$a */
    public static class C9328a {
        /* renamed from: a */
        private xn f31400a;

        private C9328a() {
            this.f31400a = new xn();
        }

        /* renamed from: a */
        public final C9328a m38981a(String str) {
            this.f31400a.f37718a = str;
            return this;
        }

        /* renamed from: a */
        public final C9328a m38980a(Number number) {
            this.f31400a.f37719b = number;
            return this;
        }

        /* renamed from: b */
        public final C9328a m38983b(Number number) {
            this.f31400a.f37720c = number;
            return this;
        }

        /* renamed from: b */
        public final C9328a m38984b(String str) {
            this.f31400a.f37721d = str;
            return this;
        }

        /* renamed from: c */
        public final C9328a m38985c(Number number) {
            this.f31400a.f37722e = number;
            return this;
        }

        /* renamed from: c */
        public final C9328a m38986c(String str) {
            this.f31400a.f37723f = str;
            return this;
        }

        /* renamed from: d */
        public final C9328a m38987d(Number number) {
            this.f31400a.f37724g = number;
            return this;
        }

        /* renamed from: d */
        public final C9328a m38988d(String str) {
            this.f31400a.f37725h = str;
            return this;
        }

        /* renamed from: a */
        public xn m38982a() {
            return this.f31400a;
        }
    }

    /* renamed from: com.tinder.etl.event.xn$b */
    public class C11559b extends fw {
        /* renamed from: a */
        final /* synthetic */ xn f37716a;

        /* renamed from: a */
        public String mo10346a() {
            return "SuperLikeable.Interact";
        }

        public C11559b(xn xnVar, Map<EtlField<?>, Object> map) {
            this.f37716a = xnVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.xn$c */
    private final class C11560c implements DescriptorFactory<C11559b, xn> {
        /* renamed from: a */
        final /* synthetic */ xn f37717a;

        private C11560c(xn xnVar) {
            this.f37717a = xnVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46818a((xn) etlEvent);
        }

        /* renamed from: a */
        public final C11559b m46818a(xn xnVar) {
            Map hashMap = new HashMap();
            if (xnVar.f37718a != null) {
                hashMap.put(new mq(), xnVar.f37718a);
            }
            if (xnVar.f37719b != null) {
                hashMap.put(new oc(), xnVar.f37719b);
            }
            if (xnVar.f37720c != null) {
                hashMap.put(new od(), xnVar.f37720c);
            }
            if (xnVar.f37721d != null) {
                hashMap.put(new ov(), xnVar.f37721d);
            }
            if (xnVar.f37722e != null) {
                hashMap.put(new qz(), xnVar.f37722e);
            }
            if (xnVar.f37723f != null) {
                hashMap.put(new xq(), xnVar.f37723f);
            }
            if (xnVar.f37724g != null) {
                hashMap.put(new xo(), xnVar.f37724g);
            }
            if (xnVar.f37725h != null) {
                hashMap.put(new zl(), xnVar.f37725h);
            }
            return new C11559b(this.f37717a, hashMap);
        }
    }

    private xn() {
    }

    /* renamed from: a */
    public static C9328a m46819a() {
        return new C9328a();
    }

    public final DescriptorFactory<C11559b, xn> getDescriptorFactory() {
        return new C11560c();
    }
}
