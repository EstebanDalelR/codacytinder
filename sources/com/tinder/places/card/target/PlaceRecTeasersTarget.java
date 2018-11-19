package com.tinder.places.card.target;

import com.tinder.places.p312g.p313a.C10211a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0005H&¨\u0006\u0013"}, d2 = {"Lcom/tinder/places/card/target/PlaceRecTeasersTarget;", "", "applyNewVisitorsOverlay", "", "newVisitors", "", "background", "Lcom/tinder/places/view/util/PlacesGradientDrawable;", "loadImage", "index", "url", "", "cornerRadius", "requestThumbnailsHeight", "resetImageViews", "setImageViewCount", "images", "setThumbnailsHeight", "adjustedHeight", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface PlaceRecTeasersTarget {
    void applyNewVisitorsOverlay(int i, @NotNull C10211a c10211a);

    void loadImage(int i, @Nullable String str, int i2);

    void requestThumbnailsHeight();

    void resetImageViews();

    void setImageViewCount(int i);

    void setThumbnailsHeight(int i);
}
