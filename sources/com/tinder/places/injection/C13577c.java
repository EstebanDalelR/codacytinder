package com.tinder.places.injection;

import com.tinder.domain.places.PlacesRepository;
import com.tinder.places.p311f.C12337b;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.injection.c */
public final class C13577c implements Factory<C12337b> {
    /* renamed from: a */
    private final C10213b f43318a;
    /* renamed from: b */
    private final Provider<PlacesRepository> f43319b;

    public /* synthetic */ Object get() {
        return m53001a();
    }

    /* renamed from: a */
    public C12337b m53001a() {
        return C13577c.m53000a(this.f43318a, this.f43319b);
    }

    /* renamed from: a */
    public static C12337b m53000a(C10213b c10213b, Provider<PlacesRepository> provider) {
        return C13577c.m52999a(c10213b, (PlacesRepository) provider.get());
    }

    /* renamed from: a */
    public static C12337b m52999a(C10213b c10213b, PlacesRepository placesRepository) {
        return (C12337b) C15521i.a(c10213b.m41533a(placesRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
