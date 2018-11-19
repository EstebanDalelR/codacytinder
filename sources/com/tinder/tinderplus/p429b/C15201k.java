package com.tinder.tinderplus.p429b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.domain.fastmatch.model.FastMatchStatus;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.paywall.legacy.ListenerPaywall;
import com.tinder.paywall.p304b.C10047a;
import com.tinder.paywall.paywallflow.C10076o.C10075b;
import com.tinder.paywall.viewmodels.C10093o;
import com.tinder.paywall.viewmodels.C10094p;
import com.tinder.paywall.viewmodels.PaywallItemViewModelColor;
import com.tinder.paywall.viewmodels.PaywallPerk;
import com.tinder.paywall.views.PaywallBaseView.ColorScheme;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.C14510e.C14509b;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.tinderplus.dialog.TinderPlusPaywallDialog.C15206b;
import com.tinder.tinderplus.model.C15219p;
import com.tinder.tinderplus.model.C15219p.C15218b;
import com.tinder.tinderplus.p428a.C15192e;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.tinderplus.target.TinderPlusPaywallTarget;
import com.tinder.utils.RxUtils;
import java.util.Collections;
import java.util.List;
import java8.util.Optional;
import javax.inject.Inject;
import p000a.p001a.C0001a;
import rx.p500e.C19573b;

/* renamed from: com.tinder.tinderplus.b.k */
public class C15201k {
    @DeadshotTarget
    /* renamed from: a */
    TinderPlusPaywallTarget f47273a;
    @Nullable
    /* renamed from: b */
    ListenerPaywall f47274b;
    @NonNull
    /* renamed from: c */
    private final C15192e f47275c;
    @NonNull
    /* renamed from: d */
    private final OfferRepository f47276d;
    @NonNull
    /* renamed from: e */
    private final C15193i f47277e;
    @NonNull
    /* renamed from: f */
    private final C15219p f47278f;
    @NonNull
    /* renamed from: g */
    private final C2630h f47279g;
    @NonNull
    /* renamed from: h */
    private final C10094p f47280h;
    @NonNull
    /* renamed from: i */
    private final C10047a f47281i;
    /* renamed from: j */
    private int f47282j;
    @Nullable
    /* renamed from: k */
    private C14510e f47283k;
    @NonNull
    /* renamed from: l */
    private List<String> f47284l = Collections.emptyList();
    @Nullable
    /* renamed from: m */
    private List<Integer> f47285m;
    /* renamed from: n */
    private boolean f47286n;
    /* renamed from: o */
    private C10075b f47287o;
    /* renamed from: p */
    private final C19573b f47288p = new C19573b();

    /* renamed from: a */
    public static int m57129a() {
        return 3;
    }

    /* renamed from: d */
    final /* synthetic */ void m57147d() {
        m57138e();
    }

    @Inject
    public C15201k(@NonNull C15192e c15192e, @NonNull OfferRepository offerRepository, @NonNull C15193i c15193i, @NonNull C15219p c15219p, @NonNull C2630h c2630h, @NonNull C10047a c10047a, @NonNull C10094p c10094p) {
        this.f47275c = c15192e;
        this.f47276d = offerRepository;
        this.f47277e = c15193i;
        this.f47278f = c15219p;
        this.f47279g = c2630h;
        this.f47280h = c10094p;
        this.f47281i = c10047a;
    }

    /* renamed from: a */
    public void m57143a(C15206b c15206b) {
        this.f47282j = c15206b.mo12550b();
        this.f47287o = c15206b.mo12554f();
        this.f47285m = (List) Optional.m59121b(c15206b.mo12552d()).m59130c(Collections.emptyList());
        this.f47274b = c15206b.mo12553e();
        this.f47286n = c15206b.mo12549a();
        this.f47275c.m57116c();
        List offers = this.f47276d.getOffers(ProductType.PLUS);
        List d = this.f47277e.m57124d();
        if (!offers.isEmpty()) {
            if (!d.isEmpty()) {
                boolean z;
                if (!this.f47275c.m57117d()) {
                    if (!this.f47286n) {
                        z = false;
                        m57132a(this.f47273a, c15206b, z);
                        m57134a(this.f47273a, z);
                        return;
                    }
                }
                z = true;
                m57132a(this.f47273a, c15206b, z);
                m57134a(this.f47273a, z);
                return;
            }
        }
        this.f47273a.showErrorMessageAndDismiss();
    }

    /* renamed from: a */
    public void m57142a(@Nullable C14510e c14510e) {
        if (!(this.f47273a == null || c14510e == null)) {
            if (this.f47274b != null) {
                if (m57136c(c14510e) && c14510e.mo11845g() != null && this.f47275c.m57117d()) {
                    this.f47274b.onPayClicked(c14510e.mo11845g().mo11860a());
                } else {
                    this.f47274b.onPayClicked(c14510e.mo11839a());
                }
            }
        }
    }

    /* renamed from: b */
    public void m57144b() {
        m57139f();
    }

