package com.tinder.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.ads.Ad.AdType;
import com.tinder.ads.source.dfp.NativeDfpAd;
import com.tinder.ads.source.dfp.NativeDfpSource;
import com.tinder.ads.source.dfp.NativeDfpSource.NativeDfpAdFactory;
import com.tinder.ads.validation.AdValidator.Rule;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\t\nB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/tinder/ads/RecsNativeDisplayAd;", "Lcom/tinder/ads/RecsNativeAd;", "source", "Lcom/tinder/ads/source/dfp/NativeDfpSource;", "nativeCustomTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "(Lcom/tinder/ads/source/dfp/NativeDfpSource;Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;)V", "adType", "Lcom/tinder/ads/Ad$AdType;", "Factory", "ValidationRule", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsNativeDisplayAd extends RecsNativeAd {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/ads/RecsNativeDisplayAd$ValidationRule;", "Lcom/tinder/ads/validation/AdValidator$Rule;", "()V", "isValid", "", "ad", "Lcom/tinder/ads/Ad;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class ValidationRule implements Rule {
        public boolean isValid(@NotNull Ad<?> ad) {
            C2668g.b(ad, "ad");
            return ((RecsNativeDisplayAd) ad).displayImage() != null ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/ads/RecsNativeDisplayAd$Factory;", "Lcom/tinder/ads/source/dfp/NativeDfpSource$NativeDfpAdFactory;", "()V", "createAd", "Lcom/tinder/ads/source/dfp/NativeDfpAd;", "source", "Lcom/tinder/ads/source/dfp/NativeDfpSource;", "wrapped", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Factory extends NativeDfpAdFactory {
        @NotNull
        public NativeDfpAd createAd(@NotNull NativeDfpSource nativeDfpSource, @NotNull NativeCustomTemplateAd nativeCustomTemplateAd) {
            C2668g.b(nativeDfpSource, "source");
            C2668g.b(nativeCustomTemplateAd, "wrapped");
            return new RecsNativeDisplayAd(nativeDfpSource, nativeCustomTemplateAd);
        }
    }

    public RecsNativeDisplayAd(@NotNull NativeDfpSource nativeDfpSource, @NotNull NativeCustomTemplateAd nativeCustomTemplateAd) {
        C2668g.b(nativeDfpSource, "source");
        C2668g.b(nativeCustomTemplateAd, "nativeCustomTemplateAd");
        super(nativeDfpSource, nativeCustomTemplateAd);
    }

    @NotNull
    public AdType adType() {
        return TinderAdType.REC_NATIVE_DISPLAY_DFP;
    }
}
