package com.tinder.purchase.p371a;

import com.tinder.domain.profile.model.ProductType;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.logging.C14522a;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;
import rx.functions.Action1;

@Singleton
/* renamed from: com.tinder.purchase.a.k */
public class C14480k {
    /* renamed from: a */
    private static final String f45864a = "com.tinder.purchase.a.k";
    /* renamed from: b */
    private final OfferRepository f45865b;
    /* renamed from: c */
    private final C14522a f45866c;

    @Inject
    public C14480k(OfferRepository offerRepository, C14522a c14522a) {
        this.f45865b = offerRepository;
        this.f45866c = c14522a;
    }

    /* renamed from: a */
    public void m55317a(long j, long j2) {
        j = Observable.a(this.f45865b.getOffers(ProductType.PLUS)).k(new C17800l(j, j2)).v();
        Action1 c18616m = new C18616m(this);
        j2 = this.f45866c;
        j2.getClass();
        j.a(c18616m, C18617n.m67069a(j2));
    }

    /* renamed from: a */
    final /* synthetic */ void m55318a(List list) {
        this.f45865b.setOffers(ProductType.PLUS, list);
    }
}
