package com.tinder.ads;

import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.tinder.ads.Ad.AdType;
import com.tinder.ads.source.dfp.NativeDfpAd;
import com.tinder.ads.source.dfp.NativeDfpSource;
import com.tinder.ads.source.dfp.NativeDfpSource.NativeDfpAdFactory;
import com.tinder.ads.validation.AdValidator.Rule;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u000f\u001a\u0004\u0018\u00010\nJ\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u0010\u001a\u0004\u0018\u00010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/ads/RecsNativeVideoAd;", "Lcom/tinder/ads/RecsNativeAd;", "source", "Lcom/tinder/ads/source/dfp/NativeDfpSource;", "nativeCustomTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "(Lcom/tinder/ads/source/dfp/NativeDfpSource;Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;)V", "adStyle", "Lcom/tinder/ads/RecsNativeVideoAd$Style;", "style", "", "adType", "Lcom/tinder/ads/Ad$AdType;", "backgroundImage", "Lcom/google/android/gms/ads/formats/NativeAd$Image;", "body", "subtitle", "Factory", "Style", "ValidationRule", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsNativeVideoAd extends RecsNativeAd {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/ads/RecsNativeVideoAd$Style;", "", "(Ljava/lang/String;I)V", "PORTRAIT", "SQUARE", "OLD", "UNKNOWN", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Style {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/ads/RecsNativeVideoAd$ValidationRule;", "Lcom/tinder/ads/validation/AdValidator$Rule;", "()V", "isValid", "", "ad", "Lcom/tinder/ads/Ad;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class ValidationRule implements Rule {
        public boolean isValid(@NotNull Ad<?> ad) {
            boolean z;
            C2668g.b(ad, "ad");
            RecsNativeVideoAd recsNativeVideoAd = (RecsNativeVideoAd) ad;
            switch (recsNativeVideoAd.style()) {
                case PORTRAIT:
                case SQUARE:
                case OLD:
                    if (recsNativeVideoAd.getNativeCustomTemplateAd().getVideoMediaView() != null) {
                        z = true;
                        break;
                    }
                case UNKNOWN:
                    z = false;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (!z) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Emitted an invalid Native Video Ad ");
                stringBuilder.append(recsNativeVideoAd.title());
                C0001a.d(stringBuilder.toString(), new Object[0]);
            }
            return z;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/ads/RecsNativeVideoAd$Factory;", "Lcom/tinder/ads/source/dfp/NativeDfpSource$NativeDfpAdFactory;", "()V", "createAd", "Lcom/tinder/ads/source/dfp/NativeDfpAd;", "source", "Lcom/tinder/ads/source/dfp/NativeDfpSource;", "wrapped", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Factory extends NativeDfpAdFactory {
        @NotNull
        public NativeDfpAd createAd(@NotNull NativeDfpSource nativeDfpSource, @NotNull NativeCustomTemplateAd nativeCustomTemplateAd) {
            C2668g.b(nativeDfpSource, "source");
            C2668g.b(nativeCustomTemplateAd, "wrapped");
            return new RecsNativeVideoAd(nativeDfpSource, nativeCustomTemplateAd);
        }
    }

    public RecsNativeVideoAd(@NotNull NativeDfpSource nativeDfpSource, @NotNull NativeCustomTemplateAd nativeCustomTemplateAd) {
        C2668g.b(nativeDfpSource, "source");
        C2668g.b(nativeCustomTemplateAd, "nativeCustomTemplateAd");
        super(nativeDfpSource, nativeCustomTemplateAd);
    }

    @NotNull
    public AdType adType() {
        return TinderAdType.REC_NATIVE_VIDEO_DFP;
    }

    @NotNull
    public final Style style() {
        Object text = getNativeCustomTemplateAd().getText("style");
        if (text == null) {
            text = Style.OLD;
        }
        return adStyle(text.toString());
    }

    @Nullable
    public final C2355b backgroundImage() {
        return getNativeCustomTemplateAd().getImage("background_image");
    }

    @Nullable
    public final String subtitle() {
        CharSequence text = getNativeCustomTemplateAd().getText("subtitle");
        return text != null ? text.toString() : null;
    }

    @Nullable
    public final String body() {
        CharSequence text = getNativeCustomTemplateAd().getText("body");
        return text != null ? text.toString() : null;
    }

    private final Style adStyle(String str) {
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        str = str.toLowerCase();
        C2668g.a(str, "(this as java.lang.String).toLowerCase()");
        int hashCode = str.hashCode();
        if (hashCode != -894674659) {
            if (hashCode != 110119) {
                if (hashCode == 729267099) {
                    if (str.equals("portrait") != null) {
                        return Style.PORTRAIT;
                    }
                }
            } else if (str.equals("old") != null) {
                return Style.OLD;
            }
        } else if (str.equals(Property.LINE_CAP_SQUARE) != null) {
            return Style.SQUARE;
        }
        return Style.UNKNOWN;
    }
}
