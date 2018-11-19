package com.tinder.places.onboarding.target;

import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.domain.places.model.PlacesOnboardingConfig;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J \u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/tinder/places/onboarding/target/PlacesOnboardingTarget;", "", "bind", "", "config", "Lcom/tinder/domain/places/model/PlacesOnboardingConfig;", "bindShortOnboarding", "cancelOnboarding", "clearErrorView", "completeOnboarding", "setupPageEnteringObserver", "showErrorView", "exception", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "retryAction", "Lkotlin/Function0;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface PlacesOnboardingTarget {
    void bind(@NotNull PlacesOnboardingConfig placesOnboardingConfig);

    void bindShortOnboarding(@NotNull PlacesOnboardingConfig placesOnboardingConfig);

    void cancelOnboarding();

    void clearErrorView();

    void completeOnboarding();

    void setupPageEnteringObserver();

    void showErrorView(@Nullable PlacesApiException placesApiException, @NotNull Function0<C15813i> function0);
}
