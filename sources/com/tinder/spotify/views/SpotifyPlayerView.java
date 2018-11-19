package com.tinder.spotify.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.common.view.SafeViewFlipper;
import com.tinder.managers.ManagerApp;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.p416b.C18162n;
import com.tinder.spotify.target.SpotifyPlayerTarget;
import com.tinder.utils.at;
import javax.inject.Inject;

public class SpotifyPlayerView extends FrameLayout implements SpotifyPlayerTarget {
    @Inject
    /* renamed from: a */
    C18162n f51974a;
    /* renamed from: b */
    private boolean f51975b = true;
    /* renamed from: c */
    private PlaybackListener f51976c;
    @Nullable
    /* renamed from: d */
    private PlayerControlsClickListener f51977d;
    @BindView(2131363664)
    CircularProgressBar mCircularProgressBar;
    @BindView(2131363665)
    SafeViewFlipper mControlFlipper;

    public interface PlaybackListener {
        void onPlayStart(SearchTrack searchTrack);

        void onPlayStop(SearchTrack searchTrack);
    }

    public interface PlayerControlsClickListener {
        void onPlayClicked();

        void onStopClicked();
    }

    public SpotifyPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode() == null) {
            ManagerApp.e().inject(this);
        }
        inflate(context, R.layout.merge_spotify_player, this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.a(this);
        this.mControlFlipper.setDisplayedChild(2);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51974a.m65898a((SpotifyPlayerTarget) this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51974a.m65894a();
    }

    public void showPlaying(SearchTrack searchTrack) {
        if (this.f51976c != null) {
            this.f51976c.onPlayStart(searchTrack);
        }
        this.mControlFlipper.setDisplayedChild(1);
    }

    public void showStopped(SearchTrack searchTrack) {
        if (this.f51976c != null) {
            this.f51976c.onPlayStop(searchTrack);
        }
        m62438c();
    }

    public void showLoading(SearchTrack searchTrack) {
        this.mControlFlipper.setDisplayedChild(0);
    }

    public void showProgressChanged(float f) {
        this.mCircularProgressBar.m56743a(f);
    }

    public void notifyPlayButtonClicked() {
        if (this.f51977d != null) {
            this.f51977d.onPlayClicked();
        }
    }

    public void notifyStopButtonClicked() {
        if (this.f51977d != null) {
            this.f51977d.onStopClicked();
        }
    }

    public void toastError(@StringRes int i) {
        at.m57641a((View) this, i);
    }

    /* renamed from: a */
    public void m62435a() {
        if (this.f51975b) {
            this.f51974a.m65902b();
        }
    }

    /* renamed from: b */
    public void m62437b() {
        this.f51974a.m65903c();
    }

    /* renamed from: a */
    public void m62436a(@NonNull String str) {
        this.f51974a.m65900a(str);
    }

    public SearchTrack getTrack() {
        return this.f51974a.m65904d();
    }

    public void setTrack(SearchTrack searchTrack) {
        this.f51974a.m65897a(searchTrack);
    }

    public void setPlaybackListener(PlaybackListener playbackListener) {
        this.f51976c = playbackListener;
    }

    public void setPlayerControlsClickListener(@NonNull PlayerControlsClickListener playerControlsClickListener) {
        this.f51977d = playerControlsClickListener;
    }

    @OnClick({2131363665})
    void onPlayButtonClick() {
        if (this.f51975b) {
            this.f51974a.m65902b();
        }
    }

    public void setControlsEnabled(boolean z) {
        this.f51975b = z;
    }

    /* renamed from: c */
    public void m62438c() {
        this.mCircularProgressBar.m56742a();
        this.mControlFlipper.setDisplayedChild(2);
    }
}
