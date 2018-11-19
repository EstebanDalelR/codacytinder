package com.tinder.analytics;

import com.tinder.domain.profile.model.ProductType;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.repository.OfferRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"getOffersAsAnalyticsProducts", "", "", "", "", "Lcom/tinder/purchase/domain/repository/OfferRepository;", "productType", "Lcom/tinder/domain/profile/model/ProductType;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.analytics.l */
public final class C6234l {
    @NotNull
    /* renamed from: a */
    public static final List<Map<String, Object>> m26932a(@NotNull OfferRepository offerRepository, @NotNull ProductType productType) {
        C2668g.b(offerRepository, "$receiver");
        C2668g.b(productType, "productType");
        offerRepository = offerRepository.getOffers(productType);
        C2668g.a(offerRepository, "this.getOffers(productType)");
        Iterable<C14510e> iterable = (Iterable) offerRepository;
        Collection collection = (Collection) new ArrayList(C19301m.a(iterable, 10));
        for (C14510e c14510e : iterable) {
            Map linkedHashMap = new LinkedHashMap();
            String a = c14510e.a();
            C2668g.a(a, "offer.productId()");
            linkedHashMap.put("sku", a);
            Double b = c14510e.d().b();
            C2668g.a(b, "offer.price().amount()");
            linkedHashMap.put("price", b);
            collection.add(linkedHashMap);
        }
        return (List) collection;
    }
}
