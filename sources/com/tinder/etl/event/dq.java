package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class dq implements EtlEvent {
    /* renamed from: a */
    private String f36593a;
    /* renamed from: b */
    private String f36594b;
    /* renamed from: c */
    private String f36595c;
    /* renamed from: d */
    private String f36596d;
    /* renamed from: e */
    private Number f36597e;
    /* renamed from: f */
    private String f36598f;
    /* renamed from: g */
    private String f36599g;

    /* renamed from: com.tinder.etl.event.dq$a */
    public static class C9056a {
        /* renamed from: a */
        private dq f31263a;

        private C9056a() {
            this.f31263a = new dq();
        }

        /* renamed from: a */
        public final C9056a m38161a(String str) {
            this.f31263a.f36593a = str;
            return this;
        }

        /* renamed from: b */
        public final C9056a m38163b(String str) {
            this.f31263a.f36594b = str;
            return this;
        }

        /* renamed from: c */
        public final C9056a m38164c(String str) {
            this.f31263a.f36595c = str;
            return this;
        }

        /* renamed from: d */
        public final C9056a m38165d(String str) {
            this.f31263a.f36596d = str;
            return this;
        }

        /* renamed from: a */
        public final C9056a m38160a(Number number) {
            this.f31263a.f36597e = number;
            return this;
        }

        /* renamed from: e */
        public final C9056a m38166e(String str) {
            this.f31263a.f36599g = str;
            return this;
        }

        /* renamed from: a */
        public dq m38162a() {
            return this.f31263a;
        }
    }

    /* renamed from: com.tinder.etl.event.dq$b */
    public class C11266b extends fw {
        /* renamed from: a */
        final /* synthetic */ dq f36591a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.TapLink";
        }

        public C11266b(dq dqVar, Map<EtlField<?>, Object> map) {
            this.f36591a = dqVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.dq$c */
    private final class C11267c implements DescriptorFactory<C11266b, dq> {
        /* renamed from: a */
        final /* synthetic */ dq f36592a;

        private C11267c(dq dqVar) {
            this.f36592a = dqVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44875a((dq) etlEvent);
        }

        /* renamed from: a */
        public final C11266b m44875a(dq dqVar) {
            Map hashMap = new HashMap();
            if (dqVar.f36593a != null) {
                hashMap.put(new ll(), dqVar.f36593a);
            }
            if (dqVar.f36594b != null) {
                hashMap.put(new lx(), dqVar.f36594b);
            }
            if (dqVar.f36595c != null) {
                hashMap.put(new ml(), dqVar.f36595c);
            }
            if (dqVar.f36596d != null) {
                hashMap.put(new ov(), dqVar.f36596d);
            }
            if (dqVar.f36597e != null) {
                hashMap.put(new ym(), dqVar.f36597e);
            }
            if (dqVar.f36598f != null) {
                hashMap.put(new zl(), dqVar.f36598f);
            }
            if (dqVar.f36599g != null) {
                hashMap.put(new zt(), dqVar.f36599g);
            }
            return new C11266b(this.f36592a, hashMap);
        }
    }

    private dq() {
    }

    /* renamed from: a */
    public static C9056a m44876a() {
        return new C9056a();
    }

    public final DescriptorFactory<C11266b, dq> getDescriptorFactory() {
        return new C11267c();
    }
}
