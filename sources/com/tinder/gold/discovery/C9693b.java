package com.tinder.gold.discovery;

import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3959e;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p453a.p455b.C15674a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0002J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/gold/discovery/ShimmerDiscoveryNavigationViewPresenter;", "", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "target", "Lcom/tinder/gold/discovery/ShimmerDiscoveryNavigationTarget;", "dropTarget", "", "observeSubscription", "takeTarget", "gold_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.gold.discovery.b */
public final class C9693b {
    /* renamed from: a */
    private Disposable f32265a;
    /* renamed from: b */
    private ShimmerDiscoveryNavigationTarget f32266b;
    /* renamed from: c */
    private final SubscriptionProvider f32267c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isGold", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.gold.discovery.b$a */
    static final class C11859a<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C9693b f38685a;

        C11859a(C9693b c9693b) {
            this.f38685a = c9693b;
        }

        public /* synthetic */ void accept(Object obj) {
            m47828a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m47828a(Boolean bool) {
            C2668g.a(bool, "isGold");
            if (bool.booleanValue() != null) {
                bool = this.f38685a.f32266b;
                if (bool != null) {
                    bool.enableShimmer();
                    return;
                }
                return;
            }
            bool = this.f38685a.f32266b;
            if (bool != null) {
                bool.disableShimmer();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.gold.discovery.b$b */
    static final class C11860b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C9693b f38686a;

        C11860b(C9693b c9693b) {
            this.f38686a = c9693b;
        }

        public /* synthetic */ void accept(Object obj) {
            m47829a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47829a(Throwable th) {
            C0001a.c(th, "Error observing subscription", new Object[0]);
            th = this.f38686a.f32266b;
            if (th != null) {
                th.disableShimmer();
            }
        }
    }

    public C9693b(@NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        this.f32267c = subscriptionProvider;
    }

    /* renamed from: a */
    public final void m40149a(@NotNull ShimmerDiscoveryNavigationTarget shimmerDiscoveryNavigationTarget) {
        C2668g.b(shimmerDiscoveryNavigationTarget, "target");
        this.f32266b = shimmerDiscoveryNavigationTarget;
        m40147b();
    }

    /* renamed from: a */
    public final void m40148a() {
        Disposable disposable = this.f32265a;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f32266b = (ShimmerDiscoveryNavigationTarget) null;
    }

    /* renamed from: b */
    private final void m40147b() {
        C3959e toV2Observable = RxJavaInteropExtKt.toV2Observable(this.f32267c.observe());
        Function1 function1 = ShimmerDiscoveryNavigationViewPresenter$observeSubscription$1.f45343a;
        if (function1 != null) {
            function1 = new C11861c(function1);
        }
        this.f32265a = toV2Observable.map((Function) function1).distinctUntilChanged().observeOn(C15674a.a()).subscribe(new C11859a(this), new C11860b(this));
    }
}
