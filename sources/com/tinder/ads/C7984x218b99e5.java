package com.tinder.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.addy.Ad.AdType;
import com.tinder.ads.source.dfp.NativeDfpAd;
import com.tinder.recsads.model.C16468f;
import com.tinder.recsads.model.RecsAdType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"com/tinder/ads/AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener$AddyV2NativeDfpAdMapper$map$1", "Lcom/tinder/recsads/model/RecsNativeDfpAd;", "(Lcom/tinder/ads/source/dfp/NativeDfpAd;)V", "clickthroughUrl", "", "getClickthroughUrl", "()Ljava/lang/String;", "lineItemId", "getLineItemId", "nativeCustomTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "getNativeCustomTemplateAd", "()Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "adType", "Lcom/tinder/addy/Ad$AdType;", "id", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.ads.AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener$AddyV2NativeDfpAdMapper$map$1 */
public final class C7984x218b99e5 extends C16468f {
    final /* synthetic */ NativeDfpAd $v1NativeDfpAd;
    @Nullable
    private final String clickthroughUrl;
    @NotNull
    private final String lineItemId = getNativeCustomTemplateAd().getText("line_item_id").toString();
    @NotNull
    private final NativeCustomTemplateAd nativeCustomTemplateAd;

    C7984x218b99e5(NativeDfpAd nativeDfpAd) {
        this.$v1NativeDfpAd = nativeDfpAd;
        this.nativeCustomTemplateAd = nativeDfpAd.getNativeCustomTemplateAd();
        nativeDfpAd = getNativeCustomTemplateAd().getText("clickthrough_url");
        this.clickthroughUrl = nativeDfpAd != null ? nativeDfpAd.toString() : null;
    }

    @NotNull
    public String id() {
        return getNativeCustomTemplateAd().getText("line_item_id").toString();
    }

    @NotNull
    public AdType adType() {
        Ad.AdType adType = this.$v1NativeDfpAd.adType();
        if (adType == TinderAdType.REC_NATIVE_VIDEO_DFP) {
            return RecsAdType.NATIVE_VIDEO_DFP;
        }
        if (adType == TinderAdType.REC_NATIVE_DISPLAY_DFP) {
            return RecsAdType.NATIVE_DISPLAY_DFP;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ad Type not supported by AddyV2NativeDfpAdMapper: ");
        stringBuilder.append(this.$v1NativeDfpAd.adType());
        throw new IllegalStateException(stringBuilder.toString());
    }

    @NotNull
    public NativeCustomTemplateAd getNativeCustomTemplateAd() {
        return this.nativeCustomTemplateAd;
    }

    @NotNull
    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public String getClickthroughUrl() {
        return this.clickthroughUrl;
    }
}
