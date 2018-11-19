package com.tinder.recsads.analytics;

import com.tinder.addy.AdLoader;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.etl.event.ag;
import com.tinder.recsads.analytics.AdEventFields.From;
import com.tinder.recsads.model.RecsAdsConfig;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/recsads/analytics/AddAdRequestSendEvent;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/recsads/analytics/AddAdRequestSendEvent$Request;", "recsAdsConfig", "Lcom/tinder/recsads/model/RecsAdsConfig;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/recsads/model/RecsAdsConfig;Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "Lio/reactivex/Completable;", "request", "Request", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.analytics.n */
public final class C16437n implements CompletableUseCase<C14741a> {
    /* renamed from: a */
    private final RecsAdsConfig f51004a;
    /* renamed from: b */
    private final C2630h f51005b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/recsads/analytics/AddAdRequestSendEvent$Request;", "", "adLoader", "Lcom/tinder/addy/AdLoader;", "(Lcom/tinder/addy/AdLoader;)V", "getAdLoader", "()Lcom/tinder/addy/AdLoader;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.analytics.n$a */
    public static final class C14741a {
        @NotNull
        /* renamed from: a */
        private final AdLoader f46315a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C14741a) {
                    if (C2668g.a(this.f46315a, ((C14741a) obj).f46315a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            AdLoader adLoader = this.f46315a;
            return adLoader != null ? adLoader.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(adLoader=");
            stringBuilder.append(this.f46315a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14741a(@NotNull AdLoader adLoader) {
            C2668g.b(adLoader, "adLoader");
            this.f46315a = adLoader;
        }

        @NotNull
        /* renamed from: a */
        public final AdLoader m56009a() {
            return this.f46315a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.analytics.n$b */
    static final class C16436b implements Action {
        /* renamed from: a */
        final /* synthetic */ C16437n f51002a;
        /* renamed from: b */
        final /* synthetic */ C14741a f51003b;

        C16436b(C16437n c16437n, C14741a c14741a) {
            this.f51002a = c16437n;
            this.f51003b = c14741a;
        }

        public final void run() {
            this.f51002a.f51005b.a(ag.a().a(Integer.valueOf(this.f51002a.f51004a.cadence())).c(Provider.Companion.m55993a(this.f51003b.m56009a()).key()).b(From.RECS.key()).a());
        }
    }

    @Inject
    public C16437n(@NotNull RecsAdsConfig recsAdsConfig, @NotNull C2630h c2630h) {
        C2668g.b(recsAdsConfig, "recsAdsConfig");
        C2668g.b(c2630h, "fireworks");
        this.f51004a = recsAdsConfig;
        this.f51005b = c2630h;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m61829a((C14741a) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3956a m61829a(@NotNull C14741a c14741a) {
        C2668g.b(c14741a, "request");
        c14741a = C3956a.a(new C16436b(this, c14741a));
        C2668g.a(c14741a, "Completable.fromAction {…addEvent(event)\n        }");
        return c14741a;
    }
}
