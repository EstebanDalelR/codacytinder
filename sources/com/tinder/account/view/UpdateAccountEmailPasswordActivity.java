package com.tinder.account.view;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.graphics.drawable.C0450a;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnPageChange;
import com.tinder.R;
import com.tinder.account.model.UpdateAccountException;
import com.tinder.account.p072a.C4298a;
import com.tinder.base.view.LockableViewPager;
import com.tinder.dialogs.AccountUpdateCancelConfirmDialog;
import com.tinder.dialogs.AccountUpdateCancelConfirmDialog.C8844a;
import com.tinder.dialogs.AccountUpdateCancelConfirmDialog.OnButtonClickedListener;
import com.tinder.dialogs.DialogError;
import com.tinder.managers.ManagerApp;
import com.tinder.utils.av;
import java8.util.Optional;
import javax.inject.Inject;

public class UpdateAccountEmailPasswordActivity extends AppCompatActivity implements UpdateEmailPasswordTarget, C6152d {
    @Inject
    /* renamed from: a */
    C4298a f29416a;
    @BindView(2131363921)
    Button actionButton;
    /* renamed from: b */
    private ProgressDialog f29417b;
    /* renamed from: c */
    private final C7274e f29418c = new C7274e();
    @BindDrawable(2131231231)
    Drawable closeIcon;
    /* renamed from: d */
    private final C8844a f29419d = AccountUpdateCancelConfirmDialog.a(this).a(new C72691(this));
    @Nullable
    /* renamed from: e */
    private AccountUpdateCancelConfirmDialog f29420e;
    @BindString(2131821313)
    String loadingString;
    @BindColor(2131100037)
    int navIconColor;
    @BindView(2131363923)
    TextView titleTextView;
    @BindView(2131363924)
    Toolbar toolbar;
    @BindView(2131363925)
    LockableViewPager viewPager;

    public interface FlowResponder {
        boolean handleError(@NonNull UpdateAccountException updateAccountException);

        Optional<String> onActionButtonClicked();
    }

    /* renamed from: com.tinder.account.view.UpdateAccountEmailPasswordActivity$1 */
    class C72691 implements OnButtonClickedListener {
        /* renamed from: a */
        final /* synthetic */ UpdateAccountEmailPasswordActivity f26168a;

        C72691(UpdateAccountEmailPasswordActivity updateAccountEmailPasswordActivity) {
            this.f26168a = updateAccountEmailPasswordActivity;
        }

        public void onNegativeButtonClicked(@NonNull AccountUpdateCancelConfirmDialog accountUpdateCancelConfirmDialog) {
            this.f26168a.f29416a.c(this.f26168a.m35084b());
            accountUpdateCancelConfirmDialog.dismiss();
        }

        public void onPositiveButtonClicked(@NonNull AccountUpdateCancelConfirmDialog accountUpdateCancelConfirmDialog) {
            this.f26168a.f29416a.b(this.f26168a.m35084b());
            accountUpdateCancelConfirmDialog.dismiss();
            this.f26168a.finish();
        }
    }

    /* renamed from: a */
    public static Intent m35081a(@NonNull Context context) {
        return new Intent(context, UpdateAccountEmailPasswordActivity.class);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.update_account_email_password_activity);
        ButterKnife.a(this);
        ManagerApp.e().inject(this);
        m35083a();
        this.viewPager.setAdapter(this.f29418c);
        this.viewPager.setPagingEnabled(false);
        this.f29417b = new ProgressDialog(this);
        this.f29417b.setMessage(this.loadingString);
        this.f29417b.setIndeterminate(true);
        this.f29417b.setCancelable(false);
    }

    @OnPageChange({2131363925})
    void onPageSelected(int i) {
        this.titleTextView.setText(this.f29418c.m31097a(i).getTitleResId());
    }

    @OnClick({2131363921})
    void onActionButtonClicked() {
        this.f29416a.a(m35084b(), m35085c());
    }

    protected void onStart() {
        super.onStart();
        this.f29416a.a(this);
    }

    protected void onResume() {
        super.onResume();
        this.f29416a.q_();
    }

    public void onBackPressed() {
        this.f29416a.a(m35084b());
    }

    protected void onPause() {
        super.onPause();
        av.a(this.f29420e);
    }

    protected void onStop() {
        super.onStop();
        this.f29416a.a();
    }

    public void showProgressDialog() {
        this.f29417b.show();
    }

    public void hideProgressDialog() {
        av.a(this.f29417b);
    }

    /* renamed from: a */
    public void mo8483a(boolean z) {
        this.actionButton.setEnabled(z);
    }

    public void showCancelDialog(@StringRes int i) {
        this.f29420e = this.f29419d.a(i).a();
        this.f29420e.show();
    }

    public void showGenericError() {
        DialogError.a(this).a(R.string.onboarding_error_dialog_title).a().show();
    }

    public void forwardUpdateException(@NonNull UpdateAccountException updateAccountException) {
        if (m35085c().handleError(updateAccountException) == null) {
            showGenericError();
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m35087a(Integer num) {
        this.viewPager.setCurrentItem(num.intValue(), true);
    }

    public void showPage(@NonNull UpdateAccountPage updateAccountPage) {
        this.f29418c.m31098a(updateAccountPage).a(new C7272a(this));
    }

    public void disableSubmitButton() {
        mo8483a(false);
    }

    /* renamed from: a */
    private void m35083a() {
        setSupportActionBar(this.toolbar);
        this.closeIcon = C0450a.g(this.closeIcon);
        C0450a.a(this.closeIcon, this.navIconColor);
        this.toolbar.setNavigationIcon(this.closeIcon);
        this.toolbar.setNavigationOnClickListener(new C6151b(this));
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    /* renamed from: a */
    final /* synthetic */ void m35086a(View view) {
        onBackPressed();
    }

    @NonNull
    /* renamed from: b */
    private UpdateAccountPage m35084b() {
        return this.f29418c.m31097a(this.viewPager.getCurrentItem());
    }

    /* renamed from: c */
    private FlowResponder m35085c() {
        View findViewWithTag = this.viewPager.findViewWithTag(m35084b());
        if (findViewWithTag instanceof FlowResponder) {
            return (FlowResponder) findViewWithTag;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View: ");
        stringBuilder.append(findViewWithTag.getClass().getSimpleName());
        stringBuilder.append(" should implement ");
        stringBuilder.append(FlowResponder.class.getSimpleName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
