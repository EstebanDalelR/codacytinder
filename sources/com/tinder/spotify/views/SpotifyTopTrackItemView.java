package com.tinder.spotify.views;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.managers.ManagerApp;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.p416b.C18167w;
import com.tinder.spotify.target.SpotifyTopTrackItemViewTarget;
import com.tinder.spotify.views.SpotifyPlayerView.PlaybackListener;
import com.tinder.utils.at;
import javax.inject.Inject;

public class SpotifyTopTrackItemView extends LinearLayout implements SpotifyTopTrackItemViewTarget {
    @Inject
    /* renamed from: a */
    C18167w f51988a;
    /* renamed from: b */
    private PlaybackListener f51989b = new C168691(this);
    @BindView(2131363678)
    ArtworkPlayerView mArtworkPlayerView;
    @BindColor(2131099907)
    int mGrayColor;
    @BindColor(2131099917)
    int mGreenColor;
    @BindDimen(2131166297)
    int mItemPadding;
    @BindString(2131821944)
    String mOpenInLinkText;
    @BindView(2131362682)
    ImageView mSpotifyIcon;
    @BindString(2131821940)
    String mSpotifyInstall;
    @BindString(2131821765)
    String mSpotifyIntentResolveError;
    @BindView(2131363677)
    TextView mTopTrackArtistName;
    @BindView(2131363681)
    TextView mTopTrackSong;
    @BindView(2131363682)
    View mTopTrackTextContainer;

    /* renamed from: com.tinder.spotify.views.SpotifyTopTrackItemView$1 */
    class C168691 implements PlaybackListener {
        /* renamed from: a */
        final /* synthetic */ SpotifyTopTrackItemView f51987a;

        C168691(SpotifyTopTrackItemView spotifyTopTrackItemView) {
            this.f51987a = spotifyTopTrackItemView;
        }

        public void onPlayStart(SearchTrack searchTrack) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(((Artist) searchTrack.getArtist().get(0)).getName());
            stringBuilder.append(" - ");
            stringBuilder.append(searchTrack.getName());
            searchTrack = stringBuilder.toString();
            this.f51987a.mTopTrackArtistName.setEllipsize(TruncateAt.MARQUEE);
            this.f51987a.mTopTrackArtistName.setText(searchTrack);
            this.f51987a.mTopTrackArtistName.setSelected(true);
            this.f51987a.mTopTrackArtistName.setHorizontalFadingEdgeEnabled(true);
            this.f51987a.mTopTrackArtistName.setSingleLine(true);
            this.f51987a.mTopTrackSong.setText(this.f51987a.mOpenInLinkText);
            this.f51987a.mTopTrackSong.setTextColor(this.f51987a.mGreenColor);
            this.f51987a.mSpotifyIcon.setVisibility(0);
            this.f51987a.setTopTrackTextContainerClickable(true);
        }

        public void onPlayStop(SearchTrack searchTrack) {
            this.f51987a.mTopTrackArtistName.setText(((Artist) searchTrack.getArtist().get(0)).getName());
            this.f51987a.mTopTrackArtistName.setSelected(false);
            this.f51987a.mTopTrackArtistName.setEllipsize(TruncateAt.END);
            this.f51987a.mTopTrackArtistName.setHorizontalFadingEdgeEnabled(false);
            this.f51987a.mTopTrackSong.setText(searchTrack.getName());
            this.f51987a.mTopTrackSong.setTextColor(this.f51987a.mGrayColor);
            this.f51987a.mSpotifyIcon.setVisibility(8);
            this.f51987a.setTopTrackTextContainerClickable(false);
        }
    }

    /* renamed from: a */
    public static SpotifyTopTrackItemView m62439a(ViewGroup viewGroup, int i) {
        SpotifyTopTrackItemView spotifyTopTrackItemView = (SpotifyTopTrackItemView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_spotify_top_track_item, viewGroup, false);
        spotifyTopTrackItemView.m62441a(i);
        return spotifyTopTrackItemView;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51988a.a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51988a.a();
    }

    public SpotifyTopTrackItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ManagerApp.e().inject(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.a(this);
        this.mArtworkPlayerView.setPlaybackListener(this.f51989b);
        setTopTrackTextContainerClickable(false);
    }

    /* renamed from: a */
    public void m62442a(@NonNull SearchTrack searchTrack) {
        if (searchTrack == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.mArtworkPlayerView.setTrack(searchTrack);
        this.mTopTrackArtistName.setText(((Artist) searchTrack.getArtist().get(0)).getName());
        this.mTopTrackSong.setText(searchTrack.getName());
    }

    /* renamed from: a */
    public void m62441a(int i) {
        LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = -2;
        setLayoutParams(layoutParams);
        this.mArtworkPlayerView.setArtworkSize(i - this.mItemPadding);
    }

    @OnClick({2131363682})
    void onTopTrackClick() {
        this.f51988a.m65915a(this.mArtworkPlayerView.getTrack());
    }

    public void startSpotifyActivity(String str) throws ActivityNotFoundException {
        str = new Intent("android.intent.action.VIEW");
        str.setData(Uri.parse(String.format("https://open.spotify.com/track/%s?utm_source=tinder&utm_medium=top-artists", new Object[]{this.mArtworkPlayerView.getTrack().getId()})));
        str.putExtra("android.intent.extra.REFERRER", Uri.parse("tinder_open_in_spotify"));
        str.setFlags(268435456);
        getContext().startActivity(str);
    }

    public void showMustFirstInstallSpotifyMessage() {
        at.m57643a(this.mTopTrackSong.getRootView(), this.mSpotifyInstall);
    }

    public void startSpotifyInstallActivity() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.spotify.music"));
        intent.setFlags(268435456);
        if (this.f51988a.m65916a(intent)) {
            getContext().startActivity(intent);
        } else {
            at.m57643a(this.mTopTrackSong.getRootView(), this.mSpotifyIntentResolveError);
        }
    }

    public void stopTrack() {
        this.mArtworkPlayerView.m56739a();
    }

    private void setTopTrackTextContainerClickable(boolean z) {
        this.mTopTrackTextContainer.setClickable(z);
        this.mTopTrackTextContainer.setEnabled(z);
    }
}
