package com.tinder.profile.view;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.activities.ActivityEditProfile;
import com.tinder.deadshot.Deadshot;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.model.Profile;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.profile.presenter.C14429h;
import com.tinder.profile.target.CurrentUserProfileTarget;
import com.tinder.profile.view.BasicInfoView.OnExitClickListener;
import javax.inject.Inject;

public class CurrentUserProfileView extends FrameLayout implements CurrentUserProfileTarget {
    @Inject
    /* renamed from: a */
    C14429h f50228a;
    @Nullable
    /* renamed from: b */
    OnExitClickListener f50229b;
    @BindView(2131363336)
    ProfileView profileView;

    public CurrentUserProfileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.view_current_user_profile, this);
        if (isInEditMode() == null) {
            ((ProfileComponentProvider) C14398a.m54830a(context)).provideComponent().inject(this);
        }
        ButterKnife.a(this);
        Deadshot.take(this, this.f50228a);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    /* renamed from: a */
    public void m61012a() {
        this.f50228a.m55081a();
    }

    public void bindProfile(@NonNull Profile profile) {
        this.profileView.a(ProfileScreenSource.HOME);
        this.profileView.a(profile);
        this.profileView.setOnExitClickListener(this.f50229b);
    }

    @OnClick({2131363292})
    void onProfileFabEditClick() {
        this.f50228a.m55086c();
    }

    public void showEditProfile() {
        Intent intent = new Intent(getContext(), ActivityEditProfile.class);
        intent.addFlags(65536);
        intent.putExtra("instagramConnectValue", 1);
        getContext().startActivity(intent);
    }

    public void setOnExitClickListener(OnExitClickListener onExitClickListener) {
        this.f50229b = onExitClickListener;
    }
}
