package com.tinder.messageads.model;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.addy.Ad;
import com.tinder.addy.Ad.AdType;
import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000fHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003Jm\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\b\u00100\u001a\u00020\u0007H\u0016J\t\u00101\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u00062"}, d2 = {"Lcom/tinder/messageads/model/MessageAd;", "Lcom/tinder/addy/Ad;", "customTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "adType", "Lcom/tinder/addy/Ad$AdType;", "logoUrl", "", "clickthroughText", "lineItemId", "clickthroughUrl", "creativeId", "body", "title", "endDate", "Lorg/joda/time/DateTime;", "(Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;Lcom/tinder/addy/Ad$AdType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getAdType", "()Lcom/tinder/addy/Ad$AdType;", "getBody", "()Ljava/lang/String;", "getClickthroughText", "getClickthroughUrl", "getCreativeId", "getCustomTemplateAd", "()Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "getEndDate", "()Lorg/joda/time/DateTime;", "getLineItemId", "getLogoUrl", "getTitle", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "id", "toString", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.messageads.model.a */
public final class C12131a implements Ad {
    @NotNull
    /* renamed from: a */
    private final NativeCustomTemplateAd f39354a;
    @NotNull
    /* renamed from: b */
    private final AdType f39355b;
    @NotNull
    /* renamed from: c */
    private final String f39356c;
    @NotNull
    /* renamed from: d */
    private final String f39357d;
    @NotNull
    /* renamed from: e */
    private final String f39358e;
    @NotNull
    /* renamed from: f */
    private final String f39359f;
    @NotNull
    /* renamed from: g */
    private final String f39360g;
    @NotNull
    /* renamed from: h */
    private final String f39361h;
    @NotNull
    /* renamed from: i */
    private final String f39362i;
    @NotNull
    /* renamed from: j */
    private final DateTime f39363j;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C12131a) {
                C12131a c12131a = (C12131a) obj;
                if (C2668g.a(this.f39354a, c12131a.f39354a) && C2668g.a(this.f39355b, c12131a.f39355b) && C2668g.a(this.f39356c, c12131a.f39356c) && C2668g.a(this.f39357d, c12131a.f39357d) && C2668g.a(this.f39358e, c12131a.f39358e) && C2668g.a(this.f39359f, c12131a.f39359f) && C2668g.a(this.f39360g, c12131a.f39360g) && C2668g.a(this.f39361h, c12131a.f39361h) && C2668g.a(this.f39362i, c12131a.f39362i) && C2668g.a(this.f39363j, c12131a.f39363j)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.f39354a;
        int i = 0;
        int hashCode = (nativeCustomTemplateAd != null ? nativeCustomTemplateAd.hashCode() : 0) * 31;
        AdType adType = this.f39355b;
        hashCode = (hashCode + (adType != null ? adType.hashCode() : 0)) * 31;
        String str = this.f39356c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f39357d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f39358e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f39359f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f39360g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f39361h;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f39362i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        DateTime dateTime = this.f39363j;
        if (dateTime != null) {
            i = dateTime.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MessageAd(customTemplateAd=");
        stringBuilder.append(this.f39354a);
        stringBuilder.append(", adType=");
        stringBuilder.append(this.f39355b);
        stringBuilder.append(", logoUrl=");
        stringBuilder.append(this.f39356c);
        stringBuilder.append(", clickthroughText=");
        stringBuilder.append(this.f39357d);
        stringBuilder.append(", lineItemId=");
        stringBuilder.append(this.f39358e);
        stringBuilder.append(", clickthroughUrl=");
        stringBuilder.append(this.f39359f);
        stringBuilder.append(", creativeId=");
        stringBuilder.append(this.f39360g);
        stringBuilder.append(", body=");
        stringBuilder.append(this.f39361h);
        stringBuilder.append(", title=");
        stringBuilder.append(this.f39362i);
        stringBuilder.append(", endDate=");
        stringBuilder.append(this.f39363j);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C12131a(@NotNull NativeCustomTemplateAd nativeCustomTemplateAd, @NotNull AdType adType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull DateTime dateTime) {
        C2668g.b(nativeCustomTemplateAd, "customTemplateAd");
        C2668g.b(adType, "adType");
        C2668g.b(str, "logoUrl");
        C2668g.b(str2, "clickthroughText");
        C2668g.b(str3, "lineItemId");
        C2668g.b(str4, "clickthroughUrl");
        C2668g.b(str5, "creativeId");
        C2668g.b(str6, "body");
        C2668g.b(str7, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(dateTime, "endDate");
        this.f39354a = nativeCustomTemplateAd;
        this.f39355b = adType;
        this.f39356c = str;
        this.f39357d = str2;
        this.f39358e = str3;
        this.f39359f = str4;
        this.f39360g = str5;
        this.f39361h = str6;
        this.f39362i = str7;
        this.f39363j = dateTime;
    }

    @NotNull
    /* renamed from: a */
    public final NativeCustomTemplateAd m48271a() {
        return this.f39354a;
    }

    @NotNull
    /* renamed from: b */
    public final String m48272b() {
        return this.f39356c;
    }

    @NotNull
    /* renamed from: c */
    public final String m48273c() {
        return this.f39357d;
    }

    @NotNull
    /* renamed from: d */
    public final String m48274d() {
        return this.f39358e;
    }

    @NotNull
    /* renamed from: e */
    public final String m48275e() {
        return this.f39359f;
    }

    @NotNull
    /* renamed from: f */
    public final String m48276f() {
        return this.f39361h;
    }

    @NotNull
    /* renamed from: g */
    public final String m48277g() {
        return this.f39362i;
    }

    @NotNull
    /* renamed from: h */
    public final DateTime m48278h() {
        return this.f39363j;
    }

    @NotNull
    public String id() {
        return this.f39358e;
    }

    @NotNull
    public AdType adType() {
        return this.f39355b;
    }
}
