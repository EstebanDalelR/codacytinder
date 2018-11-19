package com.tinder.purchase.model.p377a;

import com.tinder.api.model.profile.Products.Product;
import com.tinder.api.model.profile.Products.Sku;
import com.tinder.api.model.profile.Products.Variant;
import com.tinder.purchase.domain.model.C14516k;
import com.tinder.purchase.model.p377a.C14529b.C14528a;
import rx.functions.Func2;

/* renamed from: com.tinder.purchase.model.a.e */
final /* synthetic */ class C17841e implements Func2 {
    /* renamed from: a */
    private final C14516k f55672a;
    /* renamed from: b */
    private final Variant f55673b;
    /* renamed from: c */
    private final Product f55674c;
    /* renamed from: d */
    private final Sku f55675d;
    /* renamed from: e */
    private final Product f55676e;
    /* renamed from: f */
    private final Sku f55677f;

    C17841e(C14516k c14516k, Variant variant, Product product, Sku sku, Product product2, Sku sku2) {
        this.f55672a = c14516k;
        this.f55673b = variant;
        this.f55674c = product;
        this.f55675d = sku;
        this.f55676e = product2;
        this.f55677f = sku2;
    }

    public Object call(Object obj, Object obj2) {
        return C14528a.m55496i().mo11907a(this.f55672a).mo11906a(this.f55673b).mo11904a(this.f55674c).mo11905a((Sku) obj).mo11910b(this.f55675d).mo11909b(this.f55676e).mo11911c((Sku) obj2).mo11912d(this.f55677f).mo11908a();
    }
}
