package com.tinder.places.card.target;

import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\u0017\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0003H&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH&J\b\u0010\u0015\u001a\u00020\u0003H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J3\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u001dH&J\b\u0010!\u001a\u00020\u0003H&J\b\u0010\"\u001a\u00020\u0003H&¨\u0006#"}, d2 = {"Lcom/tinder/places/card/target/PlacesCardTarget;", "", "animateFromBackToAlternatives", "", "animateFromBackToRemoveMeFromHere", "bindTeasers", "teasers", "", "", "disableCardInteraction", "enableCardInteraction", "flipBackwards", "setNoRecsExistState", "setRecsErrorState", "code", "", "(Ljava/lang/Integer;)V", "setRecsLoadingState", "setVisitorInfo", "totalVisitors", "newVisitors", "showBack", "showErrorDialog", "throwable", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "showRemoveDialog", "isPermanent", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "confirmed", "startRemoveLoadingState", "stopRemoveLoadingState", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface PlacesCardTarget {
    void animateFromBackToAlternatives();

    void animateFromBackToRemoveMeFromHere();

    void bindTeasers(@NotNull List<String> list);

    void disableCardInteraction();

    void enableCardInteraction();

    void flipBackwards();

    void setNoRecsExistState();

    void setRecsErrorState(@Nullable Integer num);

    void setRecsLoadingState();

    void setVisitorInfo(int i, int i2);

    void showBack();

    void showErrorDialog(@NotNull PlacesApiException placesApiException);

    void showRemoveDialog(boolean z, @NotNull Function1<? super Boolean, C15813i> function1);

    void startRemoveLoadingState();

    void stopRemoveLoadingState();
}
