package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class gj implements EtlEvent {
    /* renamed from: a */
    private String f36719a;
    /* renamed from: b */
    private Number f36720b;
    /* renamed from: c */
    private String f36721c;
    /* renamed from: d */
    private Number f36722d;
    /* renamed from: e */
    private Number f36723e;
    /* renamed from: f */
    private Number f36724f;
    /* renamed from: g */
    private Number f36725g;
    /* renamed from: h */
    private Number f36726h;
    /* renamed from: i */
    private Number f36727i;
    /* renamed from: j */
    private Number f36728j;
    /* renamed from: k */
    private Number f36729k;
    /* renamed from: l */
    private Number f36730l;
    /* renamed from: m */
    private Number f36731m;
    /* renamed from: n */
    private String f36732n;
    /* renamed from: o */
    private Boolean f36733o;

    /* renamed from: com.tinder.etl.event.gj$a */
    public static class C9088a {
        /* renamed from: a */
        private gj f31280a;

        private C9088a() {
            this.f31280a = new gj();
        }

        /* renamed from: a */
        public final C9088a m38265a(String str) {
            this.f31280a.f36719a = str;
            return this;
        }

        /* renamed from: a */
        public final C9088a m38264a(Number number) {
            this.f31280a.f36720b = number;
            return this;
        }

        /* renamed from: b */
        public final C9088a m38268b(String str) {
            this.f31280a.f36721c = str;
            return this;
        }

        /* renamed from: b */
        public final C9088a m38267b(Number number) {
            this.f31280a.f36722d = number;
            return this;
        }

        /* renamed from: c */
        public final C9088a m38269c(Number number) {
            this.f31280a.f36723e = number;
            return this;
        }

        /* renamed from: d */
        public final C9088a m38271d(Number number) {
            this.f31280a.f36724f = number;
            return this;
        }

        /* renamed from: e */
        public final C9088a m38272e(Number number) {
            this.f31280a.f36725g = number;
            return this;
        }

        /* renamed from: f */
        public final C9088a m38273f(Number number) {
            this.f31280a.f36726h = number;
            return this;
        }

        /* renamed from: g */
        public final C9088a m38274g(Number number) {
            this.f31280a.f36727i = number;
            return this;
        }

        /* renamed from: h */
        public final C9088a m38275h(Number number) {
            this.f31280a.f36728j = number;
            return this;
        }

        /* renamed from: i */
        public final C9088a m38276i(Number number) {
            this.f31280a.f36729k = number;
            return this;
        }

        /* renamed from: j */
        public final C9088a m38277j(Number number) {
            this.f31280a.f36730l = number;
            return this;
        }

        /* renamed from: k */
        public final C9088a m38278k(Number number) {
            this.f31280a.f36731m = number;
            return this;
        }

        /* renamed from: c */
        public final C9088a m38270c(String str) {
            this.f31280a.f36732n = str;
            return this;
        }

        /* renamed from: a */
        public final C9088a m38263a(Boolean bool) {
            this.f31280a.f36733o = bool;
            return this;
        }

        /* renamed from: a */
        public gj m38266a() {
            return this.f31280a;
        }
    }

    /* renamed from: com.tinder.etl.event.gj$b */
    public class C11301b extends fw {
        /* renamed from: a */
        final /* synthetic */ gj f36717a;

        /* renamed from: a */
        public String mo10346a() {
            return "Feed.Session";
        }

        public C11301b(gj gjVar, Map<EtlField<?>, Object> map) {
            this.f36717a = gjVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.gj$c */
    private final class C11302c implements DescriptorFactory<C11301b, gj> {
        /* renamed from: a */
        final /* synthetic */ gj f36718a;

        private C11302c(gj gjVar) {
            this.f36718a = gjVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45102a((gj) etlEvent);
        }

        /* renamed from: a */
        public final C11301b m45102a(gj gjVar) {
            Map hashMap = new HashMap();
            if (gjVar.f36719a != null) {
                hashMap.put(new eu(), gjVar.f36719a);
            }
            if (gjVar.f36720b != null) {
                hashMap.put(new fk(), gjVar.f36720b);
            }
            if (gjVar.f36721c != null) {
                hashMap.put(new gk(), gjVar.f36721c);
            }
            if (gjVar.f36722d != null) {
                hashMap.put(new nk(), gjVar.f36722d);
            }
            if (gjVar.f36723e != null) {
                hashMap.put(new nl(), gjVar.f36723e);
            }
            if (gjVar.f36724f != null) {
                hashMap.put(new nm(), gjVar.f36724f);
            }
            if (gjVar.f36725g != null) {
                hashMap.put(new oa(), gjVar.f36725g);
            }
            if (gjVar.f36726h != null) {
                hashMap.put(new ob(), gjVar.f36726h);
            }
            if (gjVar.f36727i != null) {
                hashMap.put(new no(), gjVar.f36727i);
            }
            if (gjVar.f36728j != null) {
                hashMap.put(new qy(), gjVar.f36728j);
            }
            if (gjVar.f36729k != null) {
                hashMap.put(new ra(), gjVar.f36729k);
            }
            if (gjVar.f36730l != null) {
                hashMap.put(new rb(), gjVar.f36730l);
            }
            if (gjVar.f36731m != null) {
                hashMap.put(new rc(), gjVar.f36731m);
            }
            if (gjVar.f36732n != null) {
                hashMap.put(new wy(), gjVar.f36732n);
            }
            if (gjVar.f36733o != null) {
                hashMap.put(new zo(), gjVar.f36733o);
            }
            return new C11301b(this.f36718a, hashMap);
        }
    }

    private gj() {
    }

    /* renamed from: a */
    public static C9088a m45103a() {
        return new C9088a();
    }

    public final DescriptorFactory<C11301b, gj> getDescriptorFactory() {
        return new C11302c();
    }
}
