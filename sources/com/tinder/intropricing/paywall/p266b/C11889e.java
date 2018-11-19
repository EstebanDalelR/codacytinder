package com.tinder.intropricing.paywall.p266b;

import android.support.annotation.StringRes;
import com.tinder.paywall.view.itemsgroup.ItemViewModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/intropricing/paywall/viewmodels/IntroPricingPerkViewModel;", "Lcom/tinder/paywall/view/itemsgroup/ItemViewModel;", "perk", "", "(I)V", "id", "", "getId", "()Ljava/lang/String;", "getPerk", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.intropricing.paywall.b.e */
public final class C11889e implements ItemViewModel {
    /* renamed from: a */
    private final int f38739a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11889e) {
            if ((this.f38739a == ((C11889e) obj).f38739a ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f38739a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IntroPricingPerkViewModel(perk=");
        stringBuilder.append(this.f38739a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C11889e(@StringRes int i) {
        this.f38739a = i;
    }

    /* renamed from: a */
    public final int m47870a() {
        return this.f38739a;
    }

    @NotNull
    public String getId() {
        return String.valueOf(this.f38739a);
    }
}
