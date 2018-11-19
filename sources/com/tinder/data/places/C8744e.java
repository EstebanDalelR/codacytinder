package com.tinder.data.places;

import com.tinder.data.places.C8741b.C10890a;
import com.tinder.data.places.C8741b.C10891b;
import com.tinder.data.places.C8741b.C10892c;
import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u001ac\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000f\"\u0004\b\u0000\u0010\u0010*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0018H\b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"ARRIVAL", "", "DEPARTURE", "PLACEID", "PLACES_BLACKLIST_KEY", "PLACES_CORRECT_KEY", "PLACES_DELETE_KEY", "PLACES_LOAD_KEY", "PLACES_RECS_VIEWED_KEY", "PLACES_SUBMIT_KEY", "PLACES_VIEWED_KEY", "VENUE_ID", "VISIT_ID", "VISIT_TYPE", "setupPlacesApiDefaults", "Lrx/Single;", "T", "Lretrofit2/Response;", "placesApiClient", "Lcom/tinder/data/places/PlacesApiClient;", "keyBase", "id", "obfuscation", "map", "", "", "data_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.data.places.e */
public final class C8744e {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u0002H\u0001 \u0004*\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "T", "it", "Lretrofit2/Response;", "kotlin.jvm.PlatformType", "call", "(Lretrofit2/Response;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.e$d */
    public static final class C13050d<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13050d f41600a = new C13050d();

        public /* synthetic */ Object call(Object obj) {
            return m50804a((Response) obj);
        }

        @Nullable
        /* renamed from: a */
        public final T m50804a(Response<T> response) {
            return response.body();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.e$a */
    public static final class C13865a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ PlacesApiClient f43938a;
        /* renamed from: b */
        final /* synthetic */ String f43939b;

        public C13865a(PlacesApiClient placesApiClient, String str) {
            this.f43938a = placesApiClient;
            this.f43939b = str;
        }

        public final void call() {
            this.f43938a.m43399b();
            this.f43938a.m43396a((C8741b) new C10892c(this.f43939b));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.e$b */
    public static final class C13866b<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ PlacesApiClient f43940a;
        /* renamed from: b */
        final /* synthetic */ String f43941b;
        /* renamed from: c */
        final /* synthetic */ Pair f43942c;
        /* renamed from: d */
        final /* synthetic */ Map f43943d;

        public C13866b(PlacesApiClient placesApiClient, String str, Pair pair, Map map) {
            this.f43940a = placesApiClient;
            this.f43941b = str;
            this.f43942c = pair;
            this.f43943d = map;
        }

        public /* synthetic */ void call(Object obj) {
            m53405a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53405a(Throwable th) {
            PlacesApiClient placesApiClient = this.f43940a;
            C2668g.a(th, "it");
            placesApiClient.m43397a(th);
            if (!(th instanceof PlacesApiException)) {
                th = null;
            }
            PlacesApiException placesApiException = (PlacesApiException) th;
            if (placesApiException != null) {
                this.f43940a.m43396a((C8741b) new C10890a(this.f43941b, placesApiException.m37236b(), this.f43942c, placesApiException.m37235a(), this.f43943d));
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0005*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "it", "Lretrofit2/Response;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.e$c */
    public static final class C13867c<T> implements Action1<Response<T>> {
        /* renamed from: a */
        final /* synthetic */ PlacesApiClient f43944a;
        /* renamed from: b */
        final /* synthetic */ String f43945b;
        /* renamed from: c */
        final /* synthetic */ Pair f43946c;
        /* renamed from: d */
        final /* synthetic */ Map f43947d;

        public C13867c(PlacesApiClient placesApiClient, String str, Pair pair, Map map) {
            this.f43944a = placesApiClient;
            this.f43945b = str;
            this.f43946c = pair;
            this.f43947d = map;
        }

        public /* synthetic */ void call(Object obj) {
            m53406a((Response) obj);
        }

        /* renamed from: a */
        public final void m53406a(Response<T> response) {
            PlacesApiClient placesApiClient = this.f43944a;
            String str = this.f43945b;
            C2668g.a(response, "it");
            placesApiClient.m43396a((C8741b) new C10891b(str, response, this.f43946c, this.f43947d));
        }
    }
}
