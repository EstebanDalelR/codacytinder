package com.tinder.intropricing.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/tinder/intropricing/domain/model/IntroPricingAvailability;", "", "isAvailable", "", "type", "Lcom/tinder/intropricing/domain/model/IntroPricingPaywallType;", "(ZLcom/tinder/intropricing/domain/model/IntroPricingPaywallType;)V", "()Z", "getType", "()Lcom/tinder/intropricing/domain/model/IntroPricingPaywallType;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.intropricing.domain.model.b */
public final class C9732b {
    /* renamed from: a */
    private final boolean f32333a;
    @NotNull
    /* renamed from: b */
    private final IntroPricingPaywallType f32334b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9732b) {
            C9732b c9732b = (C9732b) obj;
            return (this.f32333a == c9732b.f32333a ? 1 : null) != null && C2668g.a(this.f32334b, c9732b.f32334b);
        }
    }

    public int hashCode() {
        int i = this.f32333a;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        IntroPricingPaywallType introPricingPaywallType = this.f32334b;
        return i + (introPricingPaywallType != null ? introPricingPaywallType.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IntroPricingAvailability(isAvailable=");
        stringBuilder.append(this.f32333a);
        stringBuilder.append(", type=");
        stringBuilder.append(this.f32334b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9732b(boolean z, @NotNull IntroPricingPaywallType introPricingPaywallType) {
        C2668g.b(introPricingPaywallType, "type");
        this.f32333a = z;
        this.f32334b = introPricingPaywallType;
    }

    /* renamed from: a */
    public final boolean m40230a() {
        return this.f32333a;
    }
}
