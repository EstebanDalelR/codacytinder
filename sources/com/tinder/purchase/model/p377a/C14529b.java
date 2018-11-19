package com.tinder.purchase.model.p377a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.profile.Products;
import com.tinder.api.model.profile.Products.Product;
import com.tinder.api.model.profile.Products.Sku;
import com.tinder.api.model.profile.Products.Sku.PurchaseType;
import com.tinder.api.model.profile.Products.Variant;
import com.tinder.data.profile.adapter.ad;
import com.tinder.data.profile.adapter.aj;
import com.tinder.domain.common.model.TimeInterval;
import com.tinder.domain.common.model.TimeUnit;
import com.tinder.purchase.domain.exception.OfferException.CannotGetPriceFromSkuException;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.C14510e.C14509b;
import com.tinder.purchase.domain.model.C14514j;
import com.tinder.purchase.domain.model.C14516k;
import com.tinder.purchase.model.p377a.C16236a.C16235a;
import java.util.Collections;
import java.util.List;
import java8.util.Objects;
import java8.util.Optional;
import javax.inject.Inject;
import javax.inject.Singleton;
import p000a.p001a.C0001a;
import rx.Observable;

@Singleton
@Deprecated
/* renamed from: com.tinder.purchase.model.a.b */
public class C14529b {
    /* renamed from: a */
    private static final String f45929a = "b";
    /* renamed from: b */
    private static final TimeUnit f45930b = TimeUnit.MONTH;
    /* renamed from: c */
    private final ad f45931c;
    /* renamed from: d */
    private final aj f45932d;

    /* renamed from: com.tinder.purchase.model.a.b$1 */
    static /* synthetic */ class C145261 {
        /* renamed from: a */
        static final /* synthetic */ int[] f45928a = new int[PurchaseType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.api.model.profile.Products.Sku.PurchaseType.values();
            r0 = r0.length;
            r0 = new int[r0];
            f45928a = r0;
            r0 = f45928a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.api.model.profile.Products.Sku.PurchaseType.SUBSCRIPTION;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f45928a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.tinder.api.model.profile.Products.Sku.PurchaseType.CONSUMABLE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.purchase.model.a.b.1.<clinit>():void");
        }
    }

    /* renamed from: com.tinder.purchase.model.a.b$a */
    static abstract class C14528a {

        /* renamed from: com.tinder.purchase.model.a.b$a$a */
        public static abstract class C14527a {
            /* renamed from: a */
            public abstract C14527a mo11904a(@NonNull Product product);

            /* renamed from: a */
            public abstract C14527a mo11905a(@NonNull Sku sku);

            /* renamed from: a */
            public abstract C14527a mo11906a(@NonNull Variant variant);

            /* renamed from: a */
            public abstract C14527a mo11907a(@NonNull C14516k c14516k);

            /* renamed from: a */
            public abstract C14528a mo11908a();

            /* renamed from: b */
            public abstract C14527a mo11909b(@Nullable Product product);

            /* renamed from: b */
            public abstract C14527a mo11910b(@NonNull Sku sku);

            /* renamed from: c */
            public abstract C14527a mo11911c(@Nullable Sku sku);

            /* renamed from: d */
            public abstract C14527a mo11912d(@Nullable Sku sku);
        }

        @NonNull
        /* renamed from: a */
        public abstract C14516k mo11913a();

        @NonNull
        /* renamed from: b */
        public abstract Variant mo11914b();

        @NonNull
        /* renamed from: c */
        public abstract Product mo11915c();

        @NonNull
        /* renamed from: d */
        public abstract Sku mo11916d();

        @NonNull
        /* renamed from: e */
        public abstract Sku mo11917e();

        @Nullable
        /* renamed from: f */
        public abstract Product mo11918f();

        @Nullable
        /* renamed from: g */
        public abstract Sku mo11919g();

        @Nullable
        /* renamed from: h */
        public abstract Sku mo11920h();

        C14528a() {
        }

        /* renamed from: i */
        public static C14527a m55496i() {
            return new C16235a();
        }
    }

    /* renamed from: a */
    final /* synthetic */ Observable m55518a(Variant variant) {
        return m55511b(variant);
    }

    @Inject
    public C14529b(ad adVar, aj ajVar) {
        this.f45931c = adVar;
        this.f45932d = ajVar;
    }

    @Deprecated
    @NonNull
    /* renamed from: a */
    public List<C14510e> m55517a(@NonNull Products products, @NonNull C14516k c14516k) {
        return (List) m55512b(products).h(new C17839c(this, c14516k)).h(new C17840d(this)).l(C17842f.f55678a).v().u().b();
    }

    /* renamed from: a */
    final /* synthetic */ Observable m55519a(@NonNull C14516k c14516k, Variant variant) {
        return m55507a(variant, c14516k);
    }

    /* renamed from: a */
    final /* synthetic */ Observable m55520a(C14528a c14528a) {
        try {
            return Observable.a(m55509b(c14528a));
        } catch (C14528a c14528a2) {
            C0001a.c(c14528a2);
            return Observable.c();
        }
    }

    @NonNull
    /* renamed from: a */
    public List<String> m55516a(@NonNull Products products) {
        return (List) m55512b(products).h(new C17843g(this)).k(C17844h.f55680a).v().u().b();
    }

