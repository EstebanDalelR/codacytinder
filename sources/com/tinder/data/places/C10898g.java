package com.tinder.data.places;

import com.tinder.api.model.places.response.PlacesRecsResponse;
import com.tinder.data.places.PlacesRecsApiClient.C8736b;
import com.tinder.domain.places.PlaceNotFoundException;
import com.tinder.domain.places.PlacesRepository;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate.Found;
import com.tinder.domain.places.PlacesRepository.PlaceVisitorInfo;
import com.tinder.domain.places.model.Place;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.model.RecSource.Places;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Completable;
import rx.Observable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J \u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0018\u0010\u001b\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00102\u0006\u0010\u0016\u001a\u00020\rH\u0016J,\u0010\u001e\u001a&\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u001f0\u001f \u0015*\u0012\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u001f0\u001f\u0018\u00010\u00100\u0010H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010$\u001a\u00020\u0014H\u0016J\u0014\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0\u0010H\u0002J\u0014\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0\u0010H\u0002J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020,0!H\u0016J\u0010\u0010-\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/tinder/data/places/PlacesDataRepository;", "Lcom/tinder/domain/places/PlacesRepository;", "dataStore", "Lcom/tinder/data/places/PlacesDataStore;", "apiClient", "Lcom/tinder/data/places/PlacesApiClient;", "recsClientFactory", "Lcom/tinder/data/places/PlacesRecsApiClient$Factory;", "recsEngineRegistry", "Lcom/tinder/domain/recs/RecsEngineRegistry;", "(Lcom/tinder/data/places/PlacesDataStore;Lcom/tinder/data/places/PlacesApiClient;Lcom/tinder/data/places/PlacesRecsApiClient$Factory;Lcom/tinder/domain/recs/RecsEngineRegistry;)V", "placeIdRecsRemovalWorkers", "", "", "Lcom/tinder/data/places/PlaceIdRecsRemovalWorker;", "addEngineIfAbsent", "Lrx/Single;", "Lcom/tinder/domain/recs/RecsEngine;", "placeId", "blacklistPlace", "Lrx/Completable;", "kotlin.jvm.PlatformType", "id", "clearPlacesCache", "correctPlace", "newId", "oldId", "deletePlace", "find", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$Found;", "getCount", "", "getVisitorInfo", "Lrx/Observable;", "Lcom/tinder/domain/places/PlacesRepository$PlaceVisitorInfo;", "getVisitorInfoFromRecsClientAndSave", "load", "loadFromCache", "", "Lcom/tinder/domain/places/model/Place;", "loadFromNetworkAndSave", "markPlaceRecsViewed", "markPlaceViewed", "observe", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "removeEngine", "", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.places.g */
public final class C10898g implements PlacesRepository {
    /* renamed from: a */
    private final Map<String, C8742c> f35592a = ((Map) new LinkedHashMap());
    /* renamed from: b */
    private final C8747h f35593b;
    /* renamed from: c */
    private final PlacesApiClient f35594c;
    /* renamed from: d */
    private final C8736b f35595d;
    /* renamed from: e */
    private final RecsEngineRegistry f35596e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/recs/RecsEngine;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.g$a */
    static final class C8745a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10898g f30730a;
        /* renamed from: b */
        final /* synthetic */ String f30731b;

        C8745a(C10898g c10898g, String str) {
            this.f30730a = c10898g;
            this.f30731b = str;
        }

        public /* synthetic */ Object call() {
            return m37256a();
        }

