package com.tinder.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.domain.common.TrackingUrl;
import com.tinder.domain.common.TrackingUrl.Event;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/common/TrackingUrl;", "trackingUrl", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class NativeDfpTrackingUrlParser$parseTrackingUrls$2 extends Lambda implements Function1<String, TrackingUrl> {
    final /* synthetic */ Event $event;
    final /* synthetic */ NativeCustomTemplateAd $nativeAd;

    NativeDfpTrackingUrlParser$parseTrackingUrls$2(Event event, NativeCustomTemplateAd nativeCustomTemplateAd) {
        this.$event = event;
        this.$nativeAd = nativeCustomTemplateAd;
        super(1);
    }

    @NotNull
    public final TrackingUrl invoke(String str) {
        Event event = this.$event;
        C2668g.a(str, "trackingUrl");
        return new TrackingUrl(event, C19303i.b(str, "unique", false, 2, null), this.$nativeAd.getText(str).toString(), null, null, 24, null);
    }
}
