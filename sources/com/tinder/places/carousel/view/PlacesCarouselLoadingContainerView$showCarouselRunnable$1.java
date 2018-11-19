package com.tinder.places.carousel.view;

import android.view.View;
import com.tinder.C6250b.C6248a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesCarouselLoadingContainerView$showCarouselRunnable$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ PlacesCarouselLoadingContainerView f44993a;

    PlacesCarouselLoadingContainerView$showCarouselRunnable$1(PlacesCarouselLoadingContainerView placesCarouselLoadingContainerView) {
        this.f44993a = placesCarouselLoadingContainerView;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53917a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53917a() {
        PlacesCarouselLoadingContainerView placesCarouselLoadingContainerView = this.f44993a;
        PlacesCarouselView placesCarouselView = (PlacesCarouselView) this.f44993a.m48707a(C6248a.placesRecycler);
        C2668g.a(placesCarouselView, "placesRecycler");
        placesCarouselLoadingContainerView.m48703a((View) placesCarouselView);
        ((PlacesCarouselView) this.f44993a.m48707a(C6248a.placesRecycler)).m53920a();
        placesCarouselLoadingContainerView = this.f44993a;
        PlacesCarouselLoadingContainerView placesCarouselLoadingContainerView2 = this.f44993a;
        PlacesCarouselView placesCarouselView2 = (PlacesCarouselView) this.f44993a.m48707a(C6248a.placesRecycler);
        C2668g.a(placesCarouselView2, "placesRecycler");
        placesCarouselLoadingContainerView.f39915d = placesCarouselLoadingContainerView2.m48699a(placesCarouselView2, true, new Function0<C15813i>() {
            public /* synthetic */ Object invoke() {
                m53916a();
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m53916a() {
                ((PlacesCarouselView) this.f44993a.m48707a(C6248a.placesRecycler)).m53921b();
            }
        });
    }
}
