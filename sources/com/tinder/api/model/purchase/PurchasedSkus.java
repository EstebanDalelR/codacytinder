package com.tinder.api.model.purchase;

import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tinder/api/model/purchase/PurchasedSkus;", "", "skuInfoList", "", "Lcom/tinder/api/model/purchase/PurchasedSkuInfo;", "(Ljava/util/List;)V", "getSkuInfoList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class PurchasedSkus {
    @NotNull
    private final List<PurchasedSkuInfo> skuInfoList;

    @NotNull
    public static /* synthetic */ PurchasedSkus copy$default(PurchasedSkus purchasedSkus, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = purchasedSkus.skuInfoList;
        }
        return purchasedSkus.copy(list);
    }

    @NotNull
    public final List<PurchasedSkuInfo> component1() {
        return this.skuInfoList;
    }

    @NotNull
    public final PurchasedSkus copy(@NotNull @Json(name = "skus") List<PurchasedSkuInfo> list) {
        C2668g.b(list, "skuInfoList");
        return new PurchasedSkus(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PurchasedSkus) {
                if (C2668g.a(this.skuInfoList, ((PurchasedSkus) obj).skuInfoList)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.skuInfoList;
        return list != null ? list.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PurchasedSkus(skuInfoList=");
        stringBuilder.append(this.skuInfoList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PurchasedSkus(@NotNull @Json(name = "skus") List<PurchasedSkuInfo> list) {
        C2668g.b(list, "skuInfoList");
        this.skuInfoList = list;
    }

    @NotNull
    public final List<PurchasedSkuInfo> getSkuInfoList() {
        return this.skuInfoList;
    }
}
