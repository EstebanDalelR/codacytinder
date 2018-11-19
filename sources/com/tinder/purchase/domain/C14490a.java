package com.tinder.purchase.domain;

import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.C14514j;
import com.tinder.purchase.domain.p374a.C14489a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J \u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/purchase/domain/PaywallPriceFormatter;", "", "getFormattedSinglePrice", "Lcom/tinder/purchase/domain/usecase/GetFormattedSinglePrice;", "(Lcom/tinder/purchase/domain/usecase/GetFormattedSinglePrice;)V", "format", "", "price", "Lcom/tinder/purchase/domain/model/Price;", "count", "", "unit", "formatDiscountPriceWithUnit", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.domain.a */
public final class C14490a {
    /* renamed from: a */
    private final C14489a f45876a;

    @Inject
    public C14490a(@NotNull C14489a c14489a) {
        C2668g.b(c14489a, "getFormattedSinglePrice");
        this.f45876a = c14489a;
    }

    @NotNull
    /* renamed from: a */
    public final String m55338a(@NotNull C14514j c14514j, int i, @NotNull String str) {
        C2668g.b(c14514j, "price");
        C2668g.b(str, "unit");
        c14514j = this.f45876a.m55336a(c14514j, i);
        i = new StringBuilder();
        i.append("");
        i.append(c14514j);
        i.append("");
        i.append(str);
        return i.toString();
    }

    @Nullable
    /* renamed from: a */
    public final String m55337a(@NotNull C14510e c14510e, int i, @NotNull String str) {
        C2668g.b(c14510e, "offer");
        C2668g.b(str, "unit");
        c14510e = c14510e.mo11845g();
        if (c14510e == null) {
            return (String) null;
        }
        C14514j c = c14510e.mo11862c();
        C2668g.a(c, "it.price()");
        return m55338a(c, i, str);
    }
}
