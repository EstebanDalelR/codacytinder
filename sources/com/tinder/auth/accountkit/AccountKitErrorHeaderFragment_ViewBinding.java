package com.tinder.auth.accountkit;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class AccountKitErrorHeaderFragment_ViewBinding implements Unbinder {
    /* renamed from: b */
    private AccountKitErrorHeaderFragment f33731b;

    @UiThread
    public AccountKitErrorHeaderFragment_ViewBinding(AccountKitErrorHeaderFragment accountKitErrorHeaderFragment, View view) {
        this.f33731b = accountKitErrorHeaderFragment;
        accountKitErrorHeaderFragment.mErrorText = (TextView) C0761c.b(view, R.id.accountkit_error_text, "field 'mErrorText'", TextView.class);
        view = view.getContext().getResources();
        accountKitErrorHeaderFragment.mDefaultErrorMessage = view.getString(R.string.reported_warning_accept_agreement_error);
        accountKitErrorHeaderFragment.mPhoneNumberInvalidMessage = view.getString(R.string.error_invalid_phone);
        accountKitErrorHeaderFragment.mAccountKItErrorMsgTemplate = view.getString(R.string.accountkit_error_message_template);
    }

    @CallSuper
    public void unbind() {
        AccountKitErrorHeaderFragment accountKitErrorHeaderFragment = this.f33731b;
        if (accountKitErrorHeaderFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f33731b = null;
        accountKitErrorHeaderFragment.mErrorText = null;
    }
}
