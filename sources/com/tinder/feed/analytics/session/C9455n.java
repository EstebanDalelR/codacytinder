package com.tinder.feed.analytics.session;

import com.tinder.domain.feed.usecase.ObserveHasNewFeedItems;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.feed.analytics.SessionDestination;
import com.tinder.feed.analytics.SessionSource;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;
import rx.functions.Action1;
import rx.p500e.C19573b;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B/\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0015\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001eJ\r\u0010\u001f\u001a\u00020\rH\u0000¢\u0006\u0002\b J\u0015\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0011H\u0000¢\u0006\u0002\b$J\b\u0010%\u001a\u00020\"H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/tinder/feed/analytics/session/FeedSessionTracker;", "", "observeHasNewFeedItems", "Lcom/tinder/domain/feed/usecase/ObserveHasNewFeedItems;", "feedSessionItemsTracker", "Lcom/tinder/feed/analytics/session/FeedSessionItemsTracker;", "feedSessionPositionTracker", "Lcom/tinder/feed/analytics/session/FeedSessionPositionTracker;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "(Lcom/tinder/domain/feed/usecase/ObserveHasNewFeedItems;Lcom/tinder/feed/analytics/session/FeedSessionItemsTracker;Lcom/tinder/feed/analytics/session/FeedSessionPositionTracker;Lkotlin/jvm/functions/Function0;)V", "feedSessionId", "", "isSessionStarted", "", "sessionSource", "Lcom/tinder/feed/analytics/SessionSource;", "sessionStartTime", "subscription", "Lrx/subscriptions/CompositeSubscription;", "unseenActivityBadge", "buildSession", "Lcom/tinder/feed/analytics/session/Session;", "destination", "Lcom/tinder/feed/analytics/SessionDestination;", "checkUnseenActivityBadge", "computeDuration", "", "endSession", "endSession$Tinder_release", "getSessionId", "getSessionId$Tinder_release", "startSession", "", "source", "startSession$Tinder_release", "subscribeToBadgeUpdate", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.session.n */
public final class C9455n {
    /* renamed from: a */
    private volatile String f31689a = "";
    /* renamed from: b */
    private boolean f31690b;
    /* renamed from: c */
    private SessionSource f31691c;
    /* renamed from: d */
    private boolean f31692d;
    /* renamed from: e */
    private DateTime f31693e = new DateTime(null);
    /* renamed from: f */
    private final C19573b f31694f = new C19573b();
    /* renamed from: g */
    private final ObserveHasNewFeedItems f31695g;
    /* renamed from: h */
    private final C9451h f31696h;
    /* renamed from: i */
    private final C9453j f31697i;
    /* renamed from: j */
    private final Function0<DateTime> f31698j;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "hasNewItems", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.n$a */
    static final class C13973a<T> implements Action1<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C9455n f44107a;

        C13973a(C9455n c9455n) {
            this.f44107a = c9455n;
        }

        public /* synthetic */ void call(Object obj) {
            m53492a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m53492a(Boolean bool) {
            C9455n c9455n = this.f44107a;
            C2668g.a(bool, "hasNewItems");
            c9455n.f31692d = bool.booleanValue();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.n$b */
    static final class C13974b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13974b f44108a = new C13974b();

        C13974b() {
        }

        public /* synthetic */ void call(Object obj) {
            m53493a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53493a(Throwable th) {
            C0001a.d("Failed execute observeHasNewFeedItems in FeedSessionTracker", new Object[0]);
        }
    }

    @Inject
    public C9455n(@NotNull ObserveHasNewFeedItems observeHasNewFeedItems, @NotNull C9451h c9451h, @NotNull C9453j c9453j, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.b(observeHasNewFeedItems, "observeHasNewFeedItems");
        C2668g.b(c9451h, "feedSessionItemsTracker");
        C2668g.b(c9453j, "feedSessionPositionTracker");
        C2668g.b(function0, "dateTimeProvider");
        this.f31695g = observeHasNewFeedItems;
        this.f31696h = c9451h;
        this.f31697i = c9453j;
        this.f31698j = function0;
    }

    /* renamed from: a */
    public final void m39533a(@NotNull SessionSource sessionSource) {
        C2668g.b(sessionSource, "source");
        if ((this.f31690b ^ 1) == 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f31693e = (DateTime) this.f31698j.invoke();
        this.f31691c = sessionSource;
        sessionSource = UUID.randomUUID().toString();
        C2668g.a(sessionSource, "UUID.randomUUID().toString()");
        this.f31689a = sessionSource;
        this.f31690b = true;
        this.f31692d = null;
        this.f31696h.m39506a();
        this.f31697i.m39518a();
        m39528b();
    }

    @NotNull
    /* renamed from: a */
    public final C9457r m39531a(@NotNull SessionDestination sessionDestination) {
        C2668g.b(sessionDestination, "destination");
        if (this.f31690b) {
            sessionDestination = m39527b(sessionDestination);
            this.f31690b = false;
            this.f31689a = "";
            this.f31694f.a();
            return sessionDestination;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @NotNull
    /* renamed from: a */
    public final String m39532a() {
        return this.f31689a;
    }

    /* renamed from: b */
    private final void m39528b() {
        this.f31694f.a(this.f31695g.execute().a(new C13973a(this), C13974b.f44108a));
    }

    /* renamed from: b */
    private final C9457r m39527b(SessionDestination sessionDestination) {
        C9443c b = this.f31696h.m39509b();
        C9444d b2 = this.f31697i.m39520b();
        String str = this.f31689a;
        SessionSource sessionSource = this.f31691c;
        if (sessionSource == null) {
            C2668g.b("sessionSource");
        }
        return new C9457r(str, sessionSource, sessionDestination, m39529c(), b.m39480a(), b.m39481b(), b.m39482c(), b.m39483d(), b.m39484e(), b.m39485f(), b2.m39486a(), b2.m39487b(), b2.m39488c(), b2.m39489d(), m39530d());
    }

    /* renamed from: c */
    private final boolean m39529c() {
        SessionSource sessionSource = this.f31691c;
        if (sessionSource == null) {
            C2668g.b("sessionSource");
        }
        if (C9456o.f31699a[sessionSource.ordinal()] != 1) {
            return false;
        }
        return this.f31692d;
    }

    /* renamed from: d */
    private final long m39530d() {
        return ((DateTime) this.f31698j.invoke()).getMillis() - this.f31693e.getMillis();
    }
}
