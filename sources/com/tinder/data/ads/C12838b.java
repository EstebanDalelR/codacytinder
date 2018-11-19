package com.tinder.data.ads;

import com.squareup.sqlbrite.BriteDatabase;
import com.tinder.data.match.an;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.ads.b */
public final class C12838b implements Factory<an> {
    /* renamed from: a */
    private final C8618a f41271a;
    /* renamed from: b */
    private final Provider<BriteDatabase> f41272b;

    public /* synthetic */ Object get() {
        return m50427a();
    }

    public C12838b(C8618a c8618a, Provider<BriteDatabase> provider) {
        this.f41271a = c8618a;
        this.f41272b = provider;
    }

    /* renamed from: a */
    public an m50427a() {
        return C12838b.m50425a(this.f41271a, this.f41272b);
    }

    /* renamed from: a */
    public static an m50425a(C8618a c8618a, Provider<BriteDatabase> provider) {
        return C12838b.m50424a(c8618a, (BriteDatabase) provider.get());
    }

    /* renamed from: b */
    public static C12838b m50426b(C8618a c8618a, Provider<BriteDatabase> provider) {
        return new C12838b(c8618a, provider);
    }

    /* renamed from: a */
    public static an m50424a(C8618a c8618a, BriteDatabase briteDatabase) {
        return (an) C15521i.a(c8618a.m36764a(briteDatabase), "Cannot return null from a non-@Nullable @Provides method");
    }
}
