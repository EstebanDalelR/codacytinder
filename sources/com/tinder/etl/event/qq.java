package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class qq implements EtlEvent {
    /* renamed from: a */
    private Number f37194a;
    /* renamed from: b */
    private Number f37195b;
    /* renamed from: c */
    private Number f37196c;
    /* renamed from: d */
    private Boolean f37197d;
    /* renamed from: e */
    private Number f37198e;
    /* renamed from: f */
    private Number f37199f;
    /* renamed from: g */
    private String f37200g;
    /* renamed from: h */
    private String f37201h;
    /* renamed from: i */
    private Number f37202i;
    /* renamed from: j */
    private Boolean f37203j;

    /* renamed from: com.tinder.etl.event.qq$a */
    public static class C9212a {
        /* renamed from: a */
        private qq f31342a;

        private C9212a() {
            this.f31342a = new qq();
        }

        /* renamed from: a */
        public final C9212a m38631a(Number number) {
            this.f31342a.f37194a = number;
            return this;
        }

        /* renamed from: b */
        public final C9212a m38635b(Number number) {
            this.f31342a.f37195b = number;
            return this;
        }

        /* renamed from: c */
        public final C9212a m38637c(Number number) {
            this.f31342a.f37196c = number;
            return this;
        }

        /* renamed from: a */
        public final C9212a m38630a(Boolean bool) {
            this.f31342a.f37197d = bool;
            return this;
        }

        /* renamed from: d */
        public final C9212a m38638d(Number number) {
            this.f31342a.f37198e = number;
            return this;
        }

        /* renamed from: e */
        public final C9212a m38639e(Number number) {
            this.f31342a.f37199f = number;
            return this;
        }

        /* renamed from: a */
        public final C9212a m38632a(String str) {
            this.f31342a.f37200g = str;
            return this;
        }

        /* renamed from: b */
        public final C9212a m38636b(String str) {
            this.f31342a.f37201h = str;
            return this;
        }

        /* renamed from: b */
        public final C9212a m38634b(Boolean bool) {
            this.f31342a.f37203j = bool;
            return this;
        }

        /* renamed from: a */
        public qq m38633a() {
            return this.f31342a;
        }
    }

    /* renamed from: com.tinder.etl.event.qq$b */
    public class C11436b extends fw {
        /* renamed from: a */
        final /* synthetic */ qq f37192a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.RecentPlaceView";
        }

        public C11436b(qq qqVar, Map<EtlField<?>, Object> map) {
            this.f37192a = qqVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.qq$c */
    private final class C11437c implements DescriptorFactory<C11436b, qq> {
        /* renamed from: a */
        final /* synthetic */ qq f37193a;

        private C11437c(qq qqVar) {
            this.f37193a = qqVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45944a((qq) etlEvent);
        }

        /* renamed from: a */
        public final C11436b m45944a(qq qqVar) {
            Map hashMap = new HashMap();
            if (qqVar.f37194a != null) {
                hashMap.put(new ct(), qqVar.f37194a);
            }
            if (qqVar.f37195b != null) {
                hashMap.put(new ft(), qqVar.f37195b);
            }
            if (qqVar.f37196c != null) {
                hashMap.put(new ga(), qqVar.f37196c);
            }
            if (qqVar.f37197d != null) {
                hashMap.put(new jw(), qqVar.f37197d);
            }
            if (qqVar.f37198e != null) {
                hashMap.put(new nz(), qqVar.f37198e);
            }
            if (qqVar.f37199f != null) {
                hashMap.put(new oi(), qqVar.f37199f);
            }
            if (qqVar.f37200g != null) {
                hashMap.put(new qb(), qqVar.f37200g);
            }
            if (qqVar.f37201h != null) {
                hashMap.put(new wy(), qqVar.f37201h);
            }
            if (qqVar.f37202i != null) {
                hashMap.put(new yn(), qqVar.f37202i);
            }
            if (qqVar.f37203j != null) {
                hashMap.put(new aal(), qqVar.f37203j);
            }
            return new C11436b(this.f37193a, hashMap);
        }
    }

    private qq() {
    }

    /* renamed from: a */
    public static C9212a m45945a() {
        return new C9212a();
    }

    public final DescriptorFactory<C11436b, qq> getDescriptorFactory() {
        return new C11437c();
    }
}
