package com.tinder.toppicks.counter;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.toppicks.TopPicksLoadingStatus;
import com.tinder.domain.toppicks.TopPicksLoadingStatusProvider;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksCount;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/toppicks/counter/TopPicksBottomCounterPresenter;", "", "topPicksCount", "Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksCount;", "topPicksLoadingStatusProvider", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatusProvider;", "(Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksCount;Lcom/tinder/domain/toppicks/TopPicksLoadingStatusProvider;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/toppicks/counter/TopPicksBottomCounterTarget;", "bindStatus", "", "status", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatus;", "dropTarget", "observeTopPicksCount", "observeTopPicksLoadingStatus", "takeTarget", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.counter.a */
public final class C15237a {
    /* renamed from: a */
    private TopPicksBottomCounterTarget f47322a;
    /* renamed from: b */
    private C17356a f47323b = new C17356a();
    /* renamed from: c */
    private final ObserveTopPicksCount f47324c;
    /* renamed from: d */
    private final TopPicksLoadingStatusProvider f47325d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "count", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.counter.a$a */
    static final class C16989a<T> implements Consumer<Integer> {
        /* renamed from: a */
        final /* synthetic */ C15237a f52394a;

        C16989a(C15237a c15237a) {
            this.f52394a = c15237a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62755a((Integer) obj);
        }

        /* renamed from: a */
        public final void m62755a(Integer num) {
            TopPicksBottomCounterTarget a = this.f52394a.f47322a;
            if (a != null) {
                C2668g.a(num, ManagerWebServices.FB_PARAM_FIELD_COUNT);
                a.updateCount(num.intValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.counter.a$b */
    static final class C16990b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16990b f52395a = new C16990b();

        C16990b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62756a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62756a(Throwable th) {
            C0001a.c(th, "Failed getting update count", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.counter.a$c */
    static final class C16991c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16991c f52396a = new C16991c();

        C16991c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62757a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62757a(Throwable th) {
            C0001a.c(th, "Error observing loading status", new Object[0]);
        }
    }

    @Inject
    public C15237a(@NotNull ObserveTopPicksCount observeTopPicksCount, @NotNull TopPicksLoadingStatusProvider topPicksLoadingStatusProvider) {
        C2668g.b(observeTopPicksCount, "topPicksCount");
        C2668g.b(topPicksLoadingStatusProvider, "topPicksLoadingStatusProvider");
        this.f47324c = observeTopPicksCount;
        this.f47325d = topPicksLoadingStatusProvider;
    }

    /* renamed from: a */
    public final void m57308a(@NotNull TopPicksBottomCounterTarget topPicksBottomCounterTarget) {
        C2668g.b(topPicksBottomCounterTarget, "target");
        this.f47322a = topPicksBottomCounterTarget;
        m57305b();
        m57306c();
    }

    /* renamed from: a */
    public final void m57307a() {
        this.f47322a = (TopPicksBottomCounterTarget) null;
        this.f47323b.m63446a();
    }

    /* renamed from: b */
    private final void m57305b() {
        this.f47323b.add(this.f47324c.execute().b(C15756a.m59010b()).a(C15674a.m58830a()).a(new C16989a(this), C16990b.f52395a));
    }

    /* renamed from: c */
    private final void m57306c() {
        this.f47323b.add(this.f47325d.observeLoadingStatus().distinctUntilChanged().subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new C16992c(new TopPicksBottomCounterPresenter$observeTopPicksLoadingStatus$1(this)), C16991c.f52396a));
    }

    /* renamed from: a */
    private final void m57303a(TopPicksLoadingStatus topPicksLoadingStatus) {
        if (C15238b.f47326a[topPicksLoadingStatus.ordinal()] != 1) {
            topPicksLoadingStatus = this.f47322a;
            if (topPicksLoadingStatus != null) {
                topPicksLoadingStatus.hideLoading();
                return;
            }
            return;
        }
        topPicksLoadingStatus = this.f47322a;
        if (topPicksLoadingStatus != null) {
            topPicksLoadingStatus.showLoading();
        }
    }
}
