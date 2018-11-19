package com.tinder.recsads.model;

import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.addy.Ad;
import com.tinder.addy.Ad.AdType;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Photo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0002\u0010\u0018J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0016HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00060\rHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000f0\rHÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00110\rHÆ\u0003J§\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0006HÆ\u0001J\b\u0010;\u001a\u00020<H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\b\u0010C\u001a\u00020\u0006H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\rH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\t\u0010D\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001c¨\u0006E"}, d2 = {"Lcom/tinder/recsads/model/V2BrandedProfileCardAd;", "Lcom/tinder/addy/Ad;", "Lcom/tinder/recsads/model/BrandedProfileCardAd;", "nativeCustomTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "clickthroughUrl", "", "clickthroughText", "adType", "Lcom/tinder/addy/Ad$AdType;", "title", "subtitle", "images", "", "imageDrawables", "Landroid/graphics/drawable/Drawable;", "profilePhotos", "Lcom/tinder/domain/common/model/Photo;", "profileImageUrl", "body", "bio", "endDate", "Lorg/joda/time/DateTime;", "lineItemId", "(Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/addy/Ad$AdType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "getAdType", "()Lcom/tinder/addy/Ad$AdType;", "getBio", "()Ljava/lang/String;", "getBody", "getClickthroughText", "getClickthroughUrl", "getEndDate", "()Lorg/joda/time/DateTime;", "getImageDrawables", "()Ljava/util/List;", "getImages", "getLineItemId", "getNativeCustomTemplateAd", "()Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "getProfileImageUrl", "getProfilePhotos", "getSubtitle", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "destroy", "", "equals", "", "other", "", "hashCode", "", "id", "toString", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.model.h */
public final class C16469h implements Ad, BrandedProfileCardAd {
    @NotNull
    /* renamed from: a */
    private final NativeCustomTemplateAd f51081a;
    @NotNull
    /* renamed from: b */
    private final String f51082b;
    @NotNull
    /* renamed from: c */
    private final String f51083c;
    @NotNull
    /* renamed from: d */
    private final AdType f51084d;
    @NotNull
    /* renamed from: e */
    private final String f51085e;
    @NotNull
    /* renamed from: f */
    private final String f51086f;
    @NotNull
    /* renamed from: g */
    private final List<String> f51087g;
    @NotNull
    /* renamed from: h */
    private final List<Drawable> f51088h;
    @NotNull
    /* renamed from: i */
    private final List<Photo> f51089i;
    @NotNull
    /* renamed from: j */
    private final String f51090j;
    @NotNull
    /* renamed from: k */
    private final String f51091k;
    @NotNull
    /* renamed from: l */
    private final String f51092l;
    @NotNull
    /* renamed from: m */
    private final DateTime f51093m;
    @NotNull
    /* renamed from: n */
    private final String f51094n;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C16469h) {
                C16469h c16469h = (C16469h) obj;
                if (C2668g.a(this.f51081a, c16469h.f51081a) && C2668g.a(this.f51082b, c16469h.f51082b) && C2668g.a(this.f51083c, c16469h.f51083c) && C2668g.a(this.f51084d, c16469h.f51084d) && C2668g.a(this.f51085e, c16469h.f51085e) && C2668g.a(this.f51086f, c16469h.f51086f) && C2668g.a(this.f51087g, c16469h.f51087g) && C2668g.a(this.f51088h, c16469h.f51088h) && C2668g.a(this.f51089i, c16469h.f51089i) && C2668g.a(this.f51090j, c16469h.f51090j) && C2668g.a(this.f51091k, c16469h.f51091k) && C2668g.a(this.f51092l, c16469h.f51092l) && C2668g.a(this.f51093m, c16469h.f51093m) && C2668g.a(this.f51094n, c16469h.f51094n)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.f51081a;
        int i = 0;
        int hashCode = (nativeCustomTemplateAd != null ? nativeCustomTemplateAd.hashCode() : 0) * 31;
        String str = this.f51082b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f51083c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        AdType adType = this.f51084d;
        hashCode = (hashCode + (adType != null ? adType.hashCode() : 0)) * 31;
        str = this.f51085e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f51086f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f51087g;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.f51088h;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.f51089i;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        str = this.f51090j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f51091k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f51092l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        DateTime dateTime = this.f51093m;
        hashCode = (hashCode + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        str = this.f51094n;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("V2BrandedProfileCardAd(nativeCustomTemplateAd=");
        stringBuilder.append(this.f51081a);
        stringBuilder.append(", clickthroughUrl=");
        stringBuilder.append(this.f51082b);
        stringBuilder.append(", clickthroughText=");
        stringBuilder.append(this.f51083c);
        stringBuilder.append(", adType=");
        stringBuilder.append(this.f51084d);
        stringBuilder.append(", title=");
        stringBuilder.append(this.f51085e);
        stringBuilder.append(", subtitle=");
        stringBuilder.append(this.f51086f);
        stringBuilder.append(", images=");
        stringBuilder.append(this.f51087g);
        stringBuilder.append(", imageDrawables=");
        stringBuilder.append(this.f51088h);
        stringBuilder.append(", profilePhotos=");
        stringBuilder.append(this.f51089i);
        stringBuilder.append(", profileImageUrl=");
        stringBuilder.append(this.f51090j);
        stringBuilder.append(", body=");
        stringBuilder.append(this.f51091k);
        stringBuilder.append(", bio=");
        stringBuilder.append(this.f51092l);
        stringBuilder.append(", endDate=");
        stringBuilder.append(this.f51093m);
        stringBuilder.append(", lineItemId=");
        stringBuilder.append(this.f51094n);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C16469h(@NotNull NativeCustomTemplateAd nativeCustomTemplateAd, @NotNull String str, @NotNull String str2, @NotNull AdType adType, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, @NotNull List<? extends Drawable> list2, @NotNull List<? extends Photo> list3, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull DateTime dateTime, @NotNull String str8) {
        C2668g.b(nativeCustomTemplateAd, "nativeCustomTemplateAd");
        C2668g.b(str, "clickthroughUrl");
        C2668g.b(str2, "clickthroughText");
        C2668g.b(adType, "adType");
        C2668g.b(str3, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(str4, "subtitle");
        C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
        C2668g.b(list2, "imageDrawables");
        C2668g.b(list3, "profilePhotos");
        C2668g.b(str5, "profileImageUrl");
        C2668g.b(str6, "body");
        C2668g.b(str7, ManagerWebServices.PARAM_BIO);
        C2668g.b(dateTime, "endDate");
        C2668g.b(str8, "lineItemId");
        this.f51081a = nativeCustomTemplateAd;
        this.f51082b = str;
        this.f51083c = str2;
        this.f51084d = adType;
        this.f51085e = str3;
        this.f51086f = str4;
        this.f51087g = list;
        this.f51088h = list2;
        this.f51089i = list3;
        this.f51090j = str5;
        this.f51091k = str6;
        this.f51092l = str7;
        this.f51093m = dateTime;
        this.f51094n = str8;
    }

    @NotNull
    /* renamed from: a */
    public final NativeCustomTemplateAd m61880a() {
        return this.f51081a;
    }

    @NotNull
    /* renamed from: b */
    public final String m61881b() {
        return this.f51082b;
    }

    @NotNull
    /* renamed from: c */
    public final String m61882c() {
        return this.f51083c;
    }

    @NotNull
    /* renamed from: d */
    public final String m61883d() {
        return this.f51085e;
    }

    @NotNull
    /* renamed from: e */
    public final List<Photo> m61884e() {
        return this.f51089i;
    }

    @NotNull
    /* renamed from: f */
    public final String m61885f() {
        return this.f51090j;
    }

    @NotNull
    /* renamed from: g */
    public final String m61886g() {
        return this.f51091k;
    }

    @NotNull
    /* renamed from: h */
    public final DateTime m61887h() {
        return this.f51093m;
    }

    @NotNull
    /* renamed from: i */
    public final String m61888i() {
        return this.f51094n;
    }

    @Nullable
    public String profileImageUrl() {
        return this.f51090j;
    }

    @NotNull
    public List<Photo> profilePhotos() {
        return this.f51089i;
    }

    @NotNull
    public String clickthroughText() {
        return this.f51083c;
    }

    @NotNull
    public String clickthroughUrl() {
        return this.f51082b;
    }

    @NotNull
    public AdType adType() {
        return this.f51084d;
    }

    @NotNull
    public String id() {
        String customTemplateId = this.f51081a.getCustomTemplateId();
        C2668g.a(customTemplateId, "nativeCustomTemplateAd.customTemplateId");
        return customTemplateId;
    }

    @NotNull
    public String title() {
        return this.f51085e;
    }

    @NotNull
    public String subtitle() {
        return this.f51086f;
    }

    @NotNull
    public String lineItemId() {
        return this.f51094n;
    }

    @NotNull
    public String body() {
        return this.f51091k;
    }

    @NotNull
    public String bio() {
        return this.f51092l;
    }

    @NotNull
    public DateTime endDate() {
        return this.f51093m;
    }

    @NotNull
    public List<String> images() {
        return this.f51087g;
    }

    @NotNull
    public List<Drawable> imageDrawables() {
        return this.f51088h;
    }

    public void destroy() {
        this.f51081a.destroy();
    }
}
