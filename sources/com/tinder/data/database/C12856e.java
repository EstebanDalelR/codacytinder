package com.tinder.data.database;

import com.squareup.sqlbrite.SqlBrite;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.data.database.e */
public final class C12856e implements Factory<SqlBrite> {
    /* renamed from: a */
    private final C8643b f41301a;

    public /* synthetic */ Object get() {
        return m50487a();
    }

    public C12856e(C8643b c8643b) {
        this.f41301a = c8643b;
    }

    /* renamed from: a */
    public SqlBrite m50487a() {
        return C12856e.m50484a(this.f41301a);
    }

    /* renamed from: a */
    public static SqlBrite m50484a(C8643b c8643b) {
        return C12856e.m50486c(c8643b);
    }

    /* renamed from: b */
    public static C12856e m50485b(C8643b c8643b) {
        return new C12856e(c8643b);
    }

    /* renamed from: c */
    public static SqlBrite m50486c(C8643b c8643b) {
        return (SqlBrite) C15521i.a(c8643b.m36800a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
