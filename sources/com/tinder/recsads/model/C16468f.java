package com.tinder.recsads.model;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.addy.Ad;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tinder/recsads/model/RecsNativeDfpAd;", "Lcom/tinder/addy/Ad;", "()V", "clickthroughUrl", "", "getClickthroughUrl", "()Ljava/lang/String;", "lineItemId", "getLineItemId", "nativeCustomTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "getNativeCustomTemplateAd", "()Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.model.f */
public abstract class C16468f implements Ad {
    @Nullable
    public abstract String getClickthroughUrl();

    @NotNull
    public abstract String getLineItemId();

    @NotNull
    public abstract NativeCustomTemplateAd getNativeCustomTemplateAd();
}
