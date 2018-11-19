package com.tinder.intropricing.paywall.p266b;

import com.tinder.intropricing.domain.model.IntroPricingPaywallType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/tinder/intropricing/paywall/viewmodels/IntroPricingInfoViewModel;", "", "discountPercentage", "", "type", "Lcom/tinder/intropricing/domain/model/IntroPricingPaywallType;", "expirationTime", "Lorg/joda/time/DateTime;", "discountedPrice", "", "originalPrice", "perks", "", "Lcom/tinder/intropricing/paywall/viewmodels/IntroPricingPerkViewModel;", "(ILcom/tinder/intropricing/domain/model/IntroPricingPaywallType;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDiscountPercentage", "()I", "getDiscountedPrice", "()Ljava/lang/String;", "getExpirationTime", "()Lorg/joda/time/DateTime;", "getOriginalPrice", "getPerks", "()Ljava/util/List;", "getType", "()Lcom/tinder/intropricing/domain/model/IntroPricingPaywallType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.intropricing.paywall.b.a */
public final class C9735a {
    /* renamed from: a */
    private final int f32340a;
    @NotNull
    /* renamed from: b */
    private final IntroPricingPaywallType f32341b;
    @NotNull
    /* renamed from: c */
    private final DateTime f32342c;
    @NotNull
    /* renamed from: d */
    private final String f32343d;
    @NotNull
    /* renamed from: e */
    private final String f32344e;
    @NotNull
    /* renamed from: f */
    private final List<C11889e> f32345f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9735a) {
            C9735a c9735a = (C9735a) obj;
            return (this.f32340a == c9735a.f32340a ? 1 : null) != null && C2668g.a(this.f32341b, c9735a.f32341b) && C2668g.a(this.f32342c, c9735a.f32342c) && C2668g.a(this.f32343d, c9735a.f32343d) && C2668g.a(this.f32344e, c9735a.f32344e) && C2668g.a(this.f32345f, c9735a.f32345f);
        }
    }

    public int hashCode() {
        int i = this.f32340a * 31;
        IntroPricingPaywallType introPricingPaywallType = this.f32341b;
        int i2 = 0;
        i = (i + (introPricingPaywallType != null ? introPricingPaywallType.hashCode() : 0)) * 31;
        DateTime dateTime = this.f32342c;
        i = (i + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        String str = this.f32343d;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f32344e;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f32345f;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IntroPricingInfoViewModel(discountPercentage=");
        stringBuilder.append(this.f32340a);
        stringBuilder.append(", type=");
        stringBuilder.append(this.f32341b);
        stringBuilder.append(", expirationTime=");
        stringBuilder.append(this.f32342c);
        stringBuilder.append(", discountedPrice=");
        stringBuilder.append(this.f32343d);
        stringBuilder.append(", originalPrice=");
        stringBuilder.append(this.f32344e);
        stringBuilder.append(", perks=");
        stringBuilder.append(this.f32345f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9735a(int i, @NotNull IntroPricingPaywallType introPricingPaywallType, @NotNull DateTime dateTime, @NotNull String str, @NotNull String str2, @NotNull List<C11889e> list) {
        C2668g.b(introPricingPaywallType, "type");
        C2668g.b(dateTime, "expirationTime");
        C2668g.b(str, "discountedPrice");
        C2668g.b(str2, "originalPrice");
        C2668g.b(list, "perks");
        this.f32340a = i;
        this.f32341b = introPricingPaywallType;
        this.f32342c = dateTime;
        this.f32343d = str;
        this.f32344e = str2;
        this.f32345f = list;
    }

    @NotNull
    /* renamed from: a */
    public final IntroPricingPaywallType m40238a() {
        return this.f32341b;
    }

    @NotNull
    /* renamed from: b */
    public final DateTime m40239b() {
        return this.f32342c;
    }

    @NotNull
    /* renamed from: c */
    public final String m40240c() {
        return this.f32343d;
    }

    @NotNull
    /* renamed from: d */
    public final String m40241d() {
        return this.f32344e;
    }

    @NotNull
    /* renamed from: e */
    public final List<C11889e> m40242e() {
        return this.f32345f;
    }
}
