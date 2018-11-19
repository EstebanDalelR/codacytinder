package com.tinder.places.carousel.target;

import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.places.card.view.PlaceCardView;
import com.tinder.places.viewmodel.C14349b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u0016"}, d2 = {"Lcom/tinder/places/carousel/target/PlacesCarouselTarget;", "", "add", "", "index", "", "fromPlace", "Lcom/tinder/places/viewmodel/PlaceCardViewModel;", "openPlaceRecs", "placeCard", "Lcom/tinder/places/card/view/PlaceCardView;", "pagerScrollEnabled", "enabled", "", "removePlace", "placeId", "", "set", "setSelectedItem", "showErrorDialog", "exception", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface PlacesCarouselTarget {
    void add(int i, @NotNull C14349b c14349b);

    void openPlaceRecs(@NotNull PlaceCardView placeCardView);

    void pagerScrollEnabled(boolean z);

    void removePlace(@NotNull String str);

    void set(int i, @NotNull C14349b c14349b);

    void setSelectedItem(@NotNull String str);

    void showErrorDialog(@NotNull PlacesApiException placesApiException);
}
