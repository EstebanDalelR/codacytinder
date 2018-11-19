package com.tinder.interactors.p262a;

import com.tinder.api.model.meta.Meta.ClientResources;
import com.tinder.api.model.meta.Meta.ClientResources.RateCard;
import com.tinder.api.model.meta.Meta.ClientResources.RateCard.Carousel;
import com.tinder.model.ClientConfig;
import com.tinder.model.RateCardConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tinder.interactors.a.a */
public class C9708a {
    /* renamed from: a */
    public ClientConfig m40180a(ClientResources clientResources) {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.setRateCard(m40181a(clientResources.rateCard()));
        clientConfig.setTPlusScreenConfig(clientResources.plusScreen());
        return clientConfig;
    }

    /* renamed from: a */
    public RateCardConfig m40181a(RateCard rateCard) {
        RateCardConfig rateCardConfig = new RateCardConfig();
        List arrayList = new ArrayList();
        for (Carousel slug : rateCard.carousel()) {
            arrayList.add(slug.slug());
        }
        rateCardConfig.carousel = arrayList;
        return rateCardConfig;
    }
}
