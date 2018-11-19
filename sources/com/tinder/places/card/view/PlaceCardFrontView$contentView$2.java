package com.tinder.places.card.view;

import android.view.View;
import com.tinder.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlaceCardFrontView$contentView$2 extends Lambda implements Function0<View> {
    /* renamed from: a */
    final /* synthetic */ PlaceCardFrontView f44952a;

    PlaceCardFrontView$contentView$2(PlaceCardFrontView placeCardFrontView) {
        this.f44952a = placeCardFrontView;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53869a();
    }

    /* renamed from: a */
    public final View m53869a() {
        return this.f44952a.findViewById(R.id.cardContainer);
    }
}
