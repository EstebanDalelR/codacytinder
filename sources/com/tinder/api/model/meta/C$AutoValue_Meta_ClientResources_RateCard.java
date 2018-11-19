package com.tinder.api.model.meta;

import com.tinder.api.model.meta.Meta.ClientResources.RateCard;
import com.tinder.api.model.meta.Meta.ClientResources.RateCard.Carousel;
import java.util.List;

/* renamed from: com.tinder.api.model.meta.$AutoValue_Meta_ClientResources_RateCard */
abstract class C$AutoValue_Meta_ClientResources_RateCard extends RateCard {
    private final List<Carousel> carousel;

    C$AutoValue_Meta_ClientResources_RateCard(List<Carousel> list) {
        if (list == null) {
            throw new NullPointerException("Null carousel");
        }
        this.carousel = list;
    }

    public List<Carousel> carousel() {
        return this.carousel;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RateCard{carousel=");
        stringBuilder.append(this.carousel);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RateCard)) {
            return null;
        }
        return this.carousel.equals(((RateCard) obj).carousel());
    }

    public int hashCode() {
        return this.carousel.hashCode() ^ 1000003;
    }
}
