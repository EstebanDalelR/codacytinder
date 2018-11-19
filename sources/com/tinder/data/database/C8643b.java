package com.tinder.data.database;

import android.app.Application;
import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqlbrite.SqlBrite;
import com.squareup.sqlbrite.SqlBrite.C6121a;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import rx.schedulers.Schedulers;

@Module
/* renamed from: com.tinder.data.database.b */
public class C8643b {
    @Singleton
    @Provides
    /* renamed from: a */
    C8644g m36801a(Application application) {
        return new C8644g(application);
    }

    @Singleton
    @DBv2
    @Provides
    /* renamed from: a */
    SqlBrite m36800a() {
        return new C6121a().a();
    }

    @Singleton
    @DBv2
    @Provides
    /* renamed from: a */
    BriteDatabase m36799a(@DBv2 SqlBrite sqlBrite, C8644g c8644g) {
        return sqlBrite.a(c8644g, Schedulers.io());
    }

    @Provides
    /* renamed from: a */
    C8645h m36802a(@DBv2 BriteDatabase briteDatabase) {
        return C8645h.m36875a(briteDatabase);
    }
}
