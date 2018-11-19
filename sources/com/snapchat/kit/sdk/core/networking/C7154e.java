package com.snapchat.kit.sdk.core.networking;

import com.google.gson.Gson;
import com.snapchat.kit.sdk.OAuth2Manager;
import com.snapchat.kit.sdk.OAuth2Manager.OnTokenRefreshCallback;
import com.snapchat.kit.sdk.core.controller.C7136a;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.models.TokenErrorResponse;
import com.squareup.okhttp.C6071q.C6070a;
import com.squareup.okhttp.C6075s;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Interceptor.Chain;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.commons.lang3.C15987b;

@SnapConnectScope
/* renamed from: com.snapchat.kit.sdk.core.networking.e */
public class C7154e implements Interceptor {
    /* renamed from: a */
    private final OAuth2Manager f25895a;
    /* renamed from: b */
    private final C7136a f25896b;
    /* renamed from: c */
    private final String f25897c;

    /* renamed from: com.snapchat.kit.sdk.core.networking.e$1 */
    class C71531 implements OnTokenRefreshCallback {
        /* renamed from: a */
        final /* synthetic */ C7154e f25894a;

        public void onTokenRefreshSucceeded(boolean z) {
        }

        C71531(C7154e c7154e) {
            this.f25894a = c7154e;
        }

        public void onTokenRefreshFailed(boolean z) {
            if (z) {
                this.f25894a.f25896b.m30786a();
            }
        }
    }

    @Inject
    C7154e(OAuth2Manager oAuth2Manager, C7136a c7136a, @Named("client_id") String str) {
        this.f25895a = oAuth2Manager;
        this.f25896b = c7136a;
        this.f25897c = str;
    }

    public C6075s intercept(Chain chain) throws IOException {
        this.f25895a.m30682a(false);
        chain = chain.proceed(mo7411a(chain).m26335a());
        if (chain != null) {
            if (chain.m26402h() != null) {
                if (chain.m26397c() == 401) {
                    TokenErrorResponse tokenErrorResponse = (TokenErrorResponse) new Gson().fromJson(chain.m26402h().m26413e(), TokenErrorResponse.class);
                    if (m30805a(tokenErrorResponse)) {
                        this.f25895a.m30678a(new C71531(this));
                    } else if (m30806b(tokenErrorResponse)) {
                        this.f25895a.setAccessToken(null);
                        this.f25896b.m30786a();
                    }
                }
                return chain;
            }
        }
        return chain;
    }

    /* renamed from: a */
    protected C6070a mo7411a(Chain chain) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bearer ");
        stringBuilder.append(this.f25895a.m30676a());
        return chain.request().m26351g().m26334a("User-Agent", C5945b.f21771a).m26334a("authorization", stringBuilder.toString()).m26334a("X-Snap-SDK-OAuth-Client-Id", this.f25897c);
    }

    /* renamed from: a */
    private boolean m30805a(TokenErrorResponse tokenErrorResponse) {
        return (tokenErrorResponse == null || C15987b.a(tokenErrorResponse.getError()) || C15987b.a(tokenErrorResponse.getError().toLowerCase(), "invalid_token") == null) ? null : true;
    }

    /* renamed from: b */
    private boolean m30806b(TokenErrorResponse tokenErrorResponse) {
        return (tokenErrorResponse == null || C15987b.a(tokenErrorResponse.getError()) || C15987b.a(tokenErrorResponse.getError().toLowerCase(), "force_logout") == null) ? null : true;
    }
}
