package com.tinder.data.match;

import com.squareup.sqlbrite.BriteDatabase;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.match.u */
public final class C12936u implements Factory<C8676s> {
    /* renamed from: a */
    private final Provider<BriteDatabase> f41452a;

    public /* synthetic */ Object get() {
        return m50621a();
    }

    public C12936u(Provider<BriteDatabase> provider) {
        this.f41452a = provider;
    }

    /* renamed from: a */
    public C8676s m50621a() {
        return C12936u.m50619a(this.f41452a);
    }

    /* renamed from: a */
    public static C8676s m50619a(Provider<BriteDatabase> provider) {
        return new C8676s((BriteDatabase) provider.get());
    }

    /* renamed from: b */
    public static C12936u m50620b(Provider<BriteDatabase> provider) {
        return new C12936u(provider);
    }
}
