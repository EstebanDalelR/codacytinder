package com.tinder.feed.analytics.session;

import com.tinder.domain.common.usecase.ObservableResultUseCase;
import com.tinder.domain.tracker.ListItemViewDurationData;
import com.tinder.domain.tracker.ListItemViewDurationRepository;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.C9540f;
import com.tinder.feed.view.tracker.C9551g;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/feed/analytics/session/ObserveFeedActivityViewed;", "Lcom/tinder/domain/common/usecase/ObservableResultUseCase;", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "listItemViewDurationRepository", "Lcom/tinder/domain/tracker/ListItemViewDurationRepository;", "feedViewModelWithPositionMap", "Lcom/tinder/feed/view/tracker/FeedViewModelWithPositionMap;", "(Lcom/tinder/domain/tracker/ListItemViewDurationRepository;Lcom/tinder/feed/view/tracker/FeedViewModelWithPositionMap;)V", "execute", "Lrx/Observable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.session.q */
public final class C11694q implements ObservableResultUseCase<ActivityFeedViewModel<?>> {
    /* renamed from: a */
    private final ListItemViewDurationRepository f38196a;
    /* renamed from: b */
    private final C9551g f38197b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lrx/Observable;", "Ljava8/util/Optional;", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "kotlin.jvm.PlatformType", "listItemViewDurationData", "Lcom/tinder/domain/tracker/ListItemViewDurationData;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.q$a */
    static final class C13248a<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C11694q f41986a;

        C13248a(C11694q c11694q) {
            this.f41986a = c11694q;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51264a((ListItemViewDurationData) obj);
        }

        /* renamed from: a */
        public final Observable<Optional<C9540f>> m51264a(ListItemViewDurationData listItemViewDurationData) {
            return this.f41986a.f38197b.m39856a(listItemViewDurationData.getItemId()).a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava8/util/Optional;", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.q$b */
    static final class C13249b<T, R> implements Func1<Optional<C9540f>, Boolean> {
        /* renamed from: a */
        public static final C13249b f41987a = new C13249b();

        C13249b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51265a((Optional) obj));
        }

        /* renamed from: a */
        public final boolean m51265a(Optional<C9540f> optional) {
            C2668g.a(optional, "it");
            return optional.c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "it", "Ljava8/util/Optional;", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.q$c */
    static final class C13250c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13250c f41988a = new C13250c();

        C13250c() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m51266a((Optional) obj);
        }

        @NotNull
        /* renamed from: a */
        public final ActivityFeedViewModel<?> m51266a(Optional<C9540f> optional) {
            return ((C9540f) optional.b()).m39810a();
        }
    }

    @Inject
    public C11694q(@NotNull ListItemViewDurationRepository listItemViewDurationRepository, @NotNull C9551g c9551g) {
        C2668g.b(listItemViewDurationRepository, "listItemViewDurationRepository");
        C2668g.b(c9551g, "feedViewModelWithPositionMap");
        this.f38196a = listItemViewDurationRepository;
        this.f38197b = c9551g;
    }

    @NotNull
    public Observable<ActivityFeedViewModel<?>> execute() {
        Observable<ActivityFeedViewModel<?>> k = this.f38196a.observeItemVisible().h(new C13248a(this)).f(C13249b.f41987a).k(C13250c.f41988a);
        C2668g.a(k, "listItemViewDurationRepo…).activityFeedViewModel }");
        return k;
    }
}
