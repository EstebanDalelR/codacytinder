package com.tinder.boost.presenter;

import android.support.annotation.NonNull;
import com.tinder.R;
import com.tinder.boost.model.BoostState;
import com.tinder.boost.p178a.C10400d;
import com.tinder.boost.p178a.C8337b;
import com.tinder.boost.p179b.C10403e;
import com.tinder.boost.provider.C2639c;
import com.tinder.boost.target.BoostPaywallTarget;
import com.tinder.domain.boost.model.BoostStatus;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.profile.model.Tutorial.Boost;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.managers.bk;
import com.tinder.paywall.p305d.C10057a;
import com.tinder.presenters.PresenterBase;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.utils.RxUtils;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.List;
import javax.inject.Inject;
import rx.p500e.C19573b;

/* renamed from: com.tinder.boost.presenter.f */
public class C12628f extends PresenterBase<BoostPaywallTarget> {
    /* renamed from: a */
    private final C15193i f40736a;
    /* renamed from: b */
    private final C10400d f40737b;
    /* renamed from: c */
    private final C10057a f40738c;
    /* renamed from: d */
    private final OfferRepository f40739d;
    /* renamed from: e */
    private final C8337b f40740e;
    /* renamed from: f */
    private final C2639c f40741f;
    /* renamed from: g */
    private final C10403e f40742g;
    /* renamed from: h */
    private final ConfirmTutorialsViewed f40743h;
    /* renamed from: i */
    private final bk f40744i;
    /* renamed from: j */
    private int f40745j;
    /* renamed from: k */
    private final C19573b f40746k = new C19573b();
    /* renamed from: l */
    private final C17356a f40747l = new C17356a();

    /* renamed from: e */
    static final /* synthetic */ void m49862e() throws Exception {
    }

    @Inject
    public C12628f(C15193i c15193i, C10400d c10400d, C10057a c10057a, OfferRepository offerRepository, C8337b c8337b, C2639c c2639c, C10403e c10403e, ConfirmTutorialsViewed confirmTutorialsViewed, bk bkVar) {
        this.f40736a = c15193i;
        this.f40737b = c10400d;
        this.f40738c = c10057a;
        this.f40739d = offerRepository;
        this.f40740e = c8337b;
        this.f40741f = c2639c;
        this.f40742g = c10403e;
        this.f40743h = confirmTutorialsViewed;
        this.f40744i = bkVar;
    }

    /* renamed from: a */
    public void m49865a(int i) {
        this.f40745j = i;
        this.f40746k.a();
        BoostPaywallTarget boostPaywallTarget = (BoostPaywallTarget) H();
        if (boostPaywallTarget != null) {
            this.f40746k.a(this.f40741f.a().a(RxUtils.a()).a(new C13649g(boostPaywallTarget), C13650h.f43493a));
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m49856a(BoostPaywallTarget boostPaywallTarget, BoostState boostState) {
        if (boostState == BoostState.ACTIVATED) {
            boostPaywallTarget.dismiss();
        }
    }

    /* renamed from: a */
    public void m49864a() {
        this.f40746k.a();
        super.a();
    }

    /* renamed from: b */
    public void m49870b() {
        BoostPaywallTarget boostPaywallTarget = (BoostPaywallTarget) H();
        if (boostPaywallTarget != null) {
            List offers = this.f40739d.getOffers(ProductType.BOOST);
            if (!offers.isEmpty()) {
                this.f40747l.add(this.f40742g.execute().a(new C10434j(this, boostPaywallTarget, offers), C10435k.f34016a));
            }
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m49866a(BoostPaywallTarget boostPaywallTarget, List list, TutorialViewStatus tutorialViewStatus) throws Exception {
        boolean a = this.f40736a.a();
        int g = this.f40737b.m42284g();
        if (!a) {
            m49858a(boostPaywallTarget, list, g, tutorialViewStatus);
        } else if (tutorialViewStatus == TutorialViewStatus.VIEWED) {
            m49857a(boostPaywallTarget, list);
        } else {
            m49855a(boostPaywallTarget, g);
        }
        m49860a(a, boostPaywallTarget);
    }

    /* renamed from: a */
    private void m49858a(BoostPaywallTarget boostPaywallTarget, List<C14510e> list, int i, TutorialViewStatus tutorialViewStatus) {
        boostPaywallTarget.displayNonSubscriberPaywall(list, i, tutorialViewStatus == TutorialViewStatus.VIEWED ? true : null, this.f40737b.m42276b());
        this.f40740e.m35501a(this.f40745j);
    }

    /* renamed from: a */
    private void m49855a(BoostPaywallTarget boostPaywallTarget, int i) {
        BoostStatus e = this.f40737b.m42282e();
        boostPaywallTarget.displayFirstTimeSubscriberPaywall(this.f40738c.m41124a((int) R.string.boost_intro_info_title_upsell, e), this.f40738c.m41124a((int) R.string.tinder_plus_free_boost, e), i);
        this.f40740e.m35500a();
    }

    /* renamed from: a */
    private void m49857a(BoostPaywallTarget boostPaywallTarget, List<C14510e> list) {
        boostPaywallTarget.displaySubscriberPaywall(list, this.f40737b.m42280d(), this.f40737b.m42276b(), this.f40737b.m42284g());
        this.f40740e.m35501a(this.f40745j);
    }

    /* renamed from: a */
    private void m49860a(boolean z, BoostPaywallTarget boostPaywallTarget) {
        BoostStatus e = this.f40737b.m42282e();
        if (z) {
            boostPaywallTarget.hideTinderPlusUpsellSection();
        } else {
            boostPaywallTarget.showTinderPlusUpsellSection(this.f40738c.m41124a((int) R.string.tinder_plus_upsell_button_description, e));
        }
    }

    /* renamed from: c */
    public void m49871c() {
        BoostPaywallTarget boostPaywallTarget = (BoostPaywallTarget) H();
        if (boostPaywallTarget != null) {
            this.f40747l.add(this.f40742g.execute().b(C15756a.b()).a(C15674a.a()).a(new C10436l(this, this.f40736a.a(), boostPaywallTarget), C10437m.f34020a));
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m49869a(boolean z, BoostPaywallTarget boostPaywallTarget, TutorialViewStatus tutorialViewStatus) throws Exception {
        if (tutorialViewStatus == TutorialViewStatus.UNSEEN && z) {
            this.f40737b.m42286i();
        } else {
            boostPaywallTarget.purchaseBoost();
        }
    }

    /* renamed from: d */
    public void m49872d() {
        this.f40747l.add(this.f40742g.execute().a(C10438n.f34021a).e(new C10439o(this)).b(C15756a.b()).a(C15674a.a()).a(C10440p.f34023a, C10441q.f34024a));
        this.f40740e.m35505b(this.f40745j);
    }

    /* renamed from: b */
    static final /* synthetic */ boolean m49861b(TutorialViewStatus tutorialViewStatus) throws Exception {
        return tutorialViewStatus == TutorialViewStatus.UNSEEN ? true : null;
    }

    /* renamed from: a */
    final /* synthetic */ CompletableSource m49863a(TutorialViewStatus tutorialViewStatus) throws Exception {
        return this.f40743h.execute(Boost.INSTANCE).b(new C10433i(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m49868a(Disposable disposable) throws Exception {
        this.f40744i.z(true);
    }

    /* renamed from: a */
    public void m49867a(@NonNull C14510e c14510e) {
        this.f40740e.m35502a(this.f40745j, c14510e);
    }
}
