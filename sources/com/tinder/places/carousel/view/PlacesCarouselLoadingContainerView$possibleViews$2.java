package com.tinder.places.carousel.view;

import android.view.ViewGroup;
import com.tinder.C6250b.C6248a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ak;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Landroid/view/ViewGroup;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesCarouselLoadingContainerView$possibleViews$2 extends Lambda implements Function0<Set<? extends ViewGroup>> {
    /* renamed from: a */
    final /* synthetic */ PlacesCarouselLoadingContainerView f44991a;

    PlacesCarouselLoadingContainerView$possibleViews$2(PlacesCarouselLoadingContainerView placesCarouselLoadingContainerView) {
        this.f44991a = placesCarouselLoadingContainerView;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53915a();
    }

    @NotNull
    /* renamed from: a */
    public final Set<ViewGroup> m53915a() {
        return ak.a(new ViewGroup[]{(PlacesCarouselLoadingView) this.f44991a.m48707a(C6248a.placesLoading), (PlacesCarouselEmptyView) this.f44991a.m48707a(C6248a.placesEmpty), (PlacesCarouselView) this.f44991a.m48707a(C6248a.placesRecycler)});
    }
}
