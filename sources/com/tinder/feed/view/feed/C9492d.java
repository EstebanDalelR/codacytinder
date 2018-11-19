package com.tinder.feed.view.feed;

import com.tinder.chat.view.model.C10636b;
import com.tinder.chat.view.model.C10637d;
import com.tinder.chat.view.model.C10638f;
import com.tinder.chat.view.model.C10639h;
import com.tinder.chat.view.model.C8493c;
import com.tinder.chat.view.model.C8495g;
import com.tinder.chat.view.model.C8496j;
import com.tinder.chat.view.model.C8499q;
import com.tinder.chat.view.model.PhotoMediaViewModel;
import com.tinder.chat.view.model.ak;
import com.tinder.common.feed.view.SpotifyTrackPlayerView.TrackType;
import com.tinder.feed.view.media.C9507a;
import com.tinder.feed.view.media.C9508b;
import com.tinder.feed.view.media.C9509c;
import com.tinder.feed.view.media.C9510d;
import com.tinder.feed.view.media.C9521l;
import com.tinder.feed.view.media.C9521l.C9520b;
import com.tinder.feed.view.media.C9522m;
import com.tinder.feed.view.media.FeedInstagramMediaView;
import com.tinder.feed.view.media.FeedInstagramMediaView.C9506b;
import com.tinder.feed.view.media.OnFeedItemDoubleTapListener;
import com.tinder.feed.view.message.C9533a.C11763b;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.C13280h;
import com.tinder.feed.view.model.C13281i;
import com.tinder.feed.view.model.C13282k;
import com.tinder.feed.view.model.C13283l;
import com.tinder.feed.view.model.C13284m;
import com.tinder.feed.view.model.C13285n;
import com.tinder.feed.view.model.C13286o;
import com.tinder.feed.view.model.C13287p;
import com.tinder.feed.view.model.C13288q;
import com.tinder.feed.view.model.C13289r;
import com.tinder.feed.view.model.C9539e;
import com.tinder.feed.view.model.FeedCommentViewModel;
import com.tinder.feed.view.provider.C9542a;
import com.tinder.spotify.views.SpotifyPlayerView.PlayerControlsClickListener;
import com.tinder.video.model.C17250a;
import com.tinder.video.model.C17251d;
import com.tinder.video.view.MediaView.VideoMuteListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a.\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rH\u0002\u001a\u0012\u0010\u000e\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0010\u001a\u0012\u0010\u000e\u001a\u00020\f*\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0012\u001a\u0012\u0010\u000e\u001a\u00020\f*\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u0012\u0010\u000e\u001a\u00020\f*\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0015\u001a\u0012\u0010\u000e\u001a\u00020\f*\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0012\u0010\u000e\u001a\u00020\f*\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0018\u001a\u0012\u0010\u000e\u001a\u00020\f*\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u001a\u001a\u0012\u0010\u000e\u001a\u00020\f*\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u001c\u001a\u0012\u0010\u000e\u001a\u00020\f*\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001e\u001a\u0012\u0010\u000e\u001a\u00020\f*\u00020\u001f2\u0006\u0010\u0006\u001a\u00020 \u001a\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"*\b\u0012\u0004\u0012\u00020$0\"\u001a\n\u0010%\u001a\u00020&*\u00020#\u001a\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\"*\b\u0012\u0004\u0012\u00020#0\"\u001a\n\u0010(\u001a\u00020)*\u00020*\u001a\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\"*\b\u0012\u0004\u0012\u00020*0\"*\u0018\b\u0000\u0010,\"\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006-"}, d2 = {"getFilteredViewModel", "Lcom/tinder/feed/view/model/NewMatchFeedViewModel;", "feedItem", "Lcom/tinder/feed/view/model/ProfileAddPhotoFeedViewModel;", "getOnDoubleTapListener", "Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;", "viewModel", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "feedComposerProvider", "Lcom/tinder/feed/view/provider/FeedComposerProvider;", "sendDoubleTapAnalytics", "Lkotlin/Function0;", "", "Lcom/tinder/feed/view/feed/DoubleTapAnalyticsListener;", "bindContentView", "Lcom/tinder/feed/view/feed/ConnectedInstagramFeedView;", "Lcom/tinder/feed/view/model/InstagramConnectFeedViewModel;", "Lcom/tinder/feed/view/feed/InstagramFeedItemView;", "Lcom/tinder/feed/view/model/InstagramMediaFeedViewModel;", "Lcom/tinder/feed/view/feed/NewMatchFeedView;", "Lcom/tinder/feed/view/feed/ProfileAddLoopFeedView;", "Lcom/tinder/feed/view/model/ProfileAddLoopFeedViewModel;", "Lcom/tinder/feed/view/feed/ProfileAddPhotoFeedView;", "Lcom/tinder/feed/view/feed/ProfileChangeBioFeedView;", "Lcom/tinder/feed/view/model/ProfileChangeBioFeedViewModel;", "Lcom/tinder/feed/view/feed/ProfileChangeSchoolFeedView;", "Lcom/tinder/feed/view/model/ProfileChangeSchoolFeedViewModel;", "Lcom/tinder/feed/view/feed/ProfileChangeWorkFeedView;", "Lcom/tinder/feed/view/model/ProfileChangeWorkFeedViewModel;", "Lcom/tinder/feed/view/feed/SpotifyNewAnthemFeedView;", "Lcom/tinder/feed/view/model/SpotifyNewAnthemFeedViewModel;", "Lcom/tinder/feed/view/feed/SpotifyNewTopArtistFeedView;", "Lcom/tinder/feed/view/model/ProfileSpotifyArtistFeedViewModel;", "firstImageMedia", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "Lcom/tinder/chat/view/model/PhotoMediaViewModel;", "toImageViewModel", "Lcom/tinder/video/model/ImageViewModel;", "toImageViewModels", "toVideoViewModel", "Lcom/tinder/video/model/VideoViewModel;", "Lcom/tinder/chat/view/model/ActivityFeedVideoViewModel;", "toVideoViewModels", "DoubleTapAnalyticsListener", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.feed.d */
public final class C9492d {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/tinder/feed/view/feed/FeedContentViewExtensionsKt$bindContentView$playbackControlsClickListener$1", "Lcom/tinder/spotify/views/SpotifyPlayerView$PlayerControlsClickListener;", "(Lcom/tinder/feed/view/feed/SpotifyNewAnthemFeedView;Lcom/tinder/feed/view/model/SpotifyNewAnthemFeedViewModel;)V", "onPlayClicked", "", "onStopClicked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.feed.d$a */
    public static final class C11731a implements PlayerControlsClickListener {
        /* renamed from: a */
        final /* synthetic */ C11750y f38285a;
        /* renamed from: b */
        final /* synthetic */ C13289r f38286b;

        C11731a(C11750y c11750y, C13289r c13289r) {
            this.f38285a = c11750y;
            this.f38286b = c13289r;
        }

        public void onPlayClicked() {
            this.f38285a.getPresenter$Tinder_release().m39586c(this.f38286b);
        }

        public void onStopClicked() {
            this.f38285a.getPresenter$Tinder_release().m39587d(this.f38286b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/tinder/feed/view/feed/FeedContentViewExtensionsKt$bindContentView$playbackControlsClickListener$2", "Lcom/tinder/spotify/views/SpotifyPlayerView$PlayerControlsClickListener;", "(Lcom/tinder/feed/view/feed/SpotifyNewTopArtistFeedView;Lcom/tinder/feed/view/model/ProfileSpotifyArtistFeedViewModel;)V", "onPlayClicked", "", "onStopClicked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.feed.d$b */
    public static final class C11732b implements PlayerControlsClickListener {
        /* renamed from: a */
        final /* synthetic */ aa f38287a;
        /* renamed from: b */
        final /* synthetic */ C13288q f38288b;

        C11732b(aa aaVar, C13288q c13288q) {
            this.f38287a = aaVar;
            this.f38288b = c13288q;
        }

        public void onPlayClicked() {
            this.f38287a.getPresenter$Tinder_release().m39586c(this.f38288b);
        }

        public void onStopClicked() {
            this.f38287a.getPresenter$Tinder_release().m39587d(this.f38288b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/tinder/feed/view/feed/FeedContentViewExtensionsKt$bindContentView$videoMuteListener$1", "Lcom/tinder/video/view/MediaView$VideoMuteListener;", "(Lcom/tinder/feed/view/feed/InstagramFeedItemView;Lcom/tinder/feed/view/model/InstagramMediaFeedViewModel;)V", "onAudioMuted", "", "onAudioUnMuted", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.feed.d$c */
    public static final class C11733c implements VideoMuteListener {
        /* renamed from: a */
        final /* synthetic */ C11735j f38289a;
        /* renamed from: b */
        final /* synthetic */ C13281i f38290b;

        C11733c(C11735j c11735j, C13281i c13281i) {
            this.f38289a = c11735j;
            this.f38290b = c13281i;
        }

        public void onAudioMuted() {
            this.f38289a.getPresenter$Tinder_release().m39592i(this.f38290b);
        }

        public void onAudioUnMuted() {
            this.f38289a.getPresenter$Tinder_release().m39593j(this.f38290b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/feed/view/feed/FeedContentViewExtensionsKt$getOnDoubleTapListener$1", "Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;", "(Lkotlin/jvm/functions/Function0;Lcom/tinder/feed/view/model/ActivityFeedViewModel;Lcom/tinder/feed/view/provider/FeedComposerProvider;)V", "onDoubleTap", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.feed.d$d */
    public static final class C11734d implements OnFeedItemDoubleTapListener {
        /* renamed from: a */
        final /* synthetic */ Function0 f38291a;
        /* renamed from: b */
        final /* synthetic */ ActivityFeedViewModel f38292b;
        /* renamed from: c */
        final /* synthetic */ C9542a f38293c;

        C11734d(Function0 function0, ActivityFeedViewModel activityFeedViewModel, C9542a c9542a) {
            this.f38291a = function0;
            this.f38292b = activityFeedViewModel;
            this.f38293c = c9542a;
        }

        public void onDoubleTap() {
            this.f38291a.invoke();
            if (this.f38292b.mo11144f() == null) {
                this.f38293c.m39818a(new C11763b(this.f38292b.getId()));
            }
        }
    }

    /* renamed from: a */
    public static final void m39687a(@NotNull C11735j c11735j, @NotNull C13281i c13281i) {
        C2668g.b(c11735j, "$receiver");
        C2668g.b(c13281i, "viewModel");
        C11733c c11733c = new C11733c(c11735j, c13281i);
        Collection arrayList = new ArrayList();
        for (Object next : c13281i.m51379g().m42956f()) {
            Object obj;
            C8499q c8499q = (C8499q) next;
            FeedCommentViewModel f = c13281i.mo11144f();
            if ((f != null ? f.m39795g() : null) != null) {
                if (!C2668g.a(c8499q.m36419a(), c13281i.mo11144f().m39795g())) {
                    obj = null;
                    if (obj != null) {
                        arrayList.add(next);
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                arrayList.add(next);
            }
        }
        c11735j.getFeedMediaView$Tinder_release().m39761a(new C9506b(c13281i.getId(), (List) arrayList), c11733c, C9492d.m39679a(c13281i, c11735j.getFeedComposerProvider$Tinder_release(), new FeedContentViewExtensionsKt$bindContentView$doubleTapListener$1(c11735j, c13281i)));
    }

    /* renamed from: a */
    public static final void m39694a(@NotNull C11750y c11750y, @NotNull C13289r c13289r) {
        C2668g.b(c11750y, "$receiver");
        C2668g.b(c13289r, "viewModel");
        c11750y.getFeedMediaView$Tinder_release().m39779a(new C9522m(c13289r.getId(), C8496j.m36390a(c13289r.m51439g().m42934c()), TrackType.ANTHEM, C9492d.m39684a(c13289r.mo11143e().m39805c())), new C11731a(c11750y, c13289r), new FeedContentViewExtensionsKt$bindContentView$1(c11750y, c13289r), C9492d.m39679a(c13289r, c11750y.getFeedComposerProvider$Tinder_release(), new FeedContentViewExtensionsKt$bindContentView$doubleTapListener$2(c11750y, c13289r)));
    }

    /* renamed from: a */
    public static final void m39686a(@NotNull aa aaVar, @NotNull C13288q c13288q) {
        C2668g.b(aaVar, "$receiver");
        C2668g.b(c13288q, "viewModel");
        OnFeedItemDoubleTapListener a = C9492d.m39679a(c13288q, aaVar.getFeedComposerProvider$Tinder_release(), new FeedContentViewExtensionsKt$bindContentView$doubleTapListener$3(aaVar, c13288q));
        C11732b c11732b = new C11732b(aaVar, c13288q);
        C9521l feedMediaView$Tinder_release = aaVar.getFeedMediaView$Tinder_release();
        String id = c13288q.getId();
        Collection arrayList = new ArrayList();
        for (Object next : c13288q.m51432g().m42930c()) {
            Object obj;
            ak akVar = (ak) next;
            FeedCommentViewModel f = c13288q.mo11144f();
            if ((f != null ? f.m39795g() : null) != null) {
                if (!C2668g.a(akVar.m36349a(), c13288q.mo11144f().m39795g())) {
                    obj = null;
                    if (obj != null) {
                        arrayList.add(next);
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                arrayList.add(next);
            }
        }
        feedMediaView$Tinder_release.m39783a(new C9520b(id, (List) arrayList, C9492d.m39684a(c13288q.mo11143e().m39805c())), new FeedContentViewExtensionsKt$bindContentView$3(aaVar, c13288q), c11732b, a);
    }

    /* renamed from: a */
    public static final void m39688a(@NotNull C11738m c11738m, @NotNull C13282k c13282k) {
        C2668g.b(c11738m, "$receiver");
        C2668g.b(c13282k, "viewModel");
        OnFeedItemDoubleTapListener a = C9492d.m39679a(c13282k, c11738m.getFeedComposerProvider$Tinder_release(), new FeedContentViewExtensionsKt$bindContentView$doubleTapListener$4(c11738m, c13282k));
        c11738m.getFeedMediaView$Tinder_release().m39762a(C9492d.m39680a(c13282k), a);
    }

    /* renamed from: a */
    private static final C13282k m39680a(C13282k c13282k) {
        FeedCommentViewModel f = c13282k.mo11144f();
        Object obj = null;
        if ((f != null ? f.m39795g() : null) == null) {
            return c13282k;
        }
        List c = c13282k.mo11143e().m39805c();
        for (Object next : c) {
            if (C2668g.a(((PhotoMediaViewModel) next).getId(), c13282k.mo11144f().m39795g())) {
                obj = next;
                break;
            }
        }
        obj = (PhotoMediaViewModel) obj;
        if (obj == null) {
            obj = (PhotoMediaViewModel) C19301m.f(c);
        }
        return C13282k.m51380a(c13282k, null, C9539e.m39801a(c13282k.mo11143e(), null, null, C19301m.a(obj), null, null, null, null, false, 251, null), null, null, null, null, null, 125, null);
    }

    /* renamed from: a */
    public static final void m39690a(@NotNull C11742q c11742q, @NotNull C13284m c13284m) {
        C2668g.b(c11742q, "$receiver");
        C2668g.b(c13284m, "viewModel");
        OnFeedItemDoubleTapListener a = C9492d.m39679a(c13284m, c11742q.getFeedComposerProvider$Tinder_release(), new FeedContentViewExtensionsKt$bindContentView$doubleTapListener$5(c11742q, c13284m));
        c11742q.getFeedMediaView$Tinder_release().m39763a(C9492d.m39681a(c13284m), a);
    }

    /* renamed from: a */
    private static final C13284m m39681a(C13284m c13284m) {
        FeedCommentViewModel f = c13284m.mo11144f();
        if ((f != null ? f.m39795g() : null) == null) {
            return c13284m;
        }
        Collection arrayList = new ArrayList();
        for (Object next : c13284m.mo11143e().m39805c()) {
            if (C2668g.a(((PhotoMediaViewModel) next).getId(), c13284m.mo11144f().m39795g())) {
                arrayList.add(next);
            }
        }
        return C13284m.m51396a(c13284m, null, C9539e.m39801a(c13284m.mo11143e(), null, null, (List) arrayList, null, null, null, null, false, 251, null), null, null, null, null, null, 125, null);
    }

    /* renamed from: a */
    public static final void m39685a(@NotNull C11729a c11729a, @NotNull C13280h c13280h) {
        C2668g.b(c11729a, "$receiver");
        C2668g.b(c13280h, "viewModel");
        OnFeedItemDoubleTapListener a = C9492d.m39679a(c13280h, c11729a.getFeedComposerProvider$Tinder_release(), new FeedContentViewExtensionsKt$bindContentView$doubleTapListener$6(c11729a, c13280h));
        String id = c13280h.getId();
        Iterable<C10638f> c = c13280h.m51372g().m42950c();
        Collection arrayList = new ArrayList(C19301m.a(c, 10));
        for (C10638f c10638f : c) {
            arrayList.add(new C8499q(c10638f.getId(), c10638f.m42942a()));
        }
        Collection arrayList2 = new ArrayList();
        for (Object next : (List) arrayList) {
            Object obj;
            C8499q c8499q = (C8499q) next;
            FeedCommentViewModel f = c13280h.mo11144f();
            if ((f != null ? f.m39795g() : null) != null) {
                if (!C2668g.a(c8499q.m36419a(), c13280h.mo11144f().m39795g())) {
                    obj = null;
                    if (obj != null) {
                        arrayList2.add(next);
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                arrayList2.add(next);
            }
        }
        FeedInstagramMediaView.m39760a(c11729a.getFeedMediaView$Tinder_release(), new C9506b(id, (List) arrayList2), null, a, 2, null);
    }

    /* renamed from: a */
    private static final OnFeedItemDoubleTapListener m39679a(ActivityFeedViewModel<?> activityFeedViewModel, C9542a c9542a, Function0<C15813i> function0) {
        return new C11734d(function0, activityFeedViewModel, c9542a);
    }

    /* renamed from: a */
    public static final void m39689a(@NotNull C11740o c11740o, @NotNull C13283l c13283l) {
        C2668g.b(c11740o, "$receiver");
        C2668g.b(c13283l, "viewModel");
        c11740o.getFeedMediaView$Tinder_release().m39772a(new C9510d(c13283l.getId(), (C10637d) C19301m.f(c13283l.m51395g().m42912c())), C9492d.m39679a(c13283l, c11740o.getFeedComposerProvider$Tinder_release(), new FeedContentViewExtensionsKt$bindContentView$doubleTapListener$7(c11740o, c13283l)));
    }

    @NotNull
    /* renamed from: a */
    public static final List<C10636b> m39684a(@NotNull List<? extends PhotoMediaViewModel> list) {
        C2668g.b(list, "$receiver");
        PhotoMediaViewModel photoMediaViewModel = (PhotoMediaViewModel) C19301m.f(list);
        if (photoMediaViewModel instanceof C10638f) {
            return ((C10638f) photoMediaViewModel).m42942a();
        }
        if (photoMediaViewModel instanceof C10637d) {
            return ((C10637d) photoMediaViewModel).m42940a();
        }
        throw ((Throwable) new IllegalStateException("Unknown PhotoMediaViewModel type"));
    }

    /* renamed from: a */
    public static final void m39691a(@NotNull C11744s c11744s, @NotNull C13285n c13285n) {
        C2668g.b(c11744s, "$receiver");
        C2668g.b(c13285n, "viewModel");
        OnFeedItemDoubleTapListener a = C9492d.m39679a(c13285n, c11744s.getFeedComposerProvider$Tinder_release(), new FeedContentViewExtensionsKt$bindContentView$doubleTapListener$8(c11744s, c13285n));
        c11744s.getFeedMediaView$Tinder_release().m39774a(new C9507a(c13285n.getId(), c13285n.m51411g().m42918c(), C9492d.m39684a(c13285n.mo11143e().m39805c())), a);
    }

    /* renamed from: a */
    public static final void m39693a(@NotNull C11748w c11748w, @NotNull C13287p c13287p) {
        C2668g.b(c11748w, "$receiver");
        C2668g.b(c13287p, "viewModel");
        OnFeedItemDoubleTapListener a = C9492d.m39679a(c13287p, c11748w.getFeedComposerProvider$Tinder_release(), new FeedContentViewExtensionsKt$bindContentView$doubleTapListener$9(c11748w, c13287p));
        C8493c c8493c = (C8493c) C19301m.f(c13287p.m51425g().m42926c());
        c11748w.getFeedMediaView$Tinder_release().m39778a(new C9509c(c13287p.getId(), c8493c.m36354a(), C9492d.m39684a(c13287p.mo11143e().m39805c())), a);
    }

    /* renamed from: a */
    public static final void m39692a(@NotNull C11746u c11746u, @NotNull C13286o c13286o) {
        C2668g.b(c11746u, "$receiver");
        C2668g.b(c13286o, "viewModel");
        OnFeedItemDoubleTapListener a = C9492d.m39679a(c13286o, c11746u.getFeedComposerProvider$Tinder_release(), new FeedContentViewExtensionsKt$bindContentView$doubleTapListener$10(c11746u, c13286o));
        C8495g c8495g = (C8495g) C19301m.f(c13286o.m51418g().m42922c());
        c11746u.getFeedMediaView$Tinder_release().m39776a(new C9508b(c13286o.getId(), c8495g.m36357b(), C9492d.m39684a(c13286o.mo11143e().m39805c())), a);
    }

    @NotNull
    /* renamed from: a */
    public static final C17250a m39682a(@NotNull C10636b c10636b) {
        C2668g.b(c10636b, "$receiver");
        return new C17250a(c10636b.m42936a(), c10636b.m42937b(), c10636b.m42938c(), c10636b.m42939d());
    }

    @NotNull
    /* renamed from: a */
    public static final C17251d m39683a(@NotNull C10639h c10639h) {
        C2668g.b(c10639h, "$receiver");
        return new C17251d(c10639h.m42943a(), c10639h.m42944b(), c10639h.m42945c(), c10639h.m42946d());
    }

    @NotNull
    /* renamed from: b */
    public static final List<C17251d> m39695b(@NotNull List<C10639h> list) {
        C2668g.b(list, "$receiver");
        Iterable<C10639h> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (C10639h a : iterable) {
            arrayList.add(C9492d.m39683a(a));
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: c */
    public static final List<C17250a> m39696c(@NotNull List<C10636b> list) {
        C2668g.b(list, "$receiver");
        Iterable<C10636b> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (C10636b a : iterable) {
            arrayList.add(C9492d.m39682a(a));
        }
        return (List) arrayList;
    }
}
