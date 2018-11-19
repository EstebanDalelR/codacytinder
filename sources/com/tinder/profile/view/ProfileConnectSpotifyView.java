package com.tinder.profile.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.profile.activities.ProfileSpotifyAuthActivity;
import com.tinder.profile.p365d.C14398a;

public class ProfileConnectSpotifyView extends FrameLayout {
    @BindView(2131363667)
    View spotifyShareContainer;

    public ProfileConnectSpotifyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.view_profile_connect_spotify, this);
        ButterKnife.a(this);
    }

    @OnClick({2131363663})
    void onSpotifyLoginClick() {
        Intent a = ProfileSpotifyAuthActivity.m68646a(getContext(), 3);
        Activity activity = (Activity) C14398a.m54830a(getContext());
        if (activity != null) {
            activity.startActivity(a);
        }
    }
}
