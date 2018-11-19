package com.tinder.data.database;

import android.app.Application;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.database.d */
public final class C12855d implements Factory<C8644g> {
    /* renamed from: a */
    private final C8643b f41299a;
    /* renamed from: b */
    private final Provider<Application> f41300b;

    public /* synthetic */ Object get() {
        return m50483a();
    }

    public C12855d(C8643b c8643b, Provider<Application> provider) {
        this.f41299a = c8643b;
        this.f41300b = provider;
    }

    /* renamed from: a */
    public C8644g m50483a() {
        return C12855d.m50481a(this.f41299a, this.f41300b);
    }

    /* renamed from: a */
    public static C8644g m50481a(C8643b c8643b, Provider<Application> provider) {
        return C12855d.m50480a(c8643b, (Application) provider.get());
    }

    /* renamed from: b */
    public static C12855d m50482b(C8643b c8643b, Provider<Application> provider) {
        return new C12855d(c8643b, provider);
    }

    /* renamed from: a */
    public static C8644g m50480a(C8643b c8643b, Application application) {
        return (C8644g) C15521i.a(c8643b.m36801a(application), "Cannot return null from a non-@Nullable @Provides method");
    }
}
