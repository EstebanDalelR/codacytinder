package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class dt implements EtlEvent {
    /* renamed from: a */
    private Number f36627a;
    /* renamed from: b */
    private Number f36628b;
    /* renamed from: c */
    private String f36629c;
    /* renamed from: d */
    private String f36630d;
    /* renamed from: e */
    private Number f36631e;
    /* renamed from: f */
    private Number f36632f;
    /* renamed from: g */
    private String f36633g;
    /* renamed from: h */
    private String f36634h;
    /* renamed from: i */
    private Number f36635i;
    /* renamed from: j */
    private String f36636j;

    /* renamed from: com.tinder.etl.event.dt$a */
    public static class C9062a {
        /* renamed from: a */
        private dt f31266a;

        private C9062a() {
            this.f31266a = new dt();
        }

        /* renamed from: a */
        public final C9062a m38189a(Number number) {
            this.f31266a.f36627a = number;
            return this;
        }

        /* renamed from: b */
        public final C9062a m38192b(Number number) {
            this.f31266a.f36628b = number;
            return this;
        }

        /* renamed from: a */
        public final C9062a m38190a(String str) {
            this.f31266a.f36629c = str;
            return this;
        }

        /* renamed from: b */
        public final C9062a m38193b(String str) {
            this.f31266a.f36630d = str;
            return this;
        }

        /* renamed from: c */
        public final C9062a m38194c(Number number) {
            this.f31266a.f36631e = number;
            return this;
        }

        /* renamed from: d */
        public final C9062a m38196d(Number number) {
            this.f31266a.f36632f = number;
            return this;
        }

        /* renamed from: c */
        public final C9062a m38195c(String str) {
            this.f31266a.f36633g = str;
            return this;
        }

        /* renamed from: d */
        public final C9062a m38197d(String str) {
            this.f31266a.f36634h = str;
            return this;
        }

        /* renamed from: e */
        public final C9062a m38198e(Number number) {
            this.f31266a.f36635i = number;
            return this;
        }

        /* renamed from: e */
        public final C9062a m38199e(String str) {
            this.f31266a.f36636j = str;
            return this;
        }

        /* renamed from: a */
        public dt m38191a() {
            return this.f31266a;
        }
    }

    /* renamed from: com.tinder.etl.event.dt$b */
    public class C11272b extends fw {
        /* renamed from: a */
        final /* synthetic */ dt f36625a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.Typing";
        }

        public C11272b(dt dtVar, Map<EtlField<?>, Object> map) {
            this.f36625a = dtVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.dt$c */
    private final class C11273c implements DescriptorFactory<C11272b, dt> {
        /* renamed from: a */
        final /* synthetic */ dt f36626a;

        private C11273c(dt dtVar) {
            this.f36626a = dtVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44938a((dt) etlEvent);
        }

        /* renamed from: a */
        public final C11272b m44938a(dt dtVar) {
            Map hashMap = new HashMap();
            if (dtVar.f36627a != null) {
                hashMap.put(new fk(), dtVar.f36627a);
            }
            if (dtVar.f36628b != null) {
                hashMap.put(new jc(), dtVar.f36628b);
            }
            if (dtVar.f36629c != null) {
                hashMap.put(new kb(), dtVar.f36629c);
            }
            if (dtVar.f36630d != null) {
                hashMap.put(new ll(), dtVar.f36630d);
            }
            if (dtVar.f36631e != null) {
                hashMap.put(new nx(), dtVar.f36631e);
            }
            if (dtVar.f36632f != null) {
                hashMap.put(new ny(), dtVar.f36632f);
            }
            if (dtVar.f36633g != null) {
                hashMap.put(new ov(), dtVar.f36633g);
            }
            if (dtVar.f36634h != null) {
                hashMap.put(new th(), dtVar.f36634h);
            }
            if (dtVar.f36635i != null) {
                hashMap.put(new zg(), dtVar.f36635i);
            }
            if (dtVar.f36636j != null) {
                hashMap.put(new zl(), dtVar.f36636j);
            }
            return new C11272b(this.f36626a, hashMap);
        }
    }

    private dt() {
    }

    /* renamed from: a */
    public static C9062a m44939a() {
        return new C9062a();
    }

    public final DescriptorFactory<C11272b, dt> getDescriptorFactory() {
        return new C11273c();
    }
}
