package com.tinder.places.card.target;

import android.graphics.drawable.Drawable;
import com.tinder.viewmodel.C15425d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\u0017\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0003H&J\b\u0010\u001f\u001a\u00020\u0003H&J\b\u0010 \u001a\u00020\u0003H&¨\u0006!"}, d2 = {"Lcom/tinder/places/card/target/PlaceCardFrontTarget;", "", "bindTeasers", "", "placeRecTeasersViewModel", "Lcom/tinder/viewmodel/PlaceRecTeasersViewModel;", "dismissTooltipIfPresent", "hideRecsErrorText", "resetTeaserImageViews", "setColor", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "setContentAlpha", "alpha", "", "setExpiringTitle", "setNewPlaceTitle", "setPlaceName", "placeName", "", "setRegularTitle", "setVisitorInfo", "totalVisitors", "", "newVisitors", "showErrorButton", "showNoVisitorButton", "showRecsErrorText", "code", "(Ljava/lang/Integer;)V", "showTutorialTooltip", "startShimmer", "stopShimmer", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface PlaceCardFrontTarget {
    void bindTeasers(@NotNull C15425d c15425d);

    void dismissTooltipIfPresent();

    void hideRecsErrorText();

    void resetTeaserImageViews();

    void setColor(@NotNull Drawable drawable);

    void setContentAlpha(float f);

    void setExpiringTitle();

    void setNewPlaceTitle();

    void setPlaceName(@NotNull String str);

    void setRegularTitle();

    void setVisitorInfo(int i, int i2, @NotNull Drawable drawable);

    void showErrorButton();

    void showNoVisitorButton();

    void showRecsErrorText(@Nullable Integer num);

    void showTutorialTooltip();

    void startShimmer();

    void stopShimmer();
}
