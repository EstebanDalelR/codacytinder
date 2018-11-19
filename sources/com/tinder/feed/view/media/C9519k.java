package com.tinder.feed.view.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.tinder.R;
import com.tinder.common.feed.view.FeedImageContentView;
import com.tinder.feed.view.FeedSpotifyTrackPlayerView;
import com.tinder.feed.view.p250a.C9479b;
import com.tinder.spotify.views.SpotifyPlayerView.PlayerControlsClickListener;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00110\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/tinder/feed/view/media/FeedSpotifyNewAnthemMediaView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "feedImageContentView", "Lcom/tinder/common/feed/view/FeedImageContentView;", "getFeedImageContentView", "()Lcom/tinder/common/feed/view/FeedImageContentView;", "feedImageContentView$delegate", "Lkotlin/Lazy;", "spotifyTrackPlayer", "Lcom/tinder/feed/view/FeedSpotifyTrackPlayerView;", "getSpotifyTrackPlayer", "()Lcom/tinder/feed/view/FeedSpotifyTrackPlayerView;", "spotifyTrackPlayer$delegate", "bind", "", "feedSpotifyViewModel", "Lcom/tinder/feed/view/media/FeedSpotifyViewModel;", "playerControlsClickListener", "Lcom/tinder/spotify/views/SpotifyPlayerView$PlayerControlsClickListener;", "spotifyDeeplinkClickListener", "Lkotlin/Function0;", "Lcom/tinder/common/feed/view/SpotifyDeeplinkClickListener;", "onFeedItemDoubleTapListener", "Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.media.k */
public final class C9519k extends FrameLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31871a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C9519k.class), "spotifyTrackPlayer", "getSpotifyTrackPlayer()Lcom/tinder/feed/view/FeedSpotifyTrackPlayerView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C9519k.class), "feedImageContentView", "getFeedImageContentView()Lcom/tinder/common/feed/view/FeedImageContentView;"))};
    /* renamed from: b */
    private final Lazy f31872b = C18451c.a(LazyThreadSafetyMode.NONE, new FeedSpotifyNewAnthemMediaView$$special$$inlined$bindView$1(this, R.id.spotifyTrackPlayerActivityFeed));
    /* renamed from: c */
    private final Lazy f31873c = C18451c.a(LazyThreadSafetyMode.NONE, new FeedSpotifyNewAnthemMediaView$$special$$inlined$bindView$2(this, R.id.feedImageContentViewSpotifyTrack));

    private final FeedImageContentView getFeedImageContentView() {
        Lazy lazy = this.f31873c;
        KProperty kProperty = f31871a[1];
        return (FeedImageContentView) lazy.getValue();
    }

    private final FeedSpotifyTrackPlayerView getSpotifyTrackPlayer() {
        Lazy lazy = this.f31872b;
        KProperty kProperty = f31871a[0];
        return (FeedSpotifyTrackPlayerView) lazy.getValue();
    }

    public C9519k(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        View.inflate(context, R.layout.feed_spotify_new_anthem_media_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
        setClipChildren(null);
    }

    /* renamed from: a */
    public final void m39779a(@NotNull C9522m c9522m, @NotNull PlayerControlsClickListener playerControlsClickListener, @NotNull Function0<C15813i> function0, @NotNull OnFeedItemDoubleTapListener onFeedItemDoubleTapListener) {
        C2668g.b(c9522m, "feedSpotifyViewModel");
        C2668g.b(playerControlsClickListener, "playerControlsClickListener");
        C2668g.b(function0, "spotifyDeeplinkClickListener");
        C2668g.b(onFeedItemDoubleTapListener, "onFeedItemDoubleTapListener");
        C9513e.m39771a(onFeedItemDoubleTapListener, getFeedImageContentView());
        getSpotifyTrackPlayer().m51353a(C9479b.m39646a(c9522m), playerControlsClickListener, function0);
        FeedImageContentView.m42982a(getFeedImageContentView(), c9522m.m39787d(), null, 2, null);
    }
}
