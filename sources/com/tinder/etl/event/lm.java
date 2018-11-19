package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class lm implements EtlEvent {
    /* renamed from: a */
    private String f37022a;
    /* renamed from: b */
    private String f37023b;
    /* renamed from: c */
    private Boolean f37024c;
    /* renamed from: d */
    private Boolean f37025d;

    /* renamed from: com.tinder.etl.event.lm$a */
    public static class C9160a {
        /* renamed from: a */
        private lm f31316a;

        private C9160a() {
            this.f31316a = new lm();
        }

        /* renamed from: a */
        public final C9160a m38516a(String str) {
            this.f31316a.f37023b = str;
            return this;
        }

        /* renamed from: a */
        public final C9160a m38515a(Boolean bool) {
            this.f31316a.f37024c = bool;
            return this;
        }

        /* renamed from: b */
        public final C9160a m38518b(Boolean bool) {
            this.f31316a.f37025d = bool;
            return this;
        }

        /* renamed from: a */
        public lm m38517a() {
            return this.f31316a;
        }
    }

    /* renamed from: com.tinder.etl.event.lm$b */
    public class C11379b extends fw {
        /* renamed from: a */
        final /* synthetic */ lm f37020a;

        /* renamed from: a */
        public String mo10346a() {
            return "Match.InviteFriends";
        }

        public C11379b(lm lmVar, Map<EtlField<?>, Object> map) {
            this.f37020a = lmVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.lm$c */
    private final class C11380c implements DescriptorFactory<C11379b, lm> {
        /* renamed from: a */
        final /* synthetic */ lm f37021a;

        private C11380c(lm lmVar) {
            this.f37021a = lmVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45657a((lm) etlEvent);
        }

        /* renamed from: a */
        public final C11379b m45657a(lm lmVar) {
            Map hashMap = new HashMap();
            if (lmVar.f37022a != null) {
                hashMap.put(new gb(), lmVar.f37022a);
            }
            if (lmVar.f37023b != null) {
                hashMap.put(new ll(), lmVar.f37023b);
            }
            if (lmVar.f37024c != null) {
                hashMap.put(new xh(), lmVar.f37024c);
            }
            if (lmVar.f37025d != null) {
                hashMap.put(new ev(), lmVar.f37025d);
            }
            return new C11379b(this.f37021a, hashMap);
        }
    }

    private lm() {
    }

    /* renamed from: a */
    public static C9160a m45658a() {
        return new C9160a();
    }

    public final DescriptorFactory<C11379b, lm> getDescriptorFactory() {
        return new C11380c();
    }
}
