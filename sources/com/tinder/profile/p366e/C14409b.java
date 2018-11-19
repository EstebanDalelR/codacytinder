package com.tinder.profile.p366e;

import android.content.res.Resources;
import com.tinder.R;
import com.tinder.boost.p178a.C10400d;
import com.tinder.controlla.model.AdvertisingPageType;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.paywall.p305d.C10057a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/profile/viewmodel/AdvertisingPanelProvider;", "", "currentUserProvider", "Lcom/tinder/data/user/CurrentUserProvider;", "boostInteractor", "Lcom/tinder/boost/interactor/BoostInteractor;", "upsellTextFactory", "Lcom/tinder/paywall/utils/UpsellTextFactory;", "resources", "Landroid/content/res/Resources;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "(Lcom/tinder/data/user/CurrentUserProvider;Lcom/tinder/boost/interactor/BoostInteractor;Lcom/tinder/paywall/utils/UpsellTextFactory;Landroid/content/res/Resources;Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;)V", "get", "", "Lcom/tinder/profile/viewmodel/AdvertisingPanel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profile.e.b */
public final class C14409b {
    /* renamed from: a */
    private final CurrentUserProvider f45610a;
    /* renamed from: b */
    private final C10400d f45611b;
    /* renamed from: c */
    private final C10057a f45612c;
    /* renamed from: d */
    private final Resources f45613d;
    /* renamed from: e */
    private final SubscriptionProvider f45614e;
    /* renamed from: f */
    private final FastMatchConfigProvider f45615f;

    @Inject
    public C14409b(@NotNull CurrentUserProvider currentUserProvider, @NotNull C10400d c10400d, @NotNull C10057a c10057a, @NotNull Resources resources, @NotNull SubscriptionProvider subscriptionProvider, @NotNull FastMatchConfigProvider fastMatchConfigProvider) {
        C2668g.b(currentUserProvider, "currentUserProvider");
        C2668g.b(c10400d, "boostInteractor");
        C2668g.b(c10057a, "upsellTextFactory");
        C2668g.b(resources, "resources");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(fastMatchConfigProvider, "fastMatchConfigProvider");
        this.f45610a = currentUserProvider;
        this.f45611b = c10400d;
        this.f45612c = c10057a;
        this.f45613d = resources;
        this.f45614e = subscriptionProvider;
        this.f45615f = fastMatchConfigProvider;
    }

