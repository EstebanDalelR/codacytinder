package com.facebook.accountkit;

import android.content.Intent;
import com.facebook.accountkit.internal.LoginStatus;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.accountkit.c */
public abstract class C3163c extends C1198e {
    /* renamed from: a */
    private String f9733a;

    /* renamed from: a */
    protected abstract void mo3239a(AccountKitException accountKitException);

    /* renamed from: a */
    protected abstract void mo3240a(PhoneLoginModel phoneLoginModel);

    /* renamed from: b */
    protected abstract void mo3241b(PhoneLoginModel phoneLoginModel);

    /* renamed from: c */
    protected abstract void mo3242c(PhoneLoginModel phoneLoginModel);

    /* renamed from: d */
    protected abstract void mo3243d(PhoneLoginModel phoneLoginModel);

    /* renamed from: b */
    public String mo1565b() {
        return this.f9733a;
    }

    /* renamed from: a */
    public void m12190a(String str) {
        this.f9733a = str;
    }

    /* renamed from: a */
    protected List<String> mo1563a() {
        return Collections.singletonList("com.facebook.accountkit.sdk.ACTION_PHONE_LOGIN_STATE_CHANGED");
    }

    /* renamed from: a */
    protected void mo1564a(Intent intent) {
        PhoneLoginModel phoneLoginModel = (PhoneLoginModel) intent.getParcelableExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_MODEL");
        LoginStatus loginStatus = (LoginStatus) intent.getSerializableExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_STATUS");
        if (phoneLoginModel != null) {
            if (loginStatus != null) {
                switch (loginStatus) {
                    case PENDING:
                        mo3240a(phoneLoginModel);
                        break;
                    case ACCOUNT_VERIFIED:
                        mo3241b(phoneLoginModel);
                        break;
                    case SUCCESS:
                        mo3242c(phoneLoginModel);
                        break;
                    case CANCELLED:
                        mo3243d(phoneLoginModel);
                        break;
                    case ERROR:
                        AccountKitError accountKitError = (AccountKitError) intent.getParcelableExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_ERROR");
                        if (accountKitError != null) {
                            m12190a("");
                            mo3239a(new AccountKitException(accountKitError));
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
