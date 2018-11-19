package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class vv implements EtlEvent {
    /* renamed from: a */
    private String f37615a;
    /* renamed from: b */
    private String f37616b;
    /* renamed from: c */
    private String f37617c;
    /* renamed from: d */
    private Number f37618d;
    /* renamed from: e */
    private Number f37619e;
    /* renamed from: f */
    private Boolean f37620f;
    /* renamed from: g */
    private Boolean f37621g;
    /* renamed from: h */
    private Number f37622h;

    /* renamed from: com.tinder.etl.event.vv$a */
    public static class C9304a {
        /* renamed from: a */
        private vv f31388a;

        private C9304a() {
            this.f31388a = new vv();
        }

        /* renamed from: a */
        public final C9304a m38902a(String str) {
            this.f31388a.f37615a = str;
            return this;
        }

        /* renamed from: b */
        public final C9304a m38906b(String str) {
            this.f31388a.f37616b = str;
            return this;
        }

        /* renamed from: a */
        public final C9304a m38901a(Number number) {
            this.f31388a.f37618d = number;
            return this;
        }

        /* renamed from: b */
        public final C9304a m38905b(Number number) {
            this.f31388a.f37619e = number;
            return this;
        }

        /* renamed from: a */
        public final C9304a m38900a(Boolean bool) {
            this.f31388a.f37620f = bool;
            return this;
        }

        /* renamed from: b */
        public final C9304a m38904b(Boolean bool) {
            this.f31388a.f37621g = bool;
            return this;
        }

        /* renamed from: a */
        public vv m38903a() {
            return this.f31388a;
        }
    }

    /* renamed from: com.tinder.etl.event.vv$b */
    public class C11533b extends fw {
        /* renamed from: a */
        final /* synthetic */ vv f37613a;

        /* renamed from: a */
        public String mo10346a() {
            return "Session.Navigate";
        }

        public C11533b(vv vvVar, Map<EtlField<?>, Object> map) {
            this.f37613a = vvVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.vv$c */
    private final class C11534c implements DescriptorFactory<C11533b, vv> {
        /* renamed from: a */
        final /* synthetic */ vv f37614a;

        private C11534c(vv vvVar) {
            this.f37614a = vvVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46635a((vv) etlEvent);
        }

        /* renamed from: a */
        public final C11533b m46635a(vv vvVar) {
            Map hashMap = new HashMap();
            if (vvVar.f37615a != null) {
                hashMap.put(new vs(), vvVar.f37615a);
            }
            if (vvVar.f37616b != null) {
                hashMap.put(new wa(), vvVar.f37616b);
            }
            if (vvVar.f37617c != null) {
                hashMap.put(new vr(), vvVar.f37617c);
            }
            if (vvVar.f37618d != null) {
                hashMap.put(new wc(), vvVar.f37618d);
            }
            if (vvVar.f37619e != null) {
                hashMap.put(new vu(), vvVar.f37619e);
            }
            if (vvVar.f37620f != null) {
                hashMap.put(new wd(), vvVar.f37620f);
            }
            if (vvVar.f37621g != null) {
                hashMap.put(new vq(), vvVar.f37621g);
            }
            if (vvVar.f37622h != null) {
                hashMap.put(new we(), vvVar.f37622h);
            }
            return new C11533b(this.f37614a, hashMap);
        }
    }

    private vv() {
    }

    /* renamed from: a */
    public static C9304a m46636a() {
        return new C9304a();
    }

    public final DescriptorFactory<C11533b, vv> getDescriptorFactory() {
        return new C11534c();
    }
}
