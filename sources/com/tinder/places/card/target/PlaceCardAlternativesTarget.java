package com.tinder.places.card.target;

import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.domain.places.model.Place.Alternative;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J&\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J\u001e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&¨\u0006\u001e"}, d2 = {"Lcom/tinder/places/card/target/PlaceCardAlternativesTarget;", "", "animateInAlternatives", "", "fadeDuration", "", "slideDuration", "animateInEmptyState", "animateOutAlternatives", "slidingDoneCallback", "Lkotlin/Function0;", "animateOutEmptyState", "fadeDoneCallback", "bindButtonName", "position", "", "bindNoneOfThese", "hideLoadingState", "hideNoOptionsText", "setTotalAlternatives", "count", "showCorrectionDialog", "alternative", "Lcom/tinder/domain/places/model/Place$Alternative;", "showErrorDialog", "throwable", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "showLoadingState", "showNoAlternativeState", "showNoneOfTheseDialog", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface PlaceCardAlternativesTarget {
    void animateInAlternatives(long j, long j2);

    void animateInEmptyState(long j);

    void animateOutAlternatives(long j, long j2, @NotNull Function0<C15813i> function0);

    void animateOutEmptyState(long j, @NotNull Function0<C15813i> function0);

    void bindButtonName(int i);

    void bindNoneOfThese(int i);

    void hideLoadingState();

    void hideNoOptionsText();

    void setTotalAlternatives(int i);

    void showCorrectionDialog(@NotNull Alternative alternative);

    void showErrorDialog(@NotNull PlacesApiException placesApiException);

    void showLoadingState();

    void showNoAlternativeState();

    void showNoneOfTheseDialog();
}
