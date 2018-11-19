package com.tinder.api.model.meta;

import com.tinder.api.model.meta.Meta.ClientResources.RateCard.Carousel;

/* renamed from: com.tinder.api.model.meta.$AutoValue_Meta_ClientResources_RateCard_Carousel */
abstract class C$AutoValue_Meta_ClientResources_RateCard_Carousel extends Carousel {
    private final String slug;

    C$AutoValue_Meta_ClientResources_RateCard_Carousel(String str) {
        if (str == null) {
            throw new NullPointerException("Null slug");
        }
        this.slug = str;
    }

    public String slug() {
        return this.slug;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Carousel{slug=");
        stringBuilder.append(this.slug);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Carousel)) {
            return null;
        }
        return this.slug.equals(((Carousel) obj).slug());
    }

    public int hashCode() {
        return this.slug.hashCode() ^ 1000003;
    }
}
