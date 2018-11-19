package com.tinder.domain.places.provider;

import io.reactivex.C3959e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/tinder/domain/places/provider/PlacesOnboardingProgressProvider;", "", "observeOnboardingProgress", "Lio/reactivex/Observable;", "Lcom/tinder/domain/places/provider/PlacesOnboardingProgressProvider$OnboardingProgress;", "updateOnboardingProgress", "", "progress", "OnboardingProgress", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface PlacesOnboardingProgressProvider {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/places/provider/PlacesOnboardingProgressProvider$OnboardingProgress;", "", "(Ljava/lang/String;I)V", "NOT_STARTED", "IN_PROGRESS", "COMPLETE", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum OnboardingProgress {
    }

    @NotNull
    C3959e<OnboardingProgress> observeOnboardingProgress();

    void updateOnboardingProgress(@NotNull OnboardingProgress onboardingProgress);
}
