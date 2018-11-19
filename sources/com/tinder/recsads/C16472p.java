package com.tinder.recsads;

import com.tinder.addy.AdAggregator;
import com.tinder.addy.AdAggregator.Listener;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.profile.model.ProfileOption.Purchase;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.recsads.model.RecsAdsConfig;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/recsads/RecsAdsMonitorImpl;", "Lcom/tinder/recsads/RecsAdsMonitor;", "adAggregator", "Lcom/tinder/addy/AdAggregator;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "adAggregatorListeners", "", "Lcom/tinder/addy/AdAggregator$Listener;", "recsAdsConfig", "Lcom/tinder/recsads/model/RecsAdsConfig;", "(Lcom/tinder/addy/AdAggregator;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;Ljava/util/Set;Lcom/tinder/recsads/model/RecsAdsConfig;)V", "userSubscriptionDispoable", "Lio/reactivex/disposables/Disposable;", "clear", "", "register", "registrar", "Lcom/tinder/recsads/RecsAdsRegistrar;", "start", "stop", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.p */
public final class C16472p implements RecsAdsMonitor {
    /* renamed from: a */
    private Disposable f51106a;
    /* renamed from: b */
    private final AdAggregator f51107b;
    /* renamed from: c */
    private final LoadProfileOptionData f51108c;
    /* renamed from: d */
    private final Set<Listener> f51109d;
    /* renamed from: e */
    private final RecsAdsConfig f51110e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "subscription", "Lcom/tinder/domain/common/model/Subscription;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.p$a */
    static final class C16471a<T> implements Consumer<Subscription> {
        /* renamed from: a */
        final /* synthetic */ C16472p f51105a;

        C16471a(C16472p c16472p) {
            this.f51105a = c16472p;
        }

        public /* synthetic */ void accept(Object obj) {
            m61893a((Subscription) obj);
        }

        /* renamed from: a */
        public final void m61893a(Subscription subscription) {
            if (subscription.isActiveSubscription() == null || this.f51105a.f51110e.shouldShowAdsInTinderPlus() != null) {
                this.f51105a.f51107b.d();
            } else {
                this.f51105a.f51107b.e();
            }
        }
    }

    public C16472p(@NotNull AdAggregator adAggregator, @NotNull LoadProfileOptionData loadProfileOptionData, @NotNull Set<? extends Listener> set, @NotNull RecsAdsConfig recsAdsConfig) {
        C2668g.b(adAggregator, "adAggregator");
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        C2668g.b(set, "adAggregatorListeners");
        C2668g.b(recsAdsConfig, "recsAdsConfig");
        this.f51107b = adAggregator;
        this.f51108c = loadProfileOptionData;
        this.f51109d = set;
        this.f51110e = recsAdsConfig;
    }

    public void register(@NotNull RecsAdsRegistrar recsAdsRegistrar) {
        C2668g.b(recsAdsRegistrar, "registrar");
        if (!(recsAdsRegistrar instanceof C16470o)) {
            recsAdsRegistrar = null;
        }
        C16470o c16470o = (C16470o) recsAdsRegistrar;
        if (c16470o != null) {
            c16470o.register();
        }
    }

    public void start() {
        for (Listener a : this.f51109d) {
            this.f51107b.a(a);
        }
        this.f51107b.a();
        this.f51106a = this.f51108c.execute(Purchase.INSTANCE).subscribeOn(C15756a.m59010b()).subscribe(new C16471a(this));
    }

    public void stop() {
        this.f51107b.b();
        Disposable disposable = this.f51106a;
        if (disposable != null) {
            disposable.dispose();
        }
        for (Listener b : this.f51109d) {
            this.f51107b.b(b);
        }
    }

    public void clear() {
        this.f51107b.c();
    }
}
