package com.tinder.domain.profile.model;

import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/tinder/domain/profile/model/Variant;", "", "regular", "Lcom/tinder/domain/profile/model/Product;", "discount", "(Lcom/tinder/domain/profile/model/Product;Lcom/tinder/domain/profile/model/Product;)V", "getDiscount", "()Lcom/tinder/domain/profile/model/Product;", "getRegular", "component1", "component2", "copy", "equals", "", "other", "getDiscountProductIds", "", "", "getRegularProductIds", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class Variant {
    @Nullable
    private final Product discount;
    @NotNull
    private final Product regular;

    @NotNull
    public static /* synthetic */ Variant copy$default(Variant variant, Product product, Product product2, int i, Object obj) {
        if ((i & 1) != 0) {
            product = variant.regular;
        }
        if ((i & 2) != 0) {
            product2 = variant.discount;
        }
        return variant.copy(product, product2);
    }

    @NotNull
    public final Product component1() {
        return this.regular;
    }

    @Nullable
    public final Product component2() {
        return this.discount;
    }

    @NotNull
    public final Variant copy(@NotNull Product product, @Nullable Product product2) {
        C2668g.b(product, ManagerWebServices.PARAM_REGULAR);
        return new Variant(product, product2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Variant) {
                Variant variant = (Variant) obj;
                if (C2668g.a(this.regular, variant.regular) && C2668g.a(this.discount, variant.discount)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Product product = this.regular;
        int i = 0;
        int hashCode = (product != null ? product.hashCode() : 0) * 31;
        Product product2 = this.discount;
        if (product2 != null) {
            i = product2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Variant(regular=");
        stringBuilder.append(this.regular);
        stringBuilder.append(", discount=");
        stringBuilder.append(this.discount);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Variant(@NotNull Product product, @Nullable Product product2) {
        C2668g.b(product, ManagerWebServices.PARAM_REGULAR);
        this.regular = product;
        this.discount = product2;
    }

    @NotNull
    public final Product getRegular() {
        return this.regular;
    }

    @Nullable
    public final Product getDiscount() {
        return this.discount;
    }

    @NotNull
    public final List<String> getRegularProductIds() {
        Iterable<Sku> skus = this.regular.getSkus();
        Collection arrayList = new ArrayList(C19301m.a(skus, 10));
        for (Sku productId : skus) {
            arrayList.add(productId.getProductId());
        }
        return (List) arrayList;
    }

    @NotNull
    public final List<String> getDiscountProductIds() {
        Product product = this.discount;
        if (product != null) {
            List skus = product.getSkus();
            if (skus != null) {
                Iterable<Sku> iterable = skus;
                Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
                for (Sku productId : iterable) {
                    arrayList.add(productId.getProductId());
                }
                return (List) arrayList;
            }
        }
        return C19301m.a();
    }
}
