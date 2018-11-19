package com.tinder.api.model.meta.v2;

import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/api/model/meta/v2/ClientResources;", "", "rateCard", "Lcom/tinder/api/model/meta/v2/RateCard;", "plusScreen", "", "", "(Lcom/tinder/api/model/meta/v2/RateCard;Ljava/util/List;)V", "getPlusScreen", "()Ljava/util/List;", "getRateCard", "()Lcom/tinder/api/model/meta/v2/RateCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ClientResources {
    @Nullable
    private final List<String> plusScreen;
    @Nullable
    private final RateCard rateCard;

    @NotNull
    public static /* synthetic */ ClientResources copy$default(ClientResources clientResources, RateCard rateCard, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            rateCard = clientResources.rateCard;
        }
        if ((i & 2) != 0) {
            list = clientResources.plusScreen;
        }
        return clientResources.copy(rateCard, list);
    }

    @Nullable
    public final RateCard component1() {
        return this.rateCard;
    }

    @Nullable
    public final List<String> component2() {
        return this.plusScreen;
    }

    @NotNull
    public final ClientResources copy(@Nullable @Json(name = "rate_card") RateCard rateCard, @Nullable @Json(name = "plus_screen") List<String> list) {
        return new ClientResources(rateCard, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClientResources) {
                ClientResources clientResources = (ClientResources) obj;
                if (C2668g.a(this.rateCard, clientResources.rateCard) && C2668g.a(this.plusScreen, clientResources.plusScreen)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        RateCard rateCard = this.rateCard;
        int i = 0;
        int hashCode = (rateCard != null ? rateCard.hashCode() : 0) * 31;
        List list = this.plusScreen;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ClientResources(rateCard=");
        stringBuilder.append(this.rateCard);
        stringBuilder.append(", plusScreen=");
        stringBuilder.append(this.plusScreen);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ClientResources(@Nullable @Json(name = "rate_card") RateCard rateCard, @Nullable @Json(name = "plus_screen") List<String> list) {
        this.rateCard = rateCard;
        this.plusScreen = list;
    }

    @Nullable
    public final RateCard getRateCard() {
        return this.rateCard;
    }

    @Nullable
    public final List<String> getPlusScreen() {
        return this.plusScreen;
    }
}
