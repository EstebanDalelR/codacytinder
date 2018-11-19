package com.tinder.account.data;

import com.tinder.api.ApiErrorTransformer.ErrorHandler;
import retrofit2.Response;
import rx.Observable;

/* renamed from: com.tinder.account.data.b */
final /* synthetic */ class C3879b implements ErrorHandler {
    /* renamed from: a */
    private final C3878a f12144a;

    C3879b(C3878a c3878a) {
        this.f12144a = c3878a;
    }

    public Observable handleError(Response response) {
        return this.f12144a.m14622a(response);
    }
}
