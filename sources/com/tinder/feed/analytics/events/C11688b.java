package com.tinder.feed.analytics.events;

import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.gn;
import com.tinder.feed.analytics.C9432a;
import com.tinder.feed.analytics.p247a.C9425e;
import com.tinder.feed.analytics.p247a.C9426f;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/feed/analytics/events/AddFeedViewEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/feed/analytics/events/AddFeedViewEvent$Request;", "factory", "Lcom/tinder/feed/analytics/factory/FeedViewAndInteractPropertiesFactory;", "feedEventDispatchingSubscriber", "Lcom/tinder/feed/analytics/FeedEventDispatchingSubscriber;", "(Lcom/tinder/feed/analytics/factory/FeedViewAndInteractPropertiesFactory;Lcom/tinder/feed/analytics/FeedEventDispatchingSubscriber;)V", "buildEvent", "Lrx/Single;", "Lcom/tinder/etl/event/FeedViewEvent;", "commonProperties", "Lcom/tinder/feed/analytics/factory/FeedViewAndInteractCommonProperties;", "sessionId", "", "durationInMillis", "", "position", "", "createEvent", "request", "execute", "", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.events.b */
public final class C11688b implements VoidUseCase<C9436a> {
    /* renamed from: a */
    private final C9426f f38188a;
    /* renamed from: b */
    private final C9432a f38189b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/tinder/feed/analytics/events/AddFeedViewEvent$Request;", "", "viewModel", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "position", "", "durationInMillis", "", "(Lcom/tinder/feed/view/model/ActivityFeedViewModel;IJ)V", "getDurationInMillis", "()J", "getPosition", "()I", "getViewModel", "()Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.events.b$a */
    public static final class C9436a {
        @NotNull
        /* renamed from: a */
        private final ActivityFeedViewModel<?> f31610a;
        /* renamed from: b */
        private final int f31611b;
        /* renamed from: c */
        private final long f31612c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9436a) {
                C9436a c9436a = (C9436a) obj;
                if (C2668g.a(this.f31610a, c9436a.f31610a)) {
                    if ((this.f31611b == c9436a.f31611b ? 1 : null) != null) {
                        if ((this.f31612c == c9436a.f31612c ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            ActivityFeedViewModel activityFeedViewModel = this.f31610a;
            int hashCode = (((activityFeedViewModel != null ? activityFeedViewModel.hashCode() : 0) * 31) + this.f31611b) * 31;
            long j = this.f31612c;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(viewModel=");
            stringBuilder.append(this.f31610a);
            stringBuilder.append(", position=");
            stringBuilder.append(this.f31611b);
            stringBuilder.append(", durationInMillis=");
            stringBuilder.append(this.f31612c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9436a(@NotNull ActivityFeedViewModel<?> activityFeedViewModel, int i, long j) {
            C2668g.b(activityFeedViewModel, "viewModel");
            this.f31610a = activityFeedViewModel;
            this.f31611b = i;
            this.f31612c = j;
        }

        @NotNull
        /* renamed from: a */
        public final ActivityFeedViewModel<?> m39447a() {
            return this.f31610a;
        }

        /* renamed from: b */
        public final int m39448b() {
            return this.f31611b;
        }

        /* renamed from: c */
        public final long m39449c() {
            return this.f31612c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/etl/event/FeedViewEvent;", "it", "Lcom/tinder/feed/analytics/factory/FeedViewAndInteractCommonProperties;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.events.b$b */
    static final class C13233b<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C11688b f41955a;
        /* renamed from: b */
        final /* synthetic */ String f41956b;
        /* renamed from: c */
        final /* synthetic */ C9436a f41957c;

        C13233b(C11688b c11688b, String str, C9436a c9436a) {
            this.f41955a = c11688b;
            this.f41956b = str;
            this.f41957c = c9436a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51233a((C9425e) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Single<gn> m51233a(C9425e c9425e) {
            C11688b c11688b = this.f41955a;
            C2668g.a(c9425e, "it");
            return c11688b.m47503a(c9425e, this.f41956b, this.f41957c.m39449c(), this.f41957c.m39448b());
        }
    }

    @Inject
    public C11688b(@NotNull C9426f c9426f, @NotNull C9432a c9432a) {
        C2668g.b(c9426f, "factory");
        C2668g.b(c9432a, "feedEventDispatchingSubscriber");
        this.f38188a = c9426f;
        this.f38189b = c9432a;
    }

    public /* synthetic */ void execute(Object obj) {
        m47507a((C9436a) obj);
    }

    /* renamed from: a */
    public void m47507a(@NotNull C9436a c9436a) {
        C2668g.b(c9436a, "request");
        this.f38189b.m39436a("FeedViewEvent", c9436a, new AddFeedViewEvent$execute$1(this));
    }

    /* renamed from: a */
    private final Single<gn> m47504a(C9436a c9436a, String str) {
        c9436a = this.f38188a.m39422a(c9436a.m39447a()).a(new C13233b(this, str, c9436a));
        C2668g.a(c9436a, "factory.createCommonProp…      request.position) }");
        return c9436a;
    }

    /* renamed from: a */
    private final Single<gn> m47503a(C9425e c9425e, String str, long j, int i) {
        str = gn.m45148a().m38296f(str).m38289c((Number) Long.valueOf(j)).m38294e(c9425e.m39400a()).m38290c(c9425e.m39401b()).m38292d(c9425e.m39402c().getValue()).m38297g((Number) c9425e.m39403d()).m38302j(c9425e.m39404e()).m38298g(c9425e.m39405f()).m38284a((Number) Integer.valueOf(c9425e.m39406g().getValue())).m38295f((Number) Integer.valueOf(i)).m38300h(c9425e.m39411l()).m38293e((Number) Integer.valueOf(c9425e.m39412m())).m38291d((Number) Integer.valueOf(c9425e.m39413n()));
        j = c9425e.m39407h();
        if (j != null) {
            str.m38287b((Number) Float.valueOf(((Number) j).floatValue()));
        }
        if (c9425e.m39408i() != null) {
            str.m38303k(c9425e.m39408i().m39432a().getValue());
            str.m38305m(c9425e.m39408i().m39433b());
        }
        if (c9425e.m39409j() != null) {
            str.m38304l(c9425e.m39409j().m39432a().getValue());
            str.m38306n(c9425e.m39409j().m39433b());
        }
        if (c9425e.m39410k() != null) {
            str.m38288b(c9425e.m39410k().m39392a().getValue());
            str.m38285a(c9425e.m39410k().m39393b());
        }
        CharSequence o = c9425e.m39414o();
        if (o != null) {
            j = C19303i.a(o);
        }
        str.m38301i(c9425e.m39414o());
        str.m38299h((Number) c9425e.m39415p());
        c9425e = Single.a(str.m38286a());
        C2668g.a(c9425e, "Single.just(it)");
        C2668g.a(c9425e, "with(commonProperties) {…}.let { Single.just(it) }");
        return c9425e;
    }
}
