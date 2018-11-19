package com.tinder.intropricing.paywall.view.offers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.paywall.view.itemsgroup.C10080a;
import com.tinder.paywall.view.itemsgroup.ItemViewModel;
import com.tinder.paywall.view.itemsgroup.OnItemSelectedListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0001\u0019B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u0006\u0010\u0016\u001a\u00020\u0002J\u0014\u0010\u0017\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\tR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOffersAdapter;", "Lcom/tinder/paywall/view/itemsgroup/ItemsAdapter;", "Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOfferViewModel;", "Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOfferView;", "Lcom/tinder/paywall/view/itemsgroup/OnItemSelectedListener;", "productSelectedListener", "Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOffersAdapter$OnProductSelectedListener;", "(Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOffersAdapter$OnProductSelectedListener;)V", "elements", "", "getElements", "()Ljava/util/List;", "setElements", "(Ljava/util/List;)V", "createView", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onItemSelected", "", "item", "selectedItem", "updateItems", "items", "OnProductSelectedListener", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
public final class IntroPricingOffersAdapter extends C10080a<C11893b, C11892a> implements OnItemSelectedListener<C11893b> {
    @NotNull
    /* renamed from: a */
    private List<C11893b> f38762a = ((List) new ArrayList());
    /* renamed from: b */
    private final OnProductSelectedListener f38763b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOffersAdapter$OnProductSelectedListener;", "", "onProductSelected", "", "product", "Lcom/tinder/intropricing/paywall/view/offers/IntroPricingProduct;", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
    public interface OnProductSelectedListener {
        void onProductSelected(@NotNull C9742c c9742c);
    }

    /* renamed from: b */
    public /* synthetic */ View mo10504b(ViewGroup viewGroup, int i) {
        return m47884a(viewGroup, i);
    }

    public /* synthetic */ void onItemSelected(ItemViewModel itemViewModel) {
        m47886a((C11893b) itemViewModel);
    }

    public IntroPricingOffersAdapter(@NotNull OnProductSelectedListener onProductSelectedListener) {
        C2668g.b(onProductSelectedListener, "productSelectedListener");
        this.f38763b = onProductSelectedListener;
    }

    @NotNull
    /* renamed from: a */
    public C11892a m47884a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        Context context = viewGroup.getContext();
        C2668g.a(context, "parent.context");
        return new C11892a(context, null, this, 2, null);
    }

    @NotNull
    /* renamed from: a */
    public List<C11893b> mo10503a() {
        return this.f38762a;
    }

    /* renamed from: a */
    public void m47887a(@NotNull List<C11893b> list) {
        C2668g.b(list, "<set-?>");
        this.f38762a = list;
    }

    /* renamed from: b */
    public final void m47889b(@NotNull List<C11893b> list) {
        C2668g.b(list, "items");
        m47887a((List) list);
        m41195b();
    }

    /* renamed from: a */
    public void m47886a(@NotNull C11893b c11893b) {
        C2668g.b(c11893b, "item");
        this.f38763b.onProductSelected(c11893b.m47897a());
        Iterable<C11893b> a = mo10503a();
        Collection arrayList = new ArrayList(C19301m.a(a, 10));
        for (C11893b c11893b2 : a) {
            arrayList.add(C11893b.m47895a(c11893b2, null, C2668g.a(c11893b2.getId(), c11893b.getId()), 1, null));
        }
        m47887a((List) arrayList);
        m41195b();
    }
}
