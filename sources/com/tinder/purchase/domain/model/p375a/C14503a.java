package com.tinder.purchase.domain.model.p375a;

import com.tinder.domain.profile.model.Product;
import com.tinder.domain.profile.model.Sku;
import com.tinder.domain.profile.model.Variant;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.C14511f;
import com.tinder.purchase.domain.model.C14516k;
import com.tinder.purchase.domain.model.p375a.C14504c.C16221a;
import com.tinder.purchase.domain.model.p375a.C14504c.C16222b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.functions.Func1;
import rx.functions.Func2;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J*\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00062\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/purchase/domain/model/adapter/OffersAdapter;", "", "offerFactory", "Lcom/tinder/purchase/domain/model/OfferFactory;", "(Lcom/tinder/purchase/domain/model/OfferFactory;)V", "extractProductInfo", "Lrx/Observable;", "Lcom/tinder/purchase/domain/model/adapter/ProductInfo;", "variant", "Lcom/tinder/domain/profile/model/Variant;", "priceListing", "Lcom/tinder/purchase/domain/model/PriceListing;", "fromProducts", "", "Lcom/tinder/purchase/domain/model/Offer;", "variants", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.domain.model.a.a */
public final class C14503a {
    /* renamed from: a */
    private final C14511f f45887a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/purchase/domain/model/adapter/ProductInfo;", "regularSku", "Lcom/tinder/domain/profile/model/Sku;", "kotlin.jvm.PlatformType", "discountSku", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.domain.model.a.a$a */
    static final class C17813a<T1, T2, R> implements Func2<T1, T2, R> {
        /* renamed from: a */
        final /* synthetic */ C14516k f55620a;
        /* renamed from: b */
        final /* synthetic */ Product f55621b;
        /* renamed from: c */
        final /* synthetic */ Sku f55622c;
        /* renamed from: d */
        final /* synthetic */ Product f55623d;
        /* renamed from: e */
        final /* synthetic */ Sku f55624e;

