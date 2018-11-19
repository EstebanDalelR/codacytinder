package com.tinder.purchase.domain.model;

import com.tinder.domain.common.model.TimeInterval;
import com.tinder.domain.profile.model.Product;
import com.tinder.domain.profile.model.Sku;
import com.tinder.purchase.domain.exception.OfferException.CannotGetPriceFromSkuException;
import com.tinder.purchase.domain.model.C14510e.C14509b;
import com.tinder.purchase.domain.model.p375a.C14504c;
import com.tinder.purchase.domain.model.p375a.C14504c.C16221a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C15807n;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¨\u0006\u0012"}, d2 = {"Lcom/tinder/purchase/domain/model/OfferFactory;", "", "()V", "createBaseAmount", "", "baseRegularSku", "Lcom/tinder/domain/profile/model/Sku;", "createDiscount", "Lcom/tinder/purchase/domain/model/Offer$Discount;", "productInfo", "Lcom/tinder/purchase/domain/model/adapter/ProductInfo;", "createOffer", "Lcom/tinder/purchase/domain/model/Offer;", "getConsumableAmount", "sku", "(Lcom/tinder/domain/profile/model/Sku;)Ljava/lang/Integer;", "getSubscriptionLength", "Lcom/tinder/domain/common/model/TimeInterval;", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.domain.model.f */
public final class C14511f {
    @NotNull
    /* renamed from: a */
    public final C14510e m55429a(@NotNull C14504c c14504c) {
        C2668g.b(c14504c, "productInfo");
        C14516k a = c14504c.m55376a();
        Sku b = c14504c.m55377b();
        Sku c = c14504c.m55378c();
        C14514j a2 = a.m55437a(b.getProductId());
        if (a2 != null) {
            C14514j a3 = a.m55437a(c.getProductId());
            if (a3 != null) {
                c14504c = C14510e.m55413l().mo11833a(b.getProductId()).mo11828a(b.getProductType()).mo11829a(b.getPurchaseType()).mo11827a(m55426b(b)).mo11832a(m55428c(b)).mo11830a(m55427b(c14504c)).mo11838b(b.isPrimary()).mo11834a(b.isBaseGroup()).mo11831a(a2).mo11836b(a3).mo11837b(Integer.valueOf(m55425a(c))).mo11835a();
                C2668g.a(c14504c, "Offer.builder()\n        …\n                .build()");
                return c14504c;
            }
            throw ((Throwable) new CannotGetPriceFromSkuException(C15807n.m59826a(c.getProductId())));
        }
        throw ((Throwable) new CannotGetPriceFromSkuException(C15807n.m59826a(b.getProductId())));
    }

    /* renamed from: a */
    private final int m55425a(Sku sku) {
        switch (C14512g.f45892a[sku.getPurchaseType().ordinal()]) {
            case 1:
                return sku.getAmount();
            case 2:
                return sku.getTerms();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    private final C14509b m55427b(C14504c c14504c) {
        if (!(c14504c instanceof C16221a)) {
            return null;
        }
        C14516k a = c14504c.m55376a();
        C16221a c16221a = (C16221a) c14504c;
        Product d = c16221a.m61223d();
        Sku e = c16221a.m61224e();
        c14504c = c16221a.m61225f();
        int discountPercentage = e.getDiscountPercentage();
        C14514j a2 = a.m55437a(e.getProductId());
        if (a2 != null) {
            C14514j a3 = a.m55437a(c14504c.getProductId());
            if (a3 != null) {
                return C14509b.m55402j().mo11858b(d.getCampaign()).mo11859c(d.getCampaignVariantName()).mo11857b(d.getExpiresAt()).mo11852a(d.getViewedAt()).mo11853a(e.getProductId()).mo11851a(Integer.valueOf(discountPercentage)).mo11850a(a2).mo11856b(a3).mo11854a(e.isIntroPricing()).mo11855a();
            }
            throw new CannotGetPriceFromSkuException(C15807n.m59826a(c14504c.getProductId()));
        }
        throw ((Throwable) new CannotGetPriceFromSkuException(C15807n.m59826a(e.getProductId())));
    }

    /* renamed from: b */
    private final TimeInterval m55426b(Sku sku) {
        if (C14512g.f45893b[sku.getPurchaseType().ordinal()] != 1) {
            return null;
        }
        return TimeInterval.create(sku.getTerms(), C14513h.f45895a);
    }

    /* renamed from: c */
    private final Integer m55428c(Sku sku) {
        if (C14512g.f45894c[sku.getPurchaseType().ordinal()] != 1) {
            return null;
        }
        return Integer.valueOf(sku.getAmount());
    }
}
