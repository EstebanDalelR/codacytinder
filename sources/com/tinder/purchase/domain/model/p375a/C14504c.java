package com.tinder.purchase.domain.model.p375a;

import com.tinder.domain.profile.model.Product;
import com.tinder.domain.profile.model.Sku;
import com.tinder.purchase.domain.model.C14516k;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/tinder/purchase/domain/model/adapter/ProductInfo;", "", "priceListing", "Lcom/tinder/purchase/domain/model/PriceListing;", "product", "Lcom/tinder/domain/profile/model/Product;", "regularSku", "Lcom/tinder/domain/profile/model/Sku;", "baseRegularSku", "(Lcom/tinder/purchase/domain/model/PriceListing;Lcom/tinder/domain/profile/model/Product;Lcom/tinder/domain/profile/model/Sku;Lcom/tinder/domain/profile/model/Sku;)V", "getBaseRegularSku", "()Lcom/tinder/domain/profile/model/Sku;", "getPriceListing", "()Lcom/tinder/purchase/domain/model/PriceListing;", "getProduct", "()Lcom/tinder/domain/profile/model/Product;", "getRegularSku", "DiscountProductInfo", "RegularProductInfo", "Lcom/tinder/purchase/domain/model/adapter/ProductInfo$RegularProductInfo;", "Lcom/tinder/purchase/domain/model/adapter/ProductInfo$DiscountProductInfo;", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.domain.model.a.c */
public abstract class C14504c {
    @NotNull
    /* renamed from: a */
    private final C14516k f45888a;
    @NotNull
    /* renamed from: b */
    private final Product f45889b;
    @NotNull
    /* renamed from: c */
    private final Sku f45890c;
    @NotNull
    /* renamed from: d */
    private final Sku f45891d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0002\u0010\fR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tinder/purchase/domain/model/adapter/ProductInfo$DiscountProductInfo;", "Lcom/tinder/purchase/domain/model/adapter/ProductInfo;", "priceListing", "Lcom/tinder/purchase/domain/model/PriceListing;", "product", "Lcom/tinder/domain/profile/model/Product;", "regularSku", "Lcom/tinder/domain/profile/model/Sku;", "baseRegularSku", "discountProduct", "discountSku", "baseDiscountSku", "(Lcom/tinder/purchase/domain/model/PriceListing;Lcom/tinder/domain/profile/model/Product;Lcom/tinder/domain/profile/model/Sku;Lcom/tinder/domain/profile/model/Sku;Lcom/tinder/domain/profile/model/Product;Lcom/tinder/domain/profile/model/Sku;Lcom/tinder/domain/profile/model/Sku;)V", "getBaseDiscountSku", "()Lcom/tinder/domain/profile/model/Sku;", "getDiscountProduct", "()Lcom/tinder/domain/profile/model/Product;", "getDiscountSku", "domain_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.domain.model.a.c$a */
    public static final class C16221a extends C14504c {
        @NotNull
        /* renamed from: a */
        private final Product f50513a;
        @NotNull
        /* renamed from: b */
        private final Sku f50514b;
        @NotNull
        /* renamed from: c */
        private final Sku f50515c;

        @NotNull
        /* renamed from: d */
        public final Product m61223d() {
            return this.f50513a;
        }

        @NotNull
        /* renamed from: e */
        public final Sku m61224e() {
            return this.f50514b;
        }

        @NotNull
        /* renamed from: f */
        public final Sku m61225f() {
            return this.f50515c;
        }

        public C16221a(@NotNull C14516k c14516k, @NotNull Product product, @NotNull Sku sku, @NotNull Sku sku2, @NotNull Product product2, @NotNull Sku sku3, @NotNull Sku sku4) {
            C2668g.b(c14516k, "priceListing");
            C2668g.b(product, "product");
            C2668g.b(sku, "regularSku");
            C2668g.b(sku2, "baseRegularSku");
            C2668g.b(product2, "discountProduct");
            C2668g.b(sku3, "discountSku");
            C2668g.b(sku4, "baseDiscountSku");
            super(c14516k, product, sku, sku2);
            this.f50513a = product2;
            this.f50514b = sku3;
            this.f50515c = sku4;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/tinder/purchase/domain/model/adapter/ProductInfo$RegularProductInfo;", "Lcom/tinder/purchase/domain/model/adapter/ProductInfo;", "priceListing", "Lcom/tinder/purchase/domain/model/PriceListing;", "product", "Lcom/tinder/domain/profile/model/Product;", "regularSku", "Lcom/tinder/domain/profile/model/Sku;", "baseRegularSku", "(Lcom/tinder/purchase/domain/model/PriceListing;Lcom/tinder/domain/profile/model/Product;Lcom/tinder/domain/profile/model/Sku;Lcom/tinder/domain/profile/model/Sku;)V", "domain_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.domain.model.a.c$b */
    public static final class C16222b extends C14504c {
        public C16222b(@NotNull C14516k c14516k, @NotNull Product product, @NotNull Sku sku, @NotNull Sku sku2) {
            C2668g.b(c14516k, "priceListing");
            C2668g.b(product, "product");
            C2668g.b(sku, "regularSku");
            C2668g.b(sku2, "baseRegularSku");
            super(c14516k, product, sku, sku2);
        }
    }

    private C14504c(C14516k c14516k, Product product, Sku sku, Sku sku2) {
        this.f45888a = c14516k;
        this.f45889b = product;
        this.f45890c = sku;
        this.f45891d = sku2;
    }

    @NotNull
    /* renamed from: a */
    public final C14516k m55376a() {
        return this.f45888a;
    }

    @NotNull
    /* renamed from: b */
    public final Sku m55377b() {
        return this.f45890c;
    }

    @NotNull
    /* renamed from: c */
    public final Sku m55378c() {
        return this.f45891d;
    }
}
