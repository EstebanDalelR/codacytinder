package com.tinder.spotify.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.managers.ManagerApp;
import com.tinder.spotify.activity.SpotifyTrackSearchActivity;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.p416b.C18163s;
import com.tinder.spotify.target.SpotifyThemeSongTarget;
import com.tinder.utils.at;
import com.tinder.views.CustomTextView;
import javax.inject.Inject;

public class SpotifyThemeSongView extends LinearLayout implements SpotifyThemeSongTarget {
    @Inject
    /* renamed from: a */
    C18163s f51982a;
    @BindView(2131363670)
    CustomTextView mArtistName;
    @BindView(2131363669)
    View mArtistNameContainer;
    @BindView(2131362209)
    View mChooseSongContainer;
    @BindView(2131363654)
    CustomTextView mChooseThemeSong;
    @BindString(2131821936)
    String mDefaultText;
    @BindView(2131363671)
    CustomTextView mSongName;

    public SpotifyThemeSongView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(getContext(), R.layout.view_spotify_theme_song_profile, this);
        ManagerApp.e().inject(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.a(this);
        this.f51982a.a(this);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51982a.a(this);
        this.f51982a.m65907b();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51982a.a();
    }

    @OnClick({2131362209})
    public void chooseThemeSongClicked() {
        getContext().startActivity(SpotifyTrackSearchActivity.m68728a(getContext()));
    }

    public void setThemeTrack(@NonNull SearchTrack searchTrack) {
        if (searchTrack != null) {
            this.mArtistNameContainer.setVisibility(0);
            this.mSongName.setVisibility(0);
            this.mChooseThemeSong.setVisibility(8);
            this.mSongName.setText(searchTrack.getName());
            this.mArtistName.setText(((Artist) searchTrack.getArtist().get(0)).getName());
            return;
        }
        this.mArtistNameContainer.setVisibility(8);
        this.mSongName.setVisibility(8);
        this.mChooseThemeSong.setVisibility(0);
        this.mChooseThemeSong.setText(this.mDefaultText);
    }

    public void toastError(@StringRes int i) {
        at.m57641a(this.mChooseSongContainer.getRootView(), i);
    }
}
