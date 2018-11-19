package com.tinder.recs.view.tappy;

import android.graphics.drawable.Drawable;
import com.tinder.recs.view.tappablecards.TapRegionDetector.TapRegion;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J \u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\u0014\u001a\u00020\u0003H&¨\u0006\u0015"}, d2 = {"Lcom/tinder/recs/view/tappy/TappyCarouselViewTarget;", "", "clearImageDrawable", "", "dispatchImageLoaded", "drawable", "Landroid/graphics/drawable/Drawable;", "index", "", "dispatchOverTapEvent", "tapRegion", "Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "dispatchPageChange", "newPosition", "photoUrl", "", "totalSize", "hideProgressBar", "setImageDrawable", "showPhotoAtIndex", "showProgressBar", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public interface TappyCarouselViewTarget {
    void clearImageDrawable();

    void dispatchImageLoaded(@NotNull Drawable drawable, int i);

    void dispatchOverTapEvent(@NotNull TapRegion tapRegion);

    void dispatchPageChange(int i, @NotNull String str, int i2);

    void hideProgressBar();

    void setImageDrawable(@NotNull Drawable drawable);

    void showPhotoAtIndex(int i);

    void showProgressBar();
}
