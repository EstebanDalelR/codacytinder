package com.tinder.paywall.viewmodels;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.paywall.views.PaywallItemGroupView.PaywallItemSelectListener;
import com.tinder.purchase.domain.model.C14510e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\fHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/tinder/paywall/viewmodels/PaywallItemGroupViewModel;", "", "productType", "Lcom/tinder/domain/profile/model/ProductType;", "offers", "", "Lcom/tinder/purchase/domain/model/Offer;", "color", "Lcom/tinder/paywall/viewmodels/PaywallItemViewModelColor;", "paywallItemViewModels", "Lcom/tinder/paywall/viewmodels/PaywallItemViewModel;", "itemSelectListener", "Lcom/tinder/paywall/views/PaywallItemGroupView$PaywallItemSelectListener;", "(Lcom/tinder/domain/profile/model/ProductType;Ljava/util/List;Lcom/tinder/paywall/viewmodels/PaywallItemViewModelColor;Ljava/util/List;Lcom/tinder/paywall/views/PaywallItemGroupView$PaywallItemSelectListener;)V", "getColor", "()Lcom/tinder/paywall/viewmodels/PaywallItemViewModelColor;", "getItemSelectListener", "()Lcom/tinder/paywall/views/PaywallItemGroupView$PaywallItemSelectListener;", "getOffers", "()Ljava/util/List;", "getPaywallItemViewModels", "getProductType", "()Lcom/tinder/domain/profile/model/ProductType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.viewmodels.h */
public final class C10085h {
    @NotNull
    /* renamed from: a */
    private final ProductType f32987a;
    @NotNull
    /* renamed from: b */
    private final List<C14510e> f32988b;
    @NotNull
    /* renamed from: c */
    private final PaywallItemViewModelColor f32989c;
    @NotNull
    /* renamed from: d */
    private final List<C10090l> f32990d;
    @NotNull
    /* renamed from: e */
    private final PaywallItemSelectListener f32991e;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10085h) {
                C10085h c10085h = (C10085h) obj;
                if (C2668g.a(this.f32987a, c10085h.f32987a) && C2668g.a(this.f32988b, c10085h.f32988b) && C2668g.a(this.f32989c, c10085h.f32989c) && C2668g.a(this.f32990d, c10085h.f32990d) && C2668g.a(this.f32991e, c10085h.f32991e)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ProductType productType = this.f32987a;
        int i = 0;
        int hashCode = (productType != null ? productType.hashCode() : 0) * 31;
        List list = this.f32988b;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        PaywallItemViewModelColor paywallItemViewModelColor = this.f32989c;
        hashCode = (hashCode + (paywallItemViewModelColor != null ? paywallItemViewModelColor.hashCode() : 0)) * 31;
        list = this.f32990d;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        PaywallItemSelectListener paywallItemSelectListener = this.f32991e;
        if (paywallItemSelectListener != null) {
            i = paywallItemSelectListener.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PaywallItemGroupViewModel(productType=");
        stringBuilder.append(this.f32987a);
        stringBuilder.append(", offers=");
        stringBuilder.append(this.f32988b);
        stringBuilder.append(", color=");
        stringBuilder.append(this.f32989c);
        stringBuilder.append(", paywallItemViewModels=");
        stringBuilder.append(this.f32990d);
        stringBuilder.append(", itemSelectListener=");
        stringBuilder.append(this.f32991e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10085h(@NotNull ProductType productType, @NotNull List<? extends C14510e> list, @NotNull PaywallItemViewModelColor paywallItemViewModelColor, @NotNull List<C10090l> list2, @NotNull PaywallItemSelectListener paywallItemSelectListener) {
        C2668g.b(productType, "productType");
        C2668g.b(list, "offers");
        C2668g.b(paywallItemViewModelColor, ManagerWebServices.PARAM_BADGE_COLOR);
        C2668g.b(list2, "paywallItemViewModels");
        C2668g.b(paywallItemSelectListener, "itemSelectListener");
        this.f32987a = productType;
        this.f32988b = list;
        this.f32989c = paywallItemViewModelColor;
        this.f32990d = list2;
        this.f32991e = paywallItemSelectListener;
    }

    @NotNull
    /* renamed from: a */
    public final ProductType m41204a() {
        return this.f32987a;
    }

    @NotNull
    /* renamed from: b */
    public final List<C14510e> m41205b() {
        return this.f32988b;
    }

    @NotNull
    /* renamed from: c */
    public final List<C10090l> m41206c() {
        return this.f32990d;
    }

    @NotNull
    /* renamed from: d */
    public final PaywallItemSelectListener m41207d() {
        return this.f32991e;
    }
}
