package com.tinder.purchase.domain.p374a;

import com.tinder.purchase.domain.model.C14514j;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/tinder/purchase/domain/usecase/GetFormattedSinglePrice;", "", "()V", "execute", "", "price", "Lcom/tinder/purchase/domain/model/Price;", "count", "", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.domain.a.a */
public final class C14489a {
    @NotNull
    /* renamed from: a */
    public final String m55336a(@NotNull C14514j c14514j, int i) {
        C2668g.b(c14514j, "price");
        Double b = c14514j.mo11870b();
        C2668g.a(b, "price.amount()");
        BigDecimal bigDecimal = new BigDecimal(b.doubleValue());
        if (i > 1) {
            i = bigDecimal.divide(new BigDecimal(i), 2);
            C2668g.a(i, "totalPrice.divide(BigDec…BigDecimal.ROUND_CEILING)");
            bigDecimal = i.setScale(2, 2);
            C2668g.a(bigDecimal, "pricePerUnit.setScale(FR…BigDecimal.ROUND_CEILING)");
        }
        i = NumberFormat.getCurrencyInstance();
        C2668g.a(i, "numberFormat");
        i.setMinimumFractionDigits(2);
        try {
            i.setCurrency(Currency.getInstance(c14514j.mo11869a()));
            c14514j = i.format((double) bigDecimal.floatValue());
            C2668g.a(c14514j, "numberFormat.format(pric…nit.toFloat().toDouble())");
            return c14514j;
        } catch (IllegalArgumentException e) {
            C0001a.c(e, "Error occurred while fetching currency instance. currency = %s, price = %s", new Object[]{c14514j.mo11869a(), bigDecimal});
            C15828l c15828l = C15828l.f49033a;
            Object[] objArr = new Object[]{c14514j.mo11869a(), i.format((double) bigDecimal.floatValue())};
            c14514j = String.format("%s %s", Arrays.copyOf(objArr, objArr.length));
            C2668g.a(c14514j, "java.lang.String.format(format, *args)");
            return c14514j;
        }
    }
}
