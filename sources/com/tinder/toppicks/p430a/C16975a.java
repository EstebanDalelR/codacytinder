package com.tinder.toppicks.p430a;

import com.tinder.analytics.C6234l;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.etl.event.za;
import com.tinder.etl.event.za.C9350a;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.C14514j;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.utils.ab;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/toppicks/analytics/AddTopPicksPaywallPurchaseEvent;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/toppicks/analytics/AddTopPicksPaywallPurchaseEvent$PurchaseEventParams;", "offerRepository", "Lcom/tinder/purchase/domain/repository/OfferRepository;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/purchase/domain/repository/OfferRepository;Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "Lrx/Completable;", "params", "PurchaseEventParams", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.a.a */
public final class C16975a implements CompletableUseCase<C15222a> {
    /* renamed from: a */
    private final OfferRepository f52367a;
    /* renamed from: b */
    private final C2630h f52368b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/toppicks/analytics/AddTopPicksPaywallPurchaseEvent$PurchaseEventParams;", "", "source", "", "sku", "", "(ILjava/lang/String;)V", "getSku", "()Ljava/lang/String;", "getSource", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.a.a$a */
    public static final class C15222a {
        /* renamed from: a */
        private final int f47313a;
        @NotNull
        /* renamed from: b */
        private final String f47314b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15222a) {
                C15222a c15222a = (C15222a) obj;
                return (this.f47313a == c15222a.f47313a ? 1 : null) != null && C2668g.a(this.f47314b, c15222a.f47314b);
            }
        }

        public int hashCode() {
            int i = this.f47313a * 31;
            String str = this.f47314b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PurchaseEventParams(source=");
            stringBuilder.append(this.f47313a);
            stringBuilder.append(", sku=");
            stringBuilder.append(this.f47314b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15222a(int i, @NotNull String str) {
            C2668g.b(str, "sku");
            this.f47313a = i;
            this.f47314b = str;
        }

        /* renamed from: a */
        public final int m57287a() {
            return this.f47313a;
        }

        @NotNull
        /* renamed from: b */
        public final String m57288b() {
            return this.f47314b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.a.a$b */
    static final class C18978b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16975a f58675a;
        /* renamed from: b */
        final /* synthetic */ C15222a f58676b;

        C18978b(C16975a c16975a, C15222a c15222a) {
            this.f58675a = c16975a;
            this.f58676b = c15222a;
        }

        public final void call() {
            C14514j d;
            Double b;
            String a;
            C14514j j;
            C14510e offer = this.f58675a.f52367a.getOffer(this.f58676b.m57288b());
            Double d2 = null;
            C9350a b2 = za.a().a(Integer.valueOf(this.f58676b.m57287a())).a(this.f58676b.m57288b()).b(offer != null ? offer.mo11844f() : null);
            if (offer != null) {
                d = offer.mo11842d();
                if (d != null) {
                    b = d.mo11870b();
                    b2 = b2.c(b);
                    if (offer != null) {
                        d = offer.mo11848j();
                        if (d != null) {
                            a = d.mo11869a();
                            b2 = b2.b(a);
                            if (offer != null) {
                                j = offer.mo11848j();
                                if (j != null) {
                                    d2 = j.mo11870b();
                                }
                            }
                            this.f58675a.f52368b.a(b2.d(d2).c(ab.m57609b()).a(C6234l.a(this.f58675a.f52367a, ProductType.TOP_PICKS)).a());
                        }
                    }
                    a = null;
                    b2 = b2.b(a);
                    if (offer != null) {
                        j = offer.mo11848j();
                        if (j != null) {
                            d2 = j.mo11870b();
                        }
                    }
                    this.f58675a.f52368b.a(b2.d(d2).c(ab.m57609b()).a(C6234l.a(this.f58675a.f52367a, ProductType.TOP_PICKS)).a());
                }
            }
            b = null;
            b2 = b2.c(b);
            if (offer != null) {
                d = offer.mo11848j();
                if (d != null) {
                    a = d.mo11869a();
                    b2 = b2.b(a);
                    if (offer != null) {
                        j = offer.mo11848j();
                        if (j != null) {
                            d2 = j.mo11870b();
                        }
                    }
                    this.f58675a.f52368b.a(b2.d(d2).c(ab.m57609b()).a(C6234l.a(this.f58675a.f52367a, ProductType.TOP_PICKS)).a());
                }
            }
            a = null;
            b2 = b2.b(a);
            if (offer != null) {
                j = offer.mo11848j();
                if (j != null) {
                    d2 = j.mo11870b();
                }
            }
            this.f58675a.f52368b.a(b2.d(d2).c(ab.m57609b()).a(C6234l.a(this.f58675a.f52367a, ProductType.TOP_PICKS)).a());
        }
    }

    @Inject
    public C16975a(@NotNull OfferRepository offerRepository, @NotNull C2630h c2630h) {
        C2668g.b(offerRepository, "offerRepository");
        C2668g.b(c2630h, "fireworks");
        this.f52367a = offerRepository;
        this.f52368b = c2630h;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m62742a((C15222a) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m62742a(@NotNull C15222a c15222a) {
        C2668g.b(c15222a, "params");
        c15222a = Completable.a(new C18978b(this, c15222a));
        C2668g.a(c15222a, "Completable.fromAction {…addEvent(event)\n        }");
        return c15222a;
    }
}
