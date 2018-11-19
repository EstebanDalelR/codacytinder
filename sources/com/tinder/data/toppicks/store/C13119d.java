package com.tinder.data.toppicks.store;

import com.squareup.sqlbrite.BriteDatabase;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.toppicks.store.d */
public final class C13119d implements Factory<C8799c> {
    /* renamed from: a */
    private final Provider<BriteDatabase> f41745a;

    public /* synthetic */ Object get() {
        return m50992a();
    }

    public C13119d(Provider<BriteDatabase> provider) {
        this.f41745a = provider;
    }

    /* renamed from: a */
    public C8799c m50992a() {
        return C13119d.m50990a(this.f41745a);
    }

    /* renamed from: a */
    public static C8799c m50990a(Provider<BriteDatabase> provider) {
        return new C8799c((BriteDatabase) provider.get());
    }

    /* renamed from: b */
    public static C13119d m50991b(Provider<BriteDatabase> provider) {
        return new C13119d(provider);
    }
}
