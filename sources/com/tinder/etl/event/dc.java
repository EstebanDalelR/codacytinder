package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class dc implements EtlEvent {
    /* renamed from: a */
    private String f36387a;
    /* renamed from: b */
    private String f36388b;
    /* renamed from: c */
    private String f36389c;
    /* renamed from: d */
    private String f36390d;
    /* renamed from: e */
    private String f36391e;
    /* renamed from: f */
    private String f36392f;
    /* renamed from: g */
    private Number f36393g;
    /* renamed from: h */
    private Number f36394h;
    /* renamed from: i */
    private Number f36395i;
    /* renamed from: j */
    private Number f36396j;
    /* renamed from: k */
    private String f36397k;

    /* renamed from: com.tinder.etl.event.dc$a */
    public static class C9028a {
        /* renamed from: a */
        private dc f31249a;

        private C9028a() {
            this.f31249a = new dc();
        }

        /* renamed from: a */
        public final C9028a m37994a(String str) {
            this.f31249a.f36387a = str;
            return this;
        }

        /* renamed from: b */
        public final C9028a m37997b(String str) {
            this.f31249a.f36388b = str;
            return this;
        }

        /* renamed from: c */
        public final C9028a m37999c(String str) {
            this.f31249a.f36389c = str;
            return this;
        }

        /* renamed from: d */
        public final C9028a m38001d(String str) {
            this.f31249a.f36390d = str;
            return this;
        }

        /* renamed from: e */
        public final C9028a m38002e(String str) {
            this.f31249a.f36391e = str;
            return this;
        }

        /* renamed from: f */
        public final C9028a m38003f(String str) {
            this.f31249a.f36392f = str;
            return this;
        }

        /* renamed from: a */
        public final C9028a m37993a(Number number) {
            this.f31249a.f36393g = number;
            return this;
        }

        /* renamed from: b */
        public final C9028a m37996b(Number number) {
            this.f31249a.f36394h = number;
            return this;
        }

        /* renamed from: c */
        public final C9028a m37998c(Number number) {
            this.f31249a.f36395i = number;
            return this;
        }

        /* renamed from: d */
        public final C9028a m38000d(Number number) {
            this.f31249a.f36396j = number;
            return this;
        }

        /* renamed from: g */
        public final C9028a m38004g(String str) {
            this.f31249a.f36397k = str;
            return this;
        }

        /* renamed from: a */
        public dc m37995a() {
            return this.f31249a;
        }
    }

    /* renamed from: com.tinder.etl.event.dc$b */
    public class C11237b extends fw {
        /* renamed from: a */
        final /* synthetic */ dc f36385a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.LongPressMessage";
        }

        public C11237b(dc dcVar, Map<EtlField<?>, Object> map) {
            this.f36385a = dcVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.dc$c */
    private final class C11238c implements DescriptorFactory<C11237b, dc> {
        /* renamed from: a */
        final /* synthetic */ dc f36386a;

        private C11238c(dc dcVar) {
            this.f36386a = dcVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44502a((dc) etlEvent);
        }

        /* renamed from: a */
        public final C11237b m44502a(dc dcVar) {
            Map hashMap = new HashMap();
            if (dcVar.f36387a != null) {
                hashMap.put(new ec(), dcVar.f36387a);
            }
            if (dcVar.f36388b != null) {
                hashMap.put(new ed(), dcVar.f36388b);
            }
            if (dcVar.f36389c != null) {
                hashMap.put(new ee(), dcVar.f36389c);
            }
            if (dcVar.f36390d != null) {
                hashMap.put(new ll(), dcVar.f36390d);
            }
            if (dcVar.f36391e != null) {
                hashMap.put(new lx(), dcVar.f36391e);
            }
            if (dcVar.f36392f != null) {
                hashMap.put(new ml(), dcVar.f36392f);
            }
            if (dcVar.f36393g != null) {
                hashMap.put(new mm(), dcVar.f36393g);
            }
            if (dcVar.f36394h != null) {
                hashMap.put(new mp(), dcVar.f36394h);
            }
            if (dcVar.f36395i != null) {
                hashMap.put(new nx(), dcVar.f36395i);
            }
            if (dcVar.f36396j != null) {
                hashMap.put(new ny(), dcVar.f36396j);
            }
            if (dcVar.f36397k != null) {
                hashMap.put(new ov(), dcVar.f36397k);
            }
            return new C11237b(this.f36386a, hashMap);
        }
    }

    private dc() {
    }

    /* renamed from: a */
    public static C9028a m44503a() {
        return new C9028a();
    }

    public final DescriptorFactory<C11237b, dc> getDescriptorFactory() {
        return new C11238c();
    }
}
