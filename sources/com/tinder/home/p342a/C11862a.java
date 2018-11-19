package com.tinder.home.p342a;

import com.tinder.domain.feed.FeedResult;
import com.tinder.domain.feed.usecase.ObserveFeed;
import com.tinder.domain.feed.usecase.ObserveHasNewFeedItems;
import com.tinder.domain.feed.usecase.PollForNewFeedItems;
import com.tinder.feed.analytics.events.C11692g;
import com.tinder.main.Badgeable;
import com.tinder.main.Badgeable$Trigger;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0004\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/home/feed/FeedTabBadgeTrigger;", "Lcom/tinder/main/Badgeable$Trigger;", "observeHasNewFeedItems", "Lcom/tinder/domain/feed/usecase/ObserveHasNewFeedItems;", "pollForNewFeedItems", "Lcom/tinder/domain/feed/usecase/PollForNewFeedItems;", "observeFeed", "Lcom/tinder/domain/feed/usecase/ObserveFeed;", "feedShowBadgeEventDispatcher", "Lcom/tinder/feed/analytics/events/FeedShowBadgeEventDispatcher;", "(Lcom/tinder/domain/feed/usecase/ObserveHasNewFeedItems;Lcom/tinder/domain/feed/usecase/PollForNewFeedItems;Lcom/tinder/domain/feed/usecase/ObserveFeed;Lcom/tinder/feed/analytics/events/FeedShowBadgeEventDispatcher;)V", "newFeedItemsSubscription", "Lrx/Subscription;", "observeFeedSubscription", "pollFeedSubscription", "fireFeedShowBadgeEvent", "", "badgeable", "Lcom/tinder/main/Badgeable;", "register", "stopPollingWhenFeedLoads", "unregister", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.home.a.a */
public final class C11862a implements Badgeable$Trigger {
    /* renamed from: a */
    private Subscription f38688a;
    /* renamed from: b */
    private Subscription f38689b;
    /* renamed from: c */
    private Subscription f38690c;
    /* renamed from: d */
    private final ObserveHasNewFeedItems f38691d;
    /* renamed from: e */
    private final PollForNewFeedItems f38692e;
    /* renamed from: f */
    private final ObserveFeed f38693f;
    /* renamed from: g */
    private final C11692g f38694g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "hasUntouchedFeedItems", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.home.a.a$a */
    static final class C14033a<T> implements Action1<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C11862a f44462a;
        /* renamed from: b */
        final /* synthetic */ Badgeable f44463b;

        C14033a(C11862a c11862a, Badgeable badgeable) {
            this.f44462a = c11862a;
            this.f44463b = badgeable;
        }

        public /* synthetic */ void call(Object obj) {
            m53705a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m53705a(Boolean bool) {
            C2668g.a(bool, "hasUntouchedFeedItems");
            if (bool.booleanValue() != null) {
                bool = this.f44462a.f38688a;
                if (bool != null) {
                    bool.unsubscribe();
                }
                this.f44462a.m47835c();
                this.f44463b.showBadge();
                return;
            }
            this.f44463b.hideBadge();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.home.a.a$b */
    static final class C14034b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14034b f44464a = new C14034b();

        C14034b() {
        }

        public /* synthetic */ void call(Object obj) {
            m53706a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53706a(Throwable th) {
            C0001a.c(th, "Error observing untouched feed items", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lrx/Subscription;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.home.a.a$c */
    static final class C14035c<T> implements Action1<Subscription> {
        /* renamed from: a */
        public static final C14035c f44465a = new C14035c();

        C14035c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53707a((Subscription) obj);
        }

        /* renamed from: a */
        public final void m53707a(Subscription subscription) {
            C0001a.a("Starting polling feed items", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.home.a.a$d */
    static final class C14036d implements Action0 {
        /* renamed from: a */
        public static final C14036d f44466a = new C14036d();

        C14036d() {
        }

        public final void call() {
            C0001a.a("Stopped polling feed items", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.home.a.a$e */
    static final class C14037e implements Action0 {
        /* renamed from: a */
        public static final C14037e f44467a = new C14037e();

        C14037e() {
        }

        public final void call() {
            C0001a.a("Got polling result", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.home.a.a$f */
    static final class C14038f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14038f f44468a = new C14038f();

        C14038f() {
        }

        public /* synthetic */ void call(Object obj) {
            m53708a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53708a(Throwable th) {
            C0001a.c(th, "Error polling feed items", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/feed/FeedResult;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.home.a.a$g */
    static final class C14039g<T> implements Action1<FeedResult> {
        /* renamed from: a */
        final /* synthetic */ C11862a f44469a;

        C14039g(C11862a c11862a) {
            this.f44469a = c11862a;
        }

        public /* synthetic */ void call(Object obj) {
            m53709a((FeedResult) obj);
        }

        /* renamed from: a */
        public final void m53709a(FeedResult feedResult) {
            feedResult = this.f44469a.f38688a;
            if (feedResult != null) {
                feedResult.unsubscribe();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.home.a.a$h */
    static final class C14040h<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14040h f44470a = new C14040h();

        C14040h() {
        }

        public /* synthetic */ void call(Object obj) {
            m53710a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53710a(Throwable th) {
            C0001a.c(th, "Error observing feed", new Object[0]);
        }
    }

    @Inject
    public C11862a(@NotNull ObserveHasNewFeedItems observeHasNewFeedItems, @NotNull PollForNewFeedItems pollForNewFeedItems, @NotNull ObserveFeed observeFeed, @NotNull C11692g c11692g) {
        C2668g.b(observeHasNewFeedItems, "observeHasNewFeedItems");
        C2668g.b(pollForNewFeedItems, "pollForNewFeedItems");
        C2668g.b(observeFeed, "observeFeed");
        C2668g.b(c11692g, "feedShowBadgeEventDispatcher");
        this.f38691d = observeHasNewFeedItems;
        this.f38692e = pollForNewFeedItems;
        this.f38693f = observeFeed;
        this.f38694g = c11692g;
    }

    public void register(@NotNull Badgeable badgeable) {
        C2668g.b(badgeable, "badgeable");
        m47831a();
        m47833b();
        m47832a(badgeable);
    }

    public void unregister() {
        Subscription subscription = this.f38689b;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        subscription = this.f38688a;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        subscription = this.f38690c;
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }

    /* renamed from: a */
    private final void m47831a() {
        Subscription subscription = this.f38688a;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        this.f38688a = this.f38692e.execute().b(Schedulers.io()).d(C14035c.f44465a).c(C14036d.f44466a).a(C14037e.f44467a, C14038f.f44468a);
    }

    /* renamed from: b */
    private final void m47833b() {
        this.f38690c = this.f38693f.execute().c(1).a(new C14039g(this), C14040h.f44470a);
    }

    /* renamed from: a */
    private final void m47832a(Badgeable badgeable) {
        this.f38689b = this.f38691d.execute().b(Schedulers.io()).a(C19397a.a()).a(new C14033a(this, badgeable), (Action1) C14034b.f44464a);
    }

    /* renamed from: c */
    private final void m47835c() {
        this.f38694g.execute();
    }
}
