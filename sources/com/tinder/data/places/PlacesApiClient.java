package com.tinder.data.places;

import com.tinder.api.TinderApi;
import com.tinder.api.model.places.request.PlacesVisitRequest;
import com.tinder.api.model.places.request.PlacesVisitRequest.Venue;
import com.tinder.api.model.places.response.CorrectLocationResponse;
import com.tinder.api.model.places.response.PlacesResponse;
import com.tinder.api.moshi.ResponseErrorAdapter;
import com.tinder.api.response.v2.DataResponse;
import com.tinder.data.places.C8744e.C13050d;
import com.tinder.data.places.C8744e.C13865a;
import com.tinder.data.places.C8744e.C13866b;
import com.tinder.data.places.C8744e.C13867c;
import com.tinder.data.places.p329a.C10888a;
import com.tinder.data.places.p330b.C10897e;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.places.model.Place;
import com.tinder.domain.places.model.PlacesConfig;
import com.tinder.util.ConnectivityProvider;
import com.tinder.util.ConnectivityProvider.NoInternetConnectionException;
import io.reactivex.C3957b;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.C18430a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import retrofit2.Response;
import rx.Completable;
import rx.Single;
import rx.Single$Transformer;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0004-./0B7\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0013J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"J\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0$0\u001bJ\u000e\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0018J\u000e\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0018J\u0010\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010)H\u0016J\u000e\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/tinder/data/places/PlacesApiClient;", "Lcom/tinder/data/places/ObservableApiEventClient;", "tinderApi", "Lcom/tinder/api/TinderApi;", "apiAdapter", "Lcom/tinder/data/places/adapter/PlaceDomainApiAdapter;", "connectivityProvider", "Lcom/tinder/util/ConnectivityProvider;", "placesConfigProvider", "Lcom/tinder/domain/places/PlacesConfigProvider;", "setPlacesEnabledInProfileDataStore", "Lcom/tinder/data/places/usecase/SetPlacesEnabledInProfileDataStore;", "responseErrorAdapter", "Lcom/tinder/api/moshi/ResponseErrorAdapter;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/data/places/adapter/PlaceDomainApiAdapter;Lcom/tinder/util/ConnectivityProvider;Lcom/tinder/domain/places/PlacesConfigProvider;Lcom/tinder/data/places/usecase/SetPlacesEnabledInProfileDataStore;Lcom/tinder/api/moshi/ResponseErrorAdapter;)V", "apiEventsProcessor", "Lio/reactivex/processors/FlowableProcessor;", "Lcom/tinder/data/places/PerformanceApiEvent;", "addApiEvent", "", "event", "blacklist", "Lrx/Completable;", "id", "", "checkInternetConnection", "correctPlace", "Lrx/Single;", "Lcom/tinder/domain/places/model/Place;", "newId", "oldId", "delete", "disablePlacesOnDisabledError", "error", "", "load", "", "markPlaceRecsViewed", "placeId", "markPlaceViewed", "observeApiEvents", "Lio/reactivex/Flowable;", "submitPlacesVisit", "request", "Lcom/tinder/api/model/places/request/PlacesVisitRequest;", "Companion", "NoPlacesDataException", "PlacesApiException", "ResponseErrorTransformer", "data_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesApiClient implements ObservableApiEventClient {
    /* renamed from: a */
    public static final C8734a f35549a = new C8734a();
    /* renamed from: b */
    private final C18430a<C8741b> f35550b;
    /* renamed from: c */
    private final TinderApi f35551c;
    /* renamed from: d */
    private final C10888a f35552d;
    /* renamed from: e */
    private final ConnectivityProvider f35553e;
    /* renamed from: f */
    private final PlacesConfigProvider f35554f;
    /* renamed from: g */
    private final C10897e f35555g;
    /* renamed from: h */
    private final ResponseErrorAdapter f35556h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tinder/data/places/PlacesApiClient$NoPlacesDataException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "data_release"}, k = 1, mv = {1, 1, 10})
    public static final class NoPlacesDataException extends RuntimeException {
        public NoPlacesDataException() {
            super("response.data is null.");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000bJ\r\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\b\u0002\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "code", "", "response", "Lretrofit2/Response;", "placeId", "", "(Ljava/lang/Integer;Lretrofit2/Response;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPlaceId", "()Ljava/lang/String;", "getResponse", "()Lretrofit2/Response;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Lretrofit2/Response;Ljava/lang/String;)Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "equals", "", "other", "", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
    public static final class PlacesApiException extends RuntimeException {
        @Nullable
        /* renamed from: a */
        private final Integer f30713a;
        @NotNull
        /* renamed from: b */
        private final Response<?> f30714b;
        @Nullable
        /* renamed from: c */
        private final String f30715c;

        @NotNull
        /* renamed from: a */
        public static /* synthetic */ PlacesApiException m37233a(PlacesApiException placesApiException, Integer num, Response response, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                num = placesApiException.f30713a;
            }
            if ((i & 2) != 0) {
                response = placesApiException.f30714b;
            }
            if ((i & 4) != 0) {
                str = placesApiException.f30715c;
            }
            return placesApiException.m37234a(num, response, str);
        }

        @NotNull
        /* renamed from: a */
        public final PlacesApiException m37234a(@Nullable Integer num, @NotNull Response<?> response, @Nullable String str) {
            C2668g.b(response, "response");
            return new PlacesApiException(num, response, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PlacesApiException) {
                    PlacesApiException placesApiException = (PlacesApiException) obj;
                    if (C2668g.a(this.f30713a, placesApiException.f30713a) && C2668g.a(this.f30714b, placesApiException.f30714b) && C2668g.a(this.f30715c, placesApiException.f30715c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Integer num = this.f30713a;
            int i = 0;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            Response response = this.f30714b;
            hashCode = (hashCode + (response != null ? response.hashCode() : 0)) * 31;
            String str = this.f30715c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PlacesApiException(code=");
            stringBuilder.append(this.f30713a);
            stringBuilder.append(", response=");
            stringBuilder.append(this.f30714b);
            stringBuilder.append(", placeId=");
            stringBuilder.append(this.f30715c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @Nullable
        /* renamed from: a */
        public final Integer m37235a() {
            return this.f30713a;
        }

        @NotNull
        /* renamed from: b */
        public final Response<?> m37236b() {
            return this.f30714b;
        }

        public /* synthetic */ PlacesApiException(Integer num, Response response, String str, int i, C15823e c15823e) {
            if ((i & 4) != 0) {
                str = null;
            }
            this(num, response, str);
        }

        @Nullable
        /* renamed from: c */
        public final String m37237c() {
            return this.f30715c;
        }

        public PlacesApiException(@Nullable Integer num, @NotNull Response<?> response, @Nullable String str) {
            String httpUrl;
            C2668g.b(response, "response");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error contacting Places API: ");
            stringBuilder.append(num);
            stringBuilder.append(" from ");
            C15966s raw = response.raw();
            if (raw != null) {
                C15963q a = raw.a();
                if (a != null) {
                    HttpUrl a2 = a.a();
                    if (a2 != null) {
                        httpUrl = a2.toString();
                        stringBuilder.append(httpUrl);
                        super(stringBuilder.toString());
                        this.f30713a = num;
                        this.f30714b = response;
                        this.f30715c = str;
                    }
                }
            }
            httpUrl = null;
            stringBuilder.append(httpUrl);
            super(stringBuilder.toString());
            this.f30713a = num;
            this.f30714b = response;
            this.f30715c = str;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/data/places/PlacesApiClient$Companion;", "", "()V", "PLACES_DISABLED_ERROR_CODE", "", "extractErrorCode", "throwable", "", "(Ljava/lang/Throwable;)Ljava/lang/Integer;", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.PlacesApiClient$a */
    public static final class C8734a {
        private C8734a() {
        }

        @Nullable
        /* renamed from: a */
        public final Integer m37238a(@NotNull Throwable th) {
            C2668g.b(th, "throwable");
            if (!(th instanceof PlacesApiException)) {
                th = null;
            }
            PlacesApiException placesApiException = (PlacesApiException) th;
            return placesApiException != null ? placesApiException.m37235a() : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.PlacesApiClient$f */
    static final class C10884f implements Action {
        /* renamed from: a */
        public static final C10884f f35547a = new C10884f();

        C10884f() {
        }

        public final void run() {
            C0001a.b("PlacesSettings set to false on API disabled", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.PlacesApiClient$g */
    static final class C10885g<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C10885g f35548a = new C10885g();

        C10885g() {
        }

        public /* synthetic */ void accept(Object obj) {
            m43388a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m43388a(Throwable th) {
            C0001a.c(th, "PlacesSettings did not save on API disabled", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/domain/places/model/Place;", "response", "Lcom/tinder/api/response/v2/DataResponse;", "Lcom/tinder/api/model/places/response/CorrectLocationResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.PlacesApiClient$d */
    static final class C13042d<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ PlacesApiClient f41592a;

        C13042d(PlacesApiClient placesApiClient) {
            this.f41592a = placesApiClient;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50794a((DataResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Place m50794a(DataResponse<CorrectLocationResponse> dataResponse) {
            CorrectLocationResponse correctLocationResponse = (CorrectLocationResponse) dataResponse.data();
            if (correctLocationResponse != null) {
                com.tinder.api.model.places.Place newPlace = correctLocationResponse.getNewPlace();
                if (newPlace != null) {
                    return this.f41592a.f35552d.m43425a(newPlace);
                }
            }
            throw ((Throwable) new NoPlacesDataException());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "it", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.PlacesApiClient$e */
    static final class C13043e<T, R> implements Func1<Throwable, Completable> {
        /* renamed from: a */
        final /* synthetic */ String f41593a;

        C13043e(String str) {
            this.f41593a = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50795a((Throwable) obj);
        }

        /* renamed from: a */
        public final Completable m50795a(Throwable th) {
            PlacesApiException placesApiException = (PlacesApiException) (!(th instanceof PlacesApiException) ? null : th);
            if (placesApiException != null) {
                Throwable a = PlacesApiException.m37233a(placesApiException, null, null, this.f41593a, 3, null);
                if (a != null) {
                    th = a;
                }
            }
            return Completable.a(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u00012*\u0010\u0005\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u0007 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/places/model/Place;", "kotlin.jvm.PlatformType", "", "response", "Lcom/tinder/api/response/v2/DataResponse;", "Lcom/tinder/api/model/places/response/PlacesResponse;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.PlacesApiClient$i */
    static final class C13044i<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ PlacesApiClient f41594a;

        C13044i(PlacesApiClient placesApiClient) {
            this.f41594a = placesApiClient;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50796a((DataResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<Place> m50796a(DataResponse<PlacesResponse> dataResponse) {
            PlacesResponse placesResponse = (PlacesResponse) dataResponse.data();
            if (placesResponse != null) {
                dataResponse = placesResponse.getPlaces();
                if (dataResponse != null) {
                    return this.f41594a.f35552d.a(dataResponse);
                }
            }
            throw ((Throwable) new NoPlacesDataException());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00062\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/data/places/PlacesApiClient$ResponseErrorTransformer;", "T", "Lrx/Single$Transformer;", "Lretrofit2/Response;", "(Lcom/tinder/data/places/PlacesApiClient;)V", "call", "Lrx/Single;", "upstream", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.PlacesApiClient$b */
    public final class C13857b<T> implements Single$Transformer<Response<T>, Response<T>> {
        /* renamed from: a */
        final /* synthetic */ PlacesApiClient f43926a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0003 \u0004*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0003 \u0004*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u0002H\u0003 \u0004*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lretrofit2/Response;", "T", "kotlin.jvm.PlatformType", "response", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.data.places.PlacesApiClient$b$a */
        static final class C13041a<T, R> implements Func1<T, Single<? extends R>> {
            /* renamed from: a */
            final /* synthetic */ C13857b f41591a;

            C13041a(C13857b c13857b) {
                this.f41591a = c13857b;
            }

            public /* synthetic */ Object call(Object obj) {
                return m50793a((Response) obj);
            }

            /* renamed from: a */
            public final rx.Single<retrofit2.Response<T>> m50793a(retrofit2.Response<T> r8) {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r7 = this;
                r0 = "response";
                kotlin.jvm.internal.C2668g.a(r8, r0);
                r0 = r8.isSuccessful();
                if (r0 != 0) goto L_0x0063;
            L_0x000b:
                r0 = com.tinder.api.timeout.TimeoutInterceptorKt.isTimeout(r8);
                if (r0 == 0) goto L_0x001a;
            L_0x0011:
                r0 = 50402; // 0xc4e2 float:7.0628E-41 double:2.4902E-319;
                r0 = java.lang.Integer.valueOf(r0);
            L_0x0018:
                r2 = r0;
                goto L_0x0052;
            L_0x001a:
                r0 = r8.errorBody();
                if (r0 == 0) goto L_0x0050;
            L_0x0020:
                r0 = r8.code();
                r1 = r7.f41591a;	 Catch:{ Exception -> 0x004b }
                r1 = r1.f43926a;	 Catch:{ Exception -> 0x004b }
                r1 = r1.f35556h;	 Catch:{ Exception -> 0x004b }
                r2 = r8.errorBody();	 Catch:{ Exception -> 0x004b }
                if (r2 != 0) goto L_0x003a;	 Catch:{ Exception -> 0x004b }
            L_0x0032:
                r1 = new kotlin.TypeCastException;	 Catch:{ Exception -> 0x004b }
                r2 = "null cannot be cast to non-null type okhttp3.ResponseBody";	 Catch:{ Exception -> 0x004b }
                r1.<init>(r2);	 Catch:{ Exception -> 0x004b }
                throw r1;	 Catch:{ Exception -> 0x004b }
            L_0x003a:
                r1 = r1.fromBody(r2);	 Catch:{ Exception -> 0x004b }
                if (r1 == 0) goto L_0x004b;	 Catch:{ Exception -> 0x004b }
            L_0x0040:
                r1 = r1.getCode();	 Catch:{ Exception -> 0x004b }
                if (r1 == 0) goto L_0x004b;	 Catch:{ Exception -> 0x004b }
            L_0x0046:
                r1 = r1.intValue();	 Catch:{ Exception -> 0x004b }
                r0 = r1;
            L_0x004b:
                r0 = java.lang.Integer.valueOf(r0);
                goto L_0x0018;
            L_0x0050:
                r0 = 0;
                goto L_0x0018;
            L_0x0052:
                r0 = new com.tinder.data.places.PlacesApiClient$PlacesApiException;
                r4 = 0;
                r5 = 4;
                r6 = 0;
                r1 = r0;
                r3 = r8;
                r1.<init>(r2, r3, r4, r5, r6);
                r0 = (java.lang.Throwable) r0;
                r8 = rx.Single.a(r0);
                goto L_0x006a;
            L_0x0063:
                r1 = 1;
                if (r0 != r1) goto L_0x006b;
            L_0x0066:
                r8 = rx.Single.a(r8);
            L_0x006a:
                return r8;
            L_0x006b:
                r8 = new kotlin.NoWhenBranchMatchedException;
                r8.<init>();
                throw r8;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.places.PlacesApiClient.b.a.a(retrofit2.Response):rx.Single<retrofit2.Response<T>>");
            }
        }

        public C13857b(PlacesApiClient placesApiClient) {
            this.f43926a = placesApiClient;
        }

        public /* synthetic */ Object call(Object obj) {
            return m53398a((Single) obj);
        }

        @NotNull
        /* renamed from: a */
        public Single<Response<T>> m53398a(@NotNull Single<Response<T>> single) {
            C2668g.b(single, "upstream");
            single = single.a(new C13041a(this));
            C2668g.a(single, "upstream\n               …      }\n                }");
            return single;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.PlacesApiClient$c */
    static final class C13858c<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ String f43927a;
        /* renamed from: b */
        final /* synthetic */ String f43928b;

        C13858c(String str, String str2) {
            this.f43927a = str;
            this.f43928b = str2;
        }

        public /* synthetic */ void call(Object obj) {
            m53399a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53399a(Throwable th) {
            Object obj = null;
            if (!(th instanceof PlacesApiException)) {
                th = null;
            }
            PlacesApiException placesApiException = (PlacesApiException) th;
            if (placesApiException != null) {
                obj = placesApiException.m37235a();
            }
            th = new StringBuilder();
            th.append("API failure to update correct place ");
            th.append(this.f43927a);
            th.append(" -> ");
            th.append(this.f43928b);
            th.append(" (");
            th.append(obj);
            th.append(") ");
            C0001a.e(th.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "response", "Lcom/tinder/api/response/v2/DataResponse;", "Lcom/tinder/api/model/places/response/PlacesResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.PlacesApiClient$h */
    static final class C13859h<T> implements Action1<DataResponse<PlacesResponse>> {
        /* renamed from: a */
        final /* synthetic */ PlacesApiClient f43929a;

        C13859h(PlacesApiClient placesApiClient) {
            this.f43929a = placesApiClient;
        }

        public /* synthetic */ void call(Object obj) {
            m53400a((DataResponse) obj);
        }

        /* renamed from: a */
        public final void m53400a(DataResponse<PlacesResponse> dataResponse) {
            PlacesConfig placesConfig = this.f43929a.f35554f.get();
            if (placesConfig != null) {
                PlacesResponse placesResponse = (PlacesResponse) dataResponse.data();
                this.f43929a.f35554f.update(PlacesConfig.copy$default(placesConfig, placesResponse != null ? placesResponse.getRefreshTime() : 0, null, false, false, 14, null));
            }
        }
    }

    @Inject
    public PlacesApiClient(@NotNull TinderApi tinderApi, @NotNull C10888a c10888a, @NotNull ConnectivityProvider connectivityProvider, @NotNull PlacesConfigProvider placesConfigProvider, @NotNull C10897e c10897e, @NotNull ResponseErrorAdapter responseErrorAdapter) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(c10888a, "apiAdapter");
        C2668g.b(connectivityProvider, "connectivityProvider");
        C2668g.b(placesConfigProvider, "placesConfigProvider");
        C2668g.b(c10897e, "setPlacesEnabledInProfileDataStore");
        C2668g.b(responseErrorAdapter, "responseErrorAdapter");
        this.f35551c = tinderApi;
        this.f35552d = c10888a;
        this.f35553e = connectivityProvider;
        this.f35554f = placesConfigProvider;
        this.f35555g = c10897e;
        this.f35556h = responseErrorAdapter;
        tinderApi = BehaviorProcessor.q().u();
        C2668g.a(tinderApi, "BehaviorProcessor.create…piEvent>().toSerialized()");
        this.f35550b = tinderApi;
    }

    @NotNull
    /* renamed from: a */
    public final Single<List<Place>> m43394a() {
        Single a = this.f35551c.fetchRecentPlaces().a(new C13857b(this));
        C2668g.a(a, "tinderApi.fetchRecentPla…sponseErrorTransformer())");
        String str = "PLACES_LOAD_KEY";
        Map map = (Map) null;
        a = a.a(new C13865a(this, str)).c(new C13866b(this, str, null, map)).d(new C13867c(this, str, null, map)).d(C13050d.f41600a);
        C2668g.a(a, "this\n        .doOnSubscr…       .map { it.body() }");
        Single<List<Place>> d = a.d(new C13859h(this)).d(new C13044i(this));
        C2668g.a(d, "tinderApi.fetchRecentPla…iModel)\n                }");
        return d;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m43393a(@NotNull String str) {
        C2668g.b(str, "id");
        Single a = this.f35551c.deletePlace(Long.valueOf(Long.parseLong(str))).a(new C13857b(this));
        C2668g.a(a, "tinderApi.deletePlace(id…sponseErrorTransformer())");
        String str2 = "PLACES_DELETE_KEY";
        String str3 = "placeId";
        Map map = (Map) null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2 != null) {
            str2 = stringBuilder2;
        }
        Pair pair = new Pair(str, str3);
        a = a.a(new C13865a(this, str2)).c(new C13866b(this, str2, pair, map)).d(new C13867c(this, str2, pair, map)).d(C13050d.f41600a);
        C2668g.a(a, "this\n        .doOnSubscr…       .map { it.body() }");
        str = a.b().b(new C13043e(str));
        C2668g.a(str, "tinderApi.deletePlace(id…or)\n                    }");
        return str;
    }

    @NotNull
    /* renamed from: b */
    public final Completable m43398b(@NotNull String str) {
        C2668g.b(str, "id");
        Single a = this.f35551c.blacklistPlace(Long.valueOf(Long.parseLong(str))).a(new C13857b(this));
        C2668g.a(a, "tinderApi.blacklistPlace…sponseErrorTransformer())");
        String str2 = "PLACES_BLACKLIST_KEY";
        String str3 = "placeId";
        Map map = (Map) null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2 != null) {
            str2 = stringBuilder2;
        }
        Pair pair = new Pair(str, str3);
        str = a.a((Action0) new C13865a(this, str2)).c(new C13866b(this, str2, pair, map)).d(new C13867c(this, str2, pair, map)).d(C13050d.f41600a);
        C2668g.a(str, "this\n        .doOnSubscr…       .map { it.body() }");
        str = str.b();
        C2668g.a(str, "tinderApi.blacklistPlace…         .toCompletable()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Single<Place> m43395a(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "newId");
        C2668g.b(str2, "oldId");
        Single a = this.f35551c.correctPlace(Long.valueOf(Long.parseLong(str)), Long.valueOf(Long.parseLong(str2))).a(new C13857b(this));
        C2668g.a(a, "tinderApi.correctPlace(n…sponseErrorTransformer())");
        String str3 = "PLACES_CORRECT_KEY";
        Map map = (Map) null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str3);
        stringBuilder.append(str2);
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2 != null) {
            str3 = stringBuilder2;
        }
        a = a.a(new C13865a(this, str3)).c(new C13866b(this, str3, null, map)).d(new C13867c(this, str3, null, map)).d(C13050d.f41600a);
        C2668g.a(a, "this\n        .doOnSubscr…       .map { it.body() }");
        str = a.c(new C13858c(str, str2)).d((Func1) new C13042d(this));
        C2668g.a(str, "tinderApi.correctPlace(n…el)\n                    }");
        return str;
    }

    @NotNull
    /* renamed from: c */
    public final Completable m43400c(@NotNull String str) {
        C2668g.b(str, "placeId");
        Single a = this.f35551c.markPlaceViewed(str).a(new C13857b(this));
        C2668g.a(a, "tinderApi.markPlaceViewe…sponseErrorTransformer())");
        String str2 = "PLACES_VIEWED_KEY";
        String str3 = "placeId";
        Map map = (Map) null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2 != null) {
            str2 = stringBuilder2;
        }
        Pair pair = new Pair(str, str3);
        str = a.a((Action0) new C13865a(this, str2)).c(new C13866b(this, str2, pair, map)).d(new C13867c(this, str2, pair, map)).d(C13050d.f41600a);
        C2668g.a(str, "this\n        .doOnSubscr…       .map { it.body() }");
        str = str.b();
        C2668g.a(str, "tinderApi.markPlaceViewe…         .toCompletable()");
        return str;
    }

    @NotNull
    /* renamed from: d */
    public final Completable m43401d(@NotNull String str) {
        C2668g.b(str, "placeId");
        Single a = this.f35551c.markPlaceRecsViewed(str).a(new C13857b(this));
        C2668g.a(a, "tinderApi.markPlaceRecsV…sponseErrorTransformer())");
        String str2 = "PLACES_RECS_VIEWED_KEY";
        String str3 = "placeId";
        Map map = (Map) null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2 != null) {
            str2 = stringBuilder2;
        }
        Pair pair = new Pair(str, str3);
        str = a.a((Action0) new C13865a(this, str2)).c(new C13866b(this, str2, pair, map)).d(new C13867c(this, str2, pair, map)).d(C13050d.f41600a);
        C2668g.a(str, "this\n        .doOnSubscr…       .map { it.body() }");
        str = str.b();
        C2668g.a(str, "tinderApi.markPlaceRecsV…         .toCompletable()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m43392a(@NotNull PlacesVisitRequest placesVisitRequest) {
        Object id;
        String str;
        C2668g.b(placesVisitRequest, "request");
        String foursquareVisitID = placesVisitRequest.getFoursquareVisitID();
        Object obj = placesVisitRequest.getDepartureTimestamp() > 0 ? "departure" : "arrival";
        Map linkedHashMap = new LinkedHashMap();
        String str2 = "foursquareVenueId";
        Venue venue = placesVisitRequest.getVenue();
        if (venue != null) {
            id = venue.getId();
            if (id != null) {
                linkedHashMap.put(str2, id);
                linkedHashMap.put("visitId", foursquareVisitID);
                linkedHashMap.put("visitType", obj);
                placesVisitRequest = this.f35551c.submitPlacesVisit(placesVisitRequest).a(new C13857b(this));
                C2668g.a(placesVisitRequest, "tinderApi.submitPlacesVi…sponseErrorTransformer())");
                str = "PLACES_SUBMIT_KEY";
                if (foursquareVisitID != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(foursquareVisitID);
                    foursquareVisitID = stringBuilder.toString();
                    if (foursquareVisitID != null) {
                        placesVisitRequest = placesVisitRequest.a(new C13865a(this, foursquareVisitID)).c(new C13866b(this, foursquareVisitID, null, linkedHashMap)).d(new C13867c(this, foursquareVisitID, null, linkedHashMap)).d(C13050d.f41600a);
                        C2668g.a(placesVisitRequest, "this\n        .doOnSubscr…       .map { it.body() }");
                        placesVisitRequest = placesVisitRequest.b();
                        C2668g.a(placesVisitRequest, "tinderApi.submitPlacesVi…         .toCompletable()");
                        return placesVisitRequest;
                    }
                }
                foursquareVisitID = str;
                placesVisitRequest = placesVisitRequest.a(new C13865a(this, foursquareVisitID)).c(new C13866b(this, foursquareVisitID, null, linkedHashMap)).d(new C13867c(this, foursquareVisitID, null, linkedHashMap)).d(C13050d.f41600a);
                C2668g.a(placesVisitRequest, "this\n        .doOnSubscr…       .map { it.body() }");
                placesVisitRequest = placesVisitRequest.b();
                C2668g.a(placesVisitRequest, "tinderApi.submitPlacesVi…         .toCompletable()");
                return placesVisitRequest;
            }
        }
        id = "";
        linkedHashMap.put(str2, id);
        linkedHashMap.put("visitId", foursquareVisitID);
        linkedHashMap.put("visitType", obj);
        placesVisitRequest = this.f35551c.submitPlacesVisit(placesVisitRequest).a(new C13857b(this));
        C2668g.a(placesVisitRequest, "tinderApi.submitPlacesVi…sponseErrorTransformer())");
        str = "PLACES_SUBMIT_KEY";
        if (foursquareVisitID != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(foursquareVisitID);
            foursquareVisitID = stringBuilder2.toString();
            if (foursquareVisitID != null) {
                placesVisitRequest = placesVisitRequest.a(new C13865a(this, foursquareVisitID)).c(new C13866b(this, foursquareVisitID, null, linkedHashMap)).d(new C13867c(this, foursquareVisitID, null, linkedHashMap)).d(C13050d.f41600a);
                C2668g.a(placesVisitRequest, "this\n        .doOnSubscr…       .map { it.body() }");
                placesVisitRequest = placesVisitRequest.b();
                C2668g.a(placesVisitRequest, "tinderApi.submitPlacesVi…         .toCompletable()");
                return placesVisitRequest;
            }
        }
        foursquareVisitID = str;
        placesVisitRequest = placesVisitRequest.a(new C13865a(this, foursquareVisitID)).c(new C13866b(this, foursquareVisitID, null, linkedHashMap)).d(new C13867c(this, foursquareVisitID, null, linkedHashMap)).d(C13050d.f41600a);
        C2668g.a(placesVisitRequest, "this\n        .doOnSubscr…       .map { it.body() }");
        placesVisitRequest = placesVisitRequest.b();
        C2668g.a(placesVisitRequest, "tinderApi.submitPlacesVi…         .toCompletable()");
        return placesVisitRequest;
    }

    /* renamed from: b */
    public final void m43399b() {
        if (!this.f35553e.a()) {
            throw new NoInternetConnectionException();
        }
    }

    /* renamed from: a */
    public final void m43397a(@NotNull Throwable th) {
        C2668g.b(th, "error");
        if (!(th instanceof PlacesApiException)) {
            th = null;
        }
        PlacesApiException placesApiException = (PlacesApiException) th;
        if (placesApiException != null) {
            th = placesApiException.m37235a();
            if (th != null && ((Number) th).intValue() == 41201) {
                this.f35555g.m43443a(false).a(C10884f.f35547a, C10885g.f35548a);
            }
        }
    }

    @Nullable
    public C3957b<C8741b> observeApiEvents() {
        return !this.f35550b.r() ? this.f35550b.g() : null;
    }

    /* renamed from: a */
    public final void m43396a(@NotNull C8741b c8741b) {
        C2668g.b(c8741b, "event");
        this.f35550b.onNext(c8741b);
    }
}
