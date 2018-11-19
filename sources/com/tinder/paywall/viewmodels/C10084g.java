package com.tinder.paywall.viewmodels;

import android.content.res.Resources;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.paywall.views.PaywallItemGroupView.PaywallItemSelectListener;
import com.tinder.purchase.domain.model.C14510e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.collections.ab;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J,\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/paywall/viewmodels/PaywallGroupViewModelFactory;", "", "paywallItemViewModelFactory", "Lcom/tinder/paywall/viewmodels/PaywallItemViewModelFactory;", "resources", "Landroid/content/res/Resources;", "(Lcom/tinder/paywall/viewmodels/PaywallItemViewModelFactory;Landroid/content/res/Resources;)V", "create", "Lcom/tinder/paywall/viewmodels/PaywallItemGroupViewModel;", "productType", "Lcom/tinder/domain/profile/model/ProductType;", "offers", "", "Lcom/tinder/purchase/domain/model/Offer;", "color", "Lcom/tinder/paywall/viewmodels/PaywallItemViewModelColor;", "listener", "Lcom/tinder/paywall/views/PaywallItemGroupView$PaywallItemSelectListener;", "createItemViewModels", "Lcom/tinder/paywall/viewmodels/PaywallItemViewModel;", "getBestValuePosition", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.viewmodels.g */
public final class C10084g {
    /* renamed from: a */
    private final C10091m f32985a;
    /* renamed from: b */
    private final Resources f32986b;

    @Inject
    public C10084g(@NotNull C10091m c10091m, @NotNull Resources resources) {
        C2668g.b(c10091m, "paywallItemViewModelFactory");
        C2668g.b(resources, "resources");
        this.f32985a = c10091m;
        this.f32986b = resources;
    }

    @NotNull
    /* renamed from: a */
    public final C10085h m41203a(@NotNull ProductType productType, @NotNull List<? extends C14510e> list, @NotNull PaywallItemViewModelColor paywallItemViewModelColor, @NotNull PaywallItemSelectListener paywallItemSelectListener) {
        C2668g.b(productType, "productType");
        C2668g.b(list, "offers");
        C2668g.b(paywallItemViewModelColor, ManagerWebServices.PARAM_BADGE_COLOR);
        C2668g.b(paywallItemSelectListener, "listener");
        return new C10085h(productType, list, paywallItemViewModelColor, m41202a(productType, list, paywallItemViewModelColor), paywallItemSelectListener);
    }

    /* renamed from: a */
    private final List<C10090l> m41202a(ProductType productType, List<? extends C14510e> list, PaywallItemViewModelColor paywallItemViewModelColor) {
        C10084g c10084g = this;
        List<? extends C14510e> list2 = list;
        Iterable<C14510e> iterable = list2;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (C14510e a : iterable) {
            arrayList.add(c10084g.f32985a.m41260a(productType, a, paywallItemViewModelColor));
        }
        List<C10090l> d = C19301m.d((List) arrayList);
        int a2 = m41201a(list2);
        if ((d.isEmpty() ^ 1) != 0) {
            C10090l c10090l = (C10090l) d.get(a2);
            String string = c10084g.f32986b.getString(R.string.best_value);
            C2668g.a(string, "resources.getString(R.string.best_value)");
            d.set(a2, C10090l.m41243a(c10090l, 0, null, null, null, null, string, null, null, 0, false, false, 2015, null));
        }
        return d;
    }

    /* renamed from: a */
    private final int m41201a(List<? extends C14510e> list) {
        Iterator it = C19301m.a(list).iterator();
        int i = 0;
        double d = 0.0d;
        while (it.hasNext()) {
            int b = ((ab) it).b();
            C14510e c14510e = (C14510e) list.get(b);
            double doubleValue = c14510e.d().b().doubleValue();
            Double b2 = c14510e.j().b();
            C2668g.a(b2, "offer.basePrice().amount()");
            doubleValue -= b2.doubleValue();
            if (b != 0) {
                if (doubleValue > d) {
                    i = b;
                }
            }
            d = doubleValue;
        }
        return i;
    }
}
