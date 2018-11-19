package com.tinder.domain.profile.model;

import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JN\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010¨\u0006\""}, d2 = {"Lcom/tinder/domain/profile/model/Product;", "", "skus", "", "Lcom/tinder/domain/profile/model/Sku;", "viewedAt", "", "expiresAt", "campaignVariantName", "", "campaign", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getCampaign", "()Ljava/lang/String;", "getCampaignVariantName", "getExpiresAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSkus", "()Ljava/util/List;", "getViewedAt", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/tinder/domain/profile/model/Product;", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class Product {
    @Nullable
    private final String campaign;
    @Nullable
    private final String campaignVariantName;
    @Nullable
    private final Long expiresAt;
    @NotNull
    private final List<Sku> skus;
    @Nullable
    private final Long viewedAt;

    @NotNull
    public static /* synthetic */ Product copy$default(Product product, List list, Long l, Long l2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = product.skus;
        }
        if ((i & 2) != 0) {
            l = product.viewedAt;
        }
        Long l3 = l;
        if ((i & 4) != 0) {
            l2 = product.expiresAt;
        }
        Long l4 = l2;
        if ((i & 8) != 0) {
            str = product.campaignVariantName;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = product.campaign;
        }
        return product.copy(list, l3, l4, str3, str2);
    }

    @NotNull
    public final List<Sku> component1() {
        return this.skus;
    }

    @Nullable
    public final Long component2() {
        return this.viewedAt;
    }

    @Nullable
    public final Long component3() {
        return this.expiresAt;
    }

    @Nullable
    public final String component4() {
        return this.campaignVariantName;
    }

    @Nullable
    public final String component5() {
        return this.campaign;
    }

    @NotNull
    public final Product copy(@NotNull List<Sku> list, @Nullable Long l, @Nullable Long l2, @Nullable String str, @Nullable String str2) {
        C2668g.b(list, ManagerWebServices.PARAM_SKUS);
        return new Product(list, l, l2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Product) {
                Product product = (Product) obj;
                if (C2668g.a(this.skus, product.skus) && C2668g.a(this.viewedAt, product.viewedAt) && C2668g.a(this.expiresAt, product.expiresAt) && C2668g.a(this.campaignVariantName, product.campaignVariantName) && C2668g.a(this.campaign, product.campaign)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.skus;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Long l = this.viewedAt;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.expiresAt;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.campaignVariantName;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.campaign;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Product(skus=");
        stringBuilder.append(this.skus);
        stringBuilder.append(", viewedAt=");
        stringBuilder.append(this.viewedAt);
        stringBuilder.append(", expiresAt=");
        stringBuilder.append(this.expiresAt);
        stringBuilder.append(", campaignVariantName=");
        stringBuilder.append(this.campaignVariantName);
        stringBuilder.append(", campaign=");
        stringBuilder.append(this.campaign);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Product(@NotNull List<Sku> list, @Nullable Long l, @Nullable Long l2, @Nullable String str, @Nullable String str2) {
        C2668g.b(list, ManagerWebServices.PARAM_SKUS);
        this.skus = list;
        this.viewedAt = l;
        this.expiresAt = l2;
        this.campaignVariantName = str;
        this.campaign = str2;
    }

    @NotNull
    public final List<Sku> getSkus() {
        return this.skus;
    }

    @Nullable
    public final Long getViewedAt() {
        return this.viewedAt;
    }

    @Nullable
    public final Long getExpiresAt() {
        return this.expiresAt;
    }

    @Nullable
    public final String getCampaignVariantName() {
        return this.campaignVariantName;
    }

    @Nullable
    public final String getCampaign() {
        return this.campaign;
    }
}
