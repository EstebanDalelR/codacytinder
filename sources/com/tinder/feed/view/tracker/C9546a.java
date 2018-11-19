package com.tinder.feed.view.tracker;

import com.tinder.domain.feed.FeedCarouselItemSelected;
import com.tinder.domain.feed.FeedCarouselItemSelectedRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.feed.p249d.C9462a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p500e.C19573b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/feed/view/tracker/FeedCarouselItemTracker;", "", "feedCarouselItemSelectedProvider", "Lcom/tinder/feed/provider/FeedCarouselItemSelectedProvider;", "feedCarouselItemSelectedRepository", "Lcom/tinder/domain/feed/FeedCarouselItemSelectedRepository;", "(Lcom/tinder/feed/provider/FeedCarouselItemSelectedProvider;Lcom/tinder/domain/feed/FeedCarouselItemSelectedRepository;)V", "subscriptions", "Lrx/subscriptions/CompositeSubscription;", "drop", "", "take", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.tracker.a */
public final class C9546a {
    /* renamed from: a */
    private final C19573b f31936a = new C19573b();
    /* renamed from: b */
    private final C9462a f31937b;
    /* renamed from: c */
    private final FeedCarouselItemSelectedRepository f31938c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "it", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.tracker.a$a */
    static final class C13297a<T, R> implements Func1<FeedCarouselItemSelected, Completable> {
        /* renamed from: a */
        final /* synthetic */ C9546a f42154a;

        C13297a(C9546a c9546a) {
            this.f42154a = c9546a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51453a((FeedCarouselItemSelected) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Completable m51453a(FeedCarouselItemSelected feedCarouselItemSelected) {
            FeedCarouselItemSelectedRepository a = this.f42154a.f31938c;
            String feedItemId = feedCarouselItemSelected.getFeedItemId();
            C2668g.a(feedCarouselItemSelected, "it");
            return RxJavaInteropExtKt.toV1Completable(a.put(feedItemId, feedCarouselItemSelected));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.tracker.a$b */
    static final class C14021b<T> implements Action1<FeedCarouselItemSelected> {
        /* renamed from: a */
        public static final C14021b f44409a = new C14021b();

        C14021b() {
        }

        public /* synthetic */ void call(Object obj) {
            m53672a((FeedCarouselItemSelected) obj);
        }

        /* renamed from: a */
        public final void m53672a(FeedCarouselItemSelected feedCarouselItemSelected) {
            C0001a.b("Started observing carousel items selected", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.tracker.a$c */
    static final class C14022c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14022c f44410a = new C14022c();

        C14022c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53673a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53673a(Throwable th) {
            C0001a.c(th, "Error observing carousel items selected", new Object[0]);
        }
    }

    @Inject
    public C9546a(@NotNull C9462a c9462a, @NotNull FeedCarouselItemSelectedRepository feedCarouselItemSelectedRepository) {
        C2668g.b(c9462a, "feedCarouselItemSelectedProvider");
        C2668g.b(feedCarouselItemSelectedRepository, "feedCarouselItemSelectedRepository");
        this.f31937b = c9462a;
        this.f31938c = feedCarouselItemSelectedRepository;
    }

    /* renamed from: a */
    public final void m39835a() {
        this.f31936a.a(this.f31937b.m39565a().i(new C13297a(this)).a(C14021b.f44409a, C14022c.f44410a));
    }

    /* renamed from: b */
    public final void m39836b() {
        this.f31936a.a();
    }
}
