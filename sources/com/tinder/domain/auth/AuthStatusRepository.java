package com.tinder.domain.auth;

import io.reactivex.C3957b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/auth/AuthStatusRepository;", "", "observeAuthStatus", "Lio/reactivex/Flowable;", "Lcom/tinder/domain/auth/AuthStatus;", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface AuthStatusRepository {
    @NotNull
    C3957b<AuthStatus> observeAuthStatus();
}
