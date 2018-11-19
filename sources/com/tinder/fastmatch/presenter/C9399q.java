package com.tinder.fastmatch.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.common.model.TimeInterval;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.model.FastMatchStatus;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.fastmatch.target.TinderGoldPaywallTarget;
import com.tinder.fastmatch.view.TinderGoldPaywallDialog.C9414b;
import com.tinder.fastmatch.view.UpgradeGoldPaywallItem.C9415a;
import com.tinder.fastmatch.view.UpgradeGoldPaywallItem.C9416b;
import com.tinder.paywall.legacy.GoldPaywallSource;
import com.tinder.paywall.legacy.GoldPaywallSource.C10061a;
import com.tinder.paywall.legacy.ListenerPaywall;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.p304b.C10047a;
import com.tinder.paywall.viewmodels.C10083b;
import com.tinder.paywall.viewmodels.C10093o;
import com.tinder.paywall.viewmodels.PaywallItemViewModelColor;
import com.tinder.paywall.viewmodels.PaywallPerk;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.register.p378a.p379a.C14537a;
import com.tinder.tindergold.p426a.C15183k.C15182b;
import com.tinder.tindergold.p426a.C16915d;
import com.tinder.tindergold.p426a.C16916e;
import com.tinder.tindergold.p426a.C16917f;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.utils.RxUtils;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action1;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ]2\u00020\u0001:\u0001]B_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J \u00105\u001a\u0002062\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020$08j\b\u0012\u0004\u0012\u00020$`9H\u0002J \u0010:\u001a\u0012\u0012\u0004\u0012\u00020$08j\b\u0012\u0004\u0012\u00020$`92\u0006\u0010;\u001a\u00020$H\u0002J \u0010<\u001a\u0012\u0012\u0004\u0012\u00020$08j\b\u0012\u0004\u0012\u00020$`92\u0006\u0010;\u001a\u00020$H\u0002J\u0014\u0010=\u001a\u00020>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@H\u0002J \u0010A\u001a\u0012\u0012\u0004\u0012\u00020$08j\b\u0012\u0004\u0012\u00020$`92\u0006\u0010;\u001a\u00020$H\u0002J\r\u0010B\u001a\u00020\u001cH\u0000¢\u0006\u0002\bCJ\r\u0010D\u001a\u00020\u001cH\u0000¢\u0006\u0002\bEJ&\u0010F\u001a\b\u0012\u0004\u0012\u00020G0#2\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020$08j\b\u0012\u0004\u0012\u00020$`9H\u0002J\u0015\u0010H\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020$H\u0000¢\u0006\u0002\bJJ\u0019\u0010K\u001a\u0004\u0018\u00010@2\b\u0010I\u001a\u0004\u0018\u00010$H\u0000¢\u0006\u0002\bLJ\u000e\u0010M\u001a\u0002062\u0006\u0010?\u001a\u00020@J \u0010N\u001a\u00020O2\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020$08j\b\u0012\u0004\u0012\u00020$`9H\u0002J \u0010P\u001a\u00020O2\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020$08j\b\u0012\u0004\u0012\u00020$`9H\u0002J\u000e\u0010Q\u001a\u0002062\u0006\u0010?\u001a\u00020@J\r\u0010R\u001a\u000206H\u0001¢\u0006\u0002\bSJ \u0010T\u001a\u0002062\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020$08j\b\u0012\u0004\u0012\u00020$`9H\u0002J\b\u0010U\u001a\u000206H\u0002J\r\u0010V\u001a\u000206H\u0001¢\u0006\u0002\bWJ\u000e\u0010X\u001a\u0002062\u0006\u0010Y\u001a\u00020ZJ\u0010\u0010[\u001a\u0002062\u0006\u0010I\u001a\u00020$H\u0002J\u000e\u0010\\\u001a\u0002062\u0006\u0010?\u001a\u00020@R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010/\u001a\u0002008\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006^"}, d2 = {"Lcom/tinder/fastmatch/presenter/TinderGoldPaywallPresenter;", "", "offerRepository", "Lcom/tinder/purchase/domain/repository/OfferRepository;", "perksViewModelAdapter", "Lcom/tinder/paywall/perks/PaywallPerkViewModelAdapter;", "plusInteractor", "Lcom/tinder/tinderplus/interactors/TinderPlusInteractor;", "upgradeGoldPaywallViewModelFactory", "Lcom/tinder/fastmatch/view/UpgradeGoldPaywallItem$ViewModelFactory;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "fastMatchStatusProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "firstPerkResolver", "Lcom/tinder/paywall/viewmodels/FirstPerkResolver;", "addGoldPaywallViewEvent", "Lcom/tinder/tindergold/analytics/AddGoldPaywallViewEvent;", "addGoldPaywallSelectEvent", "Lcom/tinder/tindergold/analytics/AddGoldPaywallSelectEvent;", "addGoldPaywallCancelEvent", "Lcom/tinder/tindergold/analytics/AddGoldPaywallCancelEvent;", "topPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "(Lcom/tinder/purchase/domain/repository/OfferRepository;Lcom/tinder/paywall/perks/PaywallPerkViewModelAdapter;Lcom/tinder/tinderplus/interactors/TinderPlusInteractor;Lcom/tinder/fastmatch/view/UpgradeGoldPaywallItem$ViewModelFactory;Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;Lcom/tinder/paywall/viewmodels/FirstPerkResolver;Lcom/tinder/tindergold/analytics/AddGoldPaywallViewEvent;Lcom/tinder/tindergold/analytics/AddGoldPaywallSelectEvent;Lcom/tinder/tindergold/analytics/AddGoldPaywallCancelEvent;Lcom/tinder/domain/config/TopPicksConfig;)V", "compositeSubscriptions", "Lrx/subscriptions/CompositeSubscription;", "fromSource", "", "getFromSource", "()Ljava/lang/Integer;", "setFromSource", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "imageUrls", "", "", "getImageUrls", "()Ljava/util/List;", "setImageUrls", "(Ljava/util/List;)V", "listener", "Lcom/tinder/paywall/legacy/ListenerPaywall;", "getListener", "()Lcom/tinder/paywall/legacy/ListenerPaywall;", "setListener", "(Lcom/tinder/paywall/legacy/ListenerPaywall;)V", "target", "Lcom/tinder/fastmatch/target/TinderGoldPaywallTarget;", "getTarget$Tinder_release", "()Lcom/tinder/fastmatch/target/TinderGoldPaywallTarget;", "setTarget$Tinder_release", "(Lcom/tinder/fastmatch/target/TinderGoldPaywallTarget;)V", "addTopPicksToSet", "", "perks", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "createCarouselPerks", "firstPerk", "createDefaultCarouselPerks", "createEventOptions", "Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory$Options;", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "createUpgradeCarouselPerks", "getLikesNumForAnalytics", "getLikesNumForAnalytics$Tinder_release", "getPaywallVersion", "getPaywallVersion$Tinder_release", "getPerkOrder", "Lcom/tinder/paywall/viewmodels/PaywallPerkViewModel;", "getSubscriptionLength", "ownedProductId", "getSubscriptionLength$Tinder_release", "getUpgradeOffer", "getUpgradeOffer$Tinder_release", "handleItemSelected", "hasTopPicksPerk", "", "hasTopPicksTeasersPerk", "onDismiss", "onDropTarget", "onDropTarget$Tinder_release", "removeDuplicateTopPicksPerkIfNecessary", "sendPaywallViewEvent", "setBasePaywallView", "setBasePaywallView$Tinder_release", "setPaywallOptions", "options", "Lcom/tinder/fastmatch/view/TinderGoldPaywallDialog$Options;", "setUpgradeView", "startPurchaseProcess", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.presenter.q */
public final class C9399q {
    /* renamed from: b */
    public static final C9398a f31509b = new C9398a();
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public TinderGoldPaywallTarget f31510a;
    @Nullable
    /* renamed from: c */
    private ListenerPaywall f31511c;
    @Nullable
    /* renamed from: d */
    private Integer f31512d;
    @Nullable
    /* renamed from: e */
    private List<String> f31513e;
    /* renamed from: f */
    private final C19573b f31514f = new C19573b();
    /* renamed from: g */
    private final OfferRepository f31515g;
    /* renamed from: h */
    private final C10047a f31516h;
    /* renamed from: i */
    private final C15193i f31517i;
    /* renamed from: j */
    private final C9416b f31518j;
    /* renamed from: k */
    private final SubscriptionProvider f31519k;
    /* renamed from: l */
    private final FastMatchStatusProvider f31520l;
    /* renamed from: m */
    private final C10083b f31521m;
    /* renamed from: n */
    private final C16917f f31522n;
    /* renamed from: o */
    private final C16916e f31523o;
    /* renamed from: p */
    private final C16915d f31524p;
    /* renamed from: q */
    private final TopPicksConfig f31525q;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/fastmatch/presenter/TinderGoldPaywallPresenter$Companion;", "", "()V", "DEFAULT_LIKES_NUM", "", "GOLD_SUBSCRIBER_LIKES_NUM_DEFAULT", "LIKES_NUM_MIN_THRESHOLD", "NON_PLUS_SUBSCRIBER_LIKES_PREVIEW", "NON_PLUS_SUBSCRIBER_NO_LIKES", "PLUS_SUBSCRIBER_LIKES_PREVIEW", "PLUS_SUBSCRIBER_NO_LIKES", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.q$a */
    public static final class C9398a {
        private C9398a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "upgradeViewModel", "Lcom/tinder/fastmatch/view/UpgradeGoldPaywallItem$ViewModel;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.q$b */
    static final class C13940b<T> implements Action1<C9415a> {
        /* renamed from: a */
        final /* synthetic */ C9399q f44065a;

