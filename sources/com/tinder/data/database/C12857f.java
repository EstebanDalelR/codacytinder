package com.tinder.data.database;

import com.squareup.sqlbrite.BriteDatabase;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.database.f */
public final class C12857f implements Factory<C8645h> {
    /* renamed from: a */
    private final C8643b f41302a;
    /* renamed from: b */
    private final Provider<BriteDatabase> f41303b;

    public /* synthetic */ Object get() {
        return m50491a();
    }

    public C12857f(C8643b c8643b, Provider<BriteDatabase> provider) {
        this.f41302a = c8643b;
        this.f41303b = provider;
    }

    /* renamed from: a */
    public C8645h m50491a() {
        return C12857f.m50489a(this.f41302a, this.f41303b);
    }

    /* renamed from: a */
    public static C8645h m50489a(C8643b c8643b, Provider<BriteDatabase> provider) {
        return C12857f.m50488a(c8643b, (BriteDatabase) provider.get());
    }

    /* renamed from: b */
    public static C12857f m50490b(C8643b c8643b, Provider<BriteDatabase> provider) {
        return new C12857f(c8643b, provider);
    }

    /* renamed from: a */
    public static C8645h m50488a(C8643b c8643b, BriteDatabase briteDatabase) {
        return (C8645h) C15521i.a(c8643b.m36802a(briteDatabase), "Cannot return null from a non-@Nullable @Provides method");
    }
}
