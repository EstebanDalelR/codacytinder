package com.tinder.paywall.viewmodels;

import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.purchase.domain.model.C14510e;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\b\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0010HÆ\u0003J\t\u0010$\u001a\u00020\u0010HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J}\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001J\u0013\u0010.\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, d2 = {"Lcom/tinder/paywall/viewmodels/PaywallItemViewModel;", "", "count", "", "itemName", "", "price", "discountPrice", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "highlightInfo", "savings", "uiElements", "Lcom/tinder/paywall/viewmodels/PaywallItemUiElements;", "paywallItemNameTextSize", "isBaseSku", "", "shouldShowDiscount", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/purchase/domain/model/Offer;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/paywall/viewmodels/PaywallItemUiElements;IZZ)V", "getCount", "()I", "getDiscountPrice", "()Ljava/lang/String;", "getHighlightInfo", "()Z", "getItemName", "getOffer", "()Lcom/tinder/purchase/domain/model/Offer;", "getPaywallItemNameTextSize", "getPrice", "getSavings", "getShouldShowDiscount", "getUiElements", "()Lcom/tinder/paywall/viewmodels/PaywallItemUiElements;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.viewmodels.l */
public final class C10090l {
    /* renamed from: a */
    private final int f32994a;
    @Nullable
    /* renamed from: b */
    private final String f32995b;
    @Nullable
    /* renamed from: c */
    private final String f32996c;
    @Nullable
    /* renamed from: d */
    private final String f32997d;
    @NotNull
    /* renamed from: e */
    private final C14510e f32998e;
    @NotNull
    /* renamed from: f */
    private final String f32999f;
    @NotNull
    /* renamed from: g */
    private final String f33000g;
    @NotNull
    /* renamed from: h */
    private final C10087i f33001h;
    /* renamed from: i */
    private final int f33002i;
    /* renamed from: j */
    private final boolean f33003j;
    /* renamed from: k */
    private final boolean f33004k;

