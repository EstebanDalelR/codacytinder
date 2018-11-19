package com.tinder.common.log;

import com.tinder.common.p076a.C2640a;
import java.util.HashSet;
import java.util.Set;
import p000a.p001a.C0001a;
import p000a.p001a.C0001a.C0000a;

/* renamed from: com.tinder.common.log.a */
public class C10681a implements LoggingInitializer {
    /* renamed from: a */
    private final Set<C0000a> f35021a;

    /* renamed from: com.tinder.common.log.a$a */
    public static class C8546a {
        /* renamed from: a */
        private final C10681a f30290a = new C10681a(new HashSet());

        /* renamed from: a */
        public C8546a m36529a(C0000a c0000a) {
            this.f30290a.f35021a.add(c0000a);
            return this;
        }

        /* renamed from: a */
        public C10681a m36530a() {
            C2640a.b(this.f30290a.f35021a.isEmpty() ^ 1, "Must supply at lease 1 Stetho Tree");
            return this.f30290a;
        }
    }

    private C10681a(Set<C0000a> set) {
        this.f35021a = set;
    }

    public void initialize() {
        for (C0000a a : this.f35021a) {
            C0001a.a(a);
        }
    }
}
