package com.tinder.places.injection;

import com.tinder.places.card.view.PlaceCardAlternativesView;
import com.tinder.places.card.view.PlaceCardFrontView;
import com.tinder.places.card.view.PlaceCardView;
import com.tinder.places.card.view.PlaceRecTeasersView;
import com.tinder.places.carousel.view.PlacesCarouselLoadingContainerView;
import com.tinder.places.carousel.view.PlacesCarouselView;
import com.tinder.places.main.view.C12370a;
import com.tinder.places.main.view.PlacesPinDropView;
import com.tinder.places.main.view.PlacesView;
import com.tinder.places.map.view.C14217c;
import com.tinder.places.recs.view.PlacesUserRecCardView;
import com.tinder.scope.ActivityScope;
import com.tinder.views.grid.GridUserRecCardHeadlineView;
import dagger.BindsInstance;
import dagger.Subcomponent;
import org.jetbrains.annotations.NotNull;

@Subcomponent(modules = {C10213b.class, C10215g.class, C10212a.class})
@ActivityScope
public interface PlacesComponent {

    @dagger.Subcomponent.Builder
    public interface Builder {
        PlacesComponent build();

        @BindsInstance
        Builder placesView(PlacesView placesView);
    }

    void inject(@NotNull PlaceCardAlternativesView placeCardAlternativesView);

    void inject(@NotNull PlaceCardFrontView placeCardFrontView);

    void inject(@NotNull PlaceCardView placeCardView);

    void inject(@NotNull PlaceRecTeasersView placeRecTeasersView);

    void inject(@NotNull PlacesCarouselLoadingContainerView placesCarouselLoadingContainerView);

    void inject(@NotNull PlacesCarouselView placesCarouselView);

    void inject(@NotNull PlacesPinDropView placesPinDropView);

    void inject(@NotNull PlacesView placesView);

    void inject(@NotNull C12370a c12370a);

    void inject(@NotNull C14217c c14217c);

    void inject(@NotNull PlacesUserRecCardView placesUserRecCardView);

    void inject(@NotNull GridUserRecCardHeadlineView gridUserRecCardHeadlineView);
}
