package com.tinder.account.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.view.View;
import com.tinder.R;
import com.tinder.account.view.C7274e.C6153a;

public enum UpdateAccountPage implements C6153a {
    PASSWORD(R.string.add_password_to_secure_account, R.string.no_password_warning) {
        public View instantiate(@NonNull Context context) {
            return new UpdatePasswordView(context);
        }
    },
    EMAIL(R.string.add_email_to_secure_account, R.string.no_email_warning) {
        public View instantiate(@NonNull Context context) {
            return new UpdateEmailView(context);
        }
    };
    
    @StringRes
    private final int cancelWarningResId;
    @StringRes
    private final int titleResId;

    private UpdateAccountPage(int i, int i2) {
        this.titleResId = i;
        this.cancelWarningResId = i2;
    }

    @StringRes
    public int getTitleResId() {
        return this.titleResId;
    }

    @StringRes
    public int getCancelWarningResId() {
        return this.cancelWarningResId;
    }
}
