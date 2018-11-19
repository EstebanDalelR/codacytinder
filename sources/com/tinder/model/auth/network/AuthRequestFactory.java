package com.tinder.model.auth.network;

import com.tinder.auth.accountkit.C10326a;
import com.tinder.auth.model.AuthType;
import com.tinder.auth.repository.C10350m;
import com.tinder.auth.repository.C10353p;
import com.tinder.auth.repository.LongLivedTokenRepository;
import javax.annotation.Nonnull;
import javax.inject.Inject;

public class AuthRequestFactory {
    private final C10326a accountKitTokenRepository;
    private final C10350m facebookAuthTokenRepository;
    private final C10353p tinderLongLivedTokenRepository;

    @Inject
    public AuthRequestFactory(C10326a c10326a, C10350m c10350m, C10353p c10353p) {
        this.accountKitTokenRepository = c10326a;
        this.facebookAuthTokenRepository = c10350m;
        this.tinderLongLivedTokenRepository = c10353p;
    }

    @Nonnull
    public AuthRequest create(AuthType authType) {
        LongLivedTokenRepository tokenRepositoryForType = tokenRepositoryForType(authType);
        String token = this.tinderLongLivedTokenRepository.getToken();
        if (authType == AuthType.TINDER_SMS) {
            return new AuthRequest(authType, token);
        }
        return new AuthRequest(tokenRepositoryForType.getToken(), tokenRepositoryForType.getId(), tokenRepositoryForType.getAuthType(), this.tinderLongLivedTokenRepository.getToken());
    }

    private LongLivedTokenRepository tokenRepositoryForType(AuthType authType) {
        switch (AuthRequestFactory$1.$SwitchMap$com$tinder$auth$model$AuthType[authType.ordinal()]) {
            case 1:
                return this.accountKitTokenRepository;
            case 2:
                return this.facebookAuthTokenRepository;
            case 3:
                return this.tinderLongLivedTokenRepository;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Un-configured Auth Type: ");
                stringBuilder.append(authType);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
