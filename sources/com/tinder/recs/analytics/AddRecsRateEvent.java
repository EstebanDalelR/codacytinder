package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.boost.p178a.C10400d;
import com.tinder.domain.common.model.CommonConnection;
import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Tag;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.fireboarding.domain.C11816q;
import com.tinder.managers.bk;
import com.tinder.passport.p302c.C10039a;
import com.tinder.spotify.p415a.C15035a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0014\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002J\f\u0010 \u001a\u00020!*\u00020\"H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/tinder/recs/analytics/AddRecsRateEvent;", "Lcom/tinder/recs/analytics/RecsEventTracker;", "Lcom/tinder/recs/analytics/AddRecsRateEvent$AddRecsRateEventRequest;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "managerSharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "spotifyInteractor", "Lcom/tinder/spotify/interactor/SpotifyInteractor;", "boostInteractor", "Lcom/tinder/boost/interactor/BoostInteractor;", "passportInteractor", "Lcom/tinder/passport/interactor/PassportInteractor;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "observeProgressiveOnboarding", "Lcom/tinder/fireboarding/domain/ObserveProgressiveOnboarding;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/managers/ManagerSharedPreferences;Lcom/tinder/spotify/interactor/SpotifyInteractor;Lcom/tinder/boost/interactor/BoostInteractor;Lcom/tinder/passport/interactor/PassportInteractor;Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;Lcom/tinder/fireboarding/domain/ObserveProgressiveOnboarding;)V", "execute", "Lrx/Completable;", "request", "tagToList", "", "", "tag", "Lcom/tinder/domain/recs/model/Tag;", "getCommonConnectionCount", "", "Lcom/tinder/domain/common/model/PerspectableUser;", "degree", "isValidRecType", "", "Lcom/tinder/domain/recs/model/Swipe;", "AddRecsRateEventRequest", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddRecsRateEvent extends RecsEventTracker<AddRecsRateEventRequest> {
    private final C10400d boostInteractor;
    private final FastMatchConfigProvider fastMatchConfigProvider;
    private final C11816q observeProgressiveOnboarding;
    private final C10039a passportInteractor;
    private final C15035a spotifyInteractor;
    private final SubscriptionProvider subscriptionProvider;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tinder/recs/analytics/AddRecsRateEvent$AddRecsRateEventRequest;", "", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "photoViewsCard", "", "photoViewsProfile", "(Lcom/tinder/domain/recs/model/Swipe;II)V", "getPhotoViewsCard", "()I", "getPhotoViewsProfile", "getSwipe", "()Lcom/tinder/domain/recs/model/Swipe;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class AddRecsRateEventRequest {
        private final int photoViewsCard;
        private final int photoViewsProfile;
        @NotNull
        private final Swipe swipe;

        @NotNull
        public static /* synthetic */ AddRecsRateEventRequest copy$default(AddRecsRateEventRequest addRecsRateEventRequest, Swipe swipe, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                swipe = addRecsRateEventRequest.swipe;
            }
            if ((i3 & 2) != 0) {
                i = addRecsRateEventRequest.photoViewsCard;
            }
            if ((i3 & 4) != 0) {
                i2 = addRecsRateEventRequest.photoViewsProfile;
            }
            return addRecsRateEventRequest.copy(swipe, i, i2);
        }

        @NotNull
        public final Swipe component1() {
            return this.swipe;
        }

        public final int component2() {
            return this.photoViewsCard;
        }

        public final int component3() {
            return this.photoViewsProfile;
        }

        @NotNull
        public final AddRecsRateEventRequest copy(@NotNull Swipe swipe, int i, int i2) {
            C2668g.b(swipe, "swipe");
            return new AddRecsRateEventRequest(swipe, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AddRecsRateEventRequest) {
                AddRecsRateEventRequest addRecsRateEventRequest = (AddRecsRateEventRequest) obj;
                if (C2668g.a(this.swipe, addRecsRateEventRequest.swipe)) {
                    if ((this.photoViewsCard == addRecsRateEventRequest.photoViewsCard ? 1 : null) != null) {
                        if ((this.photoViewsProfile == addRecsRateEventRequest.photoViewsProfile ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            Swipe swipe = this.swipe;
            return ((((swipe != null ? swipe.hashCode() : 0) * 31) + this.photoViewsCard) * 31) + this.photoViewsProfile;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AddRecsRateEventRequest(swipe=");
            stringBuilder.append(this.swipe);
            stringBuilder.append(", photoViewsCard=");
            stringBuilder.append(this.photoViewsCard);
            stringBuilder.append(", photoViewsProfile=");
            stringBuilder.append(this.photoViewsProfile);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public AddRecsRateEventRequest(@NotNull Swipe swipe, int i, int i2) {
            C2668g.b(swipe, "swipe");
            this.swipe = swipe;
            this.photoViewsCard = i;
            this.photoViewsProfile = i2;
        }

        public final int getPhotoViewsCard() {
            return this.photoViewsCard;
        }

        public final int getPhotoViewsProfile() {
            return this.photoViewsProfile;
        }

        @NotNull
        public final Swipe getSwipe() {
            return this.swipe;
        }
    }

    @Inject
    public AddRecsRateEvent(@NotNull C2630h c2630h, @NotNull bk bkVar, @NotNull C15035a c15035a, @NotNull C10400d c10400d, @NotNull C10039a c10039a, @NotNull SubscriptionProvider subscriptionProvider, @NotNull FastMatchConfigProvider fastMatchConfigProvider, @NotNull C11816q c11816q) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(bkVar, "managerSharedPreferences");
        C2668g.b(c15035a, "spotifyInteractor");
        C2668g.b(c10400d, "boostInteractor");
        C2668g.b(c10039a, "passportInteractor");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(fastMatchConfigProvider, "fastMatchConfigProvider");
        C2668g.b(c11816q, "observeProgressiveOnboarding");
        super(c2630h, bkVar);
        this.spotifyInteractor = c15035a;
        this.boostInteractor = c10400d;
        this.passportInteractor = c10039a;
        this.subscriptionProvider = subscriptionProvider;
        this.fastMatchConfigProvider = fastMatchConfigProvider;
        this.observeProgressiveOnboarding = c11816q;
    }

    @NotNull
    public Completable execute(@NotNull AddRecsRateEventRequest addRecsRateEventRequest) {
        C2668g.b(addRecsRateEventRequest, "request");
        addRecsRateEventRequest = RxJavaInteropExtKt.toV1Single(this.observeProgressiveOnboarding.execute()).c(new AddRecsRateEvent$execute$1(this, addRecsRateEventRequest));
        C2668g.a(addRecsRateEventRequest, "observeProgressiveOnboar…          }\n            }");
        return addRecsRateEventRequest;
    }

    private final List<String> tagToList(Tag tag) {
        return C17554o.m64199b((Object[]) new String[]{tag.getId(), tag.getName(), tag.getRegion()});
    }

    private final int getCommonConnectionCount(@NotNull PerspectableUser perspectableUser, int i) {
        perspectableUser = perspectableUser.commonConnections();
        C2668g.a(perspectableUser, "commonConnections()");
        Collection arrayList = new ArrayList();
        for (Object next : (Iterable) perspectableUser) {
            if ((((CommonConnection) next).degree() == i ? 1 : null) != null) {
                arrayList.add(next);
            }
        }
        return ((List) arrayList).size();
    }

    private final boolean isValidRecType(@NotNull Swipe swipe) {
        swipe = swipe.getRec().getType();
        if (swipe != RecType.USER) {
            if (swipe != RecType.TOP_PICK) {
                return null;
            }
        }
        return true;
    }
}
