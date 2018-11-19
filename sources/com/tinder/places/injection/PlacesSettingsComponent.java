package com.tinder.places.injection;

import com.tinder.places.main.view.PlacesPinDropView;
import com.tinder.places.settings.activity.PlacesSettingsActivity;
import com.tinder.places.settings.view.EditablePlacesRecyclerView;
import com.tinder.places.settings.view.PlacesSettingsView;
import com.tinder.scope.ActivityScope;
import dagger.BindsInstance;
import dagger.Subcomponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Subcomponent(modules = {C10213b.class, C10212a.class})
@ActivityScope
public interface PlacesSettingsComponent {

    @dagger.Subcomponent.Builder
    public interface Builder {
        PlacesSettingsComponent build();

        @BindsInstance
        Builder placesSettingsActivity(PlacesSettingsActivity placesSettingsActivity);
    }

    void inject(@Nullable PlacesPinDropView placesPinDropView);

    void inject(@NotNull PlacesSettingsActivity placesSettingsActivity);

    void inject(@NotNull EditablePlacesRecyclerView editablePlacesRecyclerView);

    void inject(@NotNull PlacesSettingsView placesSettingsView);
}
