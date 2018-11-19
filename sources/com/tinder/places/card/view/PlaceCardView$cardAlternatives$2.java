package com.tinder.places.card.view;

import com.tinder.C6250b.C6248a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/places/card/view/PlaceCardAlternativesView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlaceCardView$cardAlternatives$2 extends Lambda implements Function0<PlaceCardAlternativesView> {
    /* renamed from: a */
    final /* synthetic */ PlaceCardView f44956a;

    PlaceCardView$cardAlternatives$2(PlaceCardView placeCardView) {
        this.f44956a = placeCardView;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53872a();
    }

    /* renamed from: a */
    public final PlaceCardAlternativesView m53872a() {
        PlaceCardBackContainerView placeCardBackContainerView = (PlaceCardBackContainerView) this.f44956a.m48646a(C6248a.placeCardBackContainer);
        C2668g.a(placeCardBackContainerView, "placeCardBackContainer");
        return (PlaceCardAlternativesView) placeCardBackContainerView.m41446a(C6248a.placeCardAlternatives);
    }
}
