package com.tinder.intropricing.paywall.p265a;

import com.tinder.domain.profile.model.ProductType;
import com.tinder.intropricing.paywall.p266b.C9738d;
import com.tinder.intropricing.paywall.target.IntroPricingPaywallTarget;
import com.tinder.intropricing.paywall.view.offers.C11893b;
import com.tinder.paywall.domain.C10060a;
import com.tinder.paywall.domain.p306a.C10059a;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/intropricing/paywall/presenter/IntroPricingPaywallPresenter;", "", "paywallViewModelFactory", "Lcom/tinder/intropricing/paywall/viewmodels/IntroPricingPaywallViewModelFactory;", "observePaywallUpdate", "Lcom/tinder/paywall/domain/usecase/ObservePaywallUpdate;", "(Lcom/tinder/intropricing/paywall/viewmodels/IntroPricingPaywallViewModelFactory;Lcom/tinder/paywall/domain/usecase/ObservePaywallUpdate;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/intropricing/paywall/target/IntroPricingPaywallTarget;", "dropTarget", "", "observePaywallRepository", "takeTarget", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.intropricing.paywall.a.a */
public final class C9734a {
    /* renamed from: a */
    private IntroPricingPaywallTarget f32336a;
    /* renamed from: b */
    private final C17356a f32337b = new C17356a();
    /* renamed from: c */
    private final C9738d f32338c;
    /* renamed from: d */
    private final C10059a f32339d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOfferViewModel;", "it", "Lcom/tinder/paywall/domain/Paywall;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.intropricing.paywall.a.a$a */
    static final class C11885a<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C9734a f38735a;

        C11885a(C9734a c9734a) {
            this.f38735a = c9734a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47866a((C10060a) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<C11893b> m47866a(@NotNull C10060a c10060a) {
            C2668g.b(c10060a, "it");
            return this.f38735a.f32338c.m40250a(c10060a).m40247a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOfferViewModel;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.intropricing.paywall.a.a$b */
    static final class C11886b<T> implements Predicate<List<? extends C11893b>> {
        /* renamed from: a */
        public static final C11886b f38736a = new C11886b();

        C11886b() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47867a((List) obj);
        }

        /* renamed from: a */
        public final boolean m47867a(@NotNull List<C11893b> list) {
            C2668g.b(list, "it");
            return list.isEmpty() ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOfferViewModel;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.intropricing.paywall.a.a$c */
    static final class C11887c<T> implements Consumer<List<? extends C11893b>> {
        /* renamed from: a */
        final /* synthetic */ C9734a f38737a;

        C11887c(C9734a c9734a) {
            this.f38737a = c9734a;
        }

        public /* synthetic */ void accept(Object obj) {
            m47868a((List) obj);
        }

        /* renamed from: a */
        public final void m47868a(List<C11893b> list) {
            IntroPricingPaywallTarget b = this.f38737a.f32336a;
            if (b != null) {
                C2668g.a(list, "it");
                b.updateOffers(list);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.intropricing.paywall.a.a$d */
    static final class C11888d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11888d f38738a = new C11888d();

        C11888d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47869a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47869a(Throwable th) {
            C0001a.c(th, "Failed while observing paywall updates for intro pricing", new Object[0]);
        }
    }

    @Inject
    public C9734a(@NotNull C9738d c9738d, @NotNull C10059a c10059a) {
        C2668g.b(c9738d, "paywallViewModelFactory");
        C2668g.b(c10059a, "observePaywallUpdate");
        this.f32338c = c9738d;
        this.f32339d = c10059a;
    }

    /* renamed from: a */
    public final void m40236a(@NotNull IntroPricingPaywallTarget introPricingPaywallTarget) {
        C2668g.b(introPricingPaywallTarget, "target");
        this.f32336a = introPricingPaywallTarget;
        m40235a();
    }

    /* renamed from: a */
    public final void m40235a() {
        this.f32337b.add(this.f32339d.m41127a(ProductType.GOLD).subscribeOn(C15756a.b()).observeOn(C15674a.a()).map(new C11885a(this)).filter(C11886b.f38736a).subscribe(new C11887c(this), C11888d.f38738a));
    }

    /* renamed from: b */
    public final void m40237b() {
        this.f32337b.a();
        this.f32336a = (IntroPricingPaywallTarget) null;
    }
}
