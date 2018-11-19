package com.tinder.app.dagger.module.main;

import android.arch.lifecycle.LifecycleObserver;
import com.tinder.places.PlacesMainActivityLifecycleObserver;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.o */
public final class C12514o implements Factory<LifecycleObserver> {
    /* renamed from: a */
    private final C8251a f40338a;
    /* renamed from: b */
    private final Provider<PlacesMainActivityLifecycleObserver> f40339b;

    public /* synthetic */ Object get() {
        return m49252a();
    }

    public C12514o(C8251a c8251a, Provider<PlacesMainActivityLifecycleObserver> provider) {
        this.f40338a = c8251a;
        this.f40339b = provider;
    }

    /* renamed from: a */
    public LifecycleObserver m49252a() {
        return C12514o.m49250a(this.f40338a, this.f40339b);
    }

    /* renamed from: a */
    public static LifecycleObserver m49250a(C8251a c8251a, Provider<PlacesMainActivityLifecycleObserver> provider) {
        return C12514o.m49249a(c8251a, (PlacesMainActivityLifecycleObserver) provider.get());
    }

    /* renamed from: b */
    public static C12514o m49251b(C8251a c8251a, Provider<PlacesMainActivityLifecycleObserver> provider) {
        return new C12514o(c8251a, provider);
    }

    /* renamed from: a */
    public static LifecycleObserver m49249a(C8251a c8251a, PlacesMainActivityLifecycleObserver placesMainActivityLifecycleObserver) {
        return (LifecycleObserver) C15521i.a(c8251a.m35200a(placesMainActivityLifecycleObserver), "Cannot return null from a non-@Nullable @Provides method");
    }
}
