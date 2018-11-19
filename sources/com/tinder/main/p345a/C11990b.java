package com.tinder.main.p345a;

import com.tinder.main.BackPressInterceptor;
import com.tinder.match.provider.MatchesSearchStateProvider;
import com.tinder.match.views.MatchesSearchView.State;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/main/interceptor/MatchesSearchBackPressInterceptor;", "Lcom/tinder/main/BackPressInterceptor;", "matchesSearchStateProvider", "Lcom/tinder/match/provider/MatchesSearchStateProvider;", "(Lcom/tinder/match/provider/MatchesSearchStateProvider;)V", "canTurnMatchSearchStateOff", "", "intercept", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.a.b */
public final class C11990b implements BackPressInterceptor {
    /* renamed from: a */
    private final MatchesSearchStateProvider f38942a;

    public C11990b(@NotNull MatchesSearchStateProvider matchesSearchStateProvider) {
        C2668g.b(matchesSearchStateProvider, "matchesSearchStateProvider");
        this.f38942a = matchesSearchStateProvider;
    }

    public boolean intercept() {
        if (!m48029a()) {
            return false;
        }
        this.f38942a.updateSearchState(State.SEARCH_OFF);
        return true;
    }

    /* renamed from: a */
    private final boolean m48029a() {
        return this.f38942a.getSearchState() != State.SEARCH_OFF;
    }
}
