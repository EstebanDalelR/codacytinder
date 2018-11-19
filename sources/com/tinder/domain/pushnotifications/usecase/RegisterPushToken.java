package com.tinder.domain.pushnotifications.usecase;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.pushnotifications.repository.PushTokenRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/domain/pushnotifications/usecase/RegisterPushToken;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "", "tokenRepository", "Lcom/tinder/domain/pushnotifications/repository/PushTokenRepository;", "(Lcom/tinder/domain/pushnotifications/repository/PushTokenRepository;)V", "execute", "Lrx/Completable;", "token", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class RegisterPushToken implements CompletableUseCase<String> {
    private final PushTokenRepository tokenRepository;

    @Inject
    public RegisterPushToken(@NotNull PushTokenRepository pushTokenRepository) {
        C2668g.b(pushTokenRepository, "tokenRepository");
        this.tokenRepository = pushTokenRepository;
    }

    @NotNull
    public Completable execute(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
        return this.tokenRepository.registerToken(str);
    }
}
