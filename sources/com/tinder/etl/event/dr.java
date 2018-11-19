package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class dr implements EtlEvent {
    /* renamed from: a */
    private String f36602a;
    /* renamed from: b */
    private String f36603b;
    /* renamed from: c */
    private String f36604c;
    /* renamed from: d */
    private String f36605d;
    /* renamed from: e */
    private String f36606e;
    /* renamed from: f */
    private String f36607f;
    /* renamed from: g */
    private String f36608g;
    /* renamed from: h */
    private Number f36609h;
    /* renamed from: i */
    private Number f36610i;
    /* renamed from: j */
    private Number f36611j;
    /* renamed from: k */
    private Number f36612k;
    /* renamed from: l */
    private String f36613l;

    /* renamed from: com.tinder.etl.event.dr$a */
    public static class C9058a {
        /* renamed from: a */
        private dr f31264a;

        private C9058a() {
            this.f31264a = new dr();
        }

        /* renamed from: a */
        public final C9058a m38168a(String str) {
            this.f31264a.f36602a = str;
            return this;
        }

        /* renamed from: b */
        public final C9058a m38171b(String str) {
            this.f31264a.f36603b = str;
            return this;
        }

        /* renamed from: c */
        public final C9058a m38173c(String str) {
            this.f31264a.f36604c = str;
            return this;
        }

        /* renamed from: d */
        public final C9058a m38175d(String str) {
            this.f31264a.f36605d = str;
            return this;
        }

        /* renamed from: e */
        public final C9058a m38176e(String str) {
            this.f31264a.f36606e = str;
            return this;
        }

        /* renamed from: f */
        public final C9058a m38177f(String str) {
            this.f31264a.f36607f = str;
            return this;
        }

        /* renamed from: g */
        public final C9058a m38178g(String str) {
            this.f31264a.f36608g = str;
            return this;
        }

        /* renamed from: a */
        public final C9058a m38167a(Number number) {
            this.f31264a.f36609h = number;
            return this;
        }

        /* renamed from: b */
        public final C9058a m38170b(Number number) {
            this.f31264a.f36610i = number;
            return this;
        }

        /* renamed from: c */
        public final C9058a m38172c(Number number) {
            this.f31264a.f36611j = number;
            return this;
        }

        /* renamed from: d */
        public final C9058a m38174d(Number number) {
            this.f31264a.f36612k = number;
            return this;
        }

        /* renamed from: h */
        public final C9058a m38179h(String str) {
            this.f31264a.f36613l = str;
            return this;
        }

        /* renamed from: a */
        public dr m38169a() {
            return this.f31264a;
        }
    }

    /* renamed from: com.tinder.etl.event.dr$b */
    public class C11268b extends fw {
        /* renamed from: a */
        final /* synthetic */ dr f36600a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.TapMessage";
        }

        public C11268b(dr drVar, Map<EtlField<?>, Object> map) {
            this.f36600a = drVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.dr$c */
    private final class C11269c implements DescriptorFactory<C11268b, dr> {
        /* renamed from: a */
        final /* synthetic */ dr f36601a;

        private C11269c(dr drVar) {
            this.f36601a = drVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44891a((dr) etlEvent);
        }

        /* renamed from: a */
        public final C11268b m44891a(dr drVar) {
            Map hashMap = new HashMap();
            if (drVar.f36602a != null) {
                hashMap.put(new ec(), drVar.f36602a);
            }
            if (drVar.f36603b != null) {
                hashMap.put(new ed(), drVar.f36603b);
            }
            if (drVar.f36604c != null) {
                hashMap.put(new ee(), drVar.f36604c);
            }
            if (drVar.f36605d != null) {
                hashMap.put(new ll(), drVar.f36605d);
            }
            if (drVar.f36606e != null) {
                hashMap.put(new lx(), drVar.f36606e);
            }
            if (drVar.f36607f != null) {
                hashMap.put(new ml(), drVar.f36607f);
            }
            if (drVar.f36608g != null) {
                hashMap.put(new mk(), drVar.f36608g);
            }
            if (drVar.f36609h != null) {
                hashMap.put(new mm(), drVar.f36609h);
            }
            if (drVar.f36610i != null) {
                hashMap.put(new mp(), drVar.f36610i);
            }
            if (drVar.f36611j != null) {
                hashMap.put(new nx(), drVar.f36611j);
            }
            if (drVar.f36612k != null) {
                hashMap.put(new ny(), drVar.f36612k);
            }
            if (drVar.f36613l != null) {
                hashMap.put(new ov(), drVar.f36613l);
            }
            return new C11268b(this.f36601a, hashMap);
        }
    }

    private dr() {
    }

    /* renamed from: a */
    public static C9058a m44892a() {
        return new C9058a();
    }

    public final DescriptorFactory<C11268b, dr> getDescriptorFactory() {
        return new C11269c();
    }
}
