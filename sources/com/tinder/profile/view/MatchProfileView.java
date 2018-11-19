package com.tinder.profile.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.model.Profile;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.profile.presenter.C14434z;
import com.tinder.profile.target.MatchProfileTarget;
import com.tinder.profile.view.BasicInfoView.OnExitClickListener;
import javax.inject.Inject;

public class MatchProfileView extends FrameLayout implements MatchProfileTarget {
    @Inject
    /* renamed from: a */
    C14434z f50239a;
    @Nullable
    /* renamed from: b */
    OnExitClickListener f50240b;
    @BindView(2131363336)
    ProfileView profileView;

    public MatchProfileView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.view_match_profile, this);
        if (isInEditMode() == null) {
            ((ProfileComponentProvider) C14398a.m54830a(context)).provideComponent().inject(this);
        }
        ButterKnife.a(this);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Deadshot.take(this, this.f50239a);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void showProfile(@NonNull Profile profile, @Nullable String str) {
        this.profileView.a(ProfileScreenSource.CHAT);
        this.profileView.a(profile, str);
        this.profileView.setOnExitClickListener(this.f50240b);
    }

    /* renamed from: a */
    public void m61016a(@NonNull String str, @NonNull String str2) {
        this.f50239a.m55111a(str, str2);
    }

    public void setOnExitClickListener(OnExitClickListener onExitClickListener) {
        this.f50240b = onExitClickListener;
    }

    /* renamed from: a */
    public void m61015a(ProfileScreenSource profileScreenSource) {
        this.profileView.a(profileScreenSource);
    }
}
