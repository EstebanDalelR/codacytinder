package com.snapchat.kit.sdk.login.networking;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.snapchat.kit.sdk.core.models.UserDataResponse;
import com.snapchat.kit.sdk.core.networking.LoginClient;
import com.snapchat.kit.sdk.login.dagger.scope.LoginScope;
import com.snapchat.kit.sdk.login.p150a.C5954a;
import javax.inject.Inject;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.RetrofitError.Kind;
import retrofit.client.C19370e;

@LoginScope
/* renamed from: com.snapchat.kit.sdk.login.networking.a */
public class C5958a {
    /* renamed from: a */
    private final LoginClient f21786a;
    /* renamed from: b */
    private final Gson f21787b;
    /* renamed from: c */
    private final C5954a f21788c;

    @Inject
    C5958a(LoginClient loginClient, Gson gson, C5954a c5954a) {
        this.f21786a = loginClient;
        this.f21787b = gson;
        this.f21788c = c5954a;
    }

    /* renamed from: a */
    public void m25576a(@NonNull String str, @Nullable String str2, @NonNull final FetchUserDataCallback fetchUserDataCallback) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.f21788c.m25570a("fetchUserData", 1);
        this.f21786a.fetchUserData(str, str2, new Callback<UserDataResponse>(this) {
            /* renamed from: c */
            final /* synthetic */ C5958a f25925c;

            public /* synthetic */ void success(Object obj, C19370e c19370e) {
                m30823a((UserDataResponse) obj, c19370e);
            }

            /* renamed from: a */
            public void m30823a(UserDataResponse userDataResponse, C19370e c19370e) {
                this.f25925c.f21788c.m25571b("fetchUserDataLatency", System.currentTimeMillis() - currentTimeMillis);
                fetchUserDataCallback.onSuccess(userDataResponse);
            }

            public void failure(RetrofitError retrofitError) {
                this.f25925c.f21788c.m25570a("fetchUserDataFailure", 1);
                C5954a a = this.f25925c.f21788c;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fetchUserDataErrorKind:");
                stringBuilder.append(retrofitError.c().toString());
                a.m25570a(stringBuilder.toString(), 1);
                fetchUserDataCallback.onFailure(retrofitError.c() == Kind.NETWORK, retrofitError.b().b());
            }
        });
    }
}
