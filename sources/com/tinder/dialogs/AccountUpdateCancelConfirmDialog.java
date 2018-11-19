package com.tinder.dialogs;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatDialog;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;

public class AccountUpdateCancelConfirmDialog extends AppCompatDialog {
    @Nullable
    /* renamed from: a */
    private final OnButtonClickedListener f41801a;
    @BindView(2131361807)
    TextView bodyTextView;

    public interface OnButtonClickedListener {
        void onNegativeButtonClicked(@NonNull AccountUpdateCancelConfirmDialog accountUpdateCancelConfirmDialog);

        void onPositiveButtonClicked(@NonNull AccountUpdateCancelConfirmDialog accountUpdateCancelConfirmDialog);
    }

    /* renamed from: com.tinder.dialogs.AccountUpdateCancelConfirmDialog$a */
    public static class C8844a {
        @StringRes
        /* renamed from: a */
        int f30982a;
        @NonNull
        /* renamed from: b */
        private Context f30983b;
        @Nullable
        /* renamed from: c */
        private OnButtonClickedListener f30984c;

        private C8844a(@NonNull Context context) {
            this.f30983b = context;
        }

        /* renamed from: a */
        public C8844a m37605a(@StringRes int i) {
            this.f30982a = i;
            return this;
        }

        /* renamed from: a */
        public C8844a m37606a(@Nullable OnButtonClickedListener onButtonClickedListener) {
            this.f30984c = onButtonClickedListener;
            return this;
        }

        /* renamed from: a */
        public AccountUpdateCancelConfirmDialog m37607a() {
            return new AccountUpdateCancelConfirmDialog();
        }
    }

    /* renamed from: a */
    public static C8844a m51058a(@NonNull Context context) {
        return new C8844a(context);
    }

    private AccountUpdateCancelConfirmDialog(@NonNull C8844a c8844a) {
        super(c8844a.f30983b, R.style.SimpleCancelConfirmDialog);
        setContentView(R.layout.account_update_cancel_cofirm_dialog);
        ButterKnife.a(this);
        this.bodyTextView.setText(c8844a.f30982a);
        this.f41801a = c8844a.f30984c;
    }

    @OnClick({2131361810})
    void onNegativeButtonClicked() {
        if (this.f41801a != null) {
            this.f41801a.onNegativeButtonClicked(this);
        }
    }

    @OnClick({2131361811})
    void onPositiveButtonClicked() {
        if (this.f41801a != null) {
            this.f41801a.onPositiveButtonClicked(this);
        }
    }
}
