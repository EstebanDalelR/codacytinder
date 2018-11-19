package com.tinder.settings.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.settings.views.SurveyReasonGridView;

public class ExitSurveyActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ExitSurveyActivity f51299b;
    /* renamed from: c */
    private View f51300c;
    /* renamed from: d */
    private View f51301d;

    @UiThread
    public ExitSurveyActivity_ViewBinding(final ExitSurveyActivity exitSurveyActivity, View view) {
        this.f51299b = exitSurveyActivity;
        exitSurveyActivity.toolbar = (Toolbar) C0761c.b(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        View a = C0761c.a(view, R.id.hideAccountButton, "field 'hideAccountButton' and method 'onHideAccountClicked'");
        exitSurveyActivity.hideAccountButton = (TextView) C0761c.c(a, R.id.hideAccountButton, "field 'hideAccountButton'", TextView.class);
        this.f51300c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ExitSurveyActivity_ViewBinding f51296b;

            public void doClick(View view) {
                exitSurveyActivity.onHideAccountClicked();
            }
        });
        exitSurveyActivity.hideAccountTitle = (TextView) C0761c.b(view, R.id.deactivateTitleText, "field 'hideAccountTitle'", TextView.class);
        exitSurveyActivity.reasonsGrid = (SurveyReasonGridView) C0761c.b(view, R.id.exitSurveyGrid, "field 'reasonsGrid'", SurveyReasonGridView.class);
        exitSurveyActivity.flipper = (ViewFlipper) C0761c.b(view, R.id.exitSurveyFlipper, "field 'flipper'", ViewFlipper.class);
        exitSurveyActivity.titleText = (TextView) C0761c.b(view, R.id.titleText, "field 'titleText'", TextView.class);
        a = C0761c.a(view, R.id.showDeleteOptionsButton, "method 'onDeleteMyAccountClicked'");
        this.f51301d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ExitSurveyActivity_ViewBinding f51298b;

            public void doClick(View view) {
                exitSurveyActivity.onDeleteMyAccountClicked();
            }
        });
        exitSurveyActivity.deleteString = view.getContext().getResources().getString(R.string.delete_account);
    }

    @CallSuper
    public void unbind() {
        ExitSurveyActivity exitSurveyActivity = this.f51299b;
        if (exitSurveyActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51299b = null;
        exitSurveyActivity.toolbar = null;
        exitSurveyActivity.hideAccountButton = null;
        exitSurveyActivity.hideAccountTitle = null;
        exitSurveyActivity.reasonsGrid = null;
        exitSurveyActivity.flipper = null;
        exitSurveyActivity.titleText = null;
        this.f51300c.setOnClickListener(null);
        this.f51300c = null;
        this.f51301d.setOnClickListener(null);
        this.f51301d = null;
    }
}
