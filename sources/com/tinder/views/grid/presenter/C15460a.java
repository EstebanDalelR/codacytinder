package com.tinder.views.grid.presenter;

import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.model.RecsLoadingStatus;
import com.tinder.domain.recs.model.RecsUpdate;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func2;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/tinder/views/grid/presenter/RecsGridContainerPresenter;", "", "()V", "handleRecsEngineUpdate", "", "loadingStatus", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "recsUpdate", "Lcom/tinder/domain/recs/model/RecsUpdate;", "subscribeToRecsEngine", "Lrx/Subscription;", "engine", "Lcom/tinder/domain/recs/RecsEngine;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.views.grid.presenter.a */
public abstract class C15460a {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u00012\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "kotlin.jvm.PlatformType", "Lcom/tinder/domain/recs/model/RecsUpdate;", "statusUpdates", "recsUpdates", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.views.grid.presenter.a$a */
    static final class C18302a<T1, T2, R> implements Func2<T1, T2, R> {
        /* renamed from: a */
        public static final C18302a f56684a = new C18302a();

        C18302a() {
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m66302a((RecsLoadingStatus) obj, (RecsUpdate) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final Pair<RecsLoadingStatus, RecsUpdate> m66302a(RecsLoadingStatus recsLoadingStatus, RecsUpdate recsUpdate) {
            return new Pair(recsLoadingStatus, recsUpdate);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "kotlin.jvm.PlatformType", "Lcom/tinder/domain/recs/model/RecsUpdate;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.views.grid.presenter.a$b */
    static final class C18995b<T> implements Action1<Pair<? extends RecsLoadingStatus, ? extends RecsUpdate>> {
        /* renamed from: a */
        final /* synthetic */ C15460a f58770a;

        C18995b(C15460a c15460a) {
            this.f58770a = c15460a;
        }

        public /* synthetic */ void call(Object obj) {
            m67535a((Pair) obj);
        }

        /* renamed from: a */
        public final void m67535a(Pair<? extends RecsLoadingStatus, ? extends RecsUpdate> pair) {
            C15460a c15460a = this.f58770a;
            Object a = pair.m59803a();
            C2668g.a(a, "it.first");
            RecsLoadingStatus recsLoadingStatus = (RecsLoadingStatus) a;
            pair = pair.m59804b();
            C2668g.a(pair, "it.second");
            c15460a.m57956a(recsLoadingStatus, (RecsUpdate) pair);
        }
    }

    /* renamed from: a */
    public abstract void m57956a(@NotNull RecsLoadingStatus recsLoadingStatus, @NotNull RecsUpdate recsUpdate);

    @Nullable
    /* renamed from: a */
    public final Subscription m57955a(@NotNull RecsEngine recsEngine) {
        C2668g.b(recsEngine, "engine");
        recsEngine = Observable.a(recsEngine.observeLoadingStatusUpdates(), recsEngine.observeRecsUpdates(), C18302a.f56684a).a(C19397a.a());
        Action1 c18995b = new C18995b(this);
        Function1 function1 = RecsGridContainerPresenter$subscribeToRecsEngine$3.f59426a;
        if (function1 != null) {
            function1 = new C18996b(function1);
        }
        return recsEngine.a(c18995b, (Action1) function1);
    }
}
