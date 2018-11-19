package com.tinder.auth.accountkit;

import android.app.Fragment;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.ui.LoginFlowState;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.model.AuthType;
import com.tinder.managers.ManagerApp;
import javax.inject.Inject;

public class LoginAccountKitUiManager extends TinderAccountKitUiManager {
    public static final Creator<LoginAccountKitUiManager> CREATOR = new C82671();
    @Inject
    @NonNull
    C10333h authAnalyticsInteractor;

    /* renamed from: com.tinder.auth.accountkit.LoginAccountKitUiManager$1 */
    static class C82671 implements Creator<LoginAccountKitUiManager> {
        C82671() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m35310a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m35311a(i);
        }

        /* renamed from: a */
        public LoginAccountKitUiManager m35310a(Parcel parcel) {
            return new LoginAccountKitUiManager(parcel);
        }

        /* renamed from: a */
        public LoginAccountKitUiManager[] m35311a(int i) {
            return new LoginAccountKitUiManager[i];
        }
    }

    public LoginAccountKitUiManager(int i, C10333h c10333h) {
        super(i);
        this.authAnalyticsInteractor = c10333h;
    }

    public LoginAccountKitUiManager(Parcel parcel) {
        super(parcel);
        ManagerApp.e().inject(this);
    }

    @Nullable
    public Fragment getBodyFragment(@NonNull LoginFlowState loginFlowState) {
        this.authAnalyticsInteractor.m42126a(loginFlowState);
        return super.getBodyFragment(loginFlowState);
    }

    public void onError(@Nullable AccountKitError accountKitError) {
        super.onError(accountKitError);
        if (accountKitError != null) {
            this.authAnalyticsInteractor.m42128a(AuthType.ACCOUNTKIT, accountKitError.getDetailErrorCode());
        } else {
            this.authAnalyticsInteractor.m42140c(AuthType.ACCOUNTKIT);
        }
    }
}