    @NotNull
    /* renamed from: a */
    public final List<C14408a> m54862a() {
        Value value;
        boolean z;
        C14408a[] c14408aArr;
        C14408a a;
        C14408a a2;
        List<C14408a> c;
        C14408a a3;
        ProfileUser profileUser = this.f45610a.get();
        if (profileUser != null) {
            Gender gender = profileUser.gender();
            if (gender != null) {
                value = gender.value();
                if (value != null) {
                    z = value != Value.FEMALE;
                    c14408aArr = new C14408a[6];
                    a = C14408a.m54856f().mo11605a(AdvertisingPageType.BOOST).mo11608b(R.color.controlla_boost).mo11609c(R.drawable.ic_controlla_boost).mo11604a(z ? R.string.controlla_boost_title_female : R.string.controlla_boost_title_male).mo11606a(this.f45612c.a(this.f45611b.e(), z)).mo11607a();
                    C2668g.a(a, "AdvertisingPanel.builder…\n                .build()");
                    c14408aArr[0] = a;
                    a = C14408a.m54856f().mo11605a(AdvertisingPageType.SUPERLIKES).mo11608b(R.color.superlike).mo11609c(R.drawable.superlike_gradient).mo11604a((int) R.string.controlla_superlikes_title).mo11606a(this.f45613d.getString(R.string.superlike_alc_likely_match)).mo11607a();
                    C2668g.a(a, "AdvertisingPanel.builder…\n                .build()");
                    c14408aArr[1] = a;
                    a2 = C14408a.m54856f().mo11605a(AdvertisingPageType.PASSPORT).mo11608b(R.color.controlla_passport).mo11609c(R.drawable.ic_passport_blue).mo11604a((int) R.string.paywall_perk_passport_title).mo11606a(this.f45613d.getString(R.string.controlla_passport_description)).mo11607a();
                    C2668g.a(a2, "AdvertisingPanel.builder…\n                .build()");
                    c14408aArr[2] = a2;
                    a2 = C14408a.m54856f().mo11605a(AdvertisingPageType.TINDER_PLUS).mo11608b(R.color.controlla_tinder_plus).mo11609c(R.drawable.ic_control_profile_key).mo11604a((int) R.string.control_your_profile_title).mo11606a(this.f45613d.getString(R.string.paywall_perk_your_profile_byline)).mo11607a();
                    C2668g.a(a2, "AdvertisingPanel.builder…\n                .build()");
                    c14408aArr[3] = a2;
                    a2 = C14408a.m54856f().mo11605a(AdvertisingPageType.REWIND).mo11608b(R.color.controlla_rewind).mo11609c(R.drawable.ic_rewind).mo11604a((int) R.string.controlla_rewind_title).mo11606a(this.f45613d.getString(R.string.controlla_rewind_description)).mo11607a();
                    C2668g.a(a2, "AdvertisingPanel.builder…\n                .build()");
                    c14408aArr[4] = a2;
                    a2 = C14408a.m54856f().mo11605a(AdvertisingPageType.UNLIMITED_LIKES).mo11608b(R.color.controlla_unlimited_likes).mo11609c(R.drawable.like_gradient).mo11604a((int) R.string.controlla_likes_title).mo11606a(this.f45613d.getString(R.string.controlla_likes_description)).mo11607a();
                    C2668g.a(a2, "AdvertisingPanel.builder…\n                .build()");
                    c14408aArr[5] = a2;
                    c = C17554o.m64200c(c14408aArr);
                    if (!this.f45614e.get().isGold() && this.f45615f.get().isEnabled()) {
                        a3 = C14408a.m54856f().mo11605a(AdvertisingPageType.GOLD).mo11608b(R.color.gold1).mo11609c(R.drawable.ic_gold_controlla).mo11604a((int) R.string.get_tinder_gold).mo11606a(this.f45613d.getString(R.string.controlla_gold_description)).mo11607a();
                        C2668g.a(a3, "AdvertisingPanel.builder…                 .build()");
                        c.add(0, a3);
                    }
                    return c;
                }
            }
        }
        value = Value.UNKNOWN;
        if (value != Value.FEMALE) {
        }
        c14408aArr = new C14408a[6];
        if (z) {
        }
        a = C14408a.m54856f().mo11605a(AdvertisingPageType.BOOST).mo11608b(R.color.controlla_boost).mo11609c(R.drawable.ic_controlla_boost).mo11604a(z ? R.string.controlla_boost_title_female : R.string.controlla_boost_title_male).mo11606a(this.f45612c.a(this.f45611b.e(), z)).mo11607a();
        C2668g.a(a, "AdvertisingPanel.builder…\n                .build()");
        c14408aArr[0] = a;
        a = C14408a.m54856f().mo11605a(AdvertisingPageType.SUPERLIKES).mo11608b(R.color.superlike).mo11609c(R.drawable.superlike_gradient).mo11604a((int) R.string.controlla_superlikes_title).mo11606a(this.f45613d.getString(R.string.superlike_alc_likely_match)).mo11607a();
        C2668g.a(a, "AdvertisingPanel.builder…\n                .build()");
        c14408aArr[1] = a;
        a2 = C14408a.m54856f().mo11605a(AdvertisingPageType.PASSPORT).mo11608b(R.color.controlla_passport).mo11609c(R.drawable.ic_passport_blue).mo11604a((int) R.string.paywall_perk_passport_title).mo11606a(this.f45613d.getString(R.string.controlla_passport_description)).mo11607a();
        C2668g.a(a2, "AdvertisingPanel.builder…\n                .build()");
        c14408aArr[2] = a2;
        a2 = C14408a.m54856f().mo11605a(AdvertisingPageType.TINDER_PLUS).mo11608b(R.color.controlla_tinder_plus).mo11609c(R.drawable.ic_control_profile_key).mo11604a((int) R.string.control_your_profile_title).mo11606a(this.f45613d.getString(R.string.paywall_perk_your_profile_byline)).mo11607a();
        C2668g.a(a2, "AdvertisingPanel.builder…\n                .build()");
        c14408aArr[3] = a2;
        a2 = C14408a.m54856f().mo11605a(AdvertisingPageType.REWIND).mo11608b(R.color.controlla_rewind).mo11609c(R.drawable.ic_rewind).mo11604a((int) R.string.controlla_rewind_title).mo11606a(this.f45613d.getString(R.string.controlla_rewind_description)).mo11607a();
        C2668g.a(a2, "AdvertisingPanel.builder…\n                .build()");
        c14408aArr[4] = a2;
        a2 = C14408a.m54856f().mo11605a(AdvertisingPageType.UNLIMITED_LIKES).mo11608b(R.color.controlla_unlimited_likes).mo11609c(R.drawable.like_gradient).mo11604a((int) R.string.controlla_likes_title).mo11606a(this.f45613d.getString(R.string.controlla_likes_description)).mo11607a();
        C2668g.a(a2, "AdvertisingPanel.builder…\n                .build()");
        c14408aArr[5] = a2;
        c = C17554o.m64200c(c14408aArr);
        a3 = C14408a.m54856f().mo11605a(AdvertisingPageType.GOLD).mo11608b(R.color.gold1).mo11609c(R.drawable.ic_gold_controlla).mo11604a((int) R.string.get_tinder_gold).mo11606a(this.f45613d.getString(R.string.controlla_gold_description)).mo11607a();
        C2668g.a(a3, "AdvertisingPanel.builder…                 .build()");
        c.add(0, a3);
        return c;
    }
}
