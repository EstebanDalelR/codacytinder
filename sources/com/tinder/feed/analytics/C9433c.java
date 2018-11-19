package com.tinder.feed.analytics;

import com.tinder.common.tracker.recyclerview.p199b.C8566c;
import com.tinder.common.tracker.recyclerview.p200c.C8573a;
import com.tinder.feed.analytics.events.C11688b;
import com.tinder.feed.analytics.events.C11688b.C9436a;
import com.tinder.feed.qualifiers.Feed;
import com.tinder.feed.view.model.C9540f;
import com.tinder.feed.view.tracker.C9551g;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;

@Feed
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/feed/analytics/FeedViewEventDispatcher;", "", "addFeedViewEvent", "Lcom/tinder/feed/analytics/events/AddFeedViewEvent;", "listItemDurationProvider", "Lcom/tinder/common/tracker/recyclerview/provider/ListItemDurationProvider;", "feedViewModelWithPositionMap", "Lcom/tinder/feed/view/tracker/FeedViewModelWithPositionMap;", "(Lcom/tinder/feed/analytics/events/AddFeedViewEvent;Lcom/tinder/common/tracker/recyclerview/provider/ListItemDurationProvider;Lcom/tinder/feed/view/tracker/FeedViewModelWithPositionMap;)V", "feedItemViewDurationSubscription", "Lrx/Subscription;", "observeViewModelWithPosition", "Lrx/Observable;", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "itemId", "", "startDispatching", "", "stopDispatching", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.c */
public final class C9433c {
    /* renamed from: a */
    private Subscription f31603a;
    /* renamed from: b */
    private final C11688b f31604b;
    /* renamed from: c */
    private final C8573a f31605c;
    /* renamed from: d */
    private final C9551g f31606d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava8/util/Optional;", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.c$b */
    static final class C13225b<T, R> implements Func1<Optional<C9540f>, Boolean> {
        /* renamed from: a */
        public static final C13225b f41943a = new C13225b();

        C13225b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51223a((Optional) obj));
        }

        /* renamed from: a */
        public final boolean m51223a(Optional<C9540f> optional) {
            C2668g.a(optional, "it");
            return optional.c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "kotlin.jvm.PlatformType", "it", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.c$c */
    static final class C13226c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13226c f41944a = new C13226c();

        C13226c() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m51224a((Optional) obj);
        }

        /* renamed from: a */
        public final C9540f m51224a(Optional<C9540f> optional) {
            return (C9540f) optional.b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/feed/analytics/events/AddFeedViewEvent$Request;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lcom/tinder/common/tracker/recyclerview/model/ListItemDurationUpdate;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.c$d */
    static final class C13228d<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C9433c f41946a;

        C13228d(C9433c c9433c) {
            this.f41946a = c9433c;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51226a((C8566c) obj);
        }

        /* renamed from: a */
        public final Observable<C9436a> m51226a(C8566c c8566c) {
            String a = c8566c.m36567a();
            final long b = c8566c.m36568b();
            return this.f41946a.m39440a(a).k(new Func1<T, R>() {
                public /* synthetic */ Object call(Object obj) {
                    return m51225a((C9540f) obj);
                }

                @NotNull
                /* renamed from: a */
                public final C9436a m51225a(C9540f c9540f) {
                    return new C9436a(c9540f.m39812c(), c9540f.m39813d(), b);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava8/util/Optional;", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.c$a */
    static final class C13949a<T> implements Action1<Optional<C9540f>> {
        /* renamed from: a */
        final /* synthetic */ String f44082a;

        C13949a(String str) {
            this.f44082a = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53475a((Optional) obj);
        }

        /* renamed from: a */
        public final void m53475a(Optional<C9540f> optional) {
            C2668g.a(optional, "it");
            if (optional.c() == null) {
                optional = new StringBuilder();
                optional.append("Failed to fire FeedViewEvent. ");
                optional.append("Couldn't resolve view model for ");
                optional.append(this.f44082a);
                C0001a.d(optional.toString(), new Object[0]);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/feed/analytics/events/AddFeedViewEvent$Request;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.c$e */
    static final class C13950e<T> implements Action1<C9436a> {
        /* renamed from: a */
        final /* synthetic */ C9433c f44083a;

        C13950e(C9433c c9433c) {
            this.f44083a = c9433c;
        }

        public /* synthetic */ void call(Object obj) {
            m53476a((C9436a) obj);
        }

        /* renamed from: a */
        public final void m53476a(C9436a c9436a) {
            C11688b a = this.f44083a.f31604b;
            C2668g.a(c9436a, "it");
            a.m47507a(c9436a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.c$f */
    static final class C13951f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13951f f44084a = new C13951f();

        C13951f() {
        }

        public /* synthetic */ void call(Object obj) {
            m53477a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53477a(Throwable th) {
            C0001a.c(th, "Failed to add feed.view event", new Object[0]);
        }
    }

    @Inject
    public C9433c(@NotNull C11688b c11688b, @NotNull C8573a c8573a, @NotNull C9551g c9551g) {
        C2668g.b(c11688b, "addFeedViewEvent");
        C2668g.b(c8573a, "listItemDurationProvider");
        C2668g.b(c9551g, "feedViewModelWithPositionMap");
        this.f31604b = c11688b;
        this.f31605c = c8573a;
        this.f31606d = c9551g;
    }

    /* renamed from: a */
    public final void m39441a() {
        Subscription subscription = this.f31603a;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        this.f31603a = this.f31605c.m36587a().c(new C13228d(this)).a(new C13950e(this), C13951f.f44084a);
    }

    /* renamed from: b */
    public final void m39442b() {
        Subscription subscription = this.f31603a;
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }

    /* renamed from: a */
    private final Observable<C9540f> m39440a(String str) {
        str = this.f31606d.m39856a(str).a().b(new C13949a(str)).f(C13225b.f41943a).k(C13226c.f41944a);
        C2668g.a(str, "feedViewModelWithPositio…        .map { it.get() }");
        return str;
    }
}
