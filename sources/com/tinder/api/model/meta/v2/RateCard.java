package com.tinder.api.model.meta.v2;

import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tinder/api/model/meta/v2/RateCard;", "", "carousel", "", "Lcom/tinder/api/model/meta/v2/Slug;", "(Ljava/util/List;)V", "getCarousel", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class RateCard {
    @Nullable
    private final List<Slug> carousel;

    @NotNull
    public static /* synthetic */ RateCard copy$default(RateCard rateCard, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rateCard.carousel;
        }
        return rateCard.copy(list);
    }

    @Nullable
    public final List<Slug> component1() {
        return this.carousel;
    }

    @NotNull
    public final RateCard copy(@Nullable @Json(name = "carousel") List<Slug> list) {
        return new RateCard(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RateCard) {
                if (C2668g.a(this.carousel, ((RateCard) obj).carousel)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.carousel;
        return list != null ? list.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RateCard(carousel=");
        stringBuilder.append(this.carousel);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public RateCard(@Nullable @Json(name = "carousel") List<Slug> list) {
        this.carousel = list;
    }

    @Nullable
    public final List<Slug> getCarousel() {
        return this.carousel;
    }
}