    /* renamed from: b */
    public void m57145b(@NonNull C14510e c14510e) {
        this.f47283k = c14510e;
        m57137d(c14510e);
    }

    /* renamed from: a */
    public void m57141a(int i, int i2) {
        m57135b(i, i2);
    }

    @Drop
    /* renamed from: c */
    void m57146c() {
        m57140g();
        this.f47288p.unsubscribe();
    }

    /* renamed from: e */
    private void m57138e() {
        List offers = this.f47276d.getOffers(ProductType.PLUS);
        if (this.f47273a != null) {
            if (!offers.isEmpty()) {
                C14509b a = this.f47275c.m57111a(offers);
                if (a != null) {
                    if (a.mo11867h() != null) {
                        this.f47273a.showDiscountOffers(a.mo11867h().longValue());
                        return;
                    }
                }
                this.f47273a.showErrorMessageAndDismiss();
            }
        }
    }

    @NonNull
    /* renamed from: a */
    private List<C10093o> m57131a(@Nullable PaywallPerk paywallPerk, @NonNull List<String> list, boolean z) {
        this.f47284l = this.f47280h.a(paywallPerk, list, z);
        if (this.f47287o != null) {
            return this.f47281i.a(this.f47284l, new FastMatchStatus(), Collections.singletonList(this.f47287o.b()));
        }
        return this.f47281i.a(this.f47284l);
    }

    /* renamed from: c */
    private boolean m57136c(@Nullable C14510e c14510e) {
        return ((Boolean) Optional.m59121b((Object) c14510e).m59122a(C16944l.f52224a).m59122a(C16945m.f52225a).m59122a(C16946n.f52226a).m59130c(Boolean.valueOf(false))).booleanValue();
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m57130a(Integer num) {
        return Boolean.valueOf(num.intValue() > null ? true : null);
    }

    /* renamed from: a */
    private void m57132a(@NonNull TinderPlusPaywallTarget tinderPlusPaywallTarget, @NonNull C15206b c15206b, boolean z) {
        List offers = this.f47276d.getOffers(ProductType.PLUS);
        List d = this.f47277e.m57124d();
        if (!offers.isEmpty()) {
            if (!d.isEmpty()) {
                PaywallItemViewModelColor paywallItemViewModelColor = PaywallItemViewModelColor.BLUE;
                TinderPlusPaywallTarget tinderPlusPaywallTarget2 = tinderPlusPaywallTarget;
                boolean z2 = z;
                tinderPlusPaywallTarget2.setupViews(m57131a(c15206b.mo12551c(), d, this.f47286n), offers, z2, c15206b.mo12551c(), ColorScheme.BLUE, paywallItemViewModelColor);
                return;
            }
        }
        tinderPlusPaywallTarget.showErrorMessageAndDismiss();
    }

    /* renamed from: a */
    private void m57134a(@NonNull TinderPlusPaywallTarget tinderPlusPaywallTarget, boolean z) {
        if (!z) {
            tinderPlusPaywallTarget.showRegularOffers();
        } else if (this.f47275c.m57114a()) {
            tinderPlusPaywallTarget.showProgressLoading();
            this.f47288p.a(this.f47275c.m57115b().a(RxUtils.a().m67520b()).a(new C18976o(this), new C18977p(tinderPlusPaywallTarget)));
        } else {
            m57138e();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m57133a(@NonNull TinderPlusPaywallTarget tinderPlusPaywallTarget, Throwable th) {
        C0001a.c(th, "Error fetching discount /purchase/discount/view", new Object[0]);
        tinderPlusPaywallTarget.showRegularOffers();
    }

    /* renamed from: f */
    private void m57139f() {
        this.f47279g.a(this.f47278f.m57273d(C15218b.m57256h().mo12634b(this.f47285m).mo12630a(this.f47284l).mo12629a(Integer.valueOf(this.f47282j)).mo12631a(this.f47286n).mo12632a()));
    }

    /* renamed from: g */
    private void m57140g() {
        this.f47279g.a(this.f47278f.m57274e(C15218b.m57256h().mo12628a(this.f47283k).mo12630a(this.f47284l).mo12629a(Integer.valueOf(this.f47282j)).mo12631a(this.f47286n).mo12632a()));
    }

    /* renamed from: d */
    private void m57137d(@NonNull C14510e c14510e) {
        this.f47279g.a(this.f47278f.m57275f(C15218b.m57256h().mo12628a(c14510e).mo12630a(this.f47284l).mo12629a(Integer.valueOf(this.f47282j)).mo12631a(this.f47286n).mo12632a()));
    }

    /* renamed from: b */
    private void m57135b(int i, int i2) {
        this.f47279g.a(this.f47278f.m57276g(C15218b.m57256h().mo12630a(this.f47284l).mo12629a(Integer.valueOf(this.f47282j)).mo12633b(Integer.valueOf(i)).mo12635c(Integer.valueOf(i2)).mo12632a()));
    }
}
