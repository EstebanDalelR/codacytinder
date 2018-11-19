package com.tinder.profile.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.managers.ManagerApp;
import com.tinder.profile.module.ProfileComponent;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.view.BasicInfoView.OnExitClickListener;
import com.tinder.profile.view.CurrentUserProfileView;

public class CurrentUserProfileActivity extends ActivitySignedInBase implements ProfileComponentProvider {
    @Nullable
    /* renamed from: a */
    private ProfileComponent f59983a;
    /* renamed from: b */
    private OnExitClickListener f59984b = new C16068a(this);
    @BindView(2131362275)
    CurrentUserProfileView currentUserProfileView;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f59983a = ManagerApp.e().profileComponentBuilder().profileActivityContext(this).build();
        this.f59983a.inject(this);
        setContentView(R.layout.activity_current_user_profile);
        ButterKnife.a(this);
        this.currentUserProfileView.setOnExitClickListener(this.f59984b);
    }

    public void onResume() {
        super.onResume();
        this.currentUserProfileView.m61012a();
    }

    protected void onDestroy() {
        super.onDestroy();
        this.f59983a = null;
    }

    public ProfileComponent provideComponent() {
        return this.f59983a;
    }
}
