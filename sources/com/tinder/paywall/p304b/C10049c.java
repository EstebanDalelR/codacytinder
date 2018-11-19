package com.tinder.paywall.p304b;

import android.content.res.Resources;
import com.tinder.R;
import com.tinder.boost.p178a.C10400d;
import com.tinder.domain.fastmatch.model.FastMatchStatus;
import com.tinder.fastmatch.viewmodel.C9420a;
import com.tinder.paywall.C10046a;
import com.tinder.paywall.p305d.C10057a;
import com.tinder.paywall.viewmodels.C10093o;
import com.tinder.paywall.viewmodels.C12288d;
import com.tinder.paywall.viewmodels.C12289e;
import com.tinder.paywall.viewmodels.C12290f;
import com.tinder.paywall.viewmodels.PaywallPerk;
import com.tinder.superlike.p419b.C15071e;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0010J\u0006\u0010\u0016\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0010J\u0014\u0010\u001d\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u001fJ\u0006\u0010 \u001a\u00020\u0010J\u000e\u0010!\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\"\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/tinder/paywall/perks/PaywallPerkViewModelFactory;", "", "upsellTextFactory", "Lcom/tinder/paywall/utils/UpsellTextFactory;", "superlikeInteractor", "Lcom/tinder/superlike/interactors/SuperlikeInteractor;", "boostInteractor", "Lcom/tinder/boost/interactor/BoostInteractor;", "drawableFactory", "Lcom/tinder/paywall/DrawableFactory;", "resources", "Landroid/content/res/Resources;", "fastMatchTextRenderer", "Lcom/tinder/fastmatch/viewmodel/FastMatchTextRenderer;", "(Lcom/tinder/paywall/utils/UpsellTextFactory;Lcom/tinder/superlike/interactors/SuperlikeInteractor;Lcom/tinder/boost/interactor/BoostInteractor;Lcom/tinder/paywall/DrawableFactory;Landroid/content/res/Resources;Lcom/tinder/fastmatch/viewmodel/FastMatchTextRenderer;)V", "createBoostPerk", "Lcom/tinder/paywall/viewmodels/PaywallPerkViewModel;", "createFastMatchPerk", "fastMatchStatus", "Lcom/tinder/domain/fastmatch/model/FastMatchStatus;", "createNoAdsPerk", "createPassportPerk", "createRewindPerk", "createSuperlikePaywallWithUserImage", "imageUrl", "", "createSuperlikePerk", "createTinderPlusFeaturesPerk", "createTopPicksFeaturePerk", "createTopPicksTeaserPerk", "photoUrls", "", "createUnlimitedLikesPerk", "createUnlimitedLikesPerkWithImage", "createWhoSeesYouPerk", "createYourProfilePerk", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.b.c */
public final class C10049c {
    /* renamed from: a */
    private final C10057a f32943a;
    /* renamed from: b */
    private final C15071e f32944b;
    /* renamed from: c */
    private final C10400d f32945c;
    /* renamed from: d */
    private final C10046a f32946d;
    /* renamed from: e */
    private final Resources f32947e;
    /* renamed from: f */
    private final C9420a f32948f;

    @Inject
    public C10049c(@NotNull C10057a c10057a, @NotNull C15071e c15071e, @NotNull C10400d c10400d, @NotNull C10046a c10046a, @NotNull Resources resources, @NotNull C9420a c9420a) {
        C2668g.b(c10057a, "upsellTextFactory");
        C2668g.b(c15071e, "superlikeInteractor");
        C2668g.b(c10400d, "boostInteractor");
        C2668g.b(c10046a, "drawableFactory");
        C2668g.b(resources, "resources");
        C2668g.b(c9420a, "fastMatchTextRenderer");
        this.f32943a = c10057a;
        this.f32944b = c15071e;
        this.f32945c = c10400d;
        this.f32946d = c10046a;
        this.f32947e = resources;
        this.f32948f = c9420a;
    }

    @NotNull
    /* renamed from: a */
    public final C10093o m41103a() {
        PaywallPerk paywallPerk = PaywallPerk.UNLIMITED_LIKES;
        String string = this.f32947e.getString(R.string.paywall_perk_unlimited_likes_title);
        C2668g.a(string, "resources.getString(R.st…rk_unlimited_likes_title)");
        String string2 = this.f32947e.getString(R.string.paywall_perk_unlimited_likes_byline);
        C2668g.a(string2, "resources.getString(R.st…k_unlimited_likes_byline)");
        return new C12288d(paywallPerk, R.drawable.perk_unlimited_likes_icon, string, string2, this.f32946d.m41098a(R.drawable.perk_unlimited_likes_gradient));
    }

