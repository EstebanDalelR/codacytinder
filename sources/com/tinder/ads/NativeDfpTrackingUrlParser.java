package com.tinder.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.domain.common.TrackingUrl;
import com.tinder.domain.common.TrackingUrl.Event;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import kotlin.sequences.C19285g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/ads/NativeDfpTrackingUrlParser;", "", "()V", "eventToken", "", "event", "Lcom/tinder/domain/common/TrackingUrl$Event;", "parseTrackingUrls", "", "Lcom/tinder/domain/common/TrackingUrl;", "nativeAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Deprecated(message = "Use TrackingUrlFactory")
public final class NativeDfpTrackingUrlParser {
    @NotNull
    public final List<TrackingUrl> parseTrackingUrls(@NotNull Event event, @NotNull NativeCustomTemplateAd nativeCustomTemplateAd) {
        C2668g.m10309b(event, "event");
        C2668g.m10309b(nativeCustomTemplateAd, "nativeAd");
        Object availableAssetNames = nativeCustomTemplateAd.getAvailableAssetNames();
        C2668g.m10305a(availableAssetNames, "nativeAd.availableAssetNames");
        return C19285g.f(C19285g.e(C19285g.a(C19301m.r((Iterable) availableAssetNames), new NativeDfpTrackingUrlParser$parseTrackingUrls$1(this, event, nativeCustomTemplateAd)), new NativeDfpTrackingUrlParser$parseTrackingUrls$2(event, nativeCustomTemplateAd)));
    }

    private final String eventToken(Event event) {
        switch (NativeDfpTrackingUrlParser$WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
                return "impressions";
            case 2:
                return "opens";
            case 3:
                return "clicks";
            case 4:
                return "swipes";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
