package com.tinder.settings.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.deadshot.Deadshot;
import com.tinder.managers.ManagerApp;
import com.tinder.settings.model.ExitSurveyDetailsMode;
import com.tinder.settings.model.ExitSurveyReason;
import com.tinder.settings.presenter.C16653i;
import com.tinder.settings.presenter.ExitSurveyBasePresenter.DialogType;
import com.tinder.settings.presenter.ExitSurveyBasePresenter.HideSource;
import com.tinder.settings.targets.ExitSurveyTarget;
import com.tinder.settings.views.DeleteConfirmDialog;
import com.tinder.settings.views.DeleteConfirmDialog.DeleteConfirmListener;
import com.tinder.settings.views.DeleteConfirmDialog.Type;
import com.tinder.settings.views.PauseConfirmDialog;
import com.tinder.settings.views.PauseConfirmDialog.PauseConfirmListener;
import com.tinder.settings.views.SurveyReasonGridView;
import com.tinder.utils.at;
import java.util.List;
import javax.inject.Inject;
import org.joda.time.Period;

public class ExitSurveyActivity extends ActivitySignedInBase implements ExitSurveyTarget {
    @Inject
    /* renamed from: a */
    C16653i f59987a;
    @BindString(2131820899)
    String deleteString;
    @BindView(2131362420)
    ViewFlipper flipper;
    @BindView(2131362671)
    TextView hideAccountButton;
    @BindView(2131362288)
    TextView hideAccountTitle;
    @BindView(2131362421)
    SurveyReasonGridView reasonsGrid;
    @BindView(2131363802)
    TextView titleText;
    @BindView(2131363818)
    Toolbar toolbar;

    /* renamed from: com.tinder.settings.activity.ExitSurveyActivity$1 */
    class C165911 implements DeleteConfirmListener {
        /* renamed from: a */
        final /* synthetic */ ExitSurveyActivity f51293a;

        C165911(ExitSurveyActivity exitSurveyActivity) {
            this.f51293a = exitSurveyActivity;
        }

        public void backPressed() {
            this.f51293a.f59987a.m56353b(DialogType.DELETE_CONFIRM);
        }

        public void cancelButtonClicked() {
            this.f51293a.f59987a.m56349a(DialogType.DELETE_CONFIRM);
        }

        public void hideMyAccountClicked() {
            this.f51293a.f59987a.m56350a(HideSource.ARE_YOU_SURE_DIALOG);
        }

        public void deleteMyAccountClicked() {
            this.f51293a.f59987a.m56359e();
        }
    }

    /* renamed from: com.tinder.settings.activity.ExitSurveyActivity$2 */
    class C165922 implements PauseConfirmListener {
        /* renamed from: a */
        final /* synthetic */ ExitSurveyActivity f51294a;

        C165922(ExitSurveyActivity exitSurveyActivity) {
            this.f51294a = exitSurveyActivity;
        }

        public void backPressed() {
            this.f51294a.f59987a.m56353b(DialogType.PAUSE_CONFIRM);
        }

        public void cancelButtonClicked() {
            this.f51294a.f59987a.m56349a(DialogType.PAUSE_CONFIRM);
        }

        public void pauseSelected(@Nullable Period period) {
            this.f51294a.f59987a.m56351a(period);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_exit_survey);
        ManagerApp.g().inject(this);
        ButterKnife.a(this);
        this.toolbar.setNavigationOnClickListener(new C14846a(this));
        this.toolbar.setTitle(this.deleteString);
        this.reasonsGrid.setReasonSelectedlistener(new C16607b(this));
        Deadshot.take(this, this.f59987a);
        this.f59987a.mo12304h();
    }

    /* renamed from: a */
    final /* synthetic */ void m68684a(View view) {
        onBackPressed();
    }

    /* renamed from: a */
    final /* synthetic */ void m68685a(ExitSurveyReason exitSurveyReason) {
        this.f59987a.m62136a(exitSurveyReason);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1 || i2 == 3) {
            super.onActivityResult(i, i2, intent);
        } else {
            closeView(i2);
        }
    }

    protected void onStart() {
        super.onStart();
        Deadshot.take(this, this.f59987a);
    }

    protected void onStop() {
        super.onStop();
        Deadshot.drop(this);
    }

    public void onBackPressed() {
        this.f59987a.m62143k();
    }

    @OnClick({2131363572})
    public void onDeleteMyAccountClicked() {
        this.f59987a.m62141i();
    }

    @OnClick({2131362671})
    public void onHideAccountClicked() {
        this.f59987a.m56350a(HideSource.INTRO_SCREEN);
    }

    public void closeView(int i) {
        setResult(i);
        supportFinishAfterTransition();
        ManagerApp.f();
    }

    public void showAccountHideFailed() {
        at.m57644b((Activity) this, (int) R.string.error_profile_update);
    }

    public void showReasons(List<ExitSurveyReason> list) {
        this.flipper.setDisplayedChild(1);
        this.reasonsGrid.m67318a((List) list);
    }

    public void navigateToDetailsScreen(ExitSurveyDetailsMode exitSurveyDetailsMode) {
        startActivityForResult(ExitSurveyFeedbackActivity.m68686a((Context) this, exitSurveyDetailsMode), 1);
    }

    public void showConfirmDialog(@NonNull Type type) {
        DeleteConfirmDialog deleteConfirmDialog = new DeleteConfirmDialog(this, type);
        deleteConfirmDialog.m65655a(new C165911(this));
        deleteConfirmDialog.show();
    }

    public void showPauseDialog(@StringRes int i) {
        new PauseConfirmDialog(this, i, new C165922(this)).show();
    }

    public void setToolbarText(@StringRes int i) {
        this.toolbar.setTitle(i);
    }

    public void setTitleText(@StringRes int i) {
        this.titleText.setText(i);
    }
}
