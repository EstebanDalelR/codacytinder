package com.tinder.places.card.view;

import com.tinder.places.card.view.PlaceCardView.PlaceCarouselListener;
import com.tinder.places.viewmodel.C14349b;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/tinder/places/card/view/PlaceCardView$showFrontFromAlternativesAnimated$1$1"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.places.card.view.PlaceCardView$showFrontFromAlternativesAnimated$$inlined$apply$lambda$1 */
final class C14183x9edf5ada extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ PlaceCardView f44964a;
    /* renamed from: b */
    final /* synthetic */ C14349b f44965b;

    C14183x9edf5ada(PlaceCardView placeCardView, C14349b c14349b) {
        this.f44964a = placeCardView;
        this.f44965b = c14349b;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53879a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53879a() {
        PlaceCardView placeCardView = this.f44964a;
        C14349b c14349b = this.f44965b;
        PlaceCarouselListener a = this.f44964a.f39882j;
        if (a == null) {
            C2668g.a();
        }
        placeCardView.m48636a(c14349b, a);
    }
}
