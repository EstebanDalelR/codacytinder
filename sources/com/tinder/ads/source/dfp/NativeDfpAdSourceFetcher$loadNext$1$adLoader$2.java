package com.tinder.ads.source.dfp;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import kotlin.Metadata;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "kotlin.jvm.PlatformType", "clickAction", "", "onCustomClick"}, k = 3, mv = {1, 1, 7})
final class NativeDfpAdSourceFetcher$loadNext$1$adLoader$2 implements OnCustomClickListener {
    public static final NativeDfpAdSourceFetcher$loadNext$1$adLoader$2 INSTANCE = new NativeDfpAdSourceFetcher$loadNext$1$adLoader$2();

    NativeDfpAdSourceFetcher$loadNext$1$adLoader$2() {
    }

    public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        C0001a.b(str, new Object[null]);
    }
}
