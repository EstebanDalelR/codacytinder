package com.tinder.recsads.model;

import com.facebook.ads.NativeAd;
import com.tinder.addy.Ad;
import com.tinder.addy.Ad.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/tinder/recsads/model/RecsFanStaticAd;", "Lcom/tinder/addy/Ad;", "nativeAd", "Lcom/facebook/ads/NativeAd;", "(Lcom/facebook/ads/NativeAd;)V", "getNativeAd", "()Lcom/facebook/ads/NativeAd;", "adType", "Lcom/tinder/addy/Ad$AdType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "id", "", "toString", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.model.d */
public final class C16466d implements Ad {
    @NotNull
    /* renamed from: a */
    private final NativeAd f51079a;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C16466d) {
                if (C2668g.a(this.f51079a, ((C16466d) obj).f51079a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        NativeAd nativeAd = this.f51079a;
        return nativeAd != null ? nativeAd.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecsFanStaticAd(nativeAd=");
        stringBuilder.append(this.f51079a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C16466d(@NotNull NativeAd nativeAd) {
        C2668g.b(nativeAd, "nativeAd");
        this.f51079a = nativeAd;
    }

    @NotNull
    /* renamed from: a */
    public final NativeAd m61878a() {
        return this.f51079a;
    }

    @NotNull
    public String id() {
        String id = this.f51079a.getId();
        C2668g.a(id, "nativeAd.id");
        return id;
    }

    @NotNull
    public AdType adType() {
        return RecsAdType.FAN;
    }
}
