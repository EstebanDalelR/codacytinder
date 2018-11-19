package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class xk implements EtlEvent {
    /* renamed from: a */
    private Number f37694a;
    /* renamed from: b */
    private String f37695b;
    /* renamed from: c */
    private Number f37696c;
    /* renamed from: d */
    private String f37697d;
    /* renamed from: e */
    private String f37698e;
    /* renamed from: f */
    private Number f37699f;
    /* renamed from: g */
    private Number f37700g;
    /* renamed from: h */
    private List f37701h;
    /* renamed from: i */
    private String f37702i;
    /* renamed from: j */
    private Number f37703j;
    /* renamed from: k */
    private Number f37704k;
    /* renamed from: l */
    private Number f37705l;

    /* renamed from: com.tinder.etl.event.xk$a */
    public static class C9324a {
        /* renamed from: a */
        private xk f31398a;

        private C9324a() {
            this.f31398a = new xk();
        }

        /* renamed from: a */
        public final C9324a m38960a(Number number) {
            this.f31398a.f37694a = number;
            return this;
        }

        /* renamed from: a */
        public final C9324a m38961a(String str) {
            this.f31398a.f37695b = str;
            return this;
        }

        /* renamed from: b */
        public final C9324a m38964b(Number number) {
            this.f31398a.f37696c = number;
            return this;
        }

        /* renamed from: b */
        public final C9324a m38965b(String str) {
            this.f31398a.f37697d = str;
            return this;
        }

        /* renamed from: c */
        public final C9324a m38966c(Number number) {
            this.f31398a.f37699f = number;
            return this;
        }

        /* renamed from: d */
        public final C9324a m38968d(Number number) {
            this.f31398a.f37700g = number;
            return this;
        }

        /* renamed from: a */
        public final C9324a m38962a(List list) {
            this.f31398a.f37701h = list;
            return this;
        }

        /* renamed from: c */
        public final C9324a m38967c(String str) {
            this.f31398a.f37702i = str;
            return this;
        }

        /* renamed from: e */
        public final C9324a m38969e(Number number) {
            this.f31398a.f37703j = number;
            return this;
        }

        /* renamed from: f */
        public final C9324a m38970f(Number number) {
            this.f31398a.f37704k = number;
            return this;
        }

        /* renamed from: g */
        public final C9324a m38971g(Number number) {
            this.f31398a.f37705l = number;
            return this;
        }

        /* renamed from: a */
        public xk m38963a() {
            return this.f31398a;
        }
    }

    /* renamed from: com.tinder.etl.event.xk$b */
    public class C11555b extends fw {
        /* renamed from: a */
        final /* synthetic */ xk f37692a;

        /* renamed from: a */
        public String mo10346a() {
            return "SuperLikePaywall.Select";
        }

        public C11555b(xk xkVar, Map<EtlField<?>, Object> map) {
            this.f37692a = xkVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.xk$c */
    private final class C11556c implements DescriptorFactory<C11555b, xk> {
        /* renamed from: a */
        final /* synthetic */ xk f37693a;

        private C11556c(xk xkVar) {
            this.f37693a = xkVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46774a((xk) etlEvent);
        }

        /* renamed from: a */
        public final C11555b m46774a(xk xkVar) {
            Map hashMap = new HashMap();
            if (xkVar.f37694a != null) {
                hashMap.put(new ar(), xkVar.f37694a);
            }
            if (xkVar.f37695b != null) {
                hashMap.put(new ej(), xkVar.f37695b);
            }
            if (xkVar.f37696c != null) {
                hashMap.put(new hc(), xkVar.f37696c);
            }
            if (xkVar.f37697d != null) {
                hashMap.put(new lc(), xkVar.f37697d);
            }
            if (xkVar.f37698e != null) {
                hashMap.put(new ov(), xkVar.f37698e);
            }
            if (xkVar.f37699f != null) {
                hashMap.put(new pg(), xkVar.f37699f);
            }
            if (xkVar.f37700g != null) {
                hashMap.put(new rj(), xkVar.f37700g);
            }
            if (xkVar.f37701h != null) {
                hashMap.put(new rm(), xkVar.f37701h);
            }
            if (xkVar.f37702i != null) {
                hashMap.put(new wr(), xkVar.f37702i);
            }
            if (xkVar.f37703j != null) {
                hashMap.put(new xl(), xkVar.f37703j);
            }
            if (xkVar.f37704k != null) {
                hashMap.put(new xs(), xkVar.f37704k);
            }
            if (xkVar.f37705l != null) {
                hashMap.put(new yi(), xkVar.f37705l);
            }
            return new C11555b(this.f37693a, hashMap);
        }
    }

    private xk() {
    }

    /* renamed from: a */
    public static C9324a m46775a() {
        return new C9324a();
    }

    public final DescriptorFactory<C11555b, xk> getDescriptorFactory() {
        return new C11556c();
    }
}
