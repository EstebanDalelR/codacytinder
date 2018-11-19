package com.tinder.spotify.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.tinder.R;
import com.tinder.base.ActivityBase;
import com.tinder.managers.ManagerApp;
import com.tinder.spotify.views.SpotifyPickArtistView;
import com.tinder.utils.ad;
import com.tinder.views.CustomTextView;

public class SpotifyPickTopArtistActivity extends ActivityBase {
    /* renamed from: a */
    private Unbinder f59980a;
    /* renamed from: b */
    private boolean f59981b = false;
    @BindView(2131363965)
    CustomTextView mBackText;
    @BindView(2131363197)
    CustomTextView mDisconnect;
    @BindView(2131363195)
    SpotifyPickArtistView mSpotifyPickArtistView;
    @BindView(2131363823)
    Toolbar mToolbar;

    @OnClick({2131363965})
    public void backTextClick() {
        finish();
    }

    @OnClick({2131363197})
    public void disConnectSpotify() {
        this.mSpotifyPickArtistView.m62434a();
        this.f59981b = true;
        finish();
    }

    protected void onCreate(Bundle bundle) {
        ad.a();
        super.onCreate(bundle);
        setContentView(R.layout.activity_spotify_pick_artist);
        ManagerApp.e().inject(this);
        this.f59980a = ButterKnife.a(this);
        m68661b();
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.enter_left_to_right);
    }

    public void onPause() {
        super.onPause();
        if (!this.f59981b) {
            this.mSpotifyPickArtistView.onPause();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f59980a.unbind();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.exit_left_to_right, R.anim.exit_right_to_left);
    }

    /* renamed from: b */
    private void m68661b() {
        setSupportActionBar(this.mToolbar);
        this.mToolbar.setNavigationOnClickListener(new C15038c(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m68662a(View view) {
        onBackPressed();
    }
}
