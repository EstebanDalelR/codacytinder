package com.tinder.intropricing.p344b;

import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.intropricing.domain.model.C9732b;
import com.tinder.intropricing.domain.model.IntroPricingPaywallType;
import com.tinder.intropricing.domain.repo.IntroPricingApplicationRepository;
import com.tinder.intropricing.domain.worker.IntroPricingWorker;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.usecase.C16242a;
import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.C15756a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/intropricing/worker/IntroPricingAvailabilityWorker;", "Lcom/tinder/intropricing/domain/worker/IntroPricingWorker;", "offerRepository", "Lcom/tinder/purchase/domain/repository/OfferRepository;", "introPricingApplicationRepository", "Lcom/tinder/intropricing/domain/repo/IntroPricingApplicationRepository;", "checkPurchaseDiscountEligibility", "Lcom/tinder/purchase/usecase/CheckPurchaseDiscountEligibility;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "(Lcom/tinder/purchase/domain/repository/OfferRepository;Lcom/tinder/intropricing/domain/repo/IntroPricingApplicationRepository;Lcom/tinder/purchase/usecase/CheckPurchaseDiscountEligibility;Lkotlin/jvm/functions/Function0;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getPaywallType", "Lcom/tinder/intropricing/domain/model/IntroPricingPaywallType;", "offers", "", "Lcom/tinder/purchase/domain/model/Offer;", "isDiscountValid", "", "onStart", "", "onStop", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.intropricing.b.a */
public final class C11884a implements IntroPricingWorker {
    /* renamed from: a */
    private C17356a f38728a = new C17356a();
    /* renamed from: b */
    private final OfferRepository f38729b;
    /* renamed from: c */
    private final IntroPricingApplicationRepository f38730c;
    /* renamed from: d */
    private final C16242a f38731d;
    /* renamed from: e */
    private final Function0<DateTime> f38732e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/tinder/intropricing/domain/model/IntroPricingPaywallType;", "isEnabled", "offerList", "", "Lcom/tinder/purchase/domain/model/Offer;", "apply", "(Ljava/lang/Boolean;Ljava/util/List;)Lkotlin/Pair;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.intropricing.b.a$a */
    static final class C11879a<T1, T2, R> implements BiFunction<Boolean, List<? extends C14510e>, Pair<? extends Boolean, ? extends IntroPricingPaywallType>> {
        /* renamed from: a */
        final /* synthetic */ C11884a f38723a;

        C11879a(C11884a c11884a) {
            this.f38723a = c11884a;
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m47851a((Boolean) obj, (List) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final Pair<Boolean, IntroPricingPaywallType> m47851a(@NotNull Boolean bool, @NotNull List<? extends C14510e> list) {
            C2668g.b(bool, "isEnabled");
            C2668g.b(list, "offerList");
            bool = (bool.booleanValue() == null || this.f38723a.m47858a((List) list) == null) ? null : true;
            return C15811g.a(Boolean.valueOf(bool), this.f38723a.m47860b((List) list));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/tinder/intropricing/domain/model/IntroPricingAvailability;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lcom/tinder/intropricing/domain/model/IntroPricingPaywallType;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.intropricing.b.a$b */
    static final class C11881b<T, R> implements Function<T, ObservableSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C11884a f38725a;

        C11881b(C11884a c11884a) {
            this.f38725a = c11884a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47853a((Pair) obj);
        }

        /* renamed from: a */
        public final C3959e<C9732b> m47853a(@NotNull Pair<Boolean, ? extends IntroPricingPaywallType> pair) {
            C2668g.b(pair, "<name for destructuring parameter 0>");
            boolean booleanValue = ((Boolean) pair.c()).booleanValue();
            final IntroPricingPaywallType introPricingPaywallType = (IntroPricingPaywallType) pair.d();
            if (booleanValue) {
                return this.f38725a.f38731d.execute().e().map(new Function<T, R>() {
                    public /* synthetic */ Object apply(Object obj) {
                        return m47852a((Boolean) obj);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C9732b m47852a(@NotNull Boolean bool) {
                        C2668g.b(bool, "it");
                        return new C9732b(bool.booleanValue(), introPricingPaywallType);
                    }
                });
            }
            return C3959e.just(new C9732b(booleanValue, introPricingPaywallType));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/intropricing/domain/model/IntroPricingAvailability;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.intropricing.b.a$c */
    static final class C11882c<T> implements Consumer<C9732b> {
        /* renamed from: a */
        final /* synthetic */ C11884a f38726a;

        C11882c(C11884a c11884a) {
            this.f38726a = c11884a;
        }

        public /* synthetic */ void accept(Object obj) {
            m47854a((C9732b) obj);
        }

        /* renamed from: a */
        public final void m47854a(C9732b c9732b) {
            IntroPricingApplicationRepository b = this.f38726a.f38730c;
            C2668g.a(c9732b, "it");
            b.updateAvailability(c9732b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.intropricing.b.a$d */
    static final class C11883d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11883d f38727a = new C11883d();

        C11883d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47855a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47855a(Throwable th) {
            C0001a.e("Failure on observing IntroPricingAvailability ", new Object[0]);
        }
    }

    @Inject
    public C11884a(@NotNull OfferRepository offerRepository, @NotNull IntroPricingApplicationRepository introPricingApplicationRepository, @NotNull C16242a c16242a, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.b(offerRepository, "offerRepository");
        C2668g.b(introPricingApplicationRepository, "introPricingApplicationRepository");
        C2668g.b(c16242a, "checkPurchaseDiscountEligibility");
        C2668g.b(function0, "dateTimeProvider");
        this.f38729b = offerRepository;
        this.f38730c = introPricingApplicationRepository;
        this.f38731d = c16242a;
        this.f38732e = function0;
    }

    public void onStart() {
        ObservableSource observeIntroPricingEnabled = this.f38730c.observeIntroPricingEnabled();
        Observable observeOffers = this.f38729b.observeOffers(ProductType.GOLD);
        C2668g.a(observeOffers, "offerRepository.observeOffers(ProductType.GOLD)");
        this.f38728a.add(C3959e.combineLatest(observeIntroPricingEnabled, RxJavaInteropExtKt.toV2Observable(observeOffers), new C11879a(this)).subscribeOn(C15756a.b()).distinctUntilChanged().switchMap(new C11881b(this)).subscribe(new C11882c(this), C11883d.f38727a));
    }

    public void onStop() {
        this.f38728a.a();
    }

    /* renamed from: a */
    private final boolean m47858a(List<? extends C14510e> list) {
        if (list.isEmpty()) {
            return false;
        }
        list = ((C14510e) C19301m.f(list)).g();
        if (list == null) {
            return false;
        }
        list = list.h();
        boolean z = true;
        if (list != null) {
            if (list.longValue() - ((DateTime) this.f38732e.invoke()).getMillis() <= 0) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    private final IntroPricingPaywallType m47860b(List<? extends C14510e> list) {
        if (list.isEmpty()) {
            return IntroPricingPaywallType.UNKNOWN;
        }
        Collection arrayList = new ArrayList();
        for (C14510e c14510e : list) {
            List a;
            if (c14510e.g() != null) {
                a = C19301m.a(c14510e.g());
            } else {
                a = C19301m.a();
            }
            C19301m.a(arrayList, a);
        }
        list = ((List) arrayList).size();
        if (list == 1) {
            list = IntroPricingPaywallType.ONE_SKU;
        } else if (list != 3) {
            list = IntroPricingPaywallType.UNKNOWN;
        } else {
            list = IntroPricingPaywallType.THREE_SKU;
        }
        return list;
    }
}
