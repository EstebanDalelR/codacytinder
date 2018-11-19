package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class di implements EtlEvent {
    /* renamed from: a */
    private Number f36474a;
    /* renamed from: b */
    private Number f36475b;
    /* renamed from: c */
    private Boolean f36476c;
    /* renamed from: d */
    private String f36477d;
    /* renamed from: e */
    private String f36478e;
    /* renamed from: f */
    private Number f36479f;
    /* renamed from: g */
    private Number f36480g;
    /* renamed from: h */
    private String f36481h;

    /* renamed from: com.tinder.etl.event.di$a */
    public static class C9040a {
        /* renamed from: a */
        private di f31255a;

        private C9040a() {
            this.f31255a = new di();
        }

        /* renamed from: a */
        public final C9040a m38063a(Number number) {
            this.f31255a.f36474a = number;
            return this;
        }

        /* renamed from: b */
        public final C9040a m38066b(Number number) {
            this.f31255a.f36475b = number;
            return this;
        }

        /* renamed from: a */
        public final C9040a m38062a(Boolean bool) {
            this.f31255a.f36476c = bool;
            return this;
        }

        /* renamed from: a */
        public final C9040a m38064a(String str) {
            this.f31255a.f36477d = str;
            return this;
        }

        /* renamed from: b */
        public final C9040a m38067b(String str) {
            this.f31255a.f36478e = str;
            return this;
        }

        /* renamed from: a */
        public di m38065a() {
            return this.f31255a;
        }
    }

    /* renamed from: com.tinder.etl.event.di$b */
    public class C11249b extends fw {
        /* renamed from: a */
        final /* synthetic */ di f36472a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.ProfileInstagramPage";
        }

        public C11249b(di diVar, Map<EtlField<?>, Object> map) {
            this.f36472a = diVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.di$c */
    private final class C11250c implements DescriptorFactory<C11249b, di> {
        /* renamed from: a */
        final /* synthetic */ di f36473a;

        private C11250c(di diVar) {
            this.f36473a = diVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44658a((di) etlEvent);
        }

        /* renamed from: a */
        public final C11249b m44658a(di diVar) {
            Map hashMap = new HashMap();
            if (diVar.f36474a != null) {
                hashMap.put(new ew(), diVar.f36474a);
            }
            if (diVar.f36475b != null) {
                hashMap.put(new oz(), diVar.f36475b);
            }
            if (diVar.f36476c != null) {
                hashMap.put(new fs(), diVar.f36476c);
            }
            if (diVar.f36477d != null) {
                hashMap.put(new ov(), diVar.f36477d);
            }
            if (diVar.f36478e != null) {
                hashMap.put(new jj(), diVar.f36478e);
            }
            if (diVar.f36479f != null) {
                hashMap.put(new ny(), diVar.f36479f);
            }
            if (diVar.f36480g != null) {
                hashMap.put(new nx(), diVar.f36480g);
            }
            if (diVar.f36481h != null) {
                hashMap.put(new kb(), diVar.f36481h);
            }
            return new C11249b(this.f36473a, hashMap);
        }
    }

    private di() {
    }

    /* renamed from: a */
    public static C9040a m44659a() {
        return new C9040a();
    }

    public final DescriptorFactory<C11249b, di> getDescriptorFactory() {
        return new C11250c();
    }
}
