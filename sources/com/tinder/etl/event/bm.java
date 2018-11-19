package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class bm implements EtlEvent {
    /* renamed from: a */
    private String f36233a;
    /* renamed from: b */
    private String f36234b;
    /* renamed from: c */
    private String f36235c;
    /* renamed from: d */
    private Number f36236d;
    /* renamed from: e */
    private String f36237e;
    /* renamed from: f */
    private String f36238f;

    /* renamed from: com.tinder.etl.event.bm$a */
    public static class C8992a {
        /* renamed from: a */
        private bm f31231a;

        private C8992a() {
            this.f31231a = new bm();
        }

        /* renamed from: a */
        public final C8992a m37863a(String str) {
            this.f31231a.f36233a = str;
            return this;
        }

        /* renamed from: b */
        public final C8992a m37865b(String str) {
            this.f31231a.f36234b = str;
            return this;
        }

        /* renamed from: c */
        public final C8992a m37866c(String str) {
            this.f31231a.f36235c = str;
            return this;
        }

        /* renamed from: a */
        public final C8992a m37862a(Number number) {
            this.f31231a.f36236d = number;
            return this;
        }

        /* renamed from: d */
        public final C8992a m37867d(String str) {
            this.f31231a.f36237e = str;
            return this;
        }

        /* renamed from: e */
        public final C8992a m37868e(String str) {
            this.f31231a.f36238f = str;
            return this;
        }

        /* renamed from: a */
        public bm m37864a() {
            return this.f31231a;
        }
    }

    /* renamed from: com.tinder.etl.event.bm$b */
    public class C11199b extends fw {
        /* renamed from: a */
        final /* synthetic */ bm f36231a;

        /* renamed from: a */
        public String mo10346a() {
            return "Auth.VerifySMS";
        }

        public C11199b(bm bmVar, Map<EtlField<?>, Object> map) {
            this.f36231a = bmVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.bm$c */
    private final class C11200c implements DescriptorFactory<C11199b, bm> {
        /* renamed from: a */
        final /* synthetic */ bm f36232a;

        private C11200c(bm bmVar) {
            this.f36232a = bmVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44217a((bm) etlEvent);
        }

        /* renamed from: a */
        public final C11199b m44217a(bm bmVar) {
            Map hashMap = new HashMap();
            if (bmVar.f36233a != null) {
                hashMap.put(new bk(), bmVar.f36233a);
            }
            if (bmVar.f36234b != null) {
                hashMap.put(new bl(), bmVar.f36234b);
            }
            if (bmVar.f36235c != null) {
                hashMap.put(new bg(), bmVar.f36235c);
            }
            if (bmVar.f36236d != null) {
                hashMap.put(new bj(), bmVar.f36236d);
            }
            if (bmVar.f36237e != null) {
                hashMap.put(new bh(), bmVar.f36237e);
            }
            if (bmVar.f36238f != null) {
                hashMap.put(new bi(), bmVar.f36238f);
            }
            return new C11199b(this.f36232a, hashMap);
        }
    }

    private bm() {
    }

    /* renamed from: a */
    public static C8992a m44218a() {
        return new C8992a();
    }

    public final DescriptorFactory<C11199b, bm> getDescriptorFactory() {
        return new C11200c();
    }
}
