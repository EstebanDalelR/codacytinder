package com.tinder.api;

import android.support.annotation.NonNull;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.interactor.C8279j;
import com.tinder.auth.model.AuthAnalyticsConstants.Value.AuthFrom;
import com.tinder.auth.model.AuthType;
import com.tinder.auth.model.C8288b;
import com.tinder.common.repository.C10698c;
import com.tinder.common.utils.C8578a;
import com.tinder.managers.C2652a;
import com.tinder.model.auth.AuthErrorType;
import com.tinder.model.auth.AuthException;
import com.tinder.model.auth.LogoutFrom$FORCED;
import com.tinder.model.auth.network.AuthRequest;
import com.tinder.model.auth.network.AuthRequestFactory;
import p000a.p001a.C0001a;

public class TinderReauthStrategy implements ReauthStrategy {
    @NonNull
    private final C10333h authAnalyticsInteractor;
    @NonNull
    private final C8279j authInteractor;
    @NonNull
    private final AuthRequestFactory authRequestFactory;
    @NonNull
    private final C2652a authenticationManager;
    @NonNull
    private final C10698c tokenRepository;

    public TinderReauthStrategy(@NonNull C8279j c8279j, @NonNull C10698c c10698c, @NonNull C10333h c10333h, @NonNull AuthRequestFactory authRequestFactory, @NonNull C2652a c2652a) {
        this.authInteractor = c8279j;
        this.tokenRepository = c10698c;
        this.authAnalyticsInteractor = c10333h;
        this.authRequestFactory = authRequestFactory;
        this.authenticationManager = c2652a;
    }

    public String reauth() throws Exception {
        AuthType a = this.authInteractor.a();
        if (a == null) {
            throw AuthException.newInstance(AuthErrorType.UNKNOWN_ERROR, "auth type is null");
        }
        AuthRequest create = this.authRequestFactory.create(a);
        this.authAnalyticsInteractor.a(a, AuthFrom.REAUTH);
        String h = ((C8288b) this.authInteractor.a(create).u().b()).h();
        if (C8578a.a(h)) {
            throw new IllegalStateException("Auth token is null or empty");
        }
        this.tokenRepository.a(h);
        this.authAnalyticsInteractor.a(a, false);
        return h;
    }

    public void onReauthSuccess(String str) {
        this.tokenRepository.a(str);
    }

    public void onReauthFail(Exception exception) {
        C0001a.b(exception, "Reauth failed", new Object[0]);
        this.authenticationManager.a(LogoutFrom$FORCED.INSTANCE);
    }
}
