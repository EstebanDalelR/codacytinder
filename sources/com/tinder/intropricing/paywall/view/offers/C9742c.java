package com.tinder.intropricing.paywall.view.offers;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/tinder/intropricing/paywall/view/offers/IntroPricingProduct;", "", "id", "", "offerLength", "", "offerLengthName", "offerPrice", "originalPrice", "originalFullPrice", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getOfferLength", "()I", "getOfferLengthName", "getOfferPrice", "getOriginalFullPrice", "getOriginalPrice", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.intropricing.paywall.view.offers.c */
public final class C9742c {
    @NotNull
    /* renamed from: a */
    private final String f32355a;
    /* renamed from: b */
    private final int f32356b;
    @NotNull
    /* renamed from: c */
    private final String f32357c;
    @NotNull
    /* renamed from: d */
    private final String f32358d;
    @NotNull
    /* renamed from: e */
    private final String f32359e;
    @NotNull
    /* renamed from: f */
    private final String f32360f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9742c) {
            C9742c c9742c = (C9742c) obj;
            if (C2668g.a(this.f32355a, c9742c.f32355a)) {
                return (this.f32356b == c9742c.f32356b ? 1 : null) != null && C2668g.a(this.f32357c, c9742c.f32357c) && C2668g.a(this.f32358d, c9742c.f32358d) && C2668g.a(this.f32359e, c9742c.f32359e) && C2668g.a(this.f32360f, c9742c.f32360f);
            }
        }
    }

    public int hashCode() {
        String str = this.f32355a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f32356b) * 31;
        String str2 = this.f32357c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f32358d;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f32359e;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f32360f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IntroPricingProduct(id=");
        stringBuilder.append(this.f32355a);
        stringBuilder.append(", offerLength=");
        stringBuilder.append(this.f32356b);
        stringBuilder.append(", offerLengthName=");
        stringBuilder.append(this.f32357c);
        stringBuilder.append(", offerPrice=");
        stringBuilder.append(this.f32358d);
        stringBuilder.append(", originalPrice=");
        stringBuilder.append(this.f32359e);
        stringBuilder.append(", originalFullPrice=");
        stringBuilder.append(this.f32360f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9742c(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        C2668g.b(str, "id");
        C2668g.b(str2, "offerLengthName");
        C2668g.b(str3, "offerPrice");
        C2668g.b(str4, "originalPrice");
        C2668g.b(str5, "originalFullPrice");
        this.f32355a = str;
        this.f32356b = i;
        this.f32357c = str2;
        this.f32358d = str3;
        this.f32359e = str4;
        this.f32360f = str5;
    }

    @NotNull
    /* renamed from: a */
    public final String m40252a() {
        return this.f32355a;
    }

    /* renamed from: b */
    public final int m40253b() {
        return this.f32356b;
    }

    @NotNull
    /* renamed from: c */
    public final String m40254c() {
        return this.f32357c;
    }

    @NotNull
    /* renamed from: d */
    public final String m40255d() {
        return this.f32358d;
    }

    @NotNull
    /* renamed from: e */
    public final String m40256e() {
        return this.f32359e;
    }

    @NotNull
    /* renamed from: f */
    public final String m40257f() {
        return this.f32360f;
    }
}
