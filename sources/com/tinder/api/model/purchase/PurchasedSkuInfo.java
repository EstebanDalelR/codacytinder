package com.tinder.api.model.purchase;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/api/model/purchase/PurchasedSkuInfo;", "", "productId", "", "purchaseToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "getPurchaseToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class PurchasedSkuInfo {
    @NotNull
    private final String productId;
    @NotNull
    private final String purchaseToken;

    @NotNull
    public static /* synthetic */ PurchasedSkuInfo copy$default(PurchasedSkuInfo purchasedSkuInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchasedSkuInfo.productId;
        }
        if ((i & 2) != 0) {
            str2 = purchasedSkuInfo.purchaseToken;
        }
        return purchasedSkuInfo.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.productId;
    }

    @NotNull
    public final String component2() {
        return this.purchaseToken;
    }

    @NotNull
    public final PurchasedSkuInfo copy(@NotNull @Json(name = "product_id") String str, @NotNull @Json(name = "purchase_token") String str2) {
        C2668g.b(str, "productId");
        C2668g.b(str2, "purchaseToken");
        return new PurchasedSkuInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PurchasedSkuInfo) {
                PurchasedSkuInfo purchasedSkuInfo = (PurchasedSkuInfo) obj;
                if (C2668g.a(this.productId, purchasedSkuInfo.productId) && C2668g.a(this.purchaseToken, purchasedSkuInfo.purchaseToken)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.productId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.purchaseToken;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PurchasedSkuInfo(productId=");
        stringBuilder.append(this.productId);
        stringBuilder.append(", purchaseToken=");
        stringBuilder.append(this.purchaseToken);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PurchasedSkuInfo(@NotNull @Json(name = "product_id") String str, @NotNull @Json(name = "purchase_token") String str2) {
        C2668g.b(str, "productId");
        C2668g.b(str2, "purchaseToken");
        this.productId = str;
        this.purchaseToken = str2;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }
}
