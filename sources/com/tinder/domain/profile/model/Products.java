package com.tinder.domain.profile.model;

import java.util.List;
import java.util.Map;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C19301m;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010J\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0013J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, d2 = {"Lcom/tinder/domain/profile/model/Products;", "", "plus", "Lcom/tinder/domain/profile/model/Variant;", "superlike", "boost", "gold", "topPicks", "(Lcom/tinder/domain/profile/model/Variant;Lcom/tinder/domain/profile/model/Variant;Lcom/tinder/domain/profile/model/Variant;Lcom/tinder/domain/profile/model/Variant;Lcom/tinder/domain/profile/model/Variant;)V", "getBoost", "()Lcom/tinder/domain/profile/model/Variant;", "getGold", "getPlus", "getSuperlike", "getTopPicks", "asMap", "", "Lcom/tinder/domain/profile/model/ProductType;", "asVariantList", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class Products {
    @Nullable
    private final Variant boost;
    @Nullable
    private final Variant gold;
    @Nullable
    private final Variant plus;
    @Nullable
    private final Variant superlike;
    @Nullable
    private final Variant topPicks;

    @NotNull
    public static /* synthetic */ Products copy$default(Products products, Variant variant, Variant variant2, Variant variant3, Variant variant4, Variant variant5, int i, Object obj) {
        if ((i & 1) != 0) {
            variant = products.plus;
        }
        if ((i & 2) != 0) {
            variant2 = products.superlike;
        }
        Variant variant6 = variant2;
        if ((i & 4) != 0) {
            variant3 = products.boost;
        }
        Variant variant7 = variant3;
        if ((i & 8) != 0) {
            variant4 = products.gold;
        }
        Variant variant8 = variant4;
        if ((i & 16) != 0) {
            variant5 = products.topPicks;
        }
        return products.copy(variant, variant6, variant7, variant8, variant5);
    }

    @Nullable
    public final Variant component1() {
        return this.plus;
    }

    @Nullable
    public final Variant component2() {
        return this.superlike;
    }

    @Nullable
    public final Variant component3() {
        return this.boost;
    }

    @Nullable
    public final Variant component4() {
        return this.gold;
    }

    @Nullable
    public final Variant component5() {
        return this.topPicks;
    }

    @NotNull
    public final Products copy(@Nullable Variant variant, @Nullable Variant variant2, @Nullable Variant variant3, @Nullable Variant variant4, @Nullable Variant variant5) {
        return new Products(variant, variant2, variant3, variant4, variant5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Products) {
                Products products = (Products) obj;
                if (C2668g.a(this.plus, products.plus) && C2668g.a(this.superlike, products.superlike) && C2668g.a(this.boost, products.boost) && C2668g.a(this.gold, products.gold) && C2668g.a(this.topPicks, products.topPicks)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Variant variant = this.plus;
        int i = 0;
        int hashCode = (variant != null ? variant.hashCode() : 0) * 31;
        Variant variant2 = this.superlike;
        hashCode = (hashCode + (variant2 != null ? variant2.hashCode() : 0)) * 31;
        variant2 = this.boost;
        hashCode = (hashCode + (variant2 != null ? variant2.hashCode() : 0)) * 31;
        variant2 = this.gold;
        hashCode = (hashCode + (variant2 != null ? variant2.hashCode() : 0)) * 31;
        variant2 = this.topPicks;
        if (variant2 != null) {
            i = variant2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Products(plus=");
        stringBuilder.append(this.plus);
        stringBuilder.append(", superlike=");
        stringBuilder.append(this.superlike);
        stringBuilder.append(", boost=");
        stringBuilder.append(this.boost);
        stringBuilder.append(", gold=");
        stringBuilder.append(this.gold);
        stringBuilder.append(", topPicks=");
        stringBuilder.append(this.topPicks);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Products(@Nullable Variant variant, @Nullable Variant variant2, @Nullable Variant variant3, @Nullable Variant variant4, @Nullable Variant variant5) {
        this.plus = variant;
        this.superlike = variant2;
        this.boost = variant3;
        this.gold = variant4;
        this.topPicks = variant5;
    }

    @Nullable
    public final Variant getPlus() {
        return this.plus;
    }

    @Nullable
    public final Variant getSuperlike() {
        return this.superlike;
    }

    @Nullable
    public final Variant getBoost() {
        return this.boost;
    }

    @Nullable
    public final Variant getGold() {
        return this.gold;
    }

    @Nullable
    public final Variant getTopPicks() {
        return this.topPicks;
    }

    @NotNull
    public final Map<ProductType, Variant> asMap() {
        return ae.a(new Pair[]{C15811g.a(ProductType.PLUS, this.plus), C15811g.a(ProductType.GOLD, this.gold), C15811g.a(ProductType.SUPERLIKE, this.superlike), C15811g.a(ProductType.BOOST, this.boost), C15811g.a(ProductType.TOP_PICKS, this.topPicks)});
    }

    @NotNull
    public final List<Variant> asVariantList() {
        return C19301m.l(asMap().values());
    }
}
