package com.tinder.purchase.domain.repository;

import com.tinder.domain.profile.model.ProductType;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.C14510e.C14509b;
import io.reactivex.annotations.NonNull;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.subjects.C19785a;

/* renamed from: com.tinder.purchase.domain.repository.a */
public class C16229a implements OfferRepository {
    /* renamed from: a */
    private final C19785a<Map<ProductType, Collection<C14510e>>> f50559a = C19785a.f(new HashMap());

    public Observable<Void> observeOfferUpdates() {
        return this.f50559a.b(1).g().k(C17822b.f55635a).e();
    }

    public Observable<List<C14510e>> observeOffers(@NonNull ProductType productType) {
        return this.f50559a.f(new C17823c(productType)).k(new C17825f(productType));
    }

    public Observable<List<C14510e>> observeAllOffers() {
        return this.f50559a.k(C17826g.f55639a);
    }

    @Nullable
    public C14510e getOffer(@NonNull String str) {
        return (C14510e) observeAllOffers().h().h(C17827h.f55640a).f(new C17828i(str)).u().a(null);
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m61272a(@NonNull String str, C14510e c14510e) {
        C14509b g = c14510e.mo11845g();
        boolean z = false;
        boolean equals = (g == null || g.mo11861b().intValue() <= 0) ? false : g.mo11860a().equals(str);
        if (equals || c14510e.mo11839a().equals(str) != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @NonNull
    public List<C14510e> getOffers(@NonNull ProductType productType) {
        return (List) observeAllOffers().h().h(C17829j.f55642a).f(new C17830k(productType)).v().u().a(Collections.emptyList());
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m61271a(@NonNull ProductType productType, C14510e c14510e) {
        return Boolean.valueOf(c14510e.mo11840b() == productType ? true : null);
    }

    @NonNull
    public Map<ProductType, Collection<C14510e>> getOffersMap() {
        return (Map) this.f50559a.u().a();
    }

    public void setAllOffers(List<C14510e> list) {
        list = Observable.a(list).t(C17831l.f55644a).a(C18623m.f58059a);
        C19785a c19785a = this.f50559a;
        c19785a.getClass();
        list.d(C18622d.m67074a(c19785a));
    }

    public void setOffers(@NonNull ProductType productType, @NonNull List<C14510e> list) {
        Map hashMap = new HashMap((Map) this.f50559a.A());
        hashMap.put(productType, list);
        this.f50559a.onNext(hashMap);
    }
}
