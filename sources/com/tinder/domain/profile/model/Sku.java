package com.tinder.domain.profile.model;

import com.tinder.domain.config.model.ProfileEditingConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \b\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\u0013\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\rHÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u0006-"}, d2 = {"Lcom/tinder/domain/profile/model/Sku;", "", "productType", "Lcom/tinder/domain/profile/model/ProductType;", "purchaseType", "Lcom/tinder/domain/profile/model/PurchaseType;", "productId", "", "isBaseGroup", "", "isPrimary", "originalProductId", "amount", "", "terms", "discountPercentage", "isIntroPricing", "(Lcom/tinder/domain/profile/model/ProductType;Lcom/tinder/domain/profile/model/PurchaseType;Ljava/lang/String;ZZLjava/lang/String;IIIZ)V", "getAmount", "()I", "getDiscountPercentage", "()Z", "getOriginalProductId", "()Ljava/lang/String;", "getProductId", "getProductType", "()Lcom/tinder/domain/profile/model/ProductType;", "getPurchaseType", "()Lcom/tinder/domain/profile/model/PurchaseType;", "getTerms", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class Sku {
    private final int amount;
    private final int discountPercentage;
    private final boolean isBaseGroup;
    private final boolean isIntroPricing;
    private final boolean isPrimary;
    @NotNull
    private final String originalProductId;
    @NotNull
    private final String productId;
    @NotNull
    private final ProductType productType;
    @NotNull
    private final PurchaseType purchaseType;
    private final int terms;

    @NotNull
    public static /* synthetic */ Sku copy$default(Sku sku, ProductType productType, PurchaseType purchaseType, String str, boolean z, boolean z2, String str2, int i, int i2, int i3, boolean z3, int i4, Object obj) {
        Sku sku2 = sku;
        int i5 = i4;
        return sku2.copy((i5 & 1) != 0 ? sku2.productType : productType, (i5 & 2) != 0 ? sku2.purchaseType : purchaseType, (i5 & 4) != 0 ? sku2.productId : str, (i5 & 8) != 0 ? sku2.isBaseGroup : z, (i5 & 16) != 0 ? sku2.isPrimary : z2, (i5 & 32) != 0 ? sku2.originalProductId : str2, (i5 & 64) != 0 ? sku2.amount : i, (i5 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? sku2.terms : i2, (i5 & 256) != 0 ? sku2.discountPercentage : i3, (i5 & 512) != 0 ? sku2.isIntroPricing : z3);
    }

    @NotNull
    public final ProductType component1() {
        return this.productType;
    }

    public final boolean component10() {
        return this.isIntroPricing;
    }

    @NotNull
    public final PurchaseType component2() {
        return this.purchaseType;
    }

    @NotNull
    public final String component3() {
        return this.productId;
    }

    public final boolean component4() {
        return this.isBaseGroup;
    }

    public final boolean component5() {
        return this.isPrimary;
    }

    @NotNull
    public final String component6() {
        return this.originalProductId;
    }

    public final int component7() {
        return this.amount;
    }

    public final int component8() {
        return this.terms;
    }

    public final int component9() {
        return this.discountPercentage;
    }

    @NotNull
    public final Sku copy(@NotNull ProductType productType, @NotNull PurchaseType purchaseType, @NotNull String str, boolean z, boolean z2, @NotNull String str2, int i, int i2, int i3, boolean z3) {
        ProductType productType2 = productType;
        C2668g.b(productType2, "productType");
        PurchaseType purchaseType2 = purchaseType;
        C2668g.b(purchaseType2, "purchaseType");
        String str3 = str;
        C2668g.b(str3, "productId");
        String str4 = str2;
        C2668g.b(str4, "originalProductId");
        return new Sku(productType2, purchaseType2, str3, z, z2, str4, i, i2, i3, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Sku) {
            Sku sku = (Sku) obj;
            if (C2668g.a(this.productType, sku.productType) && C2668g.a(this.purchaseType, sku.purchaseType) && C2668g.a(this.productId, sku.productId)) {
                if ((this.isBaseGroup == sku.isBaseGroup ? 1 : null) != null) {
                    if ((this.isPrimary == sku.isPrimary ? 1 : null) != null && C2668g.a(this.originalProductId, sku.originalProductId)) {
                        if ((this.amount == sku.amount ? 1 : null) != null) {
                            if ((this.terms == sku.terms ? 1 : null) != null) {
                                if ((this.discountPercentage == sku.discountPercentage ? 1 : null) != null) {
                                    if ((this.isIntroPricing == sku.isIntroPricing ? 1 : null) != null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        ProductType productType = this.productType;
        int i = 0;
        int hashCode = (productType != null ? productType.hashCode() : 0) * 31;
        PurchaseType purchaseType = this.purchaseType;
        hashCode = (hashCode + (purchaseType != null ? purchaseType.hashCode() : 0)) * 31;
        String str = this.productId;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        int i2 = this.isBaseGroup;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.isPrimary;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        str = this.originalProductId;
        if (str != null) {
            i = str.hashCode();
        }
        hashCode = (((((((hashCode + i) * 31) + this.amount) * 31) + this.terms) * 31) + this.discountPercentage) * 31;
        i = this.isIntroPricing;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sku(productType=");
        stringBuilder.append(this.productType);
        stringBuilder.append(", purchaseType=");
        stringBuilder.append(this.purchaseType);
        stringBuilder.append(", productId=");
        stringBuilder.append(this.productId);
        stringBuilder.append(", isBaseGroup=");
        stringBuilder.append(this.isBaseGroup);
        stringBuilder.append(", isPrimary=");
        stringBuilder.append(this.isPrimary);
        stringBuilder.append(", originalProductId=");
        stringBuilder.append(this.originalProductId);
        stringBuilder.append(", amount=");
        stringBuilder.append(this.amount);
        stringBuilder.append(", terms=");
        stringBuilder.append(this.terms);
        stringBuilder.append(", discountPercentage=");
        stringBuilder.append(this.discountPercentage);
        stringBuilder.append(", isIntroPricing=");
        stringBuilder.append(this.isIntroPricing);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Sku(@NotNull ProductType productType, @NotNull PurchaseType purchaseType, @NotNull String str, boolean z, boolean z2, @NotNull String str2, int i, int i2, int i3, boolean z3) {
        C2668g.b(productType, "productType");
        C2668g.b(purchaseType, "purchaseType");
        C2668g.b(str, "productId");
        C2668g.b(str2, "originalProductId");
        this.productType = productType;
        this.purchaseType = purchaseType;
        this.productId = str;
        this.isBaseGroup = z;
        this.isPrimary = z2;
        this.originalProductId = str2;
        this.amount = i;
        this.terms = i2;
        this.discountPercentage = i3;
        this.isIntroPricing = z3;
    }

    @NotNull
    public final ProductType getProductType() {
        return this.productType;
    }

    @NotNull
    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public final boolean isBaseGroup() {
        return this.isBaseGroup;
    }

    public final boolean isPrimary() {
        return this.isPrimary;
    }

    @NotNull
    public final String getOriginalProductId() {
        return this.originalProductId;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final int getTerms() {
        return this.terms;
    }

    public final int getDiscountPercentage() {
        return this.discountPercentage;
    }

    public /* synthetic */ Sku(ProductType productType, PurchaseType purchaseType, String str, boolean z, boolean z2, String str2, int i, int i2, int i3, boolean z3, int i4, C15823e c15823e) {
        int i5 = i4;
        this(productType, purchaseType, str, (i5 & 8) != 0 ? false : z, (i5 & 16) != 0 ? false : z2, (i5 & 32) != 0 ? "" : str2, (i5 & 64) != 0 ? 0 : i, (i5 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? 0 : i2, (i5 & 256) != 0 ? 0 : i3, (i5 & 512) != 0 ? false : z3);
    }

    public final boolean isIntroPricing() {
        return this.isIntroPricing;
    }
}
