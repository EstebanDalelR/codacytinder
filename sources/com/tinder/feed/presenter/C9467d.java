package com.tinder.feed.presenter;

import com.tinder.feed.analytics.InteractSource;
import com.tinder.feed.analytics.InteractType;
import com.tinder.feed.analytics.MatchType;
import com.tinder.feed.analytics.events.C11687a;
import com.tinder.feed.analytics.events.C11687a.C9435a;
import com.tinder.feed.analytics.p247a.C9427h;
import com.tinder.feed.analytics.p247a.C9428i;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.C9541g;
import com.tinder.overflow.analytics.C12239a;
import com.tinder.overflow.analytics.C12239a.C10024a;
import com.tinder.overflow.model.ReportingSource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fJ\u001a\u0010\u0010\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u0011\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fJ\u0012\u0010\u0012\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fJ\u0012\u0010\u0013\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fJ\u001a\u0010\u0014\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fJ\u0012\u0010\u0018\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fJ\u0012\u0010\u0019\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fJ\u0012\u0010\u001a\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fJ\u0012\u0010\u001b\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fJ\u0012\u0010\u001c\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/feed/presenter/FeedItemPresenter;", "", "addFeedInteractEvent", "Lcom/tinder/feed/analytics/events/AddFeedInteractEvent;", "addFeedbackUserEvent", "Lcom/tinder/overflow/analytics/AddFeedbackUserEvent;", "feedViewModelPropertiesAdapter", "Lcom/tinder/feed/analytics/factory/FeedViewModelAnalyticsPropertiesAdapter;", "(Lcom/tinder/feed/analytics/events/AddFeedInteractEvent;Lcom/tinder/overflow/analytics/AddFeedbackUserEvent;Lcom/tinder/feed/analytics/factory/FeedViewModelAnalyticsPropertiesAdapter;)V", "addFeedbackUserEventForAnalytics", "", "viewModel", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "feedbackInfo", "Lcom/tinder/feed/view/model/FeedbackInfo;", "doubleTapOnContent", "feedbackProvided", "messageBubbleTapped", "messageComposeTapped", "overflowClicked", "overflowItemSelected", "interactType", "Lcom/tinder/feed/analytics/InteractType;", "profileOpenedFromHeader", "spotifyDeeplinkClicked", "spotifyPlayClicked", "spotifyStopClicked", "videoAudioMuted", "videoAudioUnmuted", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.presenter.d */
public final class C9467d {
    /* renamed from: a */
    private final C11687a f31735a;
    /* renamed from: b */
    private final C12239a f31736b;
    /* renamed from: c */
    private final C9427h f31737c;

    @Inject
    public C9467d(@NotNull C11687a c11687a, @NotNull C12239a c12239a, @NotNull C9427h c9427h) {
        C2668g.b(c11687a, "addFeedInteractEvent");
        C2668g.b(c12239a, "addFeedbackUserEvent");
        C2668g.b(c9427h, "feedViewModelPropertiesAdapter");
        this.f31735a = c11687a;
        this.f31736b = c12239a;
        this.f31737c = c9427h;
    }

    /* renamed from: a */
    public final void m39582a(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(activityFeedViewModel, "viewModel");
        this.f31735a.m47502a(new C9435a(activityFeedViewModel, InteractType.MORE_OPTION, null, 4, null));
    }

    /* renamed from: a */
    public final void m39583a(@NotNull ActivityFeedViewModel<?> activityFeedViewModel, @NotNull InteractType interactType) {
        C2668g.b(activityFeedViewModel, "viewModel");
        C2668g.b(interactType, "interactType");
        this.f31735a.m47502a(new C9435a(activityFeedViewModel, interactType, InteractSource.MORE_OPTION));
    }

    /* renamed from: a */
    public final void m39584a(@NotNull ActivityFeedViewModel<?> activityFeedViewModel, @NotNull C9541g c9541g) {
        C2668g.b(activityFeedViewModel, "viewModel");
        C2668g.b(c9541g, "feedbackInfo");
        m39581b(activityFeedViewModel, c9541g);
    }

    /* renamed from: b */
    public final void m39585b(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(activityFeedViewModel, "viewModel");
        this.f31735a.m47502a(new C9435a(activityFeedViewModel, InteractType.OPEN_SPOTIFY, null, 4, null));
    }

    /* renamed from: c */
    public final void m39586c(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(activityFeedViewModel, "viewModel");
        this.f31735a.m47502a(new C9435a(activityFeedViewModel, InteractType.PLAY_MUSIC, null, 4, null));
    }

    /* renamed from: d */
    public final void m39587d(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(activityFeedViewModel, "viewModel");
        this.f31735a.m47502a(new C9435a(activityFeedViewModel, InteractType.STOP_MUSIC, null, 4, null));
    }

    /* renamed from: e */
    public final void m39588e(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(activityFeedViewModel, "viewModel");
        this.f31735a.m47502a(new C9435a(activityFeedViewModel, InteractType.OPEN_PROFILE, InteractSource.HEADER));
    }

    /* renamed from: f */
    public final void m39589f(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(activityFeedViewModel, "viewModel");
        this.f31735a.m47502a(new C9435a(activityFeedViewModel, InteractType.INLINE_CHAT, InteractSource.ICON));
    }

    /* renamed from: g */
    public final void m39590g(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(activityFeedViewModel, "viewModel");
        this.f31735a.m47502a(new C9435a(activityFeedViewModel, InteractType.INLINE_CHAT, InteractSource.IMAGE));
    }

    /* renamed from: h */
    public final void m39591h(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(activityFeedViewModel, "viewModel");
        this.f31735a.m47502a(new C9435a(activityFeedViewModel, InteractType.OPEN_CHAT, InteractSource.BUBBLE));
    }

    /* renamed from: i */
    public final void m39592i(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(activityFeedViewModel, "viewModel");
        this.f31735a.m47502a(new C9435a(activityFeedViewModel, InteractType.SOUND_OFF, null, 4, null));
    }

    /* renamed from: j */
    public final void m39593j(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(activityFeedViewModel, "viewModel");
        this.f31735a.m47502a(new C9435a(activityFeedViewModel, InteractType.SOUND_ON, null, 4, null));
    }

    /* renamed from: b */
    private final void m39581b(ActivityFeedViewModel<?> activityFeedViewModel, C9541g c9541g) {
        C9427h c9427h = this.f31737c;
        this.f31736b.m48434a(new C10024a(activityFeedViewModel.mo11140b(), MatchType.SOLO, activityFeedViewModel.mo11143e().m39804b(), activityFeedViewModel.getId(), C9428i.m39429a(activityFeedViewModel.mo11141c()), ReportingSource.FEED, c9541g.m39814a(), c9541g.m39815b(), c9541g.m39816c()));
    }
}
