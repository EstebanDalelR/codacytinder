package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class cd implements EtlEvent {
    /* renamed from: a */
    private Boolean f36287a;
    /* renamed from: b */
    private Number f36288b;
    /* renamed from: c */
    private Number f36289c;
    /* renamed from: d */
    private List f36290d;
    /* renamed from: e */
    private Number f36291e;
    /* renamed from: f */
    private Number f36292f;
    /* renamed from: g */
    private Number f36293g;

    /* renamed from: com.tinder.etl.event.cd$a */
    public static class C9004a {
        /* renamed from: a */
        private cd f31237a;

        private C9004a() {
            this.f31237a = new cd();
        }

        /* renamed from: a */
        public final C9004a m37910a(Boolean bool) {
            this.f31237a.f36287a = bool;
            return this;
        }

        /* renamed from: a */
        public final C9004a m37911a(Number number) {
            this.f31237a.f36288b = number;
            return this;
        }

        /* renamed from: b */
        public final C9004a m37914b(Number number) {
            this.f31237a.f36289c = number;
            return this;
        }

        /* renamed from: a */
        public final C9004a m37912a(List list) {
            this.f31237a.f36290d = list;
            return this;
        }

        /* renamed from: c */
        public final C9004a m37915c(Number number) {
            this.f31237a.f36291e = number;
            return this;
        }

        /* renamed from: d */
        public final C9004a m37916d(Number number) {
            this.f31237a.f36292f = number;
            return this;
        }

        /* renamed from: e */
        public final C9004a m37917e(Number number) {
            this.f31237a.f36293g = number;
            return this;
        }

        /* renamed from: a */
        public cd m37913a() {
            return this.f31237a;
        }
    }

    /* renamed from: com.tinder.etl.event.cd$b */
    public class C11212b extends fw {
        /* renamed from: a */
        final /* synthetic */ cd f36285a;

        /* renamed from: a */
        public String mo10346a() {
            return "BoostPaywall.View";
        }

        public C11212b(cd cdVar, Map<EtlField<?>, Object> map) {
            this.f36285a = cdVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.cd$c */
    private final class C11213c implements DescriptorFactory<C11212b, cd> {
        /* renamed from: a */
        final /* synthetic */ cd f36286a;

        private C11213c(cd cdVar) {
            this.f36286a = cdVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44319a((cd) etlEvent);
        }

        /* renamed from: a */
        public final C11212b m44319a(cd cdVar) {
            Map hashMap = new HashMap();
            if (cdVar.f36287a != null) {
                hashMap.put(new iz(), cdVar.f36287a);
            }
            if (cdVar.f36288b != null) {
                hashMap.put(new yi(), cdVar.f36288b);
            }
            if (cdVar.f36289c != null) {
                hashMap.put(new cc(), cdVar.f36289c);
            }
            if (cdVar.f36290d != null) {
                hashMap.put(new rm(), cdVar.f36290d);
            }
            if (cdVar.f36291e != null) {
                hashMap.put(new hc(), cdVar.f36291e);
            }
            if (cdVar.f36292f != null) {
                hashMap.put(new cf(), cdVar.f36292f);
            }
            if (cdVar.f36293g != null) {
                hashMap.put(new sk(), cdVar.f36293g);
            }
            return new C11212b(this.f36286a, hashMap);
        }
    }

    private cd() {
    }

    /* renamed from: a */
    public static C9004a m44320a() {
        return new C9004a();
    }

    public final DescriptorFactory<C11212b, cd> getDescriptorFactory() {
        return new C11213c();
    }
}
