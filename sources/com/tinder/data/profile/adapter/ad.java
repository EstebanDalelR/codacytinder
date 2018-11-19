package com.tinder.data.profile.adapter;

import com.tinder.api.model.profile.Products.Sku;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.profile.model.ProductType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00022\n\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/data/profile/adapter/ProductTypeAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/profile/model/ProductType;", "Lcom/tinder/api/model/profile/Products$Sku$ProductType;", "Lcom/tinder/data/profile/adapter/ApiProductType;", "()V", "fromApi", "productType", "data_release"}, k = 1, mv = {1, 1, 10})
public final class ad extends C2646o<ProductType, Sku.ProductType> {
    @NotNull
    /* renamed from: a */
    public ProductType m43478a(@NotNull Sku.ProductType productType) {
        C2668g.b(productType, "productType");
        switch (ae.f30746a[productType.ordinal()]) {
            case 1:
                return ProductType.PLUS;
            case 2:
                return ProductType.BOOST;
            case 3:
                return ProductType.SUPERLIKE;
            case 4:
                return ProductType.GOLD;
            case 5:
                return ProductType.TOP_PICKS;
            default:
                throw ((Throwable) new IllegalArgumentException("Sku must have a product type"));
        }
    }
}
