package com.tinder.match.provider;

import com.tinder.match.views.MatchesSearchView.State;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/tinder/match/provider/MatchesSearchStateProvider;", "", "searchState", "Lcom/tinder/match/views/MatchesSearchView$State;", "getSearchState", "()Lcom/tinder/match/views/MatchesSearchView$State;", "observeSearchState", "Lrx/Observable;", "updateSearchState", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface MatchesSearchStateProvider {
    @NotNull
    State getSearchState();

    @NotNull
    Observable<State> observeSearchState();

    void updateSearchState(@NotNull State state);
}
