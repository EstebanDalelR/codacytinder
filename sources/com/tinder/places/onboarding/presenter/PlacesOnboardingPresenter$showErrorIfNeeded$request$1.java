package com.tinder.places.onboarding.presenter;

import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesOnboardingPresenter$showErrorIfNeeded$request$1 extends Lambda implements Function1<PlacesApiException, C15813i> {
    /* renamed from: a */
    final /* synthetic */ C10267c f45065a;
    /* renamed from: b */
    final /* synthetic */ Function0 f45066b;

    PlacesOnboardingPresenter$showErrorIfNeeded$request$1(C10267c c10267c, Function0 function0) {
        this.f45065a = c10267c;
        this.f45066b = function0;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m53976a((PlacesApiException) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53976a(@Nullable PlacesApiException placesApiException) {
        this.f45065a.m41646a().showErrorView(placesApiException, this.f45066b);
    }
}
