package com.tinder.intropricing.paywall.view.offers;

import com.tinder.paywall.view.itemsgroup.ItemViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOfferViewModel;", "Lcom/tinder/paywall/view/itemsgroup/ItemViewModel;", "product", "Lcom/tinder/intropricing/paywall/view/offers/IntroPricingProduct;", "selected", "", "(Lcom/tinder/intropricing/paywall/view/offers/IntroPricingProduct;Z)V", "id", "", "getId", "()Ljava/lang/String;", "getProduct", "()Lcom/tinder/intropricing/paywall/view/offers/IntroPricingProduct;", "getSelected", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.intropricing.paywall.view.offers.b */
public final class C11893b implements ItemViewModel {
    @NotNull
    /* renamed from: a */
    private final String f38781a;
    @NotNull
    /* renamed from: b */
    private final C9742c f38782b;
    /* renamed from: c */
    private final boolean f38783c;

    @NotNull
    /* renamed from: a */
    public static /* synthetic */ C11893b m47895a(C11893b c11893b, C9742c c9742c, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            c9742c = c11893b.f38782b;
        }
        if ((i & 2) != 0) {
            z = c11893b.f38783c;
        }
        return c11893b.m47896a(c9742c, z);
    }

    @NotNull
    /* renamed from: a */
    public final C11893b m47896a(@NotNull C9742c c9742c, boolean z) {
        C2668g.b(c9742c, "product");
        return new C11893b(c9742c, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11893b) {
            C11893b c11893b = (C11893b) obj;
            if (C2668g.a(this.f38782b, c11893b.f38782b)) {
                if ((this.f38783c == c11893b.f38783c ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        C9742c c9742c = this.f38782b;
        int hashCode = (c9742c != null ? c9742c.hashCode() : 0) * 31;
        int i = this.f38783c;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IntroPricingOfferViewModel(product=");
        stringBuilder.append(this.f38782b);
        stringBuilder.append(", selected=");
        stringBuilder.append(this.f38783c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C11893b(@NotNull C9742c c9742c, boolean z) {
        C2668g.b(c9742c, "product");
        this.f38782b = c9742c;
        this.f38783c = z;
        this.f38781a = this.f38782b.m40252a();
    }

    @NotNull
    /* renamed from: a */
    public final C9742c m47897a() {
        return this.f38782b;
    }

    public /* synthetic */ C11893b(C9742c c9742c, boolean z, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            z = false;
        }
        this(c9742c, z);
    }

    /* renamed from: b */
    public final boolean m47898b() {
        return this.f38783c;
    }

    @NotNull
    public String getId() {
        return this.f38781a;
    }
}
