package com.tinder.match.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class MatchListView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private MatchListView f39259b;
    /* renamed from: c */
    private View f39260c;

    @UiThread
    public MatchListView_ViewBinding(final MatchListView matchListView, View view) {
        this.f39259b = matchListView;
        matchListView.noMatchesView = (ViewStub) C0761c.b(view, R.id.no_matches, "field 'noMatchesView'", ViewStub.class);
        matchListView.loadingView = C0761c.a(view, R.id.matches_loading_view, "field 'loadingView'");
        matchListView.noSearchResultsView = C0761c.a(view, R.id.matches_no_search_results, "field 'noSearchResultsView'");
        matchListView.matchListRecycler = (RecyclerView) C0761c.b(view, R.id.match_list_recycler, "field 'matchListRecycler'", RecyclerView.class);
        View a = C0761c.a(view, R.id.search_frost_overlay, "field 'searchFrostOverlay' and method 'onSearchOverlayClick'");
        matchListView.searchFrostOverlay = a;
        this.f39260c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ MatchListView_ViewBinding f39258b;

            public void doClick(View view) {
                matchListView.onSearchOverlayClick();
            }
        });
        matchListView.matchesContent = C0761c.a(view, R.id.matches_content, "field 'matchesContent'");
        matchListView.matchesSearchView = (MatchesSearchView) C0761c.b(view, R.id.matches_search_bar, "field 'matchesSearchView'", MatchesSearchView.class);
    }

    @CallSuper
    public void unbind() {
        MatchListView matchListView = this.f39259b;
        if (matchListView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39259b = null;
        matchListView.noMatchesView = null;
        matchListView.loadingView = null;
        matchListView.noSearchResultsView = null;
        matchListView.matchListRecycler = null;
        matchListView.searchFrostOverlay = null;
        matchListView.matchesContent = null;
        matchListView.matchesSearchView = null;
        this.f39260c.setOnClickListener(null);
        this.f39260c = null;
    }
}
