package com.tinder.data.profile;

import com.tinder.api.model.profile.Products;
import com.tinder.data.profile.C8761i.C10940d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/profile/model/Products;", "Lcom/tinder/data/profile/adapter/DomainProducts;", "it", "Lcom/tinder/api/model/profile/Products;", "invoke"}, k = 3, mv = {1, 1, 10})
final class ProfileClient$get$4$4 extends Lambda implements Function1<Products, com.tinder.domain.profile.model.Products> {
    /* renamed from: a */
    final /* synthetic */ C10940d f43960a;

    ProfileClient$get$4$4(C10940d c10940d) {
        this.f43960a = c10940d;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53411a((Products) obj);
    }

    @NotNull
    /* renamed from: a */
    public final com.tinder.domain.profile.model.Products m53411a(@NotNull Products products) {
        C2668g.b(products, "it");
        return this.f43960a.f35643a.f30764f.m37288a(products);
    }
}
