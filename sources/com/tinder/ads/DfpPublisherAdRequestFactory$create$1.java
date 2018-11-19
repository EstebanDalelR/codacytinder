package com.tinder.ads;

import android.location.Location;
import com.google.android.gms.ads.doubleclick.C2345a;
import com.google.android.gms.ads.doubleclick.C2345a.C2344a;
import com.tinder.ads.source.dfp.DfpCustomTargetingValuesKt;
import com.tinder.domain.meta.model.CurrentUser;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Func2;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;", "kotlin.jvm.PlatformType", "location", "Landroid/location/Location;", "currentUser", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
final class DfpPublisherAdRequestFactory$create$1<T1, T2, R> implements Func2<T1, T2, R> {
    final /* synthetic */ DfpPublisherAdRequestFactory this$0;

    DfpPublisherAdRequestFactory$create$1(DfpPublisherAdRequestFactory dfpPublisherAdRequestFactory) {
        this.this$0 = dfpPublisherAdRequestFactory;
    }

    public final C2345a call(Location location, CurrentUser currentUser) {
        DfpPublisherAdRequestFactory dfpPublisherAdRequestFactory = this.this$0;
        C2668g.a(currentUser, "currentUser");
        String access$parseAge = dfpPublisherAdRequestFactory.parseAge(currentUser);
        return new C2344a().a(location).a(DfpCustomTargetingValuesKt.ADS_TARGETING_AGE, access$parseAge).a("gender", this.this$0.parseGenderId(currentUser)).a();
    }
}
