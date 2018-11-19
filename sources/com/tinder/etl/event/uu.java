package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class uu implements EtlEvent {
    /* renamed from: a */
    private String f37584a;
    /* renamed from: b */
    private String f37585b;
    /* renamed from: c */
    private Number f37586c;
    /* renamed from: d */
    private String f37587d;
    /* renamed from: e */
    private Boolean f37588e;
    /* renamed from: f */
    private String f37589f;
    /* renamed from: g */
    private String f37590g;
    /* renamed from: h */
    private String f37591h;
    /* renamed from: i */
    private String f37592i;
    /* renamed from: j */
    private String f37593j;
    /* renamed from: k */
    private String f37594k;

    /* renamed from: com.tinder.etl.event.uu$a */
    public static class C9298a {
        /* renamed from: a */
        private uu f31385a;

        private C9298a() {
            this.f31385a = new uu();
        }

        /* renamed from: a */
        public final C9298a m38876a(String str) {
            this.f31385a.f37584a = str;
            return this;
        }

        /* renamed from: b */
        public final C9298a m38878b(String str) {
            this.f31385a.f37585b = str;
            return this;
        }

        /* renamed from: a */
        public final C9298a m38875a(Number number) {
            this.f31385a.f37586c = number;
            return this;
        }

        /* renamed from: c */
        public final C9298a m38879c(String str) {
            this.f31385a.f37587d = str;
            return this;
        }

        /* renamed from: a */
        public final C9298a m38874a(Boolean bool) {
            this.f31385a.f37588e = bool;
            return this;
        }

        /* renamed from: d */
        public final C9298a m38880d(String str) {
            this.f31385a.f37589f = str;
            return this;
        }

        /* renamed from: e */
        public final C9298a m38881e(String str) {
            this.f31385a.f37590g = str;
            return this;
        }

        /* renamed from: f */
        public final C9298a m38882f(String str) {
            this.f31385a.f37591h = str;
            return this;
        }

        /* renamed from: g */
        public final C9298a m38883g(String str) {
            this.f31385a.f37592i = str;
            return this;
        }

        /* renamed from: h */
        public final C9298a m38884h(String str) {
            this.f31385a.f37593j = str;
            return this;
        }

        /* renamed from: i */
        public final C9298a m38885i(String str) {
            this.f31385a.f37594k = str;
            return this;
        }

        /* renamed from: a */
        public uu m38877a() {
            return this.f31385a;
        }
    }

    /* renamed from: com.tinder.etl.event.uu$b */
    public class C11526b extends fw {
        /* renamed from: a */
        final /* synthetic */ uu f37582a;

        /* renamed from: a */
        public String mo10346a() {
            return "Recs.View";
        }

        public C11526b(uu uuVar, Map<EtlField<?>, Object> map) {
            this.f37582a = uuVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.uu$c */
    private final class C11527c implements DescriptorFactory<C11526b, uu> {
        /* renamed from: a */
        final /* synthetic */ uu f37583a;

        private C11527c(uu uuVar) {
            this.f37583a = uuVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46578a((uu) etlEvent);
        }

        /* renamed from: a */
        public final C11526b m46578a(uu uuVar) {
            Map hashMap = new HashMap();
            if (uuVar.f37584a != null) {
                hashMap.put(new C11401o(), uuVar.f37584a);
            }
            if (uuVar.f37585b != null) {
                hashMap.put(new bp(), uuVar.f37585b);
            }
            if (uuVar.f37586c != null) {
                hashMap.put(new bu(), uuVar.f37586c);
            }
            if (uuVar.f37587d != null) {
                hashMap.put(new eq(), uuVar.f37587d);
            }
            if (uuVar.f37588e != null) {
                hashMap.put(new ev(), uuVar.f37588e);
            }
            if (uuVar.f37589f != null) {
                hashMap.put(new ov(), uuVar.f37589f);
            }
            if (uuVar.f37590g != null) {
                hashMap.put(new uw(), uuVar.f37590g);
            }
            if (uuVar.f37591h != null) {
                hashMap.put(new uv(), uuVar.f37591h);
            }
            if (uuVar.f37592i != null) {
                hashMap.put(new va(), uuVar.f37592i);
            }
            if (uuVar.f37593j != null) {
                hashMap.put(new ya(), uuVar.f37593j);
            }
            if (uuVar.f37594k != null) {
                hashMap.put(new yd(), uuVar.f37594k);
            }
            return new C11526b(this.f37583a, hashMap);
        }
    }

    private uu() {
    }

    /* renamed from: a */
    public static C9298a m46579a() {
        return new C9298a();
    }

    public final DescriptorFactory<C11526b, uu> getDescriptorFactory() {
        return new C11527c();
    }
}
