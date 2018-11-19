package com.tinder.places.injection;

import com.tinder.places.carousel.adapter.PlacesCarouselAdapter;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.places.injection.e */
public final class C13579e implements Factory<PlacesCarouselAdapter> {
    /* renamed from: a */
    private final C10213b f43321a;

    public /* synthetic */ Object get() {
        return m53007a();
    }

    /* renamed from: a */
    public PlacesCarouselAdapter m53007a() {
        return C13579e.m53005a(this.f43321a);
    }

    /* renamed from: a */
    public static PlacesCarouselAdapter m53005a(C10213b c10213b) {
        return C13579e.m53006b(c10213b);
    }

    /* renamed from: b */
    public static PlacesCarouselAdapter m53006b(C10213b c10213b) {
        return (PlacesCarouselAdapter) C15521i.a(c10213b.m41532a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
