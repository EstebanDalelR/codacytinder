package com.tinder.ads;

import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.ads.Ad.AdType;
import com.tinder.ads.source.dfp.NativeDfpAd;
import com.tinder.ads.source.dfp.NativeDfpSource;
import com.tinder.ads.source.dfp.NativeDfpSource.NativeDfpAdFactory;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Render;
import com.tinder.domain.common.model.Photo.Render.Builder;
import com.tinder.recsads.model.BrandedProfileCardAd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.format.C19315a;
import org.joda.time.format.C19316b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002:\u0001%B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000eH\u0002J\b\u0010!\u001a\u00020\u000eH\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u001bH\u0016J\b\u0010#\u001a\u00020\u000eH\u0016J\b\u0010$\u001a\u00020\u000eH\u0016R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/tinder/ads/V1BrandedProfileCardAd;", "Lcom/tinder/ads/source/dfp/NativeDfpAd;", "Lcom/tinder/recsads/model/BrandedProfileCardAd;", "source", "Lcom/tinder/ads/source/dfp/NativeDfpSource;", "nativeCustomTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "(Lcom/tinder/ads/source/dfp/NativeDfpSource;Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;)V", "DATE_FORMATTER", "Lorg/joda/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "adType", "Lcom/tinder/ads/Ad$AdType;", "bio", "", "body", "clickthroughText", "clickthroughUrl", "createPhotoFromDfpImage", "Lcom/tinder/domain/common/model/Photo;", "image", "Lcom/google/android/gms/ads/formats/NativeAd$Image;", "destroy", "", "endDate", "Lorg/joda/time/DateTime;", "imageDrawables", "", "Landroid/graphics/drawable/Drawable;", "images", "lineItemId", "parseDate", "date", "profileImageUrl", "profilePhotos", "subtitle", "title", "Factory", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class V1BrandedProfileCardAd extends NativeDfpAd implements BrandedProfileCardAd {
    private final C19316b DATE_FORMATTER = C19315a.a("yyyy/MM/dd");

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/ads/V1BrandedProfileCardAd$Factory;", "Lcom/tinder/ads/source/dfp/NativeDfpSource$NativeDfpAdFactory;", "()V", "createAd", "Lcom/tinder/ads/source/dfp/NativeDfpAd;", "source", "Lcom/tinder/ads/source/dfp/NativeDfpSource;", "wrapped", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Factory extends NativeDfpAdFactory {
        @NotNull
        public NativeDfpAd createAd(@NotNull NativeDfpSource nativeDfpSource, @NotNull NativeCustomTemplateAd nativeCustomTemplateAd) {
            C2668g.b(nativeDfpSource, "source");
            C2668g.b(nativeCustomTemplateAd, "wrapped");
            return new V1BrandedProfileCardAd(nativeDfpSource, nativeCustomTemplateAd);
        }
    }

    public V1BrandedProfileCardAd(@NotNull NativeDfpSource nativeDfpSource, @NotNull NativeCustomTemplateAd nativeCustomTemplateAd) {
        C2668g.b(nativeDfpSource, "source");
        C2668g.b(nativeCustomTemplateAd, "nativeCustomTemplateAd");
        super(nativeDfpSource, nativeCustomTemplateAd);
    }

    @NotNull
    public String profileImageUrl() {
        C2355b image = getNativeCustomTemplateAd().getImage("image_1");
        C2668g.a(image, "nativeCustomTemplateAd.g…ASSET_NAME_PROFILE_IMAGE)");
        String uri = image.b().toString();
        C2668g.a(uri, "nativeCustomTemplateAd.g…ILE_IMAGE).uri.toString()");
        return uri;
    }

    @NotNull
    public AdType adType() {
        return TinderAdType.BRANDED_PROFILE_CARD;
    }

    @NotNull
    public String title() {
        return getNativeCustomTemplateAd().getText(ManagerWebServices.PARAM_JOB_TITLE).toString();
    }

    @NotNull
    public String subtitle() {
        return getNativeCustomTemplateAd().getText("subtitle").toString();
    }

    @NotNull
    public String lineItemId() {
        return getNativeCustomTemplateAd().getText("line_item_id").toString();
    }

    @NotNull
    public String body() {
        return getNativeCustomTemplateAd().getText("body").toString();
    }

    @NotNull
    public String bio() {
        return getNativeCustomTemplateAd().getText(ManagerWebServices.PARAM_BIO).toString();
    }

    @NotNull
    public DateTime endDate() {
        return parseDate(getNativeCustomTemplateAd().getText("end_date").toString());
    }

    @NotNull
    public List<String> images() {
        List availableAssetNames = getNativeCustomTemplateAd().getAvailableAssetNames();
        C2668g.a(availableAssetNames, "nativeCustomTemplateAd.availableAssetNames");
        Collection arrayList = new ArrayList();
        for (Object next : availableAssetNames) {
            String str = (String) next;
            C2668g.a(str, "it");
            if (C19303i.b(str, "image_", false, 2, null)) {
                arrayList.add(next);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (String image : (List) arrayList) {
            C2355b image2 = getNativeCustomTemplateAd().getImage(image);
            if (image2 != null) {
                arrayList2.add(image2);
            }
        }
        Iterable<C2355b> iterable = (List) arrayList2;
        arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (C2355b image22 : iterable) {
            arrayList.add(image22.b().toString());
        }
        return C19301m.l((List) arrayList);
    }

    @NotNull
    public List<Drawable> imageDrawables() {
        List availableAssetNames = getNativeCustomTemplateAd().getAvailableAssetNames();
        C2668g.a(availableAssetNames, "nativeCustomTemplateAd.availableAssetNames");
        Collection arrayList = new ArrayList();
        for (Object next : availableAssetNames) {
            String str = (String) next;
            C2668g.a(str, "it");
            if (C19303i.b(str, "image_", false, 2, null)) {
                arrayList.add(next);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (String image : (List) arrayList) {
            C2355b image2 = getNativeCustomTemplateAd().getImage(image);
            if (image2 != null) {
                arrayList2.add(image2);
            }
        }
        Iterable<C2355b> iterable = (List) arrayList2;
        arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (C2355b image22 : iterable) {
            arrayList.add(image22.a());
        }
        return C19301m.l((List) arrayList);
    }

    @NotNull
    public List<Photo> profilePhotos() {
        List availableAssetNames = getNativeCustomTemplateAd().getAvailableAssetNames();
        C2668g.a(availableAssetNames, "nativeCustomTemplateAd.availableAssetNames");
        Collection arrayList = new ArrayList();
        for (Object next : availableAssetNames) {
            String str = (String) next;
            C2668g.a(str, "it");
            if (C19303i.b(str, "image_", false, 2, null)) {
                arrayList.add(next);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (String image : (List) arrayList) {
            C2355b image2 = getNativeCustomTemplateAd().getImage(image);
            if (image2 != null) {
                arrayList2.add(image2);
            }
        }
        Iterable<C2355b> iterable = (List) arrayList2;
        arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (C2355b image22 : iterable) {
            arrayList.add(createPhotoFromDfpImage(image22));
        }
        return C19301m.l((List) arrayList);
    }

    private final Photo createPhotoFromDfpImage(C2355b c2355b) {
        Builder builder = Render.builder();
        Drawable a = c2355b.a();
        C2668g.a(a, "image.drawable");
        builder = builder.height(a.getIntrinsicHeight());
        a = c2355b.a();
        C2668g.a(a, "image.drawable");
        c2355b = Photo.builder().id(c2355b.b().toString()).url(c2355b.b().toString()).renders(C19301m.a(builder.width(a.getIntrinsicWidth()).url(c2355b.b().toString()).build())).videos(C19301m.a()).build();
        C2668g.a(c2355b, "Photo.builder()\n        …\n                .build()");
        return c2355b;
    }

    private final DateTime parseDate(String str) {
        str = this.DATE_FORMATTER.d(str);
        C2668g.a(str, "DATE_FORMATTER.parseDateTime(date)");
        return str;
    }

    public void destroy() {
        getNativeCustomTemplateAd().destroy();
    }

    @NotNull
    public String clickthroughText() {
        return getNativeCustomTemplateAd().getText("clickthrough_text").toString();
    }

    @NotNull
    public String clickthroughUrl() {
        return getNativeCustomTemplateAd().getText("clickthrough_url").toString();
    }
}
