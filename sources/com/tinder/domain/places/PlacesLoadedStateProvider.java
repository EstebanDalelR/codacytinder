package com.tinder.domain.places;

import android.support.annotation.UiThread;
import com.tinder.domain.places.model.PlacesLoadedState;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.C19785a;
import rx.subjects.C19786b;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007RN\u0010\u0003\u001aB\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006* \u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/domain/places/PlacesLoadedStateProvider;", "", "()V", "subject", "Lrx/subjects/SerializedSubject;", "Lcom/tinder/domain/places/model/PlacesLoadedState;", "kotlin.jvm.PlatformType", "observe", "Lrx/Observable;", "update", "", "state", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesLoadedStateProvider {
    private final C19786b<PlacesLoadedState, PlacesLoadedState> subject = C19785a.f(PlacesLoadedState.COLD).B();

    @NotNull
    public final Observable<PlacesLoadedState> observe() {
        Observable<PlacesLoadedState> g = this.subject.e().g();
        C2668g.a(g, "subject.asObservable().distinctUntilChanged()");
        return g;
    }

    @UiThread
    public final void update(@NotNull PlacesLoadedState placesLoadedState) {
        C2668g.b(placesLoadedState, "state");
        this.subject.onNext(placesLoadedState);
    }
}