        C13940b(C9399q c9399q) {
            this.f44065a = c9399q;
        }

        public /* synthetic */ void call(Object obj) {
            m53466a((C9415a) obj);
        }

        /* renamed from: a */
        public final void m53466a(@Nullable C9415a c9415a) {
            if (c9415a != null) {
                this.f44065a.m39334a().showGoldUpgrade(c9415a);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "error", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.q$c */
    static final class C13941c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13941c f44066a = new C13941c();

        C13941c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53467a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53467a(@Nullable Throwable th) {
            C0001a.c(th);
        }
    }

    @Inject
    public C9399q(@NotNull OfferRepository offerRepository, @NotNull C10047a c10047a, @NotNull C15193i c15193i, @NotNull C9416b c9416b, @NotNull SubscriptionProvider subscriptionProvider, @NotNull FastMatchStatusProvider fastMatchStatusProvider, @NotNull C10083b c10083b, @NotNull C16917f c16917f, @NotNull C16916e c16916e, @NotNull C16915d c16915d, @NotNull TopPicksConfig topPicksConfig) {
        C2668g.b(offerRepository, "offerRepository");
        C2668g.b(c10047a, "perksViewModelAdapter");
        C2668g.b(c15193i, "plusInteractor");
        C2668g.b(c9416b, "upgradeGoldPaywallViewModelFactory");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(fastMatchStatusProvider, "fastMatchStatusProvider");
        C2668g.b(c10083b, "firstPerkResolver");
        C2668g.b(c16917f, "addGoldPaywallViewEvent");
        C2668g.b(c16916e, "addGoldPaywallSelectEvent");
        C2668g.b(c16915d, "addGoldPaywallCancelEvent");
        C2668g.b(topPicksConfig, "topPicksConfig");
        this.f31515g = offerRepository;
        this.f31516h = c10047a;
        this.f31517i = c15193i;
        this.f31518j = c9416b;
        this.f31519k = subscriptionProvider;
        this.f31520l = fastMatchStatusProvider;
        this.f31521m = c10083b;
        this.f31522n = c16917f;
        this.f31523o = c16916e;
        this.f31524p = c16915d;
        this.f31525q = topPicksConfig;
    }

    @NotNull
    /* renamed from: a */
    public final TinderGoldPaywallTarget m39334a() {
        TinderGoldPaywallTarget tinderGoldPaywallTarget = this.f31510a;
        if (tinderGoldPaywallTarget == null) {
            C2668g.b("target");
        }
        return tinderGoldPaywallTarget;
    }

    /* renamed from: a */
    public final void m39336a(@NotNull C9414b c9414b) {
        C2668g.b(c9414b, "options");
        this.f31511c = c9414b.m39366b();
        this.f31512d = Integer.valueOf(c9414b.m39362a());
        this.f31513e = c9414b.m39367c();
        m39333f();
    }

    /* renamed from: a */
    public final void m39337a(@NotNull C14510e c14510e) {
        C2668g.b(c14510e, "offer");
        this.f31523o.a(m39327d(c14510e)).b(Schedulers.io()).d();
    }

    /* renamed from: b */
    public final void m39340b(@NotNull C14510e c14510e) {
        C2668g.b(c14510e, "offer");
        ListenerPaywall listenerPaywall = this.f31511c;
        if (listenerPaywall != null) {
            c14510e = c14510e.a();
            C2668g.a(c14510e, "offer.productId()");
            listenerPaywall.onPayClicked(c14510e);
        }
    }

    /* renamed from: c */
    public final void m39342c(@NotNull C14510e c14510e) {
        C2668g.b(c14510e, "offer");
        this.f31524p.a(m39327d(c14510e)).b(Schedulers.io()).d();
    }

    @Take
    /* renamed from: b */
    public final void m39339b() {
        TinderGoldPaywallTarget tinderGoldPaywallTarget;
        C10061a c10061a = GoldPaywallSource.Companion;
        Integer num = this.f31512d;
        boolean z = false;
        PaywallTypeSource a = c10061a.m41129a(num != null ? num.intValue() : 0);
        C10083b c10083b = this.f31521m;
        if (a == null) {
            a = GoldPaywallSource.FASTMATCH_MATCHLIST_PREVIEW;
        }
        PaywallPerk a2 = c10083b.m41200a(a);
        List offers = this.f31515g.getOffers(ProductType.GOLD);
        LinkedHashSet d = m39328d(a2.getStringVal());
        if (!offers.isEmpty()) {
            if (!d.isEmpty()) {
                List b = m39324b(d);
                if (this.f31520l.get().getCount() > 0) {
                    z = true;
                }
                TinderGoldPaywallTarget tinderGoldPaywallTarget2 = this.f31510a;
                if (tinderGoldPaywallTarget2 == null) {
                    C2668g.b("target");
                }
                tinderGoldPaywallTarget2.showPerksCarousel(b, z);
                Subscription subscription = this.f31519k.get();
                if (subscription.isPlus()) {
                    m39325c(subscription.getProductId());
                } else {
                    tinderGoldPaywallTarget = this.f31510a;
                    if (tinderGoldPaywallTarget == null) {
                        C2668g.b("target");
                    }
                    C2668g.a(offers, "offers");
                    tinderGoldPaywallTarget.showGoldPaywallForNonSubscribers(offers, PaywallItemViewModelColor.GOLD);
                }
                return;
            }
        }
        tinderGoldPaywallTarget = this.f31510a;
        if (tinderGoldPaywallTarget == null) {
            C2668g.b("target");
        }
        tinderGoldPaywallTarget.showErrorAndDismiss();
    }

    @Drop
    /* renamed from: c */
    public final void m39341c() {
        this.f31514f.unsubscribe();
    }

    /* renamed from: d */
    public final int m39343d() {
        Integer num = this.f31512d;
        int analyticsSource = GoldPaywallSource.FASTMATCH_MATCHLIST_PREVIEW.getAnalyticsSource();
        if (num != null) {
            if (num.intValue() == analyticsSource) {
                return this.f31519k.get().isPlus() ? 3 : 1;
            }
        }
        return this.f31519k.get().isPlus() ? 2 : 0;
    }

    /* renamed from: e */
    public final int m39344e() {
        FastMatchStatus fastMatchStatus = this.f31520l.get();
        int i = 0;
        if (fastMatchStatus.getCount() < 2) {
            return 0;
        }
        if (this.f31519k.get().isGold()) {
            return -1;
        }
        if (fastMatchStatus.getCount() >= 0) {
            i = fastMatchStatus.getCount();
        }
        return i;
    }

    @Nullable
    /* renamed from: a */
    public final C14510e m39335a(@Nullable String str) {
        C14510e c14510e = null;
        if (str == null) {
            return null;
        }
        str = m39338b(str);
        List offers = this.f31515g.getOffers(ProductType.GOLD);
        C2668g.a(offers, "offerRepository.getOffers(ProductType.GOLD)");
        for (C14510e next : offers) {
            Object obj;
            TimeInterval e = next.e();
            if (e == null || e.length() != str) {
                obj = null;
                continue;
            } else {
                obj = 1;
                continue;
            }
            if (obj != null) {
                c14510e = next;
                break;
            }
        }
        return c14510e;
    }

    /* renamed from: b */
    public final int m39338b(@NotNull String str) {
        C2668g.b(str, "ownedProductId");
        C14510e offer = this.f31515g.getOffer(str);
        int i = 0;
        if (offer != null) {
            str = offer.e();
            if (str != null) {
                i = str.length();
            }
            return i;
        }
        Matcher matcher = Pattern.compile("\\d*m").matcher(str);
        if (matcher.find()) {
            str = str.substring(matcher.start(), matcher.end() - 1);
            C2668g.a(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return Integer.parseInt(str);
        } else if (C14537a.a(str) != null) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: c */
    private final void m39325c(String str) {
        C14510e a = m39335a(str);
        C14510e offer = this.f31515g.getOffer(str);
        if (a != null) {
            if (offer != null) {
                str = this.f31518j.m39377a(a, offer);
                TinderGoldPaywallTarget tinderGoldPaywallTarget = this.f31510a;
                if (tinderGoldPaywallTarget == null) {
                    C2668g.b("target");
                }
                tinderGoldPaywallTarget.showGoldUpgrade(str);
                return;
            }
            TinderGoldPaywallTarget tinderGoldPaywallTarget2 = this.f31510a;
            if (tinderGoldPaywallTarget2 == null) {
                C2668g.b("target");
            }
            tinderGoldPaywallTarget2.prepGoldUpgradeState();
            this.f31518j.m39378a(a, str).a(RxUtils.a().a()).a(new C13940b(this), C13941c.f44066a);
        }
    }

    /* renamed from: d */
    private final LinkedHashSet<String> m39328d(String str) {
        if (this.f31519k.get().isPlus()) {
            return m39332f(str);
        }
        return m39330e(str);
    }

    /* renamed from: e */
    private final LinkedHashSet<String> m39330e(String str) {
        List<String> d = this.f31517i.d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(str);
        linkedHashSet.add(PaywallPerk.FAST_MATCH.getStringVal());
        if (this.f31525q.isEnabled() != null) {
            m39323a(linkedHashSet);
        }
        C2668g.a(d, "perks");
        for (String add : d) {
            linkedHashSet.add(add);
        }
        return linkedHashSet;
    }

    /* renamed from: f */
    private final LinkedHashSet<String> m39332f(String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(str);
        linkedHashSet.add(PaywallPerk.FAST_MATCH.getStringVal());
        if (this.f31525q.isEnabled() != null) {
            m39323a(linkedHashSet);
        }
        linkedHashSet.add(PaywallPerk.TINDER_PLUS_FEATURES.getStringVal());
        return linkedHashSet;
    }

    /* renamed from: a */
    private final void m39323a(LinkedHashSet<String> linkedHashSet) {
        if (!linkedHashSet.contains(PaywallPerk.TOP_PICKS_FEATURE.getStringVal()) || !linkedHashSet.contains(PaywallPerk.TOP_PICKS_TEASER.getStringVal())) {
            linkedHashSet.add(PaywallPerk.TOP_PICKS_FEATURE.getStringVal());
        }
    }

    /* renamed from: b */
    private final List<C10093o> m39324b(LinkedHashSet<String> linkedHashSet) {
        List list = this.f31513e;
        m39326c((LinkedHashSet) linkedHashSet);
        if (list == null || (list.isEmpty() ^ 1) == 0) {
            return C10047a.m41100a(this.f31516h, C19301m.l(linkedHashSet), this.f31520l.get(), null, 4, null);
        }
        return this.f31516h.m41102a(C19301m.l(linkedHashSet), this.f31520l.get(), list);
    }

    /* renamed from: f */
    private final void m39333f() {
        this.f31522n.a(C9399q.m39322a(this, null, 1, null)).b(Schedulers.io()).d();
    }

    /* renamed from: a */
    static /* synthetic */ C15182b m39322a(C9399q c9399q, C14510e c14510e, int i, Object obj) {
        if ((i & 1) != 0) {
            c14510e = null;
        }
        return c9399q.m39327d(c14510e);
    }

    /* renamed from: d */
    private final C15182b m39327d(C14510e c14510e) {
        Integer num;
        int analyticsSource;
        int e;
        Integer valueOf;
        Number number;
        if (c14510e != null) {
            c14510e = c14510e.a();
            if (c14510e != null) {
                num = this.f31512d;
                analyticsSource = GoldPaywallSource.FASTMATCH_MATCHLIST_PREVIEW.getAnalyticsSource();
                if (num == null) {
                    if (num.intValue() == analyticsSource) {
                        e = m39344e();
                        valueOf = Integer.valueOf(m39343d());
                        number = this.f31512d;
                        C2668g.a(c14510e, "productId");
                        return new C15182b(valueOf, number, e, c14510e);
                    }
                }
                e = 0;
                valueOf = Integer.valueOf(m39343d());
                number = this.f31512d;
                C2668g.a(c14510e, "productId");
                return new C15182b(valueOf, number, e, c14510e);
            }
        }
        c14510e = "";
        num = this.f31512d;
        analyticsSource = GoldPaywallSource.FASTMATCH_MATCHLIST_PREVIEW.getAnalyticsSource();
        if (num == null) {
            if (num.intValue() == analyticsSource) {
                e = m39344e();
                valueOf = Integer.valueOf(m39343d());
                number = this.f31512d;
                C2668g.a(c14510e, "productId");
                return new C15182b(valueOf, number, e, c14510e);
            }
        }
        e = 0;
        valueOf = Integer.valueOf(m39343d());
        number = this.f31512d;
        C2668g.a(c14510e, "productId");
        return new C15182b(valueOf, number, e, c14510e);
    }

    /* renamed from: c */
    private final void m39326c(LinkedHashSet<String> linkedHashSet) {
        if (m39331e((LinkedHashSet) linkedHashSet) && m39329d((LinkedHashSet) linkedHashSet)) {
            linkedHashSet.remove(PaywallPerk.TOP_PICKS_FEATURE.getStringVal());
        }
    }

    /* renamed from: d */
    private final boolean m39329d(LinkedHashSet<String> linkedHashSet) {
        return linkedHashSet.contains(PaywallPerk.TOP_PICKS_FEATURE.getStringVal());
    }

    /* renamed from: e */
    private final boolean m39331e(LinkedHashSet<String> linkedHashSet) {
        return linkedHashSet.contains(PaywallPerk.TOP_PICKS_TEASER.getStringVal());
    }
}