        C17813a(C14516k c14516k, Product product, Sku sku, Product product2, Sku sku2) {
            this.f55620a = c14516k;
            this.f55621b = product;
            this.f55622c = sku;
            this.f55623d = product2;
            this.f55624e = sku2;
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m65098a((Sku) obj, (Sku) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final C14504c m65098a(Sku sku, @Nullable Sku sku2) {
            if (sku2 != null) {
                C14516k c14516k = this.f55620a;
                Product product = this.f55621b;
                C2668g.a(sku, "regularSku");
                Sku sku3 = this.f55622c;
                Product product2 = this.f55623d;
                if (product2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.profile.model.Product");
                }
                Sku sku4 = this.f55624e;
                if (sku4 != null) {
                    return new C16221a(c14516k, product, sku, sku3, product2, sku2, sku4);
                }
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.profile.model.Sku");
            }
            C14516k c14516k2 = this.f55620a;
            Product product3 = this.f55621b;
            C2668g.a(sku, "regularSku");
            return (C14504c) new C16222b(c14516k2, product3, sku, this.f55622c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "variant", "Lcom/tinder/domain/profile/model/Variant;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.domain.model.a.a$b */
    static final class C17814b<T, R> implements Func1<Variant, Boolean> {
        /* renamed from: a */
        public static final C17814b f55625a = new C17814b();

        C17814b() {
        }

        /* renamed from: a */
        public final boolean m65099a(@Nullable Variant variant) {
            return variant != null;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65099a((Variant) obj));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/domain/profile/model/Variant;", "it", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.domain.model.a.a$c */
    static final class C17815c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17815c f55626a = new C17815c();

        C17815c() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m65100a((Variant) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Variant m65100a(@Nullable Variant variant) {
            if (variant != null) {
                return variant;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.profile.model.Variant");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/purchase/domain/model/adapter/ProductInfo;", "variant", "Lcom/tinder/domain/profile/model/Variant;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.domain.model.a.a$d */
    static final class C17816d<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C14503a f55627a;
        /* renamed from: b */
        final /* synthetic */ C14516k f55628b;

        C17816d(C14503a c14503a, C14516k c14516k) {
            this.f55627a = c14503a;
            this.f55628b = c14516k;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65101a((Variant) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Observable<C14504c> m65101a(Variant variant) {
            C14503a c14503a = this.f55627a;
            C2668g.a(variant, "variant");
            return c14503a.m55373a(variant, this.f55628b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/purchase/domain/model/Offer;", "kotlin.jvm.PlatformType", "productInfo", "Lcom/tinder/purchase/domain/model/adapter/ProductInfo;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.domain.model.a.a$e */
    static final class C17818e<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C14503a f55630a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/purchase/domain/model/Offer;", "kotlin.jvm.PlatformType", "throwable", "", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.purchase.domain.model.a.a$e$2 */
        static final class C178172<T, R> implements Func1<Throwable, Observable<? extends C14510e>> {
            /* renamed from: a */
            public static final C178172 f55629a = new C178172();

            C178172() {
            }

            public /* synthetic */ Object call(Object obj) {
                return m65102a((Throwable) obj);
            }

            /* renamed from: a */
            public final Observable<C14510e> m65102a(Throwable th) {
                C0001a.c(th, "Error creating offer", new Object[0]);
                return Observable.c();
            }
        }

        C17818e(C14503a c14503a) {
            this.f55630a = c14503a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65103a((C14504c) obj);
        }

        /* renamed from: a */
        public final Observable<C14510e> m65103a(final C14504c c14504c) {
            return Observable.a(new Callable<T>() {
                public /* synthetic */ Object call() {
                    return m55371a();
                }

                @NotNull
                /* renamed from: a */
                public final C14510e m55371a() {
                    C14511f a = this.f55630a.f45887a;
                    C14504c c14504c = c14504c;
                    C2668g.a(c14504c, "productInfo");
                    return a.m55429a(c14504c);
                }
            }).l(C178172.f55629a);
        }
    }

    @Inject
    public C14503a(@NotNull C14511f c14511f) {
        C2668g.b(c14511f, "offerFactory");
        this.f45887a = c14511f;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<List<C14510e>> m55375a(@NotNull List<Variant> list, @NotNull C14516k c14516k) {
        C2668g.b(list, "variants");
        C2668g.b(c14516k, "priceListing");
        list = Observable.a(list).f(C17814b.f55625a).k(C17815c.f55626a).h(new C17816d(this, c14516k)).h((Func1) new C17818e(this)).v();
        C2668g.a(list, "Observable.from(variants…                .toList()");
        return list;
    }

    /* renamed from: a */
    private final Observable<C14504c> m55373a(Variant variant, C14516k c14516k) {
        Product regular = variant.getRegular();
        if (regular.getSkus().isEmpty()) {
            variant = Observable.c();
            C2668g.a(variant, "Observable.empty()");
            return variant;
        }
        Object obj;
        List skus;
        Sku sku;
        int isEmpty;
        Observable a;
        Observable a2 = Observable.a(regular.getSkus());
        Iterator it = regular.getSkus().iterator();
        do {
            Object obj2 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
        } while (!((Sku) obj).isBaseGroup());
        Sku sku2 = (Sku) obj;
        Sku sku3 = sku2 != null ? sku2 : (Sku) C19299w.m68829f(regular.getSkus());
        variant = variant.getDiscount();
        if (variant != null) {
            skus = variant.getSkus();
            if (skus != null) {
                for (Object obj3 : skus) {
                    if (((Sku) obj3).isBaseGroup()) {
                        break;
                    }
                }
                obj3 = null;
                sku = (Sku) obj3;
                if (variant != null) {
                    skus = variant.getSkus();
                    if (skus != null) {
                        isEmpty = skus.isEmpty() ^ 1;
                        if (isEmpty == 0) {
                            if (variant != null) {
                                obj2 = variant.getSkus();
                            }
                            a = Observable.a((Iterable) obj2);
                        } else {
                            a = Observable.a(null).o();
                        }
                        variant = Observable.b(a2, a, new C17813a(c14516k, regular, sku3, variant, sku));
                        C2668g.a(variant, "Observable.zip(\n        …              }\n        }");
                        return variant;
                    }
                }
                isEmpty = 0;
                if (isEmpty == 0) {
                    a = Observable.a(null).o();
                } else {
                    if (variant != null) {
                        obj2 = variant.getSkus();
                    }
                    a = Observable.a((Iterable) obj2);
                }
                variant = Observable.b(a2, a, new C17813a(c14516k, regular, sku3, variant, sku));
                C2668g.a(variant, "Observable.zip(\n        …              }\n        }");
                return variant;
            }
        }
        sku = null;
        if (variant != null) {
            skus = variant.getSkus();
            if (skus != null) {
                isEmpty = skus.isEmpty() ^ 1;
                if (isEmpty == 0) {
                    if (variant != null) {
                        obj2 = variant.getSkus();
                    }
                    a = Observable.a((Iterable) obj2);
                } else {
                    a = Observable.a(null).o();
                }
                variant = Observable.b(a2, a, new C17813a(c14516k, regular, sku3, variant, sku));
                C2668g.a(variant, "Observable.zip(\n        …              }\n        }");
                return variant;
            }
        }
        isEmpty = 0;
        if (isEmpty == 0) {
            a = Observable.a(null).o();
        } else {
            if (variant != null) {
                obj2 = variant.getSkus();
            }
            a = Observable.a((Iterable) obj2);
        }
        variant = Observable.b(a2, a, new C17813a(c14516k, regular, sku3, variant, sku));
        C2668g.a(variant, "Observable.zip(\n        …              }\n        }");
        return variant;
    }
}
