package com.tinder.recsads.p467b;

import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.tinder.addy.Ad;
import com.tinder.addy.Ad.AdType;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.AdFactory;
import com.tinder.api.ManagerWebServices;
import com.tinder.recsads.model.RecsAdType;
import com.tinder.recsads.model.RecsNativeVideoAd;
import com.tinder.recsads.model.RecsNativeVideoAd.Style;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"Lcom/tinder/recsads/factory/RecsNativeVideoAdFactory;", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$AdFactory;", "()V", "create", "Lcom/tinder/recsads/model/RecsNativeVideoAd;", "wrapped", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "parseStyle", "Lcom/tinder/recsads/model/RecsNativeVideoAd$Style;", "style", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.b.i */
public final class C16455i implements AdFactory {
    public /* synthetic */ Ad create(NativeCustomTemplateAd nativeCustomTemplateAd) {
        return m61870a(nativeCustomTemplateAd);
    }

    @NotNull
    /* renamed from: a */
    public RecsNativeVideoAd m61870a(@NotNull NativeCustomTemplateAd nativeCustomTemplateAd) {
        NativeCustomTemplateAd nativeCustomTemplateAd2 = nativeCustomTemplateAd;
        C2668g.b(nativeCustomTemplateAd2, "wrapped");
        C2355b image = nativeCustomTemplateAd2.getImage("logo");
        CharSequence text = nativeCustomTemplateAd2.getText("clickthrough_text");
        String obj = text != null ? text.toString() : null;
        text = nativeCustomTemplateAd2.getText("line_item_id");
        String obj2 = text != null ? text.toString() : null;
        text = nativeCustomTemplateAd2.getText("clickthrough_url");
        String obj3 = text != null ? text.toString() : null;
        text = nativeCustomTemplateAd2.getText(ManagerWebServices.PARAM_JOB_TITLE);
        String obj4 = text != null ? text.toString() : null;
        C2355b image2 = nativeCustomTemplateAd2.getImage("display_image");
        CharSequence text2 = nativeCustomTemplateAd2.getText("style");
        String obj5 = text2 != null ? text2.toString() : null;
        if (obj5 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Style a = m61869a(obj5);
        CharSequence text3 = nativeCustomTemplateAd2.getText("subtitle");
        String obj6 = text3 != null ? text3.toString() : null;
        C2355b image3 = nativeCustomTemplateAd2.getImage("background_image");
        if (nativeCustomTemplateAd.getVideoMediaView() == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("videoMediaView is null for ad with line item id: ");
            stringBuilder.append(obj2);
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
        AdType adType = RecsAdType.NATIVE_VIDEO_DFP;
        if (a == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Drawable a2 = image != null ? image.a() : null;
        if (obj3 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (obj == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (obj2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (obj4 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (obj6 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else {
            Drawable a3;
            Drawable a4 = image2 != null ? image2.a() : null;
            if (image3 != null) {
                a3 = image3.a();
            } else {
                a3 = null;
            }
            return new RecsNativeVideoAd(nativeCustomTemplateAd2, adType, a, a2, obj3, obj, obj2, obj4, obj6, a4, a3);
        }
    }

    /* renamed from: a */
    private final Style m61869a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -894674659) {
            if (hashCode != 110119) {
                if (hashCode == 729267099) {
                    if (str.equals("portrait")) {
                        return Style.PORTRAIT;
                    }
                }
            } else if (str.equals("old")) {
                return Style.OLD;
            }
        } else if (str.equals(Property.LINE_CAP_SQUARE)) {
            return Style.SQUARE;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown Style: ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
