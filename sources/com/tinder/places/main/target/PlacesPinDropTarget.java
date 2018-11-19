package com.tinder.places.main.target;

import com.tinder.places.viewmodel.C14351c;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, d2 = {"Lcom/tinder/places/main/target/PlacesPinDropTarget;", "", "bindActivatedPins", "", "pins", "", "Lcom/tinder/places/viewmodel/PlacePinViewModel;", "bindDeactivatedPins", "cancelAllAnimations", "dropPins", "hideMap", "showMap", "stopPinsBouncing", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface PlacesPinDropTarget {
    void bindActivatedPins(@NotNull List<C14351c> list);

    void bindDeactivatedPins(@NotNull List<C14351c> list);

    void cancelAllAnimations();

    void dropPins();

    void hideMap();

    void showMap();

    void stopPinsBouncing();
}
