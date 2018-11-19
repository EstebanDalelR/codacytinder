package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class hn implements EtlEvent {
    /* renamed from: a */
    private String f36815a;
    /* renamed from: b */
    private Number f36816b;
    /* renamed from: c */
    private String f36817c;
    /* renamed from: d */
    private String f36818d;
    /* renamed from: e */
    private String f36819e;
    /* renamed from: f */
    private String f36820f;
    /* renamed from: g */
    private String f36821g;
    /* renamed from: h */
    private Number f36822h;
    /* renamed from: i */
    private Number f36823i;
    /* renamed from: j */
    private String f36824j;

    /* renamed from: com.tinder.etl.event.hn$a */
    public static class C9108a {
        /* renamed from: a */
        private hn f31290a;

        private C9108a() {
            this.f31290a = new hn();
        }

        /* renamed from: a */
        public final C9108a m38347a(String str) {
            this.f31290a.f36815a = str;
            return this;
        }

        /* renamed from: a */
        public final C9108a m38346a(Number number) {
            this.f31290a.f36816b = number;
            return this;
        }

        /* renamed from: b */
        public final C9108a m38350b(String str) {
            this.f31290a.f36817c = str;
            return this;
        }

        /* renamed from: c */
        public final C9108a m38352c(String str) {
            this.f31290a.f36818d = str;
            return this;
        }

        /* renamed from: d */
        public final C9108a m38353d(String str) {
            this.f31290a.f36819e = str;
            return this;
        }

        /* renamed from: e */
        public final C9108a m38354e(String str) {
            this.f31290a.f36820f = str;
            return this;
        }

        /* renamed from: f */
        public final C9108a m38355f(String str) {
            this.f31290a.f36821g = str;
            return this;
        }

        /* renamed from: b */
        public final C9108a m38349b(Number number) {
            this.f31290a.f36822h = number;
            return this;
        }

        /* renamed from: c */
        public final C9108a m38351c(Number number) {
            this.f31290a.f36823i = number;
            return this;
        }

        /* renamed from: g */
        public final C9108a m38356g(String str) {
            this.f31290a.f36824j = str;
            return this;
        }

        /* renamed from: a */
        public hn m38348a() {
            return this.f31290a;
        }
    }

    /* renamed from: com.tinder.etl.event.hn$b */
    public class C11322b extends fw {
        /* renamed from: a */
        final /* synthetic */ hn f36813a;

        /* renamed from: a */
        public String mo10346a() {
            return "GIF.Select";
        }

        public C11322b(hn hnVar, Map<EtlField<?>, Object> map) {
            this.f36813a = hnVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.hn$c */
    private final class C11323c implements DescriptorFactory<C11322b, hn> {
        /* renamed from: a */
        final /* synthetic */ hn f36814a;

        private C11323c(hn hnVar) {
            this.f36814a = hnVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45281a((hn) etlEvent);
        }

        /* renamed from: a */
        public final C11322b m45281a(hn hnVar) {
            Map hashMap = new HashMap();
            if (hnVar.f36815a != null) {
                hashMap.put(new ib(), hnVar.f36815a);
            }
            if (hnVar.f36816b != null) {
                hashMap.put(new ic(), hnVar.f36816b);
            }
            if (hnVar.f36817c != null) {
                hashMap.put(new id(), hnVar.f36817c);
            }
            if (hnVar.f36818d != null) {
                hashMap.put(new C11329if(), hnVar.f36818d);
            }
            if (hnVar.f36819e != null) {
                hashMap.put(new kb(), hnVar.f36819e);
            }
            if (hnVar.f36820f != null) {
                hashMap.put(new ll(), hnVar.f36820f);
            }
            if (hnVar.f36821g != null) {
                hashMap.put(new lx(), hnVar.f36821g);
            }
            if (hnVar.f36822h != null) {
                hashMap.put(new nx(), hnVar.f36822h);
            }
            if (hnVar.f36823i != null) {
                hashMap.put(new ny(), hnVar.f36823i);
            }
            if (hnVar.f36824j != null) {
                hashMap.put(new ov(), hnVar.f36824j);
            }
            return new C11322b(this.f36814a, hashMap);
        }
    }

    private hn() {
    }

    /* renamed from: a */
    public static C9108a m45282a() {
        return new C9108a();
    }

    public final DescriptorFactory<C11322b, hn> getDescriptorFactory() {
        return new C11323c();
    }
}
