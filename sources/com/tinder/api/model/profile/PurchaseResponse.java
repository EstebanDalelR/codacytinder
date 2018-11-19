package com.tinder.api.model.profile;

import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ,\u0010\u000f\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tinder/api/model/profile/PurchaseResponse;", "", "purchases", "", "Lcom/tinder/api/model/profile/Purchase;", "subscriptionExpired", "", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getPurchases", "()Ljava/util/List;", "getSubscriptionExpired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/tinder/api/model/profile/PurchaseResponse;", "equals", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class PurchaseResponse {
    @Nullable
    private final List<Purchase> purchases;
    @Nullable
    private final Boolean subscriptionExpired;

    @NotNull
    public static /* synthetic */ PurchaseResponse copy$default(PurchaseResponse purchaseResponse, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = purchaseResponse.purchases;
        }
        if ((i & 2) != 0) {
            bool = purchaseResponse.subscriptionExpired;
        }
        return purchaseResponse.copy(list, bool);
    }

    @Nullable
    public final List<Purchase> component1() {
        return this.purchases;
    }

    @Nullable
    public final Boolean component2() {
        return this.subscriptionExpired;
    }

    @NotNull
    public final PurchaseResponse copy(@Nullable @Json(name = "purchases") List<? extends Purchase> list, @Nullable @Json(name = "subscription_expired") Boolean bool) {
        return new PurchaseResponse(list, bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PurchaseResponse) {
                PurchaseResponse purchaseResponse = (PurchaseResponse) obj;
                if (C2668g.a(this.purchases, purchaseResponse.purchases) && C2668g.a(this.subscriptionExpired, purchaseResponse.subscriptionExpired)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.purchases;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Boolean bool = this.subscriptionExpired;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PurchaseResponse(purchases=");
        stringBuilder.append(this.purchases);
        stringBuilder.append(", subscriptionExpired=");
        stringBuilder.append(this.subscriptionExpired);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PurchaseResponse(@Nullable @Json(name = "purchases") List<? extends Purchase> list, @Nullable @Json(name = "subscription_expired") Boolean bool) {
        this.purchases = list;
        this.subscriptionExpired = bool;
    }

    @Nullable
    public final List<Purchase> getPurchases() {
        return this.purchases;
    }

    @Nullable
    public final Boolean getSubscriptionExpired() {
        return this.subscriptionExpired;
    }
}
