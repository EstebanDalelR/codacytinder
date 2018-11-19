package com.tinder.places.card.view;

import com.tinder.places.card.view.PlaceCardView.PlaceCarouselListener;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlaceCardView$bindTotal$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ PlaceCardView f44954a;
    /* renamed from: b */
    final /* synthetic */ PlaceCarouselListener f44955b;

    PlaceCardView$bindTotal$1(PlaceCardView placeCardView, PlaceCarouselListener placeCarouselListener) {
        this.f44954a = placeCardView;
        this.f44955b = placeCarouselListener;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53871a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53871a() {
        this.f44955b.showPlaceRecs(this.f44954a);
    }
}
