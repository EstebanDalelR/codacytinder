package com.tinder.recsads.model;

import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.addy.Ad.AdType;
import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u00002\u00020\u0001:\u0001\"Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\r\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u0006#"}, d2 = {"Lcom/tinder/recsads/model/RecsNativeVideoAd;", "Lcom/tinder/recsads/model/RecsNativeDfpAd;", "nativeCustomTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "adType", "Lcom/tinder/addy/Ad$AdType;", "style", "Lcom/tinder/recsads/model/RecsNativeVideoAd$Style;", "logo", "Landroid/graphics/drawable/Drawable;", "clickthroughUrl", "", "clickthroughText", "lineItemId", "title", "subtitle", "displayImage", "backgroundImage", "(Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;Lcom/tinder/addy/Ad$AdType;Lcom/tinder/recsads/model/RecsNativeVideoAd$Style;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "getBackgroundImage", "()Landroid/graphics/drawable/Drawable;", "getClickthroughText", "()Ljava/lang/String;", "getClickthroughUrl", "getDisplayImage", "getLineItemId", "getLogo", "getNativeCustomTemplateAd", "()Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "getStyle", "()Lcom/tinder/recsads/model/RecsNativeVideoAd$Style;", "getSubtitle", "getTitle", "id", "Style", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public final class RecsNativeVideoAd extends C16468f {
    @NotNull
    /* renamed from: a */
    private final NativeCustomTemplateAd f55978a;
    /* renamed from: b */
    private final AdType f55979b;
    @NotNull
    /* renamed from: c */
    private final Style f55980c;
    @Nullable
    /* renamed from: d */
    private final Drawable f55981d;
    @Nullable
    /* renamed from: e */
    private final String f55982e;
    @NotNull
    /* renamed from: f */
    private final String f55983f;
    @NotNull
    /* renamed from: g */
    private final String f55984g;
    @NotNull
    /* renamed from: h */
    private final String f55985h;
    @NotNull
    /* renamed from: i */
    private final String f55986i;
    @Nullable
    /* renamed from: j */
    private final Drawable f55987j;
    @Nullable
    /* renamed from: k */
    private final Drawable f55988k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/recsads/model/RecsNativeVideoAd$Style;", "", "(Ljava/lang/String;I)V", "PORTRAIT", "SQUARE", "OLD", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    public enum Style {
    }

    @NotNull
    public NativeCustomTemplateAd getNativeCustomTemplateAd() {
        return this.f55978a;
    }

    @NotNull
    /* renamed from: a */
    public final Style m65444a() {
        return this.f55980c;
    }

    @Nullable
    /* renamed from: b */
    public final Drawable m65445b() {
        return this.f55981d;
    }

    @Nullable
    public String getClickthroughUrl() {
        return this.f55982e;
    }

    @NotNull
    /* renamed from: c */
    public final String m65446c() {
        return this.f55983f;
    }

    @NotNull
    public String getLineItemId() {
        return this.f55984g;
    }

    @NotNull
    /* renamed from: d */
    public final String m65447d() {
        return this.f55985h;
    }

    @NotNull
    /* renamed from: e */
    public final String m65448e() {
        return this.f55986i;
    }

    @Nullable
    /* renamed from: f */
    public final Drawable m65449f() {
        return this.f55987j;
    }

    @Nullable
    /* renamed from: g */
    public final Drawable m65450g() {
        return this.f55988k;
    }

    public RecsNativeVideoAd(@NotNull NativeCustomTemplateAd nativeCustomTemplateAd, @NotNull AdType adType, @NotNull Style style, @Nullable Drawable drawable, @Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        C2668g.b(nativeCustomTemplateAd, "nativeCustomTemplateAd");
        C2668g.b(adType, "adType");
        C2668g.b(style, "style");
        C2668g.b(str2, "clickthroughText");
        C2668g.b(str3, "lineItemId");
        C2668g.b(str4, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(str5, "subtitle");
        this.f55978a = nativeCustomTemplateAd;
        this.f55979b = adType;
        this.f55980c = style;
        this.f55981d = drawable;
        this.f55982e = str;
        this.f55983f = str2;
        this.f55984g = str3;
        this.f55985h = str4;
        this.f55986i = str5;
        this.f55987j = drawable2;
        this.f55988k = drawable3;
    }

    @NotNull
    public String id() {
        String customTemplateId = getNativeCustomTemplateAd().getCustomTemplateId();
        C2668g.a(customTemplateId, "nativeCustomTemplateAd.customTemplateId");
        return customTemplateId;
    }

    @NotNull
    public AdType adType() {
        return this.f55979b;
    }
}
