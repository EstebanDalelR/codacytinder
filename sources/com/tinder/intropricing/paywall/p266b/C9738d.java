package com.tinder.intropricing.paywall.p266b;

import android.content.res.Resources;
import com.tinder.intropricing.C9728a.C9725e;
import com.tinder.intropricing.C9728a.C9726f;
import com.tinder.intropricing.paywall.view.offers.C11893b;
import com.tinder.intropricing.paywall.view.offers.C9742c;
import com.tinder.paywall.domain.C10060a;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.C14510e.C14509b;
import com.tinder.purchase.domain.model.C14514j;
import com.tinder.purchase.domain.p374a.C14489a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/intropricing/paywall/viewmodels/IntroPricingPaywallViewModelFactory;", "", "res", "Landroid/content/res/Resources;", "getFormattedSinglePrice", "Lcom/tinder/purchase/domain/usecase/GetFormattedSinglePrice;", "(Landroid/content/res/Resources;Lcom/tinder/purchase/domain/usecase/GetFormattedSinglePrice;)V", "count", "", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "create", "Lcom/tinder/intropricing/paywall/viewmodels/IntroPricingPaywallViewModel;", "paywall", "Lcom/tinder/paywall/domain/Paywall;", "optionLength", "", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.intropricing.paywall.b.d */
public final class C9738d {
    /* renamed from: a */
    private final Resources f32351a;
    /* renamed from: b */
    private final C14489a f32352b;

    @Inject
    public C9738d(@NotNull Resources resources, @NotNull C14489a c14489a) {
        C2668g.b(resources, "res");
        C2668g.b(c14489a, "getFormattedSinglePrice");
        this.f32351a = resources;
        this.f32352b = c14489a;
    }

    @NotNull
    /* renamed from: a */
    public final C9737c m40250a(@NotNull C10060a c10060a) {
        C2668g.b(c10060a, "paywall");
        Collection arrayList = new ArrayList();
        for (C14510e c14510e : c10060a.m41128a()) {
            String a;
            String string;
            C15828l c15828l;
            Object[] objArr;
            String format;
            C14489a c14489a;
            C14514j d;
            String a2;
            String b;
            int a3 = m40248a(c14510e);
            Resources resources = this.f32351a;
            int i = C9726f.intro_pricing_initial_price_formatter;
            Object[] objArr2 = new Object[1];
            C14509b g = c14510e.g();
            if (g != null) {
                C14489a c14489a2 = this.f32352b;
                C14514j c = g.c();
                C2668g.a(c, "it.price()");
                a = c14489a2.a(c, a3);
                if (a != null) {
                    objArr2[0] = a;
                    string = resources.getString(i, objArr2);
                    c15828l = C15828l.f49033a;
                    objArr = new Object[]{c14510e.d().a(), c14510e.d().b()};
                    format = String.format("%s%.2f", Arrays.copyOf(objArr, objArr.length));
                    C2668g.a(format, "java.lang.String.format(format, *args)");
                    c14489a = this.f32352b;
                    d = c14510e.d();
                    C2668g.a(d, "offer.price()");
                    a = c14489a.a(d, a3);
                    a2 = c14510e.a();
                    C2668g.a(a2, "offer.productId()");
                    b = m40249b(c14510e);
                    C2668g.a(string, "initialPrice");
                    C19301m.a(arrayList, C19301m.a(new C11893b(new C9742c(a2, a3, b, string, a, format), false, 2, null)));
                }
            }
            a = "$0";
            objArr2[0] = a;
            string = resources.getString(i, objArr2);
            c15828l = C15828l.f49033a;
            objArr = new Object[]{c14510e.d().a(), c14510e.d().b()};
            format = String.format("%s%.2f", Arrays.copyOf(objArr, objArr.length));
            C2668g.a(format, "java.lang.String.format(format, *args)");
            c14489a = this.f32352b;
            d = c14510e.d();
            C2668g.a(d, "offer.price()");
            a = c14489a.a(d, a3);
            a2 = c14510e.a();
            C2668g.a(a2, "offer.productId()");
            b = m40249b(c14510e);
            C2668g.a(string, "initialPrice");
            C19301m.a(arrayList, C19301m.a(new C11893b(new C9742c(a2, a3, b, string, a, format), false, 2, null)));
        }
        return new C9737c((List) arrayList);
    }

    /* renamed from: a */
    private final int m40248a(C14510e c14510e) {
        c14510e = c14510e.e();
        return c14510e != null ? c14510e.length() : null;
    }

    /* renamed from: b */
    private final String m40249b(C14510e c14510e) {
        c14510e = this.f32351a.getQuantityString(C9725e.paywall_sub_offer_option_length, m40248a(c14510e));
        C2668g.a(c14510e, "res.getQuantityString(R.…ion_length, count(offer))");
        return c14510e;
    }
}
