package com.tinder.tindergold.p426a;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.etl.event.ii;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/tindergold/analytics/AddGoldContinueIntroEvent;", "Lcom/tinder/domain/common/usecase/SimpleCompletableUseCase;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "buildContinueIntroEvent", "Lcom/tinder/etl/event/GoldContinueIntroductionEvent;", "execute", "Lrx/Completable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.tindergold.a.b */
public final class C16913b implements SimpleCompletableUseCase {
    /* renamed from: a */
    private final C2630h f52111a;
    /* renamed from: b */
    private final SubscriptionProvider f52112b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tindergold.a.b$a */
    static final class C18953a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16913b f58627a;

        C18953a(C16913b c16913b) {
            this.f58627a = c16913b;
        }

        public final void call() {
            this.f58627a.f52111a.a(this.f58627a.m62559a());
        }
    }

    @Inject
    public C16913b(@NotNull C2630h c2630h, @NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        this.f52111a = c2630h;
        this.f52112b = subscriptionProvider;
    }

    @NotNull
    public Completable execute() {
        Completable a = Completable.a(new C18953a(this));
        C2668g.a(a, "Completable.fromAction {…ldContinueIntroEvent()) }");
        return a;
    }

    /* renamed from: a */
    private final ii m62559a() {
        ii a = ii.a().a(Integer.valueOf(this.f52112b.get().isPlus())).a();
        C2668g.a(a, "GoldContinueIntroduction…\n                .build()");
        return a;
    }
}
