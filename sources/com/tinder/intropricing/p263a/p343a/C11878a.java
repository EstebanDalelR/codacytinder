package com.tinder.intropricing.p263a.p343a;

import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.intropricing.domain.model.C9731a;
import com.tinder.intropricing.domain.model.C9732b;
import com.tinder.intropricing.domain.repo.IntroPricingApplicationRepository;
import com.tinder.intropricing.p263a.C9727a;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.repository.OfferRepository;
import io.reactivex.C3959e;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.C19040a;
import java.util.List;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fH\u0016J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\tH\u0016R2\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R2\u0010\u000b\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\f0\f \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\f0\f\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/intropricing/data/repo/IntroPricingDataRepository;", "Lcom/tinder/intropricing/domain/repo/IntroPricingApplicationRepository;", "offerRepository", "Lcom/tinder/purchase/domain/repository/OfferRepository;", "introPricingDataStore", "Lcom/tinder/intropricing/data/IntroPricingSharedPreferenceDataStore;", "(Lcom/tinder/purchase/domain/repository/OfferRepository;Lcom/tinder/intropricing/data/IntroPricingSharedPreferenceDataStore;)V", "availabilitySubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/intropricing/domain/model/IntroPricingAvailability;", "kotlin.jvm.PlatformType", "subject", "", "convertOfferToIntroPricing", "Ljava8/util/Optional;", "Lcom/tinder/intropricing/domain/model/IntroPricing;", "offers", "", "Lcom/tinder/purchase/domain/model/Offer;", "observeAvailability", "Lio/reactivex/Observable;", "observeIntroPricing", "observeIntroPricingEnabled", "setIntroPricingEnabled", "", "isEnabled", "updateAvailability", "introPricingAvailability", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.intropricing.a.a.a */
public final class C11878a implements IntroPricingApplicationRepository {
    /* renamed from: a */
    private final C19040a<Boolean> f38719a = C19040a.a(Boolean.valueOf(this.f38722d.m40223a()));
    /* renamed from: b */
    private final C19040a<C9732b> f38720b = C19040a.a();
    /* renamed from: c */
    private final OfferRepository f38721c;
    /* renamed from: d */
    private final C9727a f38722d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012(\u0010\u0003\u001a$\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00070\u0004H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Ljava8/util/Optional;", "Lcom/tinder/intropricing/domain/model/IntroPricing;", "it", "", "Lcom/tinder/purchase/domain/model/Offer;", "kotlin.jvm.PlatformType", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.intropricing.a.a.a$a */
    static final class C11875a<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C11878a f38716a;

        C11875a(C11878a c11878a) {
            this.f38716a = c11878a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47846a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Optional<C9731a> m47846a(@NotNull List<C14510e> list) {
            C2668g.b(list, "it");
            return this.f38716a.m47850a(list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava8/util/Optional;", "Lcom/tinder/intropricing/domain/model/IntroPricing;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.intropricing.a.a.a$b */
    static final class C11876b<T> implements Predicate<Optional<C9731a>> {
        /* renamed from: a */
        public static final C11876b f38717a = new C11876b();

        C11876b() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47847a((Optional) obj);
        }

        /* renamed from: a */
        public final boolean m47847a(@NotNull Optional<C9731a> optional) {
            C2668g.b(optional, "it");
            return optional.c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/intropricing/domain/model/IntroPricing;", "kotlin.jvm.PlatformType", "it", "Ljava8/util/Optional;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.intropricing.a.a.a$c */
    static final class C11877c<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C11877c f38718a = new C11877c();

        C11877c() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47848a((Optional) obj);
        }

        /* renamed from: a */
        public final C9731a m47848a(@NotNull Optional<C9731a> optional) {
            C2668g.b(optional, "it");
            return (C9731a) optional.b();
        }
    }

    @Inject
    public C11878a(@NotNull OfferRepository offerRepository, @NotNull C9727a c9727a) {
        C2668g.b(offerRepository, "offerRepository");
        C2668g.b(c9727a, "introPricingDataStore");
        this.f38721c = offerRepository;
        this.f38722d = c9727a;
    }

    @NotNull
    public C3959e<Boolean> observeIntroPricingEnabled() {
        C3959e<Boolean> distinctUntilChanged = this.f38719a.hide().distinctUntilChanged();
        C2668g.a(distinctUntilChanged, "subject.hide().distinctUntilChanged()");
        return distinctUntilChanged;
    }

    public void setIntroPricingEnabled(boolean z) {
        this.f38722d.m40222a(z);
        this.f38719a.onNext(Boolean.valueOf(z));
    }

    @NotNull
    public C3959e<C9732b> observeAvailability() {
        C19040a c19040a = this.f38720b;
        C2668g.a(c19040a, "availabilitySubject");
        return c19040a;
    }

    public void updateAvailability(@NotNull C9732b c9732b) {
        C2668g.b(c9732b, "introPricingAvailability");
        this.f38720b.onNext(c9732b);
    }

    @NotNull
    public C3959e<C9731a> observeIntroPricing() {
        Observable observeOffers = this.f38721c.observeOffers(ProductType.GOLD);
        C2668g.a(observeOffers, "offerRepository\n        …eOffers(ProductType.GOLD)");
        C3959e<C9731a> map = RxJavaInteropExtKt.toV2Observable(observeOffers).map(new C11875a(this)).filter(C11876b.f38717a).map(C11877c.f38718a);
        C2668g.a(map, "offerRepository\n        …        .map { it.get() }");
        return map;
    }

    /* renamed from: a */
    private final Optional<C9731a> m47850a(List<? extends C14510e> list) {
        if (list.isEmpty()) {
            list = Optional.a();
            C2668g.a(list, "Optional.empty()");
            return list;
        }
        list = ((C14510e) C19301m.f(list)).g();
        if (list != null) {
            DateTime dateTime = new DateTime(list.h());
            list = list.b();
            C2668g.a(list, "it.percentage()");
            list = Optional.a(new C9731a(dateTime, list.intValue()));
            C2668g.a(list, "Optional.of(IntroPricing…ntage = it.percentage()))");
            return list;
        }
        list = Optional.a();
        C2668g.a(list, "Optional.empty()");
        return list;
    }
}
