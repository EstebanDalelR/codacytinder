package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ho implements EtlEvent {
    /* renamed from: a */
    private String f36827a;
    /* renamed from: b */
    private Number f36828b;
    /* renamed from: c */
    private String f36829c;
    /* renamed from: d */
    private String f36830d;
    /* renamed from: e */
    private String f36831e;
    /* renamed from: f */
    private String f36832f;
    /* renamed from: g */
    private String f36833g;
    /* renamed from: h */
    private Number f36834h;
    /* renamed from: i */
    private Number f36835i;
    /* renamed from: j */
    private String f36836j;

    /* renamed from: com.tinder.etl.event.ho$a */
    public static class C9110a {
        /* renamed from: a */
        private ho f31291a;

        private C9110a() {
            this.f31291a = new ho();
        }

        /* renamed from: a */
        public final C9110a m38358a(String str) {
            this.f31291a.f36827a = str;
            return this;
        }

        /* renamed from: a */
        public final C9110a m38357a(Number number) {
            this.f31291a.f36828b = number;
            return this;
        }

        /* renamed from: b */
        public final C9110a m38361b(String str) {
            this.f31291a.f36829c = str;
            return this;
        }

        /* renamed from: c */
        public final C9110a m38363c(String str) {
            this.f31291a.f36830d = str;
            return this;
        }

        /* renamed from: d */
        public final C9110a m38364d(String str) {
            this.f31291a.f36831e = str;
            return this;
        }

        /* renamed from: e */
        public final C9110a m38365e(String str) {
            this.f31291a.f36832f = str;
            return this;
        }

        /* renamed from: f */
        public final C9110a m38366f(String str) {
            this.f31291a.f36833g = str;
            return this;
        }

        /* renamed from: b */
        public final C9110a m38360b(Number number) {
            this.f31291a.f36834h = number;
            return this;
        }

        /* renamed from: c */
        public final C9110a m38362c(Number number) {
            this.f31291a.f36835i = number;
            return this;
        }

        /* renamed from: g */
        public final C9110a m38367g(String str) {
            this.f31291a.f36836j = str;
            return this;
        }

        /* renamed from: a */
        public ho m38359a() {
            return this.f31291a;
        }
    }

    /* renamed from: com.tinder.etl.event.ho$b */
    public class C11324b extends fw {
        /* renamed from: a */
        final /* synthetic */ ho f36825a;

        /* renamed from: a */
        public String mo10346a() {
            return "GIF.Shown";
        }

        public C11324b(ho hoVar, Map<EtlField<?>, Object> map) {
            this.f36825a = hoVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ho$c */
    private final class C11325c implements DescriptorFactory<C11324b, ho> {
        /* renamed from: a */
        final /* synthetic */ ho f36826a;

        private C11325c(ho hoVar) {
            this.f36826a = hoVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45304a((ho) etlEvent);
        }

        /* renamed from: a */
        public final C11324b m45304a(ho hoVar) {
            Map hashMap = new HashMap();
            if (hoVar.f36827a != null) {
                hashMap.put(new ib(), hoVar.f36827a);
            }
            if (hoVar.f36828b != null) {
                hashMap.put(new ic(), hoVar.f36828b);
            }
            if (hoVar.f36829c != null) {
                hashMap.put(new id(), hoVar.f36829c);
            }
            if (hoVar.f36830d != null) {
                hashMap.put(new C11329if(), hoVar.f36830d);
            }
            if (hoVar.f36831e != null) {
                hashMap.put(new kb(), hoVar.f36831e);
            }
            if (hoVar.f36832f != null) {
                hashMap.put(new ll(), hoVar.f36832f);
            }
            if (hoVar.f36833g != null) {
                hashMap.put(new lx(), hoVar.f36833g);
            }
            if (hoVar.f36834h != null) {
                hashMap.put(new nx(), hoVar.f36834h);
            }
            if (hoVar.f36835i != null) {
                hashMap.put(new ny(), hoVar.f36835i);
            }
            if (hoVar.f36836j != null) {
                hashMap.put(new ov(), hoVar.f36836j);
            }
            return new C11324b(this.f36826a, hashMap);
        }
    }

    private ho() {
    }

    /* renamed from: a */
    public static C9110a m45305a() {
        return new C9110a();
    }

    public final DescriptorFactory<C11324b, ho> getDescriptorFactory() {
        return new C11325c();
    }
}
