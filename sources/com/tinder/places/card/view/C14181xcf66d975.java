package com.tinder.places.card.view;

import com.tinder.domain.places.model.Place.Alternative;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.places.card.view.PlaceCardAlternativesView$showCorrectionDialog$correctLocationDialog$1 */
final class C14181xcf66d975 extends Lambda implements Function1<Boolean, C15813i> {
    /* renamed from: a */
    final /* synthetic */ PlaceCardAlternativesView f44948a;
    /* renamed from: b */
    final /* synthetic */ Alternative f44949b;

    C14181xcf66d975(PlaceCardAlternativesView placeCardAlternativesView, Alternative alternative) {
        this.f44948a = placeCardAlternativesView;
        this.f44949b = alternative;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m53866a(((Boolean) obj).booleanValue());
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53866a(boolean z) {
        this.f44948a.getPresenter$Tinder_release().m41407a(this.f44949b.getId(), z);
    }
}
