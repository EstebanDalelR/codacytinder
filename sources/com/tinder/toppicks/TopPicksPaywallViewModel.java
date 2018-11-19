package com.tinder.toppicks;

import android.support.annotation.StringRes;
import com.facebook.ads.AudienceNetworkActivity;
import com.tinder.paywall.viewmodels.C10085h;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0002)*BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lcom/tinder/toppicks/TopPicksPaywallViewModel;", "", "title", "", "byline", "bylineType", "Lcom/tinder/toppicks/TopPicksPaywallViewModel$BylineType;", "buttonText", "viewType", "Lcom/tinder/toppicks/TopPicksPaywallViewModel$ViewType;", "paywallItemGroupViewModel", "Lcom/tinder/paywall/viewmodels/PaywallItemGroupViewModel;", "countDownTime", "", "(IILcom/tinder/toppicks/TopPicksPaywallViewModel$BylineType;ILcom/tinder/toppicks/TopPicksPaywallViewModel$ViewType;Lcom/tinder/paywall/viewmodels/PaywallItemGroupViewModel;J)V", "getButtonText", "()I", "getByline", "getBylineType", "()Lcom/tinder/toppicks/TopPicksPaywallViewModel$BylineType;", "getCountDownTime", "()J", "getPaywallItemGroupViewModel", "()Lcom/tinder/paywall/viewmodels/PaywallItemGroupViewModel;", "getTitle", "getViewType", "()Lcom/tinder/toppicks/TopPicksPaywallViewModel$ViewType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "BylineType", "ViewType", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksPaywallViewModel {
    /* renamed from: a */
    private final int f47303a;
    /* renamed from: b */
    private final int f47304b;
    @NotNull
    /* renamed from: c */
    private final BylineType f47305c;
    /* renamed from: d */
    private final int f47306d;
    @NotNull
    /* renamed from: e */
    private final ViewType f47307e;
    @Nullable
    /* renamed from: f */
    private final C10085h f47308f;
    /* renamed from: g */
    private final long f47309g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/toppicks/TopPicksPaywallViewModel$BylineType;", "", "(Ljava/lang/String;I)V", "TIMER", "PLAIN_TEXT", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum BylineType {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/toppicks/TopPicksPaywallViewModel$ViewType;", "", "(Ljava/lang/String;I)V", "PAYWALL_ITEMS", "PICKS_NOT_AVAILABLE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum ViewType {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TopPicksPaywallViewModel) {
            TopPicksPaywallViewModel topPicksPaywallViewModel = (TopPicksPaywallViewModel) obj;
            if ((this.f47303a == topPicksPaywallViewModel.f47303a ? 1 : null) != null) {
                if ((this.f47304b == topPicksPaywallViewModel.f47304b ? 1 : null) != null && C2668g.a(this.f47305c, topPicksPaywallViewModel.f47305c)) {
                    if ((this.f47306d == topPicksPaywallViewModel.f47306d ? 1 : null) != null && C2668g.a(this.f47307e, topPicksPaywallViewModel.f47307e) && C2668g.a(this.f47308f, topPicksPaywallViewModel.f47308f)) {
                        if ((this.f47309g == topPicksPaywallViewModel.f47309g ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = ((this.f47303a * 31) + this.f47304b) * 31;
        BylineType bylineType = this.f47305c;
        int i2 = 0;
        i = (((i + (bylineType != null ? bylineType.hashCode() : 0)) * 31) + this.f47306d) * 31;
        ViewType viewType = this.f47307e;
        i = (i + (viewType != null ? viewType.hashCode() : 0)) * 31;
        C10085h c10085h = this.f47308f;
        if (c10085h != null) {
            i2 = c10085h.hashCode();
        }
        i = (i + i2) * 31;
        long j = this.f47309g;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TopPicksPaywallViewModel(title=");
        stringBuilder.append(this.f47303a);
        stringBuilder.append(", byline=");
        stringBuilder.append(this.f47304b);
        stringBuilder.append(", bylineType=");
        stringBuilder.append(this.f47305c);
        stringBuilder.append(", buttonText=");
        stringBuilder.append(this.f47306d);
        stringBuilder.append(", viewType=");
        stringBuilder.append(this.f47307e);
        stringBuilder.append(", paywallItemGroupViewModel=");
        stringBuilder.append(this.f47308f);
        stringBuilder.append(", countDownTime=");
        stringBuilder.append(this.f47309g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public TopPicksPaywallViewModel(@StringRes int i, @StringRes int i2, @NotNull BylineType bylineType, @StringRes int i3, @NotNull ViewType viewType, @Nullable C10085h c10085h, long j) {
        C2668g.b(bylineType, "bylineType");
        C2668g.b(viewType, AudienceNetworkActivity.VIEW_TYPE);
        this.f47303a = i;
        this.f47304b = i2;
        this.f47305c = bylineType;
        this.f47306d = i3;
        this.f47307e = viewType;
        this.f47308f = c10085h;
        this.f47309g = j;
    }

    /* renamed from: a */
    public final int m57280a() {
        return this.f47303a;
    }

    /* renamed from: b */
    public final int m57281b() {
        return this.f47304b;
    }

    @NotNull
    /* renamed from: c */
    public final BylineType m57282c() {
        return this.f47305c;
    }

    /* renamed from: d */
    public final int m57283d() {
        return this.f47306d;
    }

    @NotNull
    /* renamed from: e */
    public final ViewType m57284e() {
        return this.f47307e;
    }

    @Nullable
    /* renamed from: f */
    public final C10085h m57285f() {
        return this.f47308f;
    }

    /* renamed from: g */
    public final long m57286g() {
        return this.f47309g;
    }
}
