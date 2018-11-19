package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class sd implements EtlEvent {
    /* renamed from: a */
    private String f37284a;
    /* renamed from: b */
    private Boolean f37285b;
    /* renamed from: c */
    private String f37286c;
    /* renamed from: d */
    private String f37287d;
    /* renamed from: e */
    private String f37288e;
    /* renamed from: f */
    private Number f37289f;
    /* renamed from: g */
    private Boolean f37290g;
    /* renamed from: h */
    private Number f37291h;
    /* renamed from: i */
    private String f37292i;
    /* renamed from: j */
    private Boolean f37293j;
    /* renamed from: k */
    private Number f37294k;
    /* renamed from: l */
    private Boolean f37295l;

    /* renamed from: com.tinder.etl.event.sd$a */
    public static class C9244a {
        /* renamed from: a */
        private sd f31358a;

        private C9244a() {
            this.f31358a = new sd();
        }

        /* renamed from: a */
        public final C9244a m38696a(String str) {
            this.f31358a.f37284a = str;
            return this;
        }

        /* renamed from: a */
        public final C9244a m38694a(Boolean bool) {
            this.f31358a.f37285b = bool;
            return this;
        }

        /* renamed from: b */
        public final C9244a m38700b(String str) {
            this.f31358a.f37286c = str;
            return this;
        }

        /* renamed from: c */
        public final C9244a m38703c(String str) {
            this.f31358a.f37287d = str;
            return this;
        }

        /* renamed from: d */
        public final C9244a m38705d(String str) {
            this.f31358a.f37288e = str;
            return this;
        }

        /* renamed from: a */
        public final C9244a m38695a(Number number) {
            this.f31358a.f37289f = number;
            return this;
        }

        /* renamed from: b */
        public final C9244a m38698b(Boolean bool) {
            this.f31358a.f37290g = bool;
            return this;
        }

        /* renamed from: b */
        public final C9244a m38699b(Number number) {
            this.f31358a.f37291h = number;
            return this;
        }

        /* renamed from: e */
        public final C9244a m38706e(String str) {
            this.f31358a.f37292i = str;
            return this;
        }

        /* renamed from: c */
        public final C9244a m38701c(Boolean bool) {
            this.f31358a.f37293j = bool;
            return this;
        }

        /* renamed from: c */
        public final C9244a m38702c(Number number) {
            this.f31358a.f37294k = number;
            return this;
        }

        /* renamed from: d */
        public final C9244a m38704d(Boolean bool) {
            this.f31358a.f37295l = bool;
            return this;
        }

        /* renamed from: a */
        public sd m38697a() {
            return this.f31358a;
        }
    }

    /* renamed from: com.tinder.etl.event.sd$b */
    public class C11470b extends fw {
        /* renamed from: a */
        final /* synthetic */ sd f37282a;

        /* renamed from: a */
        public String mo10346a() {
            return "Profile.Share";
        }

        public C11470b(sd sdVar, Map<EtlField<?>, Object> map) {
            this.f37282a = sdVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.sd$c */
    private final class C11471c implements DescriptorFactory<C11470b, sd> {
        /* renamed from: a */
        final /* synthetic */ sd f37283a;

        private C11471c(sd sdVar) {
            this.f37283a = sdVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46098a((sd) etlEvent);
        }

        /* renamed from: a */
        public final C11470b m46098a(sd sdVar) {
            Map hashMap = new HashMap();
            if (sdVar.f37284a != null) {
                hashMap.put(new wm(), sdVar.f37284a);
            }
            if (sdVar.f37285b != null) {
                hashMap.put(new dw(), sdVar.f37285b);
            }
            if (sdVar.f37286c != null) {
                hashMap.put(new uw(), sdVar.f37286c);
            }
            if (sdVar.f37287d != null) {
                hashMap.put(new wl(), sdVar.f37287d);
            }
            if (sdVar.f37288e != null) {
                hashMap.put(new wk(), sdVar.f37288e);
            }
            if (sdVar.f37289f != null) {
                hashMap.put(new bu(), sdVar.f37289f);
            }
            if (sdVar.f37290g != null) {
                hashMap.put(new ev(), sdVar.f37290g);
            }
            if (sdVar.f37291h != null) {
                hashMap.put(new gu(), sdVar.f37291h);
            }
            if (sdVar.f37292i != null) {
                hashMap.put(new ov(), sdVar.f37292i);
            }
            if (sdVar.f37293j != null) {
                hashMap.put(new tu(), sdVar.f37293j);
            }
            if (sdVar.f37294k != null) {
                hashMap.put(new vm(), sdVar.f37294k);
            }
            if (sdVar.f37295l != null) {
                hashMap.put(new zy(), sdVar.f37295l);
            }
            return new C11470b(this.f37283a, hashMap);
        }
    }

    private sd() {
    }

    /* renamed from: a */
    public static C9244a m46099a() {
        return new C9244a();
    }

    public final DescriptorFactory<C11470b, sd> getDescriptorFactory() {
        return new C11471c();
    }
}
