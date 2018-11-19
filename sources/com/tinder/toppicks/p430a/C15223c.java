package com.tinder.toppicks.p430a;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.etl.event.zc;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/toppicks/analytics/SendTopPicksEmptyStateViewEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "execute", "", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.a.c */
public final class C15223c {
    /* renamed from: a */
    private final C2630h f47315a;
    /* renamed from: b */
    private final SubscriptionProvider f47316b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/common/model/Subscription;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.a.c$a */
    static final class C16978a<T> implements Consumer<Subscription> {
        /* renamed from: a */
        final /* synthetic */ C15223c f52373a;

        C16978a(C15223c c15223c) {
            this.f52373a = c15223c;
        }

        public /* synthetic */ void accept(Object obj) {
            m62746a((Subscription) obj);
        }

        /* renamed from: a */
        public final void m62746a(Subscription subscription) {
            this.f52373a.f47315a.a(zc.a().a(Boolean.valueOf(subscription.isGold())).a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.a.c$b */
    static final class C16979b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16979b f52374a = new C16979b();

        C16979b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62747a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62747a(Throwable th) {
            C0001a.c(th, "Error executing TopPicksExhaustedEvent", new Object[0]);
        }
    }

    @Inject
    public C15223c(@NotNull C2630h c2630h, @NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        this.f47315a = c2630h;
        this.f47316b = subscriptionProvider;
    }

    /* renamed from: a */
    public final void m57290a() {
        RxJavaInteropExtKt.toV2Flowable(this.f47316b.observe()).e().b(C15756a.m59010b()).a(new C16978a(this), C16979b.f52374a);
    }
}
