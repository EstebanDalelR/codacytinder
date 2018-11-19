package com.tinder.match.sponsoredmessage;

import com.tinder.ads.Ad;
import com.tinder.ads.AdAggregator;
import com.tinder.ads.AdAggregator$Listener;
import com.tinder.ads.AdRegistrar;
import com.tinder.ads.AdSource;
import com.tinder.ads.DfpFieldsResolverImpl;
import com.tinder.ads.MessageAd;
import com.tinder.ads.MessageAd.SponsoredMessageAdFactory;
import com.tinder.ads.NativeDfpSourceBuilderFactory;
import com.tinder.ads.analytics.V1AnalyticsAdAggregatorListener;
import com.tinder.ads.module.AdsQualifiers$Match;
import com.tinder.ads.source.dfp.DfpCustomTargetingValues;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.recsads.model.C14754b;
import com.tinder.scope.ActivityScope;
import com.tinder.sponsoredmessage.AdRequestRule;
import com.tinder.sponsoredmessage.C15032a;
import com.tinder.sponsoredmessage.C15034e;
import com.tinder.utils.RxUtils;
import hugo.weaving.DebugLog;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Single;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0014\b\u0007\u0018\u00002\u00020\u0001:\u0002%&B9\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011J\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001dJ\b\u0010 \u001a\u00020\u001aH\u0002J\b\u0010!\u001a\u00020\u001aH\u0002J\u000e\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011J\u0006\u0010#\u001a\u00020\u001aJ\u0006\u0010$\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/tinder/match/sponsoredmessage/V1SponsoredMessageAdMonitor;", "", "adAggregator", "Lcom/tinder/ads/AdAggregator;", "adRegistrar", "Lcom/tinder/match/sponsoredmessage/V1SponsoredMessageAdMonitor$SponsoredMessageAdRegistrar;", "v1AnalyticsAdAggregatorListener", "Lcom/tinder/ads/analytics/V1AnalyticsAdAggregatorListener;", "viewedSponsoredMessageCache", "Lcom/tinder/match/sponsoredmessage/ViewedSponsoredMessageCache;", "requestRules", "Lcom/tinder/sponsoredmessage/AdRequestRuleSet;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Lcom/tinder/ads/AdAggregator;Lcom/tinder/match/sponsoredmessage/V1SponsoredMessageAdMonitor$SponsoredMessageAdRegistrar;Lcom/tinder/ads/analytics/V1AnalyticsAdAggregatorListener;Lcom/tinder/match/sponsoredmessage/ViewedSponsoredMessageCache;Lcom/tinder/sponsoredmessage/AdRequestRuleSet;Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "listeners", "Ljava/util/HashSet;", "Lcom/tinder/match/sponsoredmessage/V1SponsoredMessageAdMonitor$Listener;", "Lkotlin/collections/HashSet;", "matchAdListener", "com/tinder/match/sponsoredmessage/V1SponsoredMessageAdMonitor$matchAdListener$1", "Lcom/tinder/match/sponsoredmessage/V1SponsoredMessageAdMonitor$matchAdListener$1;", "rulesSubscription", "Lrx/Subscription;", "subscriptionProviderSubscription", "addListener", "", "listener", "consumeAd", "Lrx/Single;", "Ljava8/util/Optional;", "Lcom/tinder/ads/MessageAd;", "evaluateRequestRulesAndInitializeAggregator", "initializeAdAggregator", "removeListener", "start", "stop", "Listener", "SponsoredMessageAdRegistrar", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ActivityScope
public final class V1SponsoredMessageAdMonitor {
    /* renamed from: a */
    private Subscription f32712a;
    /* renamed from: b */
    private Subscription f32713b;
    /* renamed from: c */
    private final HashSet<Listener> f32714c = new HashSet();
    /* renamed from: d */
    private final C12081i f32715d = new C12081i(this);
    /* renamed from: e */
    private final AdAggregator f32716e;
    /* renamed from: f */
    private final C12080a f32717f;
    /* renamed from: g */
    private final V1AnalyticsAdAggregatorListener f32718g;
    /* renamed from: h */
    private final ViewedSponsoredMessageCache f32719h;
    /* renamed from: i */
    private final C15032a f32720i;
    /* renamed from: j */
    private final SubscriptionProvider f32721j;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/match/sponsoredmessage/V1SponsoredMessageAdMonitor$Listener;", "", "onSponsoredMatchAdAvailable", "", "sponsoredMessageAd", "Lcom/tinder/ads/MessageAd;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onSponsoredMatchAdAvailable(@NotNull MessageAd messageAd);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/match/sponsoredmessage/V1SponsoredMessageAdMonitor$SponsoredMessageAdRegistrar;", "Lcom/tinder/ads/AdRegistrar;", "config", "Lcom/tinder/sponsoredmessage/SponsoredMessageConfig;", "adFactory", "Lcom/tinder/ads/MessageAd$SponsoredMessageAdFactory;", "dfpFieldsResolver", "Lcom/tinder/ads/DfpFieldsResolverImpl;", "dfpSourceBuilderFactory", "Lcom/tinder/ads/NativeDfpSourceBuilderFactory;", "(Lcom/tinder/sponsoredmessage/SponsoredMessageConfig;Lcom/tinder/ads/MessageAd$SponsoredMessageAdFactory;Lcom/tinder/ads/DfpFieldsResolverImpl;Lcom/tinder/ads/NativeDfpSourceBuilderFactory;)V", "dfpFieldsResolverSubscription", "Lrx/Subscription;", "registerAdSources", "", "adAggregator", "Lcom/tinder/ads/AdAggregator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor$a */
    public static final class C12080a extends AdRegistrar {
        /* renamed from: a */
        private Subscription f39225a;
        /* renamed from: b */
        private final C15034e f39226b;
        /* renamed from: c */
        private final SponsoredMessageAdFactory f39227c;
        /* renamed from: d */
        private final DfpFieldsResolverImpl f39228d;
        /* renamed from: e */
        private final NativeDfpSourceBuilderFactory f39229e;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/recsads/model/DfpAdFields;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor$a$a */
        static final class C14065a<T> implements Action1<C14754b> {
            /* renamed from: a */
            final /* synthetic */ C12080a f44578a;
            /* renamed from: b */
            final /* synthetic */ AdAggregator f44579b;

