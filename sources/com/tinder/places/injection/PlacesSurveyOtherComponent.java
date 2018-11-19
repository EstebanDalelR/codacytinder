package com.tinder.places.injection;

import com.tinder.places.settings.activity.PlacesSurveyOtherActivity;
import com.tinder.places.settings.view.PlacesSurveyOtherView;
import com.tinder.scope.ActivityScope;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Subcomponent
@ActivityScope
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/places/injection/PlacesSurveyOtherComponent;", "", "inject", "", "placesSurveyOtherView", "Lcom/tinder/places/settings/view/PlacesSurveyOtherView;", "Builder", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface PlacesSurveyOtherComponent {

    @dagger.Subcomponent.Builder
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/tinder/places/injection/PlacesSurveyOtherComponent$Builder;", "", "build", "Lcom/tinder/places/injection/PlacesSurveyOtherComponent;", "placesSurveyOtherActivity", "Lcom/tinder/places/settings/activity/PlacesSurveyOtherActivity;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface Builder {
        @NotNull
        PlacesSurveyOtherComponent build();

        @NotNull
        @BindsInstance
        Builder placesSurveyOtherActivity(@NotNull PlacesSurveyOtherActivity placesSurveyOtherActivity);
    }

    void inject(@NotNull PlacesSurveyOtherView placesSurveyOtherView);
}
