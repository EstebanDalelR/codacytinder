package com.tinder.feed.analytics.events;

import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.gg;
import com.tinder.feed.analytics.C9432a;
import com.tinder.feed.analytics.InteractSource;
import com.tinder.feed.analytics.InteractType;
import com.tinder.feed.analytics.p247a.C9425e;
import com.tinder.feed.analytics.p247a.C9426f;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.C9540f;
import com.tinder.feed.view.tracker.C9551g;
import java8.util.Optional;
import java8.util.function.Supplier;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single;
import rx.functions.Func1;
import rx.functions.Func2;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0018\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/feed/analytics/events/AddFeedInteractEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/feed/analytics/events/AddFeedInteractEvent$Request;", "factory", "Lcom/tinder/feed/analytics/factory/FeedViewAndInteractPropertiesFactory;", "feedEventDispatchingSubscriber", "Lcom/tinder/feed/analytics/FeedEventDispatchingSubscriber;", "feedViewModelWithPositionMap", "Lcom/tinder/feed/view/tracker/FeedViewModelWithPositionMap;", "(Lcom/tinder/feed/analytics/factory/FeedViewAndInteractPropertiesFactory;Lcom/tinder/feed/analytics/FeedEventDispatchingSubscriber;Lcom/tinder/feed/view/tracker/FeedViewModelWithPositionMap;)V", "buildEvent", "Lcom/tinder/etl/event/FeedInteractEvent;", "commonProperties", "Lcom/tinder/feed/analytics/factory/FeedViewAndInteractCommonProperties;", "sessionId", "", "request", "position", "", "createEvent", "Lrx/Single;", "execute", "", "resolvePosition", "itemId", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.events.a */
public final class C11687a implements VoidUseCase<C9435a> {
    /* renamed from: a */
    private final C9426f f38185a;
    /* renamed from: b */
    private final C9432a f38186b;
    /* renamed from: c */
    private final C9551g f38187c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/tinder/feed/analytics/events/AddFeedInteractEvent$Request;", "", "viewModel", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "interactType", "Lcom/tinder/feed/analytics/InteractType;", "interactSource", "Lcom/tinder/feed/analytics/InteractSource;", "(Lcom/tinder/feed/view/model/ActivityFeedViewModel;Lcom/tinder/feed/analytics/InteractType;Lcom/tinder/feed/analytics/InteractSource;)V", "getInteractSource", "()Lcom/tinder/feed/analytics/InteractSource;", "getInteractType", "()Lcom/tinder/feed/analytics/InteractType;", "getViewModel", "()Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.events.a$a */
    public static final class C9435a {
        @NotNull
        /* renamed from: a */
        private final ActivityFeedViewModel<?> f31607a;
        @NotNull
        /* renamed from: b */
        private final InteractType f31608b;
        @Nullable
        /* renamed from: c */
        private final InteractSource f31609c;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9435a) {
                    C9435a c9435a = (C9435a) obj;
                    if (C2668g.a(this.f31607a, c9435a.f31607a) && C2668g.a(this.f31608b, c9435a.f31608b) && C2668g.a(this.f31609c, c9435a.f31609c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            ActivityFeedViewModel activityFeedViewModel = this.f31607a;
            int i = 0;
            int hashCode = (activityFeedViewModel != null ? activityFeedViewModel.hashCode() : 0) * 31;
            InteractType interactType = this.f31608b;
            hashCode = (hashCode + (interactType != null ? interactType.hashCode() : 0)) * 31;
            InteractSource interactSource = this.f31609c;
            if (interactSource != null) {
                i = interactSource.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(viewModel=");
            stringBuilder.append(this.f31607a);
            stringBuilder.append(", interactType=");
            stringBuilder.append(this.f31608b);
            stringBuilder.append(", interactSource=");
            stringBuilder.append(this.f31609c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9435a(@NotNull ActivityFeedViewModel<?> activityFeedViewModel, @NotNull InteractType interactType, @Nullable InteractSource interactSource) {
            C2668g.b(activityFeedViewModel, "viewModel");
            C2668g.b(interactType, "interactType");
            this.f31607a = activityFeedViewModel;
            this.f31608b = interactType;
            this.f31609c = interactSource;
        }

        @NotNull
        /* renamed from: a */
        public final ActivityFeedViewModel<?> m39444a() {
            return this.f31607a;
        }

        @NotNull
        /* renamed from: b */
        public final InteractType m39445b() {
            return this.f31608b;
        }

        public /* synthetic */ C9435a(ActivityFeedViewModel activityFeedViewModel, InteractType interactType, InteractSource interactSource, int i, C15823e c15823e) {
            if ((i & 4) != 0) {
                interactSource = null;
            }
            this(activityFeedViewModel, interactType, interactSource);
        }

        @Nullable
        /* renamed from: c */
        public final InteractSource m39446c() {
            return this.f31609c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/FeedInteractEvent;", "commonProperties", "Lcom/tinder/feed/analytics/factory/FeedViewAndInteractCommonProperties;", "kotlin.jvm.PlatformType", "position", "", "call", "(Lcom/tinder/feed/analytics/factory/FeedViewAndInteractCommonProperties;Ljava/lang/Integer;)Lcom/tinder/etl/event/FeedInteractEvent;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.events.a$b */
    static final class C13230b<T1, T2, R> implements Func2<T1, T2, R> {
        /* renamed from: a */
        final /* synthetic */ C11687a f41950a;
        /* renamed from: b */
        final /* synthetic */ String f41951b;
        /* renamed from: c */
        final /* synthetic */ C9435a f41952c;

        C13230b(C11687a c11687a, String str, C9435a c9435a) {
            this.f41950a = c11687a;
            this.f41951b = str;
            this.f41952c = c9435a;
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m51230a((C9425e) obj, (Integer) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final gg m51230a(C9425e c9425e, Integer num) {
            C11687a c11687a = this.f41950a;
            C2668g.a(c9425e, "commonProperties");
            String str = this.f41951b;
            C9435a c9435a = this.f41952c;
            C2668g.a(num, "position");
            return c11687a.m47497a(c9425e, str, c9435a, num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "kotlin.jvm.PlatformType", "it", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.events.a$c */
    static final class C13231c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ String f41953a;

        C13231c(String str) {
            this.f41953a = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51231a((Optional) obj);
        }

        /* renamed from: a */
        public final C9540f m51231a(Optional<C9540f> optional) {
            return (C9540f) optional.c(new Supplier<X>() {
                public /* synthetic */ Object get() {
                    return m47496a();
                }

                @NotNull
                /* renamed from: a */
                public final IllegalStateException m47496a() {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Couldn't resolve position for item ");
                    stringBuilder.append(this.f41953a);
                    return new IllegalStateException(stringBuilder.toString());
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.events.a$d */
    static final class C13232d<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13232d f41954a = new C13232d();

        C13232d() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Integer.valueOf(m51232a((C9540f) obj));
        }

        /* renamed from: a */
        public final int m51232a(C9540f c9540f) {
            return c9540f.m39811b();
        }
    }

    @Inject
    public C11687a(@NotNull C9426f c9426f, @NotNull C9432a c9432a, @NotNull C9551g c9551g) {
        C2668g.b(c9426f, "factory");
        C2668g.b(c9432a, "feedEventDispatchingSubscriber");
        C2668g.b(c9551g, "feedViewModelWithPositionMap");
        this.f38185a = c9426f;
        this.f38186b = c9432a;
        this.f38187c = c9551g;
    }

    public /* synthetic */ void execute(Object obj) {
        m47502a((C9435a) obj);
    }

    /* renamed from: a */
    public void m47502a(@NotNull C9435a c9435a) {
        C2668g.b(c9435a, "request");
        this.f38186b.m39436a("FeedInteractEvent", c9435a, new AddFeedInteractEvent$execute$1(this));
    }

    /* renamed from: a */
    private final Single<gg> m47499a(C9435a c9435a, String str) {
        c9435a = Single.a(this.f38185a.m39422a(c9435a.m39444a()), m47501a(c9435a.m39444a().getId()), new C13230b(this, str, c9435a));
        C2668g.a(c9435a, "Single.zip(\n            …              }\n        )");
        return c9435a;
    }

    /* renamed from: a */
    private final Single<Integer> m47501a(String str) {
        str = this.f38187c.m39856a(str).d(new C13231c(str)).d(C13232d.f41954a);
        C2668g.a(str, "feedViewModelWithPositio…     .map { it.position }");
        return str;
    }

    /* renamed from: a */
    private final gg m47497a(C9425e c9425e, String str, C9435a c9435a, int i) {
        str = gg.m45046a().m38249f(str).m38247e(c9425e.m39400a()).m38243c(c9425e.m39401b()).m38245d(c9425e.m39402c().getValue()).m38248f((Number) c9425e.m39403d()).m38254j(c9425e.m39404e()).m38251g(c9425e.m39405f()).m38237a((Number) Integer.valueOf(c9425e.m39406g().getValue())).m38246e((Number) Integer.valueOf(i)).m38252h(c9425e.m39411l()).m38244d((Number) Integer.valueOf(c9425e.m39412m())).m38242c((Number) Integer.valueOf(c9425e.m39413n())).m38259o(c9435a.m39445b().getValue());
        c9435a = c9435a.m39446c();
        if (c9435a != null) {
            str.m38260p(c9435a.getValue());
        }
        c9435a = c9425e.m39407h();
        if (c9435a != null) {
            str.m38240b((Number) Float.valueOf(((Number) c9435a).floatValue()));
        }
        if (c9425e.m39408i() != null) {
            str.m38255k(c9425e.m39408i().m39432a().getValue());
            str.m38257m(c9425e.m39408i().m39433b());
        }
        if (c9425e.m39409j() != null) {
            str.m38256l(c9425e.m39409j().m39432a().getValue());
            str.m38258n(c9425e.m39409j().m39433b());
        }
        if (c9425e.m39410k() != null) {
            str.m38241b(c9425e.m39410k().m39392a().getValue());
            str.m38238a(c9425e.m39410k().m39393b());
        }
        CharSequence o = c9425e.m39414o();
        if (o != null) {
            c9435a = C19303i.a(o);
        }
        str.m38253i(c9425e.m39414o());
        str.m38250g((Number) c9425e.m39415p());
        c9425e = str.m38239a();
        C2668g.a(c9425e, "builder.build()");
        C2668g.a(c9425e, "with(commonProperties) {…builder.build()\n        }");
        return c9425e;
    }
}
