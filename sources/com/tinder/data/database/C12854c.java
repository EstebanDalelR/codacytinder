package com.tinder.data.database;

import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqlbrite.SqlBrite;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.database.c */
public final class C12854c implements Factory<BriteDatabase> {
    /* renamed from: a */
    private final C8643b f41296a;
    /* renamed from: b */
    private final Provider<SqlBrite> f41297b;
    /* renamed from: c */
    private final Provider<C8644g> f41298c;

    public /* synthetic */ Object get() {
        return m50479a();
    }

    public C12854c(C8643b c8643b, Provider<SqlBrite> provider, Provider<C8644g> provider2) {
        this.f41296a = c8643b;
        this.f41297b = provider;
        this.f41298c = provider2;
    }

    /* renamed from: a */
    public BriteDatabase m50479a() {
        return C12854c.m50477a(this.f41296a, this.f41297b, this.f41298c);
    }

    /* renamed from: a */
    public static BriteDatabase m50477a(C8643b c8643b, Provider<SqlBrite> provider, Provider<C8644g> provider2) {
        return C12854c.m50476a(c8643b, (SqlBrite) provider.get(), (C8644g) provider2.get());
    }

    /* renamed from: b */
    public static C12854c m50478b(C8643b c8643b, Provider<SqlBrite> provider, Provider<C8644g> provider2) {
        return new C12854c(c8643b, provider, provider2);
    }

    /* renamed from: a */
    public static BriteDatabase m50476a(C8643b c8643b, SqlBrite sqlBrite, C8644g c8644g) {
        return (BriteDatabase) C15521i.a(c8643b.m36799a(sqlBrite, c8644g), "Cannot return null from a non-@Nullable @Provides method");
    }
}
