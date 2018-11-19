package com.tinder.paywall.viewmodels;

import android.graphics.drawable.GradientDrawable;
import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, d2 = {"Lcom/tinder/paywall/viewmodels/IconPaywallPerkViewModel;", "Lcom/tinder/paywall/viewmodels/PaywallPerkViewModel;", "paywallPerk", "Lcom/tinder/paywall/viewmodels/PaywallPerk;", "iconRes", "", "title", "", "byline", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "(Lcom/tinder/paywall/viewmodels/PaywallPerk;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/GradientDrawable;)V", "getBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "getByline", "()Ljava/lang/String;", "getIconRes", "()I", "getPaywallPerk", "()Lcom/tinder/paywall/viewmodels/PaywallPerk;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.viewmodels.d */
public final class C12288d extends C10093o {
    @NotNull
    /* renamed from: a */
    private final PaywallPerk f39764a;
    /* renamed from: b */
    private final int f39765b;
    @NotNull
    /* renamed from: c */
    private final String f39766c;
    @NotNull
    /* renamed from: d */
    private final String f39767d;
    @Nullable
    /* renamed from: e */
    private final GradientDrawable f39768e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12288d) {
            C12288d c12288d = (C12288d) obj;
            if (C2668g.a(mo10767a(), c12288d.mo10767a())) {
                return (this.f39765b == c12288d.f39765b ? 1 : null) != null && C2668g.a(mo10768c(), c12288d.mo10768c()) && C2668g.a(mo10769d(), c12288d.mo10769d()) && C2668g.a(mo10770e(), c12288d.mo10770e());
            }
        }
    }

    public int hashCode() {
        PaywallPerk a = mo10767a();
        int i = 0;
        int hashCode = (((a != null ? a.hashCode() : 0) * 31) + this.f39765b) * 31;
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
        stringBuilder.append("IconPaywallPerkViewModel(paywallPerk=");
        stringBuilder.append(mo10767a());
        stringBuilder.append(", iconRes=");
        stringBuilder.append(this.f39765b);
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
        return this.f39764a;
    }

    /* renamed from: b */
    public final int m48536b() {
        return this.f39765b;
    }

    @NotNull
    /* renamed from: c */
    public String mo10768c() {
        return this.f39766c;
    }

    @NotNull
    /* renamed from: d */
    public String mo10769d() {
        return this.f39767d;
    }

    @JvmOverloads
    public /* synthetic */ C12288d(PaywallPerk paywallPerk, int i, String str, String str2, GradientDrawable gradientDrawable, int i2, C15823e c15823e) {
        if ((i2 & 16) != 0) {
            gradientDrawable = null;
        }
        this(paywallPerk, i, str, str2, gradientDrawable);
    }

    @Nullable
    /* renamed from: e */
    public GradientDrawable mo10770e() {
        return this.f39768e;
    }

    @JvmOverloads
    public C12288d(@NotNull PaywallPerk paywallPerk, int i, @NotNull String str, @NotNull String str2, @Nullable GradientDrawable gradientDrawable) {
        C2668g.b(paywallPerk, "paywallPerk");
        C2668g.b(str, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(str2, "byline");
        super();
        this.f39764a = paywallPerk;
        this.f39765b = i;
        this.f39766c = str;
        this.f39767d = str2;
        this.f39768e = gradientDrawable;
    }
}
