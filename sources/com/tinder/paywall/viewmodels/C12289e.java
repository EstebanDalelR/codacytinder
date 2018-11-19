package com.tinder.paywall.viewmodels;

import android.graphics.drawable.GradientDrawable;
import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006$"}, d2 = {"Lcom/tinder/paywall/viewmodels/IconWithBackgroundPaywallPerkViewModel;", "Lcom/tinder/paywall/viewmodels/PaywallPerkViewModel;", "paywallPerk", "Lcom/tinder/paywall/viewmodels/PaywallPerk;", "foregroundIconRes", "", "backgroundIconRes", "title", "", "byline", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "(Lcom/tinder/paywall/viewmodels/PaywallPerk;IILjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/GradientDrawable;)V", "getBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "getBackgroundIconRes", "()I", "getByline", "()Ljava/lang/String;", "getForegroundIconRes", "getPaywallPerk", "()Lcom/tinder/paywall/viewmodels/PaywallPerk;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.viewmodels.e */
public final class C12289e extends C10093o {
    @NotNull
    /* renamed from: a */
    private final PaywallPerk f39769a;
    /* renamed from: b */
    private final int f39770b;
    /* renamed from: c */
    private final int f39771c;
    @NotNull
    /* renamed from: d */
    private final String f39772d;
    @NotNull
    /* renamed from: e */
    private final String f39773e;
    @Nullable
    /* renamed from: f */
    private final GradientDrawable f39774f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12289e) {
            C12289e c12289e = (C12289e) obj;
            if (C2668g.a(mo10767a(), c12289e.mo10767a())) {
                if ((this.f39770b == c12289e.f39770b ? 1 : null) != null) {
                    return (this.f39771c == c12289e.f39771c ? 1 : null) != null && C2668g.a(mo10768c(), c12289e.mo10768c()) && C2668g.a(mo10769d(), c12289e.mo10769d()) && C2668g.a(mo10770e(), c12289e.mo10770e());
                }
            }
        }
    }

    public int hashCode() {
        PaywallPerk a = mo10767a();
        int i = 0;
        int hashCode = (((((a != null ? a.hashCode() : 0) * 31) + this.f39770b) * 31) + this.f39771c) * 31;
        String c = mo10768c();
        hashCode = (hashCode + (c != null ? c.hashCode() : 0)) * 31;
        c = mo10769d();
        hashCode = (hashCode + (c != null ? c.hashCode() : 0)) * 31;
        GradientDrawable e = mo10770e();
        if (e != null) {
            i = e.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IconWithBackgroundPaywallPerkViewModel(paywallPerk=");
        stringBuilder.append(mo10767a());
        stringBuilder.append(", foregroundIconRes=");
        stringBuilder.append(this.f39770b);
        stringBuilder.append(", backgroundIconRes=");
        stringBuilder.append(this.f39771c);
        stringBuilder.append(", title=");
        stringBuilder.append(mo10768c());
        stringBuilder.append(", byline=");
        stringBuilder.append(mo10769d());
        stringBuilder.append(", backgroundDrawable=");
        stringBuilder.append(mo10770e());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @NotNull
    /* renamed from: a */
    public PaywallPerk mo10767a() {
        return this.f39769a;
    }

    /* renamed from: b */
    public final int m48541b() {
        return this.f39770b;
    }

    /* renamed from: f */
    public final int m48545f() {
        return this.f39771c;
    }

    @NotNull
    /* renamed from: c */
    public String mo10768c() {
        return this.f39772d;
    }

    @NotNull
    /* renamed from: d */
    public String mo10769d() {
        return this.f39773e;
    }

    @JvmOverloads
    public /* synthetic */ C12289e(PaywallPerk paywallPerk, int i, int i2, String str, String str2, GradientDrawable gradientDrawable, int i3, C15823e c15823e) {
        if ((i3 & 32) != 0) {
            gradientDrawable = null;
        }
        this(paywallPerk, i, i2, str, str2, gradientDrawable);
    }

    @Nullable
    /* renamed from: e */
    public GradientDrawable mo10770e() {
        return this.f39774f;
    }

    @JvmOverloads
    public C12289e(@NotNull PaywallPerk paywallPerk, int i, int i2, @NotNull String str, @NotNull String str2, @Nullable GradientDrawable gradientDrawable) {
        C2668g.b(paywallPerk, "paywallPerk");
        C2668g.b(str, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(str2, "byline");
        super();
        this.f39769a = paywallPerk;
        this.f39770b = i;
        this.f39771c = i2;
        this.f39772d = str;
        this.f39773e = str2;
        this.f39774f = gradientDrawable;
    }
}
