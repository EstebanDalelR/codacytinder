package com.tinder.analytics.fireworks.api;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.tinder.analytics.fireworks.C2632i;
import com.tinder.analytics.fireworks.FireworksNetworkClient;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java8.lang.Iterables;
import java8.util.stream.Collectors;
import java8.util.stream.StreamSupport;
import okhttp3.C15968t;
import okhttp3.C17692o.C15961a;
import retrofit2.Response;
import retrofit2.Retrofit.Builder;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import rx.C2671a;
import rx.Observable;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class RetrofitFireworksNetworkClient implements FireworksNetworkClient {
    /* renamed from: a */
    private static final TimeUnit f26441a = TimeUnit.SECONDS;
    @NonNull
    /* renamed from: b */
    private final FireworksRetrofitService f26442b;
    @NonNull
    /* renamed from: c */
    private final C2671a f26443c;

    interface FireworksRetrofitService {
        @PUT("/v2/batch/event")
        Observable<Response<C15968t>> putBatchEvent(@Body C6223c c6223c, @Query("expected_event_count") int i);
    }

    /* renamed from: com.tinder.analytics.fireworks.api.RetrofitFireworksNetworkClient$a */
    private static class C6221a {
        @NonNull
        /* renamed from: a */
        private final Throwable f22789a;
        /* renamed from: b */
        private final int f22790b;

        C6221a(@NonNull Throwable th, int i) {
            this.f22789a = th;
            this.f22790b = i;
        }
    }

    /* renamed from: com.tinder.analytics.fireworks.api.RetrofitFireworksNetworkClient$b */
    public static class C6222b {
        /* renamed from: a */
        private final Gson f22791a = new GsonBuilder().registerTypeAdapter(C2632i.class, new C7320a()).create();
        @NonNull
        /* renamed from: b */
        private final C15961a f22792b;
        @NonNull
        /* renamed from: c */
        private final String f22793c;

        public C6222b(@NonNull C15961a c15961a, @NonNull String str) {
            this.f22792b = c15961a;
            this.f22793c = str;
        }

        /* renamed from: a */
        public RetrofitFireworksNetworkClient m26859a() {
            return new RetrofitFireworksNetworkClient((FireworksRetrofitService) new Builder().client(this.f22792b.b()).addConverterFactory(GsonConverterFactory.create(this.f22791a)).addCallAdapterFactory(RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io())).baseUrl(this.f22793c).build().create(FireworksRetrofitService.class), Schedulers.computation());
        }
    }

    /* renamed from: com.tinder.analytics.fireworks.api.RetrofitFireworksNetworkClient$c */
    static class C6223c {
        @SerializedName("events")
        /* renamed from: a */
        public List<C2632i> f22794a;

        C6223c(List<C2632i> list) {
            this.f22794a = list;
        }
    }

    /* renamed from: c */
    private static boolean m31226c(int i) {
        return i >= 500 && i <= 599;
    }

    @VisibleForTesting
    RetrofitFireworksNetworkClient(@NonNull FireworksRetrofitService fireworksRetrofitService, @NonNull C2671a c2671a) {
        this.f26442b = fireworksRetrofitService;
        this.f26443c = c2671a;
    }

    public Observable<Boolean> sendEvents(@NonNull Iterable<C2632i> iterable) {
        List list = (List) StreamSupport.a(Iterables.a(iterable), false).collect(Collectors.a());
        return this.f26442b.putBatchEvent(new C6223c(list), list.size()).k(new C8007d(this)).o(m31222a(3));
    }

    /* renamed from: a */
    final /* synthetic */ Boolean m31227a(Response response) {
        if (!response.isSuccessful()) {
            m31225b(response);
        }
        return Boolean.valueOf(true);
    }

    @NonNull
    /* renamed from: a */
    private Func1<? super Observable<? extends Throwable>, ? extends Observable<?>> m31222a(int i) {
        return new C8008e(this, i);
    }

    /* renamed from: a */
    final /* synthetic */ Observable m31229a(int i, Observable observable) {
        return observable.b(Observable.a(1, i + 1), C8009f.f28637a).h(new C8010g(this, i));
    }

    /* renamed from: a */
    final /* synthetic */ Observable m31228a(int i, C6221a c6221a) {
        if (m31223a(c6221a, i) != 0) {
            return m31224b(c6221a.f22790b);
        }
        return Observable.a(c6221a.f22789a);
    }

    @NonNull
    /* renamed from: b */
    private Observable<Long> m31224b(int i) {
        return Observable.b((long) Math.pow((double) i, 2.0d), f26441a, this.f26443c);
    }

    /* renamed from: b */
    private void m31225b(@NonNull Response<C15968t> response) {
        try {
            throw new FireworksApiError(response.code(), response.errorBody().string());
        } catch (Response<C15968t> response2) {
            throw new RuntimeException("Error reading error body", response2);
        }
    }

    /* renamed from: a */
    private static boolean m31223a(@NonNull C6221a c6221a, int i) {
        Throwable a = c6221a.f22789a;
        boolean z = false;
        if (!(a instanceof FireworksApiError)) {
            return false;
        }
        int a2 = ((FireworksApiError) a).m26856a();
        if (c6221a.f22790b <= i && m31226c(a2) != null) {
            z = true;
        }
        return z;
    }
}
