package com.facebook.ads;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.view.C1544a;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public class NativeAdView {

    public enum Type {
        HEIGHT_100(-1, 100),
        HEIGHT_120(-1, 120),
        HEIGHT_300(-1, MapboxConstants.ANIMATION_DURATION),
        HEIGHT_400(-1, 400);
        
        /* renamed from: a */
        private final int f3575a;
        /* renamed from: b */
        private final int f3576b;

        private Type(int i, int i2) {
            this.f3575a = i;
            this.f3576b = i2;
        }

        public int getHeight() {
            return this.f3576b;
        }

        public int getValue() {
            int i = this.f3576b;
            return i != 100 ? i != 120 ? i != MapboxConstants.ANIMATION_DURATION ? i != 400 ? -1 : 4 : 3 : 2 : 1;
        }

        public int getWidth() {
            return this.f3575a;
        }
    }

    public static View render(Context context, NativeAd nativeAd, Type type) {
        return render(context, nativeAd, type, null);
    }

    public static View render(Context context, NativeAd nativeAd, Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAd.isNativeConfigEnabled()) {
            nativeAdViewAttributes = nativeAd.getAdViewAttributes();
        } else if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        nativeAd.m12400a(type);
        return new C1544a(context, nativeAd, type, nativeAdViewAttributes);
    }
}
