package com.tinder.places.injection;

import com.tinder.domain.recs.model.RecSource;
import com.tinder.places.card.view.C14184e;
import com.tinder.places.recs.view.PlacesRecsView;
import com.tinder.scope.ActivityScope;
import com.tinder.views.grid.GridUserRecCardHeadlineView;
import com.tinder.views.grid.GridUserRecCardView;
import dagger.BindsInstance;
import dagger.Subcomponent;
import org.jetbrains.annotations.NotNull;

@Subcomponent(modules = {C10215g.class})
@ActivityScope
public interface PlacesRecsComponent {

    @dagger.Subcomponent.Builder
    public interface Builder {
        @BindsInstance
        Builder bindRecSource(RecSource recSource);

        PlacesRecsComponent build();
    }

    void inject(@NotNull C14184e c14184e);

    void inject(PlacesRecsView placesRecsView);

    void inject(GridUserRecCardHeadlineView gridUserRecCardHeadlineView);

    void inject(GridUserRecCardView gridUserRecCardView);
}
