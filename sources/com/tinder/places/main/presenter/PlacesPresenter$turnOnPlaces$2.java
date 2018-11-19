package com.tinder.places.main.presenter;

import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.places.analytics.AddPlacesManageEnabledEvent.Source;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesPresenter$turnOnPlaces$2 extends Lambda implements Function1<PlacesApiException, C15813i> {
    /* renamed from: a */
    final /* synthetic */ C10223f f45012a;

    PlacesPresenter$turnOnPlaces$2(C10223f c10223f) {
        this.f45012a = c10223f;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m53926a((PlacesApiException) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53926a(@Nullable PlacesApiException placesApiException) {
        this.f45012a.m41584a().showErrorDialog(placesApiException);
        this.f45012a.f33315t.m41306a(placesApiException != null ? placesApiException.m37235a() : null, Source.PLACES_DISABLED);
    }
}
