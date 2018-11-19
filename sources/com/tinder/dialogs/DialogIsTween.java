package com.tinder.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.tinder.R;
import com.tinder.managers.ManagerApp;
import com.tinder.presenters.PresenterDialogIsTween;
import com.tinder.targets.TargetIsTweenDialog;
import com.tinder.utils.ad;
import com.tinder.utils.at;
import javax.inject.Inject;

public class DialogIsTween extends Dialog implements OnCancelListener, TargetIsTweenDialog {
    @Inject
    /* renamed from: a */
    PresenterDialogIsTween f35948a;
    /* renamed from: b */
    private Unbinder f35949b = ButterKnife.a(this);
    /* renamed from: c */
    private boolean f35950c;
    @BindView(2131362313)
    ViewGroup mEditTextContainer;
    @BindView(2131362310)
    TextView mIsTweenBody;
    @BindView(2131362312)
    EditText mIsTweenEditText;
    @BindView(2131362311)
    Button mTweenButton;

    public DialogIsTween(Context context) {
        super(context, R.style.Theme.FloatingDialog);
        setContentView(R.layout.dialog_is_tween);
        ManagerApp.e().inject(this);
        setOnCancelListener(this);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35948a.a(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35948a.a();
    }

    /* renamed from: a */
    public void m43817a(boolean z) {
        this.f35950c = z;
        if (this.f35950c) {
            this.f35948a.b();
            this.mEditTextContainer.setVisibility(0);
            this.mIsTweenBody.setText(R.string.is_tween_body_collect_email);
            this.f35948a.a(this.mIsTweenBody);
            this.mTweenButton.setText(R.string.is_tween_button_text_collect_email);
            return;
        }
        this.mEditTextContainer.setVisibility(8);
        this.mIsTweenBody.setText(R.string.is_tween_body_no_collect_email);
        this.f35948a.a(this.mIsTweenBody);
        this.mTweenButton.setText(R.string.okay);
    }

    @OnClick({2131362311})
    public void checkCollectEmail() {
        if (this.f35950c) {
            collectEmail();
            return;
        }
        this.f35948a.c();
        ad.a("mIsTweenCollectEmail is false");
    }

    public void collectEmail() {
        this.f35948a.a(this.mIsTweenEditText.getText().toString());
        ad.a("mIsTweenCollectEmail is true");
    }

    public void showToastSendEmailFail() {
        at.a(this.mIsTweenBody.getRootView(), R.string.is_tween_notify_me_button_fail);
    }

    public void showToastSendEmailSuccess() {
        at.a(this.mIsTweenBody.getRootView(), R.string.is_tween_notify_me_button_success);
    }

    public void showEmailFacebookLoadSuccess(String str) {
        this.mIsTweenEditText.setText(str);
    }

    public void showEmailPlaceholderFacebookLoadFail() {
        this.mIsTweenEditText.setText(R.string.is_tween_email_address_field_empty);
        ad.c("Email did not load");
    }

    public void dismissDialog() {
        dismiss();
        this.f35949b.unbind();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f35948a.c();
    }
}
