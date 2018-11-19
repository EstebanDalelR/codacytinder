package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class su implements EtlEvent {
    /* renamed from: a */
    private Map f37318a;
    /* renamed from: b */
    private Number f37319b;
    /* renamed from: c */
    private Number f37320c;
    /* renamed from: d */
    private String f37321d;
    /* renamed from: e */
    private String f37322e;
    /* renamed from: f */
    private Number f37323f;
    /* renamed from: g */
    private Number f37324g;
    /* renamed from: h */
    private String f37325h;
    /* renamed from: i */
    private Number f37326i;
    /* renamed from: j */
    private String f37327j;
    /* renamed from: k */
    private String f37328k;

    /* renamed from: com.tinder.etl.event.su$a */
    public static class C9258a {
        /* renamed from: a */
        private su f31365a;

        private C9258a() {
            this.f31365a = new su();
        }

        /* renamed from: a */
        public final C9258a m38722a(String str) {
            this.f31365a.f37321d = str;
            return this;
        }

        /* renamed from: a */
        public final C9258a m38721a(Number number) {
            this.f31365a.f37323f = number;
            return this;
        }

        /* renamed from: b */
        public final C9258a m38724b(Number number) {
            this.f31365a.f37324g = number;
            return this;
        }

        /* renamed from: b */
        public final C9258a m38725b(String str) {
            this.f31365a.f37328k = str;
            return this;
        }

        /* renamed from: a */
        public su m38723a() {
            return this.f31365a;
        }
    }

    /* renamed from: com.tinder.etl.event.su$b */
    public class C11484b extends fw {
        /* renamed from: a */
        final /* synthetic */ su f37316a;

        /* renamed from: a */
        public String mo10346a() {
            return "Push.Receive";
        }

        public C11484b(su suVar, Map<EtlField<?>, Object> map) {
            this.f37316a = suVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.su$c */
    private final class C11485c implements DescriptorFactory<C11484b, su> {
        /* renamed from: a */
        final /* synthetic */ su f37317a;

        private C11485c(su suVar) {
            this.f37317a = suVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46159a((su) etlEvent);
        }

        /* renamed from: a */
        public final C11484b m46159a(su suVar) {
            Map hashMap = new HashMap();
            if (suVar.f37318a != null) {
                hashMap.put(new ay(), suVar.f37318a);
            }
            if (suVar.f37319b != null) {
                hashMap.put(new cv(), suVar.f37319b);
            }
            if (suVar.f37320c != null) {
                hashMap.put(new hc(), suVar.f37320c);
            }
            if (suVar.f37321d != null) {
                hashMap.put(new ml(), suVar.f37321d);
            }
            if (suVar.f37322e != null) {
                hashMap.put(new so(), suVar.f37322e);
            }
            if (suVar.f37323f != null) {
                hashMap.put(new sm(), suVar.f37323f);
            }
            if (suVar.f37324g != null) {
                hashMap.put(new sx(), suVar.f37324g);
            }
            if (suVar.f37325h != null) {
                hashMap.put(new sz(), suVar.f37325h);
            }
            if (suVar.f37326i != null) {
                hashMap.put(new ta(), suVar.f37326i);
            }
            if (suVar.f37327j != null) {
                hashMap.put(new tb(), suVar.f37327j);
            }
            if (suVar.f37328k != null) {
                hashMap.put(new zl(), suVar.f37328k);
            }
            return new C11484b(this.f37317a, hashMap);
        }
    }

    private su() {
    }

    /* renamed from: a */
    public static C9258a m46160a() {
        return new C9258a();
    }

    public final DescriptorFactory<C11484b, su> getDescriptorFactory() {
        return new C11485c();
    }
}
