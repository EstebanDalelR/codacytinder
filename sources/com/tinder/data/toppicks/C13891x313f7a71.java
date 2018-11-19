package com.tinder.data.toppicks;

import com.tinder.domain.toppicks.model.TopPicksResponse;
import com.tinder.domain.toppicks.repo.TopPicksRepository;
import io.reactivex.C3957b;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.toppicks.TopPicksCountUpdatesObserverAndUpdater$topPicksResponseCountObserver$2 */
final class C13891x313f7a71 extends Lambda implements Function0<C3957b<Integer>> {
    /* renamed from: a */
    final /* synthetic */ TopPicksRepository f44020a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/toppicks/model/TopPicksResponse;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.TopPicksCountUpdatesObserverAndUpdater$topPicksResponseCountObserver$2$1 */
    static final class C110041<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C110041 f35740a = new C110041();

        C110041() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Integer.valueOf(m43652a((TopPicksResponse) obj));
        }

        /* renamed from: a */
        public final int m43652a(@NotNull TopPicksResponse topPicksResponse) {
            C2668g.b(topPicksResponse, "it");
            return topPicksResponse.getCount();
        }
    }

    C13891x313f7a71(TopPicksRepository topPicksRepository) {
        this.f44020a = topPicksRepository;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53438a();
    }

    /* renamed from: a */
    public final C3957b<Integer> m53438a() {
        return this.f44020a.observeTopPicksResponse().f(C110041.f35740a);
    }
}
