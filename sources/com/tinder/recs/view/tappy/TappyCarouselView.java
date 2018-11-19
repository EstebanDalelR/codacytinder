package com.tinder.recs.view.tappy;

import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import com.tinder.base.view.listener.OnPhotoPageChangeListener;
import com.tinder.domain.common.model.Photo;
import com.tinder.recs.view.tappablecards.TapRegionDetector.TapRegion;
import com.tinder.recs.view.tappablecards.TappableCarouselView;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u001dJ&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u000bH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u000bH&J\b\u0010\u0013\u001a\u00020\u0004H&J\b\u0010\u0014\u001a\u00020\u0004H&J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\u0012\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\b\u0010\u001b\u001a\u00020\u0004H&J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\u001e"}, d2 = {"Lcom/tinder/recs/view/tappy/TappyCarouselView;", "T", "Lcom/tinder/recs/view/tappablecards/TappableCarouselView;", "bind", "", "userId", "", "photos", "", "Lcom/tinder/domain/common/model/Photo;", "index", "", "dispatchTapRegionEvent", "tapRegion", "Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "getHeight", "getViewTreeObserver", "Landroid/view/ViewTreeObserver;", "getWidth", "hidePageIndicator", "onViewRecycled", "setOnImageLoadedListener", "onImageLoadedListener", "Lcom/tinder/recs/view/tappy/TappyCarouselView$OnImageLoadedListener;", "setOnPhotoPageChangeListener", "onPhotoPageChangeListener", "Lcom/tinder/base/view/listener/OnPhotoPageChangeListener;", "showPageIndicator", "showPhotoAtIndex", "OnImageLoadedListener", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public interface TappyCarouselView<T> extends TappableCarouselView<T> {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/recs/view/tappy/TappyCarouselView$OnImageLoadedListener;", "", "onImageLoaded", "", "drawable", "Landroid/graphics/drawable/Drawable;", "index", "", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
    public interface OnImageLoadedListener {
        void onImageLoaded(@NotNull Drawable drawable, int i);
    }

    void bind(@NotNull String str, @NotNull List<? extends Photo> list, int i);

    void dispatchTapRegionEvent(@NotNull TapRegion tapRegion);

    int getHeight();

    @NotNull
    ViewTreeObserver getViewTreeObserver();

    int getWidth();

    void hidePageIndicator();

    void onViewRecycled();

    void setOnImageLoadedListener(@Nullable OnImageLoadedListener onImageLoadedListener);

    void setOnPhotoPageChangeListener(@Nullable OnPhotoPageChangeListener onPhotoPageChangeListener);

    void showPageIndicator();

    void showPhotoAtIndex(int i);
}
