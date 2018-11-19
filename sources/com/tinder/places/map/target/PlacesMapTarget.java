package com.tinder.places.map.target;

import com.tinder.places.viewmodel.C14351c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0003H&J\u001a\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0016H&¨\u0006\u0017"}, d2 = {"Lcom/tinder/places/map/target/PlacesMapTarget;", "", "activatePin", "", "placeId", "", "activateRadar", "addPin", "pin", "Lcom/tinder/places/viewmodel/PlacePinViewModel;", "animatePinsFromTop", "enableMapInteraction", "hidePins", "raisePinAfterDelay", "removePin", "setInitialMapCoords", "latitude", "", "longitude", "showPins", "zoomOnPlace", "animated", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface PlacesMapTarget {
    void activatePin(@NotNull String str);

    void activateRadar(@NotNull String str);

    void addPin(@NotNull C14351c c14351c);

    void animatePinsFromTop();

    void enableMapInteraction();

    void hidePins();

    void raisePinAfterDelay();

    void removePin(@NotNull String str);

    void setInitialMapCoords(double d, double d2);

    void showPins();

    void zoomOnPlace(@NotNull String str, boolean z);
}
