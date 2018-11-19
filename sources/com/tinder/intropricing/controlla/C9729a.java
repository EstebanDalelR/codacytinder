package com.tinder.intropricing.controlla;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/intropricing/controlla/GoldIntroPricingControllaViewModel;", "", "expirationTime", "Lorg/joda/time/DateTime;", "discount", "", "(Lorg/joda/time/DateTime;I)V", "getDiscount", "()I", "getExpirationTime", "()Lorg/joda/time/DateTime;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.intropricing.controlla.a */
public final class C9729a {
    @NotNull
    /* renamed from: a */
    private final DateTime f32328a;
    /* renamed from: b */
    private final int f32329b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9729a) {
            C9729a c9729a = (C9729a) obj;
            if (C2668g.a(this.f32328a, c9729a.f32328a)) {
                if ((this.f32329b == c9729a.f32329b ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        DateTime dateTime = this.f32328a;
        return ((dateTime != null ? dateTime.hashCode() : 0) * 31) + this.f32329b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GoldIntroPricingControllaViewModel(expirationTime=");
        stringBuilder.append(this.f32328a);
        stringBuilder.append(", discount=");
        stringBuilder.append(this.f32329b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9729a(@NotNull DateTime dateTime, int i) {
        C2668g.b(dateTime, "expirationTime");
        this.f32328a = dateTime;
        this.f32329b = i;
    }

    @NotNull
    /* renamed from: a */
    public final DateTime m40227a() {
        return this.f32328a;
    }

    /* renamed from: b */
    public final int m40228b() {
        return this.f32329b;
    }
}