    @NotNull
    /* renamed from: a */
    public static /* synthetic */ C10090l m41243a(C10090l c10090l, int i, String str, String str2, String str3, C14510e c14510e, String str4, String str5, C10087i c10087i, int i2, boolean z, boolean z2, int i3, Object obj) {
        C10090l c10090l2 = c10090l;
        int i4 = i3;
        return c10090l2.m41245a((i4 & 1) != 0 ? c10090l2.f32994a : i, (i4 & 2) != 0 ? c10090l2.f32995b : str, (i4 & 4) != 0 ? c10090l2.f32996c : str2, (i4 & 8) != 0 ? c10090l2.f32997d : str3, (i4 & 16) != 0 ? c10090l2.f32998e : c14510e, (i4 & 32) != 0 ? c10090l2.f32999f : str4, (i4 & 64) != 0 ? c10090l2.f33000g : str5, (i4 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? c10090l2.f33001h : c10087i, (i4 & 256) != 0 ? c10090l2.f33002i : i2, (i4 & 512) != 0 ? c10090l2.f33003j : z, (i4 & 1024) != 0 ? c10090l2.f33004k : z2);
    }

    @NotNull
    /* renamed from: a */
    public final C10090l m41245a(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull C14510e c14510e, @NotNull String str4, @NotNull String str5, @NotNull C10087i c10087i, int i2, boolean z, boolean z2) {
        C14510e c14510e2 = c14510e;
        C2668g.b(c14510e2, "offer");
        String str6 = str4;
        C2668g.b(str6, "highlightInfo");
        String str7 = str5;
        C2668g.b(str7, "savings");
        C10087i c10087i2 = c10087i;
        C2668g.b(c10087i2, "uiElements");
        return new C10090l(i, str, str2, str3, c14510e2, str6, str7, c10087i2, i2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10090l) {
            C10090l c10090l = (C10090l) obj;
            if ((this.f32994a == c10090l.f32994a ? 1 : null) != null && C2668g.a(this.f32995b, c10090l.f32995b) && C2668g.a(this.f32996c, c10090l.f32996c) && C2668g.a(this.f32997d, c10090l.f32997d) && C2668g.a(this.f32998e, c10090l.f32998e) && C2668g.a(this.f32999f, c10090l.f32999f) && C2668g.a(this.f33000g, c10090l.f33000g) && C2668g.a(this.f33001h, c10090l.f33001h)) {
                if ((this.f33002i == c10090l.f33002i ? 1 : null) != null) {
                    if ((this.f33003j == c10090l.f33003j ? 1 : null) != null) {
                        if ((this.f33004k == c10090l.f33004k ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f32994a * 31;
        String str = this.f32995b;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f32996c;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f32997d;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        C14510e c14510e = this.f32998e;
        i = (i + (c14510e != null ? c14510e.hashCode() : 0)) * 31;
        str = this.f32999f;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f33000g;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        C10087i c10087i = this.f33001h;
        if (c10087i != null) {
            i2 = c10087i.hashCode();
        }
        i = (((i + i2) * 31) + this.f33002i) * 31;
        int i3 = this.f33003j;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.f33004k;
        if (i3 != 0) {
            i3 = 1;
        }
        return i + i3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PaywallItemViewModel(count=");
        stringBuilder.append(this.f32994a);
        stringBuilder.append(", itemName=");
        stringBuilder.append(this.f32995b);
        stringBuilder.append(", price=");
        stringBuilder.append(this.f32996c);
        stringBuilder.append(", discountPrice=");
        stringBuilder.append(this.f32997d);
        stringBuilder.append(", offer=");
        stringBuilder.append(this.f32998e);
        stringBuilder.append(", highlightInfo=");
        stringBuilder.append(this.f32999f);
        stringBuilder.append(", savings=");
        stringBuilder.append(this.f33000g);
        stringBuilder.append(", uiElements=");
        stringBuilder.append(this.f33001h);
        stringBuilder.append(", paywallItemNameTextSize=");
        stringBuilder.append(this.f33002i);
        stringBuilder.append(", isBaseSku=");
        stringBuilder.append(this.f33003j);
        stringBuilder.append(", shouldShowDiscount=");
        stringBuilder.append(this.f33004k);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10090l(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull C14510e c14510e, @NotNull String str4, @NotNull String str5, @NotNull C10087i c10087i, int i2, boolean z, boolean z2) {
        C2668g.b(c14510e, "offer");
        C2668g.b(str4, "highlightInfo");
        C2668g.b(str5, "savings");
        C2668g.b(c10087i, "uiElements");
        this.f32994a = i;
        this.f32995b = str;
        this.f32996c = str2;
        this.f32997d = str3;
        this.f32998e = c14510e;
        this.f32999f = str4;
        this.f33000g = str5;
        this.f33001h = c10087i;
        this.f33002i = i2;
        this.f33003j = z;
        this.f33004k = z2;
    }

    /* renamed from: a */
    public final int m41244a() {
        return this.f32994a;
    }

    @Nullable
    /* renamed from: b */
    public final String m41246b() {
        return this.f32995b;
    }

    @Nullable
    /* renamed from: c */
    public final String m41247c() {
        return this.f32996c;
    }

    @Nullable
    /* renamed from: d */
    public final String m41248d() {
        return this.f32997d;
    }

    @NotNull
    /* renamed from: e */
    public final String m41249e() {
        return this.f32999f;
    }

    @NotNull
    /* renamed from: f */
    public final String m41250f() {
        return this.f33000g;
    }

    @NotNull
    /* renamed from: g */
    public final C10087i m41251g() {
        return this.f33001h;
    }

    /* renamed from: h */
    public final int m41252h() {
        return this.f33002i;
    }

    /* renamed from: i */
    public final boolean m41253i() {
        return this.f33003j;
    }

    /* renamed from: j */
    public final boolean m41254j() {
        return this.f33004k;
    }
}
