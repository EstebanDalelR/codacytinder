package com.tinder.ads;

import android.location.Location;
import com.foursquare.internal.util.C1948m;
import com.google.android.gms.ads.doubleclick.C2345a;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.PublisherAdRequestFactory;
import com.tinder.core.p201a.C8589c;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.domain.utils.AgeCalculator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/ads/DfpPublisherAdRequestFactory;", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$PublisherAdRequestFactory;", "locationProvider", "Lcom/tinder/core/provider/TruncatedLocationProvider;", "metaGateway", "Lcom/tinder/domain/meta/gateway/MetaGateway;", "ageCalculator", "Lcom/tinder/domain/utils/AgeCalculator;", "(Lcom/tinder/core/provider/TruncatedLocationProvider;Lcom/tinder/domain/meta/gateway/MetaGateway;Lcom/tinder/domain/utils/AgeCalculator;)V", "create", "Lrx/Single;", "Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;", "observeCurrentUser", "Lcom/tinder/domain/meta/model/CurrentUser;", "observeLocation", "Landroid/location/Location;", "parseAge", "", "currentUser", "parseGenderId", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class DfpPublisherAdRequestFactory implements PublisherAdRequestFactory {
    private final AgeCalculator ageCalculator;
    private final C8589c locationProvider;
    private final MetaGateway metaGateway;

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Value.values().length];

        static {
            $EnumSwitchMapping$0[Value.MALE.ordinal()] = 1;
            $EnumSwitchMapping$0[Value.FEMALE.ordinal()] = 2;
            $EnumSwitchMapping$0[Value.UNKNOWN.ordinal()] = 3;
        }
    }

    @Inject
    public DfpPublisherAdRequestFactory(@NotNull C8589c c8589c, @NotNull MetaGateway metaGateway, @NotNull AgeCalculator ageCalculator) {
        C2668g.b(c8589c, "locationProvider");
        C2668g.b(metaGateway, "metaGateway");
        C2668g.b(ageCalculator, "ageCalculator");
        this.locationProvider = c8589c;
        this.metaGateway = metaGateway;
        this.ageCalculator = ageCalculator;
    }

    @NotNull
    public Single<C2345a> create() {
        Single<C2345a> c = Single.a(observeLocation(), observeCurrentUser(), new DfpPublisherAdRequestFactory$create$1(this)).c(DfpPublisherAdRequestFactory$create$2.INSTANCE);
        C2668g.a(c, "Single.zip(\n            … publisher ad request\") }");
        return c;
    }

    private final Single<Location> observeLocation() {
        Single<Location> a = this.locationProvider.a().q(DfpPublisherAdRequestFactory$observeLocation$1.INSTANCE).a();
        C2668g.a(a, "locationProvider.observe…}\n            .toSingle()");
        return a;
    }

    private final Single<CurrentUser> observeCurrentUser() {
        Single<CurrentUser> a = this.metaGateway.observeCurrentUser().h().a();
        C2668g.a(a, "metaGateway.observeCurre…)\n            .toSingle()");
        return a;
    }

    private final String parseAge(CurrentUser currentUser) {
        currentUser = this.ageCalculator.yearsSinceDate(currentUser.birthDate());
        return currentUser != null ? currentUser : "";
    }

    private final String parseGenderId(CurrentUser currentUser) {
        switch (WhenMappings.$EnumSwitchMapping$0[currentUser.gender().value().ordinal()]) {
            case 1:
                return C1948m.f5228a;
            case 2:
                return "f";
            case 3:
                return "unknown";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
