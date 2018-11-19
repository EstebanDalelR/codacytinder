package com.tinder.tindergold.p426a;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.etl.event.ih;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/tindergold/analytics/AddGoldCancelIntroEvent;", "Lcom/tinder/domain/common/usecase/SimpleCompletableUseCase;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "buildCancelIntroEvent", "Lcom/tinder/etl/event/GoldCancelIntroductionEvent;", "execute", "Lrx/Completable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.tindergold.a.a */
public final class C16912a implements SimpleCompletableUseCase {
    /* renamed from: a */
    private final C2630h f52109a;
    /* renamed from: b */
    private final SubscriptionProvider f52110b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tindergold.a.a$a */
    static final class C18952a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16912a f58626a;

        C18952a(C16912a c16912a) {
            this.f58626a = c16912a;
        }

        public final void call() {
            this.f58626a.f52109a.a(this.f58626a.m62556a());
        }
    }

    @Inject
    public C16912a(@NotNull C2630h c2630h, @NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        this.f52109a = c2630h;
        this.f52110b = subscriptionProvider;
    }

    @NotNull
    public Completable execute() {
        Completable a = Completable.a(new C18952a(this));
        C2668g.a(a, "Completable.fromAction {…uildCancelIntroEvent()) }");
        return a;
    }

    /* renamed from: a */
    private final ih m62556a() {
        ih a = ih.a().a(Integer.valueOf(this.f52110b.get().isPlus())).a();
        C2668g.a(a, "GoldCancelIntroductionEv…\n                .build()");
        return a;
    }
}
