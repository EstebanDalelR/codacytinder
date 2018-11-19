package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class xr implements EtlEvent {
    /* renamed from: a */
    private Number f37743a;
    /* renamed from: b */
    private Number f37744b;
    /* renamed from: c */
    private Number f37745c;
    /* renamed from: d */
    private Number f37746d;
    /* renamed from: e */
    private String f37747e;
    /* renamed from: f */
    private String f37748f;
    /* renamed from: g */
    private String f37749g;
    /* renamed from: h */
    private String f37750h;
    /* renamed from: i */
    private Number f37751i;
    /* renamed from: j */
    private String f37752j;

    /* renamed from: com.tinder.etl.event.xr$a */
    public static class C9332a {
        /* renamed from: a */
        private xr f31402a;

        private C9332a() {
            this.f31402a = new xr();
        }

        /* renamed from: a */
        public final C9332a m39003a(Number number) {
            this.f31402a.f37743a = number;
            return this;
        }

        /* renamed from: b */
        public final C9332a m39006b(Number number) {
            this.f31402a.f37744b = number;
            return this;
        }

        /* renamed from: c */
        public final C9332a m39008c(Number number) {
            this.f31402a.f37745c = number;
            return this;
        }

        /* renamed from: d */
        public final C9332a m39010d(Number number) {
            this.f31402a.f37746d = number;
            return this;
        }

        /* renamed from: a */
        public final C9332a m39004a(String str) {
            this.f31402a.f37747e = str;
            return this;
        }

        /* renamed from: b */
        public final C9332a m39007b(String str) {
            this.f31402a.f37748f = str;
            return this;
        }

        /* renamed from: c */
        public final C9332a m39009c(String str) {
            this.f31402a.f37749g = str;
            return this;
        }

        /* renamed from: d */
        public final C9332a m39011d(String str) {
            this.f31402a.f37750h = str;
            return this;
        }

        /* renamed from: e */
        public final C9332a m39012e(Number number) {
            this.f31402a.f37751i = number;
            return this;
        }

        /* renamed from: e */
        public final C9332a m39013e(String str) {
            this.f31402a.f37752j = str;
            return this;
        }

        /* renamed from: a */
        public xr m39005a() {
            return this.f31402a;
        }
    }

    /* renamed from: com.tinder.etl.event.xr$b */
    public class C11563b extends fw {
        /* renamed from: a */
        final /* synthetic */ xr f37741a;

        /* renamed from: a */
        public String mo10346a() {
            return "SuperLikeable.View";
        }

        public C11563b(xr xrVar, Map<EtlField<?>, Object> map) {
            this.f37741a = xrVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.xr$c */
    private final class C11564c implements DescriptorFactory<C11563b, xr> {
        /* renamed from: a */
        final /* synthetic */ xr f37742a;

        private C11564c(xr xrVar) {
            this.f37742a = xrVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46866a((xr) etlEvent);
        }

        /* renamed from: a */
        public final C11563b m46866a(xr xrVar) {
            Map hashMap = new HashMap();
            if (xrVar.f37743a != null) {
                hashMap.put(new al(), xrVar.f37743a);
            }
            if (xrVar.f37744b != null) {
                hashMap.put(new am(), xrVar.f37744b);
            }
            if (xrVar.f37745c != null) {
                hashMap.put(new an(), xrVar.f37745c);
            }
            if (xrVar.f37746d != null) {
                hashMap.put(new ap(), xrVar.f37746d);
            }
            if (xrVar.f37747e != null) {
                hashMap.put(new os(), xrVar.f37747e);
            }
            if (xrVar.f37748f != null) {
                hashMap.put(new ot(), xrVar.f37748f);
            }
            if (xrVar.f37749g != null) {
                hashMap.put(new ou(), xrVar.f37749g);
            }
            if (xrVar.f37750h != null) {
                hashMap.put(new oy(), xrVar.f37750h);
            }
            if (xrVar.f37751i != null) {
                hashMap.put(new qz(), xrVar.f37751i);
            }
            if (xrVar.f37752j != null) {
                hashMap.put(new xq(), xrVar.f37752j);
            }
            return new C11563b(this.f37742a, hashMap);
        }
    }

    private xr() {
    }

    /* renamed from: a */
    public static C9332a m46867a() {
        return new C9332a();
    }

    public final DescriptorFactory<C11563b, xr> getDescriptorFactory() {
        return new C11564c();
    }
}
