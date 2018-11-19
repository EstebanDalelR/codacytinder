package com.tinder.recsads.model;

import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.addy.Ad.AdType;
import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/tinder/recsads/model/RecsNativeDisplayAd;", "Lcom/tinder/recsads/model/RecsNativeDfpAd;", "nativeCustomTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "adType", "Lcom/tinder/addy/Ad$AdType;", "logo", "Landroid/graphics/drawable/Drawable;", "clickthroughUrl", "", "clickthroughText", "lineItemId", "title", "displayImage", "(Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;Lcom/tinder/addy/Ad$AdType;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "getClickthroughText", "()Ljava/lang/String;", "getClickthroughUrl", "getDisplayImage", "()Landroid/graphics/drawable/Drawable;", "getLineItemId", "getLogo", "getNativeCustomTemplateAd", "()Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "getTitle", "destroy", "", "id", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.model.g */
public final class C18029g extends C16468f {
    @NotNull
    /* renamed from: a */
    private final NativeCustomTemplateAd f55989a;
    /* renamed from: b */
    private final AdType f55990b;
    @Nullable
    /* renamed from: c */
    private final Drawable f55991c;
    @Nullable
    /* renamed from: d */
    private final String f55992d;
    @NotNull
    /* renamed from: e */
    private final String f55993e;
    @NotNull
    /* renamed from: f */
    private final String f55994f;
    @NotNull
    /* renamed from: g */
    private final String f55995g;
    @Nullable
    /* renamed from: h */
    private final Drawable f55996h;

    @NotNull
    public NativeCustomTemplateAd getNativeCustomTemplateAd() {
        return this.f55989a;
    }

    @Nullable
    /* renamed from: b */
    public final Drawable m65452b() {
        return this.f55991c;
    }

    @Nullable
    public String getClickthroughUrl() {
        return this.f55992d;
    }

    @NotNull
    /* renamed from: c */
    public final String m65453c() {
        return this.f55993e;
    }

    @NotNull
    public String getLineItemId() {
        return this.f55994f;
    }

    @Nullable
    /* renamed from: d */
    public final Drawable m65454d() {
        return this.f55996h;
    }

    public C18029g(@NotNull NativeCustomTemplateAd nativeCustomTemplateAd, @NotNull AdType adType, @Nullable Drawable drawable, @Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable Drawable drawable2) {
        C2668g.b(nativeCustomTemplateAd, "nativeCustomTemplateAd");
        C2668g.b(adType, "adType");
        C2668g.b(str2, "clickthroughText");
        C2668g.b(str3, "lineItemId");
        C2668g.b(str4, ManagerWebServices.PARAM_JOB_TITLE);
        this.f55989a = nativeCustomTemplateAd;
        this.f55990b = adType;
        this.f55991c = drawable;
        this.f55992d = str;
        this.f55993e = str2;
        this.f55994f = str3;
        this.f55995g = str4;
        this.f55996h = drawable2;
    }

    @NotNull
    public String id() {
        String customTemplateId = getNativeCustomTemplateAd().getCustomTemplateId();
        C2668g.a(customTemplateId, "nativeCustomTemplateAd.customTemplateId");
        return customTemplateId;
    }

    @NotNull
    public AdType adType() {
        return this.f55990b;
    }

    /* renamed from: a */
    public final void m65451a() {
        getNativeCustomTemplateAd().destroy();
    }
}
