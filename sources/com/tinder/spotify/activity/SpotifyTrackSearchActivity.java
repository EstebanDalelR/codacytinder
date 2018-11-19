package com.tinder.spotify.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.managers.ManagerApp;
import com.tinder.spotify.views.SpotifyTrackSearchView;
import com.tinder.utils.ad;

public class SpotifyTrackSearchActivity extends ActivitySignedInBase {
    @BindView(2131363867)
    SpotifyTrackSearchView mSpotifyTrackSearchView;

    /* renamed from: a */
    public static Intent m68728a(Context context) {
        return new Intent(context, SpotifyTrackSearchActivity.class);
    }

    protected void onCreate(Bundle bundle) {
        ad.a();
        super.onCreate(bundle);
        setContentView(R.layout.activity_spotify_song_search);
        ManagerApp.e().inject(this);
        ButterKnife.a(this);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.enter_left_to_right);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.exit_left_to_right, R.anim.exit_right_to_left);
    }
}
