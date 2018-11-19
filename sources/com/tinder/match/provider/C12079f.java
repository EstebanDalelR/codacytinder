package com.tinder.match.provider;

import android.support.annotation.NonNull;
import com.tinder.match.views.MatchesSearchView.State;
import rx.Observable;
import rx.subjects.C19785a;

/* renamed from: com.tinder.match.provider.f */
public class C12079f implements MatchesSearchStateProvider {
    /* renamed from: a */
    private final C19785a<State> f39224a = C19785a.f(State.SEARCH_OFF);

    public State getSearchState() {
        return (State) this.f39224a.A();
    }

    public Observable<State> observeSearchState() {
        return this.f39224a.e();
    }

    public void updateSearchState(@NonNull State state) {
        if (state != getSearchState()) {
            this.f39224a.onNext(state);
        }
    }
}