    @NotNull
    /* renamed from: a */
    public final C10093o m41105a(@NotNull String str) {
        C2668g.b(str, "imageUrl");
        PaywallPerk paywallPerk = PaywallPerk.UNLIMITED_LIKES;
        List a = C19301m.a(str);
        String string = this.f32947e.getString(R.string.paywall_perk_unlimited_likes_title);
        C2668g.a(string, "resources.getString(R.st…rk_unlimited_likes_title)");
        String string2 = this.f32947e.getString(R.string.paywall_perk_unlimited_likes_byline);
        C2668g.a(string2, "resources.getString(R.st…k_unlimited_likes_byline)");
        return new C12290f(paywallPerk, a, string, string2, this.f32946d.m41098a(R.drawable.perk_unlimited_likes_gradient));
    }

    @NotNull
    /* renamed from: b */
    public final C10093o m41107b() {
        PaywallPerk paywallPerk = PaywallPerk.UNDO;
        String string = this.f32947e.getString(R.string.paywall_perk_undo_title);
        C2668g.a(string, "resources.getString(R.st….paywall_perk_undo_title)");
        String string2 = this.f32947e.getString(R.string.paywall_perk_undo_byline);
        C2668g.a(string2, "resources.getString(R.st…paywall_perk_undo_byline)");
        return new C12288d(paywallPerk, R.drawable.perk_rewind_icon, string, string2, this.f32946d.m41098a(R.drawable.perk_rewind_gradient));
    }

    @NotNull
    /* renamed from: c */
    public final C10093o m41109c() {
        PaywallPerk paywallPerk = PaywallPerk.NO_ADS;
        String string = this.f32947e.getString(R.string.paywall_perk_no_ads_title);
        C2668g.a(string, "resources.getString(R.st…aywall_perk_no_ads_title)");
        String string2 = this.f32947e.getString(R.string.paywall_perk_no_ads_byline);
        C2668g.a(string2, "resources.getString(R.st…ywall_perk_no_ads_byline)");
        return new C12288d(paywallPerk, R.drawable.perk_no_ads_icon, string, string2, this.f32946d.m41098a(R.drawable.perk_no_ads_gradient));
    }

    @NotNull
    /* renamed from: d */
    public final C10093o m41110d() {
        PaywallPerk paywallPerk = PaywallPerk.PASSPORT;
        String string = this.f32947e.getString(R.string.paywall_perk_passport_title);
        C2668g.a(string, "resources.getString(R.st…wall_perk_passport_title)");
        String string2 = this.f32947e.getString(R.string.paywall_perk_passport_byline);
        C2668g.a(string2, "resources.getString(R.st…all_perk_passport_byline)");
        return new C12288d(paywallPerk, R.drawable.perk_passport_icon, string, string2, this.f32946d.m41098a(R.drawable.perk_passport_gradient));
    }

    @NotNull
    /* renamed from: e */
    public final C10093o m41111e() {
        String a = this.f32943a.m41125a((int) R.plurals.superlike_paywall_perk_title, this.f32944b.b());
        PaywallPerk paywallPerk = PaywallPerk.SUPER_LIKE;
        C2668g.a(a, "superlikeTitle");
        String string = this.f32947e.getString(R.string.paywall_perk_superlike_byline);
        C2668g.a(string, "resources.getString(R.st…ll_perk_superlike_byline)");
        return new C12288d(paywallPerk, R.drawable.perk_superlike_icon, a, string, this.f32946d.m41098a(R.drawable.perk_superlike_gradient));
    }

    @NotNull
    /* renamed from: b */
    public final C10093o m41108b(@NotNull String str) {
        C2668g.b(str, "imageUrl");
        PaywallPerk paywallPerk = PaywallPerk.SUPER_LIKE;
        List a = C19301m.a(str);
        String string = this.f32947e.getString(R.string.paywall_byline_out_of_superlike);
        C2668g.a(string, "resources.getString(R.st…_byline_out_of_superlike)");
        String string2 = this.f32947e.getString(R.string.paywall_title_out_of_superlike);
        C2668g.a(string2, "resources.getString(R.st…l_title_out_of_superlike)");
        return new C12290f(paywallPerk, a, string2, string, this.f32946d.m41098a(R.drawable.perk_superlike_gradient));
    }

