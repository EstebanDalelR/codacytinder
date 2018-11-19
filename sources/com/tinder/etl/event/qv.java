package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class qv implements EtlEvent {
    /* renamed from: a */
    private String f37228a;
    /* renamed from: b */
    private String f37229b;
    /* renamed from: c */
    private Number f37230c;

    /* renamed from: com.tinder.etl.event.qv$a */
    public static class C9222a {
        /* renamed from: a */
        private qv f31347a;

        private C9222a() {
            this.f31347a = new qv();
        }

        /* renamed from: a */
        public final C9222a m38658a(String str) {
            this.f31347a.f37228a = str;
            return this;
        }

        /* renamed from: b */
        public final C9222a m38660b(String str) {
            this.f31347a.f37229b = str;
            return this;
        }

        /* renamed from: a */
        public final C9222a m38657a(Number number) {
            this.f31347a.f37230c = number;
            return this;
        }

        /* renamed from: a */
        public qv m38659a() {
            return this.f31347a;
        }
    }

    /* renamed from: com.tinder.etl.event.qv$b */
    public class C11446b extends fw {
        /* renamed from: a */
        final /* synthetic */ qv f37226a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.ViewRec";
        }

        public C11446b(qv qvVar, Map<EtlField<?>, Object> map) {
            this.f37226a = qvVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.qv$c */
    private final class C11447c implements DescriptorFactory<C11446b, qv> {
        /* renamed from: a */
        final /* synthetic */ qv f37227a;

        private C11447c(qv qvVar) {
            this.f37227a = qvVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46005a((qv) etlEvent);
        }

        /* renamed from: a */
        public final C11446b m46005a(qv qvVar) {
            Map hashMap = new HashMap();
            if (qvVar.f37228a != null) {
                hashMap.put(new ov(), qvVar.f37228a);
            }
            if (qvVar.f37229b != null) {
                hashMap.put(new qb(), qvVar.f37229b);
            }
            if (qvVar.f37230c != null) {
                hashMap.put(new qz(), qvVar.f37230c);
            }
            return new C11446b(this.f37227a, hashMap);
        }
    }

    private qv() {
    }

    /* renamed from: a */
    public static C9222a m46006a() {
        return new C9222a();
    }

    public final DescriptorFactory<C11446b, qv> getDescriptorFactory() {
        return new C11447c();
    }
}
