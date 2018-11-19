package com.tinder.fastmatch.newcount;

import com.tinder.boost.model.BoostState;
import com.tinder.boost.provider.C2639c;
import com.tinder.domain.fastmatch.model.FastMatchConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Func1;
import rx.functions.Func2;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/fastmatch/newcount/NewCountUpdateIntervalProvider;", "", "boostStateProvider", "Lcom/tinder/boost/provider/BoostStateProvider;", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "(Lcom/tinder/boost/provider/BoostStateProvider;Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;)V", "observe", "Lrx/Observable;", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.newcount.b */
public final class C9381b {
    /* renamed from: a */
    private final C2639c f31468a;
    /* renamed from: b */
    private final FastMatchConfigProvider f31469b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/boost/model/BoostState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.newcount.b$a */
    static final class C13198a<T, R> implements Func1<BoostState, Boolean> {
        /* renamed from: a */
        public static final C13198a f41900a = new C13198a();

        C13198a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51178a((BoostState) obj));
        }

        /* renamed from: a */
        public final boolean m51178a(BoostState boostState) {
            return (boostState == BoostState.OUT_OF_BOOST || boostState == BoostState.NETWORK_ERROR) ? null : true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "boostState", "Lcom/tinder/boost/model/BoostState;", "kotlin.jvm.PlatformType", "fastMatchConfig", "Lcom/tinder/domain/fastmatch/model/FastMatchConfig;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.newcount.b$b */
    static final class C13199b<T1, T2, R> implements Func2<T1, T2, R> {
        /* renamed from: a */
        public static final C13199b f41901a = new C13199b();

        C13199b() {
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return Long.valueOf(m51179a((BoostState) obj, (FastMatchConfig) obj2));
        }

        /* renamed from: a */
        public final long m51179a(BoostState boostState, FastMatchConfig fastMatchConfig) {
            if (boostState != null) {
                switch (C9382c.f31470a[boostState.ordinal()]) {
                    case 1:
                    case 2:
                        return fastMatchConfig.getNewCountFetchIntervalWhileBoosting();
                    default:
                        break;
                }
            }
            return fastMatchConfig.getNewCountFetchInterval();
        }
    }

    @Inject
    public C9381b(@NotNull C2639c c2639c, @NotNull FastMatchConfigProvider fastMatchConfigProvider) {
        C2668g.b(c2639c, "boostStateProvider");
        C2668g.b(fastMatchConfigProvider, "fastMatchConfigProvider");
        this.f31468a = c2639c;
        this.f31469b = fastMatchConfigProvider;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<Long> m39282a() {
        Observable<Long> g = Observable.a(this.f31468a.a().f(C13198a.f41900a), this.f31469b.observe(), C13199b.f41901a).g();
        C2668g.a(g, "Observable.combineLatest…}).distinctUntilChanged()");
        return g;
    }
}
