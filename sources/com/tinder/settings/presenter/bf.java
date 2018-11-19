package com.tinder.settings.presenter;

import com.tinder.boost.p178a.C10400d;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.settings.targets.SettingsPurchaseTarget;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.tinderplus.p428a.C15193i;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\r\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u0018H\u0001¢\u0006\u0002\b\u001bJ\r\u0010\u001c\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!J\u0015\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020 H\u0000¢\u0006\u0002\b$R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/tinder/settings/presenter/SettingsPurchasePresenter;", "", "plusInteractor", "Lcom/tinder/tinderplus/interactors/TinderPlusInteractor;", "superlikeInteractor", "Lcom/tinder/superlike/interactors/SuperlikeInteractor;", "boostInteractor", "Lcom/tinder/boost/interactor/BoostInteractor;", "offerRepository", "Lcom/tinder/purchase/domain/repository/OfferRepository;", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Lcom/tinder/tinderplus/interactors/TinderPlusInteractor;Lcom/tinder/superlike/interactors/SuperlikeInteractor;Lcom/tinder/boost/interactor/BoostInteractor;Lcom/tinder/purchase/domain/repository/OfferRepository;Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "target", "Lcom/tinder/settings/targets/SettingsPurchaseTarget;", "getTarget$Tinder_release", "()Lcom/tinder/settings/targets/SettingsPurchaseTarget;", "setTarget$Tinder_release", "(Lcom/tinder/settings/targets/SettingsPurchaseTarget;)V", "clear", "", "clear$Tinder_release", "observeSubscriptionStatus", "observeSubscriptionStatus$Tinder_release", "setConsumableVisiblity", "setConsumableVisiblity$Tinder_release", "setTinderGoldVisibility", "isGold", "", "setTinderGoldVisibility$Tinder_release", "setTinderPlusVisibility", "isPlus", "setTinderPlusVisibility$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class bf {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public SettingsPurchaseTarget f46582a;
    /* renamed from: b */
    private Disposable f46583b;
    /* renamed from: c */
    private final C15193i f46584c;
    /* renamed from: d */
    private final C15071e f46585d;
    /* renamed from: e */
    private final C10400d f46586e;
    /* renamed from: f */
    private final OfferRepository f46587f;
    /* renamed from: g */
    private final FastMatchConfigProvider f46588g;
    /* renamed from: h */
    private final SubscriptionProvider f46589h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/common/model/Subscription;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.bf$a */
    static final class C16650a<T> implements Consumer<Subscription> {
        /* renamed from: a */
        final /* synthetic */ bf f51557a;

        C16650a(bf bfVar) {
            this.f51557a = bfVar;
        }

        public /* synthetic */ void accept(Object obj) {
            m62114a((Subscription) obj);
        }

        /* renamed from: a */
        public final void m62114a(Subscription subscription) {
            this.f51557a.m56362a(subscription.isPlus());
            this.f51557a.m56364b(subscription.isGold());
            this.f51557a.m56365c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "e", "", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.bf$b */
    static final class C16651b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16651b f51558a = new C16651b();

        C16651b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62115a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62115a(@NotNull Throwable th) {
            C2668g.b(th, "e");
            C0001a.c(th, "Error observing purchase info", new Object[0]);
        }
    }

    @Inject
    public bf(@NotNull C15193i c15193i, @NotNull C15071e c15071e, @NotNull C10400d c10400d, @NotNull OfferRepository offerRepository, @NotNull FastMatchConfigProvider fastMatchConfigProvider, @NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.b(c15193i, "plusInteractor");
        C2668g.b(c15071e, "superlikeInteractor");
        C2668g.b(c10400d, "boostInteractor");
        C2668g.b(offerRepository, "offerRepository");
        C2668g.b(fastMatchConfigProvider, "fastMatchConfigProvider");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        this.f46584c = c15193i;
        this.f46585d = c15071e;
        this.f46586e = c10400d;
        this.f46587f = offerRepository;
        this.f46588g = fastMatchConfigProvider;
        this.f46589h = subscriptionProvider;
    }

    @Take
    /* renamed from: a */
    public final void m56361a() {
        this.f46583b = RxJavaInteropExtKt.toV2Observable(this.f46589h.observe()).observeOn(C15674a.m58830a()).subscribe(new C16650a(this), C16651b.f51558a);
    }

    @Drop
    /* renamed from: b */
    public final void m56363b() {
        Disposable disposable = this.f46583b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: a */
    public final void m56362a(boolean z) {
        List offers = this.f46587f.getOffers(ProductType.PLUS);
        if (!this.f46584c.m57123c() || z || offers.isEmpty()) {
            z = this.f46582a;
            if (!z) {
                C2668g.b("target");
            }
            z.hideTinderPlus();
            return;
        }
        z = this.f46582a;
        if (!z) {
            C2668g.b("target");
        }
        z.showTinderPlus();
    }

    /* renamed from: b */
    public final void m56364b(boolean z) {
        List offers = this.f46587f.getOffers(ProductType.GOLD);
        if (!this.f46588g.get().isEnabled() || z || offers.isEmpty()) {
            z = this.f46582a;
            if (!z) {
                C2668g.b("target");
            }
            z.hideTinderGold();
            return;
        }
        z = this.f46582a;
        if (!z) {
            C2668g.b("target");
        }
        z.showTinderGold();
    }

    /* renamed from: c */
    public final void m56365c() {
        List offers = this.f46587f.getOffers(ProductType.BOOST);
        List offers2 = this.f46587f.getOffers(ProductType.SUPERLIKE);
        Object obj = null;
        Object obj2 = (!this.f46586e.a() || offers.isEmpty()) ? null : 1;
        if (this.f46585d.m56817a() && !offers2.isEmpty()) {
            obj = 1;
        }
        SettingsPurchaseTarget settingsPurchaseTarget;
        if (obj != null) {
            settingsPurchaseTarget = this.f46582a;
            if (settingsPurchaseTarget == null) {
                C2668g.b("target");
            }
            settingsPurchaseTarget.showSuperlike();
            if (obj2 == null) {
                settingsPurchaseTarget = this.f46582a;
                if (settingsPurchaseTarget == null) {
                    C2668g.b("target");
                }
                settingsPurchaseTarget.showStandaloneSuperlike();
            }
        } else {
            settingsPurchaseTarget = this.f46582a;
            if (settingsPurchaseTarget == null) {
                C2668g.b("target");
            }
            settingsPurchaseTarget.hideSuperlike();
        }
        SettingsPurchaseTarget settingsPurchaseTarget2;
        if (obj2 != null) {
            settingsPurchaseTarget2 = this.f46582a;
            if (settingsPurchaseTarget2 == null) {
                C2668g.b("target");
            }
            settingsPurchaseTarget2.showBoost();
            if (obj == null) {
                settingsPurchaseTarget2 = this.f46582a;
                if (settingsPurchaseTarget2 == null) {
                    C2668g.b("target");
                }
                settingsPurchaseTarget2.showStandaloneBoost();
                return;
            }
            return;
        }
        settingsPurchaseTarget2 = this.f46582a;
        if (settingsPurchaseTarget2 == null) {
            C2668g.b("target");
        }
        settingsPurchaseTarget2.hideBoost();
    }
}
