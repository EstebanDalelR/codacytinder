package com.tinder.paywall.viewmodels;

import android.content.res.Resources;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.paywall.C10052b;
import com.tinder.purchase.domain.C14490a;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.C14514j;
import com.tinder.tinderplus.p428a.C15192e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/paywall/viewmodels/PaywallItemViewModelFactory;", "", "offerSavingsCalculator", "Lcom/tinder/paywall/OfferSavingsCalculator;", "paywallItemUiElementsFactory", "Lcom/tinder/paywall/viewmodels/PaywallItemUiElementsFactory;", "discountInteractor", "Lcom/tinder/tinderplus/interactors/TinderPlusDiscountInteractor;", "paywallPriceFormatter", "Lcom/tinder/purchase/domain/PaywallPriceFormatter;", "resources", "Landroid/content/res/Resources;", "(Lcom/tinder/paywall/OfferSavingsCalculator;Lcom/tinder/paywall/viewmodels/PaywallItemUiElementsFactory;Lcom/tinder/tinderplus/interactors/TinderPlusDiscountInteractor;Lcom/tinder/purchase/domain/PaywallPriceFormatter;Landroid/content/res/Resources;)V", "count", "", "type", "Lcom/tinder/domain/profile/model/ProductType;", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "create", "Lcom/tinder/paywall/viewmodels/PaywallItemViewModel;", "color", "Lcom/tinder/paywall/viewmodels/PaywallItemViewModelColor;", "highlightInfo", "", "itemName", "textSize", "unit", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.viewmodels.m */
public final class C10091m {
    /* renamed from: a */
    private final C10052b f33005a;
    /* renamed from: b */
    private final C10089j f33006b;
    /* renamed from: c */
    private final C15192e f33007c;
    /* renamed from: d */
    private final C14490a f33008d;
    /* renamed from: e */
    private final Resources f33009e;

    @Inject
    public C10091m(@NotNull C10052b c10052b, @NotNull C10089j c10089j, @NotNull C15192e c15192e, @NotNull C14490a c14490a, @NotNull Resources resources) {
        C2668g.b(c10052b, "offerSavingsCalculator");
        C2668g.b(c10089j, "paywallItemUiElementsFactory");
        C2668g.b(c15192e, "discountInteractor");
        C2668g.b(c14490a, "paywallPriceFormatter");
        C2668g.b(resources, "resources");
        this.f33005a = c10052b;
        this.f33006b = c10089j;
        this.f33007c = c15192e;
        this.f33008d = c14490a;
        this.f33009e = resources;
    }

    @NotNull
    /* renamed from: a */
    public final C10090l m41260a(@NotNull ProductType productType, @NotNull C14510e c14510e, @NotNull PaywallItemViewModelColor paywallItemViewModelColor) {
        ProductType productType2 = productType;
        C14510e c14510e2 = c14510e;
        PaywallItemViewModelColor paywallItemViewModelColor2 = paywallItemViewModelColor;
        C2668g.b(productType2, "type");
        C2668g.b(c14510e2, "offer");
        C2668g.b(paywallItemViewModelColor2, ManagerWebServices.PARAM_BADGE_COLOR);
        String b = m41259b(productType);
        int a = m41256a(productType, c14510e);
        String a2 = this.f33008d.a(c14510e2, a, b);
        String a3 = m41258a(c14510e2);
        String a4 = m41257a(productType2, a);
        boolean h = c14510e.h();
        int a5 = m41255a(productType);
        C14490a c14490a = this.f33008d;
        C14514j d = c14510e.d();
        C2668g.a(d, "offer.price()");
        String a6 = c14490a.a(d, a, b);
        String a7 = this.f33005a.m41121a(c14510e2);
        C2668g.a(a7, "offerSavingsCalculator.getSavings(offer)");
        boolean d2 = this.f33007c.d();
        C10087i a8 = this.f33006b.m41242a(productType2, c14510e.c(), paywallItemViewModelColor2);
        C2668g.a(a8, "paywallItemUiElementsFac…er.purchaseType(), color)");
        return new C10090l(a, a4, a6, a2, c14510e2, a3, a7, a8, a5, h, d2);
    }

    /* renamed from: a */
    private final int m41256a(ProductType productType, C14510e c14510e) {
        switch (C10092n.f33010a[productType.ordinal()]) {
            case 1:
            case 2:
                productType = c14510e.e();
                if (productType != null) {
                    return productType.length();
                }
                return 0;
            case 3:
            case 4:
            case 5:
                productType = c14510e.f();
                if (productType == null) {
                    productType = Integer.valueOf(0);
                }
                return productType.intValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final String m41257a(ProductType productType, int i) {
        switch (C10092n.f33011b[productType.ordinal()]) {
            case 1:
                productType = this.f33009e.getQuantityString(R.plurals.plus_paywall_option_length, i);
                C2668g.a(productType, "resources.getQuantityStr…all_option_length, count)");
                return productType;
            case 2:
                productType = this.f33009e.getQuantityString(R.plurals.boost_paywall_option_length, i);
                C2668g.a(productType, "resources.getQuantityStr…all_option_length, count)");
                return productType;
            case 3:
                productType = this.f33009e.getQuantityString(R.plurals.superlike_paywall_options, i);
                C2668g.a(productType, "resources.getQuantityStr…e_paywall_options, count)");
                return productType;
            case 4:
                productType = this.f33009e.getQuantityString(R.plurals.plus_paywall_option_length, i);
                C2668g.a(productType, "resources.getQuantityStr…all_option_length, count)");
                return productType;
            case 5:
                productType = this.f33009e.getQuantityString(R.plurals.top_pick_paywall_options, i);
                C2668g.a(productType, "resources.getQuantityStr…k_paywall_options, count)");
                return productType;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final int m41255a(ProductType productType) {
        switch (C10092n.f33012c[productType.ordinal()]) {
            case 1:
                return R.dimen.text_xxs;
            case 2:
            case 3:
            case 4:
            case 5:
                return R.dimen.text_s;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final String m41258a(C14510e c14510e) {
        if (c14510e.i() == null) {
            return "";
        }
        c14510e = this.f33009e.getString(R.string.most_popular);
        C2668g.a(c14510e, "resources.getString(R.string.most_popular)");
        return c14510e;
    }

    /* renamed from: b */
    private final String m41259b(ProductType productType) {
        switch (C10092n.f33013d[productType.ordinal()]) {
            case 1:
            case 2:
                productType = this.f33009e.getString(R.string.plus_paywall_per_month);
                C2668g.a(productType, "resources.getString(R.st…g.plus_paywall_per_month)");
                return productType;
            case 3:
            case 4:
            case 5:
                productType = this.f33009e.getString(R.string.paywall_each);
                C2668g.a(productType, "resources.getString(R.string.paywall_each)");
                return productType;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
