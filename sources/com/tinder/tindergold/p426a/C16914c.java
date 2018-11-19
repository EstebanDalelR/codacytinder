package com.tinder.tindergold.p426a;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.etl.event.ip;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/tindergold/analytics/AddGoldIntroViewEvent;", "Lcom/tinder/domain/common/usecase/SimpleCompletableUseCase;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "buildIntroViewEvent", "Lcom/tinder/etl/event/GoldViewIntroductionEvent;", "execute", "Lrx/Completable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.tindergold.a.c */
public final class C16914c implements SimpleCompletableUseCase {
    /* renamed from: a */
    private final C2630h f52113a;
    /* renamed from: b */
    private final SubscriptionProvider f52114b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tindergold.a.c$a */
    static final class C18954a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16914c f58628a;

        C18954a(C16914c c16914c) {
            this.f58628a = c16914c;
        }

        public final void call() {
            this.f58628a.f52113a.a(this.f58628a.m62562a());
        }
    }

    @Inject
    public C16914c(@NotNull C2630h c2630h, @NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        this.f52113a = c2630h;
        this.f52114b = subscriptionProvider;
    }

    @NotNull
    public Completable execute() {
        Completable a = Completable.a(new C18954a(this));
        C2668g.a(a, "Completable.fromAction {…(buildIntroViewEvent()) }");
        return a;
    }

    /* renamed from: a */
    private final ip m62562a() {
        ip a = ip.a().a(Integer.valueOf(this.f52114b.get().isPlus())).a();
        C2668g.a(a, "GoldViewIntroductionEven…\n                .build()");
        return a;
    }
}
