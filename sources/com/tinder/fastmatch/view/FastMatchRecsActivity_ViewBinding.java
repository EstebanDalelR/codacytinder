package com.tinder.fastmatch.view;

import android.support.annotation.UiThread;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.boost.view.BoostButtonView;

public final class FastMatchRecsActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private FastMatchRecsActivity f38140b;
    /* renamed from: c */
    private View f38141c;
    /* renamed from: d */
    private View f38142d;

    @UiThread
    public FastMatchRecsActivity_ViewBinding(final FastMatchRecsActivity fastMatchRecsActivity, View view) {
        this.f38140b = fastMatchRecsActivity;
        View a = C0761c.a(view, R.id.fast_match_pill_view, "field 'fastMatchPillView' and method 'handlePillOnClick'");
        fastMatchRecsActivity.fastMatchPillView = (FastMatchPillView) C0761c.c(a, R.id.fast_match_pill_view, "field 'fastMatchPillView'", FastMatchPillView.class);
        this.f38141c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ FastMatchRecsActivity_ViewBinding f38137b;

            public void doClick(View view) {
                fastMatchRecsActivity.handlePillOnClick();
            }
        });
        fastMatchRecsActivity.toolbar = (Toolbar) C0761c.b(view, R.id.fast_match_toolbar, "field 'toolbar'", Toolbar.class);
        fastMatchRecsActivity.fastMatchRecsView = (FastMatchRecsView) C0761c.b(view, R.id.fast_match_recs_view, "field 'fastMatchRecsView'", FastMatchRecsView.class);
        fastMatchRecsActivity.contentContainer = (ViewGroup) C0761c.b(view, R.id.touch_blocking_container, "field 'contentContainer'", ViewGroup.class);
        fastMatchRecsActivity.boostButtonView = (BoostButtonView) C0761c.b(view, R.id.boost_button_view, "field 'boostButtonView'", BoostButtonView.class);
        fastMatchRecsActivity.appBarLayout = (AppBarLayout) C0761c.b(view, R.id.appbar, "field 'appBarLayout'", AppBarLayout.class);
        a = C0761c.a(view, R.id.fast_match_toolbar_content, "field 'fastMatchToolbarCountView' and method 'handleToolbarOnClick'");
        fastMatchRecsActivity.fastMatchToolbarCountView = (FastMatchRecsToolbarView) C0761c.c(a, R.id.fast_match_toolbar_content, "field 'fastMatchToolbarCountView'", FastMatchRecsToolbarView.class);
        this.f38142d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ FastMatchRecsActivity_ViewBinding f38139b;

            public void doClick(View view) {
                fastMatchRecsActivity.handleToolbarOnClick();
            }
        });
        fastMatchRecsActivity.pillTopMargin = view.getContext().getResources().getDimension(R.dimen.margin_small);
    }

    public void unbind() {
        FastMatchRecsActivity fastMatchRecsActivity = this.f38140b;
        if (fastMatchRecsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f38140b = null;
        fastMatchRecsActivity.fastMatchPillView = null;
        fastMatchRecsActivity.toolbar = null;
        fastMatchRecsActivity.fastMatchRecsView = null;
        fastMatchRecsActivity.contentContainer = null;
        fastMatchRecsActivity.boostButtonView = null;
        fastMatchRecsActivity.appBarLayout = null;
        fastMatchRecsActivity.fastMatchToolbarCountView = null;
        this.f38141c.setOnClickListener(null);
        this.f38141c = null;
        this.f38142d.setOnClickListener(null);
        this.f38142d = null;
    }
}
