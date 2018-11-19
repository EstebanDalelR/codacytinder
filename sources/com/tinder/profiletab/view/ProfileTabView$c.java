package com.tinder.profiletab.view;

import android.content.Context;
import android.content.Intent;
import com.tinder.activities.ActivityEditProfile;
import com.tinder.activities.MainActivity;
import com.tinder.profiletab.view.ProfileTabView$UserInfoView.Listener;
import com.tinder.settings.activity.SettingsActivity;
import kotlin.Metadata;
import kotlin.TypeCastException;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/tinder/profiletab/view/ProfileTabView$userInfoClickListener$1", "Lcom/tinder/profiletab/view/ProfileTabView$UserInfoView$Listener;", "(Lcom/tinder/profiletab/view/ProfileTabView;Landroid/content/Context;)V", "onAvatarClick", "", "onEditButtonClick", "onMediaButtonClick", "onSettingsButtonClick", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ProfileTabView$c implements Listener {
    /* renamed from: a */
    final /* synthetic */ ProfileTabView f50444a;
    /* renamed from: b */
    final /* synthetic */ Context f50445b;

    ProfileTabView$c(ProfileTabView profileTabView, Context context) {
        this.f50444a = profileTabView;
        this.f50445b = context;
    }

    public void onMediaButtonClick() {
        this.f50444a.getPresenter$Tinder_release().m55285e();
    }

    public void onAvatarClick() {
        this.f50444a.getPresenter$Tinder_release().m55288h();
    }

    public void onEditButtonClick() {
        this.f50444a.getPresenter$Tinder_release().m55286f();
        this.f50445b.startActivity(new Intent(this.f50445b, ActivityEditProfile.class));
    }

    public void onSettingsButtonClick() {
        this.f50444a.getPresenter$Tinder_release().m55287g();
        Context context = this.f50445b;
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.activities.MainActivity");
        }
        ((MainActivity) context).startActivityForResult(new Intent(this.f50444a.getContext(), SettingsActivity.class), 1);
    }
}
