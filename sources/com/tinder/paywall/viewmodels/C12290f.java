package com.tinder.paywall.viewmodels;

import android.graphics.drawable.GradientDrawable;
import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, d2 = {"Lcom/tinder/paywall/viewmodels/ImagePaywallPerkViewModel;", "Lcom/tinder/paywall/viewmodels/PaywallPerkViewModel;", "paywallPerk", "Lcom/tinder/paywall/viewmodels/PaywallPerk;", "imageUrls", "", "", "title", "byline", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "(Lcom/tinder/paywall/viewmodels/PaywallPerk;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/GradientDrawable;)V", "getBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "getByline", "()Ljava/lang/String;", "getImageUrls", "()Ljava/util/List;", "getPaywallPerk", "()Lcom/tinder/paywall/viewmodels/PaywallPerk;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.viewmodels.f */
public final class C12290f extends C10093o {
    @NotNull
    /* renamed from: a */
    private final PaywallPerk f39775a;
    @NotNull
    /* renamed from: b */
    private final List<String> f39776b;
    @NotNull
    /* renamed from: c */
    private final String f39777c;
    @NotNull
    /* renamed from: d */
    private final String f39778d;
    @Nullable
    /* renamed from: e */
    private final GradientDrawable f39779e;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C12290f) {
                C12290f c12290f = (C12290f) obj;
                if (C2668g.a(mo10767a(), c12290f.mo10767a()) && C2668g.a(this.f39776b, c12290f.f39776b) && C2668g.a(mo10768c(), c12290f.mo10768c()) && C2668g.a(mo10769d(), c12290f.mo10769d()) && C2668g.a(mo10770e(), c12290f.mo10770e())) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        PaywallPerk a = mo10767a();
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        List list = this.f39776b;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
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
        stringBuilder.append("ImagePaywallPerkViewModel(paywallPerk=");
        stringBuilder.append(mo10767a());
        stringBuilder.append(", imageUrls=");
        stringBuilder.append(this.f39776b);
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
        return this.f39775a;
    }

    @NotNull
    /* renamed from: b */
    public final List<String> m48547b() {
        return this.f39776b;
    }

    @NotNull
    /* renamed from: c */
    public String mo10768c() {
        return this.f39777c;
    }

    @NotNull
    /* renamed from: d */
    public String mo10769d() {
        return this.f39778d;
    }

    @JvmOverloads
    public /* synthetic */ C12290f(PaywallPerk paywallPerk, List list, String str, String str2, GradientDrawable gradientDrawable, int i, C15823e c15823e) {
        if ((i & 16) != 0) {
            gradientDrawable = null;
        }
        this(paywallPerk, list, str, str2, gradientDrawable);
    }

    @Nullable
    /* renamed from: e */
    public GradientDrawable mo10770e() {
        return this.f39779e;
    }

    @JvmOverloads
    public C12290f(@NotNull PaywallPerk paywallPerk, @NotNull List<String> list, @NotNull String str, @NotNull String str2, @Nullable GradientDrawable gradientDrawable) {
        C2668g.b(paywallPerk, "paywallPerk");
        C2668g.b(list, "imageUrls");
        C2668g.b(str, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(str2, "byline");
        super();
        this.f39775a = paywallPerk;
        this.f39776b = list;
        this.f39777c = str;
        this.f39778d = str2;
        this.f39779e = gradientDrawable;
    }
}
