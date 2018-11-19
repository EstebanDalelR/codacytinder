package com.tinder.settings.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import com.tinder.R;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.deadshot.Deadshot;
import com.tinder.managers.ManagerApp;
import com.tinder.settings.adapters.ExitSurveyFeedbackReasonAdapter;
import com.tinder.settings.model.ExitSurveyDetailReason;
import com.tinder.settings.model.ExitSurveyDetailsMode;
import com.tinder.settings.presenter.C16652g;
import com.tinder.settings.presenter.ExitSurveyBasePresenter.DialogType;
import com.tinder.settings.presenter.ExitSurveyBasePresenter.HideSource;
import com.tinder.settings.targets.ExitSurveyFeedbackTarget;
import com.tinder.settings.views.DeleteConfirmDialog;
import com.tinder.settings.views.DeleteConfirmDialog.DeleteConfirmListener;
import com.tinder.settings.views.DeleteConfirmDialog.Type;
import com.tinder.settings.views.PauseConfirmDialog;
import com.tinder.settings.views.PauseConfirmDialog.PauseConfirmListener;
import com.tinder.utils.at;
import com.tinder.utils.av;
import java.util.List;
import javax.inject.Inject;
import org.joda.time.Period;

public class ExitSurveyFeedbackActivity extends ActivitySignedInBase implements ExitSurveyFeedbackTarget {
    @Inject
    /* renamed from: a */
    C16652g f59988a;
    /* renamed from: b */
    private ExitSurveyFeedbackReasonAdapter f59989b;
    @BindColor(2131099843)
    int buttonDisabledTextColor;
    @BindColor(2131100048)
    int buttonEnabledTextColor;
    /* renamed from: c */
    private ExitSurveyDetailsMode f59990c;
    @BindString(2131820899)
    String deleteString;
    @BindView(2131362412)
    View feedbackCard;
    @BindView(2131362413)
    EditText feedbackEditText;
    @BindView(2131362414)
    TextView feedbackEditTextLabel;
    @BindView(2131362417)
    RecyclerView reasonsRecycler;
    @BindView(2131362418)
    View submitButton;
    @BindView(2131362419)
    TextView submitButtonText;
    @BindView(2131363715)
    TextView subtitleText;
    @BindView(2131363802)
    TextView titleText;
    @BindView(2131363818)
    Toolbar toolbar;

    /* renamed from: com.tinder.settings.activity.ExitSurveyFeedbackActivity$1 */
    class C165951 implements DeleteConfirmListener {
        /* renamed from: a */
        final /* synthetic */ ExitSurveyFeedbackActivity f51302a;

        C165951(ExitSurveyFeedbackActivity exitSurveyFeedbackActivity) {
            this.f51302a = exitSurveyFeedbackActivity;
        }

        public void backPressed() {
            this.f51302a.f59988a.m56353b(DialogType.DELETE_CONFIRM);
        }

        public void cancelButtonClicked() {
            this.f51302a.f59988a.m56349a(DialogType.DELETE_CONFIRM);
        }

        public void hideMyAccountClicked() {
            this.f51302a.f59988a.m56350a(HideSource.ARE_YOU_SURE_DIALOG);
        }

        public void deleteMyAccountClicked() {
            this.f51302a.f59988a.m56359e();
        }
    }

    /* renamed from: com.tinder.settings.activity.ExitSurveyFeedbackActivity$2 */
    class C165962 implements PauseConfirmListener {
        /* renamed from: a */
        final /* synthetic */ ExitSurveyFeedbackActivity f51303a;

        C165962(ExitSurveyFeedbackActivity exitSurveyFeedbackActivity) {
            this.f51303a = exitSurveyFeedbackActivity;
        }

        public void backPressed() {
            this.f51303a.f59988a.m56353b(DialogType.PAUSE_CONFIRM);
        }

        public void cancelButtonClicked() {
            this.f51303a.f59988a.m56349a(DialogType.PAUSE_CONFIRM);
        }

        public void pauseSelected(@Nullable Period period) {
            this.f51303a.f59988a.m56351a(period);
        }
    }

