package com.tinder.paywall.viewmodels;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.res.C0441a;
import com.tinder.R;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.profile.model.PurchaseType;
import javax.inject.Inject;

/* renamed from: com.tinder.paywall.viewmodels.j */
public class C10089j {
    @NonNull
    /* renamed from: a */
    private final Resources f32993a;

    @Inject
    C10089j(@NonNull Resources resources) {
        this.f32993a = resources;
    }

    @NonNull
    /* renamed from: a */
    public C10087i m41242a(ProductType productType, PurchaseType purchaseType, PaywallItemViewModelColor paywallItemViewModelColor) {
        switch (paywallItemViewModelColor) {
            case RED:
                return m41238a();
            case BLUE:
                return m41239a(productType);
            case GOLD:
                if (purchaseType == PurchaseType.CONSUMABLE) {
                    return m41241c();
                }
                return m41240b();
            default:
                return m41239a(productType);
        }
    }

    @NonNull
    /* renamed from: a */
    private C10087i m41239a(ProductType productType) {
        int b;
        Drawable a;
        Drawable a2;
        if (productType == ProductType.PLUS) {
            b = C0441a.b(this.f32993a, R.color.blue1, null);
        } else {
            b = C0441a.b(this.f32993a, R.color.enabled_paywall_save_background_blue, null);
        }
        int b2 = C0441a.b(this.f32993a, R.color.white, null);
        int b3 = C0441a.b(this.f32993a, R.color.default_paywall_item_grey, null);
        int b4 = C0441a.b(this.f32993a, R.color.disabled_text_color, null);
        int b5 = C0441a.b(this.f32993a, R.color.grey1, null);
        if (productType == ProductType.PLUS) {
            a = C0441a.a(this.f32993a, R.drawable.paywall_enable_blue_background_v3, null);
        } else {
            a = C0441a.a(this.f32993a, R.drawable.paywall_enable_blue_background, null);
        }
        Drawable a3 = C0441a.a(this.f32993a, R.drawable.paywall_disabled_background, null);
        if (productType == ProductType.PLUS) {
            a2 = C0441a.a(this.f32993a, R.drawable.tinder_plus_pill_background, null);
        } else {
            a2 = C0441a.a(this.f32993a, R.drawable.base_paywall_item_enabled_blue, null);
        }
        return C10087i.m41223o().mo10747e(Integer.valueOf(b)).mo10749g(Integer.valueOf(b)).mo10748f(Integer.valueOf(b2)).mo10750h(Integer.valueOf(b2)).mo10742b(Integer.valueOf(b3)).mo10746d(Integer.valueOf(b3)).mo10739a(Integer.valueOf(b4)).mo10744c(Integer.valueOf(b4)).mo10741b(a).mo10743c(a3).mo10745d(a2).mo10751i(Integer.valueOf(b)).mo10752j(Integer.valueOf(b5)).mo10740a();
    }

    @NonNull
    /* renamed from: a */
    private C10087i m41238a() {
        int b = C0441a.b(this.f32993a, R.color.enabled_paywall_save_background_red, null);
        int b2 = C0441a.b(this.f32993a, R.color.enabled_paywall_background_red, null);
        int b3 = C0441a.b(this.f32993a, R.color.default_paywall_item_grey, null);
        int b4 = C0441a.b(this.f32993a, R.color.disabled_text_color, null);
        int b5 = C0441a.b(this.f32993a, R.color.discount_enabled_strike_through_text, null);
        int b6 = C0441a.b(this.f32993a, R.color.discount_disabled_strike_through_text, null);
        Drawable a = C0441a.a(this.f32993a, R.drawable.base_paywall_item_enabled, null);
        Drawable a2 = C0441a.a(this.f32993a, R.drawable.paywall_enabled_background, null);
        Drawable a3 = C0441a.a(this.f32993a, R.drawable.paywall_disabled_background, null);
        return C10087i.m41223o().mo10747e(Integer.valueOf(b)).mo10749g(Integer.valueOf(b)).mo10748f(Integer.valueOf(b2)).mo10750h(Integer.valueOf(b2)).mo10742b(Integer.valueOf(b3)).mo10746d(Integer.valueOf(b3)).mo10739a(Integer.valueOf(b4)).mo10744c(Integer.valueOf(b4)).mo10738a(a).mo10741b(a2).mo10743c(a3).mo10745d(C0441a.a(this.f32993a, R.drawable.save_percentage_background, null)).mo10751i(Integer.valueOf(b5)).mo10752j(Integer.valueOf(b6)).mo10740a();
    }

    /* renamed from: b */
    private C10087i m41240b() {
        int b = C0441a.b(this.f32993a, R.color.gold1, null);
        int b2 = C0441a.b(this.f32993a, R.color.transparent, null);
        int b3 = C0441a.b(this.f32993a, R.color.title_gray, null);
        int b4 = C0441a.b(this.f32993a, R.color.title_gray, null);
        Drawable a = C0441a.a(this.f32993a, R.drawable.paywall_enable_gold_background, null);
        Drawable a2 = C0441a.a(this.f32993a, R.drawable.paywall_disabled_background, null);
        return C10087i.m41223o().mo10747e(Integer.valueOf(b)).mo10749g(Integer.valueOf(b)).mo10748f(Integer.valueOf(b2)).mo10750h(Integer.valueOf(b2)).mo10742b(Integer.valueOf(b2)).mo10746d(Integer.valueOf(b2)).mo10739a(Integer.valueOf(b3)).mo10744c(Integer.valueOf(b3)).mo10741b(a).mo10743c(a2).mo10745d(C0441a.a(this.f32993a, R.drawable.gold_paywall_pill_background, null)).mo10751i(Integer.valueOf(b)).mo10752j(Integer.valueOf(b4)).mo10740a();
    }

    /* renamed from: c */
    private C10087i m41241c() {
        int b = C0441a.b(this.f32993a, R.color.gold1, null);
        int b2 = C0441a.b(this.f32993a, R.color.transparent, null);
        int b3 = C0441a.b(this.f32993a, R.color.title_gray, null);
        int b4 = C0441a.b(this.f32993a, R.color.title_gray, null);
        int b5 = C0441a.b(this.f32993a, R.color.paywall_gold_select_background, null);
        Drawable a = C0441a.a(this.f32993a, R.drawable.top_picks_enabled_gold_background, null);
        Drawable a2 = C0441a.a(this.f32993a, R.drawable.top_picks_save_background, null);
        Drawable a3 = C0441a.a(this.f32993a, R.drawable.paywall_disabled_background, null);
        int b6 = C0441a.b(this.f32993a, R.color.default_paywall_item_grey, null);
        return C10087i.m41223o().mo10747e(Integer.valueOf(b)).mo10749g(Integer.valueOf(b)).mo10748f(Integer.valueOf(b5)).mo10750h(Integer.valueOf(b2)).mo10738a(C0441a.a(this.f32993a, R.drawable.top_picks_base_item_enabled, null)).mo10742b(Integer.valueOf(b6)).mo10746d(Integer.valueOf(b6)).mo10739a(Integer.valueOf(b3)).mo10744c(Integer.valueOf(b3)).mo10741b(a).mo10743c(a3).mo10745d(a2).mo10751i(Integer.valueOf(b)).mo10752j(Integer.valueOf(b4)).mo10740a();
    }
}
