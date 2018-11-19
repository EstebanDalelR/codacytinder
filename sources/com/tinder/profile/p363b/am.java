package com.tinder.profile.p363b;

import android.support.annotation.NonNull;
import com.tinder.api.TinderApi;
import com.tinder.api.request.ReportUserRequest;
import com.tinder.api.request.ReportUserRequest.Builder;
import com.tinder.common.utils.C8578a;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.profile.p363b.aq.C14375a;
import javax.inject.Inject;
import rx.Completable;

/* renamed from: com.tinder.profile.b.am */
public class am implements CompletableUseCase<C14375a> {
    @NonNull
    /* renamed from: a */
    private final TinderApi f49988a;

    @NonNull
    public /* synthetic */ Completable execute(@NonNull Object obj) {
        return m60846a((C14375a) obj);
    }

    @Inject
    am(@NonNull TinderApi tinderApi) {
        this.f49988a = tinderApi;
    }

    @NonNull
    /* renamed from: a */
    public Completable m60846a(@NonNull C14375a c14375a) {
        Builder cause = ReportUserRequest.builder().cause(c14375a.mo11602b());
        if (!C8578a.a(c14375a.mo11603c())) {
            cause.text(c14375a.mo11603c());
        }
        return this.f49988a.reportMatch(c14375a.mo11601a(), cause.build());
    }
}
