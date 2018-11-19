package com.tinder.intropricing.di;

import android.content.res.Resources;
import com.tinder.intropricing.di.IntroPricingApplicationComponent.Builder;
import com.tinder.intropricing.di.IntroPricingApplicationComponent.Parent;
import com.tinder.intropricing.paywall.p265a.C9734a;
import com.tinder.intropricing.paywall.p266b.C9738d;
import com.tinder.intropricing.paywall.view.C11890a;
import com.tinder.intropricing.paywall.view.IntroPricingPaywallView;
import com.tinder.paywall.domain.PaywallRepository;
import com.tinder.paywall.domain.p306a.C10059a;
import com.tinder.purchase.domain.p374a.C14489a;
import dagger.internal.C15521i;

/* renamed from: com.tinder.intropricing.di.a */
public final class C3932a implements IntroPricingApplicationComponent {
    /* renamed from: a */
    private Resources f12307a;
    /* renamed from: b */
    private Parent f12308b;

    private C3932a(a$a a_a) {
        m14832a(a_a);
    }

    /* renamed from: a */
    public static Builder m14830a() {
        return new a$a(null);
    }

    /* renamed from: b */
    private C9738d m14833b() {
        return new C9738d(this.f12307a, new C14489a());
    }

    /* renamed from: c */
    private C10059a m14834c() {
        return new C10059a((PaywallRepository) C15521i.a(this.f12308b.paywallRepository(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: d */
    private C9734a m14835d() {
        return new C9734a(m14833b(), m14834c());
    }

    /* renamed from: a */
    private void m14832a(a$a a_a) {
        this.f12307a = a$a.a(a_a);
        this.f12308b = a$a.b(a_a);
    }

    public void inject(IntroPricingPaywallView introPricingPaywallView) {
        m14831a(introPricingPaywallView);
    }

    /* renamed from: a */
    private IntroPricingPaywallView m14831a(IntroPricingPaywallView introPricingPaywallView) {
        C11890a.a(introPricingPaywallView, m14835d());
        return introPricingPaywallView;
    }
}
