package com.tinder.recsads.p467b;

import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.addy.Ad;
import com.tinder.addy.Ad.AdType;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.AdFactory;
import com.tinder.api.ManagerWebServices;
import com.tinder.recsads.model.C18029g;
import com.tinder.recsads.model.RecsAdType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/recsads/factory/RecsNativeDisplayAdFactory;", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$AdFactory;", "()V", "create", "Lcom/tinder/recsads/model/RecsNativeDisplayAd;", "wrapped", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.b.g */
public final class C16454g implements AdFactory {
    public /* synthetic */ Ad create(NativeCustomTemplateAd nativeCustomTemplateAd) {
        return m61868a(nativeCustomTemplateAd);
    }

    @NotNull
    /* renamed from: a */
    public C18029g m61868a(@NotNull NativeCustomTemplateAd nativeCustomTemplateAd) {
        C2668g.b(nativeCustomTemplateAd, "wrapped");
        C2355b image = nativeCustomTemplateAd.getImage("logo");
        CharSequence text = nativeCustomTemplateAd.getText("clickthrough_text");
        Drawable drawable = null;
        String obj = text != null ? text.toString() : null;
        text = nativeCustomTemplateAd.getText("line_item_id");
        String obj2 = text != null ? text.toString() : null;
        text = nativeCustomTemplateAd.getText("clickthrough_url");
        String obj3 = text != null ? text.toString() : null;
        text = nativeCustomTemplateAd.getText(ManagerWebServices.PARAM_JOB_TITLE);
        String obj4 = text != null ? text.toString() : null;
        C2355b image2 = nativeCustomTemplateAd.getImage("display_image");
        AdType adType = RecsAdType.NATIVE_DISPLAY_DFP;
        Drawable a = image != null ? image.a() : null;
        if (obj3 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (obj == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (obj2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (obj4 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else {
            if (image2 != null) {
                drawable = image2.a();
            }
            return new C18029g(nativeCustomTemplateAd, adType, a, obj3, obj, obj2, obj4, drawable);
        }
    }
}