    /* renamed from: com.tinder.settings.activity.ExitSurveyFeedbackActivity$a */
    private static class C18058a extends LinearLayoutManager {
        C18058a(Context context) {
            super(context);
        }
    }

    /* renamed from: a */
    static Intent m68686a(Context context, ExitSurveyDetailsMode exitSurveyDetailsMode) {
        Intent intent = new Intent(context, ExitSurveyFeedbackActivity.class);
        intent.putExtra("EXTRA_MODE", exitSurveyDetailsMode.getId());
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_exit_survey_feedback);
        this.f59990c = ExitSurveyDetailsMode.findByValue(getIntent().getIntExtra("EXTRA_MODE", 0));
        ManagerApp.g().inject(this);
        ButterKnife.a(this);
        this.toolbar.setNavigationOnClickListener(new C14847d(this));
        this.toolbar.setTitle(this.deleteString);
        m68687d();
        disableSubmitButton();
    }

    /* renamed from: a */
    final /* synthetic */ void m68688a(View view) {
        onBackPressed();
    }

    public void onBackPressed() {
        this.f59988a.mo12304h();
    }

    protected void onStart() {
        super.onStart();
        Deadshot.take(this, this.f59988a);
        this.f59988a.m62122a(this.f59990c);
    }

    protected void onStop() {
        super.onStop();
        Deadshot.drop(this);
    }

    @OnClick({2131362418})
    public void onSubmitClicked() {
        this.f59988a.m62124a(this.feedbackEditText.getText().toString());
    }

    public void closeView(int i) {
        setResult(i);
        supportFinishAfterTransition();
    }

    public void showAccountHideFailed() {
        at.m57644b((Activity) this, (int) R.string.error_profile_update);
    }

    public void showTextInputField(boolean z) {
        if (z) {
            av.a(new View[]{this.feedbackEditText, this.feedbackEditTextLabel});
            return;
        }
        av.c(new View[]{this.feedbackEditText, this.feedbackEditTextLabel});
    }

    public void setTextInputTitle(@StringRes int i) {
        this.feedbackEditTextLabel.setText(getString(i));
    }

    public void setSubtitleText(@StringRes int i) {
        this.subtitleText.setText(i);
    }

    public void setTitleText(@StringRes int i) {
        this.toolbar.setTitle(i);
        this.titleText.setText(i);
    }

    public void hideReasons() {
        av.c(new View[]{this.feedbackCard});
    }

    public void showReasons(List<? extends ExitSurveyDetailReason> list) {
        this.f59989b.m62048a((List) list);
    }

    public void enableSubmitButton() {
        this.submitButton.setEnabled(true);
        this.submitButtonText.setEnabled(true);
    }

    public void disableSubmitButton() {
        this.submitButton.setEnabled(false);
        this.submitButtonText.setEnabled(false);
    }

    public void showConfirmDialog(@NonNull Type type) {
        DeleteConfirmDialog deleteConfirmDialog = new DeleteConfirmDialog(this, type);
        deleteConfirmDialog.m65655a(new C165951(this));
        deleteConfirmDialog.show();
    }

    public void showPauseDialog(@StringRes int i) {
        new PauseConfirmDialog(this, i, new C165962(this)).show();
    }

    public void setConfirmButtonText(@StringRes int i) {
        this.submitButtonText.setText(i);
    }

    @OnTextChanged({2131362413})
    public void onTextChanged(CharSequence charSequence) {
        this.f59988a.m62123a(charSequence);
    }

    /* renamed from: d */
    private void m68687d() {
        this.reasonsRecycler.setLayoutManager(new C18058a(this));
        this.f59989b = new ExitSurveyFeedbackReasonAdapter();
        this.f59989b.m62046a(new C16609e(this));
        this.reasonsRecycler.setAdapter(this.f59989b);
    }

    /* renamed from: a */
    final /* synthetic */ void m68689a(ExitSurveyDetailReason exitSurveyDetailReason, boolean z) {
        this.f59988a.m62121a(exitSurveyDetailReason, z);
    }
}
