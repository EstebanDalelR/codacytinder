package com.tinder.recs.view.tappablecards;

import android.view.View;
import com.tinder.recs.view.tappablecards.TapRegionDetector.TapRegion;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002:\u0002\u0018\u0019J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH&J\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\fH&¨\u0006\u001a"}, d2 = {"Lcom/tinder/recs/view/tappablecards/TappableCarouselView;", "T", "", "animateOverTap", "", "region", "Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "targetView", "Landroid/view/View;", "clearImage", "setActivePage", "activePage", "", "setImage", "image", "(Ljava/lang/Object;)V", "setOnOverTapListener", "onOverTapListener", "Lcom/tinder/recs/view/tappablecards/TappableCarouselView$OnOverTapListener;", "setOnTapListener", "onTapListener", "Lcom/tinder/recs/view/tappablecards/TappableCarouselView$OnTapListener;", "setPageCount", "pageCount", "OnOverTapListener", "OnTapListener", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public interface TappableCarouselView<T> {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/recs/view/tappablecards/TappableCarouselView$OnOverTapListener;", "", "onOverTap", "", "tapRegion", "Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
    public interface OnOverTapListener {
        void onOverTap(@NotNull TapRegion tapRegion);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/recs/view/tappablecards/TappableCarouselView$OnTapListener;", "", "onTap", "", "tapRegion", "Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "isOverTap", "", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
    public interface OnTapListener {
        void onTap(@NotNull TapRegion tapRegion, boolean z);
    }

    void animateOverTap(@NotNull TapRegion tapRegion, @NotNull View view);

    void clearImage();

    void setActivePage(int i);

    void setImage(T t);

    void setOnOverTapListener(@Nullable OnOverTapListener onOverTapListener);

    void setOnTapListener(@Nullable OnTapListener onTapListener);

    void setPageCount(int i);
}