    @NotNull
    /* renamed from: f */
    public final C10093o m41112f() {
        String a = this.f32943a.m41124a((int) R.string.boost_perk_carousel_description, this.f32945c.m42282e());
        PaywallPerk paywallPerk = PaywallPerk.BOOST;
        C2668g.a(a, "boostTitle");
        String string = this.f32947e.getString(R.string.paywall_perk_boost_byline);
        C2668g.a(string, "resources.getString(R.st…aywall_perk_boost_byline)");
        return new C12288d(paywallPerk, R.drawable.perk_boost_icon, a, string, this.f32946d.m41098a(R.drawable.perk_boost_gradient));
    }

    @NotNull
    /* renamed from: g */
    public final C10093o m41113g() {
        PaywallPerk paywallPerk = PaywallPerk.YOUR_PROFILE;
        String string = this.f32947e.getString(R.string.paywall_perk_your_profile_title);
        C2668g.a(string, "resources.getString(R.st…_perk_your_profile_title)");
        String string2 = this.f32947e.getString(R.string.paywall_perk_your_profile_byline);
        C2668g.a(string2, "resources.getString(R.st…perk_your_profile_byline)");
        return new C12288d(paywallPerk, R.drawable.perk_your_profile_icon, string, string2, this.f32946d.m41098a(R.drawable.perk_control_your_profile_gradient));
    }

    @NotNull
    /* renamed from: h */
    public final C10093o m41114h() {
        PaywallPerk paywallPerk = PaywallPerk.WHO_SEES_YOU;
        String string = this.f32947e.getString(R.string.paywall_perk_who_sees_you_title);
        C2668g.a(string, "resources.getString(R.st…_perk_who_sees_you_title)");
        String string2 = this.f32947e.getString(R.string.paywall_perk_who_sees_you_byline);
        C2668g.a(string2, "resources.getString(R.st…perk_who_sees_you_byline)");
        return new C12288d(paywallPerk, R.drawable.perk_who_sees_you_icon, string, string2, this.f32946d.m41098a(R.drawable.perk_who_sees_you_gradient));
    }

    @NotNull
    /* renamed from: i */
    public final C10093o m41115i() {
        PaywallPerk paywallPerk = PaywallPerk.TINDER_PLUS_FEATURES;
        String string = this.f32947e.getString(R.string.everything_you_love_from_tinder_plus);
        C2668g.a(string, "resources.getString(R.st…ou_love_from_tinder_plus)");
        return new C12288d(paywallPerk, R.drawable.perk_all_tinderplus_features, string, "", null, 16, null);
    }

    @NotNull
    /* renamed from: a */
    public final C10093o m41104a(@NotNull FastMatchStatus fastMatchStatus) {
        C2668g.b(fastMatchStatus, "fastMatchStatus");
        return new C12289e(PaywallPerk.FAST_MATCH, R.drawable.perk_fastmatch_icon_foreground, R.drawable.perk_fastmatch_icon_background, this.f32948f.m39388a(fastMatchStatus), this.f32948f.m39389b(fastMatchStatus), null, 32, null);
    }

    @NotNull
    /* renamed from: a */
    public final C10093o m41106a(@NotNull List<String> list) {
        C2668g.b(list, "photoUrls");
        if (list.size() < 3) {
            return m41116j();
        }
        PaywallPerk paywallPerk = PaywallPerk.TOP_PICKS_TEASER;
        String string = this.f32947e.getString(R.string.top_picks_teaser_paywall_title);
        C2668g.a(string, "resources.getString(R.st…cks_teaser_paywall_title)");
        String string2 = this.f32947e.getString(R.string.top_picks_teaser_paywall_byline);
        C2668g.a(string2, "resources.getString(R.st…ks_teaser_paywall_byline)");
        return new C12290f(paywallPerk, list, string, string2, null, 16, null);
    }

    @NotNull
    /* renamed from: j */
    public final C10093o m41116j() {
        PaywallPerk paywallPerk = PaywallPerk.TOP_PICKS_FEATURE;
        String string = this.f32947e.getString(R.string.top_picks_teaser_paywall_title);
        C2668g.a(string, "resources.getString(R.st…cks_teaser_paywall_title)");
        String string2 = this.f32947e.getString(R.string.top_picks_teaser_paywall_byline);
        C2668g.a(string2, "resources.getString(R.st…ks_teaser_paywall_byline)");
        return new C12289e(paywallPerk, R.drawable.ic_top_picks_big_foreground, R.drawable.ic_top_picks_big_background, string, string2, null, 32, null);
    }
}
