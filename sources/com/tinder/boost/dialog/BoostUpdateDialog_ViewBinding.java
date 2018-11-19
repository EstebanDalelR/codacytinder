package com.tinder.boost.dialog;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.Space;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.boost.view.BoostGaugeView;

public class BoostUpdateDialog_ViewBinding implements Unbinder {
    /* renamed from: b */
    private BoostUpdateDialog f33973b;
    /* renamed from: c */
    private View f33974c;
    /* renamed from: d */
    private View f33975d;
    /* renamed from: e */
    private View f33976e;
    /* renamed from: f */
    private View f33977f;

    @UiThread
    public BoostUpdateDialog_ViewBinding(final BoostUpdateDialog boostUpdateDialog, View view) {
        this.f33973b = boostUpdateDialog;
        boostUpdateDialog.mBoostGaugeSpace = (Space) C0761c.b(view, R.id.boost_gauge_space, "field 'mBoostGaugeSpace'", Space.class);
        View a = C0761c.a(view, R.id.dialog_boost_update_container, "field 'mMainContainer' and method 'onWindowBackgroundClick'");
        boostUpdateDialog.mMainContainer = (FrameLayout) C0761c.c(a, R.id.dialog_boost_update_container, "field 'mMainContainer'", FrameLayout.class);
        this.f33974c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ BoostUpdateDialog_ViewBinding f33966b;

            public void doClick(View view) {
                boostUpdateDialog.onWindowBackgroundClick();
            }
        });
        boostUpdateDialog.mBoostViewContainer = (ViewGroup) C0761c.b(view, R.id.boost_update_top_container, "field 'mBoostViewContainer'", ViewGroup.class);
        boostUpdateDialog.mGaugeView = (BoostGaugeView) C0761c.b(view, R.id.boost_gauge_view, "field 'mGaugeView'", BoostGaugeView.class);
        boostUpdateDialog.mTimer = (TextView) C0761c.b(view, R.id.boost_update_time, "field 'mTimer'", TextView.class);
        boostUpdateDialog.mDescription = (TextView) C0761c.b(view, R.id.boost_update_description_text, "field 'mDescription'", TextView.class);
        boostUpdateDialog.mInfoTitle = (TextView) C0761c.b(view, R.id.boost_update_info_title_text, "field 'mInfoTitle'", TextView.class);
        boostUpdateDialog.mInfoDescription = (TextView) C0761c.b(view, R.id.boost_update_info_description_text, "field 'mInfoDescription'", TextView.class);
        a = C0761c.a(view, R.id.button_get_tinderplus, "field 'mBtnGetTinderPlus' and method 'onGetTinderPlusClick'");
        boostUpdateDialog.mBtnGetTinderPlus = (Button) C0761c.c(a, R.id.button_get_tinderplus, "field 'mBtnGetTinderPlus'", Button.class);
        this.f33975d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ BoostUpdateDialog_ViewBinding f33968b;

            public void doClick(View view) {
                boostUpdateDialog.onGetTinderPlusClick();
            }
        });
        a = C0761c.a(view, R.id.btn_okay, "field 'mBtnOkay' and method 'onDoneClick'");
        boostUpdateDialog.mBtnOkay = a;
        this.f33976e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ BoostUpdateDialog_ViewBinding f33970b;

            public void doClick(View view) {
                boostUpdateDialog.onDoneClick();
            }
        });
        a = C0761c.a(view, R.id.card_view, "method 'onCardClick'");
        this.f33977f = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ BoostUpdateDialog_ViewBinding f33972b;

            public void doClick(View view) {
                boostUpdateDialog.onCardClick();
            }
        });
        view = view.getContext().getResources();
        boostUpdateDialog.mBoostEmitterYDelta = view.getDimensionPixelSize(R.dimen.boost_dialog_y_delta);
        boostUpdateDialog.mDescriptionString = view.getString(R.string.boost_update_description);
        boostUpdateDialog.mBoostEnded = view.getString(R.string.boost_summary_title_plus);
    }

    @CallSuper
    public void unbind() {
        BoostUpdateDialog boostUpdateDialog = this.f33973b;
        if (boostUpdateDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f33973b = null;
        boostUpdateDialog.mBoostGaugeSpace = null;
        boostUpdateDialog.mMainContainer = null;
        boostUpdateDialog.mBoostViewContainer = null;
        boostUpdateDialog.mGaugeView = null;
        boostUpdateDialog.mTimer = null;
        boostUpdateDialog.mDescription = null;
        boostUpdateDialog.mInfoTitle = null;
        boostUpdateDialog.mInfoDescription = null;
        boostUpdateDialog.mBtnGetTinderPlus = null;
        boostUpdateDialog.mBtnOkay = null;
        this.f33974c.setOnClickListener(null);
        this.f33974c = null;
        this.f33975d.setOnClickListener(null);
        this.f33975d = null;
        this.f33976e.setOnClickListener(null);
        this.f33976e = null;
        this.f33977f.setOnClickListener(null);
        this.f33977f = null;
    }
}
