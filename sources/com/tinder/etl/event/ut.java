package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ut implements EtlEvent {
    /* renamed from: a */
    private Number f37573a;
    /* renamed from: b */
    private Boolean f37574b;
    /* renamed from: c */
    private Number f37575c;
    /* renamed from: d */
    private Boolean f37576d;
    /* renamed from: e */
    private String f37577e;
    /* renamed from: f */
    private String f37578f;
    /* renamed from: g */
    private Boolean f37579g;
    /* renamed from: h */
    private Number f37580h;
    /* renamed from: i */
    private Boolean f37581i;

    /* renamed from: com.tinder.etl.event.ut$a */
    public static class C9296a {
        /* renamed from: a */
        private ut f31384a;

        private C9296a() {
            this.f31384a = new ut();
        }

        /* renamed from: a */
        public final C9296a m38867a(Number number) {
            this.f31384a.f37573a = number;
            return this;
        }

        /* renamed from: a */
        public final C9296a m38866a(Boolean bool) {
            this.f31384a.f37574b = bool;
            return this;
        }

        /* renamed from: b */
        public final C9296a m38871b(Number number) {
            this.f31384a.f37575c = number;
            return this;
        }

        /* renamed from: a */
        public final C9296a m38868a(String str) {
            this.f31384a.f37577e = str;
            return this;
        }

        /* renamed from: b */
        public final C9296a m38872b(String str) {
            this.f31384a.f37578f = str;
            return this;
        }

        /* renamed from: b */
        public final C9296a m38870b(Boolean bool) {
            this.f31384a.f37579g = bool;
            return this;
        }

        /* renamed from: c */
        public final C9296a m38873c(Number number) {
            this.f31384a.f37580h = number;
            return this;
        }

        /* renamed from: a */
        public ut m38869a() {
            return this.f31384a;
        }
    }

    /* renamed from: com.tinder.etl.event.ut$b */
    public class C11524b extends fw {
        /* renamed from: a */
        final /* synthetic */ ut f37571a;

        /* renamed from: a */
        public String mo10346a() {
            return "Recs.Share";
        }

        public C11524b(ut utVar, Map<EtlField<?>, Object> map) {
            this.f37571a = utVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ut$c */
    private final class C11525c implements DescriptorFactory<C11524b, ut> {
        /* renamed from: a */
        final /* synthetic */ ut f37572a;

        private C11525c(ut utVar) {
            this.f37572a = utVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46559a((ut) etlEvent);
        }

        /* renamed from: a */
        public final C11524b m46559a(ut utVar) {
            Map hashMap = new HashMap();
            if (utVar.f37573a != null) {
                hashMap.put(new bu(), utVar.f37573a);
            }
            if (utVar.f37574b != null) {
                hashMap.put(new ev(), utVar.f37574b);
            }
            if (utVar.f37575c != null) {
                hashMap.put(new gu(), utVar.f37575c);
            }
            if (utVar.f37576d != null) {
                hashMap.put(new hj(), utVar.f37576d);
            }
            if (utVar.f37577e != null) {
                hashMap.put(new mq(), utVar.f37577e);
            }
            if (utVar.f37578f != null) {
                hashMap.put(new ov(), utVar.f37578f);
            }
            if (utVar.f37579g != null) {
                hashMap.put(new tu(), utVar.f37579g);
            }
            if (utVar.f37580h != null) {
                hashMap.put(new vm(), utVar.f37580h);
            }
            if (utVar.f37581i != null) {
                hashMap.put(new zy(), utVar.f37581i);
            }
            return new C11524b(this.f37572a, hashMap);
        }
    }

    private ut() {
    }

    /* renamed from: a */
    public static C9296a m46560a() {
        return new C9296a();
    }

    public final DescriptorFactory<C11524b, ut> getDescriptorFactory() {
        return new C11525c();
    }
}
