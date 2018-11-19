package com.tinder.profile.view;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.profile.adapters.C14368m;
import com.tinder.profile.adapters.C14371s;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.Profile.Adornment;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.p416b.C18162n;
import com.tinder.spotify.p416b.C18165v;
import com.tinder.spotify.target.SpotifyThemeTrackTarget;
import com.tinder.spotify.views.ArtworkPlayerView;
import com.tinder.spotify.views.SpotifyPlayerView.PlaybackListener;
import com.tinder.utils.at;
import javax.inject.Inject;

public class ProfileAnthemView extends RelativeLayout implements ProfileView$a, SpotifyThemeTrackTarget {
    @Inject
    /* renamed from: a */
    C18165v f50243a;
    @Inject
    /* renamed from: b */
    C18162n f50244b;
    @Inject
    /* renamed from: c */
    C14368m f50245c;
    /* renamed from: d */
    PlaybackListener f50246d = new C161441(this);
    @BindView(2131363650)
    View mAnthemContainer;
    @BindView(2131363674)
    ArtworkPlayerView mArtworkPlayerView;
    @BindDimen(2131166217)
    int mArtworkSize;
    @BindView(2131363676)
    TextView mCurrentSong;
    @BindString(2131821944)
    String mPlayFullSong;
    @BindColor(2131099917)
    int mPlayFullSongColor;
    @BindString(2131821940)
    String mSpotifyInstall;
    @BindString(2131821765)
    String mSpotifyIntentResolveError;
    @BindView(2131363675)
    TextView mTopArtistName;

    /* renamed from: com.tinder.profile.view.ProfileAnthemView$1 */
    class C161441 implements PlaybackListener {
        /* renamed from: a */
        final /* synthetic */ ProfileAnthemView f50242a;

        C161441(ProfileAnthemView profileAnthemView) {
            this.f50242a = profileAnthemView;
        }

        public void onPlayStart(SearchTrack searchTrack) {
            this.f50242a.f50243a.m65909a(searchTrack);
            this.f50242a.f50243a.m65911b(searchTrack);
            this.f50242a.setAnthemClickable(true);
        }

        public void onPlayStop(SearchTrack searchTrack) {
            this.f50242a.f50243a.m65912c(searchTrack);
            this.f50242a.setAnthemClickable(false);
        }
    }

    public ProfileAnthemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(getContext(), R.layout.merge_spotify_top_artist, this);
        ((ProfileComponentProvider) C14398a.m54830a(context)).provideComponent().inject(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.a(this);
        this.f50243a.a(this);
        this.mArtworkPlayerView.setArtworkSize(this.mArtworkSize);
        this.mArtworkPlayerView.setPlaybackListener(this.f50246d);
        setAnthemClickable(false);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50243a.a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50243a.a();
    }

    /* renamed from: a */
    public void m61019a(Profile profile) {
        SearchTrack a = this.f50245c.m54742a(profile.mo11669s());
        setThemeTrackName(a.getName());
        String str = "";
        for (Artist artist : a.getArtist()) {
            StringBuilder stringBuilder;
            if (!str.isEmpty()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(", ");
                str = stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(artist.getName());
            str = stringBuilder.toString();
        }
        setArtistName(str);
        prepareTrackForPlay(a);
        this.f50244b.m65901a(profile.mo11651a(), C14371s.m54747a(profile.mo11660j(), profile.mo11661k().contains(Adornment.GROUP)));
    }

    public void hideContainer() {
        setVisibility(8);
    }

    public void setThemeTrackName(String str) {
        this.mCurrentSong.setText(str);
    }

    public void setArtistName(String str) {
        this.mTopArtistName.setText(str);
    }

    public void prepareTrackForPlay(SearchTrack searchTrack) {
        this.mArtworkPlayerView.setTrack(searchTrack);
    }

    public void setPlayFullSongTextOnPlayStart(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.append(" - ");
            stringBuilder.append(" <font color='");
            stringBuilder.append(this.mPlayFullSongColor);
            stringBuilder.append("'>");
            stringBuilder.append(this.mPlayFullSong);
            stringBuilder.append("</font>");
            this.mTopArtistName.setText(Html.fromHtml(stringBuilder.toString()));
        }
    }

    public void stopTrack() {
        this.mArtworkPlayerView.m56739a();
    }

    public void startSpotifyActivity(String str) throws ActivityNotFoundException {
        str = new Intent("android.intent.action.VIEW");
        str.setData(Uri.parse(String.format("https://open.spotify.com/track/%s?utm_source=tinder&utm_medium=track", new Object[]{this.mArtworkPlayerView.getTrack().getId()})));
        str.putExtra("android.intent.extra.REFERRER", Uri.parse("tinder_open_in_spotify"));
        str.setFlags(268435456);
        getContext().startActivity(str);
    }

    public void showMustFirstInstallSpotifyMessage() {
        at.m57643a(this.mTopArtistName.getRootView(), this.mSpotifyInstall);
    }

    public void startSpotifyInstallActivity() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.spotify.music"));
        intent.setFlags(268435456);
        if (this.f50243a.m65910a(intent)) {
            getContext().startActivity(intent);
        } else {
            at.m57643a(this.mTopArtistName.getRootView(), this.mSpotifyIntentResolveError);
        }
    }

    /* renamed from: a */
    public void mo11746a() {
        stopTrack();
    }

    @OnClick({2131363650})
    void onThemeSongTrackClick() {
        this.f50243a.m65913d(this.mArtworkPlayerView.getTrack());
    }

    private void setAnthemClickable(boolean z) {
        this.mAnthemContainer.setClickable(z);
        this.mAnthemContainer.setEnabled(z);
    }
}
