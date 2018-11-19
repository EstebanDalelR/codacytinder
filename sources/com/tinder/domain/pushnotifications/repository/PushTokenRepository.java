package com.tinder.domain.pushnotifications.repository;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/pushnotifications/repository/PushTokenRepository;", "", "registerToken", "Lrx/Completable;", "token", "", "unregisterToken", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface PushTokenRepository {
    @NotNull
    Completable registerToken(@NotNull String str);

    @NotNull
    Completable unregisterToken(@NotNull String str);
}
