package com.tinder.purchase.domain.repository;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.purchase.domain.model.C14510e;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import rx.Observable;

public interface OfferRepository {
    @Nullable
    C14510e getOffer(@NonNull String str);

    @NonNull
    List<C14510e> getOffers(@NonNull ProductType productType);

    @NonNull
    Map<ProductType, Collection<C14510e>> getOffersMap();

    Observable<List<C14510e>> observeAllOffers();

    Observable<Void> observeOfferUpdates();

    Observable<List<C14510e>> observeOffers(@NonNull ProductType productType);

    void setAllOffers(@NonNull List<C14510e> list);

    void setOffers(@NonNull ProductType productType, @NonNull List<C14510e> list);
}
