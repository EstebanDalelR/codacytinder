package com.tinder.intropricing.paywall.p266b;

import com.tinder.intropricing.paywall.view.offers.C11893b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/tinder/intropricing/paywall/viewmodels/IntroPricingOffersViewModel;", "", "expirationTime", "Lorg/joda/time/DateTime;", "originalFullPrice", "", "originalMonthlyPrice", "offers", "", "Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOfferViewModel;", "(Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getExpirationTime", "()Lorg/joda/time/DateTime;", "getOffers", "()Ljava/util/List;", "getOriginalFullPrice", "()Ljava/lang/String;", "getOriginalMonthlyPrice", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.intropricing.paywall.b.b */
public final class C9736b {
    @NotNull
    /* renamed from: a */
    private final DateTime f32346a;
    @NotNull
    /* renamed from: b */
    private final String f32347b;
    @NotNull
    /* renamed from: c */
    private final String f32348c;
    @NotNull
    /* renamed from: d */
    private final List<C11893b> f32349d;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9736b) {
                C9736b c9736b = (C9736b) obj;
                if (C2668g.a(this.f32346a, c9736b.f32346a) && C2668g.a(this.f32347b, c9736b.f32347b) && C2668g.a(this.f32348c, c9736b.f32348c) && C2668g.a(this.f32349d, c9736b.f32349d)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        DateTime dateTime = this.f32346a;
        int i = 0;
        int hashCode = (dateTime != null ? dateTime.hashCode() : 0) * 31;
        String str = this.f32347b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f32348c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f32349d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IntroPricingOffersViewModel(expirationTime=");
        stringBuilder.append(this.f32346a);
        stringBuilder.append(", originalFullPrice=");
        stringBuilder.append(this.f32347b);
        stringBuilder.append(", originalMonthlyPrice=");
        stringBuilder.append(this.f32348c);
        stringBuilder.append(", offers=");
        stringBuilder.append(this.f32349d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9736b(@NotNull DateTime dateTime, @NotNull String str, @NotNull String str2, @NotNull List<C11893b> list) {
        C2668g.b(dateTime, "expirationTime");
        C2668g.b(str, "originalFullPrice");
        C2668g.b(str2, "originalMonthlyPrice");
        C2668g.b(list, "offers");
        this.f32346a = dateTime;
        this.f32347b = str;
        this.f32348c = str2;
        this.f32349d = list;
    }

    @NotNull
    /* renamed from: a */
    public final DateTime m40243a() {
        return this.f32346a;
    }

    @NotNull
    /* renamed from: b */
    public final String m40244b() {
        return this.f32347b;
    }

    @NotNull
    /* renamed from: c */
    public final String m40245c() {
        return this.f32348c;
    }

    @NotNull
    /* renamed from: d */
    public final List<C11893b> m40246d() {
        return this.f32349d;
    }
}
