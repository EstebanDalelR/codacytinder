package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ud implements EtlEvent {
    /* renamed from: a */
    private Number f37430a;
    /* renamed from: b */
    private Boolean f37431b;
    /* renamed from: c */
    private String f37432c;
    /* renamed from: d */
    private String f37433d;
    /* renamed from: e */
    private Number f37434e;
    /* renamed from: f */
    private Number f37435f;
    /* renamed from: g */
    private String f37436g;
    /* renamed from: h */
    private Number f37437h;

    /* renamed from: com.tinder.etl.event.ud$a */
    public static class C9282a {
        /* renamed from: a */
        private ud f31377a;

        private C9282a() {
            this.f31377a = new ud();
        }

        /* renamed from: a */
        public final C9282a m38783a(Number number) {
            this.f31377a.f37430a = number;
            return this;
        }

        /* renamed from: a */
        public final C9282a m38782a(Boolean bool) {
            this.f31377a.f37431b = bool;
            return this;
        }

        /* renamed from: a */
        public final C9282a m38784a(String str) {
            this.f31377a.f37432c = str;
            return this;
        }

        /* renamed from: b */
        public final C9282a m38787b(String str) {
            this.f31377a.f37436g = str;
            return this;
        }

        /* renamed from: b */
        public final C9282a m38786b(Number number) {
            this.f31377a.f37437h = number;
            return this;
        }

        /* renamed from: a */
        public ud m38785a() {
            return this.f31377a;
        }
    }

    /* renamed from: com.tinder.etl.event.ud$b */
    public class C11510b extends fw {
        /* renamed from: a */
        final /* synthetic */ ud f37428a;

        /* renamed from: a */
        public String mo10346a() {
            return "Recs.ProfileInstagramPage";
        }

        public C11510b(ud udVar, Map<EtlField<?>, Object> map) {
            this.f37428a = udVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ud$c */
    private final class C11511c implements DescriptorFactory<C11510b, ud> {
        /* renamed from: a */
        final /* synthetic */ ud f37429a;

        private C11511c(ud udVar) {
            this.f37429a = udVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46332a((ud) etlEvent);
        }

        /* renamed from: a */
        public final C11510b m46332a(ud udVar) {
            Map hashMap = new HashMap();
            if (udVar.f37430a != null) {
                hashMap.put(new ew(), udVar.f37430a);
            }
            if (udVar.f37431b != null) {
                hashMap.put(new fs(), udVar.f37431b);
            }
            if (udVar.f37432c != null) {
                hashMap.put(new jj(), udVar.f37432c);
            }
            if (udVar.f37433d != null) {
                hashMap.put(new kb(), udVar.f37433d);
            }
            if (udVar.f37434e != null) {
                hashMap.put(new nx(), udVar.f37434e);
            }
            if (udVar.f37435f != null) {
                hashMap.put(new ny(), udVar.f37435f);
            }
            if (udVar.f37436g != null) {
                hashMap.put(new ov(), udVar.f37436g);
            }
            if (udVar.f37437h != null) {
                hashMap.put(new oz(), udVar.f37437h);
            }
            return new C11510b(this.f37429a, hashMap);
        }
    }

    private ud() {
    }

    /* renamed from: a */
    public static C9282a m46333a() {
        return new C9282a();
    }

    public final DescriptorFactory<C11510b, ud> getDescriptorFactory() {
        return new C11511c();
    }
}
