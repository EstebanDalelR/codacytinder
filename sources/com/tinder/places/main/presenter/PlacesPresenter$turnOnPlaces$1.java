package com.tinder.places.main.presenter;

import com.tinder.places.analytics.AddPlacesManageEnabledEvent.Source;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesPresenter$turnOnPlaces$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ C10223f f45011a;

    PlacesPresenter$turnOnPlaces$1(C10223f c10223f) {
        this.f45011a = c10223f;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53925a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53925a() {
        this.f45011a.f33315t.m41308a(true, Source.PLACES_DISABLED);
    }
}
