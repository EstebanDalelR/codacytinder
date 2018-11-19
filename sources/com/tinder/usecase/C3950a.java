package com.tinder.usecase;

import android.support.annotation.NonNull;
import com.tinder.data.user.CurrentUserIdProvider;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.common.usecase.CompletableUseCase.EmptyRequest;
import com.tinder.domain.meta.gateway.MetaGateway;
import javax.inject.Inject;
import rx.Completable;

/* renamed from: com.tinder.usecase.a */
public class C3950a implements CompletableUseCase<EmptyRequest> {
    /* renamed from: a */
    private final CurrentUserProvider f12539a;
    /* renamed from: b */
    private final CurrentUserIdProvider f12540b;
    /* renamed from: c */
    private final MetaGateway f12541c;

    @NonNull
    public /* synthetic */ Completable execute(@NonNull Object obj) {
        return m15146a((EmptyRequest) obj);
    }

    @Inject
    public C3950a(CurrentUserProvider currentUserProvider, CurrentUserIdProvider currentUserIdProvider, MetaGateway metaGateway) {
        this.f12539a = currentUserProvider;
        this.f12540b = currentUserIdProvider;
        this.f12541c = metaGateway;
    }

    @NonNull
    /* renamed from: a */
    public Completable m15146a(@NonNull EmptyRequest emptyRequest) {
        Completable[] completableArr = new Completable[3];
        completableArr[0] = this.f12539a.clear();
        completableArr[1] = this.f12540b.clear();
        MetaGateway metaGateway = this.f12541c;
        metaGateway.getClass();
        completableArr[2] = Completable.m10366a(C18985b.a(metaGateway)).m10395c();
        return Completable.m10373b(completableArr);
    }
}
