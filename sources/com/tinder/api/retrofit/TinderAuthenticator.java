package com.tinder.api.retrofit;

import com.tinder.api.ReauthStrategy;
import java.io.IOException;
import okhttp3.Authenticator;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.C15969u;

public class TinderAuthenticator implements Authenticator {
    private final AuthTokenProvider authTokenProvider;
    private final ReauthStrategy reauthStrategy;

    public TinderAuthenticator(ReauthStrategy reauthStrategy, AuthTokenProvider authTokenProvider) {
        this.reauthStrategy = reauthStrategy;
        this.authTokenProvider = authTokenProvider;
    }

    public C15963q authenticate(C15969u c15969u, C15966s c15966s) throws IOException {
        try {
            c15969u = this.reauthStrategy.reauth();
            this.authTokenProvider.updateAuthToken(c15969u);
            this.reauthStrategy.onReauthSuccess(c15969u);
            return c15966s.a().e().a("X-Auth-Token", c15969u).d();
        } catch (C15969u c15969u2) {
            this.reauthStrategy.onReauthFail(c15969u2);
            return null;
        }
    }
}
