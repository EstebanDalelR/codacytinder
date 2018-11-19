package com.tinder.places.injection;

import com.tinder.places.main.view.PlacesPinDropView;
import com.tinder.places.onboarding.C12394a;
import com.tinder.places.onboarding.C12399d;
import com.tinder.places.onboarding.C12401f;
import com.tinder.places.onboarding.C12403h;
import com.tinder.places.onboarding.PlacesOnboardingActivity;
import com.tinder.places.recs.view.PlacesUserRecCardView;
import com.tinder.scope.ActivityScope;
import com.tinder.views.grid.GridUserRecCardHeadlineView;
import dagger.BindsInstance;
import dagger.Subcomponent;
import org.jetbrains.annotations.NotNull;

@Subcomponent(modules = {C10213b.class, C10215g.class, C10212a.class})
@ActivityScope
public interface PlacesOnboardingComponent {

    @dagger.Subcomponent.Builder
    public interface Builder {
        PlacesOnboardingComponent build();

        @BindsInstance
        Builder placesOnboardingActivity(PlacesOnboardingActivity placesOnboardingActivity);
    }

    void inject(@NotNull PlacesPinDropView placesPinDropView);

    void inject(@NotNull PlacesOnboardingActivity placesOnboardingActivity);

    void inject(@NotNull C12394a c12394a);

    void inject(@NotNull C12399d c12399d);

    void inject(@NotNull C12401f c12401f);

    void inject(@NotNull C12403h c12403h);

    void inject(@NotNull PlacesUserRecCardView placesUserRecCardView);

    void inject(@NotNull GridUserRecCardHeadlineView gridUserRecCardHeadlineView);
}
