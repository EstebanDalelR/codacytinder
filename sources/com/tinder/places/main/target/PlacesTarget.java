package com.tinder.places.main.target;

import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J \u0010\n\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lcom/tinder/places/main/target/PlacesTarget;", "", "clearDisabledView", "", "clearErrorView", "hideLoadingMap", "showDisabledView", "showErrorDialog", "exception", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "showErrorView", "retryAction", "Lkotlin/Function0;", "showLoadingMap", "showOnboarding", "showPlacesSettings", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface PlacesTarget {
    void clearDisabledView();

    void clearErrorView();

    void hideLoadingMap();

    void showDisabledView();

    void showErrorDialog(@Nullable PlacesApiException placesApiException);

    void showErrorView(@Nullable PlacesApiException placesApiException, @NotNull Function0<C15813i> function0);

    void showLoadingMap();

    void showOnboarding();

    void showPlacesSettings();
}
