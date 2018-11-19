package com.tinder.purchase.usecase;

import com.tinder.domain.common.usecase.UseCase;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.repository.OfferRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/purchase/usecase/ObserveOffersForProductType;", "Lcom/tinder/domain/common/usecase/UseCase;", "Lcom/tinder/domain/profile/model/ProductType;", "", "Lcom/tinder/purchase/domain/model/Offer;", "offerRepository", "Lcom/tinder/purchase/domain/repository/OfferRepository;", "(Lcom/tinder/purchase/domain/repository/OfferRepository;)V", "execute", "Lrx/Observable;", "productType", "purchase_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.usecase.h */
public final class C16246h implements UseCase<ProductType, List<? extends C14510e>> {
    /* renamed from: a */
    private final OfferRepository f50616a;

    @Inject
    public C16246h(@NotNull OfferRepository offerRepository) {
        C2668g.b(offerRepository, "offerRepository");
        this.f50616a = offerRepository;
    }

    public /* synthetic */ Observable execute(Object obj) {
        return m61399a((ProductType) obj);
    }

    @NotNull
    /* renamed from: a */
    public Observable<List<C14510e>> m61399a(@NotNull ProductType productType) {
        C2668g.b(productType, "productType");
        productType = this.f50616a.observeOffers(productType);
        C2668g.a(productType, "offerRepository.observeOffers(productType)");
        return productType;
    }
}