            C14065a(C12080a c12080a, AdAggregator adAggregator) {
                this.f44578a = c12080a;
                this.f44579b = adAggregator;
            }

            public /* synthetic */ void call(Object obj) {
                m53790a((C14754b) obj);
            }

            /* renamed from: a */
            public final void m53790a(C14754b c14754b) {
                this.f44579b.addSource(this.f44578a.f39229e.newBuilder().adsUnitId(this.f44578a.f39226b.b()).adFactory(this.f44578a.f39227c).templateId(this.f44578a.f39226b.c()).location(c14754b.a()).customTargetingValues(new DfpCustomTargetingValues(c14754b.b(), c14754b.c())).build());
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor$a$b */
        static final class C14066b<T> implements Action1<Throwable> {
            /* renamed from: a */
            public static final C14066b f44580a = new C14066b();

            C14066b() {
            }

            public /* synthetic */ void call(Object obj) {
                m53791a((Throwable) obj);
            }

            /* renamed from: a */
            public final void m53791a(Throwable th) {
                C0001a.c(th);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor$a$c */
        static final class C14067c implements Action0 {
            /* renamed from: a */
            final /* synthetic */ AdAggregator f44581a;

            C14067c(AdAggregator adAggregator) {
                this.f44581a = adAggregator;
            }

            public final void call() {
                this.f44581a.startBuffering();
            }
        }

        public C12080a(@NotNull C15034e c15034e, @NotNull SponsoredMessageAdFactory sponsoredMessageAdFactory, @NotNull DfpFieldsResolverImpl dfpFieldsResolverImpl, @NotNull NativeDfpSourceBuilderFactory nativeDfpSourceBuilderFactory) {
            C2668g.b(c15034e, "config");
            C2668g.b(sponsoredMessageAdFactory, "adFactory");
            C2668g.b(dfpFieldsResolverImpl, "dfpFieldsResolver");
            C2668g.b(nativeDfpSourceBuilderFactory, "dfpSourceBuilderFactory");
            this.f39226b = c15034e;
            this.f39227c = sponsoredMessageAdFactory;
            this.f39228d = dfpFieldsResolverImpl;
            this.f39229e = nativeDfpSourceBuilderFactory;
        }

        public void registerAdSources(@NotNull AdAggregator adAggregator) {
            C2668g.b(adAggregator, "adAggregator");
            if (this.f39226b.a() && !RxUtils.a(this.f39225a)) {
                this.f39225a = this.f39228d.resolveDfpFields().b(Schedulers.io()).a(new C14065a(this, adAggregator), C14066b.f44580a, new C14067c(adAggregator));
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\r"}, d2 = {"com/tinder/match/sponsoredmessage/V1SponsoredMessageAdMonitor$matchAdListener$1", "Lcom/tinder/ads/AdAggregator$Listener;", "(Lcom/tinder/match/sponsoredmessage/V1SponsoredMessageAdMonitor;)V", "onAdAdded", "", "ad", "Lcom/tinder/ads/Ad;", "onAdFailed", "source", "Lcom/tinder/ads/AdSource;", "exception", "", "onAdRequestSent", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor$i */
    public static final class C12081i implements AdAggregator$Listener {
        /* renamed from: a */
        final /* synthetic */ V1SponsoredMessageAdMonitor f39230a;

        C12081i(V1SponsoredMessageAdMonitor v1SponsoredMessageAdMonitor) {
            this.f39230a = v1SponsoredMessageAdMonitor;
        }

        public void onAdAdded(@NotNull Ad<?> ad) {
            C2668g.b(ad, "ad");
            MessageAd messageAd = (MessageAd) ad;
            Iterator it = this.f39230a.f32714c.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onSponsoredMatchAdAvailable(messageAd);
            }
        }

        public void onAdFailed(@NotNull AdSource adSource, @NotNull Throwable th) {
            C2668g.b(adSource, "source");
            C2668g.b(th, "exception");
            C0001a.c(th, th.getMessage(), new Object[0]);
        }

        @DebugLog
        public void onAdRequestSent(@NotNull AdSource adSource) {
            C2668g.b(adSource, "source");
            C0001a.b("sending Sponsored Message ad request", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava8/util/Optional;", "Lcom/tinder/ads/MessageAd;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/ads/Ad;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor$b */
    static final class C13439b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13439b f42629a = new C13439b();

        C13439b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m51937a((Ad) obj);
        }

        /* renamed from: a */
        public final Optional<MessageAd> m51937a(@Nullable Ad<?> ad) {
            return ad != null ? Optional.a((MessageAd) ad) : Optional.a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012*\u0010\u0004\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava8/util/Optional;", "Lcom/tinder/ads/MessageAd;", "kotlin.jvm.PlatformType", "it", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor$c */
    static final class C13440c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ V1SponsoredMessageAdMonitor f42630a;

        C13440c(V1SponsoredMessageAdMonitor v1SponsoredMessageAdMonitor) {
            this.f42630a = v1SponsoredMessageAdMonitor;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51938a((Optional) obj);
        }

        /* renamed from: a */
        public final Optional<MessageAd> m51938a(Optional<MessageAd> optional) {
            C2668g.a(optional, "it");
            if (!optional.c()) {
                return optional;
            }
            ViewedSponsoredMessageCache b = this.f42630a.f32719h;
            Object b2 = optional.b();
            C2668g.a(b2, "it.get()");
            return b.exists((MessageAd) b2) ? Optional.a() : optional;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/sponsoredmessage/AdRequestRule;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor$e */
    static final class C13441e<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        public static final C13441e f42631a = new C13441e();

        C13441e() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m51939a((AdRequestRule) obj);
        }

        /* renamed from: a */
        public final Observable<Boolean> m51939a(AdRequestRule adRequestRule) {
            return adRequestRule.shouldRequestAd().a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "list", "", "kotlin.jvm.PlatformType", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor$f */
    static final class C13442f<T, R> implements Func1<List<Boolean>, Boolean> {
        /* renamed from: a */
        public static final C13442f f42632a = new C13442f();

        C13442f() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51940a((List) obj));
        }

        /* renamed from: a */
        public final boolean m51940a(List<Boolean> list) {
            C2668g.a(list, "list");
            Iterable<Boolean> iterable = list;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return true;
            }
            for (Boolean a : iterable) {
                if (!C2668g.a(a, Boolean.valueOf(true))) {
                    return false;
                }
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava8/util/Optional;", "Lcom/tinder/ads/MessageAd;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor$d */
    static final class C14068d<T> implements Action1<Optional<MessageAd>> {
        /* renamed from: a */
        final /* synthetic */ V1SponsoredMessageAdMonitor f44582a;

        C14068d(V1SponsoredMessageAdMonitor v1SponsoredMessageAdMonitor) {
            this.f44582a = v1SponsoredMessageAdMonitor;
        }

        public /* synthetic */ void call(Object obj) {
            m53792a((Optional) obj);
        }

        /* renamed from: a */
        public final void m53792a(Optional<MessageAd> optional) {
            C2668g.a(optional, "it");
            if (optional.c()) {
                ViewedSponsoredMessageCache b = this.f44582a.f32719h;
                optional = optional.b();
                C2668g.a(optional, "it.get()");
                b.add((MessageAd) optional);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor$g */
    static final class C14069g<T> implements Action1<List<Boolean>> {
        /* renamed from: a */
        final /* synthetic */ V1SponsoredMessageAdMonitor f44583a;

        C14069g(V1SponsoredMessageAdMonitor v1SponsoredMessageAdMonitor) {
            this.f44583a = v1SponsoredMessageAdMonitor;
        }

        public /* synthetic */ void call(Object obj) {
            m53793a((List) obj);
        }

        /* renamed from: a */
        public final void m53793a(List<Boolean> list) {
            this.f44583a.m40651d();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor$h */
    static final class C14070h<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14070h f44584a = new C14070h();

        C14070h() {
        }

        public /* synthetic */ void call(Object obj) {
            m53794a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53794a(Throwable th) {
            C0001a.c(th, "Error subscribing to Message Ad Request Rules", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/common/model/Subscription;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor$j */
    static final class C14071j<T> implements Action1<com.tinder.domain.common.model.Subscription> {
        /* renamed from: a */
        final /* synthetic */ V1SponsoredMessageAdMonitor f44585a;

        C14071j(V1SponsoredMessageAdMonitor v1SponsoredMessageAdMonitor) {
            this.f44585a = v1SponsoredMessageAdMonitor;
        }

        public /* synthetic */ void call(Object obj) {
            m53795a((com.tinder.domain.common.model.Subscription) obj);
        }

        /* renamed from: a */
        public final void m53795a(com.tinder.domain.common.model.Subscription subscription) {
            if (subscription.isActiveSubscription() != null) {
                this.f44585a.f32716e.disable();
            } else {
                this.f44585a.f32716e.enable();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor$k */
    static final class C14072k<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14072k f44586a = new C14072k();

        C14072k() {
        }

        public /* synthetic */ void call(Object obj) {
            m53796a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53796a(Throwable th) {
            C0001a.c(th, "Failed to subscribe to Subscription updates", new Object[0]);
        }
    }

    @Inject
    public V1SponsoredMessageAdMonitor(@NotNull @AdsQualifiers$Match AdAggregator adAggregator, @NotNull C12080a c12080a, @NotNull V1AnalyticsAdAggregatorListener v1AnalyticsAdAggregatorListener, @NotNull ViewedSponsoredMessageCache viewedSponsoredMessageCache, @NotNull C15032a c15032a, @NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.b(adAggregator, "adAggregator");
        C2668g.b(c12080a, "adRegistrar");
        C2668g.b(v1AnalyticsAdAggregatorListener, "v1AnalyticsAdAggregatorListener");
        C2668g.b(viewedSponsoredMessageCache, "viewedSponsoredMessageCache");
        C2668g.b(c15032a, "requestRules");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        this.f32716e = adAggregator;
        this.f32717f = c12080a;
        this.f32718g = v1AnalyticsAdAggregatorListener;
        this.f32719h = viewedSponsoredMessageCache;
        this.f32720i = c15032a;
        this.f32721j = subscriptionProvider;
    }

    /* renamed from: a */
    public final void m40653a() {
        m40652e();
        this.f32713b = this.f32721j.observe().b(Schedulers.io()).a(new C14071j(this), C14072k.f44586a);
    }

    /* renamed from: b */
    public final void m40654b() {
        this.f32716e.stopBuffering();
        this.f32716e.removeListener(this.f32718g);
        this.f32716e.removeListener(this.f32715d);
        RxUtils.b(this.f32712a);
        RxUtils.b(this.f32713b);
    }

    @NotNull
    /* renamed from: c */
    public final Single<Optional<MessageAd>> m40655c() {
        Single<Optional<MessageAd>> d = Single.a(this.f32716e.consumeAd()).d(C13439b.f42629a).d(new C13440c(this)).d(new C14068d(this));
        C2668g.a(d, "Single.just(adAggregator…sageCache.add(it.get()) }");
        return d;
    }

    /* renamed from: d */
    private final void m40651d() {
        this.f32716e.addListener(this.f32718g);
        this.f32716e.addListener(this.f32715d);
        if (!this.f32716e.isInitialized()) {
            this.f32716e.initialize(this.f32717f);
        }
    }

    /* renamed from: e */
    private final void m40652e() {
        this.f32712a = Observable.a(this.f32720i.a()).h(C13441e.f42631a).v().f(C13442f.f42632a).b(Schedulers.io()).a(new C14069g(this), C14070h.f44584a);
    }
}
