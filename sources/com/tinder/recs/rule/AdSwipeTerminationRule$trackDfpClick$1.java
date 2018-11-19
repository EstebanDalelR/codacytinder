package com.tinder.recs.rule;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import io.reactivex.functions.Action;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
final class AdSwipeTerminationRule$trackDfpClick$1 implements Action {
    final /* synthetic */ NativeCustomTemplateAd $nativeCustomTemplateAd;

    AdSwipeTerminationRule$trackDfpClick$1(NativeCustomTemplateAd nativeCustomTemplateAd) {
        this.$nativeCustomTemplateAd = nativeCustomTemplateAd;
    }

    public final void run() {
        this.$nativeCustomTemplateAd.performClick("media_view");
    }
}
