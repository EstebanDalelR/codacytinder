package com.tinder.places.card.presenter;

import com.tinder.data.places.PlacesApiClient;
import com.tinder.data.places.PlacesApiClient.C8734a;
import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.data.places.p330b.C10893a;
import com.tinder.data.places.p330b.C10895c;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate.Found;
import com.tinder.domain.places.PlacesRepository.PlaceVisitorInfo;
import com.tinder.domain.places.model.Place;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.model.RecsLoadingStatus;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedExpectedError;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedNoConnection;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedUnexpectedError;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedUnknownLocation;
import com.tinder.domain.recs.model.RecsLoadingStatus.Loading;
import com.tinder.domain.recs.model.RecsLoadingStatus.LoadingMore;
import com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecs;
import com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecsDupesOnly;
import com.tinder.domain.recs.model.RecsLoadingStatus.RecsAvailable;
import com.tinder.domain.recs.model.RecsLoadingStatus.RetryingUnknownLocation;
import com.tinder.domain.recs.model.RecsLoadingStatus.Uninitialized;
import com.tinder.places.analytics.AddPlacesRecentPlaceViewEvent;
import com.tinder.places.analytics.AddPlacesRecentPlaceViewEvent.Source;
import com.tinder.places.analytics.AddPlacesRemoveRecentPlaceEvent;
import com.tinder.places.analytics.C10112a;
import com.tinder.places.analytics.C10118h;
import com.tinder.places.card.target.PlacesCardTarget;
import com.tinder.places.p311f.C12338c;
import com.tinder.places.p311f.C12339d;
import com.tinder.places.p311f.C12340e;
import com.tinder.places.provider.C12412a;
import com.tinder.places.provider.SelectedPlaceProvider;
import com.tinder.places.provider.SelectedPlaceProvider.C10269a;
import com.tinder.places.viewmodel.C14349b;
import com.tinder.utils.RxUtils;
import java.util.List;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002MNB_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\u0006\u0010,\u001a\u00020-J\u0010\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020-H\u0002J\u0006\u00102\u001a\u00020-J\u0006\u00103\u001a\u00020-J\u0006\u00104\u001a\u00020-J&\u00105\u001a\b\u0012\u0004\u0012\u000207062\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020<H\u0002J\u0006\u0010=\u001a\u00020-J\u000e\u0010>\u001a\u00020-2\u0006\u0010?\u001a\u00020@J\u0006\u0010A\u001a\u00020-J\u0006\u0010B\u001a\u00020-J\u000e\u0010C\u001a\u00020-2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010D\u001a\u00020-2\u0006\u0010:\u001a\u00020%H\u0002J\u0010\u0010E\u001a\u00020-2\u0006\u0010F\u001a\u00020GH\u0002J\u0010\u0010H\u001a\u00020-2\u0006\u0010:\u001a\u00020%H\u0002J\u0010\u0010I\u001a\u00020-2\u0006\u0010:\u001a\u00020%H\u0002J\u0010\u0010J\u001a\u00020-2\u0006\u0010:\u001a\u00020%H\u0002J\b\u0010K\u001a\u00020-H\u0007J\b\u0010L\u001a\u00020-H\u0007R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R&\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0012\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020'8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006O"}, d2 = {"Lcom/tinder/places/card/presenter/PlacesCardViewPresenter;", "", "getRecsEngine", "Lcom/tinder/places/usecase/GetRecsEngineForPlace;", "getPlaceVisitorInfo", "Lcom/tinder/places/usecase/GetPlaceVisitorInfo;", "blacklistPlace", "Lcom/tinder/data/places/usecase/BlacklistPlace;", "deletePlace", "Lcom/tinder/data/places/usecase/DeletePlace;", "selectedPlaceProvider", "Lcom/tinder/places/provider/SelectedPlaceProvider;", "placeCardFlippedProvider", "Lcom/tinder/places/provider/PlaceCardFlippedProvider;", "addPlacesCorrectRecentPlaceEvent", "Lcom/tinder/places/analytics/AddPlacesCorrectRecentPlaceEvent;", "addPlacesRecentPlaceViewEvent", "Lcom/tinder/places/analytics/AddPlacesRecentPlaceViewEvent;", "getPlace", "Lcom/tinder/places/usecase/GetPlace;", "addPlacesRemoveRecentPlaceEvent", "Lcom/tinder/places/analytics/AddPlacesRemoveRecentPlaceEvent;", "addPlacesViewOptionsEvent", "Lcom/tinder/places/analytics/AddPlacesViewOptionsEvent;", "(Lcom/tinder/places/usecase/GetRecsEngineForPlace;Lcom/tinder/places/usecase/GetPlaceVisitorInfo;Lcom/tinder/data/places/usecase/BlacklistPlace;Lcom/tinder/data/places/usecase/DeletePlace;Lcom/tinder/places/provider/SelectedPlaceProvider;Lcom/tinder/places/provider/PlaceCardFlippedProvider;Lcom/tinder/places/analytics/AddPlacesCorrectRecentPlaceEvent;Lcom/tinder/places/analytics/AddPlacesRecentPlaceViewEvent;Lcom/tinder/places/usecase/GetPlace;Lcom/tinder/places/analytics/AddPlacesRemoveRecentPlaceEvent;Lcom/tinder/places/analytics/AddPlacesViewOptionsEvent;)V", "cardFlipRequested", "Lrx/Subscription;", "place", "Lcom/tinder/places/viewmodel/PlaceCardViewModel;", "place$annotations", "()V", "()Lcom/tinder/places/viewmodel/PlaceCardViewModel;", "setPlace", "(Lcom/tinder/places/viewmodel/PlaceCardViewModel;)V", "recsSubscription", "selectedPlaceSubscription", "subscribedPlaceId", "", "target", "Lcom/tinder/places/card/target/PlacesCardTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/card/target/PlacesCardTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/card/target/PlacesCardTarget;)V", "blockPlace", "", "firePlaceViewEvent", "selection", "Lcom/tinder/places/provider/SelectedPlaceProvider$PlaceSelection;", "flipBackwards", "goToBackClicked", "incorrectPlaceAction", "justThisOnceAction", "mapRecsLoadingStatusToRecsData", "Lrx/Observable;", "Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$RecsData;", "engine", "Lcom/tinder/domain/recs/RecsEngine;", "placeId", "recsLoadingStatus", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "neverShowMeHereAction", "onPlaceCardFlipped", "flippedState", "Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$FlippedState;", "removePlace", "removePlaceAction", "setup", "setupSubscriptions", "showErrorDialogIfNeeded", "throwable", "", "subscribeToCardFlipRequest", "subscribeToRecs", "subscribeToSelectedPlace", "take", "unsubscribeAllSubscriptions", "FlippedState", "RecsData", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesCardViewPresenter {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public PlacesCardTarget f33094a;
    @Nullable
    /* renamed from: b */
    private C14349b f33095b;
    /* renamed from: c */
    private Subscription f33096c;
    /* renamed from: d */
    private Subscription f33097d;
    /* renamed from: e */
    private Subscription f33098e;
    /* renamed from: f */
    private String f33099f = "";
    /* renamed from: g */
    private final C12340e f33100g;
    /* renamed from: h */
    private final C12339d f33101h;
    /* renamed from: i */
    private final C10893a f33102i;
    /* renamed from: j */
    private final C10895c f33103j;
    /* renamed from: k */
    private final SelectedPlaceProvider f33104k;
    /* renamed from: l */
    private final C12412a f33105l;
    /* renamed from: m */
    private final C10112a f33106m;
    /* renamed from: n */
    private final AddPlacesRecentPlaceViewEvent f33107n;
    /* renamed from: o */
    private final C12338c f33108o;
    /* renamed from: p */
    private final AddPlacesRemoveRecentPlaceEvent f33109p;
    /* renamed from: q */
    private final C10118h f33110q;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$FlippedState;", "", "(Ljava/lang/String;I)V", "FRONT", "BACK", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum FlippedState {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$RecsData;", "", "()V", "RecsErrorData", "RecsLoadingData", "RecsTeasersData", "Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$RecsData$RecsTeasersData;", "Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$RecsData$RecsErrorData;", "Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$RecsData$RecsLoadingData;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$a */
    private static abstract class C10126a {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J$\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$RecsData$RecsErrorData;", "Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$RecsData;", "code", "", "engine", "Lcom/tinder/domain/recs/RecsEngine;", "(Ljava/lang/Integer;Lcom/tinder/domain/recs/RecsEngine;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEngine", "()Lcom/tinder/domain/recs/RecsEngine;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/tinder/domain/recs/RecsEngine;)Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$RecsData$RecsErrorData;", "equals", "", "other", "", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$a$a */
        public static final class C12298a extends C10126a {
            @Nullable
            /* renamed from: a */
            private final Integer f39821a;
            @NotNull
            /* renamed from: b */
            private final RecsEngine f39822b;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C12298a) {
                        C12298a c12298a = (C12298a) obj;
                        if (C2668g.a(this.f39821a, c12298a.f39821a) && C2668g.a(this.f39822b, c12298a.f39822b)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Integer num = this.f39821a;
                int i = 0;
                int hashCode = (num != null ? num.hashCode() : 0) * 31;
                RecsEngine recsEngine = this.f39822b;
                if (recsEngine != null) {
                    i = recsEngine.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("RecsErrorData(code=");
                stringBuilder.append(this.f39821a);
                stringBuilder.append(", engine=");
                stringBuilder.append(this.f39822b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @Nullable
            /* renamed from: a */
            public final Integer m48566a() {
                return this.f39821a;
            }

            @NotNull
            /* renamed from: b */
            public final RecsEngine m48567b() {
                return this.f39822b;
            }

            public C12298a(@Nullable Integer num, @NotNull RecsEngine recsEngine) {
                C2668g.b(recsEngine, "engine");
                super();
                this.f39821a = num;
                this.f39822b = recsEngine;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$RecsData$RecsLoadingData;", "Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$RecsData;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$a$b */
        public static final class C12299b extends C10126a {
            public C12299b() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$RecsData$RecsTeasersData;", "Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$RecsData;", "teasers", "", "", "visitorInfo", "Lcom/tinder/domain/places/PlacesRepository$PlaceVisitorInfo;", "(Ljava/util/List;Lcom/tinder/domain/places/PlacesRepository$PlaceVisitorInfo;)V", "getTeasers", "()Ljava/util/List;", "getVisitorInfo", "()Lcom/tinder/domain/places/PlacesRepository$PlaceVisitorInfo;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$a$c */
        public static final class C12300c extends C10126a {
            @NotNull
            /* renamed from: a */
            private final List<String> f39823a;
            @NotNull
            /* renamed from: b */
            private final PlaceVisitorInfo f39824b;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C12300c) {
                        C12300c c12300c = (C12300c) obj;
                        if (C2668g.a(this.f39823a, c12300c.f39823a) && C2668g.a(this.f39824b, c12300c.f39824b)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                List list = this.f39823a;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                PlaceVisitorInfo placeVisitorInfo = this.f39824b;
                if (placeVisitorInfo != null) {
                    i = placeVisitorInfo.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("RecsTeasersData(teasers=");
                stringBuilder.append(this.f39823a);
                stringBuilder.append(", visitorInfo=");
                stringBuilder.append(this.f39824b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @NotNull
            /* renamed from: a */
            public final List<String> m48568a() {
                return this.f39823a;
            }

            @NotNull
            /* renamed from: b */
            public final PlaceVisitorInfo m48569b() {
                return this.f39824b;
            }

            public C12300c(@NotNull List<String> list, @NotNull PlaceVisitorInfo placeVisitorInfo) {
                C2668g.b(list, "teasers");
                C2668g.b(placeVisitorInfo, "visitorInfo");
                super();
                this.f39823a = list;
                this.f39824b = placeVisitorInfo;
            }
        }

        private C10126a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$RecsData$RecsTeasersData;", "kotlin.jvm.PlatformType", "visitorInfo", "Lcom/tinder/domain/places/PlacesRepository$PlaceVisitorInfo;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$h */
    static final class C13564h<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ RecsEngine f43298a;

        C13564h(RecsEngine recsEngine) {
            this.f43298a = recsEngine;
        }

        public /* synthetic */ Object call(Object obj) {
            return m52985a((PlaceVisitorInfo) obj);
        }

        /* renamed from: a */
        public final Observable<C12300c> m52985a(final PlaceVisitorInfo placeVisitorInfo) {
            if (placeVisitorInfo.getTotalVisitors() > 0) {
                return this.f43298a.observeRecsUpdates().k(new C13570l(new PlacesCardViewPresenter$mapRecsLoadingStatusToRecsData$1$1(C10133f.f33122b))).k(new Func1<T, R>() {
                    public /* synthetic */ Object call(Object obj) {
                        return m52984a((List) obj);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C12300c m52984a(List<String> list) {
                        C2668g.a(list, "teasers");
                        PlaceVisitorInfo placeVisitorInfo = placeVisitorInfo;
                        C2668g.a(placeVisitorInfo, "visitorInfo");
                        return new C12300c(list, placeVisitorInfo);
                    }
                });
            }
            List a = C19301m.a();
            C2668g.a(placeVisitorInfo, "visitorInfo");
            return Observable.a(new C12300c(a, placeVisitorInfo));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "requestedPlaceId", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$m */
    static final class C13565m<T, R> implements Func1<String, Boolean> {
        /* renamed from: a */
        final /* synthetic */ String f43299a;

        C13565m(String str) {
            this.f43299a = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m52986a((String) obj));
        }

        /* renamed from: a */
        public final boolean m52986a(String str) {
            return C2668g.a(str, this.f43299a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava8/util/Optional;", "Lcom/tinder/domain/recs/RecsEngine;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$o */
    static final class C13566o<T, R> implements Func1<Optional<RecsEngine>, Boolean> {
        /* renamed from: a */
        public static final C13566o f43300a = new C13566o();

        C13566o() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m52987a((Optional) obj));
        }

        /* renamed from: a */
        public final boolean m52987a(Optional<RecsEngine> optional) {
            C2668g.a(optional, "it");
            return optional.c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/recs/RecsEngine;", "kotlin.jvm.PlatformType", "it", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$p */
    static final class C13567p<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13567p f43301a = new C13567p();

        C13567p() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m52988a((Optional) obj);
        }

        /* renamed from: a */
        public final RecsEngine m52988a(Optional<RecsEngine> optional) {
            return (RecsEngine) optional.b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$RecsData;", "kotlin.jvm.PlatformType", "engine", "Lcom/tinder/domain/recs/RecsEngine;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$q */
    static final class C13569q<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ PlacesCardViewPresenter f43304a;
        /* renamed from: b */
        final /* synthetic */ String f43305b;

        C13569q(PlacesCardViewPresenter placesCardViewPresenter, String str) {
            this.f43304a = placesCardViewPresenter;
            this.f43305b = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return m52990a((RecsEngine) obj);
        }

        /* renamed from: a */
        public final Observable<C10126a> m52990a(final RecsEngine recsEngine) {
            recsEngine.resume();
            return recsEngine.observeLoadingStatusUpdates().d(new Action0() {
                public final void call() {
                    recsEngine.pause();
                }
            }).p(new Func1<T, Observable<? extends R>>() {
                public /* synthetic */ Object call(Object obj) {
                    return m52989a((RecsLoadingStatus) obj);
                }

                @NotNull
                /* renamed from: a */
                public final Observable<C10126a> m52989a(RecsLoadingStatus recsLoadingStatus) {
                    PlacesCardViewPresenter placesCardViewPresenter = this.f43304a;
                    RecsEngine recsEngine = recsEngine;
                    C2668g.a(recsEngine, "engine");
                    C2668g.a(recsLoadingStatus, "it");
                    return placesCardViewPresenter.m41370a(recsEngine, this.f43305b, recsLoadingStatus);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lrx/Subscription;", "kotlin.jvm.PlatformType", "call", "com/tinder/places/card/presenter/PlacesCardViewPresenter$blockPlace$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$b */
    static final class C14155b<T> implements Action1<Subscription> {
        /* renamed from: a */
        final /* synthetic */ PlacesCardViewPresenter f44908a;

        C14155b(PlacesCardViewPresenter placesCardViewPresenter) {
            this.f44908a = placesCardViewPresenter;
        }

        public /* synthetic */ void call(Object obj) {
            m53845a((Subscription) obj);
        }

        /* renamed from: a */
        public final void m53845a(Subscription subscription) {
            this.f44908a.m41384a().startRemoveLoadingState();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "call", "com/tinder/places/card/presenter/PlacesCardViewPresenter$blockPlace$1$2"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$c */
    static final class C14156c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ PlacesCardViewPresenter f44909a;

        C14156c(PlacesCardViewPresenter placesCardViewPresenter) {
            this.f44909a = placesCardViewPresenter;
        }

        public final void call() {
            this.f44909a.m41384a().stopRemoveLoadingState();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "com/tinder/places/card/presenter/PlacesCardViewPresenter$blockPlace$1$4"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$d */
    static final class C14157d<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C14349b f44910a;
        /* renamed from: b */
        final /* synthetic */ PlacesCardViewPresenter f44911b;

        C14157d(C14349b c14349b, PlacesCardViewPresenter placesCardViewPresenter) {
            this.f44910a = c14349b;
            this.f44911b = placesCardViewPresenter;
        }

        public /* synthetic */ void call(Object obj) {
            m53846a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53846a(Throwable th) {
            PlacesApiException placesApiException = (PlacesApiException) (!(th instanceof PlacesApiException) ? null : th);
            if (placesApiException != null) {
                Integer a = placesApiException.m37235a();
                if (a != null) {
                    this.f44911b.f33109p.m41322b(this.f44910a.a(), a.intValue());
                }
            }
            PlacesCardViewPresenter placesCardViewPresenter = this.f44911b;
            C2668g.a(th, "it");
            placesCardViewPresenter.m41376a(th);
            C0001a.c(th, "Error blocking place", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$e */
    static final class C14158e implements Action0 {
        /* renamed from: a */
        public static final C14158e f44912a = new C14158e();

        C14158e() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "placeUpdate", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$Found;", "kotlin.jvm.PlatformType", "call", "com/tinder/places/card/presenter/PlacesCardViewPresenter$firePlaceViewEvent$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$f */
    static final class C14159f<T> implements Action1<Found> {
        /* renamed from: a */
        final /* synthetic */ String f44913a;
        /* renamed from: b */
        final /* synthetic */ Source f44914b;
        /* renamed from: c */
        final /* synthetic */ PlacesCardViewPresenter f44915c;
        /* renamed from: d */
        final /* synthetic */ C10269a f44916d;

        C14159f(String str, Source source, PlacesCardViewPresenter placesCardViewPresenter, C10269a c10269a) {
            this.f44913a = str;
            this.f44914b = source;
            this.f44915c = placesCardViewPresenter;
            this.f44916d = c10269a;
        }

        public /* synthetic */ void call(Object obj) {
            m53847a((Found) obj);
        }

        /* renamed from: a */
        public final void m53847a(Found found) {
            Place item = found.getItem();
            if (item != null) {
                this.f44915c.f33107n.m41313a(this.f44913a, this.f44914b, found.getIndex(), item.getViewed(), item.getExpirationTime().getMillis() / ((long) 1000), item.getNewVisitors(), item.getTotalVisitors());
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$g */
    static final class C14160g<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14160g f44917a = new C14160g();

        C14160g() {
        }

        public /* synthetic */ void call(Object obj) {
            m53848a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53848a(Throwable th) {
            C0001a.c(th, "getPlace failed", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lrx/Subscription;", "kotlin.jvm.PlatformType", "call", "com/tinder/places/card/presenter/PlacesCardViewPresenter$removePlace$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$i */
    static final class C14161i<T> implements Action1<Subscription> {
        /* renamed from: a */
        final /* synthetic */ PlacesCardViewPresenter f44918a;

        C14161i(PlacesCardViewPresenter placesCardViewPresenter) {
            this.f44918a = placesCardViewPresenter;
        }

        public /* synthetic */ void call(Object obj) {
            m53849a((Subscription) obj);
        }

        /* renamed from: a */
        public final void m53849a(Subscription subscription) {
            this.f44918a.m41384a().startRemoveLoadingState();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "call", "com/tinder/places/card/presenter/PlacesCardViewPresenter$removePlace$1$2"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$j */
    static final class C14162j implements Action0 {
        /* renamed from: a */
        final /* synthetic */ PlacesCardViewPresenter f44919a;

        C14162j(PlacesCardViewPresenter placesCardViewPresenter) {
            this.f44919a = placesCardViewPresenter;
        }

        public final void call() {
            this.f44919a.m41384a().stopRemoveLoadingState();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "com/tinder/places/card/presenter/PlacesCardViewPresenter$removePlace$1$4"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$k */
    static final class C14163k<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C14349b f44921a;
        /* renamed from: b */
        final /* synthetic */ PlacesCardViewPresenter f44922b;

        C14163k(C14349b c14349b, PlacesCardViewPresenter placesCardViewPresenter) {
            this.f44921a = c14349b;
            this.f44922b = placesCardViewPresenter;
        }

        public /* synthetic */ void call(Object obj) {
            m53851a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53851a(Throwable th) {
            PlacesApiException placesApiException = (PlacesApiException) (!(th instanceof PlacesApiException) ? null : th);
            if (placesApiException != null) {
                Integer a = placesApiException.m37235a();
                if (a != null) {
                    this.f44922b.f33109p.m41318a(this.f44921a.a(), a.intValue());
                }
            }
            PlacesCardViewPresenter placesCardViewPresenter = this.f44922b;
            C2668g.a(th, "it");
            placesCardViewPresenter.m41376a(th);
            C0001a.c(th, "Failed to remove location", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$l */
    static final class C14164l implements Action0 {
        /* renamed from: a */
        public static final C14164l f44923a = new C14164l();

        C14164l() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$n */
    static final class C14165n<T> implements Action1<String> {
        /* renamed from: a */
        final /* synthetic */ PlacesCardViewPresenter f44924a;

        C14165n(PlacesCardViewPresenter placesCardViewPresenter) {
            this.f44924a = placesCardViewPresenter;
        }

        public /* synthetic */ void call(Object obj) {
            m53852a((String) obj);
        }

        /* renamed from: a */
        public final void m53852a(String str) {
            this.f44924a.m41383l();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$RecsData;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$r */
    static final class C14167r<T> implements Action1<C10126a> {
        /* renamed from: a */
        final /* synthetic */ PlacesCardViewPresenter f44927a;

        C14167r(PlacesCardViewPresenter placesCardViewPresenter) {
            this.f44927a = placesCardViewPresenter;
        }

        public /* synthetic */ void call(Object obj) {
            m53854a((C10126a) obj);
        }

        /* renamed from: a */
        public final void m53854a(C10126a c10126a) {
            if (c10126a instanceof C12299b) {
                this.f44927a.m41384a().setRecsLoadingState();
            } else if (c10126a instanceof C12298a) {
                C12298a c12298a = (C12298a) c10126a;
                this.f44927a.m41384a().setRecsErrorState(c12298a.m48566a());
                RecsEngine.reset$default(c12298a.m48567b(), null, 1, null);
                c10126a = this.f44927a.f33096c;
                if (c10126a != null) {
                    c10126a.unsubscribe();
                }
            } else if (c10126a instanceof C12300c) {
                C12300c c12300c = (C12300c) c10126a;
                if (c12300c.m48568a().isEmpty()) {
                    this.f44927a.m41384a().setNoRecsExistState();
                } else {
                    this.f44927a.m41384a().bindTeasers(c12300c.m48568a());
                }
                c10126a = c12300c.m48569b();
                if (c10126a.hasValidVisitorInfo()) {
                    this.f44927a.m41384a().setVisitorInfo(c10126a.getTotalVisitors(), c10126a.getNewVisitors());
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$s */
    static final class C14168s<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ PlacesCardViewPresenter f44928a;
        /* renamed from: b */
        final /* synthetic */ String f44929b;

        C14168s(PlacesCardViewPresenter placesCardViewPresenter, String str) {
            this.f44928a = placesCardViewPresenter;
            this.f44929b = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53855a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53855a(Throwable th) {
            C8734a c8734a = PlacesApiClient.f35549a;
            C2668g.a(th, "it");
            Integer a = c8734a.m37238a(th);
            this.f44928a.m41384a().setRecsErrorState(a);
            if (a != null) {
                this.f44928a.f33107n.m41312a(this.f44929b, a.intValue());
            }
            C0001a.c(th, "Failed to subscribe to recs update", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "selection", "Lcom/tinder/places/provider/SelectedPlaceProvider$PlaceSelection;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$t */
    static final class C14169t<T> implements Action1<C10269a> {
        /* renamed from: a */
        final /* synthetic */ PlacesCardViewPresenter f44930a;
        /* renamed from: b */
        final /* synthetic */ String f44931b;

        C14169t(PlacesCardViewPresenter placesCardViewPresenter, String str) {
            this.f44930a = placesCardViewPresenter;
            this.f44931b = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53856a((C10269a) obj);
        }

        /* renamed from: a */
        public final void m53856a(C10269a c10269a) {
            if (C2668g.a(c10269a.m41656b(), this.f44931b)) {
                this.f44930a.m41384a().enableCardInteraction();
                PlacesCardViewPresenter placesCardViewPresenter = this.f44930a;
                C2668g.a(c10269a, "selection");
                placesCardViewPresenter.m41374a(c10269a);
                return;
            }
            this.f44930a.m41384a().disableCardInteraction();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.PlacesCardViewPresenter$u */
    static final class C14170u<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14170u f44932a = new C14170u();

        C14170u() {
        }

        public /* synthetic */ void call(Object obj) {
            m53857a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53857a(Throwable th) {
            C0001a.c(th, "subscribeToSelectedPlace failed", new Object[0]);
        }
    }

    @Inject
    public PlacesCardViewPresenter(@NotNull C12340e c12340e, @NotNull C12339d c12339d, @NotNull C10893a c10893a, @NotNull C10895c c10895c, @NotNull SelectedPlaceProvider selectedPlaceProvider, @NotNull C12412a c12412a, @NotNull C10112a c10112a, @NotNull AddPlacesRecentPlaceViewEvent addPlacesRecentPlaceViewEvent, @NotNull C12338c c12338c, @NotNull AddPlacesRemoveRecentPlaceEvent addPlacesRemoveRecentPlaceEvent, @NotNull C10118h c10118h) {
        C2668g.b(c12340e, "getRecsEngine");
        C2668g.b(c12339d, "getPlaceVisitorInfo");
        C2668g.b(c10893a, "blacklistPlace");
        C2668g.b(c10895c, "deletePlace");
        C2668g.b(selectedPlaceProvider, "selectedPlaceProvider");
        C2668g.b(c12412a, "placeCardFlippedProvider");
        C2668g.b(c10112a, "addPlacesCorrectRecentPlaceEvent");
        C2668g.b(addPlacesRecentPlaceViewEvent, "addPlacesRecentPlaceViewEvent");
        C2668g.b(c12338c, "getPlace");
        C2668g.b(addPlacesRemoveRecentPlaceEvent, "addPlacesRemoveRecentPlaceEvent");
        C2668g.b(c10118h, "addPlacesViewOptionsEvent");
        this.f33100g = c12340e;
        this.f33101h = c12339d;
        this.f33102i = c10893a;
        this.f33103j = c10895c;
        this.f33104k = selectedPlaceProvider;
        this.f33105l = c12412a;
        this.f33106m = c10112a;
        this.f33107n = addPlacesRecentPlaceViewEvent;
        this.f33108o = c12338c;
        this.f33109p = addPlacesRemoveRecentPlaceEvent;
        this.f33110q = c10118h;
    }

    @NotNull
    /* renamed from: a */
    public final PlacesCardTarget m41384a() {
        PlacesCardTarget placesCardTarget = this.f33094a;
        if (placesCardTarget == null) {
            C2668g.b("target");
        }
        return placesCardTarget;
    }

    @Nullable
    /* renamed from: b */
    public final C14349b m41387b() {
        return this.f33095b;
    }

    @Take
    /* renamed from: c */
    public final void m41388c() {
        C14349b c14349b = this.f33095b;
        if (c14349b != null) {
            String a = c14349b.a();
            if (a != null) {
                m41375a(a);
            }
        }
    }

    @Drop
    /* renamed from: d */
    public final void m41389d() {
        Subscription subscription = this.f33096c;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        subscription = this.f33097d;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        subscription = this.f33098e;
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }

    /* renamed from: a */
    public final void m41386a(@NotNull C14349b c14349b) {
        C2668g.b(c14349b, "place");
        this.f33095b = c14349b;
        m41375a(c14349b.a());
    }

    /* renamed from: a */
    private final void m41375a(String str) {
        m41382d(str);
        m41378b(str);
        m41380c(str);
        this.f33099f = str;
    }

    /* renamed from: e */
    public final void m41390e() {
        PlacesCardTarget placesCardTarget = this.f33094a;
        if (placesCardTarget == null) {
            C2668g.b("target");
        }
        placesCardTarget.animateFromBackToAlternatives();
        C14349b c14349b = this.f33095b;
        if (c14349b != null) {
            this.f33106m.m41338a(c14349b.a(), c14349b.e().size());
        }
    }

    /* renamed from: f */
    public final void m41391f() {
        PlacesCardTarget placesCardTarget = this.f33094a;
        if (placesCardTarget == null) {
            C2668g.b("target");
        }
        placesCardTarget.animateFromBackToRemoveMeFromHere();
        C14349b c14349b = this.f33095b;
        if (c14349b != null) {
            this.f33109p.m41317a(c14349b.a());
        }
    }

    /* renamed from: g */
    public final void m41392g() {
        PlacesCardTarget placesCardTarget = this.f33094a;
        if (placesCardTarget == null) {
            C2668g.b("target");
        }
        placesCardTarget.showRemoveDialog(false, new PlacesCardViewPresenter$justThisOnceAction$1(this));
        C14349b c14349b = this.f33095b;
        if (c14349b != null) {
            this.f33109p.m41321b(c14349b.a());
        }
    }

    /* renamed from: h */
    public final void m41393h() {
        PlacesCardTarget placesCardTarget = this.f33094a;
        if (placesCardTarget == null) {
            C2668g.b("target");
        }
        placesCardTarget.showRemoveDialog(true, new PlacesCardViewPresenter$neverShowMeHereAction$1(this));
        C14349b c14349b = this.f33095b;
        if (c14349b != null) {
            this.f33109p.m41324c(c14349b.a());
        }
    }

    /* renamed from: i */
    public final void m41394i() {
        C14349b c14349b = this.f33095b;
        if (c14349b != null) {
            this.f33102i.m43441a(c14349b.a()).a(RxUtils.a().b()).d(new C14155b(this)).d(new C14156c(this)).a(C14158e.f44912a, new C14157d(c14349b, this));
        }
    }

    /* renamed from: j */
    public final void m41395j() {
        C14349b c14349b = this.f33095b;
        if (c14349b != null) {
            this.f33103j.m43442a(c14349b.a()).a(RxUtils.a().b()).d(new C14161i(this)).d(new C14162j(this)).a(C14164l.f44923a, new C14163k(c14349b, this));
        }
    }

    /* renamed from: k */
    public final void m41396k() {
        PlacesCardTarget placesCardTarget = this.f33094a;
        if (placesCardTarget == null) {
            C2668g.b("target");
        }
        placesCardTarget.showBack();
        C14349b c14349b = this.f33095b;
        if (c14349b != null) {
            this.f33110q.m41356a(c14349b.a());
        }
    }

    /* renamed from: a */
    public final void m41385a(@NotNull FlippedState flippedState) {
        C2668g.b(flippedState, "flippedState");
        C14349b c14349b = this.f33095b;
        if (c14349b != null) {
            this.f33105l.m48846a(c14349b.a(), flippedState);
        }
    }

    /* renamed from: b */
    private final void m41378b(String str) {
        Subscription subscription;
        if (C2668g.a(this.f33099f, str)) {
            subscription = this.f33097d;
            if (!(subscription == null || subscription.isUnsubscribed())) {
                return;
            }
        }
        subscription = this.f33097d;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        this.f33097d = this.f33104k.observe().a(C19397a.a()).a(new C14169t(this, str), (Action1) C14170u.f44932a);
    }

    /* renamed from: c */
    private final void m41380c(String str) {
        Subscription subscription;
        if (C2668g.a(this.f33099f, str)) {
            subscription = this.f33098e;
            if (!(subscription == null || subscription.isUnsubscribed())) {
                return;
            }
        }
        subscription = this.f33098e;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        str = this.f33105l.m48845a().a(C19397a.a()).f(new C13565m(str));
        Action1 c14165n = new C14165n(this);
        Function1 function1 = PlacesCardViewPresenter$subscribeToCardFlipRequest$3.f45327a;
        if (function1 != null) {
            function1 = new C14180k(function1);
        }
        this.f33098e = str.a(c14165n, (Action1) function1);
    }

    /* renamed from: a */
    private final void m41374a(C10269a c10269a) {
        Source source;
        switch (C10136j.f33124a[c10269a.m41655a().ordinal()]) {
            case 1:
                source = Source.CAROUSEL;
                break;
            case 2:
                source = Source.MAP;
                break;
            default:
                source = null;
                break;
        }
        if (source != null) {
            String b = c10269a.m41656b();
            this.f33108o.m48721a(b).a(new C14159f(b, source, this, c10269a), (Action1) C14160g.f44917a);
        }
    }

    /* renamed from: d */
    private final void m41382d(String str) {
        Subscription subscription;
        if (C2668g.a(this.f33099f, str)) {
            subscription = this.f33096c;
            if (!(subscription == null || subscription.isUnsubscribed())) {
                return;
            }
        }
        subscription = this.f33096c;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        this.f33096c = this.f33100g.m48723a(str).f(C13566o.f43300a).k(C13567p.f43301a).p(new C13569q(this, str)).a(C19397a.a()).a(new C14167r(this), new C14168s(this, str));
    }

    /* renamed from: a */
    private final Observable<C10126a> m41370a(RecsEngine recsEngine, String str, RecsLoadingStatus recsLoadingStatus) {
        str = this.f33101h.m48722a(str);
        if (!(recsLoadingStatus instanceof Loading)) {
            if (!(recsLoadingStatus instanceof LoadingMore)) {
                if (recsLoadingStatus instanceof FetchFailedExpectedError) {
                    recsEngine = Observable.a(new C12298a(Integer.valueOf(((FetchFailedExpectedError) recsLoadingStatus).getContextualInfo().getCode()), recsEngine));
                    C2668g.a(recsEngine, "Observable.just(\n       …engine)\n                )");
                    return recsEngine;
                }
                if (!(recsLoadingStatus instanceof FetchFailedUnexpectedError)) {
                    if (!(recsLoadingStatus instanceof Uninitialized)) {
                        if (!(recsLoadingStatus instanceof FetchFailedUnknownLocation)) {
                            if (!(recsLoadingStatus instanceof RetryingUnknownLocation)) {
                                if (!(recsLoadingStatus instanceof FetchFailedNoConnection)) {
                                    if (!(recsLoadingStatus instanceof NoMoreRecs)) {
                                        if (!(recsLoadingStatus instanceof NoMoreRecsDupesOnly)) {
                                            if ((recsLoadingStatus instanceof RecsAvailable) == null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        }
                                    }
                                    recsEngine = str.p((Func1) new C13564h(recsEngine));
                                    C2668g.a(recsEngine, "visitorObservable.switch…      }\n                }");
                                    return recsEngine;
                                }
                            }
                        }
                    }
                }
                recsEngine = Observable.a(new C12298a(null, recsEngine));
                C2668g.a(recsEngine, "Observable.just(RecsData…= null, engine = engine))");
                return recsEngine;
            }
        }
        recsEngine = Observable.a(new C12299b());
        C2668g.a(recsEngine, "Observable.just(RecsData.RecsLoadingData())");
        return recsEngine;
    }

    /* renamed from: a */
    private final void m41376a(Throwable th) {
        if (th instanceof PlacesApiException) {
            PlacesCardTarget placesCardTarget = this.f33094a;
            if (placesCardTarget == null) {
                C2668g.b("target");
            }
            placesCardTarget.showErrorDialog((PlacesApiException) th);
        }
    }

    /* renamed from: l */
    private final void m41383l() {
        PlacesCardTarget placesCardTarget = this.f33094a;
        if (placesCardTarget == null) {
            C2668g.b("target");
        }
        placesCardTarget.flipBackwards();
    }
}
