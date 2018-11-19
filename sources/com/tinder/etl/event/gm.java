package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class gm implements EtlEvent {
    /* renamed from: a */
    private String f36739a;
    /* renamed from: b */
    private String f36740b;

    /* renamed from: com.tinder.etl.event.gm$a */
    public static class C9092a {
        /* renamed from: a */
        private gm f31282a;

        private C9092a() {
            this.f31282a = new gm();
        }

        /* renamed from: a */
        public final C9092a m38281a(String str) {
            this.f31282a.f36739a = str;
            return this;
        }

        /* renamed from: b */
        public final C9092a m38283b(String str) {
            this.f31282a.f36740b = str;
            return this;
        }

        /* renamed from: a */
        public gm m38282a() {
            return this.f31282a;
        }
    }

    /* renamed from: com.tinder.etl.event.gm$b */
    public class C11305b extends fw {
        /* renamed from: a */
        final /* synthetic */ gm f36737a;

        /* renamed from: a */
        public String mo10346a() {
            return "Feed.Top";
        }

        public C11305b(gm gmVar, Map<EtlField<?>, Object> map) {
            this.f36737a = gmVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.gm$c */
    private final class C11306c implements DescriptorFactory<C11305b, gm> {
        /* renamed from: a */
        final /* synthetic */ gm f36738a;

        private C11306c(gm gmVar) {
            this.f36738a = gmVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45140a((gm) etlEvent);
        }

        /* renamed from: a */
        public final C11305b m45140a(gm gmVar) {
            Map hashMap = new HashMap();
            if (gmVar.f36739a != null) {
                hashMap.put(new gk(), gmVar.f36739a);
            }
            if (gmVar.f36740b != null) {
                hashMap.put(new wy(), gmVar.f36740b);
            }
            return new C11305b(this.f36738a, hashMap);
        }
    }

    private gm() {
    }

    /* renamed from: a */
    public static C9092a m45141a() {
        return new C9092a();
    }

    public final DescriptorFactory<C11305b, gm> getDescriptorFactory() {
        return new C11306c();
    }
}
