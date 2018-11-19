package com.tinder.tinderplus.p428a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderApiClient;
import com.tinder.common.p077b.C2641a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.etl.event.ph;
import com.tinder.etl.event.pi;
import com.tinder.etl.event.pn;
import com.tinder.managers.bk;
import com.tinder.model.DiscountPaywallViewResponse;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.C14510e.C14509b;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.logging.C14522a;
import com.tinder.purchase.p371a.C14480k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import rx.Completable;

/* renamed from: com.tinder.tinderplus.a.e */
public class C15192e {
    /* renamed from: a */
    private final TinderApiClient f47244a;
    /* renamed from: b */
    private final bk f47245b;
    /* renamed from: c */
    private final C15193i f47246c;
    /* renamed from: d */
    private final C2630h f47247d;
    /* renamed from: e */
    private final OfferRepository f47248e;
    /* renamed from: f */
    private final C14480k f47249f;
    /* renamed from: g */
    private final C14522a f47250g;
    /* renamed from: h */
    private final AbTestUtility f47251h;

    @Inject
    public C15192e(TinderApiClient tinderApiClient, C15193i c15193i, bk bkVar, C2630h c2630h, OfferRepository offerRepository, C14522a c14522a, C14480k c14480k, AbTestUtility abTestUtility) {
        this.f47244a = tinderApiClient;
        this.f47245b = bkVar;
        this.f47246c = c15193i;
        this.f47247d = c2630h;
        this.f47248e = offerRepository;
        this.f47250g = c14522a;
        this.f47249f = c14480k;
        this.f47251h = abTestUtility;
    }

    /* renamed from: a */
    public boolean m57114a() {
        boolean z = false;
        if (!this.f47251h.isDiscountingEnabled()) {
            return false;
        }
        C14509b a = m57111a(this.f47248e.getOffers(ProductType.PLUS));
        if (a != null && a.mo11861b().intValue() > 0 && a.mo11866g() == null && a.mo11867h() == null) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public Completable m57115b() {
        List offers = this.f47248e.getOffers(ProductType.PLUS);
        if (offers.isEmpty()) {
            return Completable.a(new IllegalStateException("No offer"));
        }
        String toLowerCase = ((C14510e) offers.get(0)).mo11840b().name().toLowerCase();
        Map hashMap = new HashMap();
        hashMap.put(ManagerWebServices.PARAM_PRODUCT_TYPE, toLowerCase);
        return this.f47244a.discountPaywallViewed(hashMap).b(new C18964f(this)).a(new C18965g(this)).b();
    }

    /* renamed from: a */
    final /* synthetic */ void m57112a(DiscountPaywallViewResponse discountPaywallViewResponse) {
        this.f47249f.m55317a(discountPaywallViewResponse.getExpiresAt(), discountPaywallViewResponse.getViewedAt());
    }

    /* renamed from: a */
    final /* synthetic */ void m57113a(Throwable th) {
        this.f47250g.m55478a(new RuntimeException("Issue viewing discount paywall", th));
    }

    /* renamed from: c */
    public void m57116c() {
        if (this.f47246c.m57125e()) {
            if (!this.f47246c.m57121a()) {
                if (m57114a()) {
                    this.f47247d.a(ph.a().a());
                } else if (this.f47246c.m57126f()) {
                    this.f47247d.a(pi.a().a());
                } else {
                    this.f47247d.a(pn.a().a());
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m57117d() {
        if (!this.f47251h.isDiscountingEnabled()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean e = this.f47246c.m57125e();
        if (this.f47246c.m57121a()) {
            return false;
        }
        C14509b a = m57111a(this.f47248e.getOffers(ProductType.PLUS));
        if (a == null || !e || a.mo11867h() == null || currentTimeMillis >= a.mo11867h().longValue() || a.mo11861b().intValue() <= 0) {
            return m57114a();
        }
        return true;
    }

    @Nullable
    /* renamed from: a */
    public C14509b m57111a(@NonNull List<C14510e> list) {
        if (C2641a.a(list)) {
            return null;
        }
        for (C14510e c14510e : list) {
            if (c14510e.mo11846h() && c14510e.mo11845g() != null) {
                return c14510e.mo11845g();
            }
        }
        return null;
    }

    /* renamed from: e */
    public boolean m57118e() {
        C14509b a = m57111a(this.f47248e.getOffers(ProductType.PLUS));
        boolean z = false;
        if (a != null) {
            if (!this.f47246c.m57121a()) {
                if (a.mo11867h() != null) {
                    if (a.mo11867h().longValue() != 0) {
                        long longValue = a.mo11867h().longValue() - 3600000;
                        long currentTimeMillis = System.currentTimeMillis();
                        Object obj = (currentTimeMillis < longValue || currentTimeMillis > a.mo11867h().longValue()) ? null : 1;
                        if (!(this.f47245b.T() || obj == null)) {
                            z = true;
                        }
                        if (z) {
                            this.f47245b.y(true);
                        }
                        return z;
                    }
                }
                return false;
            }
        }
        this.f47245b.y(false);
        return false;
    }
}
