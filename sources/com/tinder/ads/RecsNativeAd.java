package com.tinder.ads;

import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.ads.source.dfp.NativeDfpAd;
import com.tinder.ads.source.dfp.NativeDfpSource;
import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\f\u001a\u00020\bJ\b\u0010\r\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u000e\u001a\u0004\u0018\u00010\b¨\u0006\u000f"}, d2 = {"Lcom/tinder/ads/RecsNativeAd;", "Lcom/tinder/ads/source/dfp/NativeDfpAd;", "source", "Lcom/tinder/ads/source/dfp/NativeDfpSource;", "nativeCustomTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "(Lcom/tinder/ads/source/dfp/NativeDfpSource;Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;)V", "clickThroughText", "", "clickthroughUrl", "displayImage", "Lcom/google/android/gms/ads/formats/NativeAd$Image;", "lineItemId", "logo", "title", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class RecsNativeAd extends NativeDfpAd {
    public RecsNativeAd(@NotNull NativeDfpSource nativeDfpSource, @NotNull NativeCustomTemplateAd nativeCustomTemplateAd) {
        C2668g.b(nativeDfpSource, "source");
        C2668g.b(nativeCustomTemplateAd, "nativeCustomTemplateAd");
        super(nativeDfpSource, nativeCustomTemplateAd);
    }

    @Nullable
    public final C2355b logo() {
        return getNativeCustomTemplateAd().getImage("logo");
    }

    @Nullable
    public final String clickThroughText() {
        CharSequence text = getNativeCustomTemplateAd().getText("clickthrough_text");
        return text != null ? text.toString() : null;
    }

    @NotNull
    public final String lineItemId() {
        return getNativeCustomTemplateAd().getText("line_item_id").toString();
    }

    @Nullable
    public final String clickthroughUrl() {
        CharSequence text = getNativeCustomTemplateAd().getText("clickthrough_url");
        return text != null ? text.toString() : null;
    }

    @Nullable
    public final String title() {
        CharSequence text = getNativeCustomTemplateAd().getText(ManagerWebServices.PARAM_JOB_TITLE);
        return text != null ? text.toString() : null;
    }

    @Nullable
    public final C2355b displayImage() {
        return getNativeCustomTemplateAd().getImage("display_image");
    }
}
