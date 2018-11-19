package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class dk implements EtlEvent {
    /* renamed from: a */
    private Boolean f36492a;
    /* renamed from: b */
    private String f36493b;
    /* renamed from: c */
    private String f36494c;
    /* renamed from: d */
    private String f36495d;
    /* renamed from: e */
    private Number f36496e;
    /* renamed from: f */
    private Number f36497f;
    /* renamed from: g */
    private String f36498g;
    /* renamed from: h */
    private String f36499h;
    /* renamed from: i */
    private String f36500i;

    /* renamed from: com.tinder.etl.event.dk$a */
    public static class C9044a {
        /* renamed from: a */
        private dk f31257a;

        private C9044a() {
            this.f31257a = new dk();
        }

        /* renamed from: a */
        public final C9044a m38072a(Boolean bool) {
            this.f31257a.f36492a = bool;
            return this;
        }

        /* renamed from: a */
        public final C9044a m38074a(String str) {
            this.f31257a.f36493b = str;
            return this;
        }

        /* renamed from: b */
        public final C9044a m38077b(String str) {
            this.f31257a.f36494c = str;
            return this;
        }

        /* renamed from: c */
        public final C9044a m38078c(String str) {
            this.f31257a.f36495d = str;
            return this;
        }

        /* renamed from: a */
        public final C9044a m38073a(Number number) {
            this.f31257a.f36496e = number;
            return this;
        }

        /* renamed from: b */
        public final C9044a m38076b(Number number) {
            this.f31257a.f36497f = number;
            return this;
        }

        /* renamed from: d */
        public final C9044a m38079d(String str) {
            this.f31257a.f36498g = str;
            return this;
        }

        /* renamed from: e */
        public final C9044a m38080e(String str) {
            this.f31257a.f36499h = str;
            return this;
        }

        /* renamed from: f */
        public final C9044a m38081f(String str) {
            this.f31257a.f36500i = str;
            return this;
        }

        /* renamed from: a */
        public dk m38075a() {
            return this.f31257a;
        }
    }

    /* renamed from: com.tinder.etl.event.dk$b */
    public class C11253b extends fw {
        /* renamed from: a */
        final /* synthetic */ dk f36490a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.Report";
        }

        public C11253b(dk dkVar, Map<EtlField<?>, Object> map) {
            this.f36490a = dkVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.dk$c */
    private final class C11254c implements DescriptorFactory<C11253b, dk> {
        /* renamed from: a */
        final /* synthetic */ dk f36491a;

        private C11254c(dk dkVar) {
            this.f36491a = dkVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44686a((dk) etlEvent);
        }

        /* renamed from: a */
        public final C11253b m44686a(dk dkVar) {
            Map hashMap = new HashMap();
            if (dkVar.f36492a != null) {
                hashMap.put(new bv(), dkVar.f36492a);
            }
            if (dkVar.f36493b != null) {
                hashMap.put(new kb(), dkVar.f36493b);
            }
            if (dkVar.f36494c != null) {
                hashMap.put(new ll(), dkVar.f36494c);
            }
            if (dkVar.f36495d != null) {
                hashMap.put(new lx(), dkVar.f36495d);
            }
            if (dkVar.f36496e != null) {
                hashMap.put(new nx(), dkVar.f36496e);
            }
            if (dkVar.f36497f != null) {
                hashMap.put(new ny(), dkVar.f36497f);
            }
            if (dkVar.f36498g != null) {
                hashMap.put(new oq(), dkVar.f36498g);
            }
            if (dkVar.f36499h != null) {
                hashMap.put(new ov(), dkVar.f36499h);
            }
            if (dkVar.f36500i != null) {
                hashMap.put(new th(), dkVar.f36500i);
            }
            return new C11253b(this.f36491a, hashMap);
        }
    }

    private dk() {
    }

    /* renamed from: a */
    public static C9044a m44687a() {
        return new C9044a();
    }

    public final DescriptorFactory<C11253b, dk> getDescriptorFactory() {
        return new C11254c();
    }
}
