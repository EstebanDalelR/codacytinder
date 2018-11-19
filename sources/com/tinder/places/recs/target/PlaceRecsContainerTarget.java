package com.tinder.places.recs.target;

import com.tinder.domain.places.model.PlacesConfigExpansion.Size;
import com.tinder.places.viewmodel.PlaceColor.C14346b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H&J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J0\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0018H&¨\u0006\u001d"}, d2 = {"Lcom/tinder/places/recs/target/PlaceRecsContainerTarget;", "", "expand", "", "measureCard", "cardSize", "Lcom/tinder/domain/places/model/PlacesConfigExpansion$Size;", "measureIntro", "introSize", "measureTeaser", "teaserSize", "measureTitle", "titleSize", "resizeRecsToWindow", "setRecsPosition", "setTeaserVisitorCounts", "totalVisitors", "", "newVisitors", "background", "Lcom/tinder/places/viewmodel/PlaceColor$PlacesGradient;", "setTitlePosition", "setTitleTextFontSize", "fontSize", "", "setTotalVisitorsCount", "shrink", "initialSize", "titleFontSize", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface PlaceRecsContainerTarget {
    void expand();

    void measureCard(@NotNull Size size);

    void measureIntro(@NotNull Size size);

    void measureTeaser(@NotNull Size size);

    void measureTitle(@NotNull Size size);

    void resizeRecsToWindow();

    void setRecsPosition(@NotNull Size size);

    void setTeaserVisitorCounts(int i, int i2, @NotNull C14346b c14346b);

    void setTitlePosition(@NotNull Size size);

    void setTitleTextFontSize(float f);

    void setTotalVisitorsCount(int i);

    void shrink(@NotNull Size size, @NotNull Size size2, @NotNull Size size3, @NotNull Size size4, float f);
}
