package com.tinder.data.places;

import com.tinder.api.TinderApi;
import com.tinder.api.model.places.response.PlacesRecsResponse;
import com.tinder.api.moshi.ResponseErrorAdapter;
import com.tinder.api.response.v2.DataResponse;
import com.tinder.api.response.v2.ResponseError;
import com.tinder.api.timeout.TimeoutInterceptorKt;
import com.tinder.data.adapter.ah;
import com.tinder.data.adapter.ah.C10733a;
import com.tinder.data.places.C8741b.C10890a;
import com.tinder.data.places.C8741b.C10891b;
import com.tinder.data.places.C8741b.C10892c;
import com.tinder.data.places.p329a.C10889b;
import com.tinder.data.recs.C8786k;
import com.tinder.data.recs.C8786k.C10993a;
import com.tinder.data.recs.C8786k.C10994b;
import com.tinder.data.recs.C8786k.C10996d;
import com.tinder.data.recs.C8786k.C10998f;
import com.tinder.domain.recs.RecsApiClient;
import com.tinder.domain.recs.RecsEngine.ResetReason;
import com.tinder.domain.recs.model.ContextualInfo.Default.ExpectedError;
import com.tinder.domain.recs.model.ContextualInfo.Default.UnexpectedError;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecSource.Places;
import com.tinder.domain.utils.AgeCalculator;
import io.reactivex.C3957b;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.C18430a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import okhttp3.C15968t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import rx.Observable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000523456B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eJ\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0003J\u001a\u0010 \u001a\u0004\u0018\u00010!2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\"H\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0$H\u0016J\u0010\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010&H\u0016J\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130(J\u001c\u0010)\u001a\u00020\u001f2\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\"0*H\u0002J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-H\u0017J\u0018\u0010.\u001a\u00020\u001a2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\"H\u0003J*\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001f0$*\b\u0012\u0004\u0012\u00020\u001f0$2\u0006\u00100\u001a\u00020!2\b\u00101\u001a\u0004\u0018\u00010!H\u0002R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R2\u0010\u0011\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u0013 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u0013\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/tinder/data/places/PlacesRecsApiClient;", "Lcom/tinder/domain/recs/RecsApiClient;", "Lcom/tinder/data/places/ObservableApiEventClient;", "tinderApi", "Lcom/tinder/api/TinderApi;", "placesRecDomainApiAdapter", "Lcom/tinder/data/places/adapter/PlacesRecDomainApiAdapter;", "recSource", "Lcom/tinder/domain/recs/model/RecSource$Places;", "responseErrorAdapter", "Lcom/tinder/api/moshi/ResponseErrorAdapter;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/data/places/adapter/PlacesRecDomainApiAdapter;Lcom/tinder/domain/recs/model/RecSource$Places;Lcom/tinder/api/moshi/ResponseErrorAdapter;)V", "apiEventsProcessor", "Lio/reactivex/processors/FlowableProcessor;", "Lcom/tinder/data/places/PerformanceApiEvent;", "getRecSource", "()Lcom/tinder/domain/recs/model/RecSource$Places;", "recsResponseSubject", "Lrx/subjects/BehaviorSubject;", "Lcom/tinder/api/model/places/response/PlacesRecsResponse;", "kotlin.jvm.PlatformType", "getResponseErrorAdapter", "()Lcom/tinder/api/moshi/ResponseErrorAdapter;", "state", "Lcom/tinder/data/places/PlacesRecsApiClient$State;", "addApiEvent", "", "event", "createRecsFetchResults", "Lcom/tinder/data/recs/RecsFetchResults;", "response", "Lcom/tinder/data/places/PlacesRecsApiClient$ParsedResponse;", "getNextCursor", "", "Lcom/tinder/api/response/v2/DataResponse;", "loadRecs", "Lrx/Single;", "observeApiEvents", "Lio/reactivex/Flowable;", "observeRecsResponse", "Lrx/Observable;", "parseResponse", "Lretrofit2/Response;", "reset", "reason", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "updateState", "setupPerformanceMonitoring", "id", "cursor", "Companion", "Factory", "ParsedResponse", "PlacesUnknownResponseException", "State", "data_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesRecsApiClient implements ObservableApiEventClient, RecsApiClient {
    /* renamed from: a */
    public static final C8735a f35565a = new C8735a();
    /* renamed from: b */
    private final C18430a<C8741b> f35566b;
    /* renamed from: c */
    private final C19785a<PlacesRecsResponse> f35567c = C19785a.w();
    /* renamed from: d */
    private C8738d f35568d = new C8738d(null, null, 3, null);
    /* renamed from: e */
    private final TinderApi f35569e;
    /* renamed from: f */
    private final C10889b f35570f;
    @NotNull
    /* renamed from: g */
    private final Places f35571g;
    @NotNull
    /* renamed from: h */
    private final ResponseErrorAdapter f35572h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/data/places/PlacesRecsApiClient$PlacesUnknownResponseException;", "", "()V", "data_release"}, k = 1, mv = {1, 1, 10})
    private static final class PlacesUnknownResponseException extends Throwable {
        public PlacesUnknownResponseException() {
            super("Unknown Response");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/data/places/PlacesRecsApiClient$Companion;", "", "()V", "PAGE_SIZE", "", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.PlacesRecsApiClient$a */
    public static final class C8735a {
        private C8735a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e`\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/data/places/PlacesRecsApiClient$Factory;", "", "tinderApi", "Lcom/tinder/api/TinderApi;", "recUserDomainApiAdapter", "Lcom/tinder/data/adapter/RecDomainApiAdapter$RecUserDomainApiAdapter;", "ageCalculator", "Lcom/tinder/domain/utils/AgeCalculator;", "responseErrorAdapter", "Lcom/tinder/api/moshi/ResponseErrorAdapter;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/data/adapter/RecDomainApiAdapter$RecUserDomainApiAdapter;Lcom/tinder/domain/utils/AgeCalculator;Lcom/tinder/api/moshi/ResponseErrorAdapter;)V", "clientMap", "Ljava/util/HashMap;", "", "Lcom/tinder/data/places/PlacesRecsApiClient;", "Lkotlin/collections/HashMap;", "createRecDomainApiAdapter", "Lcom/tinder/data/places/adapter/PlacesRecDomainApiAdapter;", "recSource", "Lcom/tinder/domain/recs/model/RecSource$Places;", "getClientForPlace", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.PlacesRecsApiClient$b */
    public static final class C8736b {
        /* renamed from: a */
        private final HashMap<Long, PlacesRecsApiClient> f30716a = new HashMap();
        /* renamed from: b */
        private final TinderApi f30717b;
        /* renamed from: c */
        private final C10733a f30718c;
        /* renamed from: d */
        private final AgeCalculator f30719d;
        /* renamed from: e */
        private final ResponseErrorAdapter f30720e;

        public C8736b(@NotNull TinderApi tinderApi, @NotNull C10733a c10733a, @NotNull AgeCalculator ageCalculator, @NotNull ResponseErrorAdapter responseErrorAdapter) {
            C2668g.b(tinderApi, "tinderApi");
            C2668g.b(c10733a, "recUserDomainApiAdapter");
            C2668g.b(ageCalculator, "ageCalculator");
            C2668g.b(responseErrorAdapter, "responseErrorAdapter");
            this.f30717b = tinderApi;
            this.f30718c = c10733a;
            this.f30719d = ageCalculator;
            this.f30720e = responseErrorAdapter;
        }

        @NotNull
        /* renamed from: a */
        public final PlacesRecsApiClient m37240a(@NotNull Places places) {
            C2668g.b(places, "recSource");
            Map map = this.f30716a;
            Long valueOf = Long.valueOf(places.getPlaceId());
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new PlacesRecsApiClient(this.f30717b, m37239b(places), places, this.f30720e);
                map.put(valueOf, obj);
            }
            return (PlacesRecsApiClient) obj;
        }

        /* renamed from: b */
        private final C10889b m37239b(Places places) {
            return new C10889b(new ah(this.f30718c, places, this.f30719d), String.valueOf(places.getPlaceId()));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/places/PlacesRecsApiClient$ParsedResponse;", "", "()V", "Error", "Success", "Lcom/tinder/data/places/PlacesRecsApiClient$ParsedResponse$Success;", "Lcom/tinder/data/places/PlacesRecsApiClient$ParsedResponse$Error;", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.PlacesRecsApiClient$c */
    private static abstract class C8737c {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/tinder/data/places/PlacesRecsApiClient$ParsedResponse$Error;", "Lcom/tinder/data/places/PlacesRecsApiClient$ParsedResponse;", "errorCode", "", "statusCode", "url", "", "method", "(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMethod", "()Ljava/lang/String;", "getStatusCode", "()I", "getUrl", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;)Lcom/tinder/data/places/PlacesRecsApiClient$ParsedResponse$Error;", "equals", "", "other", "", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.data.places.PlacesRecsApiClient$c$a */
        public static final class C10886a extends C8737c {
            @Nullable
            /* renamed from: a */
            private final Integer f35557a;
            /* renamed from: b */
            private final int f35558b;
            @NotNull
            /* renamed from: c */
            private final String f35559c;
            @NotNull
            /* renamed from: d */
            private final String f35560d;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C10886a) {
                    C10886a c10886a = (C10886a) obj;
                    if (C2668g.a(this.f35557a, c10886a.f35557a)) {
                        return (this.f35558b == c10886a.f35558b ? 1 : null) != null && C2668g.a(this.f35559c, c10886a.f35559c) && C2668g.a(this.f35560d, c10886a.f35560d);
                    }
                }
            }

            public int hashCode() {
                Integer num = this.f35557a;
                int i = 0;
                int hashCode = (((num != null ? num.hashCode() : 0) * 31) + this.f35558b) * 31;
                String str = this.f35559c;
                hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                str = this.f35560d;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error(errorCode=");
                stringBuilder.append(this.f35557a);
                stringBuilder.append(", statusCode=");
                stringBuilder.append(this.f35558b);
                stringBuilder.append(", url=");
                stringBuilder.append(this.f35559c);
                stringBuilder.append(", method=");
                stringBuilder.append(this.f35560d);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @Nullable
            /* renamed from: a */
            public final Integer m43402a() {
                return this.f35557a;
            }

            /* renamed from: b */
            public final int m43403b() {
                return this.f35558b;
            }

            @NotNull
            /* renamed from: c */
            public final String m43404c() {
                return this.f35559c;
            }

            @NotNull
            /* renamed from: d */
            public final String m43405d() {
                return this.f35560d;
            }

            public C10886a(@Nullable Integer num, int i, @NotNull String str, @NotNull String str2) {
                C2668g.b(str, "url");
                C2668g.b(str2, "method");
                super();
                this.f35557a = num;
                this.f35558b = i;
                this.f35559c = str;
                this.f35560d = str2;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/tinder/data/places/PlacesRecsApiClient$ParsedResponse$Success;", "Lcom/tinder/data/places/PlacesRecsApiClient$ParsedResponse;", "response", "Lcom/tinder/api/response/v2/DataResponse;", "Lcom/tinder/api/model/places/response/PlacesRecsResponse;", "statusCode", "", "url", "", "method", "(Lcom/tinder/api/response/v2/DataResponse;ILjava/lang/String;Ljava/lang/String;)V", "getMethod", "()Ljava/lang/String;", "getResponse", "()Lcom/tinder/api/response/v2/DataResponse;", "getStatusCode", "()I", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.data.places.PlacesRecsApiClient$c$b */
        public static final class C10887b extends C8737c {
            @NotNull
            /* renamed from: a */
            private final DataResponse<PlacesRecsResponse> f35561a;
            /* renamed from: b */
            private final int f35562b;
            @NotNull
            /* renamed from: c */
            private final String f35563c;
            @NotNull
            /* renamed from: d */
            private final String f35564d;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C10887b) {
                    C10887b c10887b = (C10887b) obj;
                    if (C2668g.a(this.f35561a, c10887b.f35561a)) {
                        return (this.f35562b == c10887b.f35562b ? 1 : null) != null && C2668g.a(this.f35563c, c10887b.f35563c) && C2668g.a(this.f35564d, c10887b.f35564d);
                    }
                }
            }

            public int hashCode() {
                DataResponse dataResponse = this.f35561a;
                int i = 0;
                int hashCode = (((dataResponse != null ? dataResponse.hashCode() : 0) * 31) + this.f35562b) * 31;
                String str = this.f35563c;
                hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                str = this.f35564d;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Success(response=");
                stringBuilder.append(this.f35561a);
                stringBuilder.append(", statusCode=");
                stringBuilder.append(this.f35562b);
                stringBuilder.append(", url=");
                stringBuilder.append(this.f35563c);
                stringBuilder.append(", method=");
                stringBuilder.append(this.f35564d);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @NotNull
            /* renamed from: a */
            public final DataResponse<PlacesRecsResponse> m43406a() {
                return this.f35561a;
            }

            /* renamed from: b */
            public final int m43407b() {
                return this.f35562b;
            }

            @NotNull
            /* renamed from: c */
            public final String m43408c() {
                return this.f35563c;
            }

            @NotNull
            /* renamed from: d */
            public final String m43409d() {
                return this.f35564d;
            }

            public C10887b(@NotNull DataResponse<PlacesRecsResponse> dataResponse, int i, @NotNull String str, @NotNull String str2) {
                C2668g.b(dataResponse, "response");
                C2668g.b(str, "url");
                C2668g.b(str2, "method");
                super();
                this.f35561a = dataResponse;
                this.f35562b = i;
                this.f35563c = str;
                this.f35564d = str2;
            }
        }

        private C8737c() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/data/places/PlacesRecsApiClient$State;", "", "hasMoreRecs", "", "nextCursor", "", "(ZLjava/lang/String;)V", "getHasMoreRecs", "()Z", "getNextCursor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.PlacesRecsApiClient$d */
    private static final class C8738d {
        /* renamed from: a */
        private final boolean f30721a;
        @Nullable
        /* renamed from: b */
        private final String f30722b;

        public C8738d() {
            this(false, null, 3, null);
        }

        @NotNull
        /* renamed from: a */
        public final C8738d m37241a(boolean z, @Nullable String str) {
            return new C8738d(z, str);
        }

        /* renamed from: a */
        public final boolean m37242a() {
            return this.f30721a;
        }

        @Nullable
        /* renamed from: b */
        public final String m37243b() {
            return this.f30722b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8738d) {
                C8738d c8738d = (C8738d) obj;
                return (this.f30721a == c8738d.f30721a ? 1 : null) != null && C2668g.a(this.f30722b, c8738d.f30722b);
            }
        }

        public int hashCode() {
            int i = this.f30721a;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            String str = this.f30722b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("State(hasMoreRecs=");
            stringBuilder.append(this.f30721a);
            stringBuilder.append(", nextCursor=");
            stringBuilder.append(this.f30722b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8738d(boolean z, @Nullable String str) {
            this.f30721a = z;
            this.f30722b = str;
        }

        public /* synthetic */ C8738d(boolean z, String str, int i, C15823e c15823e) {
            if ((i & 1) != null) {
                z = true;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            this(z, str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/data/recs/RecsFetchResults;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.PlacesRecsApiClient$e */
    static final class C8739e<V> implements Callable<Single<T>> {
        /* renamed from: a */
        final /* synthetic */ PlacesRecsApiClient f30723a;

        C8739e(PlacesRecsApiClient placesRecsApiClient) {
            this.f30723a = placesRecsApiClient;
        }

        public /* synthetic */ Object call() {
            return m37244a();
        }

        /* renamed from: a */
        public final Single<C8786k> m37244a() {
            C8738d a = this.f30723a.f35568d;
            boolean a2 = a.m37242a();
            String b = a.m37243b();
            if (!a2) {
                return Single.a(new C10994b(null, 1, null));
            }
            PlacesRecsApiClient placesRecsApiClient = this.f30723a;
            Single d = this.f30723a.f35569e.fetchPlaceRecs(Long.valueOf(this.f30723a.m43424b().getPlaceId()), 20, b).d(new Func1<T, R>() {
                public /* synthetic */ Object call(Object obj) {
                    return m50797a((Response) obj);
                }

                @NotNull
                /* renamed from: a */
                public final C8737c m50797a(Response<DataResponse<PlacesRecsResponse>> response) {
                    PlacesRecsApiClient placesRecsApiClient = this.f30723a;
                    C2668g.a(response, "it");
                    return placesRecsApiClient.m43411a((Response) response);
                }
            });
            C2668g.a(d, "tinderApi.fetchPlaceRecs…it)\n                    }");
            return placesRecsApiClient.m43416a(d, String.valueOf(this.f30723a.m43424b().getPlaceId()), b).d(new Action1<C8737c>() {
                public /* synthetic */ void call(Object obj) {
                    m53401a((C8737c) obj);
                }

                /* renamed from: a */
                public final void m53401a(C8737c c8737c) {
                    if (c8737c instanceof C10887b) {
                        C10887b c10887b = (C10887b) c8737c;
                        this.f30723a.m43417a(c10887b.m43406a());
                        PlacesRecsResponse placesRecsResponse = (PlacesRecsResponse) c10887b.m43406a().data();
                        if (placesRecsResponse != null) {
                            this.f30723a.f35567c.onNext(placesRecsResponse);
                        }
                    }
                }
            }).d(new Func1<T, R>() {
                public /* synthetic */ Object call(Object obj) {
                    return m50798a((C8737c) obj);
                }

                @NotNull
                /* renamed from: a */
                public final C8786k m50798a(C8737c c8737c) {
                    return this.f30723a.m43413a(c8737c);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.PlacesRecsApiClient$f */
    static final class C13861f implements Action0 {
        /* renamed from: a */
        final /* synthetic */ PlacesRecsApiClient f43931a;
        /* renamed from: b */
        final /* synthetic */ String f43932b;

        C13861f(PlacesRecsApiClient placesRecsApiClient, String str) {
            this.f43931a = placesRecsApiClient;
            this.f43932b = str;
        }

        public final void call() {
            this.f43931a.m43423a((C8741b) new C10892c(this.f43932b));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "parsedResponse", "Lcom/tinder/data/places/PlacesRecsApiClient$ParsedResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.PlacesRecsApiClient$g */
    static final class C13862g<T> implements Action1<C8737c> {
        /* renamed from: a */
        final /* synthetic */ PlacesRecsApiClient f43933a;
        /* renamed from: b */
        final /* synthetic */ String f43934b;
        /* renamed from: c */
        final /* synthetic */ String f43935c;

        C13862g(PlacesRecsApiClient placesRecsApiClient, String str, String str2) {
            this.f43933a = placesRecsApiClient;
            this.f43934b = str;
            this.f43935c = str2;
        }

        public /* synthetic */ void call(Object obj) {
            m53402a((C8737c) obj);
        }

        /* renamed from: a */
        public final void m53402a(C8737c c8737c) {
            C13862g c13862g = this;
            C8737c c8737c2 = c8737c;
            if (c8737c2 instanceof C10886a) {
                C10886a c10886a = (C10886a) c8737c2;
                c13862g.f43933a.m43423a((C8741b) new C10890a(c13862g.f43934b, C19303i.a(c10886a.m43404c(), c13862g.f43935c, "{placeId}", false, 4, null), c10886a.m43405d(), c10886a.m43403b(), c10886a.m43402a(), null));
            } else if (c8737c2 instanceof C10887b) {
                C10887b c10887b = (C10887b) c8737c2;
                c13862g.f43933a.m43423a((C8741b) new C10891b(c13862g.f43934b, C19303i.a(c10887b.m43408c(), c13862g.f43935c, "{placeId}", false, 4, null), c10887b.m43409d(), c10887b.m43407b(), null));
            }
        }
    }

    public PlacesRecsApiClient(@NotNull TinderApi tinderApi, @NotNull C10889b c10889b, @NotNull Places places, @NotNull ResponseErrorAdapter responseErrorAdapter) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(c10889b, "placesRecDomainApiAdapter");
        C2668g.b(places, "recSource");
        C2668g.b(responseErrorAdapter, "responseErrorAdapter");
        this.f35569e = tinderApi;
        this.f35570f = c10889b;
        this.f35571g = places;
        this.f35572h = responseErrorAdapter;
        tinderApi = BehaviorProcessor.q().u();
        C2668g.a(tinderApi, "BehaviorProcessor.create…piEvent>().toSerialized()");
        this.f35566b = tinderApi;
    }

    public /* synthetic */ Rec$Source getRecSource() {
        return m43424b();
    }

    @NotNull
    /* renamed from: b */
    public Places m43424b() {
        return this.f35571g;
    }

    public synchronized void reset(@NotNull ResetReason resetReason) {
        C2668g.b(resetReason, "reason");
        this.f35568d = new C8738d(false, null, 3, null);
    }

    @NotNull
    /* renamed from: a */
    public final Observable<PlacesRecsResponse> m43422a() {
        Observable<PlacesRecsResponse> e = this.f35567c.B().e();
        C2668g.a(e, "recsResponseSubject.toSerialized().asObservable()");
        return e;
    }

    @Nullable
    public C3957b<C8741b> observeApiEvents() {
        return !this.f35566b.r() ? this.f35566b.g() : null;
    }

    /* renamed from: a */
    public final void m43423a(@NotNull C8741b c8741b) {
        C2668g.b(c8741b, "event");
        this.f35566b.onNext(c8741b);
    }

    @NotNull
    public Single<C8786k> loadRecs() {
        Single<C8786k> b = Single.b(new C8739e(this));
        C2668g.a(b, "Single.defer<RecsFetchRe…}\n            }\n        }");
        return b;
    }

    /* renamed from: a */
    private final synchronized void m43417a(DataResponse<PlacesRecsResponse> dataResponse) {
        dataResponse = m43420b((DataResponse) dataResponse);
        this.f35568d = this.f35568d.m37241a(dataResponse != null, dataResponse);
    }

    /* renamed from: a */
    private final synchronized C8786k m43413a(C8737c c8737c) {
        C8786k c10996d;
        if (c8737c instanceof C10887b) {
            String b = m43420b(((C10887b) c8737c).m43406a());
            PlacesRecsResponse placesRecsResponse = (PlacesRecsResponse) ((C10887b) c8737c).m43406a().data();
            if (placesRecsResponse != null) {
                c8737c = placesRecsResponse.getRecs();
                if (c8737c != null) {
                    c8737c = this.f35570f.a(c8737c);
                    if (b == null) {
                        C2668g.a(c8737c, "recs");
                        c10996d = new C10996d(c8737c);
                    } else {
                        C2668g.a(c8737c, "recs");
                        c10996d = new C10994b(c8737c);
                    }
                }
            }
            c8737c = C19301m.a();
            c8737c = this.f35570f.a(c8737c);
            if (b == null) {
                C2668g.a(c8737c, "recs");
                c10996d = new C10994b(c8737c);
            } else {
                C2668g.a(c8737c, "recs");
                c10996d = new C10996d(c8737c);
            }
        } else if (c8737c == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.data.places.PlacesRecsApiClient.ParsedResponse.Error");
        } else {
            c8737c = ((C10886a) c8737c).m43402a();
            if (c8737c != null) {
                c10996d = new C10993a(new ExpectedError(c8737c.intValue()));
            } else {
                c10996d = (C8786k) new C10998f(new UnexpectedError(new PlacesUnknownResponseException()));
            }
        }
        return c10996d;
    }

    /* renamed from: b */
    private final String m43420b(DataResponse<PlacesRecsResponse> dataResponse) {
        if (dataResponse != null) {
            PlacesRecsResponse placesRecsResponse = (PlacesRecsResponse) dataResponse.data();
            if (placesRecsResponse != null) {
                dataResponse = placesRecsResponse.getRecsMetaData();
                if (dataResponse != null) {
                    return dataResponse.getNextCursor();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private final C8737c m43411a(Response<DataResponse<PlacesRecsResponse>> response) {
        if (TimeoutInterceptorKt.isTimeout(response)) {
            return new C10886a(Integer.valueOf(TimeoutInterceptorKt.TIMEOUT_ERROR_CODE), response.code(), C8740a.m37248b(response), C8740a.m37246a(response));
        }
        C8737c c10886a;
        C15968t errorBody = response.errorBody();
        if (errorBody != null) {
            int code = response.code();
            String b = C8740a.m37248b(response);
            response = C8740a.m37246a(response);
            ResponseErrorAdapter responseErrorAdapter = this.f35572h;
            C2668g.a(errorBody, "it");
            ResponseError fromBody = responseErrorAdapter.fromBody(errorBody);
            c10886a = new C10886a(fromBody != null ? fromBody.getCode() : null, code, b, response);
        } else {
            Object body = response.body();
            if (body == null) {
                C2668g.a();
            }
            C2668g.a(body, "response.body()!!");
            c10886a = new C10887b((DataResponse) body, response.code(), C8740a.m37248b(response), C8740a.m37246a(response));
        }
        return c10886a;
    }

    /* renamed from: a */
    private final Single<C8737c> m43416a(@NotNull Single<C8737c> single, String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PLACES_RECS");
        stringBuilder.append(str);
        stringBuilder.append("");
        stringBuilder.append(str2);
        str2 = stringBuilder.toString();
        single = single.a(new C13861f(this, str2)).d(new C13862g(this, str2, str));
        C2668g.a(single, "this.doOnSubscribe {\n   …          }\n            }");
        return single;
    }
}
