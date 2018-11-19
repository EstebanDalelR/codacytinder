package com.tinder.tinderplus.activities;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.AppBarLayout;
import android.support.v4.content.C0432b;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class ActivityTPlusControl_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ActivityTPlusControl f52152b;
    /* renamed from: c */
    private View f52153c;
    /* renamed from: d */
    private View f52154d;
    /* renamed from: e */
    private View f52155e;

    @UiThread
    public ActivityTPlusControl_ViewBinding(final ActivityTPlusControl activityTPlusControl, View view) {
        this.f52152b = activityTPlusControl;
        activityTPlusControl.mRecyclerView = (RecyclerView) C0761c.b(view, R.id.t_plus_control_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        View a = C0761c.a(view, R.id.btn_getplus, "field 'mGetTPlusBtn' and method 'onGetPlusButtonClick'");
        activityTPlusControl.mGetTPlusBtn = (Button) C0761c.c(a, R.id.btn_getplus, "field 'mGetTPlusBtn'", Button.class);
        this.f52153c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ActivityTPlusControl_ViewBinding f52147b;

            public void doClick(View view) {
                activityTPlusControl.onGetPlusButtonClick();
            }
        });
        a = C0761c.a(view, R.id.up_icon, "field 'mUpButton' and method 'onUpClick'");
        activityTPlusControl.mUpButton = (ImageView) C0761c.c(a, R.id.up_icon, "field 'mUpButton'", ImageView.class);
        this.f52154d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ActivityTPlusControl_ViewBinding f52149b;

            public void doClick(View view) {
                activityTPlusControl.onUpClick();
            }
        });
        activityTPlusControl.mAppBar = (AppBarLayout) C0761c.b(view, R.id.appbar, "field 'mAppBar'", AppBarLayout.class);
        a = C0761c.a(view, R.id.toolbar_title, "field 'mToolbarTitle' and method 'onToolbarTitleClick'");
        activityTPlusControl.mToolbarTitle = (TextView) C0761c.c(a, R.id.toolbar_title, "field 'mToolbarTitle'", TextView.class);
        this.f52155e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ActivityTPlusControl_ViewBinding f52151b;

            public void doClick(View view) {
                activityTPlusControl.onToolbarTitleClick();
            }
        });
        view = view.getContext();
        Resources resources = view.getResources();
        activityTPlusControl.upButtonColor = C0432b.c(view, R.color.another_freaking_grey);
        activityTPlusControl.verticalPadding = resources.getDimensionPixelSize(R.dimen.margin_med);
        activityTPlusControl.mTinderPlusText = resources.getString(R.string.tinder_plus);
        activityTPlusControl.mMyTinderPlusText = resources.getString(R.string.my_tinder_plus);
        activityTPlusControl.myTinderGoldText = resources.getString(R.string.my_tinder_gold);
        activityTPlusControl.notNow = resources.getString(R.string.not_now);
        activityTPlusControl.disableFastMatchTitle = resources.getString(R.string.do_you_want_to_disable_likes_you);
        activityTPlusControl.disableFastMatchMessage = resources.getString(R.string.will_not_be_able_to_see_likes_you);
        activityTPlusControl.disable = resources.getString(R.string.disable);
    }

    @CallSuper
    public void unbind() {
        ActivityTPlusControl activityTPlusControl = this.f52152b;
        if (activityTPlusControl == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f52152b = null;
        activityTPlusControl.mRecyclerView = null;
        activityTPlusControl.mGetTPlusBtn = null;
        activityTPlusControl.mUpButton = null;
        activityTPlusControl.mAppBar = null;
        activityTPlusControl.mToolbarTitle = null;
        this.f52153c.setOnClickListener(null);
        this.f52153c = null;
        this.f52154d.setOnClickListener(null);
        this.f52154d = null;
        this.f52155e.setOnClickListener(null);
        this.f52155e = null;
    }
}
