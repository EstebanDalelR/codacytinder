package com.tinder.places.card.presenter;

import com.tinder.places.viewmodel.C14349b;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "confirmed", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesCardViewPresenter$justThisOnceAction$1 extends Lambda implements Function1<Boolean, C15813i> {
    /* renamed from: a */
    final /* synthetic */ PlacesCardViewPresenter f44920a;

    PlacesCardViewPresenter$justThisOnceAction$1(PlacesCardViewPresenter placesCardViewPresenter) {
        this.f44920a = placesCardViewPresenter;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m53850a(((Boolean) obj).booleanValue());
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53850a(boolean z) {
        if (z) {
            this.f44920a.m41395j();
        }
        C14349b b = this.f44920a.m41387b();
        if (b != null) {
            this.f44920a.f33109p.m41319a(b.a(), z);
        }
    }
}