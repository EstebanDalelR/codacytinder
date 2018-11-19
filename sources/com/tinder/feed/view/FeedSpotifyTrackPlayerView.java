package com.tinder.feed.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.R;
import com.tinder.common.feed.view.SpotifyTrackPlayerView;
import com.tinder.common.feed.view.SpotifyTrackPlayerView.TrackType;
import com.tinder.domain.feed.FeedCarouselItemSelected;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.feed.p249d.C9462a;
import com.tinder.feed.usecase.C11707c;
import com.tinder.feed.view.message.C9533a;
import com.tinder.feed.view.provider.C9542a;
import com.tinder.module.FeedViewComponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.views.SpotifyPlayerView.PlayerControlsClickListener;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 02\u00020\u0001:\u000201B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u0010\u0010$\u001a\f\u0012\u0004\u0012\u00020 0%j\u0002`&J\u0018\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0002J\b\u0010+\u001a\u00020 H\u0002J\b\u0010\u0017\u001a\u00020 H\u0002J\b\u0010,\u001a\u00020 H\u0014J\b\u0010-\u001a\u00020 H\u0014J\r\u0010.\u001a\u00020 H\u0010¢\u0006\u0002\b/R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/tinder/feed/view/FeedSpotifyTrackPlayerView;", "Lcom/tinder/common/feed/view/SpotifyTrackPlayerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "feedCarouselItemSelectedProvider", "Lcom/tinder/feed/provider/FeedCarouselItemSelectedProvider;", "getFeedCarouselItemSelectedProvider$Tinder_release", "()Lcom/tinder/feed/provider/FeedCarouselItemSelectedProvider;", "setFeedCarouselItemSelectedProvider$Tinder_release", "(Lcom/tinder/feed/provider/FeedCarouselItemSelectedProvider;)V", "feedComposerProvider", "Lcom/tinder/feed/view/provider/FeedComposerProvider;", "getFeedComposerProvider$Tinder_release", "()Lcom/tinder/feed/view/provider/FeedComposerProvider;", "setFeedComposerProvider$Tinder_release", "(Lcom/tinder/feed/view/provider/FeedComposerProvider;)V", "observeFeedVisible", "Lcom/tinder/feed/usecase/ObserveFeedVisible;", "getObserveFeedVisible$Tinder_release", "()Lcom/tinder/feed/usecase/ObserveFeedVisible;", "setObserveFeedVisible$Tinder_release", "(Lcom/tinder/feed/usecase/ObserveFeedVisible;)V", "spotifyViewModel", "Lcom/tinder/feed/view/FeedSpotifyTrackPlayerView$FeedSpotifyTrackPlayerViewModel;", "bind", "", "viewModel", "playerControlsClickListener", "Lcom/tinder/spotify/views/SpotifyPlayerView$PlayerControlsClickListener;", "spotifyDeeplinkClickListener", "Lkotlin/Function0;", "Lcom/tinder/common/feed/view/SpotifyDeeplinkClickListener;", "observeCarouselItemSelected", "feedItemId", "", "mediaId", "observeComposerOpen", "onAttachedToWindow", "onDetachedFromWindow", "setupDagger", "setupDagger$Tinder_release", "Companion", "FeedSpotifyTrackPlayerViewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedSpotifyTrackPlayerView extends SpotifyTrackPlayerView {
    /* renamed from: e */
    public static final C9476a f42052e = new C9476a();
    @Inject
    @NotNull
    /* renamed from: b */
    public C11707c f42053b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C9462a f42054c;
    @Inject
    @NotNull
    /* renamed from: d */
    public C9542a f42055d;
    /* renamed from: f */
    private final C17356a f42056f;
    /* renamed from: g */
    private C9477b f42057g;
    /* renamed from: h */
    private HashMap f42058h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/feed/view/FeedSpotifyTrackPlayerView$Companion;", "", "()V", "inflateAndBindView", "Lcom/tinder/feed/view/FeedSpotifyTrackPlayerView;", "container", "Landroid/view/ViewGroup;", "viewModel", "Lcom/tinder/feed/view/FeedSpotifyTrackPlayerView$FeedSpotifyTrackPlayerViewModel;", "playerControlsClickListener", "Lcom/tinder/spotify/views/SpotifyPlayerView$PlayerControlsClickListener;", "spotifyDeeplinkClickListener", "Lkotlin/Function0;", "", "Lcom/tinder/common/feed/view/SpotifyDeeplinkClickListener;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedSpotifyTrackPlayerView$a */
    public static final class C9476a {
        private C9476a() {
        }

        @NotNull
        /* renamed from: a */
        public final FeedSpotifyTrackPlayerView m39636a(@NotNull ViewGroup viewGroup, @NotNull C9477b c9477b, @NotNull PlayerControlsClickListener playerControlsClickListener, @NotNull Function0<C15813i> function0) {
            C2668g.b(viewGroup, "container");
            C2668g.b(c9477b, "viewModel");
            C2668g.b(playerControlsClickListener, "playerControlsClickListener");
            C2668g.b(function0, "spotifyDeeplinkClickListener");
            if (C9489e.f31805a[c9477b.m39639c().ordinal()] != 1) {
                throw ((Throwable) new RuntimeException("TrackType not supported"));
            }
            viewGroup = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.feed_spotify_top_artist_media_item_view, viewGroup, false);
            if (viewGroup == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.feed.view.FeedSpotifyTrackPlayerView");
            }
            FeedSpotifyTrackPlayerView feedSpotifyTrackPlayerView = (FeedSpotifyTrackPlayerView) viewGroup;
            feedSpotifyTrackPlayerView.m51353a(c9477b, playerControlsClickListener, function0);
            return feedSpotifyTrackPlayerView;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/tinder/feed/view/FeedSpotifyTrackPlayerView$FeedSpotifyTrackPlayerViewModel;", "", "feedItemId", "", "mediaItemId", "trackType", "Lcom/tinder/common/feed/view/SpotifyTrackPlayerView$TrackType;", "searchTrack", "Lcom/tinder/spotify/model/SearchTrack;", "(Ljava/lang/String;Ljava/lang/String;Lcom/tinder/common/feed/view/SpotifyTrackPlayerView$TrackType;Lcom/tinder/spotify/model/SearchTrack;)V", "getFeedItemId", "()Ljava/lang/String;", "getMediaItemId", "getSearchTrack", "()Lcom/tinder/spotify/model/SearchTrack;", "getTrackType", "()Lcom/tinder/common/feed/view/SpotifyTrackPlayerView$TrackType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedSpotifyTrackPlayerView$b */
    public static final class C9477b {
        @NotNull
        /* renamed from: a */
        private final String f31782a;
        @NotNull
        /* renamed from: b */
        private final String f31783b;
        @NotNull
        /* renamed from: c */
        private final TrackType f31784c;
        @NotNull
        /* renamed from: d */
        private final SearchTrack f31785d;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9477b) {
                    C9477b c9477b = (C9477b) obj;
                    if (C2668g.a(this.f31782a, c9477b.f31782a) && C2668g.a(this.f31783b, c9477b.f31783b) && C2668g.a(this.f31784c, c9477b.f31784c) && C2668g.a(this.f31785d, c9477b.f31785d)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f31782a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f31783b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            TrackType trackType = this.f31784c;
            hashCode = (hashCode + (trackType != null ? trackType.hashCode() : 0)) * 31;
            SearchTrack searchTrack = this.f31785d;
            if (searchTrack != null) {
                i = searchTrack.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FeedSpotifyTrackPlayerViewModel(feedItemId=");
            stringBuilder.append(this.f31782a);
            stringBuilder.append(", mediaItemId=");
            stringBuilder.append(this.f31783b);
            stringBuilder.append(", trackType=");
            stringBuilder.append(this.f31784c);
            stringBuilder.append(", searchTrack=");
            stringBuilder.append(this.f31785d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9477b(@NotNull String str, @NotNull String str2, @NotNull TrackType trackType, @NotNull SearchTrack searchTrack) {
            C2668g.b(str, "feedItemId");
            C2668g.b(str2, "mediaItemId");
            C2668g.b(trackType, "trackType");
            C2668g.b(searchTrack, "searchTrack");
            this.f31782a = str;
            this.f31783b = str2;
            this.f31784c = trackType;
            this.f31785d = searchTrack;
        }

        @NotNull
        /* renamed from: a */
        public final String m39637a() {
            return this.f31782a;
        }

        @NotNull
        /* renamed from: b */
        public final String m39638b() {
            return this.f31783b;
        }

        @NotNull
        /* renamed from: c */
        public final TrackType m39639c() {
            return this.f31784c;
        }

        @NotNull
        /* renamed from: d */
        public final SearchTrack m39640d() {
            return this.f31785d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedSpotifyTrackPlayerView$c */
    static final class C11710c<T> implements Predicate<FeedCarouselItemSelected> {
        /* renamed from: a */
        final /* synthetic */ String f38228a;

        C11710c(String str) {
            this.f38228a = str;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47538a((FeedCarouselItemSelected) obj);
        }

        /* renamed from: a */
        public final boolean m47538a(@NotNull FeedCarouselItemSelected feedCarouselItemSelected) {
            C2668g.b(feedCarouselItemSelected, "it");
            return C2668g.a(feedCarouselItemSelected.getFeedItemId(), this.f38228a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedSpotifyTrackPlayerView$d */
    static final class C11711d<T> implements Predicate<FeedCarouselItemSelected> {
        /* renamed from: a */
        final /* synthetic */ String f38229a;

        C11711d(String str) {
            this.f38229a = str;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47539a((FeedCarouselItemSelected) obj);
        }

        /* renamed from: a */
        public final boolean m47539a(@NotNull FeedCarouselItemSelected feedCarouselItemSelected) {
            C2668g.b(feedCarouselItemSelected, "it");
            return C2668g.a(feedCarouselItemSelected.getMediaItemId(), this.f38229a) ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedSpotifyTrackPlayerView$e */
    static final class C11712e<T> implements Consumer<FeedCarouselItemSelected> {
        /* renamed from: a */
        final /* synthetic */ FeedSpotifyTrackPlayerView f38230a;

        C11712e(FeedSpotifyTrackPlayerView feedSpotifyTrackPlayerView) {
            this.f38230a = feedSpotifyTrackPlayerView;
        }

        public /* synthetic */ void accept(Object obj) {
            m47540a((FeedCarouselItemSelected) obj);
        }

        /* renamed from: a */
        public final void m47540a(FeedCarouselItemSelected feedCarouselItemSelected) {
            this.f38230a.stopTrack();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedSpotifyTrackPlayerView$f */
    static final class C11713f<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11713f f38231a = new C11713f();

        C11713f() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47541a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47541a(Throwable th) {
            C0001a.c(th, "Error observing carousel item selected", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/feed/view/message/ComposerStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedSpotifyTrackPlayerView$g */
    static final class C11714g<T> implements Consumer<C9533a> {
        /* renamed from: a */
        final /* synthetic */ FeedSpotifyTrackPlayerView f38232a;

        C11714g(FeedSpotifyTrackPlayerView feedSpotifyTrackPlayerView) {
            this.f38232a = feedSpotifyTrackPlayerView;
        }

        public /* synthetic */ void accept(Object obj) {
            m47542a((C9533a) obj);
        }

        /* renamed from: a */
        public final void m47542a(C9533a c9533a) {
            this.f38232a.stopTrack();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedSpotifyTrackPlayerView$h */
    static final class C11715h<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11715h f38233a = new C11715h();

        C11715h() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47543a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47543a(Throwable th) {
            C0001a.c(th, "Error observing composer open events", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedSpotifyTrackPlayerView$i */
    static final class C11716i<T> implements Predicate<Boolean> {
        /* renamed from: a */
        public static final C11716i f38234a = new C11716i();

        C11716i() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47544a((Boolean) obj);
        }

        /* renamed from: a */
        public final boolean m47544a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            return bool.booleanValue() ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedSpotifyTrackPlayerView$j */
    static final class C11717j<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ FeedSpotifyTrackPlayerView f38235a;

        C11717j(FeedSpotifyTrackPlayerView feedSpotifyTrackPlayerView) {
            this.f38235a = feedSpotifyTrackPlayerView;
        }

        public /* synthetic */ void accept(Object obj) {
            m47545a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m47545a(Boolean bool) {
            this.f38235a.stopTrack();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedSpotifyTrackPlayerView$k */
    static final class C11718k<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11718k f38236a = new C11718k();

        C11718k() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47546a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47546a(Throwable th) {
            C0001a.c(th, "Error observing feed tab selected", new Object[0]);
        }
    }

    @JvmOverloads
    public FeedSpotifyTrackPlayerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public FeedSpotifyTrackPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo11002a(int i) {
        if (this.f42058h == null) {
            this.f42058h = new HashMap();
        }
        View view = (View) this.f42058h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f42058h.put(Integer.valueOf(i), view);
        return view;
    }

    @JvmOverloads
    public /* synthetic */ FeedSpotifyTrackPlayerView(Context context, AttributeSet attributeSet, int i, int i2, C15823e c15823e) {
        if ((i2 & 2) != null) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @JvmOverloads
    public FeedSpotifyTrackPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        C2668g.b(context, "context");
        super(context, attributeSet, i);
        this.f42056f = new C17356a();
    }

    @NotNull
    public final C11707c getObserveFeedVisible$Tinder_release() {
        C11707c c11707c = this.f42053b;
        if (c11707c == null) {
            C2668g.b("observeFeedVisible");
        }
        return c11707c;
    }

    public final void setObserveFeedVisible$Tinder_release(@NotNull C11707c c11707c) {
        C2668g.b(c11707c, "<set-?>");
        this.f42053b = c11707c;
    }

    @NotNull
    public final C9462a getFeedCarouselItemSelectedProvider$Tinder_release() {
        C9462a c9462a = this.f42054c;
        if (c9462a == null) {
            C2668g.b("feedCarouselItemSelectedProvider");
        }
        return c9462a;
    }

    public final void setFeedCarouselItemSelectedProvider$Tinder_release(@NotNull C9462a c9462a) {
        C2668g.b(c9462a, "<set-?>");
        this.f42054c = c9462a;
    }

    @NotNull
    public final C9542a getFeedComposerProvider$Tinder_release() {
        C9542a c9542a = this.f42055d;
        if (c9542a == null) {
            C2668g.b("feedComposerProvider");
        }
        return c9542a;
    }

    public final void setFeedComposerProvider$Tinder_release(@NotNull C9542a c9542a) {
        C2668g.b(c9542a, "<set-?>");
        this.f42055d = c9542a;
    }

    /* renamed from: a */
    public void mo11003a() {
        if (!isInEditMode()) {
            Context a = C14398a.a(getContext());
            if (a == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.module.FeedViewComponentProvider");
            }
            ((FeedViewComponentProvider) a).provideFeedViewComponent().inject(this);
        }
    }

    /* renamed from: a */
    public final void m51353a(@NotNull C9477b c9477b, @NotNull PlayerControlsClickListener playerControlsClickListener, @NotNull Function0<C15813i> function0) {
        C2668g.b(c9477b, "viewModel");
        C2668g.b(playerControlsClickListener, "playerControlsClickListener");
        C2668g.b(function0, "spotifyDeeplinkClickListener");
        this.f42057g = c9477b;
        m43005a(c9477b.m39640d(), c9477b.m39639c(), playerControlsClickListener, function0);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9477b c9477b = this.f42057g;
        if (c9477b == null) {
            throw new IllegalStateException("developer error - bind must be called before this view is attached".toString());
        }
        m51349b();
        m51348a(c9477b.m39637a(), c9477b.m39638b());
        m51350c();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42056f.a();
    }

    /* renamed from: b */
    private final void m51349b() {
        C11707c c11707c = this.f42053b;
        if (c11707c == null) {
            C2668g.b("observeFeedVisible");
        }
        this.f42056f.add(c11707c.observe().filter(C11716i.f38234a).subscribe(new C11717j(this), C11718k.f38236a));
    }

    /* renamed from: c */
    private final void m51350c() {
        C9542a c9542a = this.f42055d;
        if (c9542a == null) {
            C2668g.b("feedComposerProvider");
        }
        this.f42056f.add(RxJavaInteropExtKt.toV2Observable(c9542a.m39817a()).subscribe(new C11714g(this), C11715h.f38233a));
    }

    /* renamed from: a */
    private final void m51348a(String str, String str2) {
        C9462a c9462a = this.f42054c;
        if (c9462a == null) {
            C2668g.b("feedCarouselItemSelectedProvider");
        }
        this.f42056f.add(RxJavaInteropExtKt.toV2Observable(c9462a.m39565a()).filter(new C11710c(str)).filter(new C11711d(str2)).subscribe((Consumer) new C11712e(this), C11713f.f38231a));
    }
}
