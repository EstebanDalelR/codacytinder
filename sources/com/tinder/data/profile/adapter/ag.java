package com.tinder.data.profile.adapter;

import com.tinder.api.model.profile.Products.Sku;
import com.tinder.api.model.profile.Products.Sku.ProductType;
import com.tinder.api.model.profile.Products.Sku.PurchaseType;
import com.tinder.domain.profile.model.Product;
import com.tinder.domain.profile.model.Products;
import com.tinder.domain.profile.model.Variant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0014\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0014\u0010\u001c\u001a\u00060\u001dj\u0002`\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002¨\u0006!"}, d2 = {"Lcom/tinder/data/profile/adapter/ProductsAdapter;", "", "()V", "createProduct", "Lcom/tinder/domain/profile/model/Product;", "Lcom/tinder/data/profile/adapter/DomainProduct;", "product", "Lcom/tinder/api/model/profile/Products$Product;", "createSku", "Lcom/tinder/domain/profile/model/Sku;", "Lcom/tinder/data/profile/adapter/DomainSku;", "sku", "Lcom/tinder/api/model/profile/Products$Sku;", "createVariant", "Lcom/tinder/domain/profile/model/Variant;", "Lcom/tinder/data/profile/adapter/DomainVariant;", "variant", "Lcom/tinder/api/model/profile/Products$Variant;", "fromApi", "Lcom/tinder/domain/profile/model/Products;", "Lcom/tinder/data/profile/adapter/DomainProducts;", "apiProducts", "Lcom/tinder/api/model/profile/Products;", "getProductTypeFrom", "Lcom/tinder/domain/profile/model/ProductType;", "Lcom/tinder/data/profile/adapter/DomainProductType;", "productType", "Lcom/tinder/api/model/profile/Products$Sku$ProductType;", "getPurchaseTypeFrom", "Lcom/tinder/domain/profile/model/PurchaseType;", "Lcom/tinder/data/profile/adapter/DomainPurchaseType;", "purchaseType", "Lcom/tinder/api/model/profile/Products$Sku$PurchaseType;", "data_release"}, k = 1, mv = {1, 1, 10})
public final class ag {
    @NotNull
    /* renamed from: a */
    public final Products m37288a(@NotNull com.tinder.api.model.profile.Products products) {
        C2668g.b(products, "apiProducts");
        return new Products(m37287a(products.plus()), m37287a(products.superlike()), m37287a(products.boost()), m37287a(products.gold()), m37287a(products.topPicks()));
    }

    /* renamed from: a */
    private final Variant m37287a(com.tinder.api.model.profile.Products.Variant variant) {
        Product product = null;
        if (variant == null) {
            return null;
        }
        com.tinder.api.model.profile.Products.Product discount = variant.discount();
        if (discount != null) {
            C2668g.a(discount, "it");
            product = m37283a(discount);
        }
        com.tinder.api.model.profile.Products.Product regular = variant.regular();
        C2668g.a(regular, "variant.regular()");
        return new Variant(m37283a(regular), product);
    }

    /* renamed from: a */
    private final Product m37283a(com.tinder.api.model.profile.Products.Product product) {
        List skus = product.skus();
        C2668g.a(skus, "product.skus()");
        Iterable<Sku> iterable = skus;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (Sku sku : iterable) {
            C2668g.a(sku, "apiSku");
            arrayList.add(m37286a(sku));
        }
        return new Product(C19301m.l((List) arrayList), product.viewAt(), product.expiredAt(), product.campaignVariantName(), product.campaign());
    }

    /* renamed from: a */
    private final com.tinder.domain.profile.model.Sku m37286a(Sku sku) {
        ProductType productType = sku.productType();
        C2668g.a(productType, "sku.productType()");
        com.tinder.domain.profile.model.ProductType a = m37284a(productType);
        PurchaseType purchaseType = sku.purchaseType();
        C2668g.a(purchaseType, "sku.purchaseType()");
        com.tinder.domain.profile.model.PurchaseType a2 = m37285a(purchaseType);
        String productId = sku.productId();
        C2668g.a(productId, "sku.productId()");
        Boolean isBaseGroup = sku.isBaseGroup();
        if (isBaseGroup == null) {
            isBaseGroup = Boolean.valueOf(false);
        }
        boolean booleanValue = isBaseGroup.booleanValue();
        isBaseGroup = sku.isPrimary();
        if (isBaseGroup == null) {
            isBaseGroup = Boolean.valueOf(false);
        }
        boolean booleanValue2 = isBaseGroup.booleanValue();
        String originalProductId = sku.originalProductId();
        if (originalProductId == null) {
            originalProductId = "";
        }
        String str = originalProductId;
        Integer amount = sku.amount();
        if (amount == null) {
            amount = Integer.valueOf(0);
        }
        int intValue = amount.intValue();
        amount = sku.term();
        if (amount == null) {
            amount = Integer.valueOf(0);
        }
        int intValue2 = amount.intValue();
        amount = sku.discountPercentage();
        if (amount == null) {
            amount = Integer.valueOf(0);
        }
        int intValue3 = amount.intValue();
        sku = sku.isIntroPricing();
        if (sku == null) {
            sku = Boolean.valueOf(false);
        }
        return new com.tinder.domain.profile.model.Sku(a, a2, productId, booleanValue, booleanValue2, str, intValue, intValue2, intValue3, sku.booleanValue());
    }

    /* renamed from: a */
    private final com.tinder.domain.profile.model.ProductType m37284a(ProductType productType) {
        switch (ah.f30747a[productType.ordinal()]) {
            case 1:
                return com.tinder.domain.profile.model.ProductType.PLUS;
            case 2:
                return com.tinder.domain.profile.model.ProductType.BOOST;
            case 3:
                return com.tinder.domain.profile.model.ProductType.SUPERLIKE;
            case 4:
                return com.tinder.domain.profile.model.ProductType.GOLD;
            case 5:
                return com.tinder.domain.profile.model.ProductType.TOP_PICKS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final com.tinder.domain.profile.model.PurchaseType m37285a(PurchaseType purchaseType) {
        switch (ah.f30748b[purchaseType.ordinal()]) {
            case 1:
                return com.tinder.domain.profile.model.PurchaseType.CONSUMABLE;
            case 2:
                return com.tinder.domain.profile.model.PurchaseType.SUBSCRIPTION;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
