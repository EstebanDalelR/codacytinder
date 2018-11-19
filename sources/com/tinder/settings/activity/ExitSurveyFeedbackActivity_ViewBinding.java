package com.tinder.settings.activity;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class ExitSurveyFeedbackActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ExitSurveyFeedbackActivity f51306b;
    /* renamed from: c */
    private View f51307c;
    /* renamed from: d */
    private View f51308d;
    /* renamed from: e */
    private TextWatcher f51309e;

    @UiThread
    public ExitSurveyFeedbackActivity_ViewBinding(final ExitSurveyFeedbackActivity exitSurveyFeedbackActivity, View view) {
        this.f51306b = exitSurveyFeedbackActivity;
        exitSurveyFeedbackActivity.toolbar = (Toolbar) C0761c.b(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        exitSurveyFeedbackActivity.feedbackCard = C0761c.a(view, R.id.exitSurveyFeedbackCard, "field 'feedbackCard'");
        exitSurveyFeedbackActivity.reasonsRecycler = (RecyclerView) C0761c.b(view, R.id.exitSurveyFeedbackRecyclerView, "field 'reasonsRecycler'", RecyclerView.class);
        exitSurveyFeedbackActivity.submitButtonText = (TextView) C0761c.b(view, R.id.exitSurveyFeedbackSubmitText, "field 'submitButtonText'", TextView.class);
        View a = C0761c.a(view, R.id.exitSurveyFeedbackSubmitButton, "field 'submitButton' and method 'onSubmitClicked'");
        exitSurveyFeedbackActivity.submitButton = a;
        this.f51307c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ExitSurveyFeedbackActivity_ViewBinding f51305b;

            public void doClick(View view) {
                exitSurveyFeedbackActivity.onSubmitClicked();
            }
        });
        a = C0761c.a(view, R.id.exitSurveyFeedbackEditText, "field 'feedbackEditText' and method 'onTextChanged'");
        exitSurveyFeedbackActivity.feedbackEditText = (EditText) C0761c.c(a, R.id.exitSurveyFeedbackEditText, "field 'feedbackEditText'", EditText.class);
        this.f51308d = a;
        this.f51309e = new TextWatcher(this) {
            /* renamed from: b */
            final /* synthetic */ ExitSurveyFeedbackActivity_ViewBinding f46478b;

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                exitSurveyFeedbackActivity.onTextChanged(charSequence);
            }
        };
        ((TextView) a).addTextChangedListener(this.f51309e);
        exitSurveyFeedbackActivity.feedbackEditTextLabel = (TextView) C0761c.b(view, R.id.exitSurveyFeedbackEditTextLabel, "field 'feedbackEditTextLabel'", TextView.class);
        exitSurveyFeedbackActivity.titleText = (TextView) C0761c.b(view, R.id.titleText, "field 'titleText'", TextView.class);
        exitSurveyFeedbackActivity.subtitleText = (TextView) C0761c.b(view, R.id.subtitleText, "field 'subtitleText'", TextView.class);
        view = view.getContext();
        Resources resources = view.getResources();
        exitSurveyFeedbackActivity.buttonEnabledTextColor = C0432b.c(view, R.color.onboarding_title_color);
        exitSurveyFeedbackActivity.buttonDisabledTextColor = C0432b.c(view, R.color.exit_survey_button_disabled_text);
        exitSurveyFeedbackActivity.deleteString = resources.getString(R.string.delete_account);
    }

    @CallSuper
    public void unbind() {
        ExitSurveyFeedbackActivity exitSurveyFeedbackActivity = this.f51306b;
        if (exitSurveyFeedbackActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51306b = null;
        exitSurveyFeedbackActivity.toolbar = null;
        exitSurveyFeedbackActivity.feedbackCard = null;
        exitSurveyFeedbackActivity.reasonsRecycler = null;
        exitSurveyFeedbackActivity.submitButtonText = null;
        exitSurveyFeedbackActivity.submitButton = null;
        exitSurveyFeedbackActivity.feedbackEditText = null;
        exitSurveyFeedbackActivity.feedbackEditTextLabel = null;
        exitSurveyFeedbackActivity.titleText = null;
        exitSurveyFeedbackActivity.subtitleText = null;
        this.f51307c.setOnClickListener(null);
        this.f51307c = null;
        ((TextView) this.f51308d).removeTextChangedListener(this.f51309e);
        this.f51309e = null;
        this.f51308d = null;
    }
}
