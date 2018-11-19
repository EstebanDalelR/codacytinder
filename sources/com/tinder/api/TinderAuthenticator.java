package com.tinder.api;

import android.support.annotation.Nullable;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.interactor.C8279j;
import com.tinder.auth.model.AuthAnalyticsConstants.Value.AuthFrom;
import com.tinder.auth.model.C8288b;
import com.tinder.common.repository.C10698c;
import com.tinder.events.auth.EventAuthFailed;
import com.tinder.model.auth.AuthErrorType;
import com.tinder.model.auth.AuthException;
import com.tinder.model.auth.network.AuthRequest;
import com.tinder.model.auth.network.AuthRequestFactory;
import com.tinder.utils.ad;
import de.greenrobot.event.C2664c;
import java.io.IOException;
import okhttp3.Authenticator;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.C15969u;

@Deprecated
public class TinderAuthenticator implements Authenticator {
    private final C10333h authAnalyticsInteractor;
    private final C8279j authInteractor;
    private final AuthRequestFactory authRequestFactory;
    private final C2664c eventBus;
    private final C10698c tokenRepository;

    public TinderAuthenticator(C2664c c2664c, C8279j c8279j, C10698c c10698c, C10333h c10333h, AuthRequestFactory authRequestFactory) {
        this.eventBus = c2664c;
        this.tokenRepository = c10698c;
        this.authAnalyticsInteractor = c10333h;
        this.authInteractor = c8279j;
        this.authRequestFactory = authRequestFactory;
    }

    @Nullable
    public C15963q authenticate(C15969u c15969u, C15966s c15966s) throws IOException {
        ad.a();
        c15969u = this.authInteractor.a();
        if (c15969u == null) {
            throw AuthException.newInstance(AuthErrorType.UNKNOWN_ERROR, "auth type is null");
        }
        AuthRequest create = this.authRequestFactory.create(c15969u);
        this.authAnalyticsInteractor.a(c15969u, AuthFrom.REAUTH);
        try {
            C8288b c8288b = (C8288b) this.authInteractor.a(create).u().b();
            String h = c8288b.h();
            if (h == null) {
                c15969u = new StringBuilder();
                c15969u.append("No auth token found in response: ");
                c15969u.append(c8288b);
                ad.c(c15969u.toString());
                this.eventBus.d(new EventAuthFailed());
                return null;
            }
            this.tokenRepository.a(h);
            this.authAnalyticsInteractor.a(c15969u, false);
            return c15966s.a().e().b("X-Auth-Token").b("X-Auth-Token", h).d();
        } catch (C15969u c15969u2) {
            ad.a("Exception during re-auth: ", c15969u2);
            this.eventBus.d(new EventAuthFailed());
            return null;
        }
    }
}