    /* renamed from: b */
    private Observable<Variant> m55512b(@NonNull Products products) {
        return Observable.a(products.plus(), products.superlike(), products.boost(), products.gold(), products.topPicks()).f(C17845i.f55681a);
    }

    /* renamed from: b */
    private Observable<Sku> m55511b(@NonNull Variant variant) {
        Observable<Sku> a = Observable.a(variant.regular().skus());
        variant = variant.discount();
        if (Objects.m59117c(variant)) {
            return a;
        }
        return Observable.a(a, Observable.a(variant.skus()));
    }

    /* renamed from: a */
    private Observable<C14528a> m55507a(@NonNull Variant variant, @NonNull C14516k c14516k) {
        Product regular = variant.regular();
        if (regular.skus().isEmpty()) {
            return Observable.c();
        }
        Observable o;
        Sku sku;
        Sku sku2 = (Sku) regular.skus().get(0);
        Observable a = Observable.a(regular.skus());
        Sku sku3 = (Sku) a.f(C17846j.f55682a).f(C17847k.f55683a).u().b(sku2);
        Product discount = variant.discount();
        if (!Objects.m59118d(discount) || discount.skus().isEmpty()) {
            o = Observable.a((Sku) null).o();
            sku = null;
        } else {
            sku2 = (Sku) discount.skus().get(0);
            Observable a2 = Observable.a(discount.skus());
            sku = (Sku) a2.f(C17848l.f55684a).f(C17849m.f55685a).u().b(sku2);
            o = a2;
        }
        return Observable.b(a, o, new C17841e(c14516k, variant, regular, sku3, discount, sku));
    }

    /* renamed from: b */
    static final /* synthetic */ Boolean m55510b(Sku sku) {
        sku = (!Objects.m59118d(sku.isBaseGroup()) || sku.isBaseGroup().booleanValue() == null) ? null : true;
        return Boolean.valueOf(sku);
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m55506a(Sku sku) {
        sku = (!Objects.m59118d(sku.isBaseGroup()) || sku.isBaseGroup().booleanValue() == null) ? null : true;
        return Boolean.valueOf(sku);
    }

    /* renamed from: b */
    private C14510e m55509b(@NonNull C14528a c14528a) {
        C14516k a = c14528a.mo11913a();
        Sku d = c14528a.mo11916d();
        Sku e = c14528a.mo11917e();
        C14514j a2 = a.m55437a(d.productId());
        if (a2 == null) {
            throw new CannotGetPriceFromSkuException(Collections.singletonList(d.productId()));
        }
        C14514j a3 = a.m55437a(e.productId());
        if (a3 != null) {
            return C14510e.m55413l().mo11833a(d.productId()).mo11828a(this.f45931c.a(d.productType())).mo11829a(this.f45932d.a(d.purchaseType())).mo11827a(m55513c(d)).mo11832a(m55515d(d)).mo11830a(m55514c(c14528a)).mo11838b(((Boolean) Optional.m59121b(d.isPrimary()).m59130c(Boolean.valueOf(false))).booleanValue()).mo11834a(((Boolean) Optional.m59121b(d.isBaseGroup()).m59130c(Boolean.valueOf(false))).booleanValue()).mo11831a(a2).mo11836b(a3).mo11835a();
        }
        throw new CannotGetPriceFromSkuException(Collections.singletonList(e.productId()));
    }

    @Nullable
    /* renamed from: c */
    private C14509b m55514c(@NonNull C14528a c14528a) {
        C14516k a = c14528a.mo11913a();
        Product f = c14528a.mo11918f();
        Sku g = c14528a.mo11919g();
        c14528a = c14528a.mo11920h();
        if (!(Objects.m59117c(f) || Objects.m59117c(g))) {
            if (!Objects.m59117c(c14528a)) {
                Integer discountPercentage = g.discountPercentage();
                if (discountPercentage == null) {
                    throw new RuntimeException("Discount percentage is null");
                }
                C14514j a2 = a.m55437a(g.productId());
                if (a2 == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Cannot get price from Google Play. Sku: ");
                    stringBuilder.append(g.productId());
                    throw new RuntimeException(stringBuilder.toString());
                }
                C14514j a3 = a.m55437a(c14528a.productId());
                if (a3 == null) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Cannot get price from Google Play. Sku: ");
                    stringBuilder2.append(c14528a.productId());
                    throw new RuntimeException(stringBuilder2.toString());
                }
                c14528a = g.isIntroPricing();
                return C14509b.m55402j().mo11858b(f.campaign()).mo11859c(f.campaignVariantName()).mo11857b(f.expiredAt()).mo11852a(f.viewAt()).mo11853a(g.productId()).mo11851a(discountPercentage).mo11850a(a2).mo11856b(a3).mo11854a(Boolean.valueOf(c14528a != null ? c14528a.booleanValue() : null).booleanValue()).mo11855a();
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    private TimeInterval m55513c(@NonNull Sku sku) {
        if (C145261.f45928a[sku.purchaseType().ordinal()] != 1) {
            return null;
        }
        return TimeInterval.create(((Integer) Objects.m59116b(sku.term(), Integer.valueOf(1))).intValue(), f45930b);
    }

    @Nullable
    /* renamed from: d */
    private Integer m55515d(@NonNull Sku sku) {
        if (C145261.f45928a[sku.purchaseType().ordinal()] != 2) {
            return null;
        }
        return sku.amount();
    }
}
