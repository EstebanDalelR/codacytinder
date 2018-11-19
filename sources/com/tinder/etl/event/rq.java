package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class rq implements EtlEvent {
    /* renamed from: a */
    private String f37256a;
    /* renamed from: b */
    private String f37257b;

    /* renamed from: com.tinder.etl.event.rq$a */
    public static class C9232a {
        /* renamed from: a */
        private rq f31352a;

        private C9232a() {
            this.f31352a = new rq();
        }

        /* renamed from: a */
        public final C9232a m38677a(String str) {
            this.f31352a.f37256a = str;
            return this;
        }

        /* renamed from: b */
        public final C9232a m38679b(String str) {
            this.f31352a.f37257b = str;
            return this;
        }

        /* renamed from: a */
        public rq m38678a() {
            return this.f31352a;
        }
    }

    /* renamed from: com.tinder.etl.event.rq$b */
    public class C11457b extends fw {
        /* renamed from: a */
        final /* synthetic */ rq f37254a;

        /* renamed from: a */
        public String mo10346a() {
            return "Profile.ChangeSchool";
        }

        public C11457b(rq rqVar, Map<EtlField<?>, Object> map) {
            this.f37254a = rqVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.rq$c */
    private final class C11458c implements DescriptorFactory<C11457b, rq> {
        /* renamed from: a */
        final /* synthetic */ rq f37255a;

        private C11458c(rq rqVar) {
            this.f37255a = rqVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46053a((rq) etlEvent);
        }

        /* renamed from: a */
        public final C11457b m46053a(rq rqVar) {
            Map hashMap = new HashMap();
            if (rqVar.f37256a != null) {
                hashMap.put(new ri(), rqVar.f37256a);
            }
            if (rqVar.f37257b != null) {
                hashMap.put(new vj(), rqVar.f37257b);
            }
            return new C11457b(this.f37255a, hashMap);
        }
    }

    private rq() {
    }

    /* renamed from: a */
    public static C9232a m46054a() {
        return new C9232a();
    }

    public final DescriptorFactory<C11457b, rq> getDescriptorFactory() {
        return new C11458c();
    }
}
