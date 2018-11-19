package com.tinder.boost.repository;

import android.support.annotation.NonNull;
import com.google.gson.Gson;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderApiClient;
import com.tinder.boost.model.C10428i;
import com.tinder.domain.boost.model.BoostStatus;
import retrofit2.Response;
import retrofit2.adapter.rxjava.HttpException;
import rx.Observable;
import rx.Single;
import rx.subjects.C19785a;

/* renamed from: com.tinder.boost.repository.a */
public class C10447a implements BoostStatusRepository {
    /* renamed from: a */
    private final TinderApiClient f34039a;
    /* renamed from: b */
    private final Gson f34040b;
    /* renamed from: c */
    private final C19785a<BoostStatus> f34041c = C19785a.w();

    public C10447a(TinderApiClient tinderApiClient, Gson gson) {
        this.f34039a = tinderApiClient;
        this.f34040b = gson;
    }

    public Single<BoostStatus> loadBoostStatus() {
        return this.f34039a.loadUserProfileIncluding(ManagerWebServices.PARAM_BOOST).k(C12637b.f40772a).b(new C13655c(this)).a();
    }

    public void setBoostStatus(@NonNull BoostStatus boostStatus) {
        this.f34041c.onNext(boostStatus);
    }

    public Observable<BoostStatus> createBoost() {
        return this.f34039a.activateBoost().h(new C12638d(this)).b(new C13656e(this)).a(BoostStatus.class);
    }

    /* renamed from: a */
    final /* synthetic */ Observable m42312a(Response response) {
        if (response.isSuccessful()) {
            return Observable.a(response.body());
        }
        if (response.code() != 412) {
            return Observable.a(new HttpException(response));
        }
        try {
            return Observable.a(this.f34040b.fromJson(response.errorBody().string(), C10428i.class));
        } catch (Response response2) {
            return Observable.a(response2);
        }
    }

    public Observable<BoostStatus> observeBoostStatus() {
        return this.f34041c.e();
    }

    public BoostStatus getBoostStatus() {
        return (BoostStatus) this.f34041c.A();
    }
}
