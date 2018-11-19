package com.tinder.places.main.presenter;

import com.tinder.domain.places.model.PlacesLoadedState;
import com.tinder.places.main.presenter.C10223f.C14215z;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesPresenter$updatePlacesRepoFromApi$3$2 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ C14215z f45013a;

    PlacesPresenter$updatePlacesRepoFromApi$3$2(C14215z c14215z) {
        this.f45013a = c14215z;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53927a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53927a() {
        this.f45013a.f45025a.m41584a().clearErrorView();
        this.f45013a.f45025a.m41561a(PlacesLoadedState.COLD);
    }
}
