package com.tinder.paywall.p351a;

import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.paywall.domain.C10060a;
import com.tinder.paywall.domain.PaywallRepository;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.repository.OfferRepository;
import io.reactivex.C3959e;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/tinder/paywall/data/PaywallDataRepository;", "Lcom/tinder/paywall/domain/PaywallRepository;", "offerRepository", "Lcom/tinder/purchase/domain/repository/OfferRepository;", "(Lcom/tinder/purchase/domain/repository/OfferRepository;)V", "getOfferRepository", "()Lcom/tinder/purchase/domain/repository/OfferRepository;", "observePaywallUpdates", "Lio/reactivex/Observable;", "Lcom/tinder/paywall/domain/Paywall;", "type", "Lcom/tinder/domain/profile/model/ProductType;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.a.a */
public final class C12264a implements PaywallRepository {
    @NotNull
    /* renamed from: a */
    private final OfferRepository f39675a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/paywall/domain/Paywall;", "it", "", "Lcom/tinder/purchase/domain/model/Offer;", "kotlin.jvm.PlatformType", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.paywall.a.a$a */
    static final class C13546a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13546a f43268a = new C13546a();

        C13546a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m52936a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C10060a m52936a(List<C14510e> list) {
            C2668g.a(list, "it");
            return new C10060a(list);
        }
    }

    @Inject
    public C12264a(@NotNull OfferRepository offerRepository) {
        C2668g.b(offerRepository, "offerRepository");
        this.f39675a = offerRepository;
    }

    @NotNull
    public C3959e<C10060a> observePaywallUpdates(@NotNull ProductType productType) {
        C2668g.b(productType, "type");
        productType = this.f39675a.observeOffers(productType).k(C13546a.f43268a);
        C2668g.a(productType, "offerRepository\n        …     .map { Paywall(it) }");
        return RxJavaInteropExtKt.toV2Observable(productType);
    }
}
