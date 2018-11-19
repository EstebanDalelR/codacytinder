package com.tinder.intropricing.paywall.view.info;

import android.view.View;
import android.view.ViewGroup;
import com.tinder.intropricing.paywall.p266b.C11889e;
import com.tinder.paywall.view.itemsgroup.C10080a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/tinder/intropricing/paywall/view/info/IntroPricingPerksAdapter;", "Lcom/tinder/paywall/view/itemsgroup/ItemsAdapter;", "Lcom/tinder/intropricing/paywall/viewmodels/IntroPricingPerkViewModel;", "Lcom/tinder/intropricing/paywall/view/info/IntroPricingPerkView;", "perks", "", "(Ljava/util/List;)V", "elements", "getElements", "()Ljava/util/List;", "setElements", "getPerks", "createView", "parent", "Landroid/view/ViewGroup;", "viewType", "", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.intropricing.paywall.view.info.b */
public final class C11891b extends C10080a<C11889e, IntroPricingPerkView> {
    @NotNull
    /* renamed from: a */
    private List<C11889e> f38760a = this.f38761b;
    @NotNull
    /* renamed from: b */
    private final List<C11889e> f38761b;

    /* renamed from: b */
    public /* synthetic */ View mo10504b(ViewGroup viewGroup, int i) {
        return m47881a(viewGroup, i);
    }

    public C11891b(@NotNull List<C11889e> list) {
        C2668g.b(list, "perks");
        this.f38761b = list;
    }

    @NotNull
    /* renamed from: a */
    public IntroPricingPerkView m47881a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        viewGroup = viewGroup.getContext();
        C2668g.a(viewGroup, "parent.context");
        return new IntroPricingPerkView(viewGroup, null, 2, null);
    }

    @NotNull
    /* renamed from: a */
    public List<C11889e> mo10503a() {
        return this.f38760a;
    }
}
