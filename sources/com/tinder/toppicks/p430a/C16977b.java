package com.tinder.toppicks.p430a;

import com.tinder.analytics.C6234l;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.etl.event.zb;
import com.tinder.purchase.domain.repository.OfferRepository;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/toppicks/analytics/AddTopPicksPaywallViewEvent;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "", "offerRepository", "Lcom/tinder/purchase/domain/repository/OfferRepository;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/purchase/domain/repository/OfferRepository;Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "Lio/reactivex/Completable;", "source", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.a.b */
public final class C16977b implements CompletableUseCase<Integer> {
    /* renamed from: a */
    private final OfferRepository f52371a;
    /* renamed from: b */
    private final C2630h f52372b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.a.b$a */
    static final class C16976a implements Action {
        /* renamed from: a */
        final /* synthetic */ C16977b f52369a;
        /* renamed from: b */
        final /* synthetic */ int f52370b;

        C16976a(C16977b c16977b, int i) {
            this.f52369a = c16977b;
            this.f52370b = i;
        }

        public final void run() {
            this.f52369a.f52372b.a(zb.a().a(Integer.valueOf(this.f52370b)).a(C6234l.a(this.f52369a.f52371a, ProductType.TOP_PICKS)).a());
        }
    }

    @Inject
    public C16977b(@NotNull OfferRepository offerRepository, @NotNull C2630h c2630h) {
        C2668g.b(offerRepository, "offerRepository");
        C2668g.b(c2630h, "fireworks");
        this.f52371a = offerRepository;
        this.f52372b = c2630h;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m62745a(((Number) obj).intValue());
    }

    @NotNull
    /* renamed from: a */
    public C3956a m62745a(int i) {
        i = C3956a.a(new C16976a(this, i));
        C2668g.a(i, "Completable.fromAction {…addEvent(event)\n        }");
        return i;
    }
}
