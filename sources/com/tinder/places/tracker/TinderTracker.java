package com.tinder.places.tracker;

import com.foursquare.pilgrim.CurrentPlace;
import com.foursquare.pilgrim.RegionType;
import com.tinder.api.model.places.request.PlacesVisitRequest;
import com.tinder.api.model.places.request.PlacesVisitRequest.Venue;
import com.tinder.api.model.places.request.PlacesVisitRequest.Venue.VenueParent;
import com.tinder.domain.auth.AuthStatus;
import com.tinder.domain.auth.AuthStatusRepository;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.domain.places.logging.PlacesLogger;
import com.tinder.domain.places.provider.PlacesAvailableProvider;
import com.tinder.domain.places.tracker.PlacesLocationTracker;
import com.tinder.places.analytics.C10120j;
import com.tinder.places.p311f.C12346j;
import com.tinder.places.provider.PlacesEnabledProvider;
import com.tinder.places.tracker.PilgrimLocationTracker.PlaceSource;
import com.tinder.places.tracker.PilgrimLocationTracker.VisitListener;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C15679f;
import io.reactivex.C3957b;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.C15746b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/tinder/places/tracker/TinderTracker;", "Lcom/tinder/domain/places/tracker/PlacesLocationTracker;", "Lcom/tinder/places/tracker/PilgrimLocationTracker$VisitListener;", "tracker", "Lcom/tinder/places/tracker/PilgrimLocationTracker;", "placesAvailableProvider", "Lcom/tinder/domain/places/provider/PlacesAvailableProvider;", "submitVisit", "Lcom/tinder/places/usecase/SubmitVisit;", "placesLogger", "Lcom/tinder/domain/places/logging/PlacesLogger;", "placesEnabledProvider", "Lcom/tinder/places/provider/PlacesEnabledProvider;", "authStatusRepository", "Lcom/tinder/domain/auth/AuthStatusRepository;", "addPlacesVisitEvent", "Lcom/tinder/places/analytics/AddPlacesVisitEvent;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/places/tracker/PilgrimLocationTracker;Lcom/tinder/domain/places/provider/PlacesAvailableProvider;Lcom/tinder/places/usecase/SubmitVisit;Lcom/tinder/domain/places/logging/PlacesLogger;Lcom/tinder/places/provider/PlacesEnabledProvider;Lcom/tinder/domain/auth/AuthStatusRepository;Lcom/tinder/places/analytics/AddPlacesVisitEvent;Lio/reactivex/Scheduler;)V", "trackingState", "Lcom/tinder/places/tracker/TinderTracker$TrackingState;", "handleVisit", "", "place", "Lcom/foursquare/pilgrim/CurrentPlace;", "source", "Lcom/tinder/places/tracker/PilgrimLocationTracker$PlaceSource;", "initialize", "TrackingState", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TinderTracker implements PlacesLocationTracker, VisitListener {
    /* renamed from: a */
    private TrackingState f49825a = TrackingState.COLD;
    /* renamed from: b */
    private final PilgrimLocationTracker f49826b;
    /* renamed from: c */
    private final PlacesAvailableProvider f49827c;
    /* renamed from: d */
    private final C12346j f49828d;
    /* renamed from: e */
    private final PlacesLogger f49829e;
    /* renamed from: f */
    private final PlacesEnabledProvider f49830f;
    /* renamed from: g */
    private final AuthStatusRepository f49831g;
    /* renamed from: h */
    private final C10120j f49832h;
    /* renamed from: i */
    private final C15679f f49833i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/places/tracker/TinderTracker$TrackingState;", "", "(Ljava/lang/String;I)V", "COLD", "INITIALIZED", "TRACKING", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    private enum TrackingState {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Triple;", "Lcom/tinder/domain/auth/AuthStatus;", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.tracker.TinderTracker$c */
    static final class C16044c<T> implements Consumer<Triple<? extends AuthStatus, ? extends Boolean, ? extends Boolean>> {
        /* renamed from: a */
        final /* synthetic */ TinderTracker f49823a;

        C16044c(TinderTracker tinderTracker) {
            this.f49823a = tinderTracker;
        }

        public /* synthetic */ void accept(Object obj) {
            m60818a((Triple) obj);
        }

        /* renamed from: a */
        public final void m60818a(Triple<? extends AuthStatus, Boolean, Boolean> triple) {
            AuthStatus authStatus = (AuthStatus) triple.m59810d();
            boolean booleanValue = ((Boolean) triple.m59811e()).booleanValue();
            Boolean bool = (Boolean) triple.m59812f();
            if (booleanValue && authStatus == AuthStatus.LOGGED_IN && this.f49823a.f49825a == TrackingState.COLD) {
                this.f49823a.f49826b.m60815a((VisitListener) this.f49823a);
                this.f49823a.f49825a = TrackingState.INITIALIZED;
            }
            if (this.f49823a.f49825a != TrackingState.COLD && (!booleanValue || authStatus == AuthStatus.LOGGED_OUT)) {
                this.f49823a.f49826b.m60817c();
                this.f49823a.f49825a = TrackingState.COLD;
            }
            if (this.f49823a.f49825a == TrackingState.INITIALIZED) {
                C2668g.a(bool, "placesEnabled");
                if (bool.booleanValue()) {
                    this.f49823a.f49826b.m60814a();
                    this.f49823a.f49825a = TrackingState.TRACKING;
                }
            }
            if (this.f49823a.f49825a == TrackingState.TRACKING && bool.booleanValue() == null) {
                this.f49823a.f49826b.m60816b();
                this.f49823a.f49825a = TrackingState.INITIALIZED;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.tracker.TinderTracker$d */
    static final class C16045d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16045d f49824a = new C16045d();

        C16045d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m60819a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m60819a(Throwable th) {
            C0001a.c(th, "Error observing logout and placesAvailable for PilgrimSDK", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.tracker.TinderTracker$a */
    static final class C18579a implements Action0 {
        /* renamed from: a */
        public static final C18579a f57849a = new C18579a();

        C18579a() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.tracker.TinderTracker$b */
    static final class C18580b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18580b f57850a = new C18580b();

        C18580b() {
        }

        public /* synthetic */ void call(Object obj) {
            m67040a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67040a(Throwable th) {
            C0001a.c(th, "Error posting places visit", new Object[0]);
        }
    }

    @Inject
    public TinderTracker(@NotNull PilgrimLocationTracker pilgrimLocationTracker, @NotNull PlacesAvailableProvider placesAvailableProvider, @NotNull C12346j c12346j, @NotNull PlacesLogger placesLogger, @NotNull PlacesEnabledProvider placesEnabledProvider, @NotNull AuthStatusRepository authStatusRepository, @NotNull C10120j c10120j, @NotNull @IoScheduler C15679f c15679f) {
        C2668g.b(pilgrimLocationTracker, "tracker");
        C2668g.b(placesAvailableProvider, "placesAvailableProvider");
        C2668g.b(c12346j, "submitVisit");
        C2668g.b(placesLogger, "placesLogger");
        C2668g.b(placesEnabledProvider, "placesEnabledProvider");
        C2668g.b(authStatusRepository, "authStatusRepository");
        C2668g.b(c10120j, "addPlacesVisitEvent");
        C2668g.b(c15679f, "ioScheduler");
        this.f49826b = pilgrimLocationTracker;
        this.f49827c = placesAvailableProvider;
        this.f49828d = c12346j;
        this.f49829e = placesLogger;
        this.f49830f = placesEnabledProvider;
        this.f49831g = authStatusRepository;
        this.f49832h = c10120j;
        this.f49833i = c15679f;
    }

    public void initialize() {
        C3957b observePlacesAvailable = this.f49827c.observePlacesAvailable();
        C3957b toFlowable = this.f49830f.observePlacesEnabled().toFlowable(BackpressureStrategy.BUFFER);
        C3957b observeAuthStatus = this.f49831g.observeAuthStatus();
        C2668g.a(toFlowable, "placesEnabledFlowable");
        C15746b.m59000a(observeAuthStatus, observePlacesAvailable, toFlowable).d().b(this.f49833i).a(new C16044c(this), C16045d.f49824a);
    }

    public void handleVisit(@NotNull CurrentPlace currentPlace, @NotNull PlaceSource placeSource) {
        String name;
        Venue venue;
        C10120j c10120j;
        String id;
        long arrival;
        long departure;
        RegionType type;
        Venue venue2;
        List hierarchy;
        Collection arrayList;
        List list;
        CurrentPlace currentPlace2 = currentPlace;
        C2668g.b(currentPlace2, "place");
        PlaceSource placeSource2 = placeSource;
        C2668g.b(placeSource2, "source");
        PlacesVisitRequest a = C14343a.m54647a(currentPlace2);
        PlacesLogger placesLogger = this.f49829e;
        Venue venue3 = a.getVenue();
        if (venue3 != null) {
            name = venue3.getName();
            if (name != null) {
                venue = a.getVenue();
                placesLogger.sendPlaceNotification(name, venue == null ? venue.getProbability() : -1.0d, a.getDepartureTimestamp() <= 0 ? "departure" : "arrival", placeSource.toString());
                c10120j = r0.f49832h;
                name = a.getFoursquareVisitID();
                venue = a.getVenue();
                id = venue == null ? venue.getId() : null;
                arrival = currentPlace2.getArrival();
                departure = currentPlace2.getDeparture();
                type = currentPlace2.getType();
                C2668g.a(type, "place.type");
                venue2 = a.getVenue();
                if (venue2 != null) {
                    hierarchy = venue2.getHierarchy();
                    if (hierarchy != null) {
                        Iterable<VenueParent> iterable = hierarchy;
                        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                        for (VenueParent id2 : iterable) {
                            arrayList.add(id2.getId());
                        }
                        list = (List) arrayList;
                        c10120j.a(name, id, arrival, departure, type, list, placeSource2);
                        r0.f49828d.a(a).b(Schedulers.io()).a(Schedulers.io()).a(C18579a.f57849a, C18580b.f57850a);
                    }
                }
                list = C17554o.m64195a();
                c10120j.a(name, id, arrival, departure, type, list, placeSource2);
                r0.f49828d.a(a).b(Schedulers.io()).a(Schedulers.io()).a(C18579a.f57849a, C18580b.f57850a);
            }
        }
        name = "NULL_VENUE";
        venue = a.getVenue();
        if (venue == null) {
        }
        if (a.getDepartureTimestamp() <= 0) {
        }
        placesLogger.sendPlaceNotification(name, venue == null ? venue.getProbability() : -1.0d, a.getDepartureTimestamp() <= 0 ? "departure" : "arrival", placeSource.toString());
        c10120j = r0.f49832h;
        name = a.getFoursquareVisitID();
        venue = a.getVenue();
        if (venue == null) {
        }
        arrival = currentPlace2.getArrival();
        departure = currentPlace2.getDeparture();
        type = currentPlace2.getType();
        C2668g.a(type, "place.type");
        venue2 = a.getVenue();
        if (venue2 != null) {
            hierarchy = venue2.getHierarchy();
            if (hierarchy != null) {
                Iterable<VenueParent> iterable2 = hierarchy;
                arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
                while (r2.hasNext()) {
                    arrayList.add(id2.getId());
                }
                list = (List) arrayList;
                c10120j.a(name, id, arrival, departure, type, list, placeSource2);
                r0.f49828d.a(a).b(Schedulers.io()).a(Schedulers.io()).a(C18579a.f57849a, C18580b.f57850a);
            }
        }
        list = C17554o.m64195a();
        c10120j.a(name, id, arrival, departure, type, list, placeSource2);
        r0.f49828d.a(a).b(Schedulers.io()).a(Schedulers.io()).a(C18579a.f57849a, C18580b.f57850a);
    }
}
