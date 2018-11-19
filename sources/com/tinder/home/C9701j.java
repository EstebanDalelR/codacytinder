package com.tinder.home;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.home.ShimmerHomeTabTarget.IconType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0010H\u0007R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tinder/home/ShimmerHomeTabPresenter;", "", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "subscription", "Lrx/Subscription;", "getSubscriptionProvider", "()Lcom/tinder/domain/purchase/SubscriptionProvider;", "target", "Lcom/tinder/home/ShimmerHomeTabTarget;", "getTarget$Tinder_release", "()Lcom/tinder/home/ShimmerHomeTabTarget;", "setTarget$Tinder_release", "(Lcom/tinder/home/ShimmerHomeTabTarget;)V", "subscribeToGoldStatusUpdates", "", "unsubscribe", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.home.j */
public final class C9701j {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public ShimmerHomeTabTarget f32282a;
    /* renamed from: b */
    private Subscription f32283b;
    @NotNull
    /* renamed from: c */
    private final SubscriptionProvider f32284c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "goldStatus", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.home.j$a */
    static final class C14041a<T> implements Action1<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C9701j f44471a;

        C14041a(C9701j c9701j) {
            this.f44471a = c9701j;
        }

        public /* synthetic */ void call(Object obj) {
            m53711a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m53711a(Boolean bool) {
            if (C2668g.a(bool, Boolean.valueOf(true))) {
                bool = IconType.SAVORY_SHIMMER;
            } else if (C2668g.a(bool, Boolean.valueOf(false)) != null) {
                bool = IconType.REGULAR_RED;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            this.f44471a.m40159a().setIconType(bool);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.home.j$b */
    static final class C14042b<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C9701j f44472a;

        C14042b(C9701j c9701j) {
            this.f44472a = c9701j;
        }

        public /* synthetic */ void call(Object obj) {
            m53712a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53712a(Throwable th) {
            C0001a.c(th);
            this.f44472a.m40159a().setIconType(IconType.REGULAR_RED);
        }
    }

    public C9701j(@NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        this.f32284c = subscriptionProvider;
    }

    @NotNull
    /* renamed from: a */
    public final ShimmerHomeTabTarget m40159a() {
        ShimmerHomeTabTarget shimmerHomeTabTarget = this.f32282a;
        if (shimmerHomeTabTarget == null) {
            C2668g.b("target");
        }
        return shimmerHomeTabTarget;
    }

    @Take
    /* renamed from: b */
    public final void m40160b() {
        Observable observe = this.f32284c.observe();
        Function1 function1 = ShimmerHomeTabPresenter$subscribeToGoldStatusUpdates$1.f45344a;
        if (function1 != null) {
            function1 = new C13328k(function1);
        }
        this.f32283b = observe.k((Func1) function1).e(Boolean.valueOf(false)).g().a(C19397a.a()).a(new C14041a(this), new C14042b(this));
    }

    @Drop
    /* renamed from: c */
    public final void m40161c() {
        Subscription subscription = this.f32283b;
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }
}
