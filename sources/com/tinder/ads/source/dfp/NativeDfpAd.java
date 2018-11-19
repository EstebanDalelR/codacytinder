package com.tinder.ads.source.dfp;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.ads.Ad;
import com.tinder.ads.SourcePriority;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/ads/source/dfp/NativeDfpAd;", "Lcom/tinder/ads/Ad;", "Lcom/tinder/ads/source/dfp/NativeDfpSource;", "source", "nativeCustomTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "(Lcom/tinder/ads/source/dfp/NativeDfpSource;Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;)V", "getNativeCustomTemplateAd", "()Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "id", "", "priority", "Lcom/tinder/ads/SourcePriority;", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public abstract class NativeDfpAd implements Ad<NativeDfpSource> {
    @NotNull
    private final NativeCustomTemplateAd nativeCustomTemplateAd;
    private final NativeDfpSource source;

    public NativeDfpAd(@NotNull NativeDfpSource nativeDfpSource, @NotNull NativeCustomTemplateAd nativeCustomTemplateAd) {
        C2668g.b(nativeDfpSource, "source");
        C2668g.b(nativeCustomTemplateAd, "nativeCustomTemplateAd");
        this.source = nativeDfpSource;
        this.nativeCustomTemplateAd = nativeCustomTemplateAd;
    }

    @NotNull
    public final NativeCustomTemplateAd getNativeCustomTemplateAd() {
        return this.nativeCustomTemplateAd;
    }

    @NotNull
    public String id() {
        String customTemplateId = this.nativeCustomTemplateAd.getCustomTemplateId();
        C2668g.a(customTemplateId, "nativeCustomTemplateAd.customTemplateId");
        return customTemplateId;
    }

    @NotNull
    public NativeDfpSource source() {
        return this.source;
    }

    @NotNull
    public SourcePriority priority() {
        return SourcePriority.HIGH;
    }

    @NotNull
    public final NativeCustomTemplateAd nativeCustomTemplateAd() {
        return this.nativeCustomTemplateAd;
    }
}
