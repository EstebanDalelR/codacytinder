package com.tinder.auth.accountkit;

import android.app.Fragment;
import android.os.Parcel;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.ui.BaseUIManager;
import com.facebook.accountkit.ui.LoginFlowState;

public abstract class TinderAccountKitUiManager extends BaseUIManager {
    @NonNull
    private final AccountKitErrorHeaderFragment errorHeaderFragment = AccountKitErrorHeaderFragment.m42098a();

    public TinderAccountKitUiManager(int i) {
        super(i);
    }

    public TinderAccountKitUiManager(Parcel parcel) {
        super(parcel);
    }

    @Nullable
    public Fragment getHeaderFragment(@Nullable LoginFlowState loginFlowState) {
        return LoginFlowState.ERROR == loginFlowState ? this.errorHeaderFragment : null;
    }

    public void onError(@Nullable AccountKitError accountKitError) {
        this.errorHeaderFragment.m42100a(accountKitError);
    }
}
