package com.tinder.places.injection;

import com.tinder.places.provider.SelectedPlaceProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.places.injection.f */
public final class C13580f implements Factory<SelectedPlaceProvider> {
    /* renamed from: a */
    private final C10213b f43322a;

    public /* synthetic */ Object get() {
        return m53011a();
    }

    public C13580f(C10213b c10213b) {
        this.f43322a = c10213b;
    }

    /* renamed from: a */
    public SelectedPlaceProvider m53011a() {
        return C13580f.m53008a(this.f43322a);
    }

    /* renamed from: a */
    public static SelectedPlaceProvider m53008a(C10213b c10213b) {
        return C13580f.m53010c(c10213b);
    }

    /* renamed from: b */
    public static C13580f m53009b(C10213b c10213b) {
        return new C13580f(c10213b);
    }

    /* renamed from: c */
    public static SelectedPlaceProvider m53010c(C10213b c10213b) {
        return (SelectedPlaceProvider) C15521i.a(c10213b.m41534b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
