package com.tinder.recsads.p467b;

import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.addy.Ad;
import com.tinder.addy.Ad.AdType;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.AdFactory;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Render;
import com.tinder.domain.common.model.Photo.Render.Builder;
import com.tinder.recsads.model.C16469h;
import com.tinder.recsads.model.RecsAdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C15807n;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19296q;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.format.C19315a;
import org.joda.time.format.C19316b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/recsads/factory/BrandedProfileCardAdFactory;", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$AdFactory;", "()V", "DATE_FORMATTER", "Lorg/joda/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "create", "Lcom/tinder/recsads/model/V2BrandedProfileCardAd;", "nativeCustomTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "createPhotoFromDfpImage", "Lcom/tinder/domain/common/model/Photo;", "image", "Lcom/google/android/gms/ads/formats/NativeAd$Image;", "parseDate", "Lorg/joda/time/DateTime;", "date", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.b.a */
public final class C16451a implements AdFactory {
    /* renamed from: a */
    private final C19316b f51040a = C19315a.a("yyyy/MM/dd");

    public /* synthetic */ Ad create(NativeCustomTemplateAd nativeCustomTemplateAd) {
        return m61867a(nativeCustomTemplateAd);
    }

    @NotNull
    /* renamed from: a */
    public C16469h m61867a(@NotNull NativeCustomTemplateAd nativeCustomTemplateAd) {
        C2355b image;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        C16451a c16451a = this;
        NativeCustomTemplateAd nativeCustomTemplateAd2 = nativeCustomTemplateAd;
        C2668g.b(nativeCustomTemplateAd2, "nativeCustomTemplateAd");
        CharSequence text = nativeCustomTemplateAd2.getText(ManagerWebServices.PARAM_JOB_TITLE);
        CharSequence text2 = nativeCustomTemplateAd2.getText("subtitle");
        CharSequence text3 = nativeCustomTemplateAd2.getText("line_item_id");
        CharSequence text4 = nativeCustomTemplateAd2.getText("body");
        CharSequence text5 = nativeCustomTemplateAd2.getText(ManagerWebServices.PARAM_BIO);
        CharSequence text6 = nativeCustomTemplateAd2.getText("end_date");
        List availableAssetNames = nativeCustomTemplateAd.getAvailableAssetNames();
        C2668g.a(availableAssetNames, "nativeCustomTemplateAd.availableAssetNames");
        Collection arrayList = new ArrayList();
        for (Object next : availableAssetNames) {
            String str2 = (String) next;
            C2668g.a(str2, "it");
            if (C19298r.m68786b((CharSequence) str2, (CharSequence) "image_", false, 2, null)) {
                arrayList.add(next);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (String str3 : (List) arrayList) {
            image = nativeCustomTemplateAd2.getImage(str3);
            if (image != null) {
                arrayList2.add(image);
            }
        }
        Iterable<C2355b> iterable = (List) arrayList2;
        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (C2355b b : iterable) {
            arrayList.add(b.b().toString());
        }
        availableAssetNames = C19299w.m68840l((List) arrayList);
        List availableAssetNames2 = nativeCustomTemplateAd.getAvailableAssetNames();
        C2668g.a(availableAssetNames2, "nativeCustomTemplateAd.availableAssetNames");
        Collection arrayList3 = new ArrayList();
        Iterator it = availableAssetNames2.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            str3 = (String) next2;
            C2668g.a(str3, "it");
            Iterator it2 = it;
            if (C19298r.m68786b((CharSequence) str3, (CharSequence) "image_", false, 2, null)) {
                arrayList3.add(next2);
            }
            it = it2;
        }
        arrayList = new ArrayList();
        for (String image2 : (List) arrayList3) {
            C2355b image3 = nativeCustomTemplateAd2.getImage(image2);
            if (image3 != null) {
                arrayList.add(image3);
            }
        }
        Iterable<C2355b> iterable2 = (List) arrayList;
        Collection arrayList4 = new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
        for (C2355b image32 : iterable2) {
            arrayList4.add(image32.a());
        }
        availableAssetNames2 = C19299w.m68840l((List) arrayList4);
        image = nativeCustomTemplateAd2.getImage("image_1");
        C2668g.a(image, "nativeCustomTemplateAd.getImage(\"image_1\")");
        String image22 = image.b().toString();
        List availableAssetNames3 = nativeCustomTemplateAd.getAvailableAssetNames();
        C2668g.a(availableAssetNames3, "nativeCustomTemplateAd.availableAssetNames");
        arrayList3 = new ArrayList();
        Iterator it3 = availableAssetNames3.iterator();
        while (it3.hasNext()) {
            next2 = it3.next();
            String str4 = (String) next2;
            C2668g.a(str4, "it");
            charSequence = text5;
            charSequence2 = text6;
            Iterator it4 = it3;
            if (C19298r.m68786b((CharSequence) str4, (CharSequence) "image_", false, 2, null)) {
                arrayList3.add(next2);
            }
            it3 = it4;
            text6 = charSequence2;
            text5 = charSequence;
        }
        charSequence = text5;
        charSequence2 = text6;
        Collection arrayList5 = new ArrayList();
        for (String str32 : (List) arrayList3) {
            image = nativeCustomTemplateAd2.getImage(str32);
            if (image != null) {
                arrayList5.add(image);
            }
        }
        Iterable<C2355b> iterable3 = (List) arrayList5;
        Collection arrayList6 = new ArrayList(C18457p.m66906a((Iterable) iterable3, 10));
        for (C2355b image4 : iterable3) {
            arrayList6.add(m61865a(image4));
        }
        availableAssetNames3 = C19299w.m68840l((List) arrayList6);
        String obj = nativeCustomTemplateAd2.getText("clickthrough_url").toString();
        String obj2 = nativeCustomTemplateAd2.getText("clickthrough_text").toString();
        if (text3 == null) {
            throw new IllegalArgumentException("Line item ID cannot be null".toString());
        } else if ((C19296q.m68673a(text3) ^ 1) == 0) {
            throw new IllegalArgumentException("Line item ID cannot be empty".toString());
        } else if (obj == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (obj2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else {
            AdType adType = RecsAdType.BRANDED_PROFILE_CARD;
            if (text == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String obj3 = text.toString();
            if (text2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            str2 = text2.toString();
            if (availableAssetNames == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (availableAssetNames2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (availableAssetNames3 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (image22 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (text4 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else {
                String obj4 = text4.toString();
                if (charSequence == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                String obj5 = charSequence.toString();
                if (charSequence2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                return new C16469h(nativeCustomTemplateAd2, obj, obj2, adType, obj3, str2, availableAssetNames, availableAssetNames2, availableAssetNames3, image22, obj4, obj5, m61866a(charSequence2.toString()), text3.toString());
            }
        }
    }

    /* renamed from: a */
    private final Photo m61865a(C2355b c2355b) {
        Builder builder = Render.builder();
        Drawable a = c2355b.a();
        C2668g.a(a, "image.drawable");
        builder = builder.height(a.getIntrinsicHeight());
        a = c2355b.a();
        C2668g.a(a, "image.drawable");
        c2355b = Photo.builder().id(c2355b.b().toString()).url(c2355b.b().toString()).renders(C15807n.m59826a(builder.width(a.getIntrinsicWidth()).url(c2355b.b().toString()).build())).videos(C17554o.m64195a()).build();
        C2668g.a(c2355b, "Photo.builder()\n        …t())\n            .build()");
        return c2355b;
    }

    /* renamed from: a */
    private final DateTime m61866a(String str) {
        str = this.f51040a.d(str);
        C2668g.a(str, "DATE_FORMATTER.parseDateTime(date)");
        return str;
    }
}
