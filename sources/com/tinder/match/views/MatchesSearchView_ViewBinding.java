package com.tinder.match.views;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class MatchesSearchView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private MatchesSearchView f39266b;

    @UiThread
    public MatchesSearchView_ViewBinding(MatchesSearchView matchesSearchView, View view) {
        this.f39266b = matchesSearchView;
        matchesSearchView.searchEntry = (SearchView) C0761c.b(view, R.id.matches_search_entry, "field 'searchEntry'", SearchView.class);
        matchesSearchView.closeButton = (ImageView) C0761c.b(view, R.id.search_close_btn, "field 'closeButton'", ImageView.class);
        view = view.getContext();
        Resources resources = view.getResources();
        matchesSearchView.grey = C0432b.c(view, R.color.divider_light);
        matchesSearchView.disabledTextColor = C0432b.c(view, R.color.text_search_light);
        matchesSearchView.enabledTextColor = C0432b.c(view, R.color.gray);
        matchesSearchView.searchHint = resources.getString(R.string.match_list_search_hint);
    }

    @CallSuper
    public void unbind() {
        MatchesSearchView matchesSearchView = this.f39266b;
        if (matchesSearchView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39266b = null;
        matchesSearchView.searchEntry = null;
        matchesSearchView.closeButton = null;
    }
}
