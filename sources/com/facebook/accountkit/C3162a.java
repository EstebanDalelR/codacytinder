package com.facebook.accountkit;

import android.content.Intent;
import com.facebook.accountkit.internal.LoginStatus;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.accountkit.a */
public abstract class C3162a extends C1198e {
    /* renamed from: a */
    protected abstract void mo3234a(AccountKitException accountKitException);

    /* renamed from: a */
    protected abstract void mo3235a(EmailLoginModel emailLoginModel);

    /* renamed from: b */
    protected abstract void mo3236b(EmailLoginModel emailLoginModel);

    /* renamed from: c */
    protected abstract void mo3237c(EmailLoginModel emailLoginModel);

    /* renamed from: d */
    protected abstract void mo3238d(EmailLoginModel emailLoginModel);

    /* renamed from: a */
    protected List<String> mo1563a() {
        return Collections.singletonList("com.facebook.accountkit.sdk.ACTION_EMAIL_LOGIN_STATE_CHANGED");
    }

    /* renamed from: a */
    protected void mo1564a(Intent intent) {
        EmailLoginModel emailLoginModel = (EmailLoginModel) intent.getParcelableExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_MODEL");
        LoginStatus loginStatus = (LoginStatus) intent.getSerializableExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_STATUS");
        if (emailLoginModel != null) {
            if (loginStatus != null) {
                switch (loginStatus) {
                    case PENDING:
                        mo3235a(emailLoginModel);
                        break;
                    case ACCOUNT_VERIFIED:
                        mo3238d(emailLoginModel);
                        break;
                    case SUCCESS:
                        mo3236b(emailLoginModel);
                        break;
                    case CANCELLED:
                        mo3237c(emailLoginModel);
                        break;
                    case ERROR:
                        AccountKitError accountKitError = (AccountKitError) intent.getParcelableExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_ERROR");
                        if (accountKitError != null) {
                            mo3234a(new AccountKitException(accountKitError));
                            break;
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
