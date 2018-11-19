package com.tinder.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class AccountUpdateCancelConfirmDialog_ViewBinding implements Unbinder {
    /* renamed from: b */
    private AccountUpdateCancelConfirmDialog f35944b;
    /* renamed from: c */
    private View f35945c;
    /* renamed from: d */
    private View f35946d;

    @UiThread
    public AccountUpdateCancelConfirmDialog_ViewBinding(final AccountUpdateCancelConfirmDialog accountUpdateCancelConfirmDialog, View view) {
        this.f35944b = accountUpdateCancelConfirmDialog;
        accountUpdateCancelConfirmDialog.bodyTextView = (TextView) C0761c.b(view, R.id.account_update_cancel_confirm_dialog_body, "field 'bodyTextView'", TextView.class);
        View a = C0761c.a(view, R.id.account_update_cancel_confirm_dialog_negative_button, "method 'onNegativeButtonClicked'");
        this.f35945c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ AccountUpdateCancelConfirmDialog_ViewBinding f35941b;

            public void doClick(View view) {
                accountUpdateCancelConfirmDialog.onNegativeButtonClicked();
            }
        });
        view = C0761c.a(view, R.id.account_update_cancel_confirm_dialog_positive_button, "method 'onPositiveButtonClicked'");
        this.f35946d = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ AccountUpdateCancelConfirmDialog_ViewBinding f35943b;

            public void doClick(View view) {
                accountUpdateCancelConfirmDialog.onPositiveButtonClicked();
            }
        });
    }

    @CallSuper
    public void unbind() {
        AccountUpdateCancelConfirmDialog accountUpdateCancelConfirmDialog = this.f35944b;
        if (accountUpdateCancelConfirmDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f35944b = null;
        accountUpdateCancelConfirmDialog.bodyTextView = null;
        this.f35945c.setOnClickListener(null);
        this.f35945c = null;
        this.f35946d.setOnClickListener(null);
        this.f35946d = null;
    }
}