        @NotNull
        /* renamed from: a */
        public final RecsEngine m37256a() {
            RecsEngine addEngineIfAbsent = this.f30730a.f35596e.addEngineIfAbsent(new Places(Long.parseLong(this.f30731b)));
            if (!this.f30730a.f35592a.containsKey(this.f30731b)) {
                this.f30730a.f35592a.put(this.f30731b, new C8742c(addEngineIfAbsent, this.f30730a.f35593b));
                C8742c c8742c = (C8742c) this.f30730a.f35592a.get(this.f30731b);
                if (c8742c != null) {
                    c8742c.m37252b();
                }
            }
            return addEngineIfAbsent;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/places/model/Place;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.g$l */
    static final class C8746l<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10898g f30732a;

        C8746l(C10898g c10898g) {
            this.f30732a = c10898g;
        }

        public /* synthetic */ Object call() {
            return m37257a();
        }

        @NotNull
        /* renamed from: a */
        public final List<Place> m37257a() {
            return this.f30732a.f35593b.m37261a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/domain/places/model/Place;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$Found;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.g$e */
    static final class C13052e<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ String f41607a;

        C13052e(String str) {
            this.f41607a = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50808a((Found) obj);
        }

        /* renamed from: a */
        public final Single<Place> m50808a(Found found) {
            found = found.getItem();
            if (found != null) {
                found = Single.a(found);
                if (found != null) {
                    return found;
                }
            }
            return Single.a((Throwable) new PlaceNotFoundException("deletePlace", this.f41607a));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/domain/places/model/Place;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.g$f */
    static final class C13053f<T, R> implements Func1<Place, Completable> {
        /* renamed from: a */
        final /* synthetic */ C10898g f41608a;
        /* renamed from: b */
        final /* synthetic */ String f41609b;

        C13053f(C10898g c10898g, String str) {
            this.f41608a = c10898g;
            this.f41609b = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50809a((Place) obj);
        }

        /* renamed from: a */
        public final Completable m50809a(Place place) {
            if (place.getExpirationTime().a(DateTime.a()) < null) {
                return Completable.a();
            }
            return this.f41608a.f35594c.m43393a(this.f41609b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.g$h */
    static final class C13054h<T, R> implements Func1<PlaceUpdate, Boolean> {
        /* renamed from: a */
        final /* synthetic */ String f41610a;

        C13054h(String str) {
            this.f41610a = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m50810a((PlaceUpdate) obj));
        }

        /* renamed from: a */
        public final boolean m50810a(PlaceUpdate placeUpdate) {
            placeUpdate = placeUpdate.getItem();
            return (placeUpdate == null || placeUpdate.getId() != Long.parseLong(this.f41610a)) ? null : true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/domain/places/PlacesRepository$PlaceVisitorInfo;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.g$i */
    static final class C13055i<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C10898g f41611a;
        /* renamed from: b */
        final /* synthetic */ String f41612b;

        C13055i(C10898g c10898g, String str) {
            this.f41611a = c10898g;
            this.f41612b = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50811a((PlaceUpdate) obj);
        }

        /* renamed from: a */
        public final Observable<PlaceVisitorInfo> m50811a(PlaceUpdate placeUpdate) {
            placeUpdate = placeUpdate.getItem();
            if (placeUpdate == null) {
                C2668g.a();
            }
            PlaceVisitorInfo placeVisitorInfo = new PlaceVisitorInfo(placeUpdate.getTotalVisitors(), placeUpdate.getNewVisitors());
            if (placeVisitorInfo.hasValidVisitorInfo() != null) {
                return Observable.a(placeVisitorInfo);
            }
            return this.f41611a.m43445a(this.f41612b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/places/PlacesRepository$PlaceVisitorInfo;", "recsResponse", "Lcom/tinder/api/model/places/response/PlacesRecsResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.g$j */
    static final class C13056j<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10898g f41613a;
        /* renamed from: b */
        final /* synthetic */ String f41614b;

        C13056j(C10898g c10898g, String str) {
            this.f41613a = c10898g;
            this.f41614b = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50812a((PlacesRecsResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final PlaceVisitorInfo m50812a(PlacesRecsResponse placesRecsResponse) {
            placesRecsResponse = placesRecsResponse.getRecsMetaData();
            PlaceVisitorInfo placeVisitorInfo = new PlaceVisitorInfo(placesRecsResponse.getTotalVisitorCount(), placesRecsResponse.getNewVisitorCount());
            this.f41613a.f35593b.m37262a(this.f41614b, placeVisitorInfo.getNewVisitors(), placeVisitorInfo.getTotalVisitors());
            return placeVisitorInfo;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/domain/places/model/Place;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.g$k */
    static final class C13057k<T, R> implements Func1<List<? extends Place>, Boolean> {
        /* renamed from: a */
        public static final C13057k f41615a = new C13057k();

        C13057k() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m50813a((List) obj));
        }

        /* renamed from: a */
        public final boolean m50813a(List<Place> list) {
            C2668g.a(list, "it");
            return list.isEmpty() ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/places/model/Place;", "kotlin.jvm.PlatformType", "it", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.g$m */
    static final class C13058m<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10898g f41616a;

        C13058m(C10898g c10898g) {
            this.f41616a = c10898g;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50814a((List) obj);
        }

        /* renamed from: a */
        public final List<Place> m50814a(List<Place> list) {
            C8747h a = this.f41616a.f35593b;
            C2668g.a(list, "it");
            a.m37265a((List) list);
            return list;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.g$b */
    static final class C13868b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10898g f43948a;
        /* renamed from: b */
        final /* synthetic */ String f43949b;

        C13868b(C10898g c10898g, String str) {
            this.f43948a = c10898g;
            this.f43949b = str;
        }

        public final void call() {
            this.f43948a.m43451b(this.f43949b);
            this.f43948a.f35593b.m37267b(this.f43949b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.g$c */
    static final class C13869c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10898g f43950a;

        C13869c(C10898g c10898g) {
            this.f43950a = c10898g;
        }

        public final void call() {
            Set<C8742c> n = C19301m.n(this.f43950a.f35592a.values());
            this.f43950a.f35592a.clear();
            this.f43950a.f35593b.m37265a(C19301m.a());
            for (C8742c c : n) {
                c.m37253c();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/model/Place;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.g$d */
    static final class C13870d<T> implements Action1<Place> {
        /* renamed from: a */
        final /* synthetic */ C10898g f43951a;
        /* renamed from: b */
        final /* synthetic */ String f43952b;

        C13870d(C10898g c10898g, String str) {
            this.f43951a = c10898g;
            this.f43952b = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53407a((Place) obj);
        }

        /* renamed from: a */
        public final void m53407a(Place place) {
            C8747h a = this.f43951a.f35593b;
            String str = this.f43952b;
            C2668g.a(place, "it");
            a.m37263a(str, place);
            this.f43951a.m43451b(this.f43952b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.g$g */
    static final class C13871g implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10898g f43953a;
        /* renamed from: b */
        final /* synthetic */ String f43954b;

        C13871g(C10898g c10898g, String str) {
            this.f43953a = c10898g;
            this.f43954b = str;
        }

        public final void call() {
            this.f43953a.m43451b(this.f43954b);
            this.f43953a.f35593b.m37267b(this.f43954b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.g$n */
    static final class C13872n implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10898g f43955a;
        /* renamed from: b */
        final /* synthetic */ String f43956b;

        C13872n(C10898g c10898g, String str) {
            this.f43955a = c10898g;
            this.f43956b = str;
        }

        public final void call() {
            this.f43955a.f35593b.m37268c(this.f43956b);
        }
    }

    public C10898g(@NotNull C8747h c8747h, @NotNull PlacesApiClient placesApiClient, @NotNull C8736b c8736b, @NotNull RecsEngineRegistry recsEngineRegistry) {
        C2668g.b(c8747h, "dataStore");
        C2668g.b(placesApiClient, "apiClient");
        C2668g.b(c8736b, "recsClientFactory");
        C2668g.b(recsEngineRegistry, "recsEngineRegistry");
        this.f35593b = c8747h;
        this.f35594c = placesApiClient;
        this.f35595d = c8736b;
        this.f35596e = recsEngineRegistry;
    }

    @NotNull
    public Completable load() {
        Completable b = Single.a(m43446a(), m43450b()).a(C19301m.a(), C13057k.f41615a).b();
        C2668g.a(b, "Single.concat(loadFromCa…         .toCompletable()");
        return b;
    }

    @NotNull
    public Observable<PlaceUpdate> observe() {
        Observable<PlaceUpdate> k = this.f35593b.m37266b().k();
        C2668g.a(k, "dataStore.getObservable().onBackpressureBuffer()");
        return k;
    }

    @NotNull
    public Single<Found> find(@NotNull String str) {
        C2668g.b(str, "id");
        str = Single.a(this.f35593b.m37259a(str));
        C2668g.a(str, "Single.just(dataStore.find(id))");
        return str;
    }

    public Completable correctPlace(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "newId");
        C2668g.b(str2, "oldId");
        return this.f35594c.m43395a(str, str2).d(new C13870d(this, str2)).b();
    }

    public Completable deletePlace(@NotNull String str) {
        C2668g.b(str, "id");
        return Single.a(this.f35593b.m37259a(str)).a(new C13052e(str)).c(new C13053f(this, str)).b(new C13871g(this, str));
    }

    public Completable blacklistPlace(@NotNull String str) {
        C2668g.b(str, "id");
        return this.f35594c.m43398b(str).b(new C13868b(this, str));
    }

    @NotNull
    public Completable markPlaceViewed(@NotNull String str) {
        C2668g.b(str, "id");
        Place item = this.f35593b.m37259a(str).getItem();
        if (item == null || item.getViewed()) {
            str = Completable.a();
            C2668g.a(str, "Completable.complete()");
            return str;
        }
        str = this.f35594c.m43400c(str).b(new C13872n(this, str));
        C2668g.a(str, "apiClient.markPlaceViewe…ore.markPlaceViewed(id) }");
        return str;
    }

    @NotNull
    public Completable markPlaceRecsViewed(@NotNull String str) {
        C2668g.b(str, "id");
        return this.f35594c.m43401d(str);
    }

    public Single<Integer> getCount() {
        return Single.a(Integer.valueOf(this.f35593b.m37261a().size()));
    }

    @NotNull
    public Completable clearPlacesCache() {
        Completable a = Completable.a(new C13869c(this));
        C2668g.a(a, "Completable.fromAction {…)\n            }\n        }");
        return a;
    }

    @NotNull
    public Observable<PlaceVisitorInfo> getVisitorInfo(@NotNull String str) {
        C2668g.b(str, "placeId");
        str = observe().f(new C13054h(str)).h(new C13055i(this, str));
        C2668g.a(str, "observe()\n            .f…          }\n            }");
        return str;
    }

    /* renamed from: a */
    private final Observable<PlaceVisitorInfo> m43445a(String str) {
        str = this.f35595d.m37240a(new Places(Long.parseLong(str))).m43422a().h().k(new C13056j(this, str));
        C2668g.a(str, "recsClientFactory.getCli…visitorInfo\n            }");
        return str;
    }

    /* renamed from: a */
    private final Single<List<Place>> m43446a() {
        Single<List<Place>> a = Single.a(new C8746l(this));
        C2668g.a(a, "Single.fromCallable { dataStore.getFromCache() }");
        return a;
    }

    /* renamed from: b */
    private final Single<List<Place>> m43450b() {
        Single<List<Place>> d = this.f35594c.m43394a().d(new C13058m(this));
        C2668g.a(d, "apiClient.load()\n       …turn@map it\n            }");
        return d;
    }

    @NotNull
    public Single<RecsEngine> addEngineIfAbsent(@NotNull String str) {
        C2668g.b(str, "placeId");
        str = Single.a(new C8745a(this, str));
        C2668g.a(str, "Single.fromCallable {\n  …Callable engine\n        }");
        return str;
    }

    /* renamed from: b */
    private final void m43451b(String str) {
        C8742c c8742c = (C8742c) this.f35592a.get(str);
        if (c8742c != null) {
            c8742c.m37253c();
        }
        this.f35592a.remove(str);
        this.f35596e.removeEngine(new Places(Long.parseLong(str)));
    }
}
