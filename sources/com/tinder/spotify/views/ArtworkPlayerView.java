package com.tinder.spotify.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.common.p191d.C8529a;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.views.SpotifyArtworkView.ArtworkListener;
import com.tinder.spotify.views.SpotifyPlayerView.PlaybackListener;
import com.tinder.spotify.views.SpotifyPlayerView.PlayerControlsClickListener;

public class ArtworkPlayerView extends FrameLayout {
    /* renamed from: a */
    private final RotateAnimation f46869a;
    /* renamed from: b */
    private PlaybackListener f46870b;
    /* renamed from: c */
    private boolean f46871c;
    /* renamed from: d */
    private PlaybackListener f46872d = new C168611(this);
    /* renamed from: e */
    private ArtworkListener f46873e = new C168622(this);
    @BindView(2131362484)
    SpotifyArtworkView mArtworkView;
    @BindDimen(2131166218)
    int mPhotoCornerRadius;
    @BindView(2131362485)
    SpotifyPlayerView mSpotifyPlayerView;

    /* renamed from: com.tinder.spotify.views.ArtworkPlayerView$1 */
    class C168611 implements PlaybackListener {
        /* renamed from: a */
        final /* synthetic */ ArtworkPlayerView f51952a;

        C168611(ArtworkPlayerView artworkPlayerView) {
            this.f51952a = artworkPlayerView;
        }

        public void onPlayStart(SearchTrack searchTrack) {
            this.f51952a.m56738e();
            if (this.f51952a.f46870b != null) {
                this.f51952a.f46870b.onPlayStart(searchTrack);
            }
        }

        public void onPlayStop(SearchTrack searchTrack) {
            if (this.f51952a.f46871c) {
                this.f51952a.m56736d();
                this.f51952a.f46871c = false;
                this.f51952a.mArtworkView.getArtworkImage().m62428b();
            }
            if (this.f51952a.f46870b != null) {
                this.f51952a.f46870b.onPlayStop(searchTrack);
            }
        }
    }

    /* renamed from: com.tinder.spotify.views.ArtworkPlayerView$2 */
    class C168622 implements ArtworkListener {
        /* renamed from: a */
        final /* synthetic */ ArtworkPlayerView f51953a;

        C168622(ArtworkPlayerView artworkPlayerView) {
            this.f51953a = artworkPlayerView;
        }

        public void onArtworkLoaded() {
            this.f51953a.mSpotifyPlayerView.setVisibility(0);
        }

        public void onArtworkClick() {
            this.f51953a.mSpotifyPlayerView.m62435a();
        }
    }

    public ArtworkPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.merge_spotify_artwork_player, this);
        this.f46869a = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.f46869a.setRepeatCount(-1);
        this.f46869a.setInterpolator(new LinearInterpolator());
        this.f46869a.setDuration(5000);
        setClipToPadding(false);
        setClipChildren(false);
        setLayoutParams(C8529a.f30276a.a());
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.a(this);
        this.mArtworkView.getArtworkImage().setStartRadius((float) this.mPhotoCornerRadius);
        this.mArtworkView.setArtworkListener(this.f46873e);
        this.mSpotifyPlayerView.setPlaybackListener(this.f46872d);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m56734c();
    }

    public void setTrack(SearchTrack searchTrack) {
        this.mSpotifyPlayerView.setTrack(searchTrack);
        this.mArtworkView.m56749a(searchTrack);
    }

    /* renamed from: a */
    public void m56739a() {
        this.mSpotifyPlayerView.m62437b();
    }

    /* renamed from: a */
    public void m56740a(@NonNull String str) {
        this.mSpotifyPlayerView.m62436a(str);
    }

    public SearchTrack getTrack() {
        return this.mSpotifyPlayerView.getTrack();
    }

    public void setPlaybackListener(PlaybackListener playbackListener) {
        this.f46870b = playbackListener;
    }

    public void setPlayerControlsClickListener(@NonNull PlayerControlsClickListener playerControlsClickListener) {
        this.mSpotifyPlayerView.setPlayerControlsClickListener(playerControlsClickListener);
    }

    public void setArtworkSize(int i) {
        LayoutParams layoutParams = this.mArtworkView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.mArtworkView.setLayoutParams(layoutParams);
        this.mArtworkView.setArtworkSize(i);
        this.mArtworkView.getArtworkImage().setEndRadius((float) i);
    }

    /* renamed from: c */
    private void m56734c() {
        m56736d();
        this.mSpotifyPlayerView.m62438c();
    }

    /* renamed from: d */
    private void m56736d() {
        this.mArtworkView.setRotation(0.0f);
        this.f46869a.cancel();
        this.mSpotifyPlayerView.setControlsEnabled(true);
    }

    /* renamed from: e */
    private void m56738e() {
        this.mSpotifyPlayerView.setControlsEnabled(false);
        this.mArtworkView.animate().rotationBy(-5.0f).setDuration(500).withEndAction(new C15055a(this));
    }

    /* renamed from: b */
    final /* synthetic */ void m56741b() {
        this.mArtworkView.getArtworkImage().m62427a();
        this.mArtworkView.startAnimation(this.f46869a);
        this.f46871c = true;
        this.mSpotifyPlayerView.setControlsEnabled(true);
    }
}
