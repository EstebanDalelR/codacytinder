package com.tinder.profile.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.managers.ManagerApp;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.module.ProfileComponent;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.view.BasicInfoView.OnExitClickListener;
import com.tinder.profile.view.MatchProfileView;

public class MatchProfileActivity extends ActivitySignedInBase implements ProfileComponentProvider {
    /* renamed from: a */
    private ProfileComponent f59985a;
    /* renamed from: b */
    private OnExitClickListener f59986b = new C16069b(this);
    @BindView(2131362912)
    MatchProfileView matchProfileView;

    /* renamed from: a */
    public static Intent m68683a(@NonNull Context context, @NonNull String str, @NonNull String str2, ProfileScreenSource profileScreenSource) {
        Intent intent = new Intent(context, MatchProfileActivity.class);
        intent.putExtra(ManagerWebServices.PARAM_USER_ID, str);
        intent.putExtra("matchId", str2);
        intent.putExtra("profileAnalyticsSource", profileScreenSource);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f59985a = ManagerApp.e().profileComponentBuilder().profileActivityContext(this).build();
        this.f59985a.inject(this);
        setContentView(R.layout.activity_match_profile);
        ButterKnife.a(this);
        this.matchProfileView.setOnExitClickListener(this.f59986b);
        bundle = getIntent();
        String stringExtra = bundle.getStringExtra(ManagerWebServices.PARAM_USER_ID);
        String stringExtra2 = bundle.getStringExtra("matchId");
        ProfileScreenSource profileScreenSource = (ProfileScreenSource) bundle.getSerializableExtra("profileAnalyticsSource");
        if (stringExtra != null) {
            MatchProfileView matchProfileView = this.matchProfileView;
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = "";
            }
            matchProfileView.m61016a(stringExtra, stringExtra2);
        }
        this.matchProfileView.m61015a(profileScreenSource);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.f59985a = null;
    }

    public ProfileComponent provideComponent() {
        return this.f59985a;
    }
}
