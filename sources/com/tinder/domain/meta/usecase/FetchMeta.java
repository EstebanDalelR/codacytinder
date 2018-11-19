package com.tinder.domain.meta.usecase;

import android.support.annotation.NonNull;
import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.meta.providers.AuthStatusProvider;
import javax.inject.Inject;
import rx.Completable;

public class FetchMeta implements SimpleCompletableUseCase {
    @NonNull
    private final AuthStatusProvider authStatusProvider;
    @NonNull
    private final MetaGateway metaGateway;

    @Inject
    public FetchMeta(@NonNull MetaGateway metaGateway, @NonNull AuthStatusProvider authStatusProvider) {
        this.metaGateway = metaGateway;
        this.authStatusProvider = authStatusProvider;
    }

    @NonNull
    public Completable execute() {
        if (this.authStatusProvider.hasAuthToken()) {
            return this.metaGateway.fetchMeta();
        }
        return Completable.a();
    }
}
