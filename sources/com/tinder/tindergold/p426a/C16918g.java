package com.tinder.tindergold.p426a;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.paywall.paywallflow.C10076o.C10074a;
import com.tinder.purchase.domain.model.C14510e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/tindergold/analytics/AddGoldPurchaseEvent;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/tindergold/analytics/AddGoldPurchaseEvent$PurchaseEventParams;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "goldEtlEventFactory", "Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory;)V", "execute", "Lrx/Completable;", "purchaseEventParams", "PurchaseEventParams", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.tindergold.a.g */
public final class C16918g implements CompletableUseCase<C15179a> {
    /* renamed from: a */
    private final C2630h f52121a;
    /* renamed from: b */
    private final C15183k f52122b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/tindergold/analytics/AddGoldPurchaseEvent$PurchaseEventParams;", "", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "config", "Lcom/tinder/paywall/paywallflow/PaywallFlow$Configuration;", "(Lcom/tinder/purchase/domain/model/Offer;Lcom/tinder/paywall/paywallflow/PaywallFlow$Configuration;)V", "getConfig", "()Lcom/tinder/paywall/paywallflow/PaywallFlow$Configuration;", "getOffer", "()Lcom/tinder/purchase/domain/model/Offer;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.tindergold.a.g$a */
    public static final class C15179a {
        @NotNull
        /* renamed from: a */
        private final C14510e f47205a;
        @NotNull
        /* renamed from: b */
        private final C10074a f47206b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C15179a) {
                    C15179a c15179a = (C15179a) obj;
                    if (C2668g.a(this.f47205a, c15179a.f47205a) && C2668g.a(this.f47206b, c15179a.f47206b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C14510e c14510e = this.f47205a;
            int i = 0;
            int hashCode = (c14510e != null ? c14510e.hashCode() : 0) * 31;
            C10074a c10074a = this.f47206b;
            if (c10074a != null) {
                i = c10074a.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PurchaseEventParams(offer=");
            stringBuilder.append(this.f47205a);
            stringBuilder.append(", config=");
            stringBuilder.append(this.f47206b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15179a(@NotNull C14510e c14510e, @NotNull C10074a c10074a) {
            C2668g.b(c14510e, "offer");
            C2668g.b(c10074a, "config");
            this.f47205a = c14510e;
            this.f47206b = c10074a;
        }

        @NotNull
        /* renamed from: a */
        public final C14510e m57070a() {
            return this.f47205a;
        }

        @NotNull
        /* renamed from: b */
        public final C10074a m57071b() {
            return this.f47206b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tindergold.a.g$b */
    static final class C18958b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16918g f58635a;
        /* renamed from: b */
        final /* synthetic */ C15179a f58636b;

        C18958b(C16918g c16918g, C15179a c15179a) {
            this.f58635a = c16918g;
            this.f58636b = c15179a;
        }

        public final void call() {
            this.f58635a.f52121a.a(this.f58635a.f52122b.m57092b(this.f58635a.f52122b.m57091a(this.f58636b.m57070a(), this.f58636b.m57071b())));
        }
    }

    @Inject
    public C16918g(@NotNull C2630h c2630h, @NotNull C15183k c15183k) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c15183k, "goldEtlEventFactory");
        this.f52121a = c2630h;
        this.f52122b = c15183k;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m62575a((C15179a) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m62575a(@NotNull C15179a c15179a) {
        C2668g.b(c15179a, "purchaseEventParams");
        c15179a = Completable.a(new C18958b(this, c15179a));
        C2668g.a(c15179a, "Completable.fromAction {…arams.config)))\n        }");
        return c15179a;
    }
}
