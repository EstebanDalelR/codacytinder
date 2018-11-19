package com.tinder.api.model.meta;

import com.squareup.moshi.Json;
import com.tinder.api.model.meta.Meta.ClientResources;
import com.tinder.api.model.meta.Meta.ClientResources.RateCard;
import java.util.List;

/* renamed from: com.tinder.api.model.meta.$AutoValue_Meta_ClientResources */
abstract class C$AutoValue_Meta_ClientResources extends ClientResources {
    private final List<String> plusScreen;
    private final RateCard rateCard;

    C$AutoValue_Meta_ClientResources(RateCard rateCard, List<String> list) {
        if (rateCard == null) {
            throw new NullPointerException("Null rateCard");
        }
        this.rateCard = rateCard;
        if (list == null) {
            throw new NullPointerException("Null plusScreen");
        }
        this.plusScreen = list;
    }

    @Json(name = "rate_card")
    public RateCard rateCard() {
        return this.rateCard;
    }

    @Json(name = "plus_screen")
    public List<String> plusScreen() {
        return this.plusScreen;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ClientResources{rateCard=");
        stringBuilder.append(this.rateCard);
        stringBuilder.append(", plusScreen=");
        stringBuilder.append(this.plusScreen);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientResources)) {
            return false;
        }
        ClientResources clientResources = (ClientResources) obj;
        if (!this.rateCard.equals(clientResources.rateCard()) || this.plusScreen.equals(clientResources.plusScreen()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.rateCard.hashCode() ^ 1000003) * 1000003) ^ this.plusScreen.hashCode();
    }
}
