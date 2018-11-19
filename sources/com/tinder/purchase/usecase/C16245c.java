package com.tinder.purchase.usecase;

import com.tinder.api.model.purchase.PurchaseLog.Source;
import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.profile.model.Products;
import com.tinder.domain.profile.model.Sku;
import com.tinder.domain.profile.model.Variant;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.domain.utils.RxUtils;
import com.tinder.purchase.C14481a;
import com.tinder.purchase.billing.Biller;
import com.tinder.purchase.domain.exception.OfferException.CannotGetPriceFromSkuException;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.C14516k;
import com.tinder.purchase.domain.model.p375a.C14503a;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.logging.C14522a;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C18457p;
import kotlin.collections.C19287s;
import kotlin.collections.C19291t;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.Observable$Transformer;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0002J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00172\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017H\u0002J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00172\u0006\u0010\u001d\u001a\u00020\u001aH\u0002J\u001e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0002J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150!2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017H\u0002J\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150#2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0002J\u0014\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150#H\u0002J\"\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150#2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/tinder/purchase/usecase/LoadOffers;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/domain/profile/model/Products;", "offersAdapter", "Lcom/tinder/purchase/domain/model/adapter/OffersAdapter;", "offerRepository", "Lcom/tinder/purchase/domain/repository/OfferRepository;", "purchaseLogger", "Lcom/tinder/purchase/logging/PurchaseLogger;", "biller", "Lcom/tinder/purchase/billing/Biller;", "productsComparator", "Lcom/tinder/purchase/ProductsComparator;", "(Lcom/tinder/purchase/domain/model/adapter/OffersAdapter;Lcom/tinder/purchase/domain/repository/OfferRepository;Lcom/tinder/purchase/logging/PurchaseLogger;Lcom/tinder/purchase/billing/Biller;Lcom/tinder/purchase/ProductsComparator;)V", "execute", "Lio/reactivex/Completable;", "request", "findMissingPrices", "", "", "priceListing", "Lcom/tinder/purchase/domain/model/PriceListing;", "productIds", "", "getProductIds", "variants", "Lcom/tinder/domain/profile/model/Variant;", "getSkus", "Lcom/tinder/domain/profile/model/Sku;", "variant", "hasMissingPrice", "", "loadPriceListing", "Lrx/Observable;", "retryIfNeeded", "Lrx/Observable$Transformer;", "retryOnError", "retryOnMissingPrice", "purchase_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.usecase.c */
public final class C16245c implements CompletableUseCase<Products> {
    /* renamed from: a */
    private final C14503a f50611a;
    /* renamed from: b */
    private final OfferRepository f50612b;
    /* renamed from: c */
    private final C14522a f50613c;
    /* renamed from: d */
    private final Biller f50614d;
    /* renamed from: e */
    private final C14481a f50615e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "offers", "", "Lcom/tinder/domain/profile/model/ProductType;", "", "Lcom/tinder/purchase/domain/model/Offer;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.usecase.c$d */
    static final class C16244d<T, R> implements Function<Map<ProductType, ? extends List<? extends C14510e>>, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C16245c f50610a;

        C16244d(C16245c c16245c) {
            this.f50610a = c16245c;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m61379a((Map) obj);
        }

