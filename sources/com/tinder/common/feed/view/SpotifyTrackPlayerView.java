package com.tinder.common.feed.view;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.C0432b;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.profile.p365d.C14398a;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.p416b.C18167w;
import com.tinder.spotify.target.SpotifyTopTrackItemViewTarget;
import com.tinder.spotify.views.ArtworkPlayerView;
import com.tinder.spotify.views.SpotifyPlayerView.PlaybackListener;
import com.tinder.spotify.views.SpotifyPlayerView.PlayerControlsClickListener;
import com.tinder.utils.at;
import com.tinder.utils.at.C15355a;
import com.tinder.views.CustomTextView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b*\u0002\u0018\u001c\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001JB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010-\u001a\u00020.H\u0002J6\u0010/\u001a\u00020.2\u0006\u0010&\u001a\u00020'2\u0006\u0010*\u001a\u00020+2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\u0012\b\u0002\u00102\u001a\f\u0012\u0004\u0012\u00020.03j\u0002`4J\b\u00105\u001a\u00020.H\u0002J\u0010\u00106\u001a\u00020.2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u00107\u001a\u00020.2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u00108\u001a\u00020.2\u0006\u0010&\u001a\u00020'H\u0002J\b\u00109\u001a\u00020.H\u0014J\b\u0010:\u001a\u00020.H\u0014J\b\u0010;\u001a\u00020.H\u0014J\b\u0010<\u001a\u00020.H\u0002J\b\u0010=\u001a\u00020\u0013H\u0002J\u0010\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020@H\u0002J\r\u0010A\u001a\u00020.H ¢\u0006\u0002\bBJ\u0010\u0010C\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010D\u001a\u00020.H\u0002J\b\u0010E\u001a\u00020.H\u0016J\u0010\u0010F\u001a\u00020.2\u0006\u0010G\u001a\u00020\u0013H\u0016J\b\u0010H\u001a\u00020.H\u0016J\b\u0010I\u001a\u00020.H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u001a\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/tinder/common/feed/view/SpotifyTrackPlayerView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/spotify/target/SpotifyTopTrackItemViewTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "artistName", "Landroid/widget/TextView;", "artworkPlayer", "Lcom/tinder/spotify/views/ArtworkPlayerView;", "artworkSize", "greenColor", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "mustFirstInstallSpotify", "", "kotlin.jvm.PlatformType", "openFullSongInSpotifyIcon", "Landroid/widget/ImageView;", "parentActivityLifecycleObserver", "com/tinder/common/feed/view/SpotifyTrackPlayerView$parentActivityLifecycleObserver$1", "Lcom/tinder/common/feed/view/SpotifyTrackPlayerView$parentActivityLifecycleObserver$1;", "playFullSongInSpotify", "playbackListener", "com/tinder/common/feed/view/SpotifyTrackPlayerView$playbackListener$1", "Lcom/tinder/common/feed/view/SpotifyTrackPlayerView$playbackListener$1;", "presenter", "Lcom/tinder/spotify/presenter/SpotifyTopTrackItemViewPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/spotify/presenter/SpotifyTopTrackItemViewPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/spotify/presenter/SpotifyTopTrackItemViewPresenter;)V", "songTitle", "spotifyIntentResolveError", "track", "Lcom/tinder/spotify/model/SearchTrack;", "trackTextContainer", "Landroid/view/View;", "trackType", "Lcom/tinder/common/feed/view/SpotifyTrackPlayerView$TrackType;", "whiteColor", "addActivityLifecycleObserver", "", "bind", "playerControlsClickListener", "Lcom/tinder/spotify/views/SpotifyPlayerView$PlayerControlsClickListener;", "spotifyDeeplinkClickListener", "Lkotlin/Function0;", "Lcom/tinder/common/feed/view/SpotifyDeeplinkClickListener;", "bindTrack", "bindTrackDetails", "handlePlayStart", "handlePlayStop", "onAttachedToWindow", "onDetachedFromWindow", "onFinishInflate", "removeActivityLifecycleObserver", "resolveUriSchema", "setTrackTextContainerClickable", "canClick", "", "setupDagger", "setupDagger$Tinder_release", "setupDaggerAndInflate", "setupLifecycleOwner", "showMustFirstInstallSpotifyMessage", "startSpotifyActivity", "id", "startSpotifyInstallActivity", "stopTrack", "TrackType", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class SpotifyTrackPlayerView extends LinearLayout implements SpotifyTopTrackItemViewTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C18167w f34989a;
    /* renamed from: b */
    private final C10669b f34990b;
    /* renamed from: c */
    private final ArtworkPlayerView f34991c;
    /* renamed from: d */
    private final TextView f34992d;
    /* renamed from: e */
    private final TextView f34993e;
    /* renamed from: f */
    private final ImageView f34994f;
    /* renamed from: g */
    private final View f34995g;
    /* renamed from: h */
    private final String f34996h;
    /* renamed from: i */
    private final String f34997i;
    /* renamed from: j */
    private final String f34998j;
    /* renamed from: k */
    private final int f34999k;
    /* renamed from: l */
    private final int f35000l;
    /* renamed from: m */
    private final int f35001m;
    /* renamed from: n */
    private LifecycleOwner f35002n;
    /* renamed from: o */
    private final SpotifyTrackPlayerView$parentActivityLifecycleObserver$1 f35003o;
    /* renamed from: p */
    private TrackType f35004p;
    /* renamed from: q */
    private SearchTrack f35005q;
    /* renamed from: r */
    private HashMap f35006r;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/common/feed/view/SpotifyTrackPlayerView$TrackType;", "", "(Ljava/lang/String;I)V", "TOP_ARTISTS", "ANTHEM", "UNKNOWN", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum TrackType {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.feed.view.SpotifyTrackPlayerView$a */
    static final class C8537a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ SpotifyTrackPlayerView f30283a;
        /* renamed from: b */
        final /* synthetic */ SearchTrack f30284b;
        /* renamed from: c */
        final /* synthetic */ Function0 f30285c;

        C8537a(SpotifyTrackPlayerView spotifyTrackPlayerView, SearchTrack searchTrack, Function0 function0) {
            this.f30283a = spotifyTrackPlayerView;
            this.f30284b = searchTrack;
            this.f30285c = function0;
        }

        public final void onClick(View view) {
            this.f30283a.getPresenter$Tinder_release().a(this.f30284b);
            this.f30285c.invoke();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/common/feed/view/SpotifyTrackPlayerView$playbackListener$1", "Lcom/tinder/spotify/views/SpotifyPlayerView$PlaybackListener;", "(Lcom/tinder/common/feed/view/SpotifyTrackPlayerView;)V", "onPlayStart", "", "track", "Lcom/tinder/spotify/model/SearchTrack;", "onPlayStop", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.feed.view.SpotifyTrackPlayerView$b */
    public static final class C10669b implements PlaybackListener {
        /* renamed from: a */
        final /* synthetic */ SpotifyTrackPlayerView f34988a;

        C10669b(SpotifyTrackPlayerView spotifyTrackPlayerView) {
            this.f34988a = spotifyTrackPlayerView;
        }

        public void onPlayStart(@NotNull SearchTrack searchTrack) {
            C2668g.b(searchTrack, "track");
            this.f34988a.m42997b(searchTrack);
        }

        public void onPlayStop(@NotNull SearchTrack searchTrack) {
            C2668g.b(searchTrack, "track");
            this.f34988a.m42994a(searchTrack);
        }
    }

    @JvmOverloads
    public SpotifyTrackPlayerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SpotifyTrackPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo11002a(int i) {
        if (this.f35006r == null) {
            this.f35006r = new HashMap();
        }
        View view = (View) this.f35006r.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f35006r.put(Integer.valueOf(i), view);
        return view;
    }

    /* renamed from: a */
    public abstract void mo11003a();

    @JvmOverloads
    public /* synthetic */ SpotifyTrackPlayerView(Context context, AttributeSet attributeSet, int i, int i2, C15823e c15823e) {
        if ((i2 & 2) != null) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @JvmOverloads
    public SpotifyTrackPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        C2668g.b(context, "context");
        super(context, attributeSet, i);
        this.f34990b = new C10669b(this);
        this.f34996h = getResources().getString(R.string.spotify_play_full_song);
        this.f34997i = getResources().getString(R.string.spotify_install_play_store);
        this.f34998j = getResources().getString(R.string.reported_warning_accept_agreement_error);
        this.f34999k = C0432b.c(context, R.color.green);
        this.f35000l = C0432b.c(context, R.color.white);
        this.f35001m = getResources().getDimensionPixelSize(R.dimen.feed_spotify_artwork_size);
        this.f35003o = new SpotifyTrackPlayerView$parentActivityLifecycleObserver$1(this);
        this.f35004p = TrackType.UNKNOWN;
        setupDaggerAndInflate(context);
        m42995b();
        ArtworkPlayerView artworkPlayerView = (ArtworkPlayerView) mo11002a(C6248a.feedSpotifytrackArtworkPlayer);
        C2668g.a(artworkPlayerView, "feedSpotifytrackArtworkPlayer");
        this.f34991c = artworkPlayerView;
        CustomTextView customTextView = (CustomTextView) mo11002a(C6248a.feedSpotifyTrackSongTitle);
        C2668g.a(customTextView, "feedSpotifyTrackSongTitle");
        this.f34992d = customTextView;
        customTextView = (CustomTextView) mo11002a(C6248a.feedSpotifyTrackArtistName);
        C2668g.a(customTextView, "feedSpotifyTrackArtistName");
        this.f34993e = customTextView;
        ImageView imageView = (ImageView) mo11002a(C6248a.feedSpotifyTrackOpenFullSongIcon);
        C2668g.a(imageView, "feedSpotifyTrackOpenFullSongIcon");
        this.f34994f = imageView;
        LinearLayout linearLayout = (LinearLayout) mo11002a(C6248a.feedSpotifyTrackTextContainer);
        C2668g.a(linearLayout, "feedSpotifyTrackTextContainer");
        this.f34995g = linearLayout;
    }

    @NotNull
    public final C18167w getPresenter$Tinder_release() {
        C18167w c18167w = this.f34989a;
        if (c18167w == null) {
            C2668g.b("presenter");
        }
        return c18167w;
    }

    public final void setPresenter$Tinder_release(@NotNull C18167w c18167w) {
        C2668g.b(c18167w, "<set-?>");
        this.f34989a = c18167w;
    }

    /* renamed from: a */
    public static /* synthetic */ void m42993a(SpotifyTrackPlayerView spotifyTrackPlayerView, SearchTrack searchTrack, TrackType trackType, PlayerControlsClickListener playerControlsClickListener, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
        }
        if ((i & 4) != null) {
            playerControlsClickListener = null;
        }
        if ((i & 8) != 0) {
            function0 = SpotifyTrackPlayerView$bind$1.f43746a;
        }
        spotifyTrackPlayerView.m43005a(searchTrack, trackType, playerControlsClickListener, function0);
    }

    /* renamed from: a */
    public final void m43005a(@NotNull SearchTrack searchTrack, @NotNull TrackType trackType, @Nullable PlayerControlsClickListener playerControlsClickListener, @NotNull Function0<C15813i> function0) {
        C2668g.b(searchTrack, "track");
        C2668g.b(trackType, "trackType");
        C2668g.b(function0, "spotifyDeeplinkClickListener");
        this.f35005q = searchTrack;
        this.f35004p = trackType;
        if (playerControlsClickListener != null) {
            this.f34991c.setPlayerControlsClickListener(playerControlsClickListener);
        }
        this.f34991c.setPlaybackListener((PlaybackListener) this.f34990b);
        this.f34995g.setOnClickListener((OnClickListener) new C8537a(this, searchTrack, function0));
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f34991c.setArtworkSize(this.f35001m);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C18167w c18167w = this.f34989a;
        if (c18167w == null) {
            C2668g.b("presenter");
        }
        c18167w.a(this);
        m42998c();
        m43002f();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopTrack();
        C18167w c18167w = this.f34989a;
        if (c18167w == null) {
            C2668g.b("presenter");
        }
        c18167w.a();
        m43000d();
    }

    public void startSpotifyActivity(@NotNull String str) {
        C2668g.b(str, "id");
        str = new Intent("android.intent.action.VIEW");
        C15828l c15828l = C15828l.f49033a;
        String e = m43001e();
        Object[] objArr = new Object[1];
        SearchTrack track = this.f34991c.getTrack();
        C2668g.a(track, "artworkPlayer.track");
        objArr[0] = track.getId();
        e = String.format(e, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(e, "java.lang.String.format(format, *args)");
        str.setData(Uri.parse(e));
        str.putExtra("android.intent.extra.REFERRER", Uri.parse("tinder_open_in_spotify"));
        str.setFlags(268435456);
        getContext().startActivity(str);
    }

    public void showMustFirstInstallSpotifyMessage() {
        C15355a c15355a = at.f47621a;
        View rootView = this.f34992d.getRootView();
        C2668g.a(rootView, "songTitle.rootView");
        String str = this.f34997i;
        C2668g.a(str, "mustFirstInstallSpotify");
        c15355a.a(rootView, str);
    }

    public void startSpotifyInstallActivity() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.spotify.music"));
        intent.setFlags(268435456);
        C18167w c18167w = this.f34989a;
        if (c18167w == null) {
            C2668g.b("presenter");
        }
        if (c18167w.a(intent)) {
            getContext().startActivity(intent);
            return;
        }
        C15355a c15355a = at.f47621a;
        View rootView = this.f34992d.getRootView();
        C2668g.a(rootView, "songTitle.rootView");
        String str = this.f34998j;
        C2668g.a(str, "spotifyIntentResolveError");
        c15355a.a(rootView, str);
    }

    public void stopTrack() {
        SearchTrack searchTrack = this.f35005q;
        if (searchTrack != null) {
            this.f34991c.a(searchTrack.getId());
        }
    }

    private final void setupDaggerAndInflate(Context context) {
        mo11003a();
        View.inflate(context, R.layout.activity_feed_spotify_track_player_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
        setOrientation(0);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* renamed from: b */
    private final void m42995b() {
        Context a = C14398a.a(getContext());
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
        }
        this.f35002n = (LifecycleOwner) a;
    }

    /* renamed from: c */
    private final void m42998c() {
        LifecycleOwner lifecycleOwner = this.f35002n;
        if (lifecycleOwner == null) {
            C2668g.b("lifecycleOwner");
        }
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle != null) {
            lifecycle.a(this.f35003o);
        }
    }

    /* renamed from: d */
    private final void m43000d() {
        LifecycleOwner lifecycleOwner = this.f35002n;
        if (lifecycleOwner == null) {
            C2668g.b("lifecycleOwner");
        }
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle != null) {
            lifecycle.b(this.f35003o);
        }
    }

    /* renamed from: a */
    private final void m42994a(SearchTrack searchTrack) {
        m42999c(searchTrack);
    }

    /* renamed from: b */
    private final void m42997b(SearchTrack searchTrack) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        List artist = searchTrack.getArtist();
        C2668g.a(artist, "track.artist");
        Object f = C19301m.f(artist);
        C2668g.a(f, "track.artist.first()");
        stringBuilder.append(((Artist) f).getName());
        stringBuilder.append(" - ");
        stringBuilder.append(searchTrack.getName());
        searchTrack = stringBuilder.toString();
        this.f34993e.setEllipsize(TruncateAt.MARQUEE);
        this.f34993e.setText((CharSequence) searchTrack);
        this.f34993e.setSelected(true);
        this.f34993e.setHorizontalFadingEdgeEnabled(true);
        this.f34993e.setSingleLine(true);
        this.f34992d.setText(this.f34996h);
        this.f34992d.setTextColor(this.f34999k);
        setTrackTextContainerClickable(true);
    }

    /* renamed from: c */
    private final void m42999c(SearchTrack searchTrack) {
        TextView textView = this.f34993e;
        List artist = searchTrack.getArtist();
        C2668g.a(artist, "track.artist");
        Object f = C19301m.f(artist);
        C2668g.a(f, "track.artist.first()");
        textView.setText(((Artist) f).getName());
        this.f34993e.setSelected(false);
        this.f34993e.setEllipsize(TruncateAt.END);
        this.f34993e.setHorizontalFadingEdgeEnabled(false);
        this.f34992d.setText(searchTrack.getName());
        this.f34992d.setTextColor(this.f35000l);
        setTrackTextContainerClickable(false);
    }

    private final void setTrackTextContainerClickable(boolean z) {
        this.f34995g.setClickable(z);
        this.f34995g.setEnabled(z);
    }

    /* renamed from: e */
    private final String m43001e() {
        switch (this.f35004p) {
            case TOP_ARTISTS:
                return "https://open.spotify.com/track/%s?utm_source=tinder&utm_medium=top-artists";
            case ANTHEM:
                return "https://open.spotify.com/track/%s?utm_source=tinder&utm_medium=track";
            case UNKNOWN:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Can't resolve Spotify deeplink URI scheme. ");
                stringBuilder.append("Unknown feed spotify track type: ");
                stringBuilder.append(this.f35004p);
                throw new IllegalArgumentException(stringBuilder.toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: f */
    private final void m43002f() {
        SearchTrack searchTrack = this.f35005q;
        if (searchTrack == null) {
            throw new IllegalStateException("Track should be bound before onAttachedToWindow".toString());
        }
        m42999c(searchTrack);
        this.f34991c.setTrack(searchTrack);
    }
}
