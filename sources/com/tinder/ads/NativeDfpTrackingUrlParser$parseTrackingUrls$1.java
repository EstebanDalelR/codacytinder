package com.tinder.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.domain.common.TrackingUrl.Event;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19303i;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "url", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class NativeDfpTrackingUrlParser$parseTrackingUrls$1 extends Lambda implements Function1<String, Boolean> {
    final /* synthetic */ Event $event;
    final /* synthetic */ NativeCustomTemplateAd $nativeAd;
    final /* synthetic */ NativeDfpTrackingUrlParser this$0;

    NativeDfpTrackingUrlParser$parseTrackingUrls$1(NativeDfpTrackingUrlParser nativeDfpTrackingUrlParser, Event event, NativeCustomTemplateAd nativeCustomTemplateAd) {
        this.this$0 = nativeDfpTrackingUrlParser;
        this.$event = event;
        this.$nativeAd = nativeCustomTemplateAd;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((String) obj));
    }

    public final boolean invoke(String str) {
        C2668g.a(str, "url");
        if (!C19303i.b(str, NativeDfpTrackingUrlParser.access$eventToken(this.this$0, this.$event), true)) {
            return false;
        }
        str = this.$nativeAd.getText(str);
        C2668g.a(str, "nativeAd.getText(url)");
        return (str.length() > null ? true : null) != null;
    }
}
