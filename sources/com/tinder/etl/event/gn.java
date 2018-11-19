package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class gn implements EtlEvent {
    /* renamed from: a */
    private String f36743a;
    /* renamed from: b */
    private String f36744b;
    /* renamed from: c */
    private String f36745c;
    /* renamed from: d */
    private String f36746d;
    /* renamed from: e */
    private Number f36747e;
    /* renamed from: f */
    private Boolean f36748f;
    /* renamed from: g */
    private Number f36749g;
    /* renamed from: h */
    private Number f36750h;
    /* renamed from: i */
    private String f36751i;
    /* renamed from: j */
    private String f36752j;
    /* renamed from: k */
    private String f36753k;
    /* renamed from: l */
    private Number f36754l;
    /* renamed from: m */
    private String f36755m;
    /* renamed from: n */
    private Number f36756n;
    /* renamed from: o */
    private String f36757o;
    /* renamed from: p */
    private String f36758p;
    /* renamed from: q */
    private Number f36759q;
    /* renamed from: r */
    private Boolean f36760r;
    /* renamed from: s */
    private String f36761s;
    /* renamed from: t */
    private String f36762t;
    /* renamed from: u */
    private String f36763u;
    /* renamed from: v */
    private String f36764v;
    /* renamed from: w */
    private Number f36765w;
    /* renamed from: x */
    private Number f36766x;

    /* renamed from: com.tinder.etl.event.gn$a */
    public static class C9094a {
        /* renamed from: a */
        private gn f31283a;

        private C9094a() {
            this.f31283a = new gn();
        }

        /* renamed from: a */
        public final C9094a m38285a(String str) {
            this.f31283a.f36743a = str;
            return this;
        }

        /* renamed from: b */
        public final C9094a m38288b(String str) {
            this.f31283a.f36744b = str;
            return this;
        }

        /* renamed from: c */
        public final C9094a m38290c(String str) {
            this.f31283a.f36745c = str;
            return this;
        }

        /* renamed from: d */
        public final C9094a m38292d(String str) {
            this.f31283a.f36746d = str;
            return this;
        }

        /* renamed from: a */
        public final C9094a m38284a(Number number) {
            this.f31283a.f36747e = number;
            return this;
        }

        /* renamed from: b */
        public final C9094a m38287b(Number number) {
            this.f31283a.f36749g = number;
            return this;
        }

        /* renamed from: c */
        public final C9094a m38289c(Number number) {
            this.f31283a.f36750h = number;
            return this;
        }

        /* renamed from: e */
        public final C9094a m38294e(String str) {
            this.f31283a.f36751i = str;
            return this;
        }

        /* renamed from: f */
        public final C9094a m38296f(String str) {
            this.f31283a.f36752j = str;
            return this;
        }

        /* renamed from: g */
        public final C9094a m38298g(String str) {
            this.f31283a.f36753k = str;
            return this;
        }

        /* renamed from: d */
        public final C9094a m38291d(Number number) {
            this.f31283a.f36754l = number;
            return this;
        }

        /* renamed from: h */
        public final C9094a m38300h(String str) {
            this.f31283a.f36755m = str;
            return this;
        }

        /* renamed from: e */
        public final C9094a m38293e(Number number) {
            this.f31283a.f36756n = number;
            return this;
        }

        /* renamed from: i */
        public final C9094a m38301i(String str) {
            this.f31283a.f36757o = str;
            return this;
        }

        /* renamed from: j */
        public final C9094a m38302j(String str) {
            this.f31283a.f36758p = str;
            return this;
        }

        /* renamed from: f */
        public final C9094a m38295f(Number number) {
            this.f31283a.f36759q = number;
            return this;
        }

        /* renamed from: k */
        public final C9094a m38303k(String str) {
            this.f31283a.f36761s = str;
            return this;
        }

        /* renamed from: l */
        public final C9094a m38304l(String str) {
            this.f31283a.f36762t = str;
            return this;
        }

        /* renamed from: m */
        public final C9094a m38305m(String str) {
            this.f31283a.f36763u = str;
            return this;
        }

        /* renamed from: n */
        public final C9094a m38306n(String str) {
            this.f31283a.f36764v = str;
            return this;
        }

        /* renamed from: g */
        public final C9094a m38297g(Number number) {
            this.f31283a.f36765w = number;
            return this;
        }

        /* renamed from: h */
        public final C9094a m38299h(Number number) {
            this.f31283a.f36766x = number;
            return this;
        }

        /* renamed from: a */
        public gn m38286a() {
            return this.f31283a;
        }
    }

    /* renamed from: com.tinder.etl.event.gn$b */
    public class C11307b extends fw {
        /* renamed from: a */
        final /* synthetic */ gn f36741a;

        /* renamed from: a */
        public String mo10346a() {
            return "Feed.View";
        }

        public C11307b(gn gnVar, Map<EtlField<?>, Object> map) {
            this.f36741a = gnVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.gn$c */
    private final class C11308c implements DescriptorFactory<C11307b, gn> {
        /* renamed from: a */
        final /* synthetic */ gn f36742a;

        private C11308c(gn gnVar) {
            this.f36742a = gnVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45147a((gn) etlEvent);
        }

        /* renamed from: a */
        public final C11307b m45147a(gn gnVar) {
            Map hashMap = new HashMap();
            if (gnVar.f36743a != null) {
                hashMap.put(new C11365k(), gnVar.f36743a);
            }
            if (gnVar.f36744b != null) {
                hashMap.put(new C11378l(), gnVar.f36744b);
            }
            if (gnVar.f36745c != null) {
                hashMap.put(new C11400n(), gnVar.f36745c);
            }
            if (gnVar.f36746d != null) {
                hashMap.put(new C11401o(), gnVar.f36746d);
            }
            if (gnVar.f36747e != null) {
                hashMap.put(new bc(), gnVar.f36747e);
            }
            if (gnVar.f36748f != null) {
                hashMap.put(new bn(), gnVar.f36748f);
            }
            if (gnVar.f36749g != null) {
                hashMap.put(new fh(), gnVar.f36749g);
            }
            if (gnVar.f36750h != null) {
                hashMap.put(new fk(), gnVar.f36750h);
            }
            if (gnVar.f36751i != null) {
                hashMap.put(new gh(), gnVar.f36751i);
            }
            if (gnVar.f36752j != null) {
                hashMap.put(new gk(), gnVar.f36752j);
            }
            if (gnVar.f36753k != null) {
                hashMap.put(new ll(), gnVar.f36753k);
            }
            if (gnVar.f36754l != null) {
                hashMap.put(new lz(), gnVar.f36754l);
            }
            if (gnVar.f36755m != null) {
                hashMap.put(new mb(), gnVar.f36755m);
            }
            if (gnVar.f36756n != null) {
                hashMap.put(new md(), gnVar.f36756n);
            }
            if (gnVar.f36757o != null) {
                hashMap.put(new ml(), gnVar.f36757o);
            }
            if (gnVar.f36758p != null) {
                hashMap.put(new ov(), gnVar.f36758p);
            }
            if (gnVar.f36759q != null) {
                hashMap.put(new qz(), gnVar.f36759q);
            }
            if (gnVar.f36760r != null) {
                hashMap.put(new ww(), gnVar.f36760r);
            }
            if (gnVar.f36761s != null) {
                hashMap.put(new xy(), gnVar.f36761s);
            }
            if (gnVar.f36762t != null) {
                hashMap.put(new xz(), gnVar.f36762t);
            }
            if (gnVar.f36763u != null) {
                hashMap.put(new yb(), gnVar.f36763u);
            }
            if (gnVar.f36764v != null) {
                hashMap.put(new yc(), gnVar.f36764v);
            }
            if (gnVar.f36765w != null) {
                hashMap.put(new yj(), gnVar.f36765w);
            }
            if (gnVar.f36766x != null) {
                hashMap.put(new yl(), gnVar.f36766x);
            }
            return new C11307b(this.f36742a, hashMap);
        }
    }

    private gn() {
    }

    /* renamed from: a */
    public static C9094a m45148a() {
        return new C9094a();
    }

    public final DescriptorFactory<C11307b, gn> getDescriptorFactory() {
        return new C11308c();
    }
}
