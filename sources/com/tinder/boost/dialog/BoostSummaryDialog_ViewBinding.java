package com.tinder.boost.dialog;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.boost.view.BoostGaugeView;

public class BoostSummaryDialog_ViewBinding implements Unbinder {
    /* renamed from: b */
    private BoostSummaryDialog f33961b;
    /* renamed from: c */
    private View f33962c;
    /* renamed from: d */
    private View f33963d;
    /* renamed from: e */
    private View f33964e;

    @UiThread
    public BoostSummaryDialog_ViewBinding(final BoostSummaryDialog boostSummaryDialog, View view) {
        this.f33961b = boostSummaryDialog;
        boostSummaryDialog.mTitleView = (TextView) C0761c.b(view, R.id.boost_summary_title_text, "field 'mTitleView'", TextView.class);
        boostSummaryDialog.mDescription = (TextView) C0761c.b(view, R.id.boost_summary_description_text, "field 'mDescription'", TextView.class);
        boostSummaryDialog.mInfoTitle = (TextView) C0761c.b(view, R.id.boost_summary_info_title_text, "field 'mInfoTitle'", TextView.class);
        boostSummaryDialog.mInfoDescription = (TextView) C0761c.b(view, R.id.boost_summary_info_description_text, "field 'mInfoDescription'", TextView.class);
        View a = C0761c.a(view, R.id.boost_summary_button, "field 'mSummaryButton' and method 'boostSummaryButtonClick'");
        boostSummaryDialog.mSummaryButton = (Button) C0761c.c(a, R.id.boost_summary_button, "field 'mSummaryButton'", Button.class);
        this.f33962c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ BoostSummaryDialog_ViewBinding f33956b;

            public void doClick(View view) {
                boostSummaryDialog.boostSummaryButtonClick();
            }
        });
        boostSummaryDialog.mGaugeView = (BoostGaugeView) C0761c.b(view, R.id.boost_gauge_view, "field 'mGaugeView'", BoostGaugeView.class);
        a = C0761c.a(view, R.id.boost_summary_container, "method 'onClickOutsideCard'");
        this.f33963d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ BoostSummaryDialog_ViewBinding f33958b;

            public void doClick(View view) {
                boostSummaryDialog.onClickOutsideCard();
            }
        });
        a = C0761c.a(view, R.id.card_view, "method 'onCardClick'");
        this.f33964e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ BoostSummaryDialog_ViewBinding f33960b;

            public void doClick(View view) {
                boostSummaryDialog.onCardClick();
            }
        });
        view = view.getContext().getResources();
        boostSummaryDialog.mGetTinderPlus = view.getString(R.string.get_tinder_plus);
        boostSummaryDialog.mBoostAgain = view.getString(R.string.boost_again);
        boostSummaryDialog.mBoostSummaryDescription = view.getString(R.string.boost_summary_description);
        boostSummaryDialog.mBoostSummaryTitlePlus = view.getString(R.string.boost_summary_title_plus);
        boostSummaryDialog.mBoostSummaryTitleNonPlus = view.getString(R.string.boost_summary_title_non_plus);
        boostSummaryDialog.boostMultipleTemplate = view.getString(R.string.boost_multiple);
    }

    @CallSuper
    public void unbind() {
        BoostSummaryDialog boostSummaryDialog = this.f33961b;
        if (boostSummaryDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f33961b = null;
        boostSummaryDialog.mTitleView = null;
        boostSummaryDialog.mDescription = null;
        boostSummaryDialog.mInfoTitle = null;
        boostSummaryDialog.mInfoDescription = null;
        boostSummaryDialog.mSummaryButton = null;
        boostSummaryDialog.mGaugeView = null;
        this.f33962c.setOnClickListener(null);
        this.f33962c = null;
        this.f33963d.setOnClickListener(null);
        this.f33963d = null;
        this.f33964e.setOnClickListener(null);
        this.f33964e = null;
    }
}
