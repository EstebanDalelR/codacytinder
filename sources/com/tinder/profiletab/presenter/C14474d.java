package com.tinder.profiletab.presenter;

import com.tinder.boost.p178a.C10400d;
import com.tinder.boost.provider.BoostUpdateProvider;
import com.tinder.boost.repository.BoostStatusRepository;
import com.tinder.controlla.model.AdvertisingPageType;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.boost.model.BoostStatus;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.superlike.SuperlikeStatus;
import com.tinder.domain.tinderplus.LikeStatus;
import com.tinder.intropricing.controlla.C9729a;
import com.tinder.intropricing.domain.model.C9732b;
import com.tinder.intropricing.domain.p264a.C9730a;
import com.tinder.module.ViewScope;
import com.tinder.paywall.legacy.GoldPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.profile.p366e.C14408a;
import com.tinder.profile.p366e.C14409b;
import com.tinder.profile.target.ControllaTarget;
import com.tinder.profile.view.ControllaView.Page;
import com.tinder.profile.view.ControllaView.State;
import com.tinder.superlike.p421e.C15082f;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import com.tinder.utils.RxUtils;
import hu.akarnokd.rxjava.interop.C15551e;
import io.reactivex.BackpressureStrategy;
import java.util.Collections;
import javax.annotation.Nullable;
import javax.inject.Inject;
import org.joda.time.DateTime;
import rx.p500e.C19573b;

@ViewScope
/* renamed from: com.tinder.profiletab.presenter.d */
public class C14474d {
    @DeadshotTarget
    /* renamed from: a */
    ControllaTarget f45818a;
    /* renamed from: b */
    private final BoostUpdateProvider f45819b;
    /* renamed from: c */
    private final C15082f f45820c;
    /* renamed from: d */
    private final C10400d f45821d;
    /* renamed from: e */
    private final LikeStatusProvider f45822e;
    /* renamed from: f */
    private final C14409b f45823f;
    /* renamed from: g */
    private final BoostStatusRepository f45824g;
    /* renamed from: h */
    private final SubscriptionProvider f45825h;
    /* renamed from: i */
    private final FastMatchConfigProvider f45826i;
    /* renamed from: j */
    private final C19573b f45827j = new C19573b();
    /* renamed from: k */
    private final C14471a f45828k;
    /* renamed from: l */
    private State f45829l;
    @Nullable
    /* renamed from: m */
    private AdvertisingPageType f45830m;
    /* renamed from: n */
    private final C9730a f45831n;

