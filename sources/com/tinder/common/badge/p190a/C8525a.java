package com.tinder.common.badge.p190a;

import com.tinder.common.badge.target.BadgeAttributionTarget;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.feed.view.model.ActivityFeedViewModel.Attribution;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0007R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/tinder/common/badge/presenter/BadgeAttributionPresenter;", "", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "attribution", "Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;", "purchaseSubscription", "Lrx/Subscription;", "target", "Lcom/tinder/common/badge/target/BadgeAttributionTarget;", "getTarget$Tinder_release", "()Lcom/tinder/common/badge/target/BadgeAttributionTarget;", "setTarget$Tinder_release", "(Lcom/tinder/common/badge/target/BadgeAttributionTarget;)V", "drop", "", "observeFastMatchSubscriptionProvider", "onBindAttribution", "onUpdateAttribution", "resolveAttribution", "take", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.badge.a.a */
public final class C8525a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public BadgeAttributionTarget f30269a;
    /* renamed from: b */
    private Subscription f30270b;
    /* renamed from: c */
    private Attribution f30271c = Attribution.NONE;
    /* renamed from: d */
    private final FastMatchConfigProvider f30272d;
    /* renamed from: e */
    private final SubscriptionProvider f30273e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "goldSubscription", "Lcom/tinder/domain/common/model/Subscription;", "call", "(Lcom/tinder/domain/common/model/Subscription;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.badge.a.a$a */
    static final class C12774a<T, R> implements Func1<com.tinder.domain.common.model.Subscription, Boolean> {
        /* renamed from: a */
        public static final C12774a f41158a = new C12774a();

        C12774a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50234a((com.tinder.domain.common.model.Subscription) obj);
        }

        @Nullable
        /* renamed from: a */
        public final Boolean m50234a(@Nullable com.tinder.domain.common.model.Subscription subscription) {
            return subscription != null ? Boolean.valueOf(subscription.isGold()) : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/common/model/Subscription;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.badge.a.a$b */
    static final class C13759b<T> implements Action1<com.tinder.domain.common.model.Subscription> {
        /* renamed from: a */
        final /* synthetic */ C8525a f43736a;

        C13759b(C8525a c8525a) {
            this.f43736a = c8525a;
        }

        public /* synthetic */ void call(Object obj) {
            m53336a((com.tinder.domain.common.model.Subscription) obj);
        }

        /* renamed from: a */
        public final void m53336a(com.tinder.domain.common.model.Subscription subscription) {
            if (this.f43736a.f30272d.get().isEnabled() != null) {
                subscription = this.f43736a.m36486a();
                subscription.showBadgeAttribution(Attribution.LIKES_YOU);
                subscription.enableShimmer();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.badge.a.a$c */
    static final class C13760c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13760c f43737a = new C13760c();

        C13760c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53337a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53337a(Throwable th) {
            C0001a.c(th, "Error observing Subscription Provider for BadgeAttributionIcon", new Object[0]);
        }
    }

    @Inject
    public C8525a(@NotNull FastMatchConfigProvider fastMatchConfigProvider, @NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.b(fastMatchConfigProvider, "fastMatchConfigProvider");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        this.f30272d = fastMatchConfigProvider;
        this.f30273e = subscriptionProvider;
    }

    @NotNull
    /* renamed from: a */
    public final BadgeAttributionTarget m36486a() {
        BadgeAttributionTarget badgeAttributionTarget = this.f30269a;
        if (badgeAttributionTarget == null) {
            C2668g.b("target");
        }
        return badgeAttributionTarget;
    }

    @Take
    /* renamed from: b */
    public final void m36488b() {
        m36484d();
    }

    @Drop
    /* renamed from: c */
    public final void m36490c() {
        RxUtils.b(this.f30270b);
    }

    /* renamed from: a */
    public final void m36487a(@NotNull Attribution attribution) {
        C2668g.b(attribution, "attribution");
        this.f30271c = attribution;
    }

    /* renamed from: b */
    public final void m36489b(@NotNull Attribution attribution) {
        C2668g.b(attribution, "attribution");
        if (this.f30271c != attribution) {
            this.f30271c = attribution;
            RxUtils.b(this.f30270b);
            m36484d();
        }
    }

    /* renamed from: d */
    private final void m36484d() {
        BadgeAttributionTarget badgeAttributionTarget;
        switch (C8526b.f30274a[this.f30271c.ordinal()]) {
            case 1:
                badgeAttributionTarget = this.f30269a;
                if (badgeAttributionTarget == null) {
                    C2668g.b("target");
                }
                badgeAttributionTarget.hideBadgeAttribution();
                return;
            case 2:
                m36485e();
                return;
            case 3:
                badgeAttributionTarget = this.f30269a;
                if (badgeAttributionTarget == null) {
                    C2668g.b("target");
                }
                badgeAttributionTarget.showBadgeAttribution(this.f30271c);
                badgeAttributionTarget.enableShimmer();
                return;
            default:
                badgeAttributionTarget = this.f30269a;
                if (badgeAttributionTarget == null) {
                    C2668g.b("target");
                }
                badgeAttributionTarget.showBadgeAttribution(this.f30271c);
                badgeAttributionTarget.disableShimmer();
                return;
        }
    }

    /* renamed from: e */
    private final void m36485e() {
        this.f30270b = this.f30273e.observe().f(C12774a.f41158a).h().a().b(Schedulers.io()).a(C19397a.a()).a(new C13759b(this), C13760c.f43737a);
    }
}
