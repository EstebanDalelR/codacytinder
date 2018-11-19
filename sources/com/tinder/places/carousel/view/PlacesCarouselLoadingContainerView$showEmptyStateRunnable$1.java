package com.tinder.places.carousel.view;

import android.view.View;
import com.tinder.C6250b.C6248a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesCarouselLoadingContainerView$showEmptyStateRunnable$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ PlacesCarouselLoadingContainerView f44994a;

    PlacesCarouselLoadingContainerView$showEmptyStateRunnable$1(PlacesCarouselLoadingContainerView placesCarouselLoadingContainerView) {
        this.f44994a = placesCarouselLoadingContainerView;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53918a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53918a() {
        PlacesCarouselLoadingContainerView placesCarouselLoadingContainerView = this.f44994a;
        PlacesCarouselEmptyView placesCarouselEmptyView = (PlacesCarouselEmptyView) this.f44994a.m48707a(C6248a.placesEmpty);
        C2668g.a(placesCarouselEmptyView, "placesEmpty");
        placesCarouselLoadingContainerView.m48703a((View) placesCarouselEmptyView);
        placesCarouselLoadingContainerView = this.f44994a;
        PlacesCarouselLoadingContainerView placesCarouselLoadingContainerView2 = this.f44994a;
        PlacesCarouselEmptyView placesCarouselEmptyView2 = (PlacesCarouselEmptyView) this.f44994a.m48707a(C6248a.placesEmpty);
        C2668g.a(placesCarouselEmptyView2, "placesEmpty");
        placesCarouselLoadingContainerView.f39915d = PlacesCarouselLoadingContainerView.m48701a(placesCarouselLoadingContainerView2, placesCarouselEmptyView2, true, null, 4, null);
    }
}