    /* renamed from: com.tinder.profiletab.presenter.d$1 */
    static /* synthetic */ class C144731 {
        /* renamed from: b */
        static final /* synthetic */ int[] f45817b = new int[AdvertisingPageType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.controlla.model.AdvertisingPageType.values();
            r0 = r0.length;
            r0 = new int[r0];
            f45817b = r0;
            r0 = 1;
            r1 = f45817b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.tinder.controlla.model.AdvertisingPageType.REWIND;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f45817b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.tinder.controlla.model.AdvertisingPageType.UNLIMITED_LIKES;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = f45817b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = com.tinder.controlla.model.AdvertisingPageType.TINDER_PLUS;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = f45817b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4 = com.tinder.controlla.model.AdvertisingPageType.SUPERLIKES;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r3[r4] = r5;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r3 = f45817b;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r4 = com.tinder.controlla.model.AdvertisingPageType.BOOST;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r3[r4] = r5;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r3 = f45817b;	 Catch:{ NoSuchFieldError -> 0x004b }
            r4 = com.tinder.controlla.model.AdvertisingPageType.PASSPORT;	 Catch:{ NoSuchFieldError -> 0x004b }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r5 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
            r3[r4] = r5;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r3 = com.tinder.profile.view.ControllaView.State.values();
            r3 = r3.length;
            r3 = new int[r3];
            f45816a = r3;
            r3 = f45816a;	 Catch:{ NoSuchFieldError -> 0x005e }
            r4 = com.tinder.profile.view.ControllaView.State.TINDER_GOLD;	 Catch:{ NoSuchFieldError -> 0x005e }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x005e }
            r3[r4] = r0;	 Catch:{ NoSuchFieldError -> 0x005e }
        L_0x005e:
            r0 = f45816a;	 Catch:{ NoSuchFieldError -> 0x0068 }
            r3 = com.tinder.profile.view.ControllaView.State.TINDER_PLUS;	 Catch:{ NoSuchFieldError -> 0x0068 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0068 }
            r0[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x0068 }
        L_0x0068:
            r0 = f45816a;	 Catch:{ NoSuchFieldError -> 0x0072 }
            r1 = com.tinder.profile.view.ControllaView.State.CAROUSEL;	 Catch:{ NoSuchFieldError -> 0x0072 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0072 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0072 }
        L_0x0072:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.profiletab.presenter.d.1.<clinit>():void");
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m55251a(BoostStatus boostStatus) {
        m55242b(boostStatus);
    }

    /* renamed from: a */
    final /* synthetic */ void m55252a(SuperlikeStatus superlikeStatus) {
        m55243b(superlikeStatus);
    }

    @Inject
    public C14474d(BoostUpdateProvider boostUpdateProvider, C15082f c15082f, C10400d c10400d, C14409b c14409b, LikeStatusProvider likeStatusProvider, BoostStatusRepository boostStatusRepository, SubscriptionProvider subscriptionProvider, FastMatchConfigProvider fastMatchConfigProvider, C14471a c14471a, C9730a c9730a) {
        this.f45819b = boostUpdateProvider;
        this.f45820c = c15082f;
        this.f45821d = c10400d;
        this.f45823f = c14409b;
        this.f45822e = likeStatusProvider;
        this.f45824g = boostStatusRepository;
        this.f45825h = subscriptionProvider;
        this.f45826i = fastMatchConfigProvider;
        this.f45828k = c14471a;
        this.f45831n = c9730a;
    }

    @Take
    /* renamed from: a */
    void m55249a() {
        m55256a(m55248q());
    }

    @Take
    /* renamed from: b */
    void m55259b() {
        this.f45827j.a(this.f45825h.observe().k(C17785e.f55489a).a(RxUtils.a()).a(new C18599f(this), C18603n.f58015a));
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m55238a(Subscription subscription) {
        if (!subscription.isPlus()) {
            if (subscription.isGold() == null) {
                subscription = null;
                return Boolean.valueOf(subscription);
            }
        }
        subscription = true;
        return Boolean.valueOf(subscription);
    }

    /* renamed from: a */
    final /* synthetic */ void m55257a(Boolean bool) {
        m55256a(m55248q());
    }

    @Take
    /* renamed from: c */
    void m55260c() {
        this.f45827j.a(this.f45822e.observeLikeStatusUpdates().a(RxUtils.a()).a(new C18604o(this), C18605p.f58017a));
    }

    /* renamed from: a */
    final /* synthetic */ void m55253a(LikeStatus likeStatus) {
        m55256a(m55248q());
    }

    @Take
    /* renamed from: d */
    void m55261d() {
        this.f45827j.a(C15551e.m58077a(this.f45831n.a(), BackpressureStrategy.LATEST).a(RxUtils.a()).a(new C18606q(this), C18607r.f58019a));
    }

    /* renamed from: a */
    final /* synthetic */ void m55254a(C9732b c9732b) {
        if (c9732b.a() != null) {
            this.f45818a.bindIntroPricing(new C9729a(DateTime.a().b(36000), 25));
            this.f45818a.changePage(Page.INTRO_PRICING);
            return;
        }
        this.f45818a.changePage(Page.CONTROLLA);
    }

    @Drop
    /* renamed from: e */
    void m55262e() {
        RxUtils.b(this.f45827j);
        this.f45818a.stopCarouselTimer();
    }

    /* renamed from: m */
    private void m55244m() {
        m55245n();
        m55246o();
        boolean z = this.f45826i.get().isEnabled() && this.f45829l == State.TINDER_PLUS;
        m55240a(z);
    }

    /* renamed from: a */
    private void m55240a(boolean z) {
        this.f45818a.setUpgradeGoldButtonVisibility(z);
    }

    /* renamed from: n */
    private void m55245n() {
        this.f45827j.a(this.f45820c.m56838e().a(RxUtils.a()).a(new C18608s(this), C18609t.f58021a));
    }

    /* renamed from: o */
    private void m55246o() {
        this.f45827j.a(this.f45824g.observeBoostStatus().a(RxUtils.a()).a(new C18610u(this), C18600g.f58012a));
    }

    /* renamed from: b */
    private void m55242b(BoostStatus boostStatus) {
        this.f45818a.updateBoostCount(boostStatus.getRemaining());
        m55247p();
    }

    /* renamed from: p */
    private void m55247p() {
        if (this.f45821d.isUserBoosting()) {
            this.f45827j.a(this.f45819b.b().a(RxUtils.a()).a(new C18601h(this), C18602i.f58014a));
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m55258a(Long l) {
        this.f45818a.updateBoostTimer(l.longValue());
    }

    /* renamed from: b */
    private void m55243b(@Nullable SuperlikeStatus superlikeStatus) {
        this.f45818a.updateSuperLikesCount(superlikeStatus == null ? null : superlikeStatus.remainingCount());
    }

    /* renamed from: f */
    public void m55263f() {
        this.f45818a.launchPaywallFlow(this.f45828k.m55237b());
    }

    /* renamed from: g */
    public void m55264g() {
        ControllaTarget controllaTarget = this.f45818a;
        C10076o a = this.f45828k.m55234a();
        C10400d c10400d = this.f45821d;
        c10400d.getClass();
        controllaTarget.launchPaywallFlow(a.a(C16187j.m61147a(c10400d)));
    }

    /* renamed from: h */
    public void m55265h() {
        this.f45818a.launchPaywallFlow(this.f45828k.m55236a(GoldPaywallSource.CONTROLLA_FASTMATCH_FEATURE).a(new C16188k(this)));
    }

    /* renamed from: l */
    final /* synthetic */ void m55269l() {
        m55256a(m55248q());
    }

    /* renamed from: a */
    public void m55250a(AdvertisingPageType advertisingPageType) {
        this.f45818a.stopCarouselTimer();
        C10076o a = this.f45828k.m55235a(advertisingPageType);
        if (advertisingPageType != AdvertisingPageType.GOLD) {
            a.a(Collections.singletonList(Integer.valueOf(m55241b(advertisingPageType))));
        }
        this.f45818a.launchPaywallFlow(a.a(new C16189l(this)).a(new C16190m(this)));
    }

    /* renamed from: k */
    final /* synthetic */ void m55268k() {
        this.f45818a.startCarouselTimer();
    }

    /* renamed from: j */
    final /* synthetic */ void m55267j() {
        m55256a(m55248q());
    }

    /* renamed from: i */
    public void m55266i() {
        if (this.f45830m == AdvertisingPageType.GOLD && this.f45829l == State.CAROUSEL) {
            m55250a(AdvertisingPageType.GOLD);
        } else {
            this.f45818a.launchTPlusControlActivity();
        }
    }

    /* renamed from: a */
    public void m55255a(C14408a c14408a) {
        this.f45830m = c14408a.mo11614e();
        this.f45818a.updateButton(this.f45829l, this.f45830m);
    }

    /* renamed from: a */
    void m55256a(State state) {
        if (this.f45829l != state) {
            this.f45829l = state;
            switch (state) {
                case TINDER_GOLD:
                    m55240a(false);
                    break;
                case TINDER_PLUS:
                    break;
                case CAROUSEL:
                    this.f45818a.setViewModels(this.f45823f.m54862a());
                    break;
                default:
                    break;
            }
            m55244m();
            this.f45818a.bindState(state, this.f45830m);
        }
    }

    /* renamed from: q */
    private State m55248q() {
        if (this.f45826i.get().isEnabled() && this.f45825h.get().isGold()) {
            return State.TINDER_GOLD;
        }
        if (this.f45825h.get().isPlus()) {
            return State.TINDER_PLUS;
        }
        if (this.f45822e.isOutOfLikes()) {
            return State.OUT_OF_LIKES;
        }
        return State.CAROUSEL;
    }

    /* renamed from: b */
    private int m55241b(AdvertisingPageType advertisingPageType) {
        switch (C144731.f45817b[advertisingPageType.ordinal()]) {
            case 1:
                return 6;
            case 2:
                return 4;
            case 3:
                return 9;
            case 4:
                return 5;
            case 5:
                return 8;
            case 6:
                return null;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid AdvertisingPageType: ");
                stringBuilder.append(advertisingPageType.name());
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
