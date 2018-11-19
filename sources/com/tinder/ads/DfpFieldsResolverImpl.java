package com.tinder.ads;

import android.location.Location;
import com.foursquare.internal.util.C1948m;
import com.tinder.core.p201a.C8589c;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.domain.utils.AgeCalculator;
import com.tinder.recs.card.CardSize;
import com.tinder.recs.card.CardSizeProvider;
import com.tinder.recsads.DfpFieldsResolver;
import com.tinder.recsads.model.C14754b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\fH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/ads/DfpFieldsResolverImpl;", "Lcom/tinder/recsads/DfpFieldsResolver;", "locationProvider", "Lcom/tinder/core/provider/TruncatedLocationProvider;", "cardSizeProvider", "Lcom/tinder/recs/card/CardSizeProvider;", "metaGateway", "Lcom/tinder/domain/meta/gateway/MetaGateway;", "ageCalculator", "Lcom/tinder/domain/utils/AgeCalculator;", "(Lcom/tinder/core/provider/TruncatedLocationProvider;Lcom/tinder/recs/card/CardSizeProvider;Lcom/tinder/domain/meta/gateway/MetaGateway;Lcom/tinder/domain/utils/AgeCalculator;)V", "observeCardSize", "Lrx/Observable;", "Lcom/tinder/recs/card/CardSize;", "observeCurrentUser", "Lcom/tinder/domain/meta/model/CurrentUser;", "observeLocation", "Landroid/location/Location;", "parseAge", "", "currentUser", "parseGenderId", "resolveDfpFields", "Lcom/tinder/recsads/model/DfpAdFields;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class DfpFieldsResolverImpl implements DfpFieldsResolver {
    private final AgeCalculator ageCalculator;
    private final CardSizeProvider cardSizeProvider;
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
    public DfpFieldsResolverImpl(@NotNull C8589c c8589c, @NotNull CardSizeProvider cardSizeProvider, @NotNull MetaGateway metaGateway, @NotNull AgeCalculator ageCalculator) {
        C2668g.b(c8589c, "locationProvider");
        C2668g.b(cardSizeProvider, "cardSizeProvider");
        C2668g.b(metaGateway, "metaGateway");
        C2668g.b(ageCalculator, "ageCalculator");
        this.locationProvider = c8589c;
        this.cardSizeProvider = cardSizeProvider;
        this.metaGateway = metaGateway;
        this.ageCalculator = ageCalculator;
    }

    @NotNull
    public Observable<C14754b> resolveDfpFields() {
        Observable<C14754b> b = Observable.b(observeLocation(), observeCardSize(), observeCurrentUser(), new DfpFieldsResolverImpl$resolveDfpFields$1(this));
        C2668g.a(b, "Observable.zip(\n        …)\n            )\n        }");
        return b;
    }

    private final Observable<Location> observeLocation() {
        Observable<Location> q = this.locationProvider.a().q(DfpFieldsResolverImpl$observeLocation$1.INSTANCE);
        C2668g.a(q, "locationProvider.observe…ion -> location != null }");
        return q;
    }

    private final Observable<CardSize> observeCardSize() {
        Observable<CardSize> q = this.cardSizeProvider.observe().q(DfpFieldsResolverImpl$observeCardSize$1.INSTANCE);
        C2668g.a(q, "cardSizeProvider.observe…ize -> cardSize != null }");
        return q;
    }

    private final Observable<CurrentUser> observeCurrentUser() {
        Observable<CurrentUser> observeCurrentUser = this.metaGateway.observeCurrentUser();
        C2668g.a(observeCurrentUser, "metaGateway.observeCurrentUser()");
        return observeCurrentUser;
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
