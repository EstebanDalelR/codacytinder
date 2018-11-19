package com.tinder.feed.analytics.session;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.feed.FetchedItem;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.FeedItem;
import com.tinder.feed.view.provider.C9545e;
import com.tinder.feed.view.provider.C9545e.C9544a;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p500e.C19573b;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0013J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\u0006\u0010\u001c\u001a\u00020\u0013J\u0016\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/feed/analytics/session/FeedSessionItemsTracker;", "", "feedItemsProvider", "Lcom/tinder/feed/view/provider/FeedItemsProvider;", "(Lcom/tinder/feed/view/provider/FeedItemsProvider;)V", "activitiesViewed", "", "", "allActivitiesFetched", "allActivityItems", "isStarted", "", "numFetches", "", "subscription", "Lrx/subscriptions/CompositeSubscription;", "uniqueOtherIdsFetched", "uniqueOtherIdsViewed", "addFetchedItems", "", "items", "", "Lcom/tinder/domain/feed/FetchedItem;", "end", "Lcom/tinder/feed/analytics/session/FeedItemsSessionInfo;", "increaseFetchFeedCount", "readExistingActivityItems", "resetValues", "start", "viewActivityEvent", "activityId", "userId", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.session.h */
public final class C9451h {
    /* renamed from: a */
    private int f31664a;
    /* renamed from: b */
    private final Set<String> f31665b = ((Set) new HashSet());
    /* renamed from: c */
    private final Set<String> f31666c = ((Set) new HashSet());
    /* renamed from: d */
    private final Set<String> f31667d = ((Set) new HashSet());
    /* renamed from: e */
    private final Set<String> f31668e = ((Set) new HashSet());
    /* renamed from: f */
    private final Set<String> f31669f = ((Set) new HashSet());
    /* renamed from: g */
    private final C19573b f31670g = new C19573b();
    /* renamed from: h */
    private boolean f31671h;
    /* renamed from: i */
    private final C9545e f31672i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/feed/view/model/FeedItem;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/feed/view/provider/FeedItemsProvider$FeedItemsUpdate;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.h$a */
    static final class C13242a<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        public static final C13242a f41970a = new C13242a();

        C13242a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m51250a((C9544a) obj);
        }

        /* renamed from: a */
        public final Observable<FeedItem> m51250a(C9544a c9544a) {
            return Observable.a(c9544a.m39820a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.h$b */
    static final class C13243b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13243b f41971a = new C13243b();

        C13243b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m51251a((ActivityFeedViewModel) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m51251a(ActivityFeedViewModel<?> activityFeedViewModel) {
            return activityFeedViewModel.mo11139a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.h$c */
    static final class C13969c<T> implements Action1<String> {
        /* renamed from: a */
        final /* synthetic */ C9451h f44103a;

        C13969c(C9451h c9451h) {
            this.f44103a = c9451h;
        }

        public /* synthetic */ void call(Object obj) {
            m53488a((String) obj);
        }

        /* renamed from: a */
        public final void m53488a(String str) {
            Set a = this.f44103a.f31665b;
            C2668g.a(str, "it");
            a.add(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.h$d */
    static final class C13970d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13970d f44104a = new C13970d();

        C13970d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53489a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53489a(Throwable th) {
            C0001a.c(th, "Failed to fetch Feed items in FeedSessionTracker", new Object[0]);
        }
    }

    @Inject
    public C9451h(@NotNull C9545e c9545e) {
        C2668g.b(c9545e, "feedItemsProvider");
        this.f31672i = c9545e;
    }

    /* renamed from: a */
    public final void m39506a() {
        if ((this.f31671h ^ 1) == 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f31671h = true;
        m39504d();
        m39505e();
    }

    @NotNull
    /* renamed from: b */
    public final C9443c m39509b() {
        if (this.f31671h) {
            this.f31671h = false;
            this.f31670g.a();
            return new C9443c(this.f31666c.size(), this.f31665b.size(), this.f31664a, this.f31669f.size(), this.f31668e.size(), this.f31667d.size());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    public final void m39507a(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "activityId");
        C2668g.b(str2, ManagerWebServices.PARAM_USER_ID);
        this.f31666c.add(str);
        this.f31667d.add(str2);
    }

    /* renamed from: c */
    public final void m39510c() {
        this.f31664a++;
    }

    /* renamed from: a */
    public final void m39508a(@NotNull List<FetchedItem> list) {
        C2668g.b(list, "items");
        Iterable<FetchedItem> iterable = list;
        Collection collection = this.f31665b;
        for (FetchedItem activityId : iterable) {
            collection.add(activityId.getActivityId());
        }
        collection = this.f31668e;
        for (FetchedItem activityId2 : iterable) {
            collection.add(activityId2.getUserId());
        }
        collection = this.f31669f;
        for (FetchedItem activityId3 : iterable) {
            collection.add(activityId3.getActivityId());
        }
    }

    /* renamed from: d */
    private final void m39504d() {
        this.f31664a = 0;
        this.f31666c.clear();
        this.f31665b.clear();
        this.f31667d.clear();
        this.f31668e.clear();
        this.f31669f.clear();
    }

    /* renamed from: e */
    private final void m39505e() {
        this.f31670g.a(this.f31672i.m39832a().c(1).c(C13242a.f41970a).b(ActivityFeedViewModel.class).k(C13243b.f41971a).a(new C13969c(this), C13970d.f44104a));
    }
}
