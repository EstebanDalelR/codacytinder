package com.tinder.places.injection;

import com.tinder.domain.places.PlacesRepository;
import com.tinder.places.carousel.adapter.PlacesCarouselAdapter;
import com.tinder.places.p311f.C12337b;
import com.tinder.places.provider.SelectedPlaceProvider;
import com.tinder.scope.ActivityScope;
import dagger.Module;
import dagger.Provides;
import java.util.Arrays;
import java.util.List;

@Module
/* renamed from: com.tinder.places.injection.b */
public class C10213b {
    @Provides
    /* renamed from: a */
    PlacesCarouselAdapter m41532a() {
        return new PlacesCarouselAdapter();
    }

    @Provides
    /* renamed from: a */
    C12337b m41533a(PlacesRepository placesRepository) {
        return new C12337b(placesRepository);
    }

    @ActivityScope
    @Provides
    /* renamed from: b */
    SelectedPlaceProvider m41534b() {
        return new SelectedPlaceProvider();
    }

    @Place
    @Provides
    /* renamed from: c */
    List<String> m41535c() {
        return Arrays.asList(new String[]{"cocktail-bar", "outdoor", "burgers", "ice-cream", "entertainment"});
    }
}
