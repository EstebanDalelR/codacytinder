package com.tinder.purchase.model;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/purchase/model/PurchaseInfo;", "", "purchaseState", "", "(I)V", "getPurchaseState", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "purchase_release"}, k = 1, mv = {1, 1, 10})
final class PurchaseInfo {
    /* renamed from: a */
    private final int f45922a;

    @NotNull
    public final PurchaseInfo copy(@Json(name = "purchaseState") int i) {
        return new PurchaseInfo(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PurchaseInfo) {
            if ((this.f45922a == ((PurchaseInfo) obj).f45922a ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f45922a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PurchaseInfo(purchaseState=");
        stringBuilder.append(this.f45922a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PurchaseInfo(@Json(name = "purchaseState") int i) {
        this.f45922a = i;
    }

    /* renamed from: a */
    public final int m55480a() {
        return this.f45922a;
    }
}
