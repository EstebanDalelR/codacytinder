package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class sv implements EtlEvent {
    /* renamed from: a */
    private String f37331a;
    /* renamed from: b */
    private String f37332b;
    /* renamed from: c */
    private String f37333c;
    /* renamed from: d */
    private List f37334d;
    /* renamed from: e */
    private String f37335e;
    /* renamed from: f */
    private String f37336f;
    /* renamed from: g */
    private Number f37337g;
    /* renamed from: h */
    private String f37338h;
    /* renamed from: i */
    private String f37339i;
    /* renamed from: j */
    private String f37340j;
    /* renamed from: k */
    private Number f37341k;
    /* renamed from: l */
    private String f37342l;
    /* renamed from: m */
    private String f37343m;
    /* renamed from: n */
    private String f37344n;
    /* renamed from: o */
    private Number f37345o;

    /* renamed from: com.tinder.etl.event.sv$a */
    public static class C9260a {
        /* renamed from: a */
        private sv f31366a;

        private C9260a() {
            this.f31366a = new sv();
        }

        /* renamed from: a */
        public final C9260a m38727a(String str) {
            this.f31366a.f37344n = str;
            return this;
        }

        /* renamed from: a */
        public final C9260a m38726a(Number number) {
            this.f31366a.f37345o = number;
            return this;
        }

        /* renamed from: a */
        public sv m38728a() {
            return this.f31366a;
        }
    }

    /* renamed from: com.tinder.etl.event.sv$b */
    public class C11486b extends fw {
        /* renamed from: a */
        final /* synthetic */ sv f37329a;

        /* renamed from: a */
        public String mo10346a() {
            return "Push.Send";
        }

        public C11486b(sv svVar, Map<EtlField<?>, Object> map) {
            this.f37329a = svVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.sv$c */
    private final class C11487c implements DescriptorFactory<C11486b, sv> {
        /* renamed from: a */
        final /* synthetic */ sv f37330a;

        private C11487c(sv svVar) {
            this.f37330a = svVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46177a((sv) etlEvent);
        }

        /* renamed from: a */
        public final C11486b m46177a(sv svVar) {
            Map hashMap = new HashMap();
            if (svVar.f37331a != null) {
                hashMap.put(new ll(), svVar.f37331a);
            }
            if (svVar.f37332b != null) {
                hashMap.put(new ml(), svVar.f37332b);
            }
            if (svVar.f37333c != null) {
                hashMap.put(new qb(), svVar.f37333c);
            }
            if (svVar.f37334d != null) {
                hashMap.put(new qc(), svVar.f37334d);
            }
            if (svVar.f37335e != null) {
                hashMap.put(new so(), svVar.f37335e);
            }
            if (svVar.f37336f != null) {
                hashMap.put(new sn(), svVar.f37336f);
            }
            if (svVar.f37337g != null) {
                hashMap.put(new ss(), svVar.f37337g);
            }
            if (svVar.f37338h != null) {
                hashMap.put(new sy(), svVar.f37338h);
            }
            if (svVar.f37339i != null) {
                hashMap.put(new sz(), svVar.f37339i);
            }
            if (svVar.f37340j != null) {
                hashMap.put(new tb(), svVar.f37340j);
            }
            if (svVar.f37341k != null) {
                hashMap.put(new tc(), svVar.f37341k);
            }
            if (svVar.f37342l != null) {
                hashMap.put(new vo(), svVar.f37342l);
            }
            if (svVar.f37343m != null) {
                hashMap.put(new vp(), svVar.f37343m);
            }
            if (svVar.f37344n != null) {
                hashMap.put(new zl(), svVar.f37344n);
            }
            if (svVar.f37345o != null) {
                hashMap.put(new xx(), svVar.f37345o);
            }
            return new C11486b(this.f37330a, hashMap);
        }
    }

    private sv() {
    }

    /* renamed from: a */
    public static C9260a m46178a() {
        return new C9260a();
    }

    public final DescriptorFactory<C11486b, sv> getDescriptorFactory() {
        return new C11487c();
    }
}
