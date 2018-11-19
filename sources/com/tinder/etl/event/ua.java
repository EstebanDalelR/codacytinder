package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ua implements EtlEvent {
    /* renamed from: a */
    private Number f37402a;
    /* renamed from: b */
    private String f37403b;
    /* renamed from: c */
    private String f37404c;
    /* renamed from: d */
    private Number f37405d;
    /* renamed from: e */
    private Number f37406e;
    /* renamed from: f */
    private String f37407f;

    /* renamed from: com.tinder.etl.event.ua$a */
    public static class C9276a {
        /* renamed from: a */
        private ua f31374a;

        private C9276a() {
            this.f31374a = new ua();
        }

        /* renamed from: a */
        public final C9276a m38768a(Number number) {
            this.f31374a.f37402a = number;
            return this;
        }

        /* renamed from: a */
        public final C9276a m38769a(String str) {
            this.f31374a.f37403b = str;
            return this;
        }

        /* renamed from: b */
        public final C9276a m38771b(String str) {
            this.f31374a.f37407f = str;
            return this;
        }

        /* renamed from: a */
        public ua m38770a() {
            return this.f31374a;
        }
    }

    /* renamed from: com.tinder.etl.event.ua$b */
    public class C11504b extends fw {
        /* renamed from: a */
        final /* synthetic */ ua f37400a;

        /* renamed from: a */
        public String mo10346a() {
            return "Recs.OpenInstagram";
        }

        public C11504b(ua uaVar, Map<EtlField<?>, Object> map) {
            this.f37400a = uaVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ua$c */
    private final class C11505c implements DescriptorFactory<C11504b, ua> {
        /* renamed from: a */
        final /* synthetic */ ua f37401a;

        private C11505c(ua uaVar) {
            this.f37401a = uaVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46290a((ua) etlEvent);
        }

        /* renamed from: a */
        public final C11504b m46290a(ua uaVar) {
            Map hashMap = new HashMap();
            if (uaVar.f37402a != null) {
                hashMap.put(new hc(), uaVar.f37402a);
            }
            if (uaVar.f37403b != null) {
                hashMap.put(new jj(), uaVar.f37403b);
            }
            if (uaVar.f37404c != null) {
                hashMap.put(new kb(), uaVar.f37404c);
            }
            if (uaVar.f37405d != null) {
                hashMap.put(new nx(), uaVar.f37405d);
            }
            if (uaVar.f37406e != null) {
                hashMap.put(new ny(), uaVar.f37406e);
            }
            if (uaVar.f37407f != null) {
                hashMap.put(new ov(), uaVar.f37407f);
            }
            return new C11504b(this.f37401a, hashMap);
        }
    }

    private ua() {
    }

    /* renamed from: a */
    public static C9276a m46291a() {
        return new C9276a();
    }

    public final DescriptorFactory<C11504b, ua> getDescriptorFactory() {
        return new C11505c();
    }
}
