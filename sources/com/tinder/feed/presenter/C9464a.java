package com.tinder.feed.presenter;

import com.tinder.api.ManagerWebServices;
import com.tinder.chat.analytics.ac;
import com.tinder.chat.analytics.ac.C8416a;
import com.tinder.chat.analytics.ad;
import com.tinder.chat.analytics.ad.C8417a;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.activityfeed.usecase.LoadFeedCommentDraft;
import com.tinder.domain.activityfeed.usecase.LoadFeedCommentDraft.Request;
import com.tinder.domain.activityfeed.usecase.SaveFeedCommentDraft;
import com.tinder.domain.common.model.Photo.Quality;
import com.tinder.domain.feed.ActivityFeedComment;
import com.tinder.domain.feed.usecase.SendFeedComment;
import com.tinder.domain.match.model.visitor.UserPhotoExtKt;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.domain.meta.usecase.GetCurrentUser;
import com.tinder.feed.analytics.InteractSource;
import com.tinder.feed.analytics.InteractType;
import com.tinder.feed.analytics.events.C11687a;
import com.tinder.feed.analytics.events.C11687a.C9435a;
import com.tinder.feed.target.FeedCommentTarget;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u001d\u001a\u00020\u001eH\u0007J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u001eH\u0002J\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0012J\u000e\u0010\u0004\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0012J\u001c\u0010#\u001a\u00020\u001e2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010$\u001a\u00020\u001eH\u0007R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006%"}, d2 = {"Lcom/tinder/feed/presenter/FeedCommentComposerPresenter;", "", "getCurrentUser", "Lcom/tinder/domain/meta/usecase/GetCurrentUser;", "sendFeedComment", "Lcom/tinder/domain/feed/usecase/SendFeedComment;", "loadFeedCommentDraft", "Lcom/tinder/domain/activityfeed/usecase/LoadFeedCommentDraft;", "saveFeedCommentDraft", "Lcom/tinder/domain/activityfeed/usecase/SaveFeedCommentDraft;", "chatSendMessageEventDispatcher", "Lcom/tinder/chat/analytics/ChatSendMessageEventDispatcher;", "chatSendMessageErrorEventDispatcher", "Lcom/tinder/chat/analytics/ChatSendMessageErrorEventDispatcher;", "addFeedInteractEvent", "Lcom/tinder/feed/analytics/events/AddFeedInteractEvent;", "(Lcom/tinder/domain/meta/usecase/GetCurrentUser;Lcom/tinder/domain/feed/usecase/SendFeedComment;Lcom/tinder/domain/activityfeed/usecase/LoadFeedCommentDraft;Lcom/tinder/domain/activityfeed/usecase/SaveFeedCommentDraft;Lcom/tinder/chat/analytics/ChatSendMessageEventDispatcher;Lcom/tinder/chat/analytics/ChatSendMessageErrorEventDispatcher;Lcom/tinder/feed/analytics/events/AddFeedInteractEvent;)V", "carouselItemId", "", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "feedItem", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "target", "Lcom/tinder/feed/target/FeedCommentTarget;", "getTarget$Tinder_release", "()Lcom/tinder/feed/target/FeedCommentTarget;", "setTarget$Tinder_release", "(Lcom/tinder/feed/target/FeedCommentTarget;)V", "drop", "", "loadAvatar", "loadDraft", "saveDraft", "text", "setup", "take", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.presenter.a */
public final class C9464a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public FeedCommentTarget f31723a;
    /* renamed from: b */
    private C19573b f31724b = new C19573b();
    /* renamed from: c */
    private ActivityFeedViewModel<?> f31725c;
    /* renamed from: d */
    private String f31726d;
    /* renamed from: e */
    private final GetCurrentUser f31727e;
    /* renamed from: f */
    private final SendFeedComment f31728f;
    /* renamed from: g */
    private final LoadFeedCommentDraft f31729g;
    /* renamed from: h */
    private final SaveFeedCommentDraft f31730h;
    /* renamed from: i */
    private final ad f31731i;
    /* renamed from: j */
    private final ac f31732j;
    /* renamed from: k */
    private final C11687a f31733k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/meta/model/CurrentUser;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.a$a */
    static final class C13266a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13266a f42023a = new C13266a();

        C13266a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m51320a((CurrentUser) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m51320a(CurrentUser currentUser) {
            C2668g.a(currentUser, "it");
            return UserPhotoExtKt.avatarUrl(currentUser, Quality.M);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "avatarUrl", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.a$b */
    static final class C13977b<T> implements Action1<String> {
        /* renamed from: a */
        final /* synthetic */ C9464a f44114a;

        C13977b(C9464a c9464a) {
            this.f44114a = c9464a;
        }

        public /* synthetic */ void call(Object obj) {
            m53498a((String) obj);
        }

        /* renamed from: a */
        public final void m53498a(String str) {
            FeedCommentTarget a = this.f44114a.m39573a();
            C2668g.a(str, "avatarUrl");
            a.setAvatarUrl(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.a$c */
    static final class C13978c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13978c f44115a = new C13978c();

        C13978c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53499a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53499a(Throwable th) {
            C0001a.b(th, "Error loading current user", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.a$d */
    static final class C13979d<T> implements Action1<String> {
        /* renamed from: a */
        final /* synthetic */ C9464a f44116a;

        C13979d(C9464a c9464a) {
            this.f44116a = c9464a;
        }

        public /* synthetic */ void call(Object obj) {
            m53500a((String) obj);
        }

        /* renamed from: a */
        public final void m53500a(String str) {
            FeedCommentTarget a = this.f44116a.m39573a();
            C2668g.a(str, "it");
            a.setComment(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.a$e */
    static final class C13980e<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C9464a f44117a;
        /* renamed from: b */
        final /* synthetic */ String f44118b;

        C13980e(C9464a c9464a, String str) {
            this.f44117a = c9464a;
            this.f44118b = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53501a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53501a(Throwable th) {
            C0001a.c(th, "Error loading draft feedItemId=%s, carouselItemId=%s", new Object[]{this.f44118b, this.f44117a.f31726d});
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.a$f */
    static final class C13981f implements Action0 {
        /* renamed from: a */
        public static final C13981f f44119a = new C13981f();

        C13981f() {
        }

        public final void call() {
            C0001a.b("Draft comment saved", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.a$g */
    static final class C13982g<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ String f44120a;

        C13982g(String str) {
            this.f44120a = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53502a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53502a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error saving draft comment feedItemId=");
            stringBuilder.append(this.f44120a);
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "comment", "Lcom/tinder/domain/feed/ActivityFeedComment;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.a$h */
    static final class C13983h<T> implements Action1<ActivityFeedComment> {
        /* renamed from: a */
        final /* synthetic */ C9464a f44121a;
        /* renamed from: b */
        final /* synthetic */ ActivityFeedViewModel f44122b;
        /* renamed from: c */
        final /* synthetic */ String f44123c;

        C13983h(C9464a c9464a, ActivityFeedViewModel activityFeedViewModel, String str) {
            this.f44121a = c9464a;
            this.f44122b = activityFeedViewModel;
            this.f44123c = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53503a((ActivityFeedComment) obj);
        }

        /* renamed from: a */
        public final void m53503a(ActivityFeedComment activityFeedComment) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Feed comment sent. state=");
            stringBuilder.append(activityFeedComment.getState());
            C0001a.b(stringBuilder.toString(), new Object[0]);
            switch (C9465b.f31734a[activityFeedComment.getState().ordinal()]) {
                case 1:
                    this.f44121a.f31731i.m42567a(new C8417a(this.f44122b.mo11140b(), this.f44123c, 3, this.f44122b.getId(), "activity", false, false, null, null, 480, null));
                    return;
                case 2:
                    return;
                case 3:
                    this.f44121a.f31732j.m42565a(new C8416a(this.f44122b.mo11140b(), 3, this.f44123c, this.f44122b.getId(), true, null, null, 96, null));
                    return;
                default:
                    return;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.a$i */
    static final class C13984i<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ ActivityFeedViewModel f44124a;

        C13984i(ActivityFeedViewModel activityFeedViewModel) {
            this.f44124a = activityFeedViewModel;
        }

        public /* synthetic */ void call(Object obj) {
            m53504a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53504a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error sending feed comment for feedItemId=");
            stringBuilder.append(this.f44124a.getId());
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Inject
    public C9464a(@NotNull GetCurrentUser getCurrentUser, @NotNull SendFeedComment sendFeedComment, @NotNull LoadFeedCommentDraft loadFeedCommentDraft, @NotNull SaveFeedCommentDraft saveFeedCommentDraft, @NotNull ad adVar, @NotNull ac acVar, @NotNull C11687a c11687a) {
        C2668g.b(getCurrentUser, "getCurrentUser");
        C2668g.b(sendFeedComment, "sendFeedComment");
        C2668g.b(loadFeedCommentDraft, "loadFeedCommentDraft");
        C2668g.b(saveFeedCommentDraft, "saveFeedCommentDraft");
        C2668g.b(adVar, "chatSendMessageEventDispatcher");
        C2668g.b(acVar, "chatSendMessageErrorEventDispatcher");
        C2668g.b(c11687a, "addFeedInteractEvent");
        this.f31727e = getCurrentUser;
        this.f31728f = sendFeedComment;
        this.f31729g = loadFeedCommentDraft;
        this.f31730h = saveFeedCommentDraft;
        this.f31731i = adVar;
        this.f31732j = acVar;
        this.f31733k = c11687a;
    }

    @NotNull
    /* renamed from: a */
    public final FeedCommentTarget m39573a() {
        FeedCommentTarget feedCommentTarget = this.f31723a;
        if (feedCommentTarget == null) {
            C2668g.b("target");
        }
        return feedCommentTarget;
    }

    @Take
    /* renamed from: b */
    public final void m39576b() {
        m39571d();
        m39572e();
    }

    /* renamed from: a */
    public final void m39574a(@NotNull ActivityFeedViewModel<?> activityFeedViewModel, @Nullable String str) {
        C2668g.b(activityFeedViewModel, "feedItem");
        this.f31725c = activityFeedViewModel;
        this.f31726d = str;
    }

    @Drop
    /* renamed from: c */
    public final void m39578c() {
        this.f31724b.a();
    }

    /* renamed from: d */
    private final void m39571d() {
        this.f31724b.a(this.f31727e.execute().d(C13266a.f42023a).b(Schedulers.io()).a(C19397a.a()).a(new C13977b(this), C13978c.f44115a));
    }

    /* renamed from: e */
    private final void m39572e() {
        ActivityFeedViewModel activityFeedViewModel = this.f31725c;
        if (activityFeedViewModel == null) {
            throw new IllegalStateException("feedItem must be set".toString());
        }
        String id = activityFeedViewModel.getId();
        this.f31724b.a(this.f31729g.execute(new Request(id, this.f31726d)).b(Schedulers.io()).a(C19397a.a()).a(new C13979d(this), new C13980e(this, id)));
    }

    /* renamed from: a */
    public final void m39575a(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TEXT);
        FeedCommentTarget feedCommentTarget = this.f31723a;
        if (feedCommentTarget == null) {
            C2668g.b("target");
        }
        feedCommentTarget.close();
        ActivityFeedViewModel activityFeedViewModel = this.f31725c;
        if (activityFeedViewModel == null) {
            throw new IllegalStateException("feedItem must be set".toString());
        }
        this.f31733k.m47502a(new C9435a(activityFeedViewModel, InteractType.SEND_MESSAGE, InteractSource.SEND));
        this.f31728f.execute(new SendFeedComment.Request(activityFeedViewModel.getId(), str, this.f31726d)).b(Schedulers.io()).a(new C13983h(this, activityFeedViewModel, str), (Action1) new C13984i(activityFeedViewModel));
    }

    /* renamed from: b */
    public final void m39577b(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TEXT);
        ActivityFeedViewModel activityFeedViewModel = this.f31725c;
        if (activityFeedViewModel == null) {
            throw new IllegalStateException("feedItem must be set".toString());
        }
        String id = activityFeedViewModel.getId();
        this.f31730h.execute(new SaveFeedCommentDraft.Request(id, this.f31726d, str)).a(C13981f.f44119a, new C13982g(id));
    }
}
