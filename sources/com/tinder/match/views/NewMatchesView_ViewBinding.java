package com.tinder.match.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class NewMatchesView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private NewMatchesView f39272b;

    @UiThread
    public NewMatchesView_ViewBinding(NewMatchesView newMatchesView, View view) {
        this.f39272b = newMatchesView;
        newMatchesView.newMatchesCount = (TextView) C0761c.b(view, R.id.new_matches_count, "field 'newMatchesCount'", TextView.class);
        newMatchesView.newMatchesRecyclerView = (RecyclerView) C0761c.b(view, R.id.new_matches_recycler, "field 'newMatchesRecyclerView'", RecyclerView.class);
        newMatchesView.listLeftMargin = view.getContext().getResources().getDimensionPixelSize(R.dimen.space_s);
    }

    @CallSuper
    public void unbind() {
        NewMatchesView newMatchesView = this.f39272b;
        if (newMatchesView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39272b = null;
        newMatchesView.newMatchesCount = null;
        newMatchesView.newMatchesRecyclerView = null;
    }
}