        /* renamed from: a */
        public final C3956a m61379a(@NotNull final Map<ProductType, ? extends List<? extends C14510e>> map) {
            C2668g.b(map, "offers");
            return C3956a.a(new Action() {
                public final void run() {
                    for (Entry entry : map.entrySet()) {
                        this.f50610a.f50612b.setOffers((ProductType) entry.getKey(), (List) entry.getValue());
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lrx/Observable;", "", "Lcom/tinder/purchase/domain/model/Offer;", "priceListing", "Lcom/tinder/purchase/domain/model/PriceListing;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.usecase.c$a */
    static final class C17865a<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C16245c f55737a;
        /* renamed from: b */
        final /* synthetic */ List f55738b;

        C17865a(C16245c c16245c, List list) {
            this.f55737a = c16245c;
            this.f55738b = list;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65141a((C14516k) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Observable<List<C14510e>> m65141a(C14516k c14516k) {
            C14503a a = this.f55737a.f50611a;
            List list = this.f55738b;
            C2668g.a(c14516k, "priceListing");
            return a.m55375a(list, c14516k);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0006*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/profile/model/ProductType;", "", "Lcom/tinder/purchase/domain/model/Offer;", "offers", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.usecase.c$b */
    static final class C17866b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17866b f55739a = new C17866b();

        C17866b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m65142a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Map<ProductType, List<C14510e>> m65142a(List<? extends C14510e> list) {
            C2668g.a(list, "offers");
            Map<ProductType, List<C14510e>> linkedHashMap = new LinkedHashMap();
            for (Object next : list) {
                ProductType b = ((C14510e) next).mo11840b();
                ArrayList arrayList = linkedHashMap.get(b);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(b, arrayList);
                }
                arrayList.add(next);
            }
            return linkedHashMap;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/purchase/domain/model/PriceListing;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.usecase.c$e */
    static final class C17867e<R> implements Func0<Observable<T>> {
        /* renamed from: a */
        final /* synthetic */ C16245c f55740a;
        /* renamed from: b */
        final /* synthetic */ List f55741b;

        C17867e(C16245c c16245c, List list) {
            this.f55740a = c16245c;
            this.f55741b = list;
        }

        public /* synthetic */ Object call() {
            return m65143a();
        }

        /* renamed from: a */
        public final Observable<C14516k> m65143a() {
            List a = this.f55740a.m61388b(this.f55741b);
            return this.f55740a.f50614d.loadPriceListing(a).a().a(this.f55740a.m61394c(a));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.usecase.c$c */
    static final class C18642c<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C16245c f58101a;

        C18642c(C16245c c16245c) {
            this.f58101a = c16245c;
        }

        public /* synthetic */ void call(Object obj) {
            m67081a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67081a(Throwable th) {
            C14522a b = this.f58101a.f50613c;
            Source source = Source.OTHER;
            C2668g.a(th, "it");
            b.m55476a(source, th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012*\u0010\u0004\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/purchase/domain/model/PriceListing;", "kotlin.jvm.PlatformType", "priceListingObservable", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.usecase.c$f */
    static final class C18643f<T, R> implements Observable$Transformer<C14516k, C14516k> {
        /* renamed from: a */
        final /* synthetic */ C16245c f58102a;
        /* renamed from: b */
        final /* synthetic */ List f58103b;

        C18643f(C16245c c16245c, List list) {
            this.f58102a = c16245c;
            this.f58103b = list;
        }

        public /* synthetic */ Object call(Object obj) {
            return m67082a((Observable) obj);
        }

        /* renamed from: a */
        public final Observable<C14516k> m67082a(Observable<C14516k> observable) {
            return Observable.a(observable.a(this.f58102a.m61383a()), observable.a(this.f58102a.m61396d(this.f58103b)));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012*\u0010\u0004\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/purchase/domain/model/PriceListing;", "kotlin.jvm.PlatformType", "priceListingObservable", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.usecase.c$g */
    static final class C18644g<T, R> implements Observable$Transformer<C14516k, C14516k> {
        /* renamed from: a */
        public static final C18644g f58104a = new C18644g();

        C18644g() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m67083a((Observable) obj);
        }

        /* renamed from: a */
        public final Observable<C14516k> m67083a(Observable<C14516k> observable) {
            return observable.a(RxUtils.INSTANCE.retryOnError(5, (long) 3000));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012*\u0010\u0004\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/purchase/domain/model/PriceListing;", "kotlin.jvm.PlatformType", "priceListingObservable", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.usecase.c$h */
    static final class C18645h<T, R> implements Observable$Transformer<C14516k, C14516k> {
        /* renamed from: a */
        final /* synthetic */ C16245c f58105a;
        /* renamed from: b */
        final /* synthetic */ List f58106b;

        C18645h(C16245c c16245c, List list) {
            this.f58105a = c16245c;
            this.f58106b = list;
        }

        public /* synthetic */ Object call(Object obj) {
            return m67084a((Observable) obj);
        }

        /* renamed from: a */
        public final Observable<C14516k> m67084a(Observable<C14516k> observable) {
            return observable.k(new Func1<T, R>() {
                public /* synthetic */ Object call(Object obj) {
                    return m65144a((C14516k) obj);
                }

                /* renamed from: a */
                public final C14516k m65144a(C14516k c14516k) {
                    C16245c c16245c = this.f58105a;
                    C2668g.a(c14516k, "priceListing");
                    if (!c16245c.m61385a(c14516k, this.f58106b)) {
                        return c14516k;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(this.f58105a.m61389b(c14516k, this.f58106b));
                    List list = arrayList;
                    C19287s.m68602c(list);
                    throw ((Throwable) new CannotGetPriceFromSkuException(list));
                }
            }).a(RxUtils.INSTANCE.retryOnError(5, (long) 3000));
        }
    }

    @Inject
    public C16245c(@NotNull C14503a c14503a, @NotNull OfferRepository offerRepository, @NotNull C14522a c14522a, @NotNull Biller biller, @NotNull C14481a c14481a) {
        C2668g.b(c14503a, "offersAdapter");
        C2668g.b(offerRepository, "offerRepository");
        C2668g.b(c14522a, "purchaseLogger");
        C2668g.b(biller, "biller");
        C2668g.b(c14481a, "productsComparator");
        this.f50611a = c14503a;
        this.f50612b = offerRepository;
        this.f50613c = c14522a;
        this.f50614d = biller;
        this.f50615e = c14481a;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m61398a((Products) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3956a m61398a(@NotNull Products products) {
        C2668g.b(products, "request");
        C14481a c14481a = this.f50615e;
        Map offersMap = this.f50612b.getOffersMap();
        C2668g.a(offersMap, "offerRepository.offersMap");
        List a = c14481a.m55325a(products, offersMap);
        products = m61384a(a).h(new C17865a(this, a)).k(C17866b.f55739a).a(new C18642c(this));
        C2668g.a(products, "loadPriceListing(variant…seLog.Source.OTHER, it) }");
        products = RxJavaInteropExtKt.toV2Observable(products).flatMapCompletable(new C16244d(this));
        C2668g.a(products, "loadPriceListing(variant…          }\n            }");
        return products;
    }

    /* renamed from: a */
    private final Observable<C14516k> m61384a(List<Variant> list) {
        list = Observable.a(new C17867e(this, list));
        C2668g.a(list, "Observable.defer {\n     …ed(productIds))\n        }");
        return list;
    }

    /* renamed from: b */
    private final List<String> m61388b(List<Variant> list) {
        Iterable<Variant> h = C19299w.m68833h((Iterable) list);
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) h, 10));
        for (Variant a : h) {
            arrayList.add(m61381a(a));
        }
        Collection arrayList2 = new ArrayList();
        for (Iterable<Sku> iterable : (List) arrayList) {
            Collection arrayList3 = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (Sku productId : iterable) {
                arrayList3.add(productId.getProductId());
            }
            C19291t.m68635a(arrayList2, (Iterable) (List) arrayList3);
        }
        return (List) arrayList2;
    }

    /* renamed from: a */
    private final List<Sku> m61381a(Variant variant) {
        List<Sku> d = C19299w.m68823d((Collection) variant.getRegular().getSkus());
        variant = variant.getDiscount();
        if (variant != null) {
            d.addAll(variant.component1());
        }
        return d;
    }

    /* renamed from: c */
    private final Observable$Transformer<C14516k, C14516k> m61394c(List<String> list) {
        return new C18643f(this, list);
    }

    /* renamed from: a */
    private final Observable$Transformer<C14516k, C14516k> m61383a() {
        return C18644g.f58104a;
    }

    /* renamed from: d */
    private final Observable$Transformer<C14516k, C14516k> m61396d(List<String> list) {
        return new C18645h(this, list);
    }

    /* renamed from: a */
    private final boolean m61385a(C14516k c14516k, List<String> list) {
        return c14516k.m55438a().size() < list.size() ? true : null;
    }

    /* renamed from: b */
    private final Set<String> m61389b(C14516k c14516k, List<String> list) {
        if (!m61385a(c14516k, (List) list)) {
            return am.m64176a();
        }
        HashSet hashSet = new HashSet(list);
        c14516k = c14516k.m55438a();
        C2668g.a(c14516k, "priceListing.allProductIds");
        hashSet.removeAll((Collection) c14516k);
        return hashSet;
    }
}
