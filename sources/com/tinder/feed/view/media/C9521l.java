package com.tinder.feed.view.media;

import android.content.Context;
import android.support.v4.view.C0600i;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.chat.view.model.C10636b;
import com.tinder.chat.view.model.ak;
import com.tinder.common.feed.view.FeedImageContentView;
import com.tinder.common.p191d.C8529a;
import com.tinder.common.view.extension.C8587g;
import com.tinder.feed.view.FeedCarouselView;
import com.tinder.feed.view.FeedSpotifyTrackPlayerView;
import com.tinder.feed.view.p250a.C9478a;
import com.tinder.feed.view.p250a.C9479b;
import com.tinder.spotify.views.SpotifyPlayerView.PlayerControlsClickListener;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.List;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002 !B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0010\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u00160\u001aj\u0002`\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/tinder/feed/view/media/FeedSpotifyTopArtistMediaView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "feedImageContentView", "Lcom/tinder/common/feed/view/FeedImageContentView;", "getFeedImageContentView", "()Lcom/tinder/common/feed/view/FeedImageContentView;", "feedImageContentView$delegate", "Lkotlin/Lazy;", "mediaViewPager", "Lcom/tinder/feed/view/FeedCarouselView;", "getMediaViewPager", "()Lcom/tinder/feed/view/FeedCarouselView;", "mediaViewPager$delegate", "titleIndicator", "Lcom/viewpagerindicator/CirclePageIndicator;", "getTitleIndicator", "()Lcom/viewpagerindicator/CirclePageIndicator;", "titleIndicator$delegate", "bind", "", "viewModel", "Lcom/tinder/feed/view/media/FeedSpotifyTopArtistMediaView$FeedSpotifyTopArtistViewModel;", "spotifyDeeplinkClickListener", "Lkotlin/Function0;", "Lcom/tinder/common/feed/view/SpotifyDeeplinkClickListener;", "playerControlsClickListener", "Lcom/tinder/spotify/views/SpotifyPlayerView$PlayerControlsClickListener;", "onFeedItemDoubleTapListener", "Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;", "FeedSpotifyMediaAdapter", "FeedSpotifyTopArtistViewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.media.l */
public final class C9521l extends FrameLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31877a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C9521l.class), "feedImageContentView", "getFeedImageContentView()Lcom/tinder/common/feed/view/FeedImageContentView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C9521l.class), "mediaViewPager", "getMediaViewPager()Lcom/tinder/feed/view/FeedCarouselView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C9521l.class), "titleIndicator", "getTitleIndicator()Lcom/viewpagerindicator/CirclePageIndicator;"))};
    /* renamed from: b */
    private final Lazy f31878b = C18451c.a(LazyThreadSafetyMode.NONE, new FeedSpotifyTopArtistMediaView$$special$$inlined$bindView$1(this, R.id.feedImageContentViewSpotifyTrack));
    /* renamed from: c */
    private final Lazy f31879c = C18451c.a(LazyThreadSafetyMode.NONE, new FeedSpotifyTopArtistMediaView$$special$$inlined$bindView$2(this, R.id.feedSpotifyCarousel));
    /* renamed from: d */
    private final Lazy f31880d = C18451c.a(LazyThreadSafetyMode.NONE, new FeedSpotifyTopArtistMediaView$$special$$inlined$bindView$3(this, R.id.feedSpotifyPageIndicator));

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/tinder/feed/view/media/FeedSpotifyTopArtistMediaView$FeedSpotifyTopArtistViewModel;", "", "id", "", "songs", "", "Lcom/tinder/chat/view/model/SpotifySongViewModel;", "images", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getSongs", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.media.l$b */
    public static final class C9520b {
        @NotNull
        /* renamed from: a */
        private final String f31874a;
        @NotNull
        /* renamed from: b */
        private final List<ak> f31875b;
        @NotNull
        /* renamed from: c */
        private final List<C10636b> f31876c;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9520b) {
                    C9520b c9520b = (C9520b) obj;
                    if (C2668g.a(this.f31874a, c9520b.f31874a) && C2668g.a(this.f31875b, c9520b.f31875b) && C2668g.a(this.f31876c, c9520b.f31876c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f31874a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List list = this.f31875b;
            hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            list = this.f31876c;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FeedSpotifyTopArtistViewModel(id=");
            stringBuilder.append(this.f31874a);
            stringBuilder.append(", songs=");
            stringBuilder.append(this.f31875b);
            stringBuilder.append(", images=");
            stringBuilder.append(this.f31876c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9520b(@NotNull String str, @NotNull List<ak> list, @NotNull List<C10636b> list2) {
            C2668g.b(str, "id");
            C2668g.b(list, "songs");
            C2668g.b(list2, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
            this.f31874a = str;
            this.f31875b = list;
            this.f31876c = list2;
        }

        @NotNull
        /* renamed from: a */
        public final String m39780a() {
            return this.f31874a;
        }

        @NotNull
        /* renamed from: b */
        public final List<ak> m39781b() {
            return this.f31875b;
        }

        @NotNull
        /* renamed from: c */
        public final List<C10636b> m39782c() {
            return this.f31876c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0018\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018H\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/feed/view/media/FeedSpotifyTopArtistMediaView$FeedSpotifyMediaAdapter;", "Landroid/support/v4/view/PagerAdapter;", "viewModel", "Lcom/tinder/feed/view/media/FeedSpotifyTopArtistMediaView$FeedSpotifyTopArtistViewModel;", "spotifyDeeplinkClickListener", "Lkotlin/Function0;", "", "Lcom/tinder/common/feed/view/SpotifyDeeplinkClickListener;", "playerControlsClickListener", "Lcom/tinder/spotify/views/SpotifyPlayerView$PlayerControlsClickListener;", "(Lcom/tinder/feed/view/media/FeedSpotifyTopArtistMediaView$FeedSpotifyTopArtistViewModel;Lkotlin/jvm/functions/Function0;Lcom/tinder/spotify/views/SpotifyPlayerView$PlayerControlsClickListener;)V", "feedItemId", "", "getFeedItemId$Tinder_release", "()Ljava/lang/String;", "songs", "", "Lcom/tinder/chat/view/model/SpotifySongViewModel;", "destroyItem", "collection", "Landroid/view/ViewGroup;", "position", "", "view", "", "getCount", "instantiateItem", "container", "isViewFromObject", "", "Landroid/view/View;", "object", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.media.l$a */
    public static final class C11761a extends C0600i {
        @NotNull
        /* renamed from: a */
        private final String f38433a;
        /* renamed from: b */
        private final List<ak> f38434b;
        /* renamed from: c */
        private final Function0<C15813i> f38435c;
        /* renamed from: d */
        private final PlayerControlsClickListener f38436d;

        public boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
            C2668g.b(view, "view");
            C2668g.b(obj, "object");
            return view == obj;
        }

        public C11761a(@NotNull C9520b c9520b, @NotNull Function0<C15813i> function0, @NotNull PlayerControlsClickListener playerControlsClickListener) {
            C2668g.b(c9520b, "viewModel");
            C2668g.b(function0, "spotifyDeeplinkClickListener");
            C2668g.b(playerControlsClickListener, "playerControlsClickListener");
            this.f38435c = function0;
            this.f38436d = playerControlsClickListener;
            this.f38433a = c9520b.m39780a();
            this.f38434b = c9520b.m39781b();
        }

        public int getCount() {
            return this.f38434b.size();
        }

        @NotNull
        public Object instantiateItem(@NotNull ViewGroup viewGroup, int i) {
            C2668g.b(viewGroup, "container");
            i = FeedSpotifyTrackPlayerView.f42052e.m39636a(viewGroup, C9479b.m39645a((ak) this.f38434b.get(i), this.f38433a), this.f38436d, this.f38435c);
            viewGroup.addView((View) i);
            return i;
        }

        public void destroyItem(@NotNull ViewGroup viewGroup, int i, @NotNull Object obj) {
            C2668g.b(viewGroup, "collection");
            C2668g.b(obj, "view");
            viewGroup.removeView((View) obj);
        }
    }

    private final FeedImageContentView getFeedImageContentView() {
        Lazy lazy = this.f31878b;
        KProperty kProperty = f31877a[0];
        return (FeedImageContentView) lazy.getValue();
    }

    private final FeedCarouselView getMediaViewPager() {
        Lazy lazy = this.f31879c;
        KProperty kProperty = f31877a[1];
        return (FeedCarouselView) lazy.getValue();
    }

    private final CirclePageIndicator getTitleIndicator() {
        Lazy lazy = this.f31880d;
        KProperty kProperty = f31877a[2];
        return (CirclePageIndicator) lazy.getValue();
    }

    public C9521l(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        FrameLayout.inflate(context, R.layout.feed_spotify_top_artist_media_view, this);
        setLayoutParams(C8529a.f30276a.m36494b());
        setClipChildren(null);
    }

    /* renamed from: a */
    public final void m39783a(@NotNull C9520b c9520b, @NotNull Function0<C15813i> function0, @NotNull PlayerControlsClickListener playerControlsClickListener, @NotNull OnFeedItemDoubleTapListener onFeedItemDoubleTapListener) {
        C2668g.b(c9520b, "viewModel");
        C2668g.b(function0, "spotifyDeeplinkClickListener");
        C2668g.b(playerControlsClickListener, "playerControlsClickListener");
        C2668g.b(onFeedItemDoubleTapListener, "onFeedItemDoubleTapListener");
        C9513e.m39771a(onFeedItemDoubleTapListener, getFeedImageContentView());
        getMediaViewPager().m51337a((C0600i) new C11761a(c9520b, function0, playerControlsClickListener), C9478a.m39642a(c9520b));
        getTitleIndicator().setViewPager(getMediaViewPager());
        View titleIndicator = getTitleIndicator();
        playerControlsClickListener = getMediaViewPager().getAdapter();
        if (playerControlsClickListener == null) {
            C2668g.a();
        }
        C2668g.a(playerControlsClickListener, "mediaViewPager.adapter!!");
        onFeedItemDoubleTapListener = true;
        if (playerControlsClickListener.getCount() <= 1) {
            onFeedItemDoubleTapListener = null;
        }
        C8587g.m36614a(titleIndicator, onFeedItemDoubleTapListener);
        FeedImageContentView.m42982a(getFeedImageContentView(), c9520b.m39782c(), null, 2, null);
    }
}
