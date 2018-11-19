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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/tindergold/analytics/AddGoldRestoreEvent;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/tindergold/analytics/AddGoldRestoreEvent$Params;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "goldEtlEventFactory", "Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory;)V", "execute", "Lrx/Completable;", "params", "Params", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.tindergold.a.h */
public final class C16919h implements CompletableUseCase<C15180a> {
    /* renamed from: a */
    private final C2630h f52123a;
    /* renamed from: b */
    private final C15183k f52124b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/tindergold/analytics/AddGoldRestoreEvent$Params;", "", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "config", "Lcom/tinder/paywall/paywallflow/PaywallFlow$Configuration;", "(Lcom/tinder/purchase/domain/model/Offer;Lcom/tinder/paywall/paywallflow/PaywallFlow$Configuration;)V", "getConfig", "()Lcom/tinder/paywall/paywallflow/PaywallFlow$Configuration;", "getOffer", "()Lcom/tinder/purchase/domain/model/Offer;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.tindergold.a.h$a */
    public static final class C15180a {
        @NotNull
        /* renamed from: a */
        private final C14510e f47207a;
        @NotNull
        /* renamed from: b */
        private final C10074a f47208b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C15180a) {
                    C15180a c15180a = (C15180a) obj;
                    if (C2668g.a(this.f47207a, c15180a.f47207a) && C2668g.a(this.f47208b, c15180a.f47208b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C14510e c14510e = this.f47207a;
            int i = 0;
            int hashCode = (c14510e != null ? c14510e.hashCode() : 0) * 31;
            C10074a c10074a = this.f47208b;
            if (c10074a != null) {
                i = c10074a.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Params(offer=");
            stringBuilder.append(this.f47207a);
            stringBuilder.append(", config=");
            stringBuilder.append(this.f47208b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15180a(@NotNull C14510e c14510e, @NotNull C10074a c10074a) {
            C2668g.b(c14510e, "offer");
            C2668g.b(c10074a, "config");
            this.f47207a = c14510e;
            this.f47208b = c10074a;
        }

        @NotNull
        /* renamed from: a */
        public final C14510e m57072a() {
            return this.f47207a;
        }

        @NotNull
        /* renamed from: b */
        public final C10074a m57073b() {
            return this.f47208b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tindergold.a.h$b */
    static final class C18959b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16919h f58637a;
        /* renamed from: b */
        final /* synthetic */ C15180a f58638b;

        C18959b(C16919h c16919h, C15180a c15180a) {
            this.f58637a = c16919h;
            this.f58638b = c15180a;
        }

        public final void call() {
            this.f58637a.f52123a.a(this.f58637a.f52124b.m57095e(this.f58637a.f52124b.m57091a(this.f58638b.m57072a(), this.f58638b.m57073b())));
        }
    }

    @Inject
    public C16919h(@NotNull C2630h c2630h, @NotNull C15183k c15183k) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c15183k, "goldEtlEventFactory");
        this.f52123a = c2630h;
        this.f52124b = c15183k;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m62578a((C15180a) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m62578a(@NotNull C15180a c15180a) {
        C2668g.b(c15180a, "params");
        c15180a = Completable.a(new C18959b(this, c15180a));
        C2668g.a(c15180a, "Completable.fromAction {…arams.config)))\n        }");
        return c15180a;
    }
}
