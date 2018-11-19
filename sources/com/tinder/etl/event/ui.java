package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ui implements EtlEvent {
    /* renamed from: a */
    private Boolean f37549a;
    /* renamed from: b */
    private Boolean f37550b;
    /* renamed from: c */
    private Boolean f37551c;
    /* renamed from: d */
    private String f37552d;
    /* renamed from: e */
    private Boolean f37553e;
    /* renamed from: f */
    private Boolean f37554f;
    /* renamed from: g */
    private Number f37555g;
    /* renamed from: h */
    private Boolean f37556h;
    /* renamed from: i */
    private Number f37557i;
    /* renamed from: j */
    private Boolean f37558j;

    /* renamed from: com.tinder.etl.event.ui$a */
    public static class C9292a {
        /* renamed from: a */
        private ui f31382a;

        private C9292a() {
            this.f31382a = new ui();
        }

        /* renamed from: a */
        public final C9292a m38846a(Boolean bool) {
            this.f31382a.f37549a = bool;
            return this;
        }

        /* renamed from: b */
        public final C9292a m38850b(Boolean bool) {
            this.f31382a.f37551c = bool;
            return this;
        }

        /* renamed from: a */
        public final C9292a m38848a(String str) {
            this.f31382a.f37552d = str;
            return this;
        }

        /* renamed from: c */
        public final C9292a m38852c(Boolean bool) {
            this.f31382a.f37554f = bool;
            return this;
        }

        /* renamed from: a */
        public final C9292a m38847a(Number number) {
            this.f31382a.f37555g = number;
            return this;
        }

        /* renamed from: d */
        public final C9292a m38853d(Boolean bool) {
            this.f31382a.f37556h = bool;
            return this;
        }

        /* renamed from: b */
        public final C9292a m38851b(Number number) {
            this.f31382a.f37557i = number;
            return this;
        }

        /* renamed from: e */
        public final C9292a m38854e(Boolean bool) {
            this.f31382a.f37558j = bool;
            return this;
        }

        /* renamed from: a */
        public ui m38849a() {
            return this.f31382a;
        }
    }

    /* renamed from: com.tinder.etl.event.ui$b */
    public class C11520b extends fw {
        /* renamed from: a */
        final /* synthetic */ ui f37547a;

        /* renamed from: a */
        public String mo10346a() {
            return "Recs.Rewind";
        }

        public C11520b(ui uiVar, Map<EtlField<?>, Object> map) {
            this.f37547a = uiVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ui$c */
    private final class C11521c implements DescriptorFactory<C11520b, ui> {
        /* renamed from: a */
        final /* synthetic */ ui f37548a;

        private C11521c(ui uiVar) {
            this.f37548a = uiVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46515a((ui) etlEvent);
        }

        /* renamed from: a */
        public final C11520b m46515a(ui uiVar) {
            Map hashMap = new HashMap();
            if (uiVar.f37549a != null) {
                hashMap.put(new ev(), uiVar.f37549a);
            }
            if (uiVar.f37550b != null) {
                hashMap.put(new hj(), uiVar.f37550b);
            }
            if (uiVar.f37551c != null) {
                hashMap.put(new ke(), uiVar.f37551c);
            }
            if (uiVar.f37552d != null) {
                hashMap.put(new ov(), uiVar.f37552d);
            }
            if (uiVar.f37553e != null) {
                hashMap.put(new pj(), uiVar.f37553e);
            }
            if (uiVar.f37554f != null) {
                hashMap.put(new tu(), uiVar.f37554f);
            }
            if (uiVar.f37555g != null) {
                hashMap.put(new vd(), uiVar.f37555g);
            }
            if (uiVar.f37556h != null) {
                hashMap.put(new xh(), uiVar.f37556h);
            }
            if (uiVar.f37557i != null) {
                hashMap.put(new yi(), uiVar.f37557i);
            }
            if (uiVar.f37558j != null) {
                hashMap.put(new zy(), uiVar.f37558j);
            }
            return new C11520b(this.f37548a, hashMap);
        }
    }

    private ui() {
    }

    /* renamed from: a */
    public static C9292a m46516a() {
        return new C9292a();
    }

    public final DescriptorFactory<C11520b, ui> getDescriptorFactory() {
        return new C11521c();
    }
}
